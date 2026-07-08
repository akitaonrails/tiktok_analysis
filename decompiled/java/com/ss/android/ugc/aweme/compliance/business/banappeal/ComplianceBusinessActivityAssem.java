package com.ss.android.ugc.aweme.compliance.business.banappeal;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C03GZ;
import X.C09JN;
import X.C0C64;
import X.C0CLW;
import X.C0DMM;
import X.C0DQM;
import X.C0S4U;
import X.C0S78;
import X.C0XKG;
import X.C0XQ7;
import X.C108800b8;
import X.C1150504el;
import X.C11JF;
import X.C11NJ;
import X.C11PQ;
import X.C11S5;
import X.C1235760iGM;
import X.C1389890mGx;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C14EU;
import X.C1519390pdp;
import X.C1537900q7g;
import X.C1541950qED;
import X.C15O7;
import X.C1701940uOG;
import X.C1906580ziK;
import X.C1916730zyh;
import X.C1916740zyi;
import X.C1916750zyj;
import X.C1916770zyl;
import X.C1916780zym;
import X.C1916800zyo;
import X.C19476611Hw;
import X.C2188811AlT;
import X.C2296808zG;
import X.C290540Ba8;
import X.C316660CbA;
import X.C452501pT;
import X.C484220Iyq;
import X.C612920O2g;
import X.C746970TRv;
import X.C786410Ut5;
import X.C799890VZj;
import X.C799900VZk;
import X.C823050WQl;
import X.C985403tE;
import X.EnumC1585090rLn;
import X.InterfaceC1554220qY0;
import X.InterfaceC19483011Ki;
import X.InterfaceC427710Gpt;
import X.InterfaceC745990TOb;
import Y.ACallableS254S0200000_28;
import Y.ARunnableS128S0100000_28;
import Y.AfS197S0100000_28;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.keva.Keva;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.compliance.agegate.api.IAgeGateTracker;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService;
import com.ss.android.ugc.aweme.compliance.business.gatekeeper.ComplianceBackgroundLegoTask;
import com.ss.android.ugc.aweme.compliance.business.gatekeeper.ComplianceFirstFocusLegoTask;
import com.ss.android.ugc.aweme.compliance.business.statemachine.PNSNormalStateMachineInitTask;
import com.ss.android.ugc.aweme.compliance.common.hydrogen.InitHydrogenTask;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.TextWithInlineLink;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.IGatekeeperService;
import com.ss.android.ugc.aweme.profile.model.AGSWarning;
import com.ss.android.ugc.aweme.profile.model.AGSWarningPopupWindow;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.tiktok.ban.IUserBanDepService;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS126S1100000_12;
import kotlin.jvm.internal.AwS394S0200000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public final class ComplianceBusinessActivityAssem extends BaseMainContainerAssem implements InterfaceC427710Gpt {
    public boolean LLILLL;
    public boolean LLILZIL;
    public C11JF LLJ;
    public C1916800zyo LLJILJIL;
    public final C01GW LL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 134));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new C1916730zyh(this));
    public boolean LLILZ = true;
    public final C11PQ<Object> LLILZLL = new C11PQ<>();
    public final C11NJ LLIZ = new C11NJ();
    public final BPEAHandler LLIZLLLIL = new BPEAHandler(Looper.getMainLooper());
    public final C01GW LLJI = C452501pT.LIZIZ(new C1916740zyi());
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new C1916750zyj());

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        String strJ4 = C786410Ut5.j4("main_act_assem_lifecycle_%s_%s", new Object[]{"ComplianceBusinessActivityAssem", "onResume"});
        C1150504el.LIZ().LIZLLL(strJ4, false);
        super.onResume();
        this.LLIZLLLIL.removeCallbacksAndMessages(null);
        C786410Ut5.LJLIIL(3000L, this.LLIZLLLIL, new ARunnableS128S0100000_28(this, 23));
        C1150504el.LIZ().LJI(strJ4, false);
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C11JF c11jf = this.LLJ;
        if (c11jf != null && !c11jf.isDisposed()) {
            c11jf.dispose();
        }
        this.LLJ = null;
        EventBus.LIZLLL().LJJI(this);
        ((AbstractC848400XPy) C0XQ7.LJFF()).LJIILLIIL(this);
        this.LLIZ.LJ();
        C1916800zyo c1916800zyo = this.LLJILJIL;
        if (c1916800zyo != null) {
            ((AbstractC848400XPy) C0XQ7.LJFF()).LJIILLIIL(c1916800zyo);
            EventBus.LIZLLL().LJJI(c1916800zyo);
            C2296808zG.LIZJ(c1916800zyo.LLIZ, null);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onAgeVerificationEvent$compliance_business_release(C0DQM c0dqm) {
        final String str;
        Context context;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "show_new_user_age_verification_android", true, false) && c0dqm != null && (str = c0dqm.LIZ) != null && (context = getContext()) != null) {
            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
            SparkContext sparkContext = new SparkContext();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("aweme://webview?url%3Dhttps%3A%2F%2Finapp.tiktokv.com%2Ftpp%2Finapp%2Fage-verification%2Fverify-state.html%3Fuse_spark%3D1%26hide_nav_bar%3D1%26show_loading%3D1%26should_full_screen%3D1%26disable_swipe%3D1%26scene%3D%@");
            sbLIZ.append(str);
            sparkContext.LJJLIIJ(C2188811AlT.LIZIZ(sbLIZ));
            sparkContext.LJJLIIIJJIZ(new InterfaceC1554220qY0() { // from class: X.0zyf
                @Override // X.InterfaceC1554220qY0
                public final void LIZ() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LIZIZ() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJII() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIIIIZZ() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIIIZ() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIIJ() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIIJJI(SparkPopup sparkPopup, LayoutInflater layoutInflater) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIIL(SparkPopup sparkPopup, Configuration configuration) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIILIIL(SparkPopup sparkPopup, View view) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIILJJIL(SparkPopup sparkPopup) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIILL(SparkPopup sparkPopup, int i) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIILLIIL() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIJ() {
                }

                @Override // X.InterfaceC1554220qY0
                public final boolean LJIJI(SparkPopup sparkPopup) {
                    return false;
                }

                @Override // X.InterfaceC1554220qY0
                public final boolean LJIJJ(SparkPopup sparkPopup) {
                    return false;
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIJJLI(SparkPopup sparkPopup, float f) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIL(SparkPopup sparkPopup) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJJ() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJJI(SparkPopup sparkPopup) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJJII() {
                }

                @Override // X.InterfaceC1554220qY0
                public final boolean LJJIII(SparkPopup sparkPopup, SparkContext sparkContext2) {
                    return false;
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJJIIJ(SparkPopup sparkPopup) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJJIIJZLJL(SparkPopup sparkPopup, boolean z) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJJIIZ() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJJIIZI() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void onViewAttachedToWindow() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void onViewDetachedFromWindow() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIIZILJ(SparkPopup sparkPopup) {
                    C0XQ7.LIZJ().logout("router_action", "user_banned");
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJJIFFI(SparkPopup sparkPopup) {
                    IAgeGateTracker iAgeGateTracker = (IAgeGateTracker) PluggableExtentionKt.pluggableSpi$default(IAgeGateTracker.class, false, false, false, 14, null);
                    if (iAgeGateTracker != null) {
                        iAgeGateTracker.LJ(str);
                    }
                }
            });
            c1537900q7g.getClass();
            new C1541950qED(context, sparkContext).LIZIZ();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onComplianceFeatureAccessEvent(C1916770zyl c1916770zyl) {
        String str = c1916770zyl.LIZ;
        switch (str.hashCode()) {
            case -1687161327:
                if (!str.equals("tiktok_ec_shopmainmix")) {
                    return;
                }
                break;
            case -1483607835:
                if (!str.equals("tiktok_creation_edit")) {
                    return;
                }
                ComplianceServiceProvider.LIZIZ.getClass();
                ComplianceServiceProvider.LJIIJ().LIZJ("creation_edit");
                return;
            case -1294833580:
                if (!str.equals("tiktok_creation_publish")) {
                    return;
                }
                ComplianceServiceProvider.LIZIZ.getClass();
                ComplianceServiceProvider.LJIIJ().LIZJ("creation_publish");
                return;
            case -914238357:
                if (!str.equals("tiktok_ec_shopmain")) {
                    return;
                }
                break;
            case 19530146:
                if (!str.equals("tiktok_live_play")) {
                    return;
                }
                ComplianceServiceProvider.LIZIZ.getClass();
                ComplianceServiceProvider.LJIIJ().LIZJ("live_play");
                return;
            case 1265851556:
                if (!str.equals("tiktok_creation_shoot")) {
                    return;
                }
                ComplianceServiceProvider.LIZIZ.getClass();
                ComplianceServiceProvider.LJIIJ().LIZJ("creation_shoot");
                return;
            default:
                return;
        }
        ComplianceServiceProvider.LIZIZ.getClass();
        ComplianceServiceProvider.LJIIJ().LIZJ("e_commerce");
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC1593530rZP
    public final void onCreate(Bundle bundle) {
        boolean z;
        boolean zLJI = MethodIDManager.LJI(202330);
        String strJ4 = C786410Ut5.j4("main_act_assem_lifecycle_%s_%s", new Object[]{"ComplianceBusinessActivityAssem", "onCreate_with_bundle"});
        C1150504el.LIZ().LIZLLL(strJ4, false);
        super.onCreate(bundle);
        if (C290540Ba8.LIZ()) {
            IGatekeeperService iGatekeeperService = (IGatekeeperService) ServiceManager.get().getService(IGatekeeperService.class);
            if (bundle == null) {
                z = true;
            } else {
                z = false;
            }
            iGatekeeperService.LIZJ(z);
        }
        IUserBanDepService.LIZ.getClass();
        C1519390pdp.LIZ().LIZIZ(new AtomicBoolean(false));
        EventBus.LIZLLL().LJIJJ(this);
        C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.09jy
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ComplianceBusinessActivityAssem@bd02.disableThirdPartySDK$1");
                try {
                    if (C10EU.LJIIIIZZ()) {
                        ComplianceServiceProvider.LJII().LJIILLIIL();
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ComplianceBusinessActivityAssem@bd02.disableThirdPartySDK$1");
            }
        });
        if (!((Boolean) C108800b8.LIZ.getValue()).booleanValue()) {
            C799900VZk.LIZ.getClass();
            C799890VZj c799890VZj = new C799890VZj();
            c799890VZj.LIZ(new InitHydrogenTask());
            c799890VZj.LIZ(new PNSNormalStateMachineInitTask());
            c799890VZj.LIZ(new ComplianceBackgroundLegoTask());
            c799890VZj.LIZ(new ComplianceFirstFocusLegoTask());
            c799890VZj.LIZIZ();
        }
        C786410Ut5.LJJZZIII(new BPEAHandler(), new Runnable() { // from class: X.0zyg
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ComplianceBusinessActivityAssem@bd02.onCreate$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ComplianceBusinessActivityAssem@bd02.onCreate$1");
            }

            public final void LIZ() {
                ((AbstractC848400XPy) C0XQ7.LJFF()).LJJIFFI(this.LL);
                C102U.LIZ.getClass();
                if (C102U.LIZLLL() == EnumC191814102i.PASS) {
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("type", "app_launch");
                    C20684815ws.LJIILLIIL("no_age_gate_for_registration_error", c2344009Gk.LIZ);
                }
            }
        });
        C19476611Hw c19476611HwLJL = this.LLILZLL.LJL(C11S5.LIZIZ);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.LLIZ.LIZ(c19476611HwLJL.LJLIL(30000L, timeUnit).LJJI(1000L, timeUnit).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0TAh
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("ComplianceBusinessActivityAssem@bd02.onCreate$2");
                Activity activityLJFF = C2214201BlK.LJFF();
                if (activityLJFF != null) {
                    C1389890mGx c1389890mGx = new C1389890mGx(activityLJFF);
                    c1389890mGx.LJIIIZ(2131828478);
                    c1389890mGx.LJIIJJI();
                }
                C1C7U.LIZIZ("ComplianceBusinessActivityAssem@bd02.onCreate$2");
            }
        }, new C09JN() { // from class: X.0TAi
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("ComplianceBusinessActivityAssem@bd02.onCreate$3");
                C1C7U.LIZIZ("ComplianceBusinessActivityAssem@bd02.onCreate$3");
            }
        }));
        this.LLJILJIL = new C1916800zyo();
        this.LLJ = (C11JF) C1906580ziK.LIZJ().LIZ().LJJIL(new InterfaceC19483011Ki() { // from class: X.0TXg
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                return ((C606810Nr5) obj).LIZIZ;
            }
        }).LJLIIL(1L).LJJJLZIJ(C11S5.LIZ()).LJJLJLI(new AfS197S0100000_28(this, 8));
        C0S78.LJFF(true, AFwS212S0000000_23.get$arr$(58));
        C1150504el.LIZ().LJI(strJ4, false);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onJsBroadCastEvent$compliance_business_release(C484220Iyq c484220Iyq) {
        String strOptString;
        JSONObject jSONObject = c484220Iyq.LIZ;
        if (jSONObject != null) {
            strOptString = jSONObject.optString("eventName");
        } else {
            strOptString = null;
        }
        if (Intrinsics.LJFF(strOptString, "refreshPrivacySettings")) {
            IPrivacyService iPrivacyServiceLJIJJ = ComplianceServiceProvider.LJIJJ();
            if (iPrivacyServiceLJIJJ.LJJIFFI()) {
                iPrivacyServiceLJIJJ.LJJIIJ("js_broadcast");
            } else {
                ComplianceServiceProvider.LJIJJ().LJIILJJIL();
                ComplianceServiceProvider.LJIJJ().LJJIIJZLJL("js_broadcast");
            }
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onMixedAgeEvent$compliance_business_release(C1916780zym c1916780zym) {
        String str;
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().isUserCancelled()) {
            int i = 0;
            if (c1916780zym != null && c1916780zym.LIZ > 0 && !this.LLILZIL) {
                this.LLILZIL = true;
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(getContext(), "aweme://hyd_action/mixed_age_user_consent");
                if (Intrinsics.LJFF(((Keva) this.LLJIJIL.getValue()).getString("mixed_age_seen", CardStruct.IStatusCode.DEFAULT), "1")) {
                    str = "from_relaunch";
                } else {
                    ((Keva) this.LLJIJIL.getValue()).storeString("mixed_age_seen", "1");
                    str = "reactivation_from_mixed_user_nonconsent";
                }
                smartRouteBuildRoute.withParam("enter_from", str);
                if (c1916780zym != null && c1916780zym.LIZ == 1) {
                    i = 1;
                }
                smartRouteBuildRoute.withParam("is_prompt", i ^ 1);
                smartRouteBuildRoute.open();
            }
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onStemFeedUpdateEvent$compliance_business_release(C612920O2g c612920O2g) {
        HomeTabAbility homeTabAbilityLIZ;
        MainActivityScope mainActivityScopeLIZLLL = C0S4U.LIZLLL(this);
        if (mainActivityScopeLIZLLL != null && (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZLLL)) != null) {
            homeTabAbilityLIZ.g62(EnumC1585090rLn.STEM_TAB_UPDATE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    @X.C14EU(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onUserBannedEvent$compliance_business_release(X.C0XKJ r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L1f
            java.lang.String r0 = r5.LIZ
            if (r0 == 0) goto L1f
            boolean r1 = X.C123100dR.LIZ(r0)
            r0 = 1
            if (r1 != r0) goto L1f
        Ld:
            r3 = 0
            if (r0 == 0) goto L3c
            X.01GW r0 = X.C286090BJf.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L21
            return
        L1f:
            r0 = 0
            goto Ld
        L21:
            org.json.JSONObject r0 = r5.LIZLLL     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L3a
            X.04rF r2 = X.C1227904rF.LIZ     // Catch: java.lang.Throwable -> L68
            java.lang.String r1 = X.C786410Ut5.J3(r0)     // Catch: java.lang.Throwable -> L68
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            r2.getClass()     // Catch: java.lang.Throwable -> L68
            java.lang.Object r2 = X.C1227904rF.LIZJ(r1, r0)     // Catch: java.lang.Throwable -> L68
            java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Throwable -> L68
        L36:
            X.C189200o6.m2constructorimpl(r2)     // Catch: java.lang.Throwable -> L68
            goto L74
        L3a:
            r2 = r3
            goto L36
        L3c:
            X.01GW r0 = r4.LLILLJJLI
            java.lang.Object r0 = r0.getValue()
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.0caF r0 = (X.InterfaceC1017450caF) r0
            boolean r0 = r0.isADShowing()
            if (r0 != 0) goto L95
            X.0XKH r0 = com.ss.android.ugc.tiktok.ban.IUserBanAdapterService.LIZ
            r0.getClass()
            com.ss.android.ugc.tiktok.ban.IUserBanAdapterService r2 = X.C0XKH.LIZ()
            if (r2 == 0) goto L95
            if (r5 == 0) goto L65
            int r0 = r5.LIZIZ
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = r5.LIZJ
        L61:
            r2.LIZ(r1, r0, r3)
            return
        L65:
            r1 = r3
            r0 = r3
            goto L61
        L68:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r2 = new X.00Yq
            r2.<init>(r0)
            X.C189200o6.m2constructorimpl(r2)
        L74:
            boolean r0 = X.C189200o6.m7isFailureimpl(r2)
            if (r0 == 0) goto L7b
            r2 = r3
        L7b:
            java.util.Map r2 = (java.util.Map) r2
            X.0XKH r0 = com.ss.android.ugc.tiktok.ban.IUserBanAdapterService.LIZ
            r0.getClass()
            com.ss.android.ugc.tiktok.ban.IUserBanAdapterService r1 = X.C0XKH.LIZ()
            if (r1 == 0) goto L95
            if (r5 == 0) goto L96
            int r0 = r5.LIZIZ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r3 = r5.LIZJ
        L92:
            r1.LIZ(r0, r3, r2)
        L95:
            return
        L96:
            r0 = r3
            goto L92
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.business.banappeal.ComplianceBusinessActivityAssem.onUserBannedEvent$compliance_business_release(X.0XKJ):void");
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onUserIsMemorialisedBlockEvent$compliance_business_release(C746970TRv c746970TRv) {
        String memorialisedAccountFeedbackEntrance;
        try {
            memorialisedAccountFeedbackEntrance = C0CLW.LIZIZ.LIZ.getFeedbackConf().getMemorialisedAccountFeedbackEntrance();
        } catch (C316660CbA e) {
            TryCatchGuardChecker.doCheck(e);
            memorialisedAccountFeedbackEntrance = "";
        }
        BaseActivity baseActivity = (BaseActivity) this.LL.getValue();
        if (baseActivity != null) {
            C1397580mTM c1397580mTM = new C1397580mTM(baseActivity);
            C1235760iGM.LIZ(c1397580mTM, R.raw.icon_exclamation_mark_circle, null, 6);
            c1397580mTM.LJFF(2131837161);
            c1397580mTM.LIZ(2131837160);
            C985403tE.LIZ(c1397580mTM, new AwS126S1100000_12(baseActivity, memorialisedAccountFeedbackEntrance, 4));
            c1397580mTM.LJII = false;
            new C1397510mTF(c1397580mTM).LIZLLL();
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onUserWriteBlockedEvent$compliance_business_release(C0XKG c0xkg) {
        this.LLILZLL.onNext("");
    }

    public static void bo(BaseActivity baseActivity, AGSWarningPopupWindow aGSWarningPopupWindow) {
        CharSequence charSequenceLIZ;
        if (baseActivity == null) {
            return;
        }
        TextWithInlineLink textWithInlineLink = aGSWarningPopupWindow.content;
        if (textWithInlineLink == null) {
            charSequenceLIZ = "";
        } else {
            charSequenceLIZ = C03GZ.LIZ(textWithInlineLink, baseActivity, AFwS231S0000000_3.get$arr$(171), 2);
        }
        C1397580mTM c1397580mTM = new C1397580mTM(baseActivity);
        c1397580mTM.LJI(aGSWarningPopupWindow.title);
        c1397580mTM.LIZIZ(charSequenceLIZ);
        C985403tE.LIZ(c1397580mTM, new AwS394S0200000_28(baseActivity, aGSWarningPopupWindow, 63));
        c1397580mTM.LJ(AFwS271S0000000_28.get$arr$(297));
        c1397580mTM.LJII = false;
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.0TOx] */
    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC1593530rZP
    public final void onWindowFocusChanged(boolean z, boolean z2) {
        Context context;
        IGatekeeperService iGatekeeperService = (IGatekeeperService) ServiceManager.get().getService(IGatekeeperService.class);
        Bundle bundle = new Bundle();
        bundle.putBoolean("has_focus", z);
        bundle.putBoolean("is_first_visible", this.LLILZ);
        iGatekeeperService.LJIIIIZZ("WindowFocusChanged", bundle, null);
        this.LLILLL = false;
        if (z && this.LLILZ) {
            this.LLILZ = false;
            this.LLILLL = true;
        }
        if (!this.LLILLL && (context = (Context) this.LL.getValue()) != null) {
            ComplianceServiceProvider.LJIILIIL().LJJIJIIJIL(context, new InterfaceC745990TOb() { // from class: X.0TOx
                @Override // X.InterfaceC745990TOb
                public final void LIZ(boolean z3) {
                    ComplianceServiceProvider.LJIILIIL().LJIJ();
                }
            });
        }
    }

    @Override // X.InterfaceC427710Gpt
    public final void LLLLLLZZ(int i, User user, User user2) {
        AGSWarning agsWarning;
        AGSWarningPopupWindow aGSWarningPopupWindow;
        if ((i != 1 && i != 2 && i != 3 && i != 4) || user2 == null || (agsWarning = user2.getAgsWarning()) == null || (aGSWarningPopupWindow = agsWarning.agsWarningPopupWindow) == null || aGSWarningPopupWindow.content == null) {
            return;
        }
        if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            bo((BaseActivity) this.LL.getValue(), aGSWarningPopupWindow);
        } else {
            C15O7.LIZIZ(new ACallableS254S0200000_28(this, aGSWarningPopupWindow, 0), C15O7.LJIIIIZZ, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC1593530rZP
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        Activity activity;
        if (i2 != 10 || intent == null) {
            return false;
        }
        if (intent.getIntExtra("result", -1) == 0 && (activity = (Activity) this.LL.getValue()) != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activity);
            c1389890mGx.LJIIIZ(2131845034);
            c1389890mGx.LJIIJJI();
            return true;
        }
        return true;
    }
}
