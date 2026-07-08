package com.bytedance.ttnet.cronet;

import X.AbstractC1493260oxg;
import X.C08XC;
import X.C0CN5;
import X.C0X2I;
import X.C12ES;
import X.C1492820owy;
import X.C1493400oxu;
import X.C1494230ozF;
import X.C2093608Ic;
import X.C2104008Mc;
import X.C2188811AlT;
import X.C285090BFj;
import X.C786410Ut5;
import X.RunnableC1492810owx;
import X.RunnableC823120WQs;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.Logger;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTMultiNetwork;
import com.bytedance.ttnet.TTNetInit;
import com.bytedance.ttnet.TTWiFiCellSwitcher;
import com.bytedance.ttnet.clientkey.ClientKeyManager;
import com.bytedance.ttnet.tnc.TNCManager;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public abstract class AbsCronetDependAdapter implements ICronetDepend, ICronetAppProvider {
    public void LIZ() {
    }

    public void LIZIZ(int i, int i2, int i3) {
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void doLoadLibrary(String str) {
    }

    public String getAbClient() {
        return "";
    }

    public String getAbFeature() {
        return "";
    }

    public String getAbFlag() {
        return "-1";
    }

    public List<String> getAbSdkVersion() {
        return null;
    }

    public String getAbVersion() {
        return "";
    }

    public String getAppId() {
        return "-1";
    }

    public String getAppInitialRegionInfo() {
        return "";
    }

    public String getAppName() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final long getAppStartTime() {
        return -1L;
    }

    public String getBypassBOEJSON() {
        return null;
    }

    public String getCarrierRegion() {
        return "";
    }

    public String getChannel() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getCityName() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final Map<String[], Pair<byte[], byte[]>> getClientOpaqueData() {
        return null;
    }

    public String getDeviceId() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getDevicePlatform() {
        return "android";
    }

    public String getGetDomainDefaultJSON() {
        return null;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getHttpDnsRequestFlags() {
        return CardStruct.IStatusCode.DEFAULT;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getIId() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getIsDropFirstTnc() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getLanguage() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final boolean getLazyInitCronetIPC() {
        return false;
    }

    public String getManifestVersionCode() {
        return "-1";
    }

    public ArrayList<byte[]> getOpaqueData() {
        return null;
    }

    public String getOpenUdid() {
        return "";
    }

    public boolean getOptInit() {
        return false;
    }

    public boolean getOptNqeDefault() {
        return false;
    }

    public boolean getOptNqePersist() {
        return false;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final Map<String, Pair<Integer, Integer>> getQuicHint() {
        return null;
    }

    public String getRegion() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getSdkAppId() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getSdkVersion() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend
    public final String getSsCookieKey() {
        return "X-SS-Cookie";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getSsmix() {
        return "a";
    }

    public String getStoreIdc() {
        return "";
    }

    public String getStoreIdcRuleJSON() {
        return null;
    }

    public String getSysRegion() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getTNCRequestFlags() {
        return CardStruct.IStatusCode.DEFAULT;
    }

    public Map<String, String> getTNCRequestHeader() {
        return null;
    }

    public String getUUID() {
        return "";
    }

    public String getUpdateVersionCode() {
        return "-1";
    }

    public String getUserId() {
        return "";
    }

    public String getVersionCode() {
        return "-1";
    }

    public String getVersionName() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final boolean isBOEProxyEnabled() {
        return false;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final boolean isEnableBrotli() {
        return false;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final boolean isEnableHttp2() {
        return true;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final boolean isEnableQuic() {
        return false;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend
    public final void loggerD(String str, String str2) {
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final boolean needCustomLoadLibrary() {
        return false;
    }

    public void onEffectiveConnectionTypeChanged(int i) {
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onNetworkQualityLevelChanged(int i) {
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onNetworkQualityRttAndThroughputNotified(int i, int i2, int i3) {
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onPacketLossComputed(int i, double d, double d2, double d3, double d4) {
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onRTTOrThroughputEstimatesComputed(int i, int i2, int i3) {
    }

    public void sendAppMonitorEvent(String str, String str2) {
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend
    public final void setAdapter(ICronetDepend iCronetDepend) {
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getAbi() {
        return Build.SUPPORTED_ABIS[0];
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final C1492820owy getAppInfoSubset() {
        C1492820owy c1492820owy = new C1492820owy();
        List<String> abSdkVersion = getAbSdkVersion();
        String strLIZIZ = "";
        if (abSdkVersion != null) {
            int i = 0;
            for (String str : abSdkVersion) {
                i++;
                if (i > 5) {
                    break;
                }
                if (!TextUtils.isEmpty(str)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(strLIZIZ);
                    sbLIZ.append(str);
                    sbLIZ.append(",");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
            }
        }
        c1492820owy.LIZ = strLIZIZ;
        String[] strArrLJ = TTNetInit.getTTNetDepend().LJ();
        if (strArrLJ != null) {
            if (strArrLJ.length > 0) {
                c1492820owy.LIZIZ = strArrLJ[0];
            }
            if (strArrLJ.length > 1) {
                c1492820owy.LIZJ = strArrLJ[1];
            }
            if (strArrLJ.length > 2) {
                c1492820owy.LIZLLL = strArrLJ[2];
            }
        }
        Map<String, String> mapLJIIIIZZ = TTNetInit.getTTNetDepend().LJIIIIZZ();
        String str2 = mapLJIIIIZZ.get("httpdns");
        if (str2 != null && !TextUtils.isEmpty(str2)) {
            c1492820owy.LJ = str2;
        }
        String str3 = mapLJIIIIZZ.get("boe");
        if (str3 != null && !TextUtils.isEmpty(str3)) {
            c1492820owy.LJFF = str3;
        }
        String str4 = mapLJIIIIZZ.get("boe_https");
        if (str4 != null && !TextUtils.isEmpty(str4)) {
            c1492820owy.LJI = str4;
        }
        c1492820owy.LJII = getAppInitialRegionInfo();
        return c1492820owy;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final Map<String, String> getGetDomainDependHostMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String[] strArrLJ = TTNetInit.getTTNetDepend().LJ();
        if (strArrLJ != null) {
            if (strArrLJ.length > 0) {
                linkedHashMap.put("first", strArrLJ[0]);
            }
            if (strArrLJ.length > 1) {
                linkedHashMap.put("second", strArrLJ[1]);
            }
            if (strArrLJ.length > 2) {
                linkedHashMap.put("third", strArrLJ[2]);
            }
        }
        Map<String, String> mapLJIIIIZZ = TTNetInit.getTTNetDepend().LJIIIIZZ();
        if (TextUtils.isEmpty(mapLJIIIIZZ.get("httpdns")) || (TextUtils.isEmpty(mapLJIIIIZZ.get("boe")) && TextUtils.isEmpty(mapLJIIIIZZ.get("boe_https")))) {
            throw new IllegalArgumentException("You must set HttpDns, NetLog and BOE service domain, please refer to TTNet access documents.");
        }
        linkedHashMap.putAll(mapLJIIIIZZ);
        return linkedHashMap;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getOSApi() {
        return String.valueOf(Build.VERSION.SDK_INT);
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getOSVersion() {
        try {
            String str = Build.VERSION.RELEASE;
            return (str == null || str.length() <= 10) ? str : str.substring(0, 10);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final int getProcessFlag() {
        return C2104008Mc.LIZ.get();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getCronetSoPath() {
        return C1493400oxu.LJIIJ(TTNetInit.getTTNetDepend().getContext()).LLJJIJI;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getDPI() {
        int iLJII = C12ES.LJII(TTNetInit.getTTNetDepend().getContext());
        return iLJII > 0 ? String.valueOf(iLJII) : "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getNetAccessType() {
        return C786410Ut5.b3(TTNetInit.getTTNetDepend().getContext());
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getNetworkOperator() {
        return TTNetInit.getSystemApiSandbox() == null ? "" : TTNetInit.getSystemApiSandbox().getNetworkOperator();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getResolution() {
        String strLJIIIZ = C12ES.LJIIIZ(TTNetInit.getTTNetDepend().getContext());
        return !C2093608Ic.LJ(strLJIIIZ) ? strLJIIIZ : "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getRticket() {
        return String.valueOf(System.currentTimeMillis());
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getSimOperator() {
        return TTNetInit.getSystemApiSandbox() == null ? "" : TTNetInit.getSystemApiSandbox().getSimOperator();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final Map<String, String> getTNCRequestQuery() {
        Object tTNetDepend = TTNetInit.getTTNetDepend();
        if (tTNetDepend == null || !(tTNetDepend instanceof AbstractC1493260oxg)) {
            return null;
        }
        return ((AbstractC1493260oxg) tTNetDepend).LJIJ();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final int getWifiFrequency() {
        if (TTNetInit.getSystemApiSandbox() == null) {
            return 0;
        }
        return TTNetInit.getSystemApiSandbox().getWifiFrequency();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final int getWifiRssi() {
        if (TTNetInit.getSystemApiSandbox() == null) {
            return 0;
        }
        return TTNetInit.getSystemApiSandbox().getWifiRssi();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend
    public boolean loggerDebug() {
        return Logger.debug();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onColdStartFinish() {
        Logger.debug();
        new RunnableC823120WQs() { // from class: X.0owq
            @Override // X.RunnableC823120WQs, java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("AbsCronetDependAdapter@1c7c.onColdStartFinish$1");
                try {
                    TTNetInit.notifyColdStartFinish();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("AbsCronetDependAdapter@1c7c.onColdStartFinish$1");
            }
        }.LIZ();
    }

    public void onCronetBootSucceed() {
        Logger.debug();
        new RunnableC823120WQs() { // from class: X.0owh
            @Override // X.RunnableC823120WQs, java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("AbsCronetDependAdapter@1c7c.onCronetBootSucceed$1");
                try {
                    C1493400oxu.LJIIJ(TTNetInit.getTTNetDepend().getContext()).LJIILL();
                    C1493430oxx.LIZLLL = true;
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("AbsCronetDependAdapter@1c7c.onCronetBootSucceed$1");
            }
        }.LIZ();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getDeviceBrand() {
        return Build.BRAND;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getDeviceModel() {
        return Build.MODEL;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getDeviceType() {
        return Build.MODEL;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onClientIPChanged(final String str) {
        Logger.debug();
        new RunnableC823120WQs() { // from class: X.0owo
            @Override // X.RunnableC823120WQs, java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("AbsCronetDependAdapter@1c7c.onClientIPChanged$1");
                try {
                    TTNetInit.onClientIPChanged(str);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("AbsCronetDependAdapter@1c7c.onClientIPChanged$1");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super((Object) null);
            }
        }.LIZ();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onEffectiveConnectionTypeChangedOnIOThread(final int i) {
        Logger.debug();
        new RunnableC823120WQs() { // from class: X.0owt
            @Override // X.RunnableC823120WQs, java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("AbsCronetDependAdapter@1c7c.onEffectiveConnectionTypeChangedOnIOThread$1");
                try {
                    this.LLILZLL.onEffectiveConnectionTypeChanged(i);
                    this.LLILZLL.getClass();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("AbsCronetDependAdapter@1c7c.onEffectiveConnectionTypeChangedOnIOThread$1");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super((Object) null);
            }
        }.LIZ();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onNetworkQualityLevelChangedOnIOThread(final int i) {
        Logger.debug();
        new RunnableC823120WQs() { // from class: X.0owr
            @Override // X.RunnableC823120WQs, java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("AbsCronetDependAdapter@1c7c.onNetworkQualityLevelChangedOnIOThread$1");
                try {
                    this.LLILZLL.onNetworkQualityLevelChanged(i);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("AbsCronetDependAdapter@1c7c.onNetworkQualityLevelChangedOnIOThread$1");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super((Object) null);
            }
        }.LIZ();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onServerConfigABTestChanged(final String str) {
        try {
            new RunnableC823120WQs() { // from class: X.0owi
                @Override // X.RunnableC823120WQs, java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("AbsCronetDependAdapter@1c7c.onServerConfigABTestChanged$1");
                    try {
                        C1493400oxu.LJIIJ(TTNetInit.getTTNetDepend().getContext()).LJIIZILJ(str);
                    } finally {
                        try {
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                    }
                    C1C7U.LIZIZ("AbsCronetDependAdapter@1c7c.onServerConfigABTestChanged$1");
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super((Object) null);
                }
            }.LIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onServerConfigEtagChanged(final String str) {
        try {
            new RunnableC823120WQs() { // from class: X.0owj
                @Override // X.RunnableC823120WQs, java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("AbsCronetDependAdapter@1c7c.onServerConfigEtagChanged$1");
                    try {
                        C1493400oxu.LJIIJ(TTNetInit.getTTNetDepend().getContext()).LLJJJIL = str;
                    } finally {
                        try {
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                    }
                    C1C7U.LIZIZ("AbsCronetDependAdapter@1c7c.onServerConfigEtagChanged$1");
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super((Object) null);
                }
            }.LIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public void onServerConfigUpdated(final String str) {
        if (((Boolean) C285090BFj.LJJL.getValue()).booleanValue() && !C0X2I.LLILLL) {
            C0CN5.LIZIZ(Long.valueOf(((Number) C285090BFj.LJJJZ.getValue()).longValue()), new C0X2I(this, str));
            return;
        }
        try {
            Logger.debug();
            new RunnableC823120WQs() { // from class: X.0owk
                @Override // X.RunnableC823120WQs, java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("AbsCronetDependAdapter@1c7c.onServerConfigUpdated$1");
                    try {
                        C1493400oxu c1493400oxuLJIIJ = C1493400oxu.LJIIJ(TTNetInit.getTTNetDepend().getContext());
                        String str2 = str;
                        c1493400oxuLJIIJ.getClass();
                        if (C1490280oss.LIZ(str2)) {
                            try {
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                            int i = c1493400oxuLJIIJ.LJIIL(str2, EnumC1492690owl.TTCRONET, System.currentTimeMillis(), false) ? 101 : 102;
                            try {
                                new JSONObject().put("from", "cronet");
                                TTNetInit.getTTNetDepend().LJIIIZ();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                            }
                            try {
                                c1493400oxuLJIIJ.handleConfigUpdate(str2);
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                            }
                            c1493400oxuLJIIJ.LLJJLIIIJLLLLLLLZ.sendEmptyMessage(i);
                        }
                        ClientKeyManager.LJI().LIZ(str);
                    } finally {
                        try {
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                    }
                    C1C7U.LIZIZ("AbsCronetDependAdapter@1c7c.onServerConfigUpdated$1");
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super((Object) null);
                }
            }.LIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onTTNetDetectInfoChanged(final String str) {
        Logger.debug();
        new RunnableC823120WQs(str) { // from class: X.0VvH
            @Override // X.RunnableC823120WQs, java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("AbsCronetDependAdapter@1c7c.onTTNetDetectInfoChanged$1");
                try {
                    this.LLILZIL.getClass();
                } finally {
                    try {
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                }
                C1C7U.LIZIZ("AbsCronetDependAdapter@1c7c.onTTNetDetectInfoChanged$1");
            }

            {
                super((Object) null);
            }
        }.LIZ();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onUserSpecifiedNetworkEnabled(final boolean z) {
        Logger.debug();
        new RunnableC823120WQs() { // from class: X.0ox2
            @Override // X.RunnableC823120WQs, java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("AbsCronetDependAdapter@1c7c.onUserSpecifiedNetworkEnabled$1");
                try {
                    AnonymousClass0803.LIZIZ(TTMultiNetwork.class).LIZIZ("notifyUserSpecifiedNetworkEnabled", new Class[]{Boolean.TYPE}, Boolean.valueOf(z));
                } finally {
                    try {
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                }
                C1C7U.LIZIZ("AbsCronetDependAdapter@1c7c.onUserSpecifiedNetworkEnabled$1");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super((Object) null);
            }
        }.LIZ();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final Map<String, String> onCallToAddSecurityFactor(String str, Map<String, String> map) {
        HashMap map2 = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(entry.getValue());
            map2.put(entry.getKey(), arrayList);
        }
        C08XC c08xc = C1494230ozF.LJIILJJIL;
        if (c08xc != null) {
            return c08xc.onCallToAddSecurityFactor(str, map2);
        }
        return null;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onDropReasonChanged(final boolean z, final List<Integer> list) {
        Logger.debug();
        new RunnableC823120WQs() { // from class: X.0VvG
            public final void LIZJ() {
                if (C813230VvF.LIZJ == null) {
                    synchronized (C813230VvF.class) {
                        try {
                            if (C813230VvF.LIZJ == null) {
                                C813230VvF.LIZJ = new C813230VvF();
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                C813230VvF.LIZJ.LIZ(z, list);
            }

            @Override // X.RunnableC823120WQs, java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("AbsCronetDependAdapter@1c7c.onDropReasonChanged$1");
                try {
                    LIZJ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("AbsCronetDependAdapter@1c7c.onDropReasonChanged$1");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super((Object) null);
            }
        }.LIZ();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onMappingRequestStatus(final String str, final int i) {
        Logger.debug();
        new RunnableC823120WQs(str, i) { // from class: X.0VvI
            @Override // X.RunnableC823120WQs, java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("AbsCronetDependAdapter@1c7c.onMappingRequestStatus$1");
                try {
                    this.LLILZIL.getClass();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("AbsCronetDependAdapter@1c7c.onMappingRequestStatus$1");
            }

            {
                super((Object) null);
            }
        }.LIZ();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onMultiNetworkStateChanged(final int i, final int i2) {
        Logger.debug();
        new RunnableC823120WQs() { // from class: X.0ox1
            public final void LIZJ() {
                try {
                    AnonymousClass0806 anonymousClass0806LIZIZ = AnonymousClass0803.LIZIZ(TTMultiNetwork.class);
                    Class<?> cls = Integer.TYPE;
                    anonymousClass0806LIZIZ.LIZIZ("notifyMultiNetworkState", new Class[]{cls, cls}, Integer.valueOf(i), Integer.valueOf(i2));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }

            @Override // X.RunnableC823120WQs, java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("AbsCronetDependAdapter@1c7c.onMultiNetworkStateChanged$1");
                try {
                    LIZJ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("AbsCronetDependAdapter@1c7c.onMultiNetworkStateChanged$1");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super((Object) null);
            }
        }.LIZ();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onPublicIPsChanged(final List<String> list, final List<String> list2) {
        Logger.debug();
        new RunnableC823120WQs() { // from class: X.0owp
            @Override // X.RunnableC823120WQs, java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("AbsCronetDependAdapter@1c7c.onPublicIPsChanged$1");
                try {
                    TTNetInit.onPublicIPsChanged(list, list2);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("AbsCronetDependAdapter@1c7c.onPublicIPsChanged$1");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super((Object) null);
            }
        }.LIZ();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onTNCUpdateFailed(final ArrayList<String> arrayList, final String str) {
        Logger.debug();
        new RunnableC823120WQs() { // from class: X.0oxa
            public final void LIZJ() {
                Context context;
                C1493210oxb c1493210oxb;
                String strLJ;
                HashMap map;
                HashMap map2;
                if (C1493220oxc.LIZ == null) {
                    synchronized (C1493220oxc.class) {
                        try {
                            if (C1493220oxc.LIZ == null) {
                                C1493220oxc.LIZ = new C1493220oxc();
                            }
                        } finally {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                }
                C1493220oxc c1493220oxc = C1493220oxc.LIZ;
                ArrayList<String> arrayList2 = arrayList;
                String str2 = str;
                c1493220oxc.getClass();
                if (arrayList2 == null || arrayList2.isEmpty() || (context = TTNetInit.getTTNetDepend().getContext()) == null) {
                    return;
                }
                Logger.debug();
                for (String str3 : arrayList2) {
                    try {
                        c1493210oxb = new C1493210oxb();
                        c1493210oxb.LIZIZ = true;
                        c1493210oxb.LIZJ = false;
                        C2089008Gi c2089008Gi = new C2089008Gi(str3);
                        c2089008Gi.LIZLLL("tnc_src", "7");
                        strLJ = c2089008Gi.LJ();
                        map = new HashMap();
                        map2 = new HashMap();
                        if (!TextUtils.isEmpty(str2)) {
                            map2.put("x-tt-tnc-summary", str2);
                        }
                    } catch (Throwable th) {
                    }
                    if (!TNCManager.LJI().LJIIJJI(strLJ, map2)) {
                        return;
                    }
                    String strLIZ = C1493840oyc.LIZ(strLJ, map2, map, c1493210oxb);
                    Logger.debug();
                    TNCManager tNCManagerLJI = TNCManager.LJI();
                    if (tNCManagerLJI.LJJIFFI != null) {
                        if (!tNCManagerLJI.LJJIFFI.LIZ(strLJ, strLIZ, TNCManager.LJIIL(map))) {
                            return;
                        }
                    }
                    if (!C2093608Ic.LJ(strLIZ) && "success".equals(JSONObjectProtectorUtils.getString(new JSONObject(strLIZ), "message"))) {
                        try {
                            String str4 = (map.get("x-ss-etag") == null || TextUtils.isEmpty((CharSequence) ((List) map.get("x-ss-etag")).get(0))) ? "" : (String) ((List) map.get("x-ss-etag")).get(0);
                            String str5 = (map.get("x-ss-canary") == null || TextUtils.isEmpty((CharSequence) ((List) map.get("x-ss-canary")).get(0))) ? "" : (String) ((List) map.get("x-ss-canary")).get(0);
                            String str6 = (map.get("x-tt-tnc-config") == null || TextUtils.isEmpty((CharSequence) ((List) map.get("x-tt-tnc-config")).get(0))) ? "" : (String) ((List) map.get("x-tt-tnc-config")).get(0);
                            String str7 = (map.get("x-tt-tnc-abtest") == null || TextUtils.isEmpty((CharSequence) ((List) map.get("x-tt-tnc-abtest")).get(0))) ? "" : (String) ((List) map.get("x-tt-tnc-abtest")).get(0);
                            String str8 = (map.get("x-tt-tnc-control") == null || TextUtils.isEmpty((CharSequence) ((List) map.get("x-tt-tnc-control")).get(0))) ? "" : (String) ((List) map.get("x-tt-tnc-control")).get(0);
                            Logger.debug();
                            C1493630oyH.LIZLLL(context).getClass();
                            C1493630oyH.LIZIZ();
                            C1493630oyH.LIZJ.notifyTNCConfigUpdated(str4, str5, str6, str7, str8, strLIZ);
                            return;
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            return;
                        }
                    }
                }
            }

            @Override // X.RunnableC823120WQs, java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("AbsCronetDependAdapter@1c7c.onTNCUpdateFailed$1");
                try {
                    LIZJ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("AbsCronetDependAdapter@1c7c.onTNCUpdateFailed$1");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super((Object) null);
            }
        }.LIZ();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onWiFiToCellStateChanged(final int i, final int i2) {
        Logger.debug();
        new RunnableC823120WQs() { // from class: X.0ox0
            public final void LIZJ() {
                try {
                    AnonymousClass0806 anonymousClass0806LIZIZ = AnonymousClass0803.LIZIZ(TTWiFiCellSwitcher.class);
                    Class<?> cls = Integer.TYPE;
                    anonymousClass0806LIZIZ.LIZIZ("notifyWiFiToCellState", new Class[]{cls, cls}, Integer.valueOf(i), Integer.valueOf(i2));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }

            @Override // X.RunnableC823120WQs, java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("AbsCronetDependAdapter@1c7c.onWiFiToCellStateChanged$1");
                try {
                    LIZJ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("AbsCronetDependAdapter@1c7c.onWiFiToCellStateChanged$1");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super((Object) null);
            }
        }.LIZ();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onNetworkQualityRttAndThroughputNotifiedOnIOThread(final int i, final int i2, final int i3) {
        Logger.debug();
        new RunnableC823120WQs() { // from class: X.0ows
            @Override // X.RunnableC823120WQs, java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("AbsCronetDependAdapter@1c7c.onNetworkQualityRttAndThroughputNotifiedOnIOThread$1");
                try {
                    this.LLIZLLLIL.onNetworkQualityRttAndThroughputNotified(i, i2, i3);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("AbsCronetDependAdapter@1c7c.onNetworkQualityRttAndThroughputNotifiedOnIOThread$1");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super((Object) null);
            }
        }.LIZ();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onRTTOrThroughputEstimatesComputedOnIOThread(final int i, final int i2, final int i3) {
        Logger.debug();
        new RunnableC823120WQs() { // from class: X.0oww
            @Override // X.RunnableC823120WQs, java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("AbsCronetDependAdapter@1c7c.onRTTOrThroughputEstimatesComputedOnIOThread$1");
                try {
                    this.LLIZLLLIL.onRTTOrThroughputEstimatesComputed(i, i2, i3);
                    this.LLIZLLLIL.LIZIZ(i, i2, i3);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("AbsCronetDependAdapter@1c7c.onRTTOrThroughputEstimatesComputedOnIOThread$1");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super((Object) null);
            }
        }.LIZ();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onTncRequestSucceeded(final boolean z, final boolean z2, final int i) {
        try {
            Logger.debug();
            new RunnableC823120WQs() { // from class: X.0owu
                @Override // X.RunnableC823120WQs, java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("AbsCronetDependAdapter@1c7c.onTncRequestSucceeded$1");
                    try {
                        C1493650oyJ.LIZIZ(TTNetInit.getTTNetDepend().getContext()).LIZJ(z, z2, i);
                    } finally {
                        try {
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                    }
                    C1C7U.LIZIZ("AbsCronetDependAdapter@1c7c.onTncRequestSucceeded$1");
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super((Object) null);
                }
            }.LIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onPacketLossComputedOnIOThread(final int i, final double d, final double d2, final double d3, final double d4) {
        Logger.debug();
        new RunnableC823120WQs() { // from class: X.0owv
            @Override // X.RunnableC823120WQs, java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("AbsCronetDependAdapter@1c7c.onPacketLossComputedOnIOThread$1");
                try {
                    this.LLJI.onPacketLossComputed(i, d, d2, d3, d4);
                    this.LLJI.LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("AbsCronetDependAdapter@1c7c.onPacketLossComputedOnIOThread$1");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super((Object) null);
            }
        }.LIZ();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onStoreIdcChanged(final String str, final String str2, final String str3, final String str4, final String str5, final String str6) {
        if (((Boolean) C285090BFj.LJJLI.getValue()).booleanValue() && !RunnableC1492810owx.LLIZLLLIL) {
            C0CN5.LIZIZ(Long.valueOf(((Number) C285090BFj.LJJJZ.getValue()).longValue()), new RunnableC1492810owx(this, str, str2, str3, str4, str5, str6));
        } else {
            Logger.debug();
            new RunnableC823120WQs() { // from class: X.0oxd
                @Override // X.RunnableC823120WQs, java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("AbsCronetDependAdapter@1c7c.onStoreIdcChanged$1");
                    try {
                        LIZJ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("AbsCronetDependAdapter@1c7c.onStoreIdcChanged$1");
                }

                public final void LIZJ() {
                    C0X2A.LIZIZ().LIZJ(str, str2, str3, str4, str5, str6);
                    C1493240oxe c1493240oxeLJI = C1493240oxe.LJI();
                    String str7 = str2;
                    String str8 = str3;
                    String str9 = str4;
                    String str10 = str5;
                    if (c1493240oxeLJI.LJIIJ == null || !c1493240oxeLJI.LJIIJJI || TextUtils.isEmpty(str7) || TextUtils.isEmpty(str8)) {
                        return;
                    }
                    if (c1493240oxeLJI.LIZ.equalsIgnoreCase(str7) && c1493240oxeLJI.LIZIZ.equalsIgnoreCase(str8) && c1493240oxeLJI.LIZLLL.equalsIgnoreCase(str10)) {
                        return;
                    }
                    c1493240oxeLJI.LIZLLL = str10;
                    c1493240oxeLJI.LIZ = str7;
                    c1493240oxeLJI.LIZIZ = str8;
                    c1493240oxeLJI.LIZJ = str9;
                    Logger.debug();
                    SharedPreferences.Editor editorEdit = C810670Vr7.LIZJ(c1493240oxeLJI.LJIIJ, 0, "ttnet_store_region").edit();
                    editorEdit.putString("store_region", c1493240oxeLJI.LIZ);
                    editorEdit.putString("store_region_src", c1493240oxeLJI.LIZIZ);
                    editorEdit.putString("store_sec_uid", c1493240oxeLJI.LIZLLL);
                    editorEdit.apply();
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super((Object) null);
                }
            }.LIZ();
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onTTDnsResolveResult(final String str, final String str2, final int i, final int i2, final int i3, final List<String> list, final String str3) {
        Logger.debug();
        new RunnableC823120WQs(str, str2, i, i2, i3, list, str3) { // from class: X.0ox3
            public final /* synthetic */ String LLILZIL;
            public final /* synthetic */ int LLILZLL;
            public final /* synthetic */ List LLIZ;

            public final void LIZJ() {
                C1492890ox5 c1492890ox5;
                synchronized (C1492890ox5.class) {
                    if (C1492890ox5.LIZIZ == null) {
                        C1492890ox5.LIZIZ = new C1492890ox5();
                    }
                    c1492890ox5 = C1492890ox5.LIZIZ;
                }
                String str4 = this.LLILZIL;
                int i4 = this.LLILZLL;
                List list2 = this.LLIZ;
                C1492880ox4 c1492880ox4 = (C1492880ox4) ((ConcurrentHashMap) c1492890ox5.LIZ).get(str4);
                if (c1492880ox4 != null) {
                    c1492880ox4.LIZLLL = new C1492900ox6(i4, list2);
                    c1492880ox4.LIZJ.countDown();
                    ((ConcurrentHashMap) c1492890ox5.LIZ).remove(str4);
                }
            }

            @Override // X.RunnableC823120WQs, java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("AbsCronetDependAdapter@1c7c.onTTDnsResolveResult$1");
                try {
                    LIZJ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("AbsCronetDependAdapter@1c7c.onTTDnsResolveResult$1");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super((Object) null);
                this.LLILZLL = i;
                this.LLIZ = list;
            }
        }.LIZ();
    }
}
