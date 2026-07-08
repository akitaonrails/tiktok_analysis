package com.bytedance.ttnet;

import X.AbstractC1493260oxg;
import X.AbstractC1494150oz7;
import X.AbstractC1494220ozE;
import X.C08RN;
import X.C0VSJ;
import X.C0WZX;
import X.C0X2Q;
import X.C0X2W;
import X.C1150504el;
import X.C1276320jJm;
import X.C1490200osk;
import X.C1490240oso;
import X.C1492880ox4;
import X.C1492890ox5;
import X.C1492900ox6;
import X.C1492910ox7;
import X.C1493240oxe;
import X.C1493310oxl;
import X.C1493320oxm;
import X.C1493360oxq;
import X.C1493390oxt;
import X.C1493400oxu;
import X.C1493430oxx;
import X.C1493610oyF;
import X.C1493630oyH;
import X.C1493680oyM;
import X.C1493780oyW;
import X.C1493800oyY;
import X.C1494170oz9;
import X.C1494200ozC;
import X.C1494230ozF;
import X.C1494570ozn;
import X.C1494590ozp;
import X.C1494600ozq;
import X.C1494850p0F;
import X.C1497080p3q;
import X.C1497130p3v;
import X.C1497140p3w;
import X.C2088708Gf;
import X.C2089108Gj;
import X.C2104008Mc;
import X.C2109008Oa;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2211308lT;
import X.C2345509Gz;
import X.C786410Ut5;
import X.C786450Ut9;
import X.C810670Vr7;
import X.C842370X2t;
import X.EnumC1493270oxh;
import X.EnumC1493300oxk;
import X.EnumC812990Vur;
import X.InterfaceC1492630owf;
import X.InterfaceC1492830owz;
import X.InterfaceC1493280oxi;
import X.InterfaceC1493350oxp;
import X.InterfaceC1494070oyz;
import X.InterfaceC1494280ozK;
import X.InterfaceC1494290ozL;
import X.InterfaceC1494880p0I;
import X.InterfaceC1497120p3u;
import X.RunnableC823120WQs;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaBuilder;
import com.bytedance.keva.KevaImpl;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.retrofit2.SsHttpCall;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTNetInit;
import com.bytedance.ttnet.clientkey.ClientKeyManager;
import com.bytedance.ttnet.tnc.TNCManager;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.net.CookieHandler;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UnknownFormatConversionException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import m14.e;
import m14.l;
import m14.m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class TTNetInit {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String DOMAIN_NETLOG_KEY = "netlog";
    public static volatile EnumC812990Vur env;
    public static volatile String sClientIPString;
    public static long sCookieManagerInitStartTime;
    public static ICronetAppProvider sCronetProvider;
    public static Map<String, String> sGetDomainRegionMap;
    public static InterfaceC1493280oxi sITTNetDepend;
    public static volatile boolean sNotifiedColdStartFinsish;
    public static volatile List<String> sPublicIPv4List;
    public static volatile List<String> sPublicIPv6List;
    public static InterfaceC1492830owz sSystemApiSandbox;
    public static C1493390oxt sTTNetThreadConfigInfoManager;
    public static final String TAG = "TTNetInit";
    public static volatile int sDelayTime = 10;
    public static volatile CountDownLatch sLatchInitCompleted = new CountDownLatch(1);
    public static volatile boolean sApiHttpInterceptEnabled = false;
    public static volatile boolean sCookieLogReportEnabled = false;
    public static volatile boolean sListenAppStateIndependently = false;
    public static volatile boolean sStateDelayNewStrategyEnabled = false;
    public static volatile boolean sMainThreadInitCookieEnabled = true;
    public static volatile long sMaxHttpDiskCacheSize = 67108864;
    public static volatile int sAppSecurityLevel = 0;
    public static C2345509Gz sLifeCycleMonitor = new C2345509Gz();

    public static void doCommand(Context context, String str) {
    }

    public static InterfaceC1497120p3u getThreadConfigCallbackImpl() {
        return null;
    }

    public static List<C1493680oyM> getThreadConfigInfoList() {
        return null;
    }

    public static void preInitCronetKernel() {
        int i = -1;
        try {
            if (getCronetHttpClient(EnumC1493300oxk.PRE_INIT) == null) {
                i = C1493780oyW.LIZIZ;
                feedBackCronetInitFailedLog(i, "");
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (th instanceof IllegalArgumentException) {
                i = 3;
            }
            String strLIZIZ = C2211308lT.LIZIZ(th);
            if (strLIZIZ.length() > 1024) {
                strLIZIZ = strLIZIZ.substring(0, 1024);
            }
            feedBackCronetInitFailedLog(i, strLIZIZ);
            TNCManager.LJI().LJIIIIZZ();
            throw th;
        }
    }

    public static void setALogFuncAddr(long j) {
    }

    public static void setEnableURLDispatcher(boolean z) {
    }

    public static void setFirstRequestWaitTime(long j) {
    }

    public static void setHttpDnsForTesting(boolean z, boolean z2, boolean z3) {
    }

    public static void setTTNetThreadConfigInfoManager(C1493390oxt c1493390oxt) {
    }

    public static void tryInitCookieManager(Context context, boolean z, boolean z2) {
        com_bytedance_ttnet_TTNetInit_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_tryInitCookieManager(context, z, z2);
    }

    public static boolean urlDispatchEnabled() {
        return true;
    }

    static {
        TTALog.ensureALogInitialized();
        env = EnumC812990Vur.RELEASE;
        sNotifiedColdStartFinsish = false;
        sClientIPString = "";
        sCookieManagerInitStartTime = 0L;
    }

    public static void OnAppActivitySuspend() {
        if (C1493360oxq.LIZIZ) {
            C1493360oxq.LIZIZ = false;
            C1493360oxq.LIZ++;
        }
    }

    public static void OnAppActiviyResume() {
        if (C1493360oxq.LIZIZ) {
            return;
        }
        C1493360oxq.LIZIZ = true;
        C1493360oxq.LIZ++;
    }

    public static void countDownInitCompletedLatch() {
        try {
            if (sLatchInitCompleted.getCount() > 0) {
                sLatchInitCompleted.countDown();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void getInitCompletedLatch() {
        try {
            sLatchInitCompleted.await(5L, TimeUnit.SECONDS);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static InterfaceC1493280oxi getTTNetDepend() {
        InterfaceC1493280oxi interfaceC1493280oxi = sITTNetDepend;
        if (interfaceC1493280oxi != null) {
            return interfaceC1493280oxi;
        }
        throw new IllegalArgumentException("sITTNetDepend is null");
    }

    public static void notifyColdStartFinish() {
        if (sITTNetDepend == null || sNotifiedColdStartFinsish) {
            return;
        }
        sNotifiedColdStartFinsish = true;
        sITTNetDepend.onColdStartFinish();
    }

    public static void setCookieInitCompleted() {
        try {
            if (getCronetHttpClient(EnumC1493300oxk.COOKIE_INIT_COMPLETE_API) != null) {
                C1493630oyH.LIZIZ();
                C1493630oyH.LIZJ.setCookieInitCompleted();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void useCustomizedCookieStoreName() {
        C842370X2t.LIZLLL = "ttnetCookieStore";
    }

    public static void forceInitCronetKernel() {
        if (C1497080p3q.LJ().LIZ == EnumC1493300oxk.NONE) {
            C1497080p3q.LJ().LIZ = EnumC1493300oxk.FORCE_INIT;
        }
        C1493630oyH.LIZLLL(getTTNetDepend().getContext()).LJFF(false, C1493400oxu.LJIIJ(getTTNetDepend().getContext()).LIZJ(), true, sCronetProvider);
    }

    public static long getALogFuncAddr() {
        return TTALog.getALogFuncAddr();
    }

    public static int getEffectiveConnectionType() {
        try {
            C1493630oyH.LIZLLL(getTTNetDepend().getContext()).getClass();
            C1493630oyH.LIZIZ();
            return C1493630oyH.LIZJ.getEffectiveConnectionType();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return 0;
        }
    }

    public static Map<String, C1497140p3w> getGroupRttEstimates() {
        C1493630oyH.LIZLLL(getTTNetDepend().getContext()).getClass();
        C1493630oyH.LIZIZ();
        return C1493630oyH.LIZJ.getGroupRttEstimates();
    }

    public static C1497140p3w getNetworkQuality() {
        C1493630oyH.LIZLLL(getTTNetDepend().getContext()).getClass();
        C1493630oyH.LIZIZ();
        return C1493630oyH.LIZJ.getNetworkQuality();
    }

    public static boolean apiHttpInterceptEnabled() {
        return sApiHttpInterceptEnabled;
    }

    public static boolean cookieLogReportEnabled() {
        return sCookieLogReportEnabled;
    }

    public static int getAppSecurityLevel() {
        return sAppSecurityLevel;
    }

    public static String getClientIpString() {
        return sClientIPString;
    }

    public static ICronetAppProvider getCronetProvider() {
        return sCronetProvider;
    }

    public static EnumC812990Vur getEnv() {
        return env;
    }

    public static boolean getListenAppStateIndependently() {
        return sListenAppStateIndependently;
    }

    public static long getMaxHttpDiskCacheSize() {
        return sMaxHttpDiskCacheSize;
    }

    public static List<String> getPublicIPv4List() {
        return sPublicIPv4List;
    }

    public static List<String> getPublicIPv6List() {
        return sPublicIPv6List;
    }

    public static boolean getStateDelayNewStrategyEnabled() {
        return sStateDelayNewStrategyEnabled;
    }

    public static InterfaceC1492830owz getSystemApiSandbox() {
        return sSystemApiSandbox;
    }

    public static File INVOKEVIRTUAL_com_bytedance_ttnet_TTNetInit_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(Context context) throws Throwable {
        File file = C786450Ut9.LIZJ;
        if (file != null && C786450Ut9.LJ) {
            return file;
        }
        try {
            C786450Ut9.LIZJ = context.getFilesDir();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Context applicationContext = null;
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                Field declaredField = cls.getDeclaredField("mInitialApplication");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(objInvoke);
                if (obj instanceof Application) {
                    applicationContext = ((Application) obj).getApplicationContext();
                    PrintStream printStream = System.out;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Application context obtained through ActivityThread: ");
                    sbLIZ.append(applicationContext);
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    System.out.println("Error: mInitialApplication is not an instance of Application");
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                PrintStream printStream2 = System.out;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Error: ");
                sbLIZ2.append(e.getMessage());
                printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (applicationContext != null) {
                C786450Ut9.LIZJ = applicationContext.getFilesDir();
                C08RN.LIZ(applicationContext);
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(th.getMessage());
                sbLIZ3.append(":");
                sbLIZ3.append(C08RN.LIZJ());
                sbLIZ3.append(" applicationContext is null");
                throw new Throwable(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        return C786450Ut9.LIZJ;
    }

    public static void clearClientOpaqueData(Context context) {
        C1493630oyH.LIZLLL(context).getClass();
        if (C1493630oyH.LIZJ != null && C2104008Mc.LIZJ(C1493630oyH.LIZIZ)) {
            C1493630oyH.LIZJ.clearClientOpaqueData();
        }
    }

    public static void clearTNCFileBeforeStart(Context context) {
        if (context != null) {
            try {
                C0VSJ c0vsj = new C0VSJ(INVOKEVIRTUAL_com_bytedance_ttnet_TTNetInit_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(context), "server.json");
                if (c0vsj.exists()) {
                    c0vsj.delete();
                }
                C0VSJ c0vsj2 = new C0VSJ(INVOKEVIRTUAL_com_bytedance_ttnet_TTNetInit_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(context), "tt_net_config.config");
                if (c0vsj2.exists()) {
                    c0vsj2.delete();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            clearSharedPreferencesFile(context, "ss_app_config");
            clearSharedPreferencesFile(context, "ttnet_tnc_config");
            clearSharedPreferencesFile(context, "ttnet_store_region");
            return;
        }
        throw new IllegalArgumentException("context is null");
    }

    public static List<InetAddress> dnsLookup(String str) throws Throwable {
        List<String> list;
        if (C1497080p3q.LJFF()) {
            C1492900ox6 c1492900ox6TTDnsResolve = TTDnsResolve(str, 0);
            if (c1492900ox6TTDnsResolve.LIZ == 0 && (list = c1492900ox6TTDnsResolve.LIZIZ) != null && !list.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                Iterator<String> it2 = c1492900ox6TTDnsResolve.LIZIZ.iterator();
                while (it2.hasNext()) {
                    byte[] bArrB0 = C2204961BRm.b0(InetAddress.getByName(it2.next()), new C0WZX("dzBzEgAjS8/YVFkiQFyQctEAqJDk8Kw6Z5y+JcY=", null));
                    if (bArrB0 != null) {
                        arrayList.add(InetAddress.getByAddress(str, bArrB0));
                    }
                }
                if (!arrayList.isEmpty()) {
                    return arrayList;
                }
                throw new UnknownHostException(str);
            }
            throw new UnknownHostException(str);
        }
        throw new IllegalStateException("Cronet engine has not been initialized and completed.");
    }

    public static void enableApiHttpIntercept(boolean z) {
        sApiHttpInterceptEnabled = z;
    }

    public static void enableCookieLogReport(boolean z) {
        sCookieLogReportEnabled = z;
    }

    public static void enableProceedWithoutHook(boolean z) {
        C1494590ozp.LJFF = z;
    }

    public static void enableSsCallUseOkioReadForNoneStream(boolean z) {
        AbstractC1494220ozE.LLILZLL = z;
    }

    public static void enableSsCallUseZeroCopyReadForNoneStream(boolean z) {
        AbstractC1494150oz7.LLJI = z;
    }

    public static C1493630oyH getCronetHttpClient(EnumC1493300oxk enumC1493300oxk) {
        if (C1497080p3q.LJ().LIZ == EnumC1493300oxk.NONE) {
            C1497080p3q.LJ().LIZ = enumC1493300oxk;
            C1494170oz9.LIZIZ().LIZJ = SystemClock.uptimeMillis();
        }
        if (C1493430oxx.LIZ()) {
            C1493630oyH c1493630oyHLIZLLL = C1493630oyH.LIZLLL(getTTNetDepend().getContext());
            c1493630oyHLIZLLL.LJFF(true, C1493400oxu.LJIIJ(getTTNetDepend().getContext()).LIZJ(), false, sCronetProvider);
            return c1493630oyHLIZLLL;
        }
        return null;
    }

    public static String getGetDomainConfigByRegion(String str) {
        Map<String, String> map = sGetDomainRegionMap;
        if (map != null && !map.isEmpty() && sCronetProvider != null && !TextUtils.isEmpty(str)) {
            return sGetDomainRegionMap.get(str.toLowerCase());
        }
        return null;
    }

    public static void getMappingRequestState(String str) {
        try {
            C1493630oyH.LIZLLL(getTTNetDepend().getContext()).getClass();
            C1493630oyH.LIZIZ();
            C1493630oyH.LIZJ.getMappingRequestState(str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static C1497130p3v getPacketLossRateMetrics(int i) {
        C1493630oyH.LIZLLL(getTTNetDepend().getContext()).getClass();
        C1493630oyH.LIZIZ();
        return C1493630oyH.LIZJ.getPacketLossRateMetrics(i);
    }

    public static void onClientIPChanged(String str) {
        if (str != null) {
            sClientIPString = str;
        }
    }

    public static void preconnectUrl(String str) throws Exception {
        preconnectUrl(str, null);
    }

    public static void setAppSecurityLevel(int i) {
        sAppSecurityLevel = i;
    }

    public static void setBypassOfflineCheck(boolean z) {
        C1493630oyH.LJ = z;
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [X.0X2V] */
    public static void setCookieHandler(final Context context) {
        CookieManager cookieManagerZ2;
        try {
            CookieHandler cookieHandler = CookieHandler.getDefault();
            if (cookieHandler != null && (cookieHandler instanceof C0X2Q)) {
                C1494230ozF.LJIIL();
                setCookieInitCompleted();
                return;
            }
            if (sCookieManagerInitStartTime <= 0) {
                C1494230ozF.LJIIL();
                setCookieInitCompleted();
                return;
            }
            if (C1497080p3q.LJ().LJIIIIZZ == 0) {
                C1497080p3q.LJ().LJIIIIZZ = System.nanoTime();
            }
            try {
                cookieManagerZ2 = C786410Ut5.z2();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                sDelayTime = 0;
                CookieInitFailedReport(context, th.getMessage());
                cookieManagerZ2 = null;
            }
            int i = sDelayTime;
            getTTNetDepend().LJIILL();
            CookieHandler.setDefault(new C0X2Q(context, i, cookieManagerZ2, null, new C0X2W(context) { // from class: X.0X2V
            }));
            C1494230ozF.LJIIL();
            setCookieInitCompleted();
            C1497080p3q.LJ().LJIIIZ = System.nanoTime();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            CookieInitFailedReport(context, th2.getMessage());
        }
    }

    public static void setCronetDepend(ICronetAppProvider iCronetAppProvider) {
        if (iCronetAppProvider != null) {
            sCronetProvider = iCronetAppProvider;
            String carrierRegion = iCronetAppProvider.getCarrierRegion();
            String sysRegion = iCronetAppProvider.getSysRegion();
            String region = iCronetAppProvider.getRegion();
            if (TextUtils.isEmpty(carrierRegion)) {
                if (!TextUtils.isEmpty(sysRegion)) {
                    carrierRegion = sysRegion;
                } else {
                    carrierRegion = region;
                }
            }
            C1493240oxe c1493240oxeLJI = C1493240oxe.LJI();
            String storeIdcRuleJSON = iCronetAppProvider.getStoreIdcRuleJSON();
            String appInitialRegionInfo = iCronetAppProvider.getAppInitialRegionInfo();
            Context context = getTTNetDepend().getContext();
            C1492910ox7 c1492910ox7 = new C1492910ox7(iCronetAppProvider);
            c1493240oxeLJI.getClass();
            Logger.debug();
            if (!TextUtils.isEmpty(storeIdcRuleJSON) && context != null) {
                try {
                    JSONObject jSONObject = new JSONObject(storeIdcRuleJSON);
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("update_store_idc_path_list");
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        String string = JSONArrayProtectorUtils.getString(jSONArrayOptJSONArray, i);
                        if (!TextUtils.isEmpty(string)) {
                            ((ArrayList) c1493240oxeLJI.LJIIIIZZ).add(string);
                        }
                    }
                    JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("add_store_idc_host_list");
                    for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                        String string2 = JSONArrayProtectorUtils.getString(jSONArrayOptJSONArray2, i2);
                        if (!TextUtils.isEmpty(string2)) {
                            ((ArrayList) c1493240oxeLJI.LJIIIZ).add(string2);
                        }
                    }
                    c1493240oxeLJI.LJIIJ = context;
                    c1493240oxeLJI.LJIIL = c1492910ox7;
                    if (!TextUtils.isEmpty(carrierRegion)) {
                        c1493240oxeLJI.LJ = carrierRegion.toLowerCase();
                    }
                    if (!((ArrayList) c1493240oxeLJI.LJIIIZ).isEmpty() && !((ArrayList) c1493240oxeLJI.LJIIIIZZ).isEmpty()) {
                        c1493240oxeLJI.LJIIJJI = true;
                        c1493240oxeLJI.LJI = appInitialRegionInfo;
                        c1493240oxeLJI.LJII();
                    }
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            if (!TextUtils.isEmpty(carrierRegion)) {
                TNCManager.LJJIIJ = getGetDomainConfigByRegion(carrierRegion);
            }
            if (TextUtils.isEmpty(TNCManager.LJJIIJ)) {
                TNCManager.LJJIIJ = iCronetAppProvider.getGetDomainDefaultJSON();
            }
            Logger.debug();
            C1493320oxm.LIZIZ().LIZ = iCronetAppProvider;
            C1493630oyH.LJIIIZ = iCronetAppProvider;
            C1493780oyW.LJIIIIZZ = C1493320oxm.LIZIZ();
            return;
        }
        throw new IllegalArgumentException("cronetDepend is null");
    }

    public static void setDelayTime(int i) {
        sDelayTime = i;
    }

    public static void setEnv(EnumC812990Vur enumC812990Vur) {
        env = enumC812990Vur;
    }

    public static void setGetDomainRegionMap(Map<String, String> map) {
        if (map != null) {
            sGetDomainRegionMap = map;
            return;
        }
        throw new IllegalArgumentException("getDomainRegionMap is null");
    }

    public static void setHostResolverRulesForTesting(String str) {
        if (getCronetHttpClient(EnumC1493300oxk.DEPRECATED_API) != null) {
            C1493630oyH.LIZIZ();
            C1493630oyH.LIZJ.setHostResolverRules(str);
        }
    }

    public static void setListenAppStateIndependently(boolean z) {
        sListenAppStateIndependently = z;
    }

    public static void setMainThreadInitCookieEnabled(boolean z) {
        sMainThreadInitCookieEnabled = z;
    }

    public static void setMaxHttpDiskCacheSize(long j) {
        if (j > 0) {
            sMaxHttpDiskCacheSize = j;
        }
    }

    public static void setMonitorProcessHookV2(InterfaceC1494280ozK<C1494850p0F> interfaceC1494280ozK) {
        C1494230ozF.LIZLLL = interfaceC1494280ozK;
        C1494570ozn.LJLL = C1493800oyY.LIZ;
    }

    public static void setOecCallbackAddress(long j) {
        C1493630oyH.LJI();
        ICronetClient iCronetClient = C1493630oyH.LIZJ;
        if (iCronetClient != null) {
            iCronetClient.setOecCallbackAddress(j);
        }
    }

    public static void setProcessFlag(int i) {
        C2104008Mc.LIZ.set(i);
    }

    public static void setProxy(String str) {
        if (C1497080p3q.LJFF()) {
            C1493630oyH.LIZLLL(getTTNetDepend().getContext()).getClass();
            C1493630oyH.LIZIZ();
            C1493630oyH.LIZJ.setProxy(str);
            return;
        }
        C1493780oyW.LJII(getTTNetDepend().getContext());
        if (str == null) {
            C1493780oyW.LIZLLL = null;
            return;
        }
        String[] strArrSplit = str.split(";");
        if (strArrSplit.length > 0) {
            String[] strArrSplit2 = strArrSplit[0].trim().split("=");
            if (strArrSplit2.length == 2) {
                String lowerCase = strArrSplit2[0].trim().toLowerCase();
                String[] strArrSplit3 = strArrSplit2[1].trim().split(":");
                if (strArrSplit3.length == 2) {
                    InetSocketAddress inetSocketAddress = new InetSocketAddress(strArrSplit3[0], CastIntegerProtector.parseInt(strArrSplit3[1]));
                    if (!lowerCase.equals("http") && !lowerCase.equals("https")) {
                        if (!lowerCase.equals("socks") && !lowerCase.equals("socks4") && !lowerCase.equals("socks5")) {
                            return;
                        }
                        C1493780oyW.LIZLLL = new Proxy(Proxy.Type.SOCKS, inetSocketAddress);
                        return;
                    }
                    C1493780oyW.LIZLLL = new Proxy(Proxy.Type.HTTP, inetSocketAddress);
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Invalid proxy rule:");
                sbLIZ.append(str);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Invalid proxy rule:");
            sbLIZ2.append(str);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("Invalid proxy rule:");
        sbLIZ3.append(str);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ3));
    }

    public static void setStateDelayNewStrategyEnabled(boolean z) {
        sStateDelayNewStrategyEnabled = z;
    }

    public static void setSystemApiSandbox(InterfaceC1492830owz interfaceC1492830owz) {
        sSystemApiSandbox = interfaceC1492830owz;
    }

    public static void setTTNetDepend(InterfaceC1493280oxi interfaceC1493280oxi) {
        sITTNetDepend = interfaceC1493280oxi;
        Map<String, String> mapLJIIIIZZ = getTTNetDepend().LJIIIIZZ();
        if (TextUtils.isEmpty(mapLJIIIIZZ.get("httpdns")) || (TextUtils.isEmpty(mapLJIIIIZZ.get("boe")) && TextUtils.isEmpty(mapLJIIIIZZ.get("boe_https")))) {
            sITTNetDepend = null;
            throw new IllegalArgumentException("You must set HttpDns, NetLog and BOE service domain, please refer to TTNet access documents.");
        }
        InterfaceC1493280oxi interfaceC1493280oxi2 = sITTNetDepend;
        if (interfaceC1493280oxi2 instanceof AbstractC1493260oxg) {
            interfaceC1493280oxi2.getClass();
            setAppSecurityLevel(sAppSecurityLevel | 1);
        }
        InterfaceC1493280oxi interfaceC1493280oxi3 = sITTNetDepend;
        if (interfaceC1493280oxi3 instanceof InterfaceC1494880p0I) {
            C1494570ozn.LJLJL = (InterfaceC1494880p0I) interfaceC1493280oxi3;
        }
        C1494600ozq.LJJJJZ = new C1493610oyF();
        String str = mapLJIIIIZZ.get("boe");
        C2109008Oa.LIZ = str;
        if (!TextUtils.isEmpty(str)) {
            C2109008Oa.LIZLLL = true;
        }
        String str2 = mapLJIIIIZZ.get("boe_https");
        C2109008Oa.LIZIZ = str2;
        if (!TextUtils.isEmpty(str2)) {
            C2109008Oa.LIZLLL = false;
        }
        C1493320oxm.LIZIZ().LIZIZ = interfaceC1493280oxi;
    }

    public static void trigerGetDomain(Context context) {
        triggerGetDomain(context, false);
    }

    public static void trySetDefaultUserAgent(String str) {
        InterfaceC1494070oyz interfaceC1494070oyz = C1494230ozF.LIZ;
        if (str != null) {
            try {
                if (str.length() > 0) {
                    char[] charArray = str.toCharArray();
                    int length = charArray.length;
                    boolean z = false;
                    for (int i = 0; i < length; i++) {
                        char c = charArray[i];
                        if (c < ' ' || c > '~') {
                            charArray[i] = '?';
                            z = true;
                        }
                    }
                    if (z) {
                        str = new String(charArray);
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        C1494230ozF.LJIILIIL = str;
    }

    public static C1276320jJm ttUrlDispatch(String str) {
        return ttUrlDispatchInternal(str, -1, true);
    }

    public static void CookieInitFailedReport(Context context, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", "failed");
            jSONObject.put("exception", str);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        getTTNetDepend().LJIIJ();
    }

    public static C1492900ox6 TTDnsResolve(String str, int i) {
        return TTDnsResolve(str, i, null);
    }

    public static void clearSharedPreferencesFile(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            C810670Vr7.LIZJ(context, 0, str).edit().clear().apply();
        }
    }

    public static void feedBackCronetInitFailedLog(int i, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("fallback", i);
            jSONObject.put("exception", str);
            jSONObject.put("model", Build.MODEL);
            String string = "";
            String[] strArr = Build.SUPPORTED_ABIS;
            if (strArr != null && strArr.length > 0) {
                string = Arrays.asList(strArr).toString();
            }
            jSONObject.put("abis", string);
            getTTNetDepend().LJII("cronet_failed", jSONObject);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void monitorLogSend(String str, JSONObject jSONObject) {
        InterfaceC1493280oxi interfaceC1493280oxi = sITTNetDepend;
        if (interfaceC1493280oxi != null) {
            interfaceC1493280oxi.LJII(str, jSONObject);
        }
    }

    public static void onPublicIPsChanged(List<String> list, List<String> list2) {
        sPublicIPv4List = list;
        sPublicIPv6List = list2;
    }

    public static void preconnectUrl(String str, Map<String, String> map) throws Exception {
        if (C1497080p3q.LJFF()) {
            try {
                new URL(str).toURI();
                C1493630oyH.LIZLLL(getTTNetDepend().getContext()).getClass();
                C1493630oyH.LIZIZ();
                C1493630oyH.LIZJ.preconnectUrl(str, map);
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            }
        }
        throw new IllegalStateException("Cronet engine has not been initialized and completed.");
    }

    public static void removeClientOpaqueData(Context context, String str) {
        C1493630oyH.LIZLLL(context).getClass();
        if (C1493630oyH.LIZJ != null && C2104008Mc.LIZJ(C1493630oyH.LIZIZ)) {
            C1493630oyH.LIZJ.removeClientOpaqueData(str);
        }
    }

    public static void runInBackGround(Context context, boolean z) {
        C1493630oyH.LIZLLL(context).getClass();
        if (C1493630oyH.LIZJ != null && C2104008Mc.LIZJ(C1493630oyH.LIZIZ)) {
            C1493630oyH.LIZJ.runInBackGround(z);
        }
    }

    public static void setSlaSamplingSetting(Context context, JSONObject jSONObject) {
        try {
            Logger.debug();
            if (C1494170oz9.LIZIZ().LIZJ(sITTNetDepend.getAppId(), jSONObject)) {
                C1493630oyH c1493630oyHLIZLLL = C1493630oyH.LIZLLL(context);
                C1494200ozC c1494200ozCLIZ = C1494170oz9.LIZIZ().LIZ(0);
                c1493630oyHLIZLLL.getClass();
                C1493630oyH.LIZIZ();
                C1493630oyH.LIZJ.setSlaSamplingSetting(c1494200ozCLIZ);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void triggerGetDomain(Context context, boolean z) {
        C1493630oyH.LIZLLL(context).getClass();
        if (C1493630oyH.LIZJ != null && C2104008Mc.LIZJ(C1493630oyH.LIZIZ)) {
            C1493630oyH.LIZJ.triggerGetDomain(z);
        }
    }

    public static C1276320jJm ttUrlDispatchV2(String str, int i) {
        return ttUrlDispatchV2(str, i, true);
    }

    public static C1492900ox6 TTDnsResolve(String str, int i, Map<String, String> map) throws InterruptedException {
        C1492890ox5 c1492890ox5;
        if (C1497080p3q.LJFF()) {
            synchronized (C1492890ox5.class) {
                if (C1492890ox5.LIZIZ == null) {
                    C1492890ox5.LIZIZ = new C1492890ox5();
                }
                c1492890ox5 = C1492890ox5.LIZIZ;
            }
            c1492890ox5.getClass();
            C1492880ox4 c1492880ox4 = new C1492880ox4(str, i, map);
            ((ConcurrentHashMap) c1492890ox5.LIZ).put(c1492880ox4.LIZ, c1492880ox4);
            C1493630oyH c1493630oyHLIZLLL = C1493630oyH.LIZLLL(getTTNetDepend().getContext());
            String str2 = c1492880ox4.LIZ;
            c1493630oyHLIZLLL.getClass();
            C1493630oyH.LIZIZ();
            C1493630oyH.LIZJ.ttDnsResolve(str, i, str2, map);
            c1492880ox4.LIZJ.await();
            ((ConcurrentHashMap) c1492890ox5.LIZ).remove(c1492880ox4.LIZ);
            return c1492880ox4.LIZLLL;
        }
        throw new IllegalStateException("Cronet engine has not been initialized and completed.");
    }

    public static void com_bytedance_ttnet_TTNetInit__tryInitCookieManager$___twin___(final Context context, final boolean z, final boolean z2) {
        String strReplaceFirst;
        Map<String, List<String>> map;
        Logger.debug();
        long j = 0;
        try {
            sCookieManagerInitStartTime = System.currentTimeMillis();
            if (z) {
                if (C1497080p3q.LJ().LJIIIIZZ == 0) {
                    C1497080p3q.LJ().LJIIIIZZ = System.nanoTime();
                }
                CookieSyncManager.createInstance(context);
                C786410Ut5.z2().setAcceptCookie(true);
                setCookieHandler(context);
                Logger.debug();
            } else {
                C1494230ozF.LJIIL();
                setCookieInitCompleted();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (C2104008Mc.LIZJ(context) && C786410Ut5.u3() != Looper.getMainLooper().getThread()) {
                if (sMainThreadInitCookieEnabled) {
                    C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: X.0V1R
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("TTNetInit@b777.tryInitCookieManager$1");
                            try {
                                TTNetInit.com_bytedance_ttnet_TTNetInit_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_tryInitCookieManager(context, z, z2);
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("TTNetInit@b777.tryInitCookieManager$1");
                        }
                    });
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error", th.getMessage());
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                InterfaceC1493280oxi interfaceC1493280oxi = sITTNetDepend;
                if (interfaceC1493280oxi != null) {
                    interfaceC1493280oxi.LJII("async_init_cookie_manager_fail", jSONObject);
                }
                CookieInitFailedReport(context, th.getMessage());
            }
        }
        ClientKeyManager clientKeyManagerLJI = ClientKeyManager.LJI();
        clientKeyManagerLJI.getClass();
        ClientKeyManager.LJIIJ = z2;
        try {
            ClientKeyManager.LJIIIIZZ = KevaImpl.getRepo("ttnet_client_key_config", 1);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        Keva keva = ClientKeyManager.LJIIIIZZ;
        if (keva != null) {
            String string = keva.getString("client_key_config", "");
            if (!TextUtils.isEmpty(string)) {
                try {
                    clientKeyManagerLJI.LIZIZ(new JSONObject(string));
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                }
            }
            if (ClientKeyManager.LJIIIZ) {
                String string2 = ClientKeyManager.LJIIIIZZ.getString("session_id", "");
                long j2 = ClientKeyManager.LJIIIIZZ.getLong("session_time", 0L);
                clientKeyManagerLJI.LJ = ClientKeyManager.LJIIIIZZ.getString("session_url", "");
                clientKeyManagerLJI.LIZJ = ClientKeyManager.LJIIIIZZ.getString("client_key", "");
                String string3 = ClientKeyManager.LJIIIIZZ.getString("kms_version", "");
                clientKeyManagerLJI.LJFF = string3;
                ClientKeyManager.LJIIJJI = ClientKeyManager.LJFF(clientKeyManagerLJI.LIZJ, string3);
                if (!string2.isEmpty() && !clientKeyManagerLJI.LJ.isEmpty()) {
                    String[] strArrSplit = string2.split(";");
                    int i = 0;
                    if (strArrSplit != null && strArrSplit.length > 0) {
                        clientKeyManagerLJI.LIZLLL = strArrSplit[0].trim();
                    }
                    if (!TextUtils.isEmpty(clientKeyManagerLJI.LIZLLL)) {
                        if (strArrSplit != null && strArrSplit.length >= 2 && j2 > 0) {
                            int length = strArrSplit.length;
                            while (true) {
                                if (i >= length) {
                                    break;
                                }
                                String str = strArrSplit[i];
                                if (!TextUtils.isEmpty(str) && str.toLowerCase().trim().startsWith("Max-Age=".toLowerCase())) {
                                    String[] strArrSplit2 = str.split("=");
                                    if (strArrSplit2 == null || strArrSplit2.length != 2) {
                                        break;
                                    }
                                    try {
                                        long j3 = CastLongProtector.parseLong(strArrSplit2[1]);
                                        if (j3 > 0) {
                                            long jCurrentTimeMillis = j3 - ((System.currentTimeMillis() - j2) / 1000);
                                            if (jCurrentTimeMillis > 0) {
                                                j = jCurrentTimeMillis;
                                            }
                                            String strTrim = str.trim();
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append("Max-Age=");
                                            sbLIZ.append(j);
                                            strReplaceFirst = string2.replaceFirst(strTrim, C2188811AlT.LIZIZ(sbLIZ));
                                        }
                                    } catch (Throwable th4) {
                                        TryCatchGuardChecker.doCheck(th4);
                                    }
                                } else {
                                    i++;
                                }
                            }
                            strReplaceFirst = null;
                        } else {
                            strReplaceFirst = null;
                        }
                        if (!TextUtils.isEmpty(strReplaceFirst)) {
                            string2 = strReplaceFirst;
                        }
                        Logger.debug();
                        CookieHandler cookieHandler = CookieHandler.getDefault();
                        if (cookieHandler != null) {
                            try {
                                URI uriLIZIZ = C2089108Gj.LIZIZ(clientKeyManagerLJI.LJ);
                                if (uriLIZIZ != null && (map = cookieHandler.get(uriLIZIZ, null)) != null && !map.isEmpty() && map.containsKey("Cookie")) {
                                    String string4 = map.get("Cookie").toString();
                                    Logger.debug();
                                    if (!TextUtils.isEmpty(string4)) {
                                        if (!string4.contains(clientKeyManagerLJI.LIZLLL)) {
                                            clientKeyManagerLJI.LJII(string2, cookieHandler, uriLIZIZ);
                                            clientKeyManagerLJI.LIZJ(string4, string2);
                                            return;
                                        }
                                        return;
                                    }
                                    clientKeyManagerLJI.LJII(string2, cookieHandler, uriLIZIZ);
                                    clientKeyManagerLJI.LIZJ("empty", string2);
                                }
                            } catch (Throwable th5) {
                                TryCatchGuardChecker.doCheck(th5);
                            }
                        }
                    }
                }
            }
        }
    }

    public static void com_bytedance_ttnet_TTNetInit_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_tryInitCookieManager(Context context, boolean z, boolean z2) {
        C1150504el.LIZ().LIZLLL("feed_network_init_cookie_duration", false);
        com_bytedance_ttnet_TTNetInit__tryInitCookieManager$___twin___(context, z, z2);
    }

    public static boolean tryStartTTNetDetect(String[] strArr, int i, int i2) {
        if (strArr != null && strArr.length > 0 && i > 0 && i <= 180 && i2 >= 0) {
            try {
                C1493630oyH.LIZLLL(getTTNetDepend().getContext()).getClass();
                C1493630oyH.LIZIZ();
                C1493630oyH.LIZJ.tryStartNetDetect(strArr, i, i2);
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return false;
    }

    public static C1276320jJm ttUrlDispatchInternal(String str, int i, boolean z) throws Exception {
        if (!C1493400oxu.LJIIJ(getTTNetDepend().getContext()).LJFF()) {
            e eVarLIZ = l.LJ().LIZ(new m(str, null, null));
            if (eVarLIZ != null) {
                return new C1276320jJm(str, eVarLIZ.LIZ, String.valueOf(l.LJ().LIZJ.get()), l.LJ().LJIIJ, EnumC1493270oxh.SUCCESS, "");
            }
            throw new IllegalArgumentException("okhttp dispatch failed.");
        }
        if (C1497080p3q.LJFF()) {
            try {
                new URL(str).toURI();
                C1493630oyH.LIZIZ();
                return C1493630oyH.LIZJ.ttUrlDispatch(str, i, z);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            }
        }
        throw new IllegalStateException("cronet not init.");
    }

    public static C1276320jJm ttUrlDispatchV2(String str, int i, boolean z) {
        try {
            new URL(str).toURI();
            try {
                return ttUrlDispatchInternal(str, i, z);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                String message = e.getMessage();
                if ((e instanceof IllegalArgumentException) && "okhttp dispatch failed.".equals(message)) {
                    return new C1276320jJm(str, EnumC1493270oxh.OKHTTP_DISPATCH_FAILED);
                }
                boolean z2 = e instanceof IllegalStateException;
                if (z2 && "cronet not init.".equals(message)) {
                    return new C1276320jJm(str, EnumC1493270oxh.CRONET_NOT_INIT);
                }
                if ((e instanceof UnsupportedOperationException) && "CronetEngine has not been initialized.".equals(message)) {
                    return new C1276320jJm(str, EnumC1493270oxh.CRONET_NOT_INIT);
                }
                if (z2 && "Engine is shut down.".equals(message)) {
                    return new C1276320jJm(str, EnumC1493270oxh.CRONET_NOT_INIT);
                }
                if ((e instanceof UnknownFormatConversionException) && "Conversion = 'ttUrlDispatch returns wrong format'".equals(message)) {
                    return new C1276320jJm(str, EnumC1493270oxh.WRONG_FORMAT);
                }
                if (!(e instanceof URISyntaxException) && !(e instanceof MalformedURLException)) {
                    if ((e instanceof SocketTimeoutException) && "ttnet".equals(message)) {
                        return new C1276320jJm(str, EnumC1493270oxh.TIMEOUT);
                    }
                    return new C1276320jJm(str, EnumC1493270oxh.NOT_REACHED);
                }
                return new C1276320jJm(str, EnumC1493270oxh.INVALID_FINAL_URL);
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            return new C1276320jJm(str, EnumC1493270oxh.INVALID_ORIGIN_URL);
        }
    }

    public static void addClientOpaqueData(Context context, String[] strArr, byte[] bArr, byte[] bArr2) {
        C1493630oyH.LIZLLL(context).getClass();
        if (C1493630oyH.LIZJ != null && C2104008Mc.LIZJ(C1493630oyH.LIZIZ)) {
            C1493630oyH.LIZJ.addClientOpaqueData(strArr, bArr, bArr2, 0L, 0L);
        }
    }

    public static void addClientOpaqueData(Context context, String[] strArr, byte[] bArr, byte[] bArr2, long j, long j2) {
        C1493630oyH.LIZLLL(context).getClass();
        if (C1493630oyH.LIZJ != null && C2104008Mc.LIZJ(C1493630oyH.LIZIZ)) {
            C1493630oyH.LIZJ.addClientOpaqueData(strArr, bArr, bArr2, j, j2);
        }
    }

    public static void enableTTBizHttpDns(boolean z, String str, String str2, String str3, boolean z2, String str4) {
        if (z && (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3))) {
            return;
        }
        try {
            if (getCronetHttpClient(EnumC1493300oxk.BIZ_HTTPDNS_API) != null) {
                C1493630oyH.LIZIZ();
                C1493630oyH.LIZJ.enableTTBizHttpDns(z, str, str2, str3, z2, str4);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void tryInitTTNet(final Context context, Application application, InterfaceC1494070oyz<C1494850p0F> interfaceC1494070oyz, InterfaceC1494290ozL<C1494850p0F> interfaceC1494290ozL, InterfaceC1492630owf interfaceC1492630owf, final boolean z, boolean... zArr) {
        boolean z2;
        boolean z3;
        final boolean z4;
        String strLIZ;
        C1497080p3q.LJ().LIZLLL = System.currentTimeMillis();
        C1497080p3q.LJ().LJ = System.nanoTime();
        if (context != null) {
            try {
                Reflect.on(Class.forName("com.bytedance.crash.Npth").newInstance()).call("registerSdk", new Class[]{Integer.TYPE, String.class}, 2616, "4.2.243.57-tiktok");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            if (EnumC812990Vur.RELEASE != getEnv()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && "true".equals(C810670Vr7.LIZJ(context, 0, "ttnet_debug_setting").getString("log_switcher", null))) {
                Logger.setLogLevel(2);
                Logger.getLogLevel();
            }
            Logger.getLogLevel();
            C1494230ozF.LIZ = interfaceC1494070oyz;
            C1494600ozq.LJJJJZ = new C1493610oyF();
            KevaBuilder.getInstance().setContext(context);
            if (zArr != null && zArr.length > 0) {
                z3 = zArr[0];
            } else {
                z3 = false;
            }
            boolean zLIZJ = C2104008Mc.LIZJ(context);
            if (zLIZJ) {
                new RunnableC823120WQs() { // from class: X.0owe
                    @Override // X.RunnableC823120WQs, java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("TTNetInit@b777.tryInitTTNet$1");
                        try {
                            LIZJ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("TTNetInit@b777.tryInitTTNet$1");
                    }

                    public final void LIZJ() {
                        Logger.debug();
                        if (TTNetInit.sStateDelayNewStrategyEnabled) {
                            SsHttpCall.setThrottleControl(C1489880osE.LJ());
                        } else {
                            SsHttpCall.setThrottleControl(C1490100osa.LJFF());
                        }
                        C1493400oxu.LJIIJ(context).LJIJJ();
                        C1493400oxu.LJIIJ(context).LJIJJLI(EnumC1492690owl.TTSERVER, true);
                        TTNetInit.com_bytedance_ttnet_TTNetInit_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_tryInitCookieManager(context, z, true);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super((Object) null);
                    }
                }.LIZ();
            } else {
                if (z3 || ((strLIZ = C2104008Mc.LIZ(context)) != null && (strLIZ.endsWith(":push") || strLIZ.endsWith(":pushservice")))) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                new RunnableC823120WQs() { // from class: X.0owg
                    @Override // X.RunnableC823120WQs, java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("TTNetInit@b777.tryInitTTNet$2");
                        try {
                            C1493400oxu.LJIIJ(context).LJIJJ();
                            C1493400oxu.LJIIJ(context).LJIJJLI(EnumC1492690owl.TTSERVER, true);
                            if (z4) {
                                TTNetInit.com_bytedance_ttnet_TTNetInit_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_tryInitCookieManager(context, z, false);
                            } else {
                                C1494230ozF.LJIIL();
                                TTNetInit.setCookieInitCompleted();
                            }
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("TTNetInit@b777.tryInitTTNet$2");
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super((Object) null);
                    }
                }.LIZ();
            }
            C1490240oso.LIZ();
            TNCManager tNCManagerLJI = TNCManager.LJI();
            synchronized (tNCManagerLJI) {
                if (!tNCManagerLJI.LJIIJJI) {
                    tNCManagerLJI.LJIIL = context;
                    tNCManagerLJI.LJJ = zLIZJ;
                    tNCManagerLJI.LJIILIIL = new C1490200osk(context, zLIZJ);
                    if (zLIZJ) {
                        SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(tNCManagerLJI.LJIIL, 0, "ttnet_tnc_config");
                        tNCManagerLJI.LJIILJJIL = sharedPreferencesLIZJ.getInt("tnc_probe_cmd", 0);
                        tNCManagerLJI.LJIILL = sharedPreferencesLIZJ.getLong("tnc_probe_version", 0L);
                    }
                    Logger.debug();
                    tNCManagerLJI.LJIIJJI = true;
                }
            }
            l.LJ().LIZ = context;
            C1493400oxu.LJIIJ(context);
            C1497080p3q c1497080p3qLJ = C1497080p3q.LJ();
            c1497080p3qLJ.getClass();
            c1497080p3qLJ.LJFF = System.nanoTime();
            C1497080p3q.LJI(context, null);
            c1497080p3qLJ.LJI = System.nanoTime();
            C1494230ozF.LIZIZ = interfaceC1494290ozL;
            C1494570ozn.LJLL = C1493800oyY.LIZ;
            countDownInitCompletedLatch();
            if (!zLIZJ) {
                C1497080p3q.LJ().LIZIZ = false;
                C1497080p3q.LJ().LJII = System.nanoTime();
                return;
            }
            if (C1493310oxl.LIZ == null) {
                C1493310oxl.LIZ = new InterfaceC1493350oxp(context) { // from class: X.0owm
                };
            }
            ((CopyOnWriteArrayList) sLifeCycleMonitor.LL).add(C2088708Gf.LIZJ());
            if (application != null) {
                application.registerActivityLifecycleCallbacks(sLifeCycleMonitor);
            }
            if (!C1493430oxx.LIZ()) {
                notifyColdStartFinish();
            }
            C1497080p3q.LJ().LJII = System.nanoTime();
            return;
        }
        throw new IllegalArgumentException("tryInitTTNet context is null");
    }

    public static void setZstdFuncAddr(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        if (getCronetHttpClient(EnumC1493300oxk.ZSTD_API) != null) {
            Logger.debug();
            C1493630oyH.LIZIZ();
            C1493630oyH.LIZJ.setZstdFuncAddr(j, j2, j3, j4, j5, j6, j7, j8);
        }
    }
}
