package com.ss.android.ugc.aweme.journey;

import X.C01GW;
import X.C07FO;
import X.C098200Yq;
import X.C0DNB;
import X.C0NJH;
import X.C0RRR;
import X.C0TA0;
import X.C0VGI;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C0X35;
import X.C104100aN;
import X.C10DR;
import X.C10H5;
import X.C10MP;
import X.C10O0;
import X.C10P6;
import X.C10PO;
import X.C10PR;
import X.C10PZ;
import X.C10QE;
import X.C10R5;
import X.C10RP;
import X.C10RS;
import X.C10RV;
import X.C10RX;
import X.C10SR;
import X.C10ST;
import X.C10SU;
import X.C10SV;
import X.C10SW;
import X.C10T3;
import X.C10TM;
import X.C10TN;
import X.C123100dR;
import X.C1308910kAL;
import X.C1388190mED;
import X.C1389600mGU;
import X.C1440005kM;
import X.C1483410ohn;
import X.C1489670ort;
import X.C14EU;
import X.C1602860roS;
import X.C1697810uHb;
import X.C1701330uNH;
import X.C1845210y7L;
import X.C1848530yCh;
import X.C189200o6;
import X.C1911410zq7;
import X.C1912370zrf;
import X.C1912590zs1;
import X.C1912930zsZ;
import X.C19233310Mh;
import X.C19233810Mm;
import X.C19237810Oa;
import X.C19240310Oz;
import X.C19242910Pz;
import X.C19244710Qr;
import X.C19244810Qs;
import X.C19248110Rz;
import X.C19248410Sc;
import X.C19248710Sf;
import X.C19249910Sr;
import X.C19250210Su;
import X.C19252910Tv;
import X.C19254610Um;
import X.C19266010Yw;
import X.C1955907lN;
import X.C1962707mT;
import X.C19EG;
import X.C20673215v0;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2211631BhB;
import X.C2241008qG;
import X.C2344009Gk;
import X.C282840B6s;
import X.C299020Bno;
import X.C306570Bzz;
import X.C307150C2f;
import X.C335910DEv;
import X.C452501pT;
import X.C486550J6f;
import X.EnumC19241510Pl;
import X.EnumC335920DEw;
import X.InterfaceC1294060jmO;
import X.InterfaceC1577280r9C;
import X.InterfaceC1740760vOs;
import X.InterfaceC1916090zxf;
import X.InterfaceC420801kM;
import Y.ARunnableS104S0100000_4;
import Y.ARunnableS128S0100000_28;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IGuestModeService;
import com.ss.android.ugc.aweme.IMandatoryLoginService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSDeviceConsentService;
import com.ss.android.ugc.aweme.configuration.scene.UGStrategyTriggerAbility;
import com.ss.android.ugc.aweme.deeplink.IDeepLinkService;
import com.ss.android.ugc.aweme.deeplink.IDeeplinkSdkService;
import com.ss.android.ugc.aweme.ecommerce.ug.newinstall.service.IEcUgNewInstallService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.journey.events.NujPerformanceTrackerV2;
import com.ss.android.ugc.aweme.journey.step.deeplink.DeeplinkComponent;
import com.ss.android.ugc.aweme.journey.step.tts.TTSConditionHelper;
import com.ss.android.ugc.aweme.launcher.service.appsflyer.IAppsflyerApi;
import com.ss.android.ugc.aweme.nxet.ITracingService;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import com.ss.android.ugc.aweme.series.feed.ISeriesFeedService;
import com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService;
import com.ss.android.ugc.awemepushapi.IPushPermissionApi;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes29.dex */
public final class NewUserJourneyActivity extends C10ST implements InterfaceC1740760vOs, InterfaceC1916090zxf {
    public static Intent LLJJIII = null;
    public static boolean LLJJIJI = false;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2Zi8jPDHELIOS09LTxiByokHTYpOwU8PTciLDYSKzElPyYnMQ==";
    public FrameLayout LLILZLL;
    public int LLIZ;
    public View LLJI;
    public boolean LLJJ;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 272));
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(230));
    public boolean LLJIJIL = true;
    public boolean LLJILJIL = true;
    public String LLJILJILJ = "";
    public boolean LLJILLL = true;
    public final C10T3 LLJJI = new C10PZ() { // from class: X.10T3
        @Override // X.C10PZ
        public final int LIZ() {
            return this.LIZ.LL;
        }

        @Override // X.C10PZ
        public final boolean LIZIZ() {
            return this.LIZ.LLILLL;
        }

        @Override // X.C10PZ
        public final boolean LIZJ() {
            return this.LIZ.LLILZ;
        }

        @Override // X.C10PZ
        public final boolean LIZLLL() {
            return this.LIZ.LLILLJJLI;
        }
    };

    @Override // X.InterfaceC1740760vOs
    public String getBtmPageCode() {
        return "b0226";
    }

    @Override // X.InterfaceC1916090zxf
    public final boolean getCanCollectConsent() {
        return false;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        boolean zLJI = MethodIDManager.LJI(202386);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.journey.NewUserJourneyActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.journey.NewUserJourneyActivity", "onStart", false);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.C10ST, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.journey.NewUserJourneyActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC1740760vOs
    public final Map<String, String> r9() {
        return null;
    }

    public final C10PR LLLLZLLIL() {
        return (C10PR) this.LLIZLLLIL.getValue();
    }

    public final void LLLLZLLLI() {
        C0TA0 next;
        IEcUgNewInstallService iEcUgNewInstallService;
        IPluginService.PluginDataWrapper value;
        IPluginService.EcommerceLandingPageData ecommerceLandingPageData;
        Integer num;
        IEcUgNewInstallService iEcUgNewInstallService2;
        C19248410Sc.LIZ.getClass();
        if (C19248410Sc.LIZIZ.length() != 0) {
            C19249910Sr.LIZIZ.LIZIZ(C19248410Sc.LIZ(), "tts_nuj_finish");
        }
        Iterator<C0TA0> it2 = ((IPluginService) ServiceManager.get().getService(IPluginService.class)).getCurrentPluginList().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            } else {
                next = it2.next();
                if (next.getType() == EnumC19241510Pl.ECOMMERCE_LANDING_PAGE_DATA) {
                    break;
                }
            }
        }
        C0TA0 c0ta0 = next;
        if (c0ta0 == null || (value = c0ta0.getValue()) == null || (ecommerceLandingPageData = value.ecommerceLandingPageData) == null || !Intrinsics.LJFF(ecommerceLandingPageData.isEcommNew, Boolean.TRUE) || (num = ecommerceLandingPageData.isEnableOnboardingTTSByAge) == null || num.intValue() != 2) {
            C19254610Um.LIZIZ.LJ().LIZ();
            if (C10RX.LIZ()) {
                C19248410Sc.LIZ.getClass();
                C19248410Sc.LIZIZ(null);
                String strLIZIZ = C10RX.LIZIZ();
                if (strLIZIZ != null) {
                    SmartRouter.buildRoute(C19248710Sf.LIZIZ.LJII(), strLIZIZ).open();
                }
                if (C10RX.LIZJ() == null || (iEcUgNewInstallService = (IEcUgNewInstallService) PluggableExtentionKt.pluggableSpi$default(IEcUgNewInstallService.class, false, false, false, 14, null)) == null) {
                    return;
                }
                iEcUgNewInstallService.LIZIZ();
                return;
            }
            return;
        }
        C19248410Sc.LIZ.getClass();
        C19248410Sc.LIZIZ(null);
        String str = ecommerceLandingPageData.landingUrl;
        if (str != null && C123100dR.LIZ(str)) {
            SmartRouter.buildRoute(C19248710Sf.LIZIZ.LJII(), ecommerceLandingPageData.landingUrl).open();
        }
        C19254610Um.LIZIZ.LJ().LIZLLL();
        List<String> listLIZLLL = C10SR.LIZLLL();
        if (!Intrinsics.LJFF(ecommerceLandingPageData.isShowEcommFeedCard, Boolean.TRUE) || listLIZLLL == null || (iEcUgNewInstallService2 = (IEcUgNewInstallService) PluggableExtentionKt.pluggableSpi$default(IEcUgNewInstallService.class, false, false, false, 14, null)) == null) {
            return;
        }
        iEcUgNewInstallService2.LIZIZ();
    }

    @Override // X.C10ST, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() throws Throwable {
        InterfaceC1577280r9C interfaceC1577280r9CLIZ;
        C0VGI c0vgi;
        C19250210Su c19250210Su = OnboardingRequest.LLILZ.getValue().LLILLL;
        if (c19250210Su != null && (c0vgi = c19250210Su.LIZ) != null) {
            c0vgi.onComplete();
        }
        C10R5 c10r5 = C10R5.LJIIIIZZ;
        C10RS.LIZ().LIZ = true;
        C1440005kM.LIZ(new C0DNB());
        C10MP.LIZ.getClass();
        Keva.getRepo("nuj_extend").storeBoolean("not_show_again", true);
        C10QE.LIZ.getClass();
        if (!C10QE.LJ) {
            boolean z = LLLLZLLIL().LIZIZ() != null;
            if (this.LL == 2) {
                Intent intent = getIntent();
                if (intent == null) {
                    intent = new Intent();
                }
                intent.setClass(this, C19248710Sf.LIZIZ.getSplashActivityClass());
                intent.setFlags(335544320);
                intent.putExtra("from_new_user_journey", true);
                intent.putExtra("pre_mainactivity_first_enter", false);
                intent.putExtra("reorder_new_journey_front", false);
                Keva.getRepo("new_user_journey").storeBoolean("disable_reorder_new_journey", true);
                C10ST.LLLLLZL(this, intent);
                C1912590zs1.LIZ = true;
                C1911410zq7.LIZ("NewUserLaunchActivity", "startMainActivity on finish");
            } else if (z) {
                Intent intent2 = getIntent();
                if (intent2 == null) {
                    intent2 = new Intent();
                }
                intent2.setClass(this, C19248710Sf.LIZIZ.getSplashActivityClass());
                intent2.setFlags(335544320);
                intent2.putExtra("pre_mainactivity_first_enter", false);
                C10ST.LLLLLZL(this, intent2);
            }
            if (!((IMandatoryLoginService) ServiceManager.get().getService(IMandatoryLoginService.class)).shouldShowForcedLogin(false) || ((IMandatoryLoginService) ServiceManager.get().getService(IMandatoryLoginService.class)).disableForTest()) {
                C1483410ohn.LJLJJI().LJIILLIIL();
            }
        }
        Intent intentLIZIZ = LLLLZLLIL().LIZIZ();
        if (!DeeplinkComponent.LLJIJIL && intentLIZIZ != null && intentLIZIZ.getData() != null) {
            C10SU.LIZ(this, intentLIZIZ, null);
        }
        C10PO.LIZ.getClass();
        C1912370zrf.LIZ.getClass();
        C1912370zrf.LJ = null;
        C19248710Sf c19248710Sf = C19248710Sf.LIZIZ;
        c19248710Sf.LIZIZ();
        super.finish();
        C19233810Mm.LIZ.getClass();
        if (Intrinsics.LJFF(((C19233310Mh) C19233810Mm.LIZ(C19233310Mh.class)).LJFF(), "revamp")) {
            try {
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            int i = C1389600mGU.LIZIZ(this) ? 0 : R.anim.j2;
            overridePendingTransition(0, i);
        } else {
            C1489670ort.LIZ();
            try {
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
            int i2 = C1389600mGU.LIZIZ(this) ? 0 : R.anim.cy;
            overridePendingTransition(0, i2);
        }
        IAppsflyerApi iAppsflyerApi = (IAppsflyerApi) ServiceManager.get().getService(IAppsflyerApi.class);
        if (iAppsflyerApi != null) {
            iAppsflyerApi.LIZ();
        }
        ((IAppsflyerApi) ServiceManager.get().getService(IAppsflyerApi.class)).LIZLLL();
        ((IGuestModeService) ServiceManager.get().getService(IGuestModeService.class)).LJ();
        ISeriesFeedService iSeriesFeedServiceLIZIZ = C0RRR.LIZIZ();
        if (iSeriesFeedServiceLIZIZ != null && (interfaceC1577280r9CLIZ = iSeriesFeedServiceLIZIZ.LIZ()) != null) {
            interfaceC1577280r9CLIZ.LIZ();
        }
        C19237810Oa.LIZ.getClass();
        C19237810Oa.LIZJ();
        C1911410zq7.LIZ("MigrationHelper", "release resource");
        Keva.getRepo("new_user_journey").storeBoolean("did_finish_nuj", true);
        C10H5 c10h5 = C10H5.NUJ_FINISHED;
        C2344009Gk c2344009Gk = new C2344009Gk();
        C10SV.LIZ(c2344009Gk);
        C19244710Qr.LIZ.getClass();
        c2344009Gk.LIZJ(C19244710Qr.LIZIZ, "is_cold_initial_feed_response");
        C10SV.LIZIZ(c10h5, c2344009Gk.LIZ);
        C10SW.LIZ.getClass();
        C10SW.LJ("nuj_finish");
        C19240310Oz.LJIIIZ = true;
        if (((INUJPushService) this.LLJ.getValue()).LIZJ()) {
            ((IPushPermissionApi) ServiceManager.get().getService(IPushPermissionApi.class)).LJIIZILJ(c19248710Sf.LJII(), "swipe_up_done", false, true, null);
        } else if (((INUJPushService) this.LLJ.getValue()).LJ()) {
            ((IPushPermissionApi) ServiceManager.get().getService(IPushPermissionApi.class)).LJIILIIL(c19248710Sf.LJII(), "swipe_up_done", null);
        } else if (((INUJPushService) this.LLJ.getValue()).LIZ()) {
            C19EG c19egLJII = c19248710Sf.LJII();
            if (c19egLJII != null) {
                ((INUJPushService) this.LLJ.getValue()).LIZLLL(c19egLJII, "compensate", false, true, null);
            } else {
                ((INUJPushService) this.LLJ.getValue()).LJFF();
            }
        }
        try {
            if (Intrinsics.LJFF(UriProtector.parse(((IAppsflyerApi) ServiceManager.get().getService(IAppsflyerApi.class)).LJ()).getHost(), "ug")) {
                TTSConditionHelper.LIZ.getClass();
                TTSConditionHelper.LIZIZ();
            } else {
                LLLLZLLLI();
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            C189200o6.m2constructorimpl(new C098200Yq(th3));
        }
        Intent intentLIZIZ2 = LLLLZLLIL().LIZIZ();
        if (!C19242910Pz.LJI && intentLIZIZ2 != null && C10O0.LIZ(intentLIZIZ2.getData()) && C306570Bzz.LIZ() == 1 && !((Boolean) C282840B6s.LIZ.getValue()).booleanValue()) {
            Uri data = intentLIZIZ2.getData();
            if (data != null) {
                C10SW c10sw = C10SW.LIZ;
                c10sw.LJII(data);
                c10sw.LJIIIIZZ();
            }
            LLLLZI(this, intentLIZIZ2);
            if (C123100dR.LIZ(this.LLJILJILJ)) {
                C2241008qG c2241008qG = new C2241008qG();
                c2241008qG.LIZ.put("ugdp_id", this.LLJILJILJ);
                C20684815ws.LJIJ("deep_link_nuj_output", c2241008qG.LJ());
            }
        } else if (!C19242910Pz.LJI && intentLIZIZ2 != null && C10O0.LIZIZ(intentLIZIZ2.getData())) {
            Uri data2 = intentLIZIZ2.getData();
            if (data2 != null) {
                C10SW c10sw2 = C10SW.LIZ;
                c10sw2.LJII(data2);
                c10sw2.LJIIIIZZ();
            }
            LLLLZI(this, intentLIZIZ2);
        }
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        c2344009Gk2.LJIIIIZZ("enter_from", "nuj_finished");
        c2344009Gk2.LJIIIIZZ("description", String.valueOf(((IPNSDeviceConsentService) ServiceManager.get().getService(IPNSDeviceConsentService.class)).LJII(null)));
        C20684815ws.LJIILLIIL("pns_has_consent", c2344009Gk2.LIZ);
        C1955907lN.LIZ.getClass();
        C1955907lN.LIZ();
        IUGStrategyTriggerAbility iUGStrategyTriggerAbilityLJI = UGStrategyTriggerAbility.LJI();
        if (iUGStrategyTriggerAbilityLJI != null) {
            iUGStrategyTriggerAbilityLJI.LIZ("after_nuj_end");
        }
        C10SW.LIZ.getClass();
        C10SW.LJ("enter_feed");
        C19244810Qs.LIZ.getClass();
        C19244810Qs.LIZIZ("nuj_end", false);
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        C19249910Sr c19249910Sr = C19249910Sr.LIZIZ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        C10PO.LIZ.getClass();
        C10P6 c10p6 = C10PO.LIZIZ;
        c2344009Gk.LJIIIIZZ("page_name", c10p6 != null ? c10p6.LIZIZ.LJII : null);
        c2344009Gk.LJIIIIZZ("action_type", "back_btn");
        c19249910Sr.LIZIZ(c2344009Gk, "try_skip_nuj_node_action");
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        C10R5 c10r5 = C10R5.LJIIIIZZ;
        C10RS.LIZ().LIZ = true;
        C10PO.LIZ.getClass();
        ComplianceServiceProvider.LJIILIIL().LJI(false);
        if (((Boolean) C07FO.LIZ.getValue()).booleanValue()) {
            C19244810Qs.LIZ.getClass();
            InterfaceC420801kM interfaceC420801kM = C19244810Qs.LIZLLL;
            if (interfaceC420801kM != null && !interfaceC420801kM.isDisposed()) {
                InterfaceC420801kM interfaceC420801kM2 = C19244810Qs.LIZLLL;
                if (interfaceC420801kM2 != null) {
                    interfaceC420801kM2.dispose();
                }
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LIZJ(-999, "error_code");
                C20684815ws.LJIILLIIL("error_saving_interests", c2344009Gk.LIZ);
            }
        }
        super.onDestroy();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.journey.NewUserJourneyActivity", "onResume", true);
        C0X35.LJIIJJI("cold_boot_new_user_journey_create_to_resume", false);
        C0X35.LIZ("cold_boot_new_user_journey_resume_duration", false);
        super.onResume();
        if (C10TN.LIZ() && this.LLJIJIL) {
            IUnKnownOwnershipBusinessOuterService iUnKnownOwnershipBusinessOuterService = (IUnKnownOwnershipBusinessOuterService) PluggableExtentionKt.pluggableSpi$default(IUnKnownOwnershipBusinessOuterService.class, false, false, false, 14, null);
            if (iUnKnownOwnershipBusinessOuterService != null) {
                iUnKnownOwnershipBusinessOuterService.LJIJJLI();
            }
            this.LLJIJIL = false;
        }
        C0X35.LJIIJJI("cold_boot_new_user_journey_resume_duration", false);
        C0X35.LIZ("cold_boot_new_user_journey_resume_to_focus_changed", false);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.journey.NewUserJourneyActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStop() {
        super.onStop();
        NujPerformanceTrackerV2 nujPerformanceTrackerV2 = NujPerformanceTrackerV2.LIZ;
        nujPerformanceTrackerV2.getClass();
        if (NujPerformanceTrackerV2.LJII) {
            this.LLIZ++;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("numberOfTimesUserBackground: ");
            sbLIZ.append(this.LLIZ);
            C1911410zq7.LIZ("NUJActivity", C2188811AlT.LIZIZ(sbLIZ));
        }
        nujPerformanceTrackerV2.LJ("numberOfTimesUserBackground", String.valueOf(this.LLIZ), true);
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    @Override // X.InterfaceC1740760vOs
    public final String w3() {
        return String.valueOf(hashCode());
    }

    public final int LLLLZIL(boolean z) {
        Resources.Theme theme;
        Resources.Theme theme2;
        TypedValue typedValue = new TypedValue();
        if (z) {
            Activity activityLIZ = C1388190mED.LIZ(this);
            if (activityLIZ != null && (theme2 = activityLIZ.getTheme()) != null) {
                theme2.resolveAttribute(R.attr.zp, typedValue, true);
            }
        } else {
            Activity activityLIZ2 = C1388190mED.LIZ(this);
            if (activityLIZ2 != null && (theme = activityLIZ2.getTheme()) != null) {
                theme.resolveAttribute(R.attr.bx, typedValue, true);
            }
        }
        int i = typedValue.data;
        View viewFindViewById = this.LLILZLL;
        if (viewFindViewById == null) {
            viewFindViewById = findViewById(R.id.iiv);
            this.LLILZLL = (FrameLayout) viewFindViewById;
        }
        viewFindViewById.setBackgroundColor(i);
        return i;
    }

    public final void LLLLZLL(boolean z) {
        if (this.LLJJ == z) {
            return;
        }
        this.LLJJ = z;
        View view = null;
        if (z) {
            View view2 = this.LLJI;
            if (view2 != null) {
                view = view2;
            }
            view.setBackgroundColor(-16777216);
            return;
        }
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bx, this);
        if (numLIZJ == null) {
            return;
        }
        int iIntValue = numLIZJ.intValue();
        View view3 = this.LLJI;
        if (view3 != null) {
            view = view3;
        }
        view.setBackgroundColor(iIntValue);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onAppFlyerEvent(C10TM c10tm) {
        Uri data;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        Activity activityLIZ = C1388190mED.LIZ(this);
        if (activityLIZ != null) {
            Intent intent = new Intent(activityLIZ, (Class<?>) NewUserJourneyActivity.class);
            intent.putExtra("deeplink_intent_about_welcome_screen", c10tm.LIZ);
            LLLLZLLIL().LIZ(intent);
            Intent intent2 = c10tm.LIZ;
            if (intent2 != null && (data = intent2.getData()) != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(data, "ugdp_id")) != null && !TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                this.LLJILJILJ = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                C2241008qG c2241008qG = new C2241008qG();
                c2241008qG.LIZ.put("ugdp_id", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                ARunnableS104S0100000_4 aRunnableS104S0100000_4 = new ARunnableS104S0100000_4(c2241008qG, 95);
                if (C19266010Yw.LIZ()) {
                    C20684815ws.LJFF().execute(aRunnableS104S0100000_4);
                } else {
                    aRunnableS104S0100000_4.run();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C10ST, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        InterfaceC1577280r9C interfaceC1577280r9CLIZ;
        IUnKnownOwnershipBusinessOuterService iUnKnownOwnershipBusinessOuterService;
        boolean z = true;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.journey.NewUserJourneyActivity", "onCreate", true);
        C0X35.LJIIJJI("cold_boot_stubmain_to_new_user_jrouney", false);
        if (getIntent().getBooleanExtra("redirected_from_deeplink", false)) {
            boolean booleanExtra = getIntent().getBooleanExtra("redirect_is_app_link", false);
            IDeeplinkSdkService iDeeplinkSdkService = (IDeeplinkSdkService) PluggableExtentionKt.pluggableSpi$default(IDeeplinkSdkService.class, false, false, false, 14, null);
            if (iDeeplinkSdkService != null) {
                iDeeplinkSdkService.LIZIZ(this, getIntent(), booleanExtra, new C1962707mT(z, getIntent(), "saf_nuj_first", null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 248));
            }
            C19248110Rz c19248110Rz = C19248110Rz.LIZ;
            Intent intent = getIntent();
            c19248110Rz.getClass();
            C19248110Rz.LIZJ = intent;
            Intent intent2 = LLJJIII;
            if (intent2 != null) {
                setIntent(intent2);
            }
            getIntent().putExtra("redirected_from_deeplink", true);
        }
        C10PO.LIZ.getClass();
        C2211631BhB.LIZ = true;
        C2211631BhB.LJIILL("b4101", null);
        C307150C2f.LIZ = 1;
        C1912930zsZ c1912930zsZ = C1912930zsZ.LIZ;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        c1912930zsZ.getClass();
        C1912930zsZ.LIZJ = jElapsedRealtime;
        NujPerformanceTrackerV2.LIZIZ(C0NJH.MAIN2NUJ_DURATION, false);
        NujPerformanceTrackerV2.LIZ.LJ(C0NJH.NUJ_STARTED.toString(), "true", false);
        NujPerformanceTrackerV2.LIZ(C0NJH.NUJ2FEED_DURATION);
        C1602860roS c1602860roS = C1602860roS.LIZ;
        AFwS217S0000000_28 aFwS217S0000000_28 = AFwS217S0000000_28.get$arr$(174);
        c1602860roS.getClass();
        if (C1602860roS.LIZ(aFwS217S0000000_28)) {
            C20673215v0.LJII(this, "journey_activity");
        }
        if (C104100aN.LIZ().isNewUser() && (iUnKnownOwnershipBusinessOuterService = (IUnKnownOwnershipBusinessOuterService) PluggableExtentionKt.pluggableSpi$default(IUnKnownOwnershipBusinessOuterService.class, false, false, false, 14, null)) != null) {
            iUnKnownOwnershipBusinessOuterService.LJJIII();
        }
        C19252910Tv.LIZIZ.LIZIZ(this);
        activityConfiguration(AFwS271S0000000_28.get$arr$(114));
        C10RV.LIZ(this, "nuj");
        super.onCreate(bundle);
        C0X35.LIZ("cold_boot_new_user_journey_oncreate_duration", false);
        this.LLILLL = getIntent().getBooleanExtra("from_main", true);
        this.LLILZ = getIntent().getBooleanExtra("from_deeplink", false);
        LLLLZLLIL().LIZLLL();
        if (!this.LLILLL) {
            C10R5 c10r5 = C10R5.LJIIIIZZ;
            C10RS.LIZ().LIZJ = 1;
        }
        ComplianceServiceProvider.LJIILIIL().LJI(true);
        C10R5 c10r52 = C10R5.LJIIIIZZ;
        C10RS.LIZ().LIZ = false;
        Keva.getRepo("new_user_journey").storeBoolean("new_user_journey_show", true);
        LLLLZLLIL().LIZ(getIntent());
        C0X35.LIZ("cold_boot_new_user_journey_setcontentview_duration", false);
        c1602860roS.getClass();
        if (C1602860roS.LIZ(aFwS217S0000000_28)) {
            setContentView(C20673215v0.LIZJ(R.layout.cz7, C1388190mED.LIZ(this)));
        } else {
            setContentView(R.layout.cz7);
        }
        this.LLJI = findViewById(R.id.iiv);
        if (C10DR.LIZ(C1388190mED.LIZ(this))) {
            LLLLZLL(true);
        }
        C19237810Oa.LIZ.getClass();
        C19237810Oa.LIZIZ();
        if (this.LL > 0 && bundle == null) {
            final View decorView = getWindow().getDecorView();
            decorView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.10Sj
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    IUnKnownOwnershipBusinessOuterService iUnKnownOwnershipBusinessOuterService2;
                    if (C10TN.LIZ() && (iUnKnownOwnershipBusinessOuterService2 = (IUnKnownOwnershipBusinessOuterService) PluggableExtentionKt.pluggableSpi$default(IUnKnownOwnershipBusinessOuterService.class, false, false, false, 14, null)) != null) {
                        iUnKnownOwnershipBusinessOuterService2.updateRootViewAndState(view);
                    }
                    decorView.removeOnLayoutChangeListener(this);
                    C786410Ut5.LJLIIL(1000L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS128S0100000_28(this, 91));
                }
            });
        } else {
            LLLLZLLIL().LIZJ();
        }
        C0X35.LJIIJJI("cold_boot_new_user_journey_setcontentview_duration", false);
        LLJJIJI = true;
        C0X35.LJIIJJI("cold_boot_new_user_journey_oncreate_duration", false);
        C0X35.LIZ("cold_boot_new_user_journey_create_to_resume", false);
        C10RP.LJI("");
        ISeriesFeedService iSeriesFeedServiceLIZIZ = C0RRR.LIZIZ();
        if (iSeriesFeedServiceLIZIZ != null && (interfaceC1577280r9CLIZ = iSeriesFeedServiceLIZIZ.LIZ()) != null) {
            interfaceC1577280r9CLIZ.LJI();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.journey.NewUserJourneyActivity", "onCreate", false);
        C1848530yCh.LIZ.getClass();
        ITracingService iTracingServiceLIZ = C1845210y7L.LIZ();
        if (iTracingServiceLIZ != null) {
            iTracingServiceLIZ.LJIIZILJ(this);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onEvent(C486550J6f c486550J6f) throws Throwable {
        if (((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().LIZ()) {
            finish();
        } else {
            LLLLZLLIL().onEvent(c486550J6f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        String scheme;
        super.onNewIntent(intent);
        boolean zLJJIIZI = false;
        C0X35.LJIIJJI("cold_boot_new_user_pre_main", false);
        LLLLZLLIL().LIZ(intent);
        if (!intent.getBooleanExtra("pre_create_main", false)) {
            String str = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            Object[] objArr5 = 0;
            IDeepLinkService iDeepLinkService = (IDeepLinkService) PluggableExtentionKt.pluggableSpi$default(IDeepLinkService.class, false, false, false, 14, null);
            if (iDeepLinkService != null) {
                Uri data = intent.getData();
                if (data != null) {
                    scheme = data.getScheme();
                } else {
                    scheme = null;
                }
                zLJJIIZI = iDeepLinkService.LJJIIZI(scheme);
            }
            boolean z = !zLJJIIZI;
            IDeeplinkSdkService iDeeplinkSdkService = (IDeeplinkSdkService) PluggableExtentionKt.pluggableSpi$default(IDeeplinkSdkService.class, false, false, false, 14, null);
            if (iDeeplinkSdkService != null) {
                iDeeplinkSdkService.LIZIZ(this, intent, z, new C1962707mT(true, intent, str, objArr5 == true ? 1 : 0, objArr4 == true ? 1 : 0, objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0, 252));
            }
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        boolean z;
        super.setTheme(i);
        if (C299020Bno.LIZ() != 0) {
            boolean z2 = false;
            if (!C1697810uHb.LJIIJJI(Integer.valueOf(R.style.a9t), Integer.valueOf(R.style.a9u), Integer.valueOf(R.style.a9v), Integer.valueOf(R.style.a9s)).contains(Integer.valueOf(i))) {
                Integer numLIZ = C1308910kAL.LIZ(R.attr.g0c, this);
                if (numLIZ != null && numLIZ.intValue() == -1) {
                    z = true;
                } else {
                    z = false;
                }
                Integer numLIZ2 = C1308910kAL.LIZ(R.attr.g0d, this);
                if (numLIZ2 == null || numLIZ2.intValue() != 0) {
                    z2 = true;
                }
                if (z) {
                    getTheme().applyStyle(R.style.a9u, true);
                } else {
                    getTheme().applyStyle(R.style.a9t, true);
                }
                if (z2) {
                    getTheme().applyStyle(R.style.a9v, true);
                } else {
                    getTheme().applyStyle(R.style.a9s, true);
                }
            }
        }
        EnumC335920DEw enumC335920DEwLIZ = C335910DEv.LIZ();
        if (enumC335920DEwLIZ == EnumC335920DEw.V1) {
            getTheme().applyStyle(R.style.a9x, true);
        } else {
            if (enumC335920DEwLIZ != EnumC335920DEw.V2) {
                return;
            }
            getTheme().applyStyle(R.style.a9y, true);
        }
    }

    public static void LLLLZI(NewUserJourneyActivity newUserJourneyActivity, Intent intent) throws Throwable {
        Intent intent2 = intent;
        Activity activity = newUserJourneyActivity;
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent2, "Context_startActivity_1");
        C1701330uNH.LIZ(intent2, activity);
        C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOCndo3A2SvpJn7I7W/ATh0SEvtWljgZOKCi6kr9IA==", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = {intent2};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11098, "com/ss/android/ugc/aweme/journey/NewUserJourneyActivity", "startActivity", activity, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11098, "com/ss/android/ugc/aweme/journey/NewUserJourneyActivity", "startActivity", null, objArr, activity, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                activity = (Activity) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intent2 = (Intent) obj2;
            }
        }
        activity.startActivity(intent2);
        c0wst.LIZ(11098, "com/ss/android/ugc/aweme/journey/NewUserJourneyActivity", "startActivity", null, objArr, activity, c0wzw, true);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    @InterfaceC1294060jmO
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        LLLLZLLIL().onActivityResult(i, i2, intent);
    }
}
