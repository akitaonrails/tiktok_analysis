package org.chromium.wschannel;

import J.N;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C847260XLo;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.channel.IWsChannelClient;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ttnet.org.chromium.net.e;
import com.ttnet.org.chromium.net.impl.CronetUrlRequestContext;
import com.ttnet.org.chromium.net.impl.TTFrontierConnection;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.CronetClient;

/* JADX INFO: loaded from: classes14.dex */
public class TTFrontierClient {
    public static int sConnectionMode;
    public static CronetUrlRequestContext sCronetEngine;
    public final TTFrontierCallbackImpl mCallback;
    public final ExecutorService mExecutor;
    public TTFrontierConnection mFrontierConnection;
    public final AtomicBoolean mUseProxy = new AtomicBoolean(false);
    public final IWsChannelClient mWsChannelClient;

    private boolean shouldUseProxy(int i) {
        return i == 3 || i == 4;
    }

    public void destroy() {
        this.mExecutor.shutdown();
    }

    public void destroyConnection() {
        TTFrontierConnection tTFrontierConnection = this.mFrontierConnection;
        if (tTFrontierConnection != null) {
            synchronized (tTFrontierConnection.LIZIZ) {
                try {
                    if (tTFrontierConnection.LIZ != 0) {
                        N.M4Ly8Bhy(tTFrontierConnection.LIZ, tTFrontierConnection);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            this.mFrontierConnection.LIZ();
        }
    }

    public boolean isConnected() {
        TTFrontierConnection tTFrontierConnection = this.mFrontierConnection;
        return tTFrontierConnection != null && tTFrontierConnection.LJIILLIIL.get() == 2;
    }

    public boolean privateProtocolEnabled() {
        return sConnectionMode == 2;
    }

    public boolean privateProtocolProxyEnabled() {
        return sConnectionMode == 2 && this.mUseProxy.get();
    }

    public void stopConnection() {
        TTFrontierConnection tTFrontierConnection = this.mFrontierConnection;
        if (tTFrontierConnection != null) {
            synchronized (tTFrontierConnection.LIZIZ) {
                try {
                    if (tTFrontierConnection.LIZ != 0) {
                        N.M4Ly8Bhy(tTFrontierConnection.LIZ, tTFrontierConnection);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            this.mFrontierConnection.LIZ();
        }
    }

    public ExecutorService getExecutor() {
        return this.mExecutor;
    }

    public TTFrontierClient(IWsChannelClient iWsChannelClient) {
        this.mWsChannelClient = iWsChannelClient;
        this.mCallback = new TTFrontierCallbackImpl(this, iWsChannelClient);
        WsUtils.loadCronetKernel();
        e cronetEngine = CronetClient.getCronetEngine();
        if (cronetEngine instanceof CronetUrlRequestContext) {
            sCronetEngine = (CronetUrlRequestContext) cronetEngine;
            this.mExecutor = C786410Ut5.i4(new ThreadFactory() { // from class: org.chromium.wschannel.b
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    return TTFrontierClient.lambda$new$0(runnable);
                }
            });
            return;
        }
        throw new RuntimeException("sCronetEngine is not CronetUrlRequestContext");
    }

    public static /* synthetic */ Thread lambda$new$0(Runnable runnable) {
        return new BPEAThread(runnable, "tt-frontier-client");
    }

    private void reportAppStateChange(List<WsChannelMsg.MsgHeader> list) {
        boolean z;
        for (WsChannelMsg.MsgHeader msgHeader : list) {
            if (msgHeader != null && "IsBackground".equals(msgHeader.key)) {
                String str = msgHeader.value;
                boolean z2 = false;
                if ("1".equals(str)) {
                    z = true;
                } else if (CardStruct.IStatusCode.DEFAULT.equals(str)) {
                    z = false;
                } else {
                    return;
                }
                TTFrontierConnection tTFrontierConnection = this.mFrontierConnection;
                if (z) {
                    z2 = true;
                }
                synchronized (tTFrontierConnection.LIZIZ) {
                    try {
                        if (tTFrontierConnection.LIZ != 0) {
                            N.MhX1fbpk(tTFrontierConnection.LIZ, tTFrontierConnection, z2);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                Logger.debug();
                return;
            }
        }
    }

    public void onConnectionModeReady(int i) {
        sConnectionMode = i;
    }

    public boolean sendMessageWithPrivateProtocol(WsChannelMsg wsChannelMsg) {
        Logger.debug();
        if (this.mFrontierConnection != null && wsChannelMsg != null) {
            int i = wsChannelMsg.service;
            if (i == 9000 && wsChannelMsg.method == 4) {
                reportAppStateChange(wsChannelMsg.msgHeaders);
                return true;
            }
            String[] strArrConstructMessageMetaInfo = WsUtils.constructMessageMetaInfo(wsChannelMsg);
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(wsChannelMsg.LIZ().length);
            byteBufferAllocateDirect.put(wsChannelMsg.LIZ());
            byteBufferAllocateDirect.flip();
            this.mFrontierConnection.LIZIZ(i, byteBufferAllocateDirect, strArrConstructMessageMetaInfo);
            Logger.debug();
            return true;
        }
        return false;
    }

    public boolean sendMessageWithPrivateProtocolProxy(byte[] bArr) {
        Logger.debug();
        if (this.mFrontierConnection != null && bArr != null) {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bArr.length);
            byteBufferAllocateDirect.put(bArr);
            byteBufferAllocateDirect.flip();
            this.mFrontierConnection.LIZIZ(1, byteBufferAllocateDirect, null);
            return true;
        }
        return false;
    }

    public boolean sendMessageWithWebSocket(byte[] bArr) {
        Logger.debug();
        if (this.mFrontierConnection == null) {
            return false;
        }
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bArr.length);
        byteBufferAllocateDirect.put(bArr);
        byteBufferAllocateDirect.flip();
        this.mFrontierConnection.LIZIZ(1, byteBufferAllocateDirect, null);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3 */
    private void startFrontierConnection(Map<String, Object> map, List<String> list) {
        List list2;
        TTFrontierClient tTFrontierClient;
        TTFrontierClient tTFrontierClient2;
        String strLIZIZ;
        if (list != null && list.size() > 0) {
            if (map != null && !map.isEmpty()) {
                try {
                    String strValueOf = String.valueOf(map.get("app_key"));
                    int iIntValue = ((Integer) map.get("fpid")).intValue();
                    int iIntValue2 = ((Integer) map.get("app_version")).intValue();
                    int iIntValue3 = ((Integer) map.get("aid")).intValue();
                    long j = CastLongProtector.parseLong((String) map.get("device_id"));
                    String str = (String) map.get("private_protocol_url");
                    URI privateProtocolUrl = WsUtils.parsePrivateProtocolUrl(str);
                    ArrayList arrayList = new ArrayList();
                    if (privateProtocolUrl == null) {
                        list2 = list;
                        tTFrontierClient = str;
                    } else {
                        if (str.startsWith("https:")) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("wss:");
                            sbLIZ.append(str.substring(6));
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        } else {
                            boolean zStartsWith = str.startsWith("http:");
                            strLIZIZ = str;
                            if (zStartsWith) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("ws:");
                                sbLIZ2.append(str.substring(5));
                                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                            }
                        }
                        arrayList.add(strLIZIZ);
                        list2 = arrayList;
                        tTFrontierClient = strLIZIZ;
                    }
                    Logger.debug();
                    C847260XLo c847260XLo = new C847260XLo(iIntValue3, iIntValue, iIntValue2, j, strValueOf, list2);
                    try {
                        tTFrontierClient = this;
                        c847260XLo.LJII = CastLongProtector.parseLong((String) map.get("iid"));
                        if (map.containsKey("sid")) {
                            c847260XLo.LJI = (String) map.get("sid");
                        }
                        c847260XLo.LJIIJ = (ArrayList) map.get("service_id_list");
                        boolean zShouldUseProxy = tTFrontierClient.shouldUseProxy(((Integer) map.get("transport_mode")).intValue());
                        tTFrontierClient.mUseProxy.set(zShouldUseProxy);
                        c847260XLo.LJIIJJI = zShouldUseProxy;
                        tTFrontierClient2 = tTFrontierClient;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        tTFrontierClient2 = tTFrontierClient;
                    }
                    HashMap map2 = new HashMap();
                    try {
                        Map map3 = (Map) map.get("custom_headers");
                        if (map3 != null && !map3.isEmpty()) {
                            map2.putAll(map3);
                        }
                        String defaultUserAgent = MySelfChannelImpl.getDefaultUserAgent();
                        if (!TextUtils.isEmpty(defaultUserAgent)) {
                            map2.put("user-agent", defaultUserAgent);
                        }
                        String cookieHeader = WsUtils.getCookieHeader(privateProtocolUrl);
                        if (!TextUtils.isEmpty(cookieHeader)) {
                            map2.put("cookie", cookieHeader);
                        }
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                    }
                    c847260XLo.LJIIIIZZ = map2;
                    String str2 = (String) map.get("extra");
                    HashMap map4 = new HashMap();
                    if (!TextUtils.isEmpty(str2)) {
                        for (String str3 : str2.split("&")) {
                            if (!TextUtils.isEmpty(str3)) {
                                String[] strArrSplit = str3.split("=");
                                if (strArrSplit.length == 2) {
                                    map4.put(strArrSplit[0], strArrSplit[1]);
                                }
                            }
                        }
                    }
                    c847260XLo.LJIIIZ = map4;
                    TTFrontierConnection tTFrontierConnection = new TTFrontierConnection(sCronetEngine, tTFrontierClient2.mCallback, tTFrontierClient2.mExecutor, c847260XLo);
                    tTFrontierClient2.mFrontierConnection = tTFrontierConnection;
                    synchronized (tTFrontierConnection.LIZIZ) {
                        try {
                            if (tTFrontierConnection.LIZ == 0) {
                                return;
                            }
                            N.MtwH3UpE(tTFrontierConnection.LIZ, tTFrontierConnection, tTFrontierConnection.LIZLLL, tTFrontierConnection.LJ, tTFrontierConnection.LJFF, tTFrontierConnection.LJI, tTFrontierConnection.LJII, tTFrontierConnection.LJIIIZ, tTFrontierConnection.LJIIIIZZ, tTFrontierConnection.LJIILIIL);
                            return;
                        } catch (Throwable th3) {
                            TryCatchGuardChecker.doCheck(th3);
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    TryCatchGuardChecker.doCheck(th4);
                    throw new IllegalArgumentException("configMap contain err params !!!");
                }
            }
            throw new IllegalArgumentException("configMap is empty !!!");
        }
        throw new IllegalArgumentException("urls size <= 0 !!!");
    }

    public void startConnection(Map<String, Object> map, List<String> list) {
        startFrontierConnection(map, list);
    }
}
