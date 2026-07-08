package com.ss.android.ugc.aweme.feed.util;

import X.C01GW;
import X.C09AE;
import X.C0J0P;
import X.C0PEM;
import X.C1090000eTG;
import X.C1092970eY3;
import X.C1092980eY4;
import X.C1094570ead;
import X.C1094620eai;
import X.C1106550etx;
import X.C1106560ety;
import X.C1106570etz;
import X.C1161920gLG;
import X.C1DFH;
import X.C2095008Iq;
import X.C2107308Nj;
import X.C2296808zG;
import X.C23250099c;
import X.C452501pT;
import X.EnumC1094630eaj;
import X.InterfaceC1092860eXs;
import X.InterfaceC1564370qoN;
import com.bytedance.android.live.livedecision.ILiveDecisionService;
import com.bytedance.android.livestrategy.ILiveFeatureCenterService;
import com.bytedance.keva.Keva;
import com.bytedance.pitaya.api.mutilinstance.HostSetupListener;
import com.bytedance.pitaya.api.mutilinstance.HostSetupWatcher;
import com.ss.android.ugc.aweme.ab.SmartLivePreviewCTADisplayConfig;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;
import java.util.HashMap;
import kotlin.jvm.internal.AFwS205S0000000_17;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public final class LivePreviewCTASmartDisplayManager implements HostSetupListener, InterfaceC1564370qoN {
    public static C09AE engineJob;
    public static boolean hadInit;
    public static boolean hadRun;
    public static Long smartResult;
    public static Boolean smartResultEnable;
    public static final LivePreviewCTASmartDisplayManager INSTANCE = new LivePreviewCTASmartDisplayManager();
    public static final C01GW keva$delegate = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(120));
    public static final String DEFAULT = "DEFAULT";
    public static String delayTimeFrom = DEFAULT;
    public static final C01GW delayShowTime$delegate = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(119));
    public static final int $stable = 8;

    private final boolean enable() {
        return ((SmartLivePreviewCTADisplayConfig) C1106560ety.LIZIZ.getValue()).enable;
    }

    public final long getDelayShowTime() {
        return ((Number) delayShowTime$delegate.getValue()).longValue();
    }

    public final Keva getKeva() {
        return (Keva) keva$delegate.getValue();
    }

    @Override // X.InterfaceC1564370qoN
    public void init() {
        if (hadInit && enable()) {
            return;
        }
        hadInit = true;
        HostSetupWatcher.INSTANCE.registerHostSetupListener(this);
    }

    @Override // X.InterfaceC1564370qoN
    public void release() {
        if (hadInit) {
            hadInit = false;
            C09AE c09ae = engineJob;
            if (c09ae != null) {
                c09ae.LIZIZ(null);
            }
            engineJob = null;
            HostSetupWatcher.INSTANCE.unregisterHostSetupListener(this);
        }
    }

    public final void runAsync() {
        if (hadRun || !enable()) {
            return;
        }
        hadRun = true;
        Integer serverFeatureInt = getServerFeatureInt("treco_user_valid_watch_active_day");
        Integer serverFeatureInt2 = getServerFeatureInt("treco_user_tiktok_active_day");
        C1092980eY4 c1092980eY4 = new C1092980eY4();
        c1092980eY4.LIZ = C0J0P.APP;
        C1092970eY3 c1092970eY3LIZIZ = c1092980eY4.LIZIZ();
        C1094570ead c1094570ead = new C1094570ead();
        HashMap map = new HashMap();
        map.put("treco_user_valid_watch_active_day", serverFeatureInt);
        map.put("treco_user_tiktok_active_day", serverFeatureInt2);
        c1094570ead.LIZ = map;
        ((ILiveDecisionService) C1161920gLG.LIZJ(ILiveDecisionService.class)).fR1(new InterfaceC1092860eXs() { // from class: X.0etw
            @Override // X.InterfaceC1092860eXs
            public final void LIZ() {
            }

            @Override // X.InterfaceC1092860eXs
            public final void LIZIZ(InterfaceC830890Wid interfaceC830890Wid, EnumC2213771Bkd enumC2213771Bkd) {
            }

            @Override // X.InterfaceC1092860eXs
            public final void LIZJ() {
            }

            @Override // X.InterfaceC1092860eXs
            public final void LJ(C1092890eXv c1092890eXv) {
                C1093210eYR c1093210eYR;
                JSONObject jSONObject;
                C0J0M c0j0m = c1092890eXv.LIZIZ;
                Object obj = null;
                if (c0j0m != null) {
                    obj = c0j0m.LIZ;
                }
                if ((obj instanceof C1093210eYR) && (c1093210eYR = (C1093210eYR) obj) != null && (jSONObject = c1093210eYR.LIZIZ) != null) {
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("enter_btn_show");
                    long jOptLong = -1;
                    if (jSONObjectOptJSONObject != null) {
                        jOptLong = jSONObjectOptJSONObject.optLong("enter_btn_show_delay_duration", -1L);
                    }
                    boolean zOptBoolean = false;
                    if (jSONObjectOptJSONObject != null) {
                        zOptBoolean = jSONObjectOptJSONObject.optBoolean("enter_btn_show_delay_enable", false);
                    }
                    LivePreviewCTASmartDisplayManager.smartResultEnable = Boolean.valueOf(zOptBoolean);
                    if (zOptBoolean) {
                        if (jOptLong > 0) {
                            LivePreviewCTASmartDisplayManager.smartResult = Long.valueOf(jOptLong);
                            LivePreviewCTASmartDisplayManager.INSTANCE.getKeva().storeLong("cta_delay_show_time", jOptLong);
                        }
                    } else {
                        LivePreviewCTASmartDisplayManager.smartResult = 0L;
                        LivePreviewCTASmartDisplayManager.INSTANCE.getKeva().storeLong("cta_delay_show_time", 0L);
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("previewCTAUseNewModel result enable ");
                    sbLIZ.append(zOptBoolean);
                    sbLIZ.append(" delayTime ");
                    sbLIZ.append(jOptLong);
                    C2188811AlT.LIZIZ(sbLIZ);
                }
                ((ILiveDecisionService) C1161920gLG.LIZJ(ILiveDecisionService.class)).CW("live_preview_cta_show_config");
            }

            @Override // X.InterfaceC1092860eXs
            public final void LIZLLL(String str, C477840IoY c477840IoY) {
                ((ILiveDecisionService) C1161920gLG.LIZJ(ILiveDecisionService.class)).CW("live_preview_cta_show_config");
            }
        }, c1092970eY3LIZIZ, c1094570ead, "live_preview_cta_show_config");
    }

    public final long getSmartDelayShowTime() {
        if (enable() && smartResultEnable != null) {
            delayTimeFrom = "SMART";
            Long l = smartResult;
            if (l != null) {
                return l.longValue();
            }
            return 0L;
        }
        long j = getKeva().getLong("cta_delay_show_time", -1L);
        if (enable() && j >= 0) {
            delayTimeFrom = "CACHE_SMART";
            return j;
        }
        C1106570etz.LIZ.getClass();
        if (((Boolean) C1106570etz.LJ.getValue()).booleanValue()) {
            return C1106570etz.LIZJ().useDeviceScore ? C1106570etz.LIZIZ() < 6.9f ? C1106570etz.LIZJ().lowEndDelayTime : C1106570etz.LIZIZ() < 8.7f ? C1106570etz.LIZJ().mediumEndDelayTime : C1106570etz.LIZJ().highEndDelayTime : C1106570etz.LIZJ().delayTime;
        }
        return 0L;
    }

    public final String getDelayTimeFrom() {
        return delayTimeFrom;
    }

    private final Integer getServerFeatureInt(String str) {
        Object obj;
        ILiveFeatureCenterService iLiveFeatureCenterService = (ILiveFeatureCenterService) C1161920gLG.LIZJ(ILiveFeatureCenterService.class);
        EnumC1094630eaj.Companion.getClass();
        C1090000eTG c1090000eTGO3 = iLiveFeatureCenterService.O3(C1094620eai.LIZ("default"), "server_feature", str);
        if (c1090000eTGO3 != null) {
            obj = c1090000eTGO3.LIZJ;
        } else {
            obj = null;
        }
        if (!(obj instanceof String)) {
            return null;
        }
        return C2095008Iq.LJIIJJI((String) obj);
    }

    @Override // com.bytedance.pitaya.api.mutilinstance.HostSetupListener
    public void onHostSetup(boolean z) {
        if (z && engineJob == null) {
            C1DFH c1dfh = C0PEM.LIZ;
            engineJob = C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1106550etx(null), 3);
        }
    }

    public final void setDelayTimeFrom(String str) {
        delayTimeFrom = str;
    }
}
