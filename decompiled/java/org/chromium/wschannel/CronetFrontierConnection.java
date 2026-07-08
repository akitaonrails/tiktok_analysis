package org.chromium.wschannel;

import J.N;
import X.AbstractRunnableC847330XLv;
import X.C1494230ozF;
import X.C2179971ATj;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C847240XLm;
import X.C847270XLp;
import X.C847280XLq;
import X.C847310XLt;
import X.EnumC847220XLk;
import X.InterfaceC847230XLl;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.channel.IWsChannelClient;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.clientkey.ClientKeyManager;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ttnet.org.chromium.net.e;
import com.ttnet.org.chromium.net.impl.CronetFrontierClient;
import com.ttnet.org.chromium.net.impl.CronetWebsocketConnection;
import com.ttnet.org.chromium.net.k0;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.CronetAppProviderManager;
import org.chromium.CronetClient;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class CronetFrontierConnection {
    public static e sCronetEngine = null;
    public static volatile String sPrivateProtocolUrl = "";
    public WebSocketCallbackImpl mCallback;
    public DestroyTimeoutControl mDestroyTimeoutControl;
    public CronetFrontierClient mFrontierClient;
    public k0 mWebsocketConnection;
    public IWsChannelClient mWsChannelClient;
    public static final String FALLBACK_WEBSOCKET_TASK_ID = UUID.randomUUID().toString();
    public static boolean sDisableFallbackTask = false;
    public static EnumC847220XLk sMode = EnumC847220XLk.QUIC;
    public static volatile AtomicInteger sFirstConnection = new AtomicInteger(0);
    public static volatile int sChannelID = -1;
    public final AtomicBoolean mUsePrivateProtocol = new AtomicBoolean(false);
    public final AtomicBoolean mUsePrivateProtocolProxy = new AtomicBoolean(false);
    public final AtomicInteger mRetryAttempts = new AtomicInteger(0);
    public int mPingInterval = 10000;
    public int mTimeOut = 10000;
    public Map<Integer, Boolean> mAllServiceBuildInfo = new ConcurrentHashMap();
    public AtomicBoolean mIsFallbackTaskRunning = new AtomicBoolean(false);
    public volatile int mAppState = -1;
    public volatile boolean mIsFirstStreamReady = false;
    public boolean mSharedConnection = true;

    public final class FallbackWebSocketTask extends AbstractRunnableC847330XLv {
        public final Map<String, Object> mConfigMap;
        public final List<String> mUrls;

        @Override // java.lang.Runnable
        public void run() {
            org_chromium_wschannel_CronetFrontierConnection$FallbackWebSocketTask_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void org_chromium_wschannel_CronetFrontierConnection$FallbackWebSocketTask__run$___twin___() {
            if (CronetFrontierConnection.this.isAllServiceConnected()) {
                CronetFrontierConnection.this.mRetryAttempts.set(0);
                CronetFrontierConnection.this.mIsFallbackTaskRunning.set(false);
                return;
            }
            int iIncrementAndGet = CronetFrontierConnection.this.mRetryAttempts.incrementAndGet();
            Logger.debug();
            CronetFrontierConnection.this.destroyConnection();
            CronetFrontierConnection.this.startConnectionWithWebSocket(this.mConfigMap, this.mUrls);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("retry_attempts", iIncrementAndGet);
                jSONObject.put("reason", "connect timeout fallback");
                CronetFrontierConnection.this.reportPrivateProtocolRelatedLog(jSONObject, 1);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }

        public static void org_chromium_wschannel_CronetFrontierConnection$FallbackWebSocketTask_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(FallbackWebSocketTask fallbackWebSocketTask) {
            try {
                fallbackWebSocketTask.org_chromium_wschannel_CronetFrontierConnection$FallbackWebSocketTask__run$___twin___();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (!C2179971ATj.LIZ(th)) {
                    throw th;
                }
            }
        }

        public FallbackWebSocketTask(long j, Map<String, Object> map, List<String> list) {
            super(j, CronetFrontierConnection.FALLBACK_WEBSOCKET_TASK_ID);
            this.mConfigMap = map;
            this.mUrls = list;
        }
    }

    private Map<String, String> getClientKeyHeaders() {
        try {
            return C1494230ozF.LJIL ? ClientKeyManager.getClientKeyHeaders() : (Map) Class.forName("com.bytedance.ttnet.clientkey.ClientKeyManager").getMethod("getClientKeyHeaders", new Class[0]).invoke(null, new Object[0]);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public void registerService(int i) {
    }

    public void unregisterService(int i) {
    }

    private void disconnectConnection() {
        k0 k0Var = this.mWebsocketConnection;
        if (k0Var != null) {
            k0Var.LIZLLL();
            this.mWebsocketConnection.LIZIZ();
        }
        CronetFrontierClient cronetFrontierClient = this.mFrontierClient;
        if (cronetFrontierClient != null) {
            synchronized (cronetFrontierClient.LJIJ) {
                try {
                    if (cronetFrontierClient.LJIIZILJ != 0) {
                        N.MKRYs$fc(cronetFrontierClient.LJIIZILJ, cronetFrontierClient);
                        cronetFrontierClient.LJIIZILJ = 0L;
                    }
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            C847280XLq c847280XLqLIZ = C847280XLq.LIZ();
            String str = FALLBACK_WEBSOCKET_TASK_ID;
            c847280XLqLIZ.getClass();
            if (!TextUtils.isEmpty(str)) {
                try {
                    Iterator<Map.Entry<AbstractRunnableC847330XLv, Runnable>> it2 = c847280XLqLIZ.LIZJ.entrySet().iterator();
                    while (it2.hasNext()) {
                        AbstractRunnableC847330XLv key = it2.next().getKey();
                        if (str.equals(key.mTaskIdentifier)) {
                            it2.remove();
                            c847280XLqLIZ.LIZ.remove(key);
                        }
                    }
                    Iterator<Map.Entry<AbstractRunnableC847330XLv, ScheduledFuture>> it3 = c847280XLqLIZ.LIZIZ.entrySet().iterator();
                    while (it3.hasNext()) {
                        Map.Entry<AbstractRunnableC847330XLv, ScheduledFuture> next = it3.next();
                        if (str.equals(next.getKey().mTaskIdentifier)) {
                            ScheduledFuture value = next.getValue();
                            if (value != null) {
                                value.cancel(true);
                            }
                            it3.remove();
                        }
                    }
                } catch (Throwable th) {
                }
            }
            this.mIsFallbackTaskRunning.set(false);
        }
    }

    public boolean isAllServiceConnected() {
        if (this.mAllServiceBuildInfo.isEmpty()) {
            return false;
        }
        Iterator<Map.Entry<Integer, Boolean>> it2 = this.mAllServiceBuildInfo.entrySet().iterator();
        while (it2.hasNext()) {
            if (!it2.next().getValue().booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public boolean isConnected() {
        k0 k0Var;
        CronetFrontierClient cronetFrontierClient;
        return (!this.mUsePrivateProtocol.get() || (cronetFrontierClient = this.mFrontierClient) == null) ? (this.mUsePrivateProtocol.get() || (k0Var = this.mWebsocketConnection) == null || ((CronetWebsocketConnection) k0Var).LJIJ.get() != 4) ? false : true : cronetFrontierClient.LJIJI.get() == 2;
    }

    public boolean isFallbackTaskRunning() {
        return this.mIsFallbackTaskRunning.get();
    }

    public boolean privateProtocolEnabled() {
        return this.mUsePrivateProtocol.get();
    }

    public boolean privateProtocolProxyEnabled() {
        return this.mUsePrivateProtocolProxy.get();
    }

    public void destroyConnection() {
        disconnectConnection();
    }

    public void stopConnection() {
        disconnectConnection();
    }

    public class ServiceMessageReceiverImpl implements InterfaceC847230XLl {
        public ServiceMessageReceiverImpl() {
        }

        @Override // X.InterfaceC847230XLl
        public void onServiceReady(int i, String str) {
            boolean z;
            Logger.debug();
            if (!CronetFrontierConnection.this.mIsFirstStreamReady) {
                CronetFrontierConnection.this.mIsFirstStreamReady = true;
                CronetFrontierConnection cronetFrontierConnection = CronetFrontierConnection.this;
                if (cronetFrontierConnection.mFrontierClient != null && cronetFrontierConnection.mAppState != -1) {
                    CronetFrontierConnection cronetFrontierConnection2 = CronetFrontierConnection.this;
                    CronetFrontierClient cronetFrontierClient = cronetFrontierConnection2.mFrontierClient;
                    if (cronetFrontierConnection2.mAppState == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    synchronized (cronetFrontierClient.LJIJ) {
                        try {
                            if (cronetFrontierClient.LJIIZILJ != 0) {
                                N.MlH8$Rpg(cronetFrontierClient.LJIIZILJ, cronetFrontierClient, z);
                            }
                        } finally {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                }
            }
            CronetFrontierConnection.this.mAllServiceBuildInfo.put(Integer.valueOf(i), Boolean.TRUE);
            if (CronetFrontierConnection.this.isFallbackTaskRunning() && CronetFrontierConnection.this.mUsePrivateProtocolProxy.get() && CronetFrontierConnection.this.isAllServiceConnected()) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("type", 1);
                    jSONObject.put("private_protocol_enable", 1);
                    jSONObject.put("state", 4);
                    jSONObject.put("url", CronetFrontierConnection.sPrivateProtocolUrl);
                    Logger.debug();
                    CronetFrontierConnection.this.mWsChannelClient.onConnection(jSONObject);
                } catch (Throwable th) {
                }
            }
            CronetFrontierConnection.this.mWsChannelClient.onServiceConnectEvent(i, true, "");
        }

        @Override // X.InterfaceC847230XLl
        public void onError(int i, int i2, String str) {
            Logger.debug();
            CronetFrontierConnection.this.mWsChannelClient.onServiceConnectEvent(i, false, "");
        }

        @Override // X.InterfaceC847230XLl
        public void onReceivedMessage(int i, Map<String, String> map, byte[] bArr) {
            if (CronetFrontierConnection.this.mUsePrivateProtocolProxy.get()) {
                Logger.debug();
                CronetFrontierConnection.this.mWsChannelClient.onMessage(bArr);
            } else {
                Logger.debug();
                WsChannelMsg wsChannelMsgConstructWsChannelMsg = WsUtils.constructWsChannelMsg(i, map, bArr);
                Logger.debug();
                CronetFrontierConnection.this.mWsChannelClient.onMessage(wsChannelMsgConstructWsChannelMsg);
            }
        }

        @Override // X.InterfaceC847230XLl
        public void onReceivedAck(int i, long j, String str, Boolean bool) {
            Logger.debug();
        }
    }

    public CronetFrontierConnection(IWsChannelClient iWsChannelClient) {
        this.mWsChannelClient = iWsChannelClient;
        this.mCallback = new WebSocketCallbackImpl(iWsChannelClient);
        WsUtils.loadCronetKernel();
        sCronetEngine = CronetClient.getCronetEngine();
    }

    private boolean canUsePrivateProtocol(Map<String, Object> map) {
        if (C1494230ozF.LJIJJLI && this.mRetryAttempts.get() < 3) {
            Object obj = map.get("private_protocol_enable");
            if (obj == null) {
                return false;
            }
            return ((Boolean) obj).booleanValue();
        }
        Logger.debug();
        return false;
    }

    private EnumC847220XLk covertTransportMode(int i) {
        if (i != 3 && i != 4) {
            if (i != 1 && i != 2) {
            }
            return EnumC847220XLk.TLS;
        }
        this.mUsePrivateProtocolProxy.set(true);
        if (i != 4) {
            return EnumC847220XLk.QUIC;
        }
        return EnumC847220XLk.TLS;
    }

    public static void disableFallbackToWebSocket(boolean z) {
        sDisableFallbackTask = z;
    }

    private long getFallbackTimeoutSeconds(Map<String, Object> map) {
        Map map2 = (Map) map.get("custom_headers");
        long j = 10000;
        if (map2 != null && !map2.isEmpty()) {
            if (!map2.containsKey("fallback_timeout_mills")) {
                return 10000L;
            }
            String str = (String) map2.get("fallback_timeout_mills");
            if (TextUtils.isEmpty(str)) {
                return 10000L;
            }
            try {
                int iIntValue = CastIntegerProtector.valueOf(str).intValue();
                if (iIntValue > 0) {
                    j = iIntValue;
                    return j;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return j;
    }

    private void reportAppStateChange(List<WsChannelMsg.MsgHeader> list) {
        for (WsChannelMsg.MsgHeader msgHeader : list) {
            if (msgHeader != null && "IsBackground".equals(msgHeader.key)) {
                String str = msgHeader.value;
                boolean z = false;
                if ("1".equals(str)) {
                    this.mAppState = 1;
                } else if (CardStruct.IStatusCode.DEFAULT.equals(str)) {
                    this.mAppState = 0;
                }
                if (this.mIsFirstStreamReady && this.mAppState != -1) {
                    CronetFrontierClient cronetFrontierClient = this.mFrontierClient;
                    if (this.mAppState == 1) {
                        z = true;
                    }
                    synchronized (cronetFrontierClient.LJIJ) {
                        try {
                            if (cronetFrontierClient.LJIIZILJ == 0) {
                                return;
                            }
                            N.MlH8$Rpg(cronetFrontierClient.LJIIZILJ, cronetFrontierClient, z);
                            return;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                return;
            }
        }
    }

    public boolean sendMessageWithPrivateProtocol(WsChannelMsg wsChannelMsg) {
        Logger.debug();
        if (this.mFrontierClient != null && wsChannelMsg != null) {
            int i = wsChannelMsg.service;
            if (i == 9000 && wsChannelMsg.method == 4) {
                reportAppStateChange(wsChannelMsg.msgHeaders);
                return true;
            }
            String[] strArrConstructMessageMetaInfo = WsUtils.constructMessageMetaInfo(wsChannelMsg);
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(wsChannelMsg.LIZ().length);
            byteBufferAllocateDirect.put(wsChannelMsg.LIZ());
            byteBufferAllocateDirect.flip();
            this.mFrontierClient.LIZ(i, byteBufferAllocateDirect, strArrConstructMessageMetaInfo);
            Logger.debug();
            return true;
        }
        return false;
    }

    public boolean sendMessageWithPrivateProtocolProxy(byte[] bArr) {
        Logger.debug();
        CronetFrontierClient cronetFrontierClient = this.mFrontierClient;
        if (cronetFrontierClient != null && bArr != null) {
            if (!((ConcurrentHashMap) cronetFrontierClient.LJIIJJI).containsKey(1)) {
                registerServiceById(1, null, null);
            }
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bArr.length);
            byteBufferAllocateDirect.put(bArr);
            byteBufferAllocateDirect.flip();
            this.mFrontierClient.LIZ(1, byteBufferAllocateDirect, null);
            return true;
        }
        return false;
    }

    public boolean sendMessageWithWebSocket(byte[] bArr) {
        Logger.debug();
        if (this.mWebsocketConnection == null) {
            return false;
        }
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bArr.length);
        byteBufferAllocateDirect.put(bArr);
        byteBufferAllocateDirect.flip();
        this.mWebsocketConnection.LIZ(byteBufferAllocateDirect);
        return true;
    }

    public void setFirstStreamReady(boolean z) {
        this.mIsFirstStreamReady = z;
    }

    public static void mergeServiceId(Map<String, Object> map, List<Integer> list) {
        ArrayList arrayList = (ArrayList) map.get("service_id_list");
        if (arrayList != null && arrayList.size() != 0) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                int iIntValue = ((Integer) it2.next()).intValue();
                if (!list.contains(Integer.valueOf(iIntValue))) {
                    list.add(Integer.valueOf(iIntValue));
                }
            }
        }
    }

    private void parseExtraParamsForPrivateProtocol(String str, HashMap<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        for (String str2 : str.split("&")) {
            if (!TextUtils.isEmpty(str2)) {
                String[] strArrSplit = str2.split("=");
                if (strArrSplit.length == 2 && !TextUtils.isEmpty(strArrSplit[0]) && !TextUtils.isEmpty(strArrSplit[1])) {
                    try {
                        if (strArrSplit[0].equals("ttnet_heartbeat_interval")) {
                            this.mPingInterval = CastIntegerProtector.valueOf(strArrSplit[1]).intValue() * LSPassThroughRecordSizeConfig.DEFAULT;
                        } else if (strArrSplit[0].equals("ttnet_timeout_millis")) {
                            this.mTimeOut = CastIntegerProtector.valueOf(strArrSplit[1]).intValue();
                        } else if (!this.mUsePrivateProtocolProxy.get()) {
                            map.put(strArrSplit[0], strArrSplit[1]);
                        }
                    } catch (NumberFormatException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
        }
    }

    private void startConnectionWithPrivateProtocol(Map<String, Object> map, URI uri) {
        int port = uri.getPort();
        String path = uri.getPath();
        String query = uri.getQuery();
        if (port <= 0) {
            port = 443;
        }
        Logger.debug();
        EnumC847220XLk enumC847220XLkCovertTransportMode = covertTransportMode(((Integer) map.get("transport_mode")).intValue());
        sMode = enumC847220XLkCovertTransportMode;
        ArrayList<Integer> arrayList = new ArrayList();
        if (this.mUsePrivateProtocolProxy.get()) {
            arrayList.add(1);
        } else {
            arrayList.add(9000);
            mergeServiceId(map, arrayList);
        }
        HashMap<String, String> map2 = new HashMap<>();
        String str = (String) map.get("extra");
        parseExtraParamsForPrivateProtocol(str, map2);
        try {
            Map<String, String> clientKeyHeaders = getClientKeyHeaders();
            Logger.debug();
            if (clientKeyHeaders != null && !clientKeyHeaders.isEmpty()) {
                map2.putAll(clientKeyHeaders);
            }
            Map<? extends String, ? extends String> map3 = (Map) map.get("custom_headers");
            if (map3 != null && !map3.isEmpty()) {
                map2.putAll(map3);
            }
            if (privateProtocolProxyEnabled()) {
                String defaultUserAgent = MySelfChannelImpl.getDefaultUserAgent();
                if (!TextUtils.isEmpty(defaultUserAgent)) {
                    map2.put("user-agent", defaultUserAgent);
                }
                String cookieHeader = WsUtils.getCookieHeader(uri);
                if (!TextUtils.isEmpty(cookieHeader)) {
                    map2.put("cookie", cookieHeader);
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        this.mAllServiceBuildInfo.clear();
        DestroyTimeoutControl destroyTimeoutControl = this.mDestroyTimeoutControl;
        if (destroyTimeoutControl != null && destroyTimeoutControl.getPrivateProtocolTimeout() > 0) {
            int privateProtocolTimeout = (int) this.mDestroyTimeoutControl.getPrivateProtocolTimeout();
            Logger.debug();
            this.mTimeOut = privateProtocolTimeout;
        }
        C847240XLm c847240XLm = new C847240XLm(((Integer) map.get("aid")).intValue(), uri.getHost(), ((Integer) map.get("fpid")).intValue(), Integer.toString(((Integer) map.get("app_version")).intValue()), (String) map.get("device_id"), port, (String) map.get("app_key"));
        c847240XLm.LJII = this.mPingInterval;
        c847240XLm.LJIIIIZZ = this.mTimeOut;
        c847240XLm.LJIIJ = enumC847220XLkCovertTransportMode;
        c847240XLm.LJIIIZ = map2;
        c847240XLm.LJIIJJI = new PrivateProtocolCallbackImpl(this.mWsChannelClient, this);
        if (this.mUsePrivateProtocolProxy.get()) {
            c847240XLm.LJIILL = true;
            String strConstructQueryForProxyMode = constructQueryForProxyMode(query, str, map.get("iid"));
            Logger.debug();
            c847240XLm.LJIILIIL = strConstructQueryForProxyMode;
            c847240XLm.LJIILJJIL = path;
        }
        c847240XLm.LJIIL = arrayList;
        this.mFrontierClient = new CronetFrontierClient(c847240XLm);
        Logger.debug();
        for (Integer num : arrayList) {
            registerServiceById(num.intValue(), null, null);
            this.mAllServiceBuildInfo.put(num, Boolean.FALSE);
        }
    }

    public void reportPrivateProtocolRelatedLog(JSONObject jSONObject, int i) throws JSONException {
        if (jSONObject == null) {
            return;
        }
        jSONObject.put("report_type", i);
        jSONObject.put("report_time", System.currentTimeMillis());
        Logger.debug();
        CronetAppProviderManager.inst().sendAppMonitorEvent(C786410Ut5.J3(jSONObject), "private_protocol");
    }

    public void startConnection(Map<String, Object> map, List<String> list) {
        ScheduledFuture<?> scheduledFutureSchedule;
        if (list != null && list.size() > 0) {
            Logger.debug();
            if (map != null && !map.isEmpty()) {
                destroyConnection();
                if (!canUsePrivateProtocol(map)) {
                    this.mDestroyTimeoutControl = new DestroyTimeoutControl(map, true);
                    startConnectionWithWebSocket(map, list);
                    return;
                }
                String str = (String) map.get("private_protocol_url");
                if (!TextUtils.isEmpty(str)) {
                    sPrivateProtocolUrl = str;
                }
                URI privateProtocolUrl = WsUtils.parsePrivateProtocolUrl(str);
                if (privateProtocolUrl == null) {
                    this.mDestroyTimeoutControl = new DestroyTimeoutControl(map, true);
                    startConnectionWithWebSocket(map, list);
                    return;
                }
                boolean zBooleanValue = false;
                this.mDestroyTimeoutControl = new DestroyTimeoutControl(map, false);
                Object obj = map.get("disable_fallback_websocket");
                if (obj != null) {
                    zBooleanValue = ((Boolean) obj).booleanValue();
                }
                Logger.debug();
                if (!sDisableFallbackTask && !zBooleanValue && this.mDestroyTimeoutControl.shouldFallbackToWebSocket()) {
                    long fallbackTimeoutSeconds = getFallbackTimeoutSeconds(map);
                    Logger.debug();
                    final FallbackWebSocketTask fallbackWebSocketTask = new FallbackWebSocketTask(fallbackTimeoutSeconds, map, list);
                    final C847280XLq c847280XLqLIZ = C847280XLq.LIZ();
                    c847280XLqLIZ.getClass();
                    try {
                        Runnable runnable = new Runnable(fallbackWebSocketTask) { // from class: X.0XLn
                            public final AbstractRunnableC847330XLv LL;

                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("AsyncIOTaskManager$InnerRunnable@f89f.run");
                                try {
                                    LIZ();
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("AsyncIOTaskManager$InnerRunnable@f89f.run");
                            }

                            public final void LIZ() {
                                AbstractRunnableC847330XLv abstractRunnableC847330XLv;
                                try {
                                    System.currentTimeMillis();
                                    this.LL.run();
                                    Logger.debug();
                                    abstractRunnableC847330XLv = this.LL;
                                    if (abstractRunnableC847330XLv.mIsLoop) {
                                        return;
                                    }
                                } catch (Throwable th) {
                                    try {
                                        TryCatchGuardChecker.doCheck(th);
                                        abstractRunnableC847330XLv = this.LL;
                                        if (abstractRunnableC847330XLv.mIsLoop) {
                                            return;
                                        }
                                    } catch (Throwable th2) {
                                        TryCatchGuardChecker.doCheck(th2);
                                        if (!this.LL.mIsLoop) {
                                            this.LLILLJJLI.LIZIZ.remove(this.LL);
                                            this.LLILLJJLI.LIZJ.remove(this.LL);
                                        }
                                        throw th2;
                                    }
                                }
                                this.LLILLJJLI.LIZIZ.remove(abstractRunnableC847330XLv);
                                this.LLILLJJLI.LIZJ.remove(this.LL);
                            }

                            {
                                this.LL = fallbackWebSocketTask;
                            }
                        };
                        if (fallbackWebSocketTask.mIsLoop) {
                            scheduledFutureSchedule = c847280XLqLIZ.LIZ.scheduleWithFixedDelay(runnable, fallbackWebSocketTask.mInitialDelay, fallbackWebSocketTask.mLoopInterval, TimeUnit.MILLISECONDS);
                        } else {
                            scheduledFutureSchedule = c847280XLqLIZ.LIZ.schedule(runnable, fallbackWebSocketTask.mInitialDelay, TimeUnit.MILLISECONDS);
                        }
                        c847280XLqLIZ.LIZJ.put(fallbackWebSocketTask, runnable);
                        c847280XLqLIZ.LIZIZ.put(fallbackWebSocketTask, scheduledFutureSchedule);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                    this.mIsFallbackTaskRunning.set(true);
                }
                this.mUsePrivateProtocol.set(true);
                startConnectionWithPrivateProtocol(map, privateProtocolUrl);
                return;
            }
            throw new IllegalArgumentException("configMap is empty !!!");
        }
        throw new IllegalArgumentException("urls size <= 0 !!!");
    }

    public void startConnectionWithWebSocket(Map<String, Object> map, List<String> list) {
        int iIntValue;
        this.mUsePrivateProtocol.set(false);
        this.mUsePrivateProtocolProxy.set(false);
        if (sFirstConnection.incrementAndGet() > 1) {
            this.mSharedConnection = false;
        }
        Object obj = map.get("channel_id");
        if (obj == null) {
            iIntValue = -1;
        } else {
            iIntValue = ((Integer) obj).intValue();
        }
        if (sChannelID == -1 && iIntValue > 0 && sFirstConnection.get() == 1) {
            sChannelID = iIntValue;
        }
        C847270XLp c847270XLpLIZLLL = sCronetEngine.LIZLLL(this.mCallback, C786410Ut5.h4());
        try {
            c847270XLpLIZLLL.LIZLLL = list;
            c847270XLpLIZLLL.LJFF = String.valueOf(map.get("app_key"));
            c847270XLpLIZLLL.LJII = ((Integer) map.get("fpid")).intValue();
            c847270XLpLIZLLL.LJIIJ = ((Integer) map.get("app_version")).intValue();
            c847270XLpLIZLLL.LJ = ((Integer) map.get("aid")).intValue();
            c847270XLpLIZLLL.LJI = CastLongProtector.parseLong((String) map.get("device_id"));
            c847270XLpLIZLLL.LJIIIIZZ = CastLongProtector.parseLong((String) map.get("iid"));
            if (iIntValue > 0 && iIntValue == sChannelID) {
                this.mSharedConnection = true;
            }
            c847270XLpLIZLLL.LJIILIIL = false;
            if (map.containsKey("sid")) {
                c847270XLpLIZLLL.LJIIIZ = (String) map.get("sid");
            }
            String str = (String) map.get("extra");
            HashMap map2 = new HashMap();
            if (!TextUtils.isEmpty(str)) {
                for (String str2 : str.split("&")) {
                    if (!TextUtils.isEmpty(str2)) {
                        String[] strArrSplit = str2.split("=");
                        if (strArrSplit.length == 2) {
                            map2.put(strArrSplit[0], strArrSplit[1]);
                        }
                    }
                }
            }
            try {
                HashMap map3 = new HashMap();
                Map<String, String> clientKeyHeaders = getClientKeyHeaders();
                Logger.debug();
                if (clientKeyHeaders != null && !clientKeyHeaders.isEmpty()) {
                    map3.putAll(clientKeyHeaders);
                }
                Map map4 = (Map) map.get("custom_headers");
                if (map4 != null && !map4.isEmpty()) {
                    map3.putAll(map4);
                }
                if (!map3.isEmpty()) {
                    c847270XLpLIZLLL.LJIIL = map3;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            DestroyTimeoutControl destroyTimeoutControl = this.mDestroyTimeoutControl;
            if (destroyTimeoutControl != null && destroyTimeoutControl.getWebsocketTimeout() > 0) {
                long websocketTimeout = this.mDestroyTimeoutControl.getWebsocketTimeout();
                Logger.debug();
                map2.put("ttnet_timeout_millis", String.valueOf(websocketTimeout));
            }
            c847270XLpLIZLLL.LJIIJJI = map2;
            k0 k0VarLIZ = c847270XLpLIZLLL.LIZ();
            this.mWebsocketConnection = k0VarLIZ;
            k0VarLIZ.LIZJ();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            throw new IllegalArgumentException("configMap contain err params !!!");
        }
    }

    public static String constructQueryForProxyMode(String str, String str2, Object obj) {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(str2);
        }
        try {
            long j = CastLongProtector.parseLong((String) obj);
            if (sb.length() > 0) {
                sb.append("&");
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("iid=");
            sbLIZ.append(j);
            sb.append(C2188811AlT.LIZIZ(sbLIZ));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return sb.toString();
    }

    private void registerServiceById(int i, ByteBuffer byteBuffer, String[] strArr) {
        if (this.mFrontierClient != null) {
            C847310XLt c847310XLt = new C847310XLt(i, new ServiceMessageReceiverImpl());
            CronetFrontierClient cronetFrontierClient = this.mFrontierClient;
            synchronized (cronetFrontierClient.LJIJ) {
                try {
                    if (cronetFrontierClient.LJIIZILJ == 0) {
                        return;
                    }
                    ((ConcurrentHashMap) cronetFrontierClient.LJIIJJI).put(Integer.valueOf(c847310XLt.LIZ), c847310XLt);
                    N.MKu8Zh_d(cronetFrontierClient.LJIIZILJ, cronetFrontierClient, strArr, byteBuffer, c847310XLt.LIZ, c847310XLt.LIZIZ.getValue(), true);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }
}
