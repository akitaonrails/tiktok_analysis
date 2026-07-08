package org.chromium;

import X.AbstractC1497710p4r;
import X.AbstractRunnableC1490020osS;
import X.AnonymousClass0803;
import X.AnonymousClass0806;
import X.C081H;
import X.C08H5;
import X.C0VSF;
import X.C0VSJ;
import X.C1276320jJm;
import X.C1490010osR;
import X.C1492820owy;
import X.C1493680oyM;
import X.C1494200ozC;
import X.C1494230ozF;
import X.C1494270ozJ;
import X.C1494600ozq;
import X.C1496600p34;
import X.C1497080p3q;
import X.C1497130p3v;
import X.C1497140p3w;
import X.C1497360p4I;
import X.C2104008Mc;
import X.C2179971ATj;
import X.C2188811AlT;
import X.C740700T3s;
import X.C810670Vr7;
import X.EnumC1490030osT;
import X.EnumC1493270oxh;
import X.EnumC1493300oxk;
import X.EnumC1497190p41;
import X.EnumC1497200p42;
import X.InterfaceC1497120p3u;
import X.InterfaceC1498450p63;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTALog;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import com.ttnet.org.chromium.net.TTAppInfoProvider;
import com.ttnet.org.chromium.net.TTSamplingSettingProvider$TTApiLogSamplingRule;
import com.ttnet.org.chromium.net.TTSamplingSettingProvider$TTEventLogSamplingRule;
import com.ttnet.org.chromium.net.TTSamplingSettingProvider$TTSlaSamplingSetting;
import com.ttnet.org.chromium.net.TTThreadConfigInfoProvider$ThreadConfigInfo;
import com.ttnet.org.chromium.net.e;
import com.ttnet.org.chromium.net.i;
import com.ttnet.org.chromium.net.impl.CronetUrlRequest;
import com.ttnet.org.chromium.net.o0;
import com.ttnet.org.chromium.net.urlconnection.CronetHttpURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UnknownFormatConversionException;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class CronetClient implements ICronetClient {
    public static int sAppID = 0;
    public static ICronetClient.ICronetBootFailureCheckerProvider sCronetBootFailureCheckerProvider = null;
    public static volatile e sCronetEngine = null;
    public static ICronetClient.ICronetThreadStackOptFailureCheckerProvider sCronetThreadStackOptFailureCheckerProvider = null;
    public static volatile int sNetworkThreadPriority = 20;
    public static long sOecCallbackAddress;
    public int mCrashDetectTimerInterval = 5000;
    public int mCrashLimitTimes;
    public int mTTNetCrashTimes;

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public String getCronetVersion() {
        return "TTNetVersion:3a9f3ddf 2026-06-25 QuicVersion:c3b23989 2026-06-25";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void setHttpDnsForTesting(boolean z, boolean z2, boolean z3) {
    }

    public static long getALogFuncAddr() throws C081H {
        if (C1494230ozF.LJIL) {
            return TTALog.getALogFuncAddr();
        }
        AnonymousClass0806 anonymousClass0806LIZJ = AnonymousClass0803.LIZJ(Class.forName("com.bytedance.ttnet.TTALog").newInstance());
        anonymousClass0806LIZJ.LIZ("getALogFuncAddr");
        return ((Long) anonymousClass0806LIZJ.get()).longValue();
    }

    public static int getAppSecurityLevel() {
        try {
            if (C1494230ozF.LJIL) {
                return TTNetInit.getAppSecurityLevel();
            }
            AnonymousClass0806 anonymousClass0806LIZJ = AnonymousClass0803.LIZJ(Class.forName("com.bytedance.ttnet.TTNetInit").newInstance());
            anonymousClass0806LIZJ.LIZ("getAppSecurityLevel");
            return ((Integer) anonymousClass0806LIZJ.get()).intValue();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        }
    }

    public static e getCronetEngine() {
        if (sCronetEngine != null) {
            return sCronetEngine;
        }
        throw new NullPointerException("Cronet engine is null.");
    }

    public static boolean getListenAppStateIndependently() {
        try {
            if (C1494230ozF.LJIL) {
                return TTNetInit.getListenAppStateIndependently();
            }
            AnonymousClass0806 anonymousClass0806LIZJ = AnonymousClass0803.LIZJ(Class.forName("com.bytedance.ttnet.TTNetInit").newInstance());
            anonymousClass0806LIZJ.LIZ("getListenAppStateIndependently");
            return ((Boolean) anonymousClass0806LIZJ.get()).booleanValue();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static long getMaxHttpDiskCacheSize() {
        try {
            if (C1494230ozF.LJIL) {
                return TTNetInit.getMaxHttpDiskCacheSize();
            }
            AnonymousClass0806 anonymousClass0806LIZJ = AnonymousClass0803.LIZJ(Class.forName("com.bytedance.ttnet.TTNetInit").newInstance());
            anonymousClass0806LIZJ.LIZ("getMaxHttpDiskCacheSize");
            return ((Long) anonymousClass0806LIZJ.get()).longValue();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 67108864L;
        }
    }

    public static InterfaceC1497120p3u getThreadConfigCallbackImpl() {
        try {
            if (C1494230ozF.LJIL) {
                return TTNetInit.getThreadConfigCallbackImpl();
            }
            AnonymousClass0806 anonymousClass0806LIZJ = AnonymousClass0803.LIZJ(Class.forName("com.bytedance.ttnet.TTNetInit").newInstance());
            anonymousClass0806LIZJ.LIZ("getThreadConfigCallbackImpl");
            return (InterfaceC1497120p3u) anonymousClass0806LIZJ.get();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static ArrayList<C1493680oyM> getThreadConfigInfoList() {
        try {
            if (C1494230ozF.LJIL) {
                return (ArrayList) TTNetInit.getThreadConfigInfoList();
            }
            AnonymousClass0806 anonymousClass0806LIZJ = AnonymousClass0803.LIZJ(Class.forName("com.bytedance.ttnet.TTNetInit").newInstance());
            anonymousClass0806LIZJ.LIZ("getThreadConfigInfoList");
            return (ArrayList) anonymousClass0806LIZJ.get();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public int getEffectiveConnectionType() {
        if (sCronetEngine instanceof i) {
            return ((i) sCronetEngine).LJIILLIIL();
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public int getEffectiveHttpRttMs() {
        if (sCronetEngine instanceof i) {
            return ((i) sCronetEngine).LJIIZILJ();
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public int getEffectiveRxThroughputKbps() {
        if (sCronetEngine instanceof i) {
            return ((i) sCronetEngine).LJIJ();
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public int getEffectiveTransportRttMs() {
        if (sCronetEngine instanceof i) {
            return ((i) sCronetEngine).LJIJI();
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public Map<String, C1497140p3w> getGroupRttEstimates() {
        if (!(sCronetEngine instanceof i)) {
            throw new UnsupportedOperationException("CronetEngine has not been initialized.");
        }
        i iVar = (i) sCronetEngine;
        HashMap map = new HashMap();
        for (Map.Entry<String, int[]> entry : iVar.LJIJJ().entrySet()) {
            if (entry.getValue().length != 2) {
                throw new UnknownFormatConversionException("getGroupRttEstimates returns wrong format");
            }
            C1497140p3w c1497140p3w = new C1497140p3w();
            c1497140p3w.LIZ = entry.getValue()[0];
            c1497140p3w.LIZIZ = entry.getValue()[1];
            c1497140p3w.LIZJ = -1;
            map.put(entry.getKey(), c1497140p3w);
        }
        return map;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public C1497140p3w getNetworkQuality() {
        if (!(sCronetEngine instanceof i)) {
            throw new UnsupportedOperationException("CronetEngine has not been initialized.");
        }
        i iVar = (i) sCronetEngine;
        C1497140p3w c1497140p3w = new C1497140p3w();
        c1497140p3w.LIZ = iVar.LJJI();
        c1497140p3w.LIZIZ = iVar.LJIJJLI();
        c1497140p3w.LIZJ = iVar.LJIILL();
        return c1497140p3w;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public int getNetworkQualityLevel() {
        if (sCronetEngine instanceof i) {
            return ((i) sCronetEngine).LJIL();
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void setCookieInitCompleted() {
        if (!(sCronetEngine instanceof i)) {
            throw new UnsupportedOperationException("CronetEngine has not been initialized.");
        }
        ((i) sCronetEngine).LJJIJL();
    }

    public static String getDomainConfigByRegion() {
        String carrierRegion = CronetAppProviderManager.inst().getCarrierRegion();
        String sysRegion = CronetAppProviderManager.inst().getSysRegion();
        String region = CronetAppProviderManager.inst().getRegion();
        if (TextUtils.isEmpty(carrierRegion)) {
            carrierRegion = !TextUtils.isEmpty(sysRegion) ? sysRegion : region;
        }
        if (TextUtils.isEmpty(carrierRegion)) {
            return null;
        }
        try {
            if (C1494230ozF.LJIL) {
                return TTNetInit.getGetDomainConfigByRegion(carrierRegion);
            }
            AnonymousClass0806 anonymousClass0806LIZJ = AnonymousClass0803.LIZJ(Class.forName("com.bytedance.ttnet.TTNetInit").newInstance());
            anonymousClass0806LIZJ.LIZIZ("getGetDomainConfigByRegion", new Class[]{String.class}, carrierRegion);
            return (String) anonymousClass0806LIZJ.get();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void clearClientOpaqueData() {
        try {
            if (CronetDependManager.inst().loggerDebug()) {
                CronetDependManager.inst().loggerD("CronetClient", "clearClientOpaqueData start");
            }
            if (sCronetEngine instanceof i) {
                ((i) sCronetEngine).LJIIJJI();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void INVOKESTATIC_org_chromium_CronetClient_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }

    private TTAppInfoProvider.AppInfo convertToCronetAppInfo(C1492820owy c1492820owy) {
        TTAppInfoProvider.AppInfo appInfo = new TTAppInfoProvider.AppInfo();
        appInfo.LJFF = c1492820owy.LIZ;
        appInfo.LJI = c1492820owy.LIZIZ;
        appInfo.LJII = c1492820owy.LIZJ;
        appInfo.LJIIIIZZ = c1492820owy.LIZLLL;
        appInfo.LJIIIZ = c1492820owy.LJ;
        appInfo.LJIIJ = c1492820owy.LJFF;
        appInfo.LJIIJJI = c1492820owy.LJI;
        appInfo.LJIILL = c1492820owy.LJII;
        return appInfo;
    }

    public static TTSamplingSettingProvider$TTSlaSamplingSetting convertToCronetSlaSamplingSetting(C1494200ozC c1494200ozC) {
        TTSamplingSettingProvider$TTApiLogSamplingRule tTSamplingSettingProvider$TTApiLogSamplingRule;
        TTSamplingSettingProvider$TTEventLogSamplingRule tTSamplingSettingProvider$TTEventLogSamplingRule;
        if (c1494200ozC == null) {
            return null;
        }
        try {
            C1494270ozJ c1494270ozJ = c1494200ozC.LIZJ;
            if (c1494270ozJ != null) {
                tTSamplingSettingProvider$TTApiLogSamplingRule = new TTSamplingSettingProvider$TTApiLogSamplingRule();
                tTSamplingSettingProvider$TTApiLogSamplingRule.LIZ = c1494270ozJ.LIZ;
                tTSamplingSettingProvider$TTApiLogSamplingRule.LIZIZ = c1494270ozJ.LIZIZ;
                tTSamplingSettingProvider$TTApiLogSamplingRule.LIZJ = (String[]) c1494270ozJ.LJ.toArray(new String[0]);
                tTSamplingSettingProvider$TTApiLogSamplingRule.LIZLLL = (String[]) c1494270ozJ.LJFF.toArray(new String[0]);
            } else {
                tTSamplingSettingProvider$TTApiLogSamplingRule = null;
            }
            C08H5 c08h5 = c1494200ozC.LIZLLL;
            if (c08h5 != null) {
                tTSamplingSettingProvider$TTEventLogSamplingRule = new TTSamplingSettingProvider$TTEventLogSamplingRule();
                Set<String> set = c08h5.LIZ;
                if (set != null) {
                    tTSamplingSettingProvider$TTEventLogSamplingRule.LIZ = (String[]) set.toArray(new String[0]);
                }
            } else {
                tTSamplingSettingProvider$TTEventLogSamplingRule = null;
            }
            TTSamplingSettingProvider$TTSlaSamplingSetting tTSamplingSettingProvider$TTSlaSamplingSetting = new TTSamplingSettingProvider$TTSlaSamplingSetting();
            tTSamplingSettingProvider$TTSlaSamplingSetting.LIZ = c1494200ozC.LIZ;
            tTSamplingSettingProvider$TTSlaSamplingSetting.LIZIZ = c1494200ozC.LIZIZ;
            tTSamplingSettingProvider$TTSlaSamplingSetting.LIZJ = tTSamplingSettingProvider$TTApiLogSamplingRule;
            tTSamplingSettingProvider$TTSlaSamplingSetting.LIZLLL = tTSamplingSettingProvider$TTEventLogSamplingRule;
            return tTSamplingSettingProvider$TTSlaSamplingSetting;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    private String getProxyConfig(String str) {
        BufferedReader bufferedReader;
        IOException e;
        String strOptString = "";
        if (!TextUtils.isEmpty(str)) {
            BufferedReader bufferedReader2 = null;
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append("ttnet_config.json");
                C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
                if (c0vsj.exists()) {
                    bufferedReader = new BufferedReader(new C0VSF(c0vsj));
                    try {
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            sb.append(line);
                            TryCatchGuardChecker.doCheck(e);
                        }
                        strOptString = new JSONObject(sb.toString()).optString("ttnet_proxy", "");
                        bufferedReader2 = bufferedReader;
                    } catch (Throwable th) {
                        th = th;
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                    return strOptString;
                                } catch (IOException e2) {
                                    e = e2;
                                }
                            }
                            return strOptString;
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                    throw th2;
                                } catch (IOException e3) {
                                    TryCatchGuardChecker.doCheck(e3);
                                    throw th2;
                                }
                            }
                            throw th2;
                        }
                    }
                }
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                        return strOptString;
                    } catch (IOException e4) {
                        e = e4;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
            }
        }
        return strOptString;
    }

    public static void setNetworkThreadPriority(int i) {
        sNetworkThreadPriority = i;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void bindBigCore(EnumC1497190p41 enumC1497190p41) {
        if (sCronetEngine instanceof i) {
            ((i) sCronetEngine).LJIIIZ(enumC1497190p41.ordinal());
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void bindLittleCore(EnumC1497190p41 enumC1497190p41) {
        if (sCronetEngine instanceof i) {
            ((i) sCronetEngine).LJIIJ(enumC1497190p41.ordinal());
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    public InterfaceC1498450p63 convertToCronetThreadConfigCallback(final InterfaceC1497120p3u interfaceC1497120p3u) {
        if (interfaceC1497120p3u == null) {
            return null;
        }
        return new InterfaceC1498450p63() { // from class: org.chromium.CronetClient.2
            @Override // X.InterfaceC1498450p63
            public void bindBigCore(int i) {
                interfaceC1497120p3u.LIZ();
            }

            @Override // X.InterfaceC1498450p63
            public void bindLittleCore(int i) {
                interfaceC1497120p3u.LIZIZ();
            }

            @Override // X.InterfaceC1498450p63
            public void resetCoreBind(int i) {
                interfaceC1497120p3u.LIZJ();
            }
        };
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public int getCronetInternalErrorCode(HttpURLConnection httpURLConnection) {
        try {
            if (!(httpURLConnection instanceof CronetHttpURLConnection)) {
                return 0;
            }
            IOException iOException = ((CronetHttpURLConnection) httpURLConnection).LJIIJJI;
            if (iOException instanceof AbstractC1497710p4r) {
                return ((AbstractC1497710p4r) iOException).getCronetInternalErrorCode();
            }
            if (!(iOException instanceof com.ttnet.org.chromium.net.urlconnection.i)) {
                return 0;
            }
            return ((com.ttnet.org.chromium.net.urlconnection.i) iOException).getCronetInternalErrorCode();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return 0;
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void getMappingRequestState(final String str) {
        CronetUrlRequest cronetUrlRequest;
        try {
            if (!TextUtils.isEmpty(str) && (cronetUrlRequest = (CronetUrlRequest) ((ConcurrentHashMap) C740700T3s.LIZ).get(str)) != null) {
                cronetUrlRequest.LJJIIJ(new o0.c() { // from class: org.chromium.CronetClient.5
                    @Override // com.ttnet.org.chromium.net.o0.c
                    public void onStatus(int i) {
                        CronetEventListener.inst().onMappingRequestStatus(str, i);
                    }
                });
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public C1497130p3v getPacketLossRateMetrics(int i) {
        if (sCronetEngine instanceof i) {
            C1497130p3v c1497130p3v = new C1497130p3v();
            i iVar = (i) sCronetEngine;
            c1497130p3v.LIZ = iVar.LJJIFFI(i);
            iVar.LJJII(i);
            c1497130p3v.LIZIZ = iVar.LJIILIIL(i);
            iVar.LJIILJJIL(i);
            return c1497130p3v;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public boolean isCronetHttpURLConnection(HttpURLConnection httpURLConnection) {
        return httpURLConnection instanceof CronetHttpURLConnection;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void removeClientOpaqueData(String str) {
        try {
            if (CronetDependManager.inst().loggerDebug()) {
                CronetDependManager.inst().loggerD("CronetClient", "removeClientOpaqueData start");
            }
            if (sCronetEngine instanceof i) {
                ((i) sCronetEngine).LJJIIZ(str);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void reportNetDiagnosisUserLog(String str) {
        if (sCronetEngine instanceof i) {
            ((i) sCronetEngine).LJJIIZI(str);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void resetCoreBind(EnumC1497190p41 enumC1497190p41) {
        if (sCronetEngine instanceof i) {
            ((i) sCronetEngine).LJJIJ(enumC1497190p41.ordinal());
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void runInBackGround(boolean z) {
        try {
            if (CronetDependManager.inst().loggerDebug()) {
                CronetDependManager.inst().loggerD("CronetClient", "runInBackGround start");
            }
            if (sCronetEngine instanceof i) {
                ((i) sCronetEngine).LJJIJIIJI(z);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void setAlogFuncAddr(long j) {
        if (sCronetEngine instanceof i) {
            ((i) sCronetEngine).LJJIJIIJIL(j);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void setAppStartUpState(int i) {
        if (sCronetEngine instanceof i) {
            ((i) sCronetEngine).LJJIJIL(i);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void setCronetBootFailureCheckerProvider(ICronetClient.ICronetBootFailureCheckerProvider iCronetBootFailureCheckerProvider) {
        sCronetBootFailureCheckerProvider = iCronetBootFailureCheckerProvider;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void setCronetThreadStackOptFailureCheckerProvider(ICronetClient.ICronetThreadStackOptFailureCheckerProvider iCronetThreadStackOptFailureCheckerProvider) {
        sCronetThreadStackOptFailureCheckerProvider = iCronetThreadStackOptFailureCheckerProvider;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void setHostResolverRules(String str) {
        if (sCronetEngine instanceof i) {
            ((i) sCronetEngine).LJJIJLIJ(str);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void setOecCallbackAddress(long j) {
        sOecCallbackAddress = j;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void setProxy(String str) {
        if (sCronetEngine instanceof i) {
            ((i) sCronetEngine).LJJIL(str);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void setSlaSamplingSetting(C1494200ozC c1494200ozC) {
        if (sCronetEngine instanceof i) {
            TTSamplingSettingProvider$TTSlaSamplingSetting tTSamplingSettingProvider$TTSlaSamplingSettingConvertToCronetSlaSamplingSetting = convertToCronetSlaSamplingSetting(c1494200ozC);
            if (tTSamplingSettingProvider$TTSlaSamplingSettingConvertToCronetSlaSamplingSetting == null) {
                return;
            }
            ((i) sCronetEngine).LJIIIIZZ(tTSamplingSettingProvider$TTSlaSamplingSettingConvertToCronetSlaSamplingSetting);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void triggerGetDomain(boolean z) {
        try {
            if (CronetDependManager.inst().loggerDebug()) {
                CronetDependManager.inst().loggerD("CronetClient", "triggerGetDomain start");
            }
            if (sCronetEngine instanceof i) {
                ((i) sCronetEngine).LJJJJ(z);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    private void detectCronetColdStartCrash(final Context context, C1497360p4I c1497360p4I) {
        SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(context, 0, "ss_app_config");
        int i = sharedPreferencesLIZJ.getInt("crash_limit_times", 0);
        this.mCrashLimitTimes = i;
        if (i <= 0) {
            int i2 = sharedPreferencesLIZJ.getInt("ttnet_crash_times", 0);
            this.mTTNetCrashTimes = i2;
            if (i2 > 0) {
                SharedPreferences.Editor editorEdit = sharedPreferencesLIZJ.edit();
                editorEdit.putInt("ttnet_crash_times", 0);
                editorEdit.apply();
                return;
            }
            return;
        }
        this.mTTNetCrashTimes = sharedPreferencesLIZJ.getInt("ttnet_crash_times", 0);
        int i3 = sharedPreferencesLIZJ.getInt("crash_detect_interval_ms", 5000);
        this.mCrashDetectTimerInterval = i3;
        if (i3 <= 0) {
            this.mCrashDetectTimerInterval = 5000;
        }
        if (C1496600p34.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("processname is ");
            sbLIZ.append(C2104008Mc.LIZ(context));
            sbLIZ.append(" count is ");
            sbLIZ.append(this.mTTNetCrashTimes);
            sbLIZ.append(" limit is ");
            sbLIZ.append(this.mCrashLimitTimes);
            sbLIZ.append(" interval is ");
            sbLIZ.append(this.mCrashDetectTimerInterval);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        if (this.mTTNetCrashTimes >= this.mCrashLimitTimes) {
            if (C1496600p34.LIZ()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("processname is ");
                sbLIZ2.append(C2104008Mc.LIZ(context));
                sbLIZ2.append("set secure mode true");
                C2188811AlT.LIZIZ(sbLIZ2);
            }
            c1497360p4I.LIZ.LJIIIZ();
        }
        if (!C2104008Mc.LIZJ(context)) {
            return;
        }
        final SharedPreferences.Editor editorEdit2 = sharedPreferencesLIZJ.edit();
        int i4 = this.mTTNetCrashTimes + 1;
        this.mTTNetCrashTimes = i4;
        editorEdit2.putInt("ttnet_crash_times", i4);
        editorEdit2.commit();
        if (C1496600p34.LIZ()) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("processname is ");
            sbLIZ3.append(C2104008Mc.LIZ(context));
            sbLIZ3.append(" save count ");
            sbLIZ3.append(this.mTTNetCrashTimes);
            C2188811AlT.LIZIZ(sbLIZ3);
        }
        C1490010osR.LIZ(EnumC1490030osT.NETWORK).LIZIZ(new AbstractRunnableC1490020osS(this.mCrashDetectTimerInterval, 0L) { // from class: org.chromium.CronetClient.1
            @Override // java.lang.Runnable
            public void run() {
                org_chromium_CronetClient$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void org_chromium_CronetClient$1__run$___twin___() {
                if (C1496600p34.LIZ()) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("processname is ");
                    sbLIZ4.append(C2104008Mc.LIZ(context));
                    sbLIZ4.append(" clear count ");
                    C2188811AlT.LIZIZ(sbLIZ4);
                }
                editorEdit2.putInt("ttnet_crash_times", 0);
                editorEdit2.apply();
            }

            public static void org_chromium_CronetClient$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                try {
                    anonymousClass1.org_chromium_CronetClient$1__run$___twin___();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        });
    }

    public ArrayList<TTThreadConfigInfoProvider$ThreadConfigInfo> convertToCronetThreadConfigInfoList(ArrayList<C1493680oyM> arrayList, boolean z) {
        boolean z2;
        if (arrayList != null) {
            try {
                if (!arrayList.isEmpty()) {
                    ArrayList<TTThreadConfigInfoProvider$ThreadConfigInfo> arrayList2 = new ArrayList<>();
                    EnumSet enumSetNoneOf = EnumSet.noneOf(EnumC1497190p41.class);
                    Iterator<C1493680oyM> it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        int i = it2.next().LIZ;
                        if (i < -20 || i > 19) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (z2 && !enumSetNoneOf.contains(null)) {
                            new Object() { // from class: com.ttnet.org.chromium.net.TTThreadConfigInfoProvider$ThreadConfigInfo
                                public int LIZ = 20;

                                public int getThreadStackSize() {
                                    return 0;
                                }

                                public int getThreadPriority() {
                                    return this.LIZ;
                                }

                                public int getThreadType() {
                                    throw null;
                                }
                            };
                            EnumC1497200p42.values();
                            throw null;
                        }
                    }
                    return arrayList2;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return null;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void preconnectUrl(String str, Map<String, String> map) {
        if (sCronetEngine instanceof i) {
            ((i) sCronetEngine).LJJIIJZLJL(str, map);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void setBestHostWithRouteSelectionName(String str, String str2) {
        if (sCronetEngine instanceof i) {
            ((i) sCronetEngine).LJJIZ(str, str2);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void stopThrottle(String[] strArr, int i) {
        if (sCronetEngine instanceof i) {
            ((i) sCronetEngine).LJJJIL(strArr, i);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void startThrottle(String[] strArr, int i, long j) {
        if (sCronetEngine instanceof i) {
            ((i) sCronetEngine).LJJJI(strArr, i, j);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void tryStartNetDetect(String[] strArr, int i, int i2) {
        if (sCronetEngine instanceof i) {
            ((i) sCronetEngine).LJJJJI(strArr, i, i2);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public C1276320jJm ttUrlDispatch(String str, int i, boolean z) throws URISyntaxException {
        if (sCronetEngine instanceof i) {
            Map mapLJJJJJ = ((i) sCronetEngine).LJJJJJ(i, str, z);
            String str2 = (String) mapLJJJJJ.get("final_url");
            if (!TextUtils.isEmpty(str2)) {
                new URL(str2).toURI();
                return new C1276320jJm(str, str2, (String) mapLJJJJJ.get("epoch"), (String) mapLJJJJJ.get("etag"), EnumC1493270oxh.SUCCESS, (String) mapLJJJJJ.get("ttnet_origin_host"));
            }
            throw new UnknownFormatConversionException("ttUrlDispatch returns wrong format");
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void ttDnsResolve(String str, int i, String str2, Map<String, String> map) {
        if (sCronetEngine instanceof i) {
            ((i) sCronetEngine).LJJJJIZL(str, i, str2, map);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void addClientOpaqueData(String[] strArr, byte[] bArr, byte[] bArr2, long j, long j2) {
        try {
            if (CronetDependManager.inst().loggerDebug()) {
                CronetDependManager.inst().loggerD("CronetClient", "addClientOpaqueData start");
            }
            if (sCronetEngine instanceof i) {
                ((i) sCronetEngine).LJII(strArr, bArr, bArr2, j, j2);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void enableTTBizHttpDns(boolean z, String str, String str2, String str3, boolean z2, String str4) {
        if (sCronetEngine instanceof i) {
            ((i) sCronetEngine).LJIIL(z, str, str2, str3, z2, str4);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void notifyTNCConfigUpdated(String str, String str2, String str3, String str4, String str5, String str6) {
        if (sCronetEngine instanceof i) {
            ((i) sCronetEngine).LJJIIJ(str, str2, str3, str4, str5, str6);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public HttpURLConnection openConnection(Context context, String str, boolean z, String str2, C1494600ozq c1494600ozq, ICronetAppProvider iCronetAppProvider) throws IOException {
        try {
            if (C1497080p3q.LJ().LIZ == EnumC1493300oxk.NONE) {
                C1497080p3q.LJ().LIZ = EnumC1493300oxk.LAZY_INIT;
            }
            tryCreateCronetEngine(context, false, false, false, z, str2, false, iCronetAppProvider);
            CronetHttpURLConnection cronetHttpURLConnection = (CronetHttpURLConnection) sCronetEngine.LJ(new URL(str), Proxy.NO_PROXY, c1494600ozq.LIZ);
            cronetHttpURLConnection.LJJ = new TTCronetRequestFinishedInfoListener(c1494600ozq);
            return cronetHttpURLConnection;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!(th instanceof MalformedURLException)) {
                if ((th instanceof UnsupportedOperationException) && th.getMessage() != null && th.getMessage().contains("Unexpected protocol")) {
                    throw new IOException("MalformedURLException", th);
                }
                throw new IOException(th);
            }
            throw th;
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void setZstdFuncAddr(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        if (sCronetEngine instanceof i) {
            ((i) sCronetEngine).LJJJ(j, j2, j3, j4, j5, j6, j7, j8);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(54:16|(1:21)(1:20)|22|(1:24)(1:26)|25|172|27|30|(1:32)|33|174|34|37|(1:41)|42|(1:44)|45|(1:47)|48|(1:50)|51|(1:53)|54|(1:56)|(1:58)|59|(1:61)|62|(1:64)|65|(1:67)|68|(1:72)|73|(1:77)|78|(3:82|(2:85|83)|183)|86|(1:88)|89|(2:91|(1:93))|94|(1:96)(2:106|(5:180|108|(1:110)|111|(1:113)(9:117|(1:119)|103|(1:105)|176|120|(1:122)|125|(10:130|(1:132)|133|(1:135)|136|(1:138)(1:139)|140|(1:142)(1:146)|143|(8:145|178|147|(1:149)|150|(1:153)|154|(3:158|(1:160)|161)))(10:127|(3:129|130|(0))|133|(0)|136|(0)(0)|140|(0)(0)|143|(0))))(0))|97|(1:99)|100|(1:102)|103|(0)|176|120|(0)|125|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x03ec, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x03ed, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0395 A[Catch: all -> 0x04cf, TryCatch #5 {all -> 0x04cf, blocks: (B:6:0x0007, B:8:0x000d, B:10:0x0023, B:12:0x0027, B:14:0x002d, B:15:0x0034, B:16:0x0035, B:18:0x0044, B:22:0x004d, B:24:0x006b, B:25:0x006f, B:27:0x00c4, B:30:0x00d3, B:32:0x0129, B:33:0x012e, B:37:0x018c, B:39:0x0192, B:41:0x0198, B:42:0x019f, B:44:0x01a5, B:45:0x01aa, B:47:0x01b4, B:48:0x01b9, B:50:0x01c3, B:51:0x01c9, B:53:0x01d3, B:54:0x01d9, B:56:0x020d, B:58:0x0220, B:59:0x0229, B:61:0x0256, B:62:0x0270, B:64:0x027a, B:65:0x0282, B:67:0x0288, B:68:0x028d, B:70:0x0297, B:72:0x029d, B:73:0x02a2, B:75:0x02ac, B:77:0x02b2, B:78:0x02b7, B:80:0x02c1, B:82:0x02c7, B:83:0x02cf, B:85:0x02d5, B:86:0x0303, B:88:0x030d, B:89:0x0317, B:91:0x0325, B:93:0x033f, B:94:0x0356, B:96:0x0360, B:97:0x0365, B:99:0x0373, B:100:0x0378, B:102:0x0382, B:103:0x0387, B:105:0x0395, B:120:0x03de, B:122:0x03e6, B:125:0x03f0, B:127:0x0400, B:129:0x0404, B:133:0x0411, B:135:0x041d, B:136:0x0422, B:140:0x042c, B:142:0x0464, B:143:0x0466, B:145:0x046c, B:163:0x04b8, B:146:0x0471, B:139:0x0428, B:132:0x040c, B:124:0x03ed, B:106:0x039b, B:117:0x03d2, B:119:0x03d8, B:115:0x03cd, B:36:0x0183, B:29:0x00d0, B:164:0x04bb, B:165:0x04cd, B:34:0x014a, B:147:0x0475, B:149:0x047d, B:150:0x0480, B:153:0x0488, B:154:0x048b, B:156:0x0498, B:158:0x049e, B:160:0x04ad, B:161:0x04b0, B:108:0x03a5, B:110:0x03b8, B:111:0x03bd, B:113:0x03c6), top: B:182:0x0007, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03d2 A[Catch: all -> 0x04cf, TryCatch #5 {all -> 0x04cf, blocks: (B:6:0x0007, B:8:0x000d, B:10:0x0023, B:12:0x0027, B:14:0x002d, B:15:0x0034, B:16:0x0035, B:18:0x0044, B:22:0x004d, B:24:0x006b, B:25:0x006f, B:27:0x00c4, B:30:0x00d3, B:32:0x0129, B:33:0x012e, B:37:0x018c, B:39:0x0192, B:41:0x0198, B:42:0x019f, B:44:0x01a5, B:45:0x01aa, B:47:0x01b4, B:48:0x01b9, B:50:0x01c3, B:51:0x01c9, B:53:0x01d3, B:54:0x01d9, B:56:0x020d, B:58:0x0220, B:59:0x0229, B:61:0x0256, B:62:0x0270, B:64:0x027a, B:65:0x0282, B:67:0x0288, B:68:0x028d, B:70:0x0297, B:72:0x029d, B:73:0x02a2, B:75:0x02ac, B:77:0x02b2, B:78:0x02b7, B:80:0x02c1, B:82:0x02c7, B:83:0x02cf, B:85:0x02d5, B:86:0x0303, B:88:0x030d, B:89:0x0317, B:91:0x0325, B:93:0x033f, B:94:0x0356, B:96:0x0360, B:97:0x0365, B:99:0x0373, B:100:0x0378, B:102:0x0382, B:103:0x0387, B:105:0x0395, B:120:0x03de, B:122:0x03e6, B:125:0x03f0, B:127:0x0400, B:129:0x0404, B:133:0x0411, B:135:0x041d, B:136:0x0422, B:140:0x042c, B:142:0x0464, B:143:0x0466, B:145:0x046c, B:163:0x04b8, B:146:0x0471, B:139:0x0428, B:132:0x040c, B:124:0x03ed, B:106:0x039b, B:117:0x03d2, B:119:0x03d8, B:115:0x03cd, B:36:0x0183, B:29:0x00d0, B:164:0x04bb, B:165:0x04cd, B:34:0x014a, B:147:0x0475, B:149:0x047d, B:150:0x0480, B:153:0x0488, B:154:0x048b, B:156:0x0498, B:158:0x049e, B:160:0x04ad, B:161:0x04b0, B:108:0x03a5, B:110:0x03b8, B:111:0x03bd, B:113:0x03c6), top: B:182:0x0007, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03e6 A[Catch: Exception -> 0x03ec, all -> 0x04cf, TRY_LEAVE, TryCatch #2 {Exception -> 0x03ec, blocks: (B:120:0x03de, B:122:0x03e6), top: B:176:0x03de, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0400 A[Catch: all -> 0x04cf, TryCatch #5 {all -> 0x04cf, blocks: (B:6:0x0007, B:8:0x000d, B:10:0x0023, B:12:0x0027, B:14:0x002d, B:15:0x0034, B:16:0x0035, B:18:0x0044, B:22:0x004d, B:24:0x006b, B:25:0x006f, B:27:0x00c4, B:30:0x00d3, B:32:0x0129, B:33:0x012e, B:37:0x018c, B:39:0x0192, B:41:0x0198, B:42:0x019f, B:44:0x01a5, B:45:0x01aa, B:47:0x01b4, B:48:0x01b9, B:50:0x01c3, B:51:0x01c9, B:53:0x01d3, B:54:0x01d9, B:56:0x020d, B:58:0x0220, B:59:0x0229, B:61:0x0256, B:62:0x0270, B:64:0x027a, B:65:0x0282, B:67:0x0288, B:68:0x028d, B:70:0x0297, B:72:0x029d, B:73:0x02a2, B:75:0x02ac, B:77:0x02b2, B:78:0x02b7, B:80:0x02c1, B:82:0x02c7, B:83:0x02cf, B:85:0x02d5, B:86:0x0303, B:88:0x030d, B:89:0x0317, B:91:0x0325, B:93:0x033f, B:94:0x0356, B:96:0x0360, B:97:0x0365, B:99:0x0373, B:100:0x0378, B:102:0x0382, B:103:0x0387, B:105:0x0395, B:120:0x03de, B:122:0x03e6, B:125:0x03f0, B:127:0x0400, B:129:0x0404, B:133:0x0411, B:135:0x041d, B:136:0x0422, B:140:0x042c, B:142:0x0464, B:143:0x0466, B:145:0x046c, B:163:0x04b8, B:146:0x0471, B:139:0x0428, B:132:0x040c, B:124:0x03ed, B:106:0x039b, B:117:0x03d2, B:119:0x03d8, B:115:0x03cd, B:36:0x0183, B:29:0x00d0, B:164:0x04bb, B:165:0x04cd, B:34:0x014a, B:147:0x0475, B:149:0x047d, B:150:0x0480, B:153:0x0488, B:154:0x048b, B:156:0x0498, B:158:0x049e, B:160:0x04ad, B:161:0x04b0, B:108:0x03a5, B:110:0x03b8, B:111:0x03bd, B:113:0x03c6), top: B:182:0x0007, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0408 A[PHI: r0
      0x0408: PHI (r0v85 long) = (r0v84 long), (r0v110 long) binds: [B:126:0x03fe, B:129:0x0404] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x040c A[Catch: all -> 0x04cf, TryCatch #5 {all -> 0x04cf, blocks: (B:6:0x0007, B:8:0x000d, B:10:0x0023, B:12:0x0027, B:14:0x002d, B:15:0x0034, B:16:0x0035, B:18:0x0044, B:22:0x004d, B:24:0x006b, B:25:0x006f, B:27:0x00c4, B:30:0x00d3, B:32:0x0129, B:33:0x012e, B:37:0x018c, B:39:0x0192, B:41:0x0198, B:42:0x019f, B:44:0x01a5, B:45:0x01aa, B:47:0x01b4, B:48:0x01b9, B:50:0x01c3, B:51:0x01c9, B:53:0x01d3, B:54:0x01d9, B:56:0x020d, B:58:0x0220, B:59:0x0229, B:61:0x0256, B:62:0x0270, B:64:0x027a, B:65:0x0282, B:67:0x0288, B:68:0x028d, B:70:0x0297, B:72:0x029d, B:73:0x02a2, B:75:0x02ac, B:77:0x02b2, B:78:0x02b7, B:80:0x02c1, B:82:0x02c7, B:83:0x02cf, B:85:0x02d5, B:86:0x0303, B:88:0x030d, B:89:0x0317, B:91:0x0325, B:93:0x033f, B:94:0x0356, B:96:0x0360, B:97:0x0365, B:99:0x0373, B:100:0x0378, B:102:0x0382, B:103:0x0387, B:105:0x0395, B:120:0x03de, B:122:0x03e6, B:125:0x03f0, B:127:0x0400, B:129:0x0404, B:133:0x0411, B:135:0x041d, B:136:0x0422, B:140:0x042c, B:142:0x0464, B:143:0x0466, B:145:0x046c, B:163:0x04b8, B:146:0x0471, B:139:0x0428, B:132:0x040c, B:124:0x03ed, B:106:0x039b, B:117:0x03d2, B:119:0x03d8, B:115:0x03cd, B:36:0x0183, B:29:0x00d0, B:164:0x04bb, B:165:0x04cd, B:34:0x014a, B:147:0x0475, B:149:0x047d, B:150:0x0480, B:153:0x0488, B:154:0x048b, B:156:0x0498, B:158:0x049e, B:160:0x04ad, B:161:0x04b0, B:108:0x03a5, B:110:0x03b8, B:111:0x03bd, B:113:0x03c6), top: B:182:0x0007, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x041d A[Catch: all -> 0x04cf, TryCatch #5 {all -> 0x04cf, blocks: (B:6:0x0007, B:8:0x000d, B:10:0x0023, B:12:0x0027, B:14:0x002d, B:15:0x0034, B:16:0x0035, B:18:0x0044, B:22:0x004d, B:24:0x006b, B:25:0x006f, B:27:0x00c4, B:30:0x00d3, B:32:0x0129, B:33:0x012e, B:37:0x018c, B:39:0x0192, B:41:0x0198, B:42:0x019f, B:44:0x01a5, B:45:0x01aa, B:47:0x01b4, B:48:0x01b9, B:50:0x01c3, B:51:0x01c9, B:53:0x01d3, B:54:0x01d9, B:56:0x020d, B:58:0x0220, B:59:0x0229, B:61:0x0256, B:62:0x0270, B:64:0x027a, B:65:0x0282, B:67:0x0288, B:68:0x028d, B:70:0x0297, B:72:0x029d, B:73:0x02a2, B:75:0x02ac, B:77:0x02b2, B:78:0x02b7, B:80:0x02c1, B:82:0x02c7, B:83:0x02cf, B:85:0x02d5, B:86:0x0303, B:88:0x030d, B:89:0x0317, B:91:0x0325, B:93:0x033f, B:94:0x0356, B:96:0x0360, B:97:0x0365, B:99:0x0373, B:100:0x0378, B:102:0x0382, B:103:0x0387, B:105:0x0395, B:120:0x03de, B:122:0x03e6, B:125:0x03f0, B:127:0x0400, B:129:0x0404, B:133:0x0411, B:135:0x041d, B:136:0x0422, B:140:0x042c, B:142:0x0464, B:143:0x0466, B:145:0x046c, B:163:0x04b8, B:146:0x0471, B:139:0x0428, B:132:0x040c, B:124:0x03ed, B:106:0x039b, B:117:0x03d2, B:119:0x03d8, B:115:0x03cd, B:36:0x0183, B:29:0x00d0, B:164:0x04bb, B:165:0x04cd, B:34:0x014a, B:147:0x0475, B:149:0x047d, B:150:0x0480, B:153:0x0488, B:154:0x048b, B:156:0x0498, B:158:0x049e, B:160:0x04ad, B:161:0x04b0, B:108:0x03a5, B:110:0x03b8, B:111:0x03bd, B:113:0x03c6), top: B:182:0x0007, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0428 A[Catch: all -> 0x04cf, TryCatch #5 {all -> 0x04cf, blocks: (B:6:0x0007, B:8:0x000d, B:10:0x0023, B:12:0x0027, B:14:0x002d, B:15:0x0034, B:16:0x0035, B:18:0x0044, B:22:0x004d, B:24:0x006b, B:25:0x006f, B:27:0x00c4, B:30:0x00d3, B:32:0x0129, B:33:0x012e, B:37:0x018c, B:39:0x0192, B:41:0x0198, B:42:0x019f, B:44:0x01a5, B:45:0x01aa, B:47:0x01b4, B:48:0x01b9, B:50:0x01c3, B:51:0x01c9, B:53:0x01d3, B:54:0x01d9, B:56:0x020d, B:58:0x0220, B:59:0x0229, B:61:0x0256, B:62:0x0270, B:64:0x027a, B:65:0x0282, B:67:0x0288, B:68:0x028d, B:70:0x0297, B:72:0x029d, B:73:0x02a2, B:75:0x02ac, B:77:0x02b2, B:78:0x02b7, B:80:0x02c1, B:82:0x02c7, B:83:0x02cf, B:85:0x02d5, B:86:0x0303, B:88:0x030d, B:89:0x0317, B:91:0x0325, B:93:0x033f, B:94:0x0356, B:96:0x0360, B:97:0x0365, B:99:0x0373, B:100:0x0378, B:102:0x0382, B:103:0x0387, B:105:0x0395, B:120:0x03de, B:122:0x03e6, B:125:0x03f0, B:127:0x0400, B:129:0x0404, B:133:0x0411, B:135:0x041d, B:136:0x0422, B:140:0x042c, B:142:0x0464, B:143:0x0466, B:145:0x046c, B:163:0x04b8, B:146:0x0471, B:139:0x0428, B:132:0x040c, B:124:0x03ed, B:106:0x039b, B:117:0x03d2, B:119:0x03d8, B:115:0x03cd, B:36:0x0183, B:29:0x00d0, B:164:0x04bb, B:165:0x04cd, B:34:0x014a, B:147:0x0475, B:149:0x047d, B:150:0x0480, B:153:0x0488, B:154:0x048b, B:156:0x0498, B:158:0x049e, B:160:0x04ad, B:161:0x04b0, B:108:0x03a5, B:110:0x03b8, B:111:0x03bd, B:113:0x03c6), top: B:182:0x0007, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0464 A[Catch: all -> 0x04cf, TryCatch #5 {all -> 0x04cf, blocks: (B:6:0x0007, B:8:0x000d, B:10:0x0023, B:12:0x0027, B:14:0x002d, B:15:0x0034, B:16:0x0035, B:18:0x0044, B:22:0x004d, B:24:0x006b, B:25:0x006f, B:27:0x00c4, B:30:0x00d3, B:32:0x0129, B:33:0x012e, B:37:0x018c, B:39:0x0192, B:41:0x0198, B:42:0x019f, B:44:0x01a5, B:45:0x01aa, B:47:0x01b4, B:48:0x01b9, B:50:0x01c3, B:51:0x01c9, B:53:0x01d3, B:54:0x01d9, B:56:0x020d, B:58:0x0220, B:59:0x0229, B:61:0x0256, B:62:0x0270, B:64:0x027a, B:65:0x0282, B:67:0x0288, B:68:0x028d, B:70:0x0297, B:72:0x029d, B:73:0x02a2, B:75:0x02ac, B:77:0x02b2, B:78:0x02b7, B:80:0x02c1, B:82:0x02c7, B:83:0x02cf, B:85:0x02d5, B:86:0x0303, B:88:0x030d, B:89:0x0317, B:91:0x0325, B:93:0x033f, B:94:0x0356, B:96:0x0360, B:97:0x0365, B:99:0x0373, B:100:0x0378, B:102:0x0382, B:103:0x0387, B:105:0x0395, B:120:0x03de, B:122:0x03e6, B:125:0x03f0, B:127:0x0400, B:129:0x0404, B:133:0x0411, B:135:0x041d, B:136:0x0422, B:140:0x042c, B:142:0x0464, B:143:0x0466, B:145:0x046c, B:163:0x04b8, B:146:0x0471, B:139:0x0428, B:132:0x040c, B:124:0x03ed, B:106:0x039b, B:117:0x03d2, B:119:0x03d8, B:115:0x03cd, B:36:0x0183, B:29:0x00d0, B:164:0x04bb, B:165:0x04cd, B:34:0x014a, B:147:0x0475, B:149:0x047d, B:150:0x0480, B:153:0x0488, B:154:0x048b, B:156:0x0498, B:158:0x049e, B:160:0x04ad, B:161:0x04b0, B:108:0x03a5, B:110:0x03b8, B:111:0x03bd, B:113:0x03c6), top: B:182:0x0007, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x046c A[Catch: all -> 0x04cf, TryCatch #5 {all -> 0x04cf, blocks: (B:6:0x0007, B:8:0x000d, B:10:0x0023, B:12:0x0027, B:14:0x002d, B:15:0x0034, B:16:0x0035, B:18:0x0044, B:22:0x004d, B:24:0x006b, B:25:0x006f, B:27:0x00c4, B:30:0x00d3, B:32:0x0129, B:33:0x012e, B:37:0x018c, B:39:0x0192, B:41:0x0198, B:42:0x019f, B:44:0x01a5, B:45:0x01aa, B:47:0x01b4, B:48:0x01b9, B:50:0x01c3, B:51:0x01c9, B:53:0x01d3, B:54:0x01d9, B:56:0x020d, B:58:0x0220, B:59:0x0229, B:61:0x0256, B:62:0x0270, B:64:0x027a, B:65:0x0282, B:67:0x0288, B:68:0x028d, B:70:0x0297, B:72:0x029d, B:73:0x02a2, B:75:0x02ac, B:77:0x02b2, B:78:0x02b7, B:80:0x02c1, B:82:0x02c7, B:83:0x02cf, B:85:0x02d5, B:86:0x0303, B:88:0x030d, B:89:0x0317, B:91:0x0325, B:93:0x033f, B:94:0x0356, B:96:0x0360, B:97:0x0365, B:99:0x0373, B:100:0x0378, B:102:0x0382, B:103:0x0387, B:105:0x0395, B:120:0x03de, B:122:0x03e6, B:125:0x03f0, B:127:0x0400, B:129:0x0404, B:133:0x0411, B:135:0x041d, B:136:0x0422, B:140:0x042c, B:142:0x0464, B:143:0x0466, B:145:0x046c, B:163:0x04b8, B:146:0x0471, B:139:0x0428, B:132:0x040c, B:124:0x03ed, B:106:0x039b, B:117:0x03d2, B:119:0x03d8, B:115:0x03cd, B:36:0x0183, B:29:0x00d0, B:164:0x04bb, B:165:0x04cd, B:34:0x014a, B:147:0x0475, B:149:0x047d, B:150:0x0480, B:153:0x0488, B:154:0x048b, B:156:0x0498, B:158:0x049e, B:160:0x04ad, B:161:0x04b0, B:108:0x03a5, B:110:0x03b8, B:111:0x03bd, B:113:0x03c6), top: B:182:0x0007, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0471 A[Catch: all -> 0x04cf, TRY_LEAVE, TryCatch #5 {all -> 0x04cf, blocks: (B:6:0x0007, B:8:0x000d, B:10:0x0023, B:12:0x0027, B:14:0x002d, B:15:0x0034, B:16:0x0035, B:18:0x0044, B:22:0x004d, B:24:0x006b, B:25:0x006f, B:27:0x00c4, B:30:0x00d3, B:32:0x0129, B:33:0x012e, B:37:0x018c, B:39:0x0192, B:41:0x0198, B:42:0x019f, B:44:0x01a5, B:45:0x01aa, B:47:0x01b4, B:48:0x01b9, B:50:0x01c3, B:51:0x01c9, B:53:0x01d3, B:54:0x01d9, B:56:0x020d, B:58:0x0220, B:59:0x0229, B:61:0x0256, B:62:0x0270, B:64:0x027a, B:65:0x0282, B:67:0x0288, B:68:0x028d, B:70:0x0297, B:72:0x029d, B:73:0x02a2, B:75:0x02ac, B:77:0x02b2, B:78:0x02b7, B:80:0x02c1, B:82:0x02c7, B:83:0x02cf, B:85:0x02d5, B:86:0x0303, B:88:0x030d, B:89:0x0317, B:91:0x0325, B:93:0x033f, B:94:0x0356, B:96:0x0360, B:97:0x0365, B:99:0x0373, B:100:0x0378, B:102:0x0382, B:103:0x0387, B:105:0x0395, B:120:0x03de, B:122:0x03e6, B:125:0x03f0, B:127:0x0400, B:129:0x0404, B:133:0x0411, B:135:0x041d, B:136:0x0422, B:140:0x042c, B:142:0x0464, B:143:0x0466, B:145:0x046c, B:163:0x04b8, B:146:0x0471, B:139:0x0428, B:132:0x040c, B:124:0x03ed, B:106:0x039b, B:117:0x03d2, B:119:0x03d8, B:115:0x03cd, B:36:0x0183, B:29:0x00d0, B:164:0x04bb, B:165:0x04cd, B:34:0x014a, B:147:0x0475, B:149:0x047d, B:150:0x0480, B:153:0x0488, B:154:0x048b, B:156:0x0498, B:158:0x049e, B:160:0x04ad, B:161:0x04b0, B:108:0x03a5, B:110:0x03b8, B:111:0x03bd, B:113:0x03c6), top: B:182:0x0007, inners: #0, #1, #2, #3, #4 }] */
    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void tryCreateCronetEngine(android.content.Context r18, boolean r19, boolean r20, boolean r21, boolean r22, java.lang.String r23, boolean r24, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider r25) {
        /*
            Method dump skipped, instruction units count: 1238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.CronetClient.tryCreateCronetEngine(android.content.Context, boolean, boolean, boolean, boolean, java.lang.String, boolean, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider):void");
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void notifyStoreRegionUpdated(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        if (sCronetEngine instanceof i) {
            ((i) sCronetEngine).LJJJJJL(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }
}
