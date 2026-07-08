package com.ss.android.ugc.aweme.journey.com.ss.android.ugc.aweme;

import X.C01GW;
import X.C07FO;
import X.C08TN;
import X.C098200Yq;
import X.C0CO3;
import X.C0DNB;
import X.C0NJH;
import X.C0RRR;
import X.C0TA0;
import X.C0TKA;
import X.C0TKF;
import X.C0VGI;
import X.C0VWW;
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
import X.C10RS;
import X.C10RV;
import X.C10RX;
import X.C10SR;
import X.C10SU;
import X.C10SV;
import X.C10SW;
import X.C10T6;
import X.C10TM;
import X.C10TN;
import X.C1150504el;
import X.C123100dR;
import X.C1308910kAL;
import X.C1440005kM;
import X.C1483410ohn;
import X.C1486210omJ;
import X.C1489670ort;
import X.C14EU;
import X.C1514430pVp;
import X.C1568170quV;
import X.C1602860roS;
import X.C1685300txQ;
import X.C1701330uNH;
import X.C1845210y7L;
import X.C1848530yCh;
import X.C189200o6;
import X.C1911410zq7;
import X.C1912370zrf;
import X.C1912590zs1;
import X.C1912930zsZ;
import X.C1913090zsp;
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
import X.C19GS;
import X.C202099145x;
import X.C20673215v0;
import X.C20684815ws;
import X.C2155308cR;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2211631BhB;
import X.C2241008qG;
import X.C2344009Gk;
import X.C276870AtB;
import X.C282840B6s;
import X.C306570Bzz;
import X.C307150C2f;
import X.C452501pT;
import X.C486550J6f;
import X.C584360Mvy;
import X.C584470Mw9;
import X.C786410Ut5;
import X.C799890VZj;
import X.C799900VZk;
import X.C844470XAv;
import X.EnumC19241510Pl;
import X.InterfaceC1577280r9C;
import X.InterfaceC1740760vOs;
import X.InterfaceC1916090zxf;
import X.InterfaceC420801kM;
import X.RunnableC1601200rlm;
import X.ViewOnLayoutChangeListenerC19332410kE;
import Y.ARunnableS104S0100000_4;
import Y.ARunnableS128S0100000_28;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.SAFTikTokFragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IGuestModeService;
import com.ss.android.ugc.aweme.IMandatoryLoginService;
import com.ss.android.ugc.aweme.NewUserJourneyContainerActivity;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSDeviceConsentService;
import com.ss.android.ugc.aweme.configuration.scene.UGStrategyTriggerAbility;
import com.ss.android.ugc.aweme.deeplink.IDeepLinkService;
import com.ss.android.ugc.aweme.deeplink.IDeeplinkSdkService;
import com.ss.android.ugc.aweme.ecommerce.ug.newinstall.service.IEcUgNewInstallService;
import com.ss.android.ugc.aweme.feed.Feed0VVManager;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.journey.INUJPushService;
import com.ss.android.ugc.aweme.journey.IUGStrategyTriggerAbility;
import com.ss.android.ugc.aweme.journey.NewUserJourneyActivity;
import com.ss.android.ugc.aweme.journey.OnboardingRequest;
import com.ss.android.ugc.aweme.journey.events.NujPerformanceTrackerV2;
import com.ss.android.ugc.aweme.journey.step.deeplink.DeeplinkComponent;
import com.ss.android.ugc.aweme.journey.step.slogan.SloganFragment;
import com.ss.android.ugc.aweme.journey.step.tts.TTSConditionHelper;
import com.ss.android.ugc.aweme.launcher.service.appsflyer.IAppsflyerApi;
import com.ss.android.ugc.aweme.nxet.ITracingService;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import com.ss.android.ugc.aweme.series.feed.ISeriesFeedService;
import com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService;
import com.ss.android.ugc.awemepushapi.IPushPermissionApi;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AFwS278S0000000_32;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes29.dex */
public final class NewUserJourneyFragment extends SAFTikTokFragment implements InterfaceC1740760vOs, InterfaceC1916090zxf {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2Zi8jPD09LTxiKiA+ZjY/ZyHELIOS49LDcjICt9PSIvZy4kLSgpZwE2PxA/LD0ZJzA+JyoqDjctLiI2JjE=";
    public FrameLayout LLJILLL;
    public View LLJJ;
    public int LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public int LLJJJ;
    public boolean LLJL;
    public final C10T6 LLJLIL;
    public boolean LLJJIJI = true;
    public boolean LLJJJIL = true;
    public boolean LLJJJJ = true;
    public String LLJJJJJIL = "";
    public boolean LLJJJJLIIL = true;
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 273));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(232));

    @Override // X.InterfaceC1740760vOs
    public String getBtmPageCode() {
        return "b0226";
    }

    @Override // X.InterfaceC1916090zxf
    public final boolean getCanCollectConsent() {
        return false;
    }

    @Override // X.InterfaceC1740760vOs
    public final Map<String, String> r9() {
        return null;
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final void finish() throws Throwable {
        InterfaceC1577280r9C interfaceC1577280r9CLIZ;
        C19EG activity;
        C0VGI c0vgi;
        C19250210Su c19250210Su = OnboardingRequest.LLILZ.getValue().LLILLL;
        if (c19250210Su != null && (c0vgi = c19250210Su.LIZ) != null) {
            c0vgi.onComplete();
        }
        C10R5 c10r5 = C10R5.LJIIIIZZ;
        C10RS.LIZ().LIZ = true;
        C10MP.LIZ.getClass();
        C10MP.LIZJ = false;
        Keva.getRepo("nuj_extend").storeBoolean("not_show_again", true);
        C1440005kM.LIZ(new C0DNB());
        C10QE.LIZ.getClass();
        if (!C10QE.LJ) {
            boolean z = mS().LIZIZ() != null;
            C19EG activity2 = getActivity();
            if (activity2 != null) {
                if (this.LLJJI == 2) {
                    Intent intent = activity2.getIntent();
                    if (intent == null) {
                        intent = new Intent();
                    }
                    intent.setClass(activity2, C19248710Sf.LIZIZ.getSplashActivityClass());
                    intent.setFlags(335544320);
                    intent.putExtra("from_new_user_journey", true);
                    intent.putExtra("pre_mainactivity_first_enter", false);
                    intent.putExtra("reorder_new_journey_front", false);
                    Keva.getRepo("new_user_journey").storeBoolean("disable_reorder_new_journey", true);
                    hS(this, intent);
                    C1912590zs1.LIZ = true;
                    C1911410zq7.LIZ("NewUserJourneyFragment", "startMainActivity on finish");
                } else if (z) {
                    Intent intent2 = activity2.getIntent();
                    if (intent2 == null) {
                        intent2 = new Intent();
                    }
                    intent2.setClass(activity2, C19248710Sf.LIZIZ.getSplashActivityClass());
                    intent2.setFlags(335544320);
                    intent2.putExtra("pre_mainactivity_first_enter", false);
                    hS(this, intent2);
                }
                if (!((IMandatoryLoginService) ServiceManager.get().getService(IMandatoryLoginService.class)).shouldShowForcedLogin(false) || ((IMandatoryLoginService) ServiceManager.get().getService(IMandatoryLoginService.class)).disableForTest()) {
                    C1483410ohn.LJLJJI().LJIILLIIL();
                }
            }
        }
        C19EG activity3 = getActivity();
        if (activity3 != null) {
            Intent intentLIZIZ = mS().LIZIZ();
            if (!DeeplinkComponent.LLJIJIL && intentLIZIZ != null && intentLIZIZ.getData() != null) {
                C10SU.LIZ(activity3, intentLIZIZ, null);
            }
        }
        C10PO.LIZ.getClass();
        C1912370zrf.LIZ.getClass();
        C1912370zrf.LJ = null;
        C19248710Sf c19248710Sf = C19248710Sf.LIZIZ;
        c19248710Sf.LIZIZ();
        if (!(getActivity() instanceof NewUserJourneyContainerActivity)) {
            super.finish();
        }
        this.LLJJIJIL = true;
        C0X35.LJIIJJI("cold_boot_new_user_launch_focus_to_finish", false);
        C1911410zq7.LIZ("NewUserJourneyFragment", Log.getStackTraceString(new RuntimeException("NewUserJourneyFragment finish calling stack, not a real exception:")));
        C19233810Mm.LIZ.getClass();
        C19233310Mh c19233310Mh = (C19233310Mh) C19233810Mm.LIZ(C19233310Mh.class);
        if ((getActivity() instanceof NewUserJourneyContainerActivity) && (activity = getActivity()) != null) {
            if (Intrinsics.LJFF(c19233310Mh.LJFF(), "revamp")) {
                C786410Ut5.ce(activity, 0, R.anim.j2);
            } else {
                C1489670ort.LIZ();
                C786410Ut5.ce(activity, 0, R.anim.cy);
            }
        }
        if (C1514430pVp.LIZLLL().booleanValue()) {
            IAppsflyerApi iAppsflyerApi = (IAppsflyerApi) ServiceManager.get().getService(IAppsflyerApi.class);
            if (iAppsflyerApi != null) {
                iAppsflyerApi.LIZ();
            }
            ((IAppsflyerApi) ServiceManager.get().getService(IAppsflyerApi.class)).LIZLLL();
            ISeriesFeedService iSeriesFeedServiceLIZIZ = C0RRR.LIZIZ();
            if (iSeriesFeedServiceLIZIZ != null && (interfaceC1577280r9CLIZ = iSeriesFeedServiceLIZIZ.LIZ()) != null) {
                interfaceC1577280r9CLIZ.LIZ();
            }
        }
        ((IGuestModeService) ServiceManager.get().getService(IGuestModeService.class)).LJ();
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
        if (((INUJPushService) this.LLJJLIIIJLLLLLLLZ.getValue()).LIZJ()) {
            ((IPushPermissionApi) ServiceManager.get().getService(IPushPermissionApi.class)).LJIIZILJ(c19248710Sf.LJII(), "swipe_up_done", false, true, null);
        } else if (((INUJPushService) this.LLJJLIIIJLLLLLLLZ.getValue()).LJ()) {
            ((IPushPermissionApi) ServiceManager.get().getService(IPushPermissionApi.class)).LJIILIIL(c19248710Sf.LJII(), "swipe_up_done", null);
        } else if (((INUJPushService) this.LLJJLIIIJLLLLLLLZ.getValue()).LIZ()) {
            C19EG c19egLJII = c19248710Sf.LJII();
            if (c19egLJII != null) {
                ((INUJPushService) this.LLJJLIIIJLLLLLLLZ.getValue()).LIZLLL(c19egLJII, "compensate", false, true, null);
            } else {
                ((INUJPushService) this.LLJJLIIIJLLLLLLLZ.getValue()).LJFF();
            }
        }
        try {
            if (C1514430pVp.LIZLLL().booleanValue()) {
                if (Intrinsics.LJFF(UriProtector.parse(((IAppsflyerApi) ServiceManager.get().getService(IAppsflyerApi.class)).LJ()).getHost(), "ug")) {
                    TTSConditionHelper.LIZ.getClass();
                    TTSConditionHelper.LIZIZ();
                } else {
                    oS();
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Intent intentLIZIZ2 = mS().LIZIZ();
        if (!C19242910Pz.LJI && intentLIZIZ2 != null && C10O0.LIZ(intentLIZIZ2.getData()) && C306570Bzz.LIZ() == 1 && !((Boolean) C282840B6s.LIZ.getValue()).booleanValue()) {
            Uri data = intentLIZIZ2.getData();
            if (data != null) {
                C10SW c10sw = C10SW.LIZ;
                c10sw.LJII(data);
                c10sw.LJIIIIZZ();
            }
            C19EG activity4 = getActivity();
            if (activity4 != null) {
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity4, intentLIZIZ2, "Context_startActivity_1");
                C1701330uNH.LIZ(intentLIZIZ2, activity4);
                C2204961BRm.LLJJJJ(activity4, intentLIZIZ2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOCndo3A2SvpC3TSlm/WEjYTA/tXmiV2aJ6gJ2So6oxC9IbZH78wMmJjqDr0NWrobaf2q8+BIAs=", null));
            }
            if (C123100dR.LIZ(this.LLJJJJJIL)) {
                C2241008qG c2241008qG = new C2241008qG();
                c2241008qG.LIZ.put("ugdp_id", this.LLJJJJJIL);
                C20684815ws.LJIJ("deep_link_nuj_output", c2241008qG.LJ());
            }
        } else if (!C19242910Pz.LJI && intentLIZIZ2 != null && C10O0.LIZIZ(intentLIZIZ2.getData())) {
            Uri data2 = intentLIZIZ2.getData();
            if (data2 != null) {
                C10SW c10sw2 = C10SW.LIZ;
                c10sw2.LJII(data2);
                c10sw2.LJIIIIZZ();
            }
            C19EG activity5 = getActivity();
            if (activity5 != null) {
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity5, intentLIZIZ2, "Context_startActivity_1");
                C1701330uNH.LIZ(intentLIZIZ2, activity5);
                C2204961BRm.LLJJJJ(activity5, intentLIZIZ2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOCndo3A2SvpC3TSlm/WEjYTA/tXmiV2aJ6gJ2So6oxC9IbZH78wMmJjqDr0NWrobaf2q8+BIAs=", null));
            }
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

    public final C10PR mS() {
        return (C10PR) this.LLJJL.getValue();
    }

    public final void oS() {
        C0TA0 next;
        IEcUgNewInstallService iEcUgNewInstallService;
        C19EG activity;
        IPluginService.PluginDataWrapper value;
        IPluginService.EcommerceLandingPageData ecommerceLandingPageData;
        Integer num;
        IEcUgNewInstallService iEcUgNewInstallService2;
        C19EG activity2;
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
                if (strLIZIZ != null && (activity = getActivity()) != null) {
                    SmartRouter.buildRoute(activity, strLIZIZ).open();
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
        if (str != null && C123100dR.LIZ(str) && (activity2 = getActivity()) != null) {
            SmartRouter.buildRoute(activity2, ecommerceLandingPageData.landingUrl).open();
        }
        C19254610Um.LIZIZ.LJ().LIZLLL();
        List<String> listLIZLLL = C10SR.LIZLLL();
        if (!Intrinsics.LJFF(ecommerceLandingPageData.isShowEcommFeedCard, Boolean.TRUE) || listLIZLLL == null || (iEcUgNewInstallService2 = (IEcUgNewInstallService) PluggableExtentionKt.pluggableSpi$default(IEcUgNewInstallService.class, false, false, false, 14, null)) == null) {
            return;
        }
        iEcUgNewInstallService2.LIZIZ();
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final boolean onBackPressed() {
        C19249910Sr c19249910Sr = C19249910Sr.LIZIZ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        C10PO.LIZ.getClass();
        C10P6 c10p6 = C10PO.LIZIZ;
        c2344009Gk.LJIIIIZZ("page_name", c10p6 != null ? c10p6.LIZIZ.LJII : null);
        c2344009Gk.LJIIIIZZ("action_type", "back_btn");
        c19249910Sr.LIZIZ(c2344009Gk, "try_skip_nuj_node_action");
        return true;
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        C0X35.LJIIJJI("cold_boot_new_user_journey_create_to_resume", false);
        C0X35.LIZ("cold_boot_new_user_journey_resume_duration", false);
        super.onResume();
        C10RV.LIZ(getActivity(), "nuj");
        if (C10TN.LIZ() && this.LLJJJIL) {
            IUnKnownOwnershipBusinessOuterService iUnKnownOwnershipBusinessOuterService = (IUnKnownOwnershipBusinessOuterService) PluggableExtentionKt.pluggableSpi$default(IUnKnownOwnershipBusinessOuterService.class, false, false, false, 14, null);
            if (iUnKnownOwnershipBusinessOuterService != null) {
                iUnKnownOwnershipBusinessOuterService.LJIJJLI();
            }
            this.LLJJJIL = false;
        }
        C0X35.LJIIJJI("cold_boot_new_user_journey_resume_duration", false);
        C0X35.LIZ("cold_boot_new_user_journey_resume_to_focus_changed", false);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.10T6] */
    public NewUserJourneyFragment() {
        aS(AFwS278S0000000_32.get$arr$(59));
        this.LLJLIL = new C10PZ() { // from class: X.10T6
            @Override // X.C10PZ
            public final int LIZ() {
                return this.LIZ.LLJJI;
            }

            @Override // X.C10PZ
            public final boolean LIZIZ() {
                return this.LIZ.LLJJIJI;
            }

            @Override // X.C10PZ
            public final boolean LIZJ() {
                return this.LIZ.LLJJIJIIJIL;
            }

            @Override // X.C10PZ
            public final boolean LIZLLL() {
                return this.LIZ.LLJJIII;
            }
        };
    }

    public final void nS() {
        if (isAdded() && !isDetached()) {
            mS().LIZJ();
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("type", "nuj_fragment_not_added");
        C20684815ws.LJIILLIIL("intention_detection_flag", c2344009Gk.LIZ);
        finish();
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJJI(this);
        }
        C10R5 c10r5 = C10R5.LJIIIIZZ;
        C10RS.LIZ().LIZ = true;
        C10PO.LIZ.getClass();
        ComplianceServiceProvider.LJIILIIL().LJI(false);
        if (((Boolean) C07FO.LIZ.getValue()).booleanValue()) {
            C19244810Qs.LIZ.getClass();
            InterfaceC420801kM interfaceC420801kM = C19244810Qs.LIZLLL;
            if (interfaceC420801kM == null || interfaceC420801kM.isDisposed()) {
                return;
            }
            InterfaceC420801kM interfaceC420801kM2 = C19244810Qs.LIZLLL;
            if (interfaceC420801kM2 != null) {
                interfaceC420801kM2.dispose();
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZJ(-999, "error_code");
            C20684815ws.LJIILLIIL("error_saving_interests", c2344009Gk.LIZ);
        }
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        RunnableC1601200rlm runnableC1601200rlm;
        super.onPause();
        if (this.LLJJI <= 0) {
            C0X35.LJIJI(SystemClock.uptimeMillis());
            C202099145x c202099145xLIZ = C1150504el.LIZ();
            Integer num = SloganFragment.LLJILJILJ;
            c202099145xLIZ.LJJ = num != null ? num.intValue() : 0;
            C08TN.LIZ().LJJJJ(((Boolean) C276870AtB.LIZ.getValue()).booleanValue());
            return;
        }
        if (isRemoving()) {
            C584470Mw9.LJII("new_user_journey", null);
            C584360Mvy.LJ(1);
            C0X35.LJIIJJI("cold_boot_new_user_login_end_to_nuj_finish", false);
            C0X35.LJIIJJI("cold_boot_nujactivity_focus_to_finish", false);
            C0X35.LJIIJJI("cold_boot_new_user_login_end_to_feed_total_start", false);
            C0X35.LJIJI(SystemClock.uptimeMillis());
            C0X35.LIZ("cold_boot_new_user_journey_pause_to_data_fetched", false);
            C0X35.LJIIJJI("cold_boot_start_to_feed_total_start", false);
            C1913090zsp c1913090zsp = C1913090zsp.LIZ;
            boolean zBooleanValue = C1514430pVp.LIZLLL().booleanValue();
            c1913090zsp.getClass();
            C1913090zsp.LIZ(zBooleanValue);
            if (C1486210omJ.LIZ() || (runnableC1601200rlm = Feed0VVManager.LJIIIZ) == null) {
                return;
            }
            runnableC1601200rlm.run();
            Feed0VVManager.LJIIIZ = null;
        }
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        NujPerformanceTrackerV2 nujPerformanceTrackerV2 = NujPerformanceTrackerV2.LIZ;
        nujPerformanceTrackerV2.getClass();
        if (NujPerformanceTrackerV2.LJII) {
            this.LLJJJ++;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("numberOfTimesUserBackground: ");
            sbLIZ.append(this.LLJJJ);
            C1911410zq7.LIZ("NewUserJourneyFragment", C2188811AlT.LIZIZ(sbLIZ));
        }
        nujPerformanceTrackerV2.LJ("numberOfTimesUserBackground", String.valueOf(this.LLJJJ), true);
    }

    @Override // X.InterfaceC1740760vOs
    public final String w3() {
        return String.valueOf(hashCode());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final void LLLLIILLL(Bundle bundle) {
        Intent intent;
        super.LLLLIILLL(bundle);
        boolean zLJJIIZI = false;
        C0X35.LJIIJJI("cold_boot_new_user_pre_main", false);
        C19EG activity = getActivity();
        String scheme = null;
        if (activity != null && (intent = activity.getIntent()) != null) {
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            mS().LIZ(intent);
        } else {
            intent = null;
        }
        C1514430pVp.LIZLLL().booleanValue();
        if (intent != null && !intent.getBooleanExtra("pre_create_main", false)) {
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
                }
                zLJJIIZI = iDeepLinkService.LJJIIZI(scheme);
            }
            boolean z = true ^ zLJJIIZI;
            IDeeplinkSdkService iDeeplinkSdkService = (IDeeplinkSdkService) PluggableExtentionKt.pluggableSpi$default(IDeeplinkSdkService.class, false, false, false, 14, null);
            if (iDeeplinkSdkService != null) {
                iDeeplinkSdkService.LIZIZ(requireActivity(), intent, z, new C1962707mT(true, intent, str, objArr5 == true ? 1 : 0, objArr4 == true ? 1 : 0, objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0, 252));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034 A[PHI: r1
      0x0034: PHI (r1v1 android.view.View) = (r1v0 android.view.View), (r1v2 android.view.View) binds: [B:12:0x0024, B:14:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int iS(boolean r5) {
        /*
            r4 = this;
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            android.content.Context r0 = r4.getContext()
            if (r0 == 0) goto L1a
            android.content.res.Resources$Theme r2 = r0.getTheme()
            if (r2 == 0) goto L1a
            r1 = 1
            if (r5 == 0) goto L38
            r0 = 2131100556(0x7f06038c, float:1.7813497E38)
            r2.resolveAttribute(r0, r3, r1)
        L1a:
            int r3 = r3.data
            android.view.View r2 = r4.getView()
            if (r2 == 0) goto L37
            android.widget.FrameLayout r1 = r4.LLJILLL
            if (r1 != 0) goto L34
            r0 = 2131373640(0x7f0a2e48, float:1.8367377E38)
            android.view.View r1 = r2.findViewById(r0)
            r0 = r1
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r4.LLJILLL = r0
            if (r1 == 0) goto L37
        L34:
            r1.setBackgroundColor(r3)
        L37:
            return r3
        L38:
            r0 = 2131099676(0x7f06001c, float:1.7811712E38)
            r2.resolveAttribute(r0, r3, r1)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.journey.com.ss.android.ugc.aweme.NewUserJourneyFragment.iS(boolean):int");
    }

    public final void kS(boolean z) {
        Integer numLIZJ;
        if (this.LLJL == z) {
            return;
        }
        this.LLJL = z;
        View view = null;
        if (z) {
            View view2 = this.LLJJ;
            if (view2 != null) {
                view = view2;
            }
            view.setBackgroundColor(-16777216);
            return;
        }
        C19EG activity = getActivity();
        if (activity == null || (numLIZJ = C1308910kAL.LIZJ(R.attr.bx, activity)) == null) {
            return;
        }
        int iIntValue = numLIZJ.intValue();
        View view3 = this.LLJJ;
        if (view3 != null) {
            view = view3;
        }
        view.setBackgroundColor(iIntValue);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onAppFlyerEvent(C10TM c10tm) {
        Uri data;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        C19EG activity = getActivity();
        if (activity != null) {
            Intent intent = new Intent(activity, (Class<?>) NewUserJourneyContainerActivity.class);
            intent.putExtra("deeplink_intent_about_welcome_screen", c10tm.LIZ);
            mS().LIZ(intent);
            Intent intent2 = c10tm.LIZ;
            if (intent2 != null && (data = intent2.getData()) != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(data, "ugdp_id")) != null && !TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                this.LLJJJJJIL = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                C2241008qG c2241008qG = new C2241008qG();
                c2241008qG.LIZ.put("ugdp_id", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                ARunnableS104S0100000_4 aRunnableS104S0100000_4 = new ARunnableS104S0100000_4(c2241008qG, 113);
                if (C19266010Yw.LIZ()) {
                    C20684815ws.LJFF().execute(aRunnableS104S0100000_4);
                } else {
                    aRunnableS104S0100000_4.run();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean, int] */
    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        ?? r1;
        boolean z;
        boolean z2;
        Intent intent;
        C19EG activity;
        C19EG activity2;
        Intent intent2;
        BaseActivity baseActivity;
        IUnKnownOwnershipBusinessOuterService iUnKnownOwnershipBusinessOuterService;
        Context context;
        Intent intent3;
        C19EG activity3;
        if (!EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJIJJ(this);
        }
        if (!C1514430pVp.LIZLLL().booleanValue()) {
            C10MP.LIZ.getClass();
            C10MP.LIZJ = true;
        }
        C844470XAv.LIZ.getClass();
        if (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test")) {
            C786410Ut5.re(Toast.makeText(getActivity(), "use nuj fragment saf!", 0));
        }
        C10RV.LIZ(getActivity(), "nuj");
        C19EG activity4 = getActivity();
        if (activity4 != null && (intent3 = activity4.getIntent()) != null && intent3.getBooleanExtra("redirected_from_deeplink", false)) {
            boolean booleanExtra = intent3.getBooleanExtra("redirect_is_app_link", false);
            Function0 function0 = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            IDeeplinkSdkService iDeeplinkSdkService = (IDeeplinkSdkService) PluggableExtentionKt.pluggableSpi$default(IDeeplinkSdkService.class, false, false, false, 14, null);
            if (iDeeplinkSdkService != null) {
                iDeeplinkSdkService.LIZIZ(requireActivity(), intent3, booleanExtra, new C1962707mT(true, intent3, "saf_nuj_first", function0, objArr4 == true ? 1 : 0, objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0, 248));
            }
            C19248110Rz.LIZ.getClass();
            C19248110Rz.LIZJ = intent3;
            Intent intent4 = NewUserJourneyActivity.LLJJIII;
            if (intent4 != null && (activity3 = getActivity()) != null) {
                activity3.setIntent(intent4);
            }
            r1 = 1;
            intent3.putExtra("redirected_from_deeplink", true);
        } else {
            r1 = 1;
        }
        C10PO.LIZ.getClass();
        C2211631BhB.LIZ = r1;
        C2211631BhB.LJIILL("b4101", null);
        C307150C2f.LIZ = r1;
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
        if (C1602860roS.LIZ(aFwS217S0000000_28) && (context = getContext()) != null) {
            C20673215v0.LJII(context, "journey_activity");
        }
        if (C104100aN.LIZ().isNewUser() && (iUnKnownOwnershipBusinessOuterService = (IUnKnownOwnershipBusinessOuterService) PluggableExtentionKt.pluggableSpi$default(IUnKnownOwnershipBusinessOuterService.class, false, false, false, 14, null)) != null) {
            iUnKnownOwnershipBusinessOuterService.LJJIII();
        }
        C19EG activity5 = getActivity();
        if (activity5 != null) {
            C19252910Tv.LIZIZ.LIZIZ(activity5);
        }
        C19EG activity6 = getActivity();
        if ((activity6 instanceof BaseActivity) && (baseActivity = (BaseActivity) activity6) != null) {
            baseActivity.activityConfiguration(AFwS271S0000000_28.get$arr$(115));
        }
        C0X35.LIZ("cold_boot_new_user_launch_oncreate_duration", false);
        C0TKF c0tkf = C0TKA.LIZ;
        super.onCreate(bundle);
        C10R5 c10r5 = C10R5.LJIIIIZZ;
        C10RS.LIZ().LIZLLL = true;
        C799900VZk.LIZ.getClass();
        C799890VZj c799890VZj = new C799890VZj();
        c799890VZj.LIZ(OnboardingRequest.LLILZ.getValue());
        ComplianceServiceProvider.LJJIII().initialize();
        IMandatoryLoginService iMandatoryLoginService = (IMandatoryLoginService) ServiceManager.get().getService(IMandatoryLoginService.class);
        if (C10RS.LIZ().LIZJ() != 0 && iMandatoryLoginService.shouldShowForcedLogin(false) && !iMandatoryLoginService.getHasRequestComplianceApi()) {
            iMandatoryLoginService.setHasRequestComplianceApi(true);
            c799890VZj.LIZ(C19248710Sf.LIZIZ.LJIILIIL(C0CO3.NORMAL));
        }
        c799890VZj.LIZIZ();
        if (C1514430pVp.LIZLLL().booleanValue() && (activity = getActivity()) != null && (activity.getIntent().getBooleanExtra("redirect_from_main", false) || ((activity2 = getActivity()) != null && (intent2 = activity2.getIntent()) != null && intent2.getBooleanExtra("from_deeplink", false)))) {
            new ARunnableS128S0100000_28(this, 110).run();
        }
        if (bundle != null) {
            z = true;
        } else {
            z = false;
        }
        this.LLJJIII = z;
        C0X35.LJIIJJI("cold_boot_new_user_launch_oncreate_duration", false);
        C19EG activity7 = getActivity();
        if (activity7 != null) {
            this.LLJJIJI = activity7.getIntent().getBooleanExtra("from_main", true);
            this.LLJJIJIIJIL = activity7.getIntent().getBooleanExtra("from_deeplink", false);
        }
        mS().LIZLLL();
        if (!this.LLJJIJI) {
            z2 = true;
            C10RS.LIZ().LIZJ = 1;
        } else {
            z2 = true;
        }
        ComplianceServiceProvider.LJIILIIL().LJI(z2);
        C10RS.LIZ().LIZ = false;
        Keva.getRepo("new_user_journey").storeBoolean("new_user_journey_show", z2);
        C19EG activity8 = getActivity();
        if (activity8 != null && (intent = activity8.getIntent()) != null) {
            mS().LIZ(intent);
        }
        C1848530yCh.LIZ.getClass();
        ITracingService iTracingServiceLIZ = C1845210y7L.LIZ();
        if (iTracingServiceLIZ != null) {
            iTracingServiceLIZ.LJI(this);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onEvent(C486550J6f c486550J6f) {
        if (((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().LIZ()) {
            finish();
        } else {
            mS().onEvent(c486550J6f);
        }
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final void onWindowFocusChanged(boolean z) {
        IUnKnownOwnershipBusinessOuterService iUnKnownOwnershipBusinessOuterService;
        View view;
        C19EG activity = getActivity();
        if (activity != null) {
            activity.onWindowFocusChanged(z);
        }
        C0X35.LJIIJJI("cold_boot_new_user_journey_resume_to_focus_changed", false);
        super.onWindowFocusChanged(z);
        C1150504el.LIZ().LJIIIIZZ = false;
        C1150504el.LIZ().LJIIZILJ = true;
        if (z) {
            C0X35.LJIIJJI("app_start_to_main_focus", true);
            if (getActivity() != null) {
                C2155308cR.LIZIZ();
            }
            C0X35.LIZ("cold_boot_nujactivity_focus_to_finish", false);
            C0X35.LIZ("cold_boot_new_user_launch_focus_to_finish", false);
            C0X35.LIZ("interest_window_focus_changed_to_slogan_fragment", false);
            C584470Mw9.LJ("new_user_journey");
            C1568170quV.LIZ(2000);
            C0VWW.LIZIZ("latency_app_start_newuser");
        }
        if (C10TN.LIZ() && this.LLJJIJIL && (iUnKnownOwnershipBusinessOuterService = (IUnKnownOwnershipBusinessOuterService) PluggableExtentionKt.pluggableSpi$default(IUnKnownOwnershipBusinessOuterService.class, false, false, false, 14, null)) != null) {
            C1602860roS.LIZ.getClass();
            WeakReference<View> weakReference = C1602860roS.LIZIZ;
            if (weakReference != null) {
                view = weakReference.get();
            } else {
                view = null;
            }
            WeakReference<View> weakReference2 = C1602860roS.LIZIZ;
            if (weakReference2 != null) {
                weakReference2.clear();
            }
            iUnKnownOwnershipBusinessOuterService.LJIILIIL(view);
        }
    }

    public static void hS(NewUserJourneyFragment newUserJourneyFragment, Intent intent) throws Throwable {
        Intent intent2 = intent;
        Fragment fragment = newUserJourneyFragment;
        C1701330uNH.LIZ(intent2, fragment);
        C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOCndo3A2SvpC3TSlm/WEjYTA/tXmiV2aJ6gJ2So6oxC9IbZH78wMmJjqDr0NWrobaf2q8+BIAs=", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = {intent2};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11088, "com/ss/android/ugc/aweme/journey/com/ss/android/ugc/aweme/NewUserJourneyFragment", "startActivity", fragment, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11088, "com/ss/android/ugc/aweme/journey/com/ss/android/ugc/aweme/NewUserJourneyFragment", "startActivity", null, objArr, fragment, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                fragment = (Fragment) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intent2 = (Intent) obj2;
            }
        }
        fragment.startActivity(intent2);
        c0wst.LIZ(11088, "com/ss/android/ugc/aweme/journey/com/ss/android/ugc/aweme/NewUserJourneyFragment", "startActivity", null, objArr, fragment, c0wzw, true);
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        InterfaceC1577280r9C interfaceC1577280r9CLIZ;
        super.onViewCreated(view, bundle);
        C0X35.LJIIJJI("cold_boot_new_user_journey_oncreate_duration", false);
        C0X35.LIZ("cold_boot_new_user_journey_create_to_resume", false);
        ISeriesFeedService iSeriesFeedServiceLIZIZ = C0RRR.LIZIZ();
        if (iSeriesFeedServiceLIZIZ != null && (interfaceC1577280r9CLIZ = iSeriesFeedServiceLIZIZ.LIZ()) != null) {
            interfaceC1577280r9CLIZ.LJI();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd;
        boolean z;
        C19GS c19gs;
        Window window;
        View decorView;
        C0X35.LIZ("cold_boot_new_user_journey_setcontentview_duration", false);
        C1602860roS c1602860roS = C1602860roS.LIZ;
        AFwS217S0000000_28 aFwS217S0000000_28 = AFwS217S0000000_28.get$arr$(174);
        c1602860roS.getClass();
        if (C1602860roS.LIZ(aFwS217S0000000_28)) {
            viewTd = C20673215v0.LIZLLL(R.layout.cz7, getActivity(), viewGroup, false);
        } else {
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.cz7, viewGroup, false);
        }
        this.LLJJ = viewTd.findViewById(R.id.iiv);
        if (C10DR.LIZ(getContext())) {
            kS(true);
        }
        C19237810Oa.LIZ.getClass();
        C19237810Oa.LIZIZ();
        if (this.LLJJI > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && bundle == null) {
            C19EG activity = getActivity();
            if (activity != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                decorView.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC19332410kE(this, 1));
            }
        } else {
            nS();
        }
        C0X35.LJIIJJI("cold_boot_new_user_journey_setcontentview_duration", false);
        NewUserJourneyActivity.LLJJIJI = true;
        C0X35.LJIIJJI("cold_boot_new_user_journey_oncreate_duration", false);
        C0X35.LIZ("cold_boot_new_user_journey_create_to_resume", false);
        try {
            ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewTd, this);
            viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity2 = getActivity();
            if (activity2 instanceof C19GS) {
                c19gs = (C19GS) activity2;
            } else {
                c19gs = null;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewTd;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewTd;
        }
    }
}
