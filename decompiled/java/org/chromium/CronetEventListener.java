package org.chromium;

import X.AbstractC1498350p5t;
import X.C1497080p3q;
import X.C1497110p3t;
import X.C2126108Up;
import X.C2179971ATj;
import X.C786410Ut5;
import X.C840350Wxt;
import X.C840380Wxw;
import X.C840410Wxz;
import X.EnumC840370Wxv;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.retrofit2.mime.TTRequestCompressManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class CronetEventListener extends AbstractC1498350p5t {
    public static volatile CronetEventListener sInstance;
    public boolean enableOptInit;
    public boolean isMainProcess;

    public static CronetEventListener inst() {
        if (sInstance == null) {
            synchronized (CronetEventListener.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new CronetEventListener();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return sInstance;
    }

    @Override // X.AbstractC1498350p5t
    public void onColdStartFinish() {
        if (this.isMainProcess) {
            CronetAppProviderManager.inst().onColdStartFinish();
        }
    }

    @Override // X.AbstractC1498350p5t
    public void onCronetBootSucceed() {
        if (this.isMainProcess) {
            CronetAppProviderManager.inst().onCronetBootSucceed();
        }
    }

    @Override // X.AbstractC1498350p5t
    public void onTLBDecompressFail() {
        TTRequestCompressManager.setGlobalForbidenCompress();
    }

    public void enableOptInit(boolean z) {
        this.enableOptInit = z;
    }

    @Override // X.AbstractC1498350p5t
    public void onClientIPChanged(String str) {
        if (this.isMainProcess) {
            CronetAppProviderManager.inst().onClientIPChanged(str);
        }
    }

    @Override // X.AbstractC1498350p5t
    public void onEffectiveConnectionTypeChanged(int i) {
        CronetAppProviderManager.inst().onEffectiveConnectionTypeChanged(i);
    }

    @Override // X.AbstractC1498350p5t
    public void onNetworkQualityLevelChanged(int i) {
        CronetAppProviderManager.inst().onNetworkQualityLevelChanged(i);
    }

    @Override // X.AbstractC1498350p5t
    public void onNetworkQualityTypeChangedV3(int i) {
        CronetAppProviderManager.inst().onNetworkQualityTypeChangedV3(i);
    }

    @Override // X.AbstractC1498350p5t
    public void onTTNetDetectInfoChanged(String str) {
        if (this.isMainProcess) {
            CronetAppProviderManager.inst().onTTNetDetectInfoChanged(str);
        }
    }

    @Override // X.AbstractC1498350p5t
    public void onUserSpecifiedNetworkEnabled(boolean z) {
        CronetAppProviderManager.inst().onUserSpecifiedNetworkEnabled(z);
    }

    public void setIsMainProcess(boolean z) {
        this.isMainProcess = z;
    }

    @Override // X.AbstractC1498350p5t
    public Map<String, String> onCallToAddSecurityFactor(String str, Map<String, String> map) {
        return CronetAppProviderManager.inst().onCallToAddSecurityFactor(str, map);
    }

    @Override // X.AbstractC1498350p5t
    public void onDropReasonChanged(boolean z, List<Integer> list) {
        if (this.isMainProcess) {
            CronetAppProviderManager.inst().onDropReasonChanged(z, list);
        }
    }

    public void onMappingRequestStatus(String str, int i) {
        if (this.isMainProcess) {
            CronetAppProviderManager.inst().onMappingRequestStatus(str, i);
        }
    }

    @Override // X.AbstractC1498350p5t
    public void onMultiNetworkStateChanged(int i, int i2) {
        CronetAppProviderManager.inst().onMultiNetworkStateChanged(i, i2);
    }

    @Override // X.AbstractC1498350p5t
    public void onPublicIPsChanged(List<String> list, List<String> list2) {
        if (this.isMainProcess) {
            CronetAppProviderManager.inst().onPublicIPsChanged(list, list2);
        }
    }

    @Override // X.AbstractC1498350p5t
    public void onTNCUpdateFailed(String[] strArr, String str) {
        if (this.isMainProcess) {
            CronetAppProviderManager.inst().onTNCUpdateFailed(strArr, str);
        }
    }

    @Override // X.AbstractC1498350p5t
    public void onWiFiToCellStateChanged(int i, int i2) {
        CronetAppProviderManager.inst().onWiFiToCellStateChanged(i, i2);
    }

    @Override // X.AbstractC1498350p5t
    public void onNetworkQualityRttAndThroughputNotified(int i, int i2, int i3) {
        CronetAppProviderManager.inst().onNetworkQualityRttAndThroughputNotified(i, i2, i3);
    }

    @Override // X.AbstractC1498350p5t
    public void onRTTOrThroughputEstimatesComputed(int i, int i2, int i3) {
        CronetAppProviderManager.inst().onRTTOrThroughputEstimatesComputed(i, i2, i3);
    }

    @Override // X.AbstractC1498350p5t
    public String onRequestInterceptorToStart(String str, Map<String, String> map, List<String> list) {
        if (C840410Wxz.LIZ != null) {
            Logger.debug();
            C840350Wxt c840350WxtLIZIZ = C840410Wxz.LIZ.LIZIZ(str, list, map);
            if (c840350WxtLIZIZ != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    int i = C840380Wxw.LIZ[c840350WxtLIZIZ.LIZ.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                jSONObject.put("modified", EnumC840370Wxv.BOTH_MODIFIED.getValue());
                                String str2 = c840350WxtLIZIZ.LIZIZ;
                                if (!TextUtils.isEmpty(str2)) {
                                    try {
                                        new URI(str2);
                                        jSONObject.put("new_url", str2);
                                    } catch (Exception e) {
                                        TryCatchGuardChecker.doCheck(e);
                                    }
                                }
                                C840350Wxt.LIZ(jSONObject, c840350WxtLIZIZ.LIZJ, c840350WxtLIZIZ.LIZLLL);
                            }
                        } else {
                            jSONObject.put("modified", EnumC840370Wxv.HEADER_MODIFIED.getValue());
                            C840350Wxt.LIZ(jSONObject, c840350WxtLIZIZ.LIZJ, c840350WxtLIZIZ.LIZLLL);
                        }
                    } else {
                        jSONObject.put("modified", EnumC840370Wxv.URL_MODIFIED.getValue());
                        String str3 = c840350WxtLIZIZ.LIZIZ;
                        if (!TextUtils.isEmpty(str3)) {
                            try {
                                new URI(str3);
                                jSONObject.put("new_url", str3);
                            } catch (Exception e2) {
                                TryCatchGuardChecker.doCheck(e2);
                            }
                        }
                    }
                } catch (JSONException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                }
                String strJ3 = C786410Ut5.J3(jSONObject);
                Logger.debug();
                return strJ3;
            }
            return null;
        }
        return null;
    }

    @Override // X.AbstractC1498350p5t
    public String onResponseInterceptorToStart(String str, Map<String, List<String>> map, int i) {
        if (C840410Wxz.LIZ != null) {
            Logger.debug();
            C840410Wxz.LIZ.LIZ(i, str, map);
            return null;
        }
        return null;
    }

    @Override // X.AbstractC1498350p5t
    public void onServerConfigUpdated(String str, String str2, String str3) {
        if (this.isMainProcess) {
            CronetAppProviderManager.inst().onServerConfigUpdated(str, str2, str3);
        }
    }

    @Override // X.AbstractC1498350p5t
    public void onTncRequestSucceeded(boolean z, boolean z2, int i) {
        CronetAppProviderManager.inst().onTncRequestSucceeded(z, z2, i);
    }

    @Override // X.AbstractC1498350p5t
    public void onPacketLossComputed(int i, double d, double d2, double d3, double d4) {
        CronetAppProviderManager.inst().onPacketLossComputed(i, d, d2, d3, d4);
    }

    @Override // X.AbstractC1498350p5t
    public void onStoreIdcChanged(String str, String str2, String str3, String str4, String str5, String str6) {
        if (this.isMainProcess) {
            CronetAppProviderManager.inst().onStoreIdcChanged(str, str2, str3, str4, str5, str6);
        }
    }

    @Override // X.AbstractC1498350p5t
    public void onTTDnsResolveResult(String str, String str2, int i, int i2, int i3, List<String> list, String str3) {
        CronetAppProviderManager.inst().onTTDnsResolveResult(str, str2, i, i2, i3, list, str3);
    }

    @Override // X.AbstractC1498350p5t
    public void onContextInitCompleted(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        if (this.enableOptInit) {
            C1497080p3q.LJII();
        }
        C1497080p3q c1497080p3qLJ = C1497080p3q.LJ();
        c1497080p3qLJ.LIZJ = Process.getThreadPriority(0);
        c1497080p3qLJ.LJJIJIIJI = C1497110p3t.LIZJ;
        c1497080p3qLJ.LJJIJIIJIL = C1497110p3t.LIZLLL;
        c1497080p3qLJ.LJJIJIL = C1497110p3t.LIZ;
        c1497080p3qLJ.LJJIJL = C1497110p3t.LIZIZ;
        c1497080p3qLJ.LJJIJLIJ = C1497110p3t.LJ;
        c1497080p3qLJ.LJJIZ = C1497110p3t.LJFF;
        c1497080p3qLJ.LJJIL = System.nanoTime();
        c1497080p3qLJ.LJJJI = j;
        c1497080p3qLJ.LJJJIL = j2;
        c1497080p3qLJ.LJJJJ = j3;
        c1497080p3qLJ.LJJJ = j4;
        c1497080p3qLJ.LJJJJI = j5;
        c1497080p3qLJ.LJJJJIZL = j6;
        c1497080p3qLJ.LJJJJJ = j7;
        c1497080p3qLJ.LJJJJJL = j8;
        c1497080p3qLJ.LJJJJL = j9;
        c1497080p3qLJ.LJJJJLI = j10;
        c1497080p3qLJ.LJJJJLL = j11;
        c1497080p3qLJ.LJJJJZ = j12;
        c1497080p3qLJ.LJJJJZI = j13;
        c1497080p3qLJ.LJJJLIIL = j14;
        c1497080p3qLJ.LJJJLL = j15;
        c1497080p3qLJ.LJJJLZIJ = j16;
        final long appStartTime = CronetAppProviderManager.inst().getAppStartTime();
        C1497080p3q c1497080p3qLJ2 = C1497080p3q.LJ();
        if (c1497080p3qLJ2.LIZLLL != 0 && c1497080p3qLJ2.LJ != 0 && c1497080p3qLJ2.LJFF != 0 && c1497080p3qLJ2.LJI != 0 && c1497080p3qLJ2.LJII != 0 && c1497080p3qLJ2.LJIIIIZZ != 0 && c1497080p3qLJ2.LJIIIZ != 0 && c1497080p3qLJ2.LJIIJ != 0 && c1497080p3qLJ2.LJIIJJI != 0 && c1497080p3qLJ2.LJIILIIL != 0 && c1497080p3qLJ2.LJIILJJIL != 0 && c1497080p3qLJ2.LJIILL != 0 && c1497080p3qLJ2.LJIILLIIL != 0 && c1497080p3qLJ2.LJIIZILJ != 0 && c1497080p3qLJ2.LJIJ != 0 && c1497080p3qLJ2.LJIJI != 0 && c1497080p3qLJ2.LJIJJ != 0 && c1497080p3qLJ2.LJIJJLI != 0 && c1497080p3qLJ2.LJIL != 0 && c1497080p3qLJ2.LJJ != 0 && c1497080p3qLJ2.LJJI != 0 && c1497080p3qLJ2.LJJIFFI != 0 && c1497080p3qLJ2.LJJII != 0 && c1497080p3qLJ2.LJJIII != 0 && c1497080p3qLJ2.LJJIIJ != 0 && c1497080p3qLJ2.LJJIIJZLJL != 0 && c1497080p3qLJ2.LJJIIZ != 0 && c1497080p3qLJ2.LJJIIZI != 0 && c1497080p3qLJ2.LJJIJ != 0) {
            JSONObject jSONObjectLIZ = C1497080p3q.LJ().LIZ();
            JSONObject jSONObjectLIZIZ = C1497080p3q.LJ().LIZIZ(appStartTime);
            if (!this.enableOptInit) {
                C1497080p3q.LJII();
            }
            CronetAppProviderManager.inst().sendAppMonitorEvent(C786410Ut5.J3(jSONObjectLIZ), "ttnet_init");
            CronetAppProviderManager.inst().sendAppMonitorEvent(C786410Ut5.J3(jSONObjectLIZIZ), "ttnet_init_v2");
            return;
        }
        C2126108Up.LIZLLL.schedule(new Runnable() { // from class: org.chromium.CronetEventListener.1
            @Override // java.lang.Runnable
            public void run() {
                org_chromium_CronetEventListener$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void org_chromium_CronetEventListener$1__run$___twin___() {
                JSONObject jSONObjectLIZ2 = C1497080p3q.LJ().LIZ();
                JSONObject jSONObjectLIZIZ2 = C1497080p3q.LJ().LIZIZ(appStartTime);
                CronetAppProviderManager.inst().sendAppMonitorEvent(C786410Ut5.J3(jSONObjectLIZ2), "ttnet_init");
                CronetAppProviderManager.inst().sendAppMonitorEvent(C786410Ut5.J3(jSONObjectLIZIZ2), "ttnet_init_v2");
            }

            public static void org_chromium_CronetEventListener$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                try {
                    anonymousClass1.org_chromium_CronetEventListener$1__run$___twin___();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        }, 5L, TimeUnit.SECONDS);
        if (!this.enableOptInit) {
            C1497080p3q.LJII();
        }
    }
}
