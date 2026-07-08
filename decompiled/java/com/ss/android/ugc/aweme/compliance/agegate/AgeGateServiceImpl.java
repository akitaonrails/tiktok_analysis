package com.ss.android.ugc.aweme.compliance.agegate;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C05ES;
import X.C05ET;
import X.C09JN;
import X.C0TGX;
import X.C0X53;
import X.C0X54;
import X.C0XQ7;
import X.C0XQZ;
import X.C10GR;
import X.C10VY;
import X.C10WF;
import X.C11NZ;
import X.C11S5;
import X.C13LP;
import X.C14EU;
import X.C1668306g5;
import X.C1701940uOG;
import X.C1915020zvw;
import X.C1916950zz3;
import X.C1917070zzF;
import X.C191815102j;
import X.C19249810Sq;
import X.C19257210Vm;
import X.C1954807lC;
import X.C19EG;
import X.C20684815ws;
import X.C2097608Jq;
import X.C23250099c;
import X.C2344009Gk;
import X.C294570Bgd;
import X.C312940COm;
import X.C452501pT;
import X.C7852034w;
import X.C7853034x;
import X.C844470XAv;
import X.EnumC1778640wNy;
import X.EnumC191814102i;
import X.InterfaceC19256710Vh;
import X.InterfaceC313170CPj;
import Y.AfS0S1000100_9;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.keva.KevaImpl;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.changeregionapi.api.IPNSChangeRegionService;
import com.ss.android.ugc.aweme.compliance.agegate.api.IAgeGateLogParamsProvider;
import com.ss.android.ugc.aweme.compliance.agegate.api.IAgeGateTracker;
import com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService;
import com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pns.agegate.IPNSAgeFromStoreService;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSFeedbackModel;
import com.ss.android.ugc.aweme.pns.agegate.view.PNSAgeGateContainerActivity;
import com.ss.android.ugc.aweme.pns.agegate.viewmodels.PNSContainerViewModel;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.IGatekeeperService;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.networkservice.DecisionMakerNetworkApi;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.model.DoBStatus;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public class AgeGateServiceImpl implements IAgeGateService, IAgeGateLogParamsProvider {
    public static String LJ;
    public static C10VY LJFF;
    public static InterfaceC19256710Vh LJI;
    public static boolean LJII;
    public static Map<String, String> LJIIIIZZ = C2097608Jq.LJ();
    public static boolean LJIIIZ;
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(101));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(99));
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 125));
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(100));

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final boolean LJI() {
        return true;
    }

    @C14EU
    public final void onBottomSheetOptionClickEvent(C7852034w c7852034w) {
    }

    @C14EU
    public final void onBottomSheetOptionClickEvent(C7853034x c7853034x) {
    }

    public static boolean LJ() {
        User currentUser;
        IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
        return (iUserService == null || (currentUser = iUserService.getCurrentUser()) == null || currentUser.getAgeGateAction() != EnumC191814102i.US_FTC.getValue()) ? false : true;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final EnumC191814102i LIZ() {
        IComplianceSettingsService iComplianceSettingsService = (IComplianceSettingsService) PluggableExtentionKt.pluggableSpi$default(IComplianceSettingsService.class, false, false, false, 14, null);
        if (iComplianceSettingsService != null) {
            return iComplianceSettingsService.LIZ();
        }
        return null;
    }

    public final C19257210Vm LIZLLL() {
        return (C19257210Vm) this.LIZLLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final boolean LJFF() {
        IComplianceSettingsService iComplianceSettingsService = (IComplianceSettingsService) PluggableExtentionKt.pluggableSpi$default(IComplianceSettingsService.class, false, false, false, 14, null);
        return iComplianceSettingsService != null && iComplianceSettingsService.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final int LJII() {
        return KevaImpl.getRepo("age_gate", 1).getInt("age_gate_status", EnumC1778640wNy.NOT_SHOWN.ordinal());
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final boolean LJIIL() {
        List<DecisionMakerNetworkApi.PPFActionModel> list;
        IGatekeeperService iGatekeeperService = (IGatekeeperService) PluggableExtentionKt.pluggableSpi$default(IGatekeeperService.class, false, false, false, 14, null);
        DecisionMakerNetworkApi.EligibilityModel eligibilityModelLIZ = iGatekeeperService != null ? iGatekeeperService.LIZ("tiktok_profile_page") : null;
        return (eligibilityModelLIZ == null || (list = eligibilityModelLIZ.actionList) == null || !(list.isEmpty() ^ true)) ? false : true;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final IPNSAgeFromStoreService LJIJJ() {
        return (IPNSAgeFromStoreService) this.LIZJ.getValue();
    }

    public final boolean LJJ() {
        User currentUser;
        IUserService iUserService = (IUserService) this.LIZ.getValue();
        if (iUserService != null && (currentUser = iUserService.getCurrentUser()) != null) {
            int ageGateAction = currentUser.getAgeGateAction();
            EnumC191814102i.Companion.getClass();
            EnumC191814102i enumC191814102i = EnumC191814102i.MAP.get(Integer.valueOf(ageGateAction));
            if (enumC191814102i == null) {
                enumC191814102i = EnumC191814102i.PASS;
            }
            int i = C191815102j.LIZ[enumC191814102i.ordinal()];
            if (i != 1) {
                if (i == 2 || i == 3) {
                    return true;
                }
                throw new C1954807lC();
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final void dismiss() {
        String str = PNSAgeGateContainerActivity._pnsPageId;
        PNSAgeGateContainerActivity pNSAgeGateContainerActivity = PNSAgeGateContainerActivity.LLILLL;
        if (pNSAgeGateContainerActivity != null) {
            pNSAgeGateContainerActivity.finish();
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final void refreshUiModel() {
        PNSAgeGateContainerActivity pNSAgeGateContainerActivity = PNSAgeGateContainerActivity.LLILLL;
        if (pNSAgeGateContainerActivity != null) {
            PNSContainerViewModel pNSContainerViewModel = (PNSContainerViewModel) pNSAgeGateContainerActivity.LLILLJJLI.getValue();
            pNSContainerViewModel.getClass();
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(pNSContainerViewModel), null, null, new C05ES(pNSContainerViewModel, null), 3);
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final C19257210Vm LJIJI() {
        return LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final boolean isFtcForRegistration() {
        String storeRegion;
        if (LIZ() != EnumC191814102i.PASS) {
            return LIZ() == EnumC191814102i.US_FTC;
        }
        IPNSChangeRegionService iPNSChangeRegionService = (IPNSChangeRegionService) PluggableExtentionKt.pluggableSpi$default(IPNSChangeRegionService.class, false, false, false, 14, null);
        return Intrinsics.LJFF((iPNSChangeRegionService == null || (storeRegion = iPNSChangeRegionService.getStoreRegion()) == null) ? null : storeRegion.toUpperCase(Locale.ROOT), "US");
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final String LIZIZ() {
        return LJ;
    }

    @Override // com.ss.android.ugc.aweme.compliance.agegate.api.IAgeGateLogParamsProvider
    public final Map<String, String> LIZJ() {
        return LJIIIIZZ;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final Class<C1917070zzF> LJIIJ() {
        return C1917070zzF.class;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final Class LJIILLIIL() {
        return PNSAgeGateContainerActivity.class;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final Class<C1916950zz3> LJIIZILJ() {
        return C1916950zz3.class;
    }

    public static void LJIL(boolean z) {
        EnumC1778640wNy enumC1778640wNy;
        if (z) {
            enumC1778640wNy = EnumC1778640wNy.SHOWN;
        } else {
            enumC1778640wNy = EnumC1778640wNy.NOT_SHOWN;
        }
        KevaImpl.getRepo("age_gate", 1).storeInt("age_gate_status", enumC1778640wNy.ordinal());
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getAgeGateAction(), "age_gate_action");
        c2344009Gk.LIZJ(z ? 1 : 0, "result");
        C20684815ws.LJIILLIIL("check_age_gate_status", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final void LJIIIZ(String str) {
        LJII = false;
        C10VY c10vy = LJFF;
        if (c10vy != null) {
            c10vy.LIZ(str, true);
        }
        LJFF = null;
        InterfaceC19256710Vh interfaceC19256710Vh = LJI;
        if (interfaceC19256710Vh != null) {
            interfaceC19256710Vh.LIZ(str, true);
        }
        LJI = null;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final void LJIILJJIL(Activity activity) {
        boolean z;
        SmartRoute smartRouteBuildRoute;
        boolean z2 = activity instanceof C19EG;
        final C19EG c19eg = null;
        if (z2 && activity != null) {
            new Object() { // from class: X.10Vi
            }.getClass();
            AbstractC848400XPy abstractC848400XPy = (AbstractC848400XPy) C0XQ7.LJFF();
            if (abstractC848400XPy.isLogin() && abstractC848400XPy.getCurUser().getUserMode() == 2 && C0XQZ.LIZ().getBoolean("ftc_create_account_showing", false)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                IAgeGateTracker iAgeGateTracker = (IAgeGateTracker) this.LIZIZ.getValue();
                if (iAgeGateTracker != null) {
                    iAgeGateTracker.LIZJ();
                }
                LJII = true;
                smartRouteBuildRoute = SmartRouter.buildRoute(activity, "//account/ftc");
                smartRouteBuildRoute.withParam("is_existing_user", true);
                smartRouteBuildRoute.withParam("next_page", 1);
                smartRouteBuildRoute.withParam("enter_type", "click_sign_up");
            } else {
                AbstractC848400XPy abstractC848400XPy2 = (AbstractC848400XPy) C0XQ7.LJFF();
                if (abstractC848400XPy2.isLogin() && abstractC848400XPy2.getCurUser().getUserMode() == 2 && C0XQZ.LIZ().getBoolean("ftc_create_password_showing", false)) {
                    IAgeGateTracker iAgeGateTracker2 = (IAgeGateTracker) this.LIZIZ.getValue();
                    if (iAgeGateTracker2 != null) {
                        iAgeGateTracker2.LIZLLL();
                    }
                    LJII = true;
                    smartRouteBuildRoute = SmartRouter.buildRoute(activity, "//account/ftc");
                    smartRouteBuildRoute.withParam("is_existing_user", true);
                    smartRouteBuildRoute.withParam("next_page", 52);
                    smartRouteBuildRoute.withParam("enter_type", "click_sign_up");
                } else if (C0XQZ.LIZ().getBoolean("ftc_delete_video_alert_showing", false)) {
                    IAgeGateTracker iAgeGateTracker3 = (IAgeGateTracker) this.LIZIZ.getValue();
                    if (iAgeGateTracker3 != null) {
                        iAgeGateTracker3.LIZ();
                    }
                    boolean z3 = C0XQZ.LIZ().getBoolean("ftc_age_gate_response_prompt", true);
                    smartRouteBuildRoute = SmartRouter.buildRoute(activity, "aweme://hyd_action/delete_video_us");
                    smartRouteBuildRoute.withParam("enter_from", "from_kids_flow_recovery");
                    smartRouteBuildRoute.withParam("is_existing_user", true);
                    smartRouteBuildRoute.withParam("is_prompt", z3 ? 1 : 0);
                    smartRouteBuildRoute.withParam("age_gate_post_action", EnumC191814102i.US_FTC.getValue());
                    smartRouteBuildRoute.withParam("is_kids", 1);
                    smartRouteBuildRoute.withParam("username", "");
                } else {
                    return;
                }
            }
            if (z2) {
                c19eg = (C19EG) activity;
            }
            final AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(smartRouteBuildRoute, 1806);
            PopupManager.LJIJI(new C10GR(c19eg, awS553S0100000_9) { // from class: X.0Nr7
                public final C19EG LL;
                public final Function0<Unit> LLILLJJLI;
                public final int LLILLL = 105;

                @Override // X.InterfaceC20660415sw
                public final C688120Qyw i2() {
                    Context contextLJFF = C2214201BlK.LJFF();
                    if (contextLJFF == null) {
                        contextLJFF = this.LL;
                    }
                    if (contextLJFF instanceof C19EG) {
                        return new C688120Qyw(contextLJFF, (LifecycleOwner) contextLJFF, null);
                    }
                    return null;
                }

                @Override // X.InterfaceC20660515sx
                public final int getPriority() {
                    return this.LLILLL;
                }

                {
                    this.LL = c19eg;
                    this.LLILLJJLI = awS553S0100000_9;
                }

                @Override // X.InterfaceC20659015si
                public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                    this.LLILLJJLI.invoke();
                }
            }, true);
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final void LJIILL(String str) {
        LJ = str;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final void displayFeedback(PNSFeedbackModel pNSFeedbackModel) {
        PNSAgeGateContainerActivity pNSAgeGateContainerActivity = PNSAgeGateContainerActivity.LLILLL;
        if (pNSAgeGateContainerActivity != null) {
            AFwS271S0000000_28 aFwS271S0000000_28 = AFwS271S0000000_28.get$arr$(34);
            PNSContainerViewModel pNSContainerViewModel = (PNSContainerViewModel) pNSAgeGateContainerActivity.LLILLJJLI.getValue();
            pNSContainerViewModel.getClass();
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(pNSContainerViewModel), null, null, new C05ET(pNSContainerViewModel, pNSFeedbackModel, aFwS271S0000000_28, null), 3);
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final boolean LJIIJJI(C19249810Sq c19249810Sq, boolean z) {
        C10WF c10wf = c19249810Sq.LIZ;
        if (c10wf == C10WF.US_FTC) {
            Bundle bundle = new Bundle();
            bundle.putInt("next_page", 1);
            if (z) {
                bundle.putBoolean("is_existing_user", true);
            }
            bundle.putInt("is_prompt", c19249810Sq.LIZLLL ? 1 : 0);
            bundle.putInt("age_gate_post_action", EnumC191814102i.US_FTC.getValue());
            C844470XAv.LIZ.getClass();
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(C844470XAv.LIZ(), "//account/ftc");
            smartRouteBuildRoute.withParam(bundle);
            smartRouteBuildRoute.open();
        } else if (c10wf == C10WF.EU_EEA) {
            C844470XAv.LIZ.getClass();
            SmartRoute smartRouteBuildRoute2 = SmartRouter.buildRoute(C844470XAv.LIZ(), "aweme://hyd_action/account_deleted");
            smartRouteBuildRoute2.withParam("age_gate_time", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getAgeGateTime());
            smartRouteBuildRoute2.withParam("is_prompt", c19249810Sq.LIZLLL ? 1 : 0);
            smartRouteBuildRoute2.withParam("age_gate_post_action", c19249810Sq.LIZ.getValue());
            smartRouteBuildRoute2.open();
        }
        LJIIIZ = false;
        return true;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.10VZ] */
    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final void LJIILIIL(Activity activity, final C0X53 c0x53) {
        if (activity == null) {
            activity = ActivityStack.getTopActivity();
        }
        if (LJJ()) {
            C20684815ws.onEventV3("age_gate_should_popup");
        }
        if (!LJII && LJJ() && (activity instanceof C19EG)) {
            LJFF = new C10VY(c0x53);
            final ?? r4 = new C0X54() { // from class: X.10VZ
                @Override // X.C0X54
                public final void LIZ() {
                    InterfaceC19256010Va interfaceC19256010Va = c0x53;
                    if (interfaceC19256010Va != null) {
                        interfaceC19256010Va.LIZ("", true);
                    }
                }

                @Override // X.C0X54
                public final void LIZIZ() {
                    InterfaceC19256010Va interfaceC19256010Va = c0x53;
                    if (interfaceC19256010Va != null) {
                        interfaceC19256010Va.LIZIZ();
                    }
                }
            };
            C20684815ws.onEventV3("age_gate_popup_task_in_queue");
            final C19EG c19eg = (C19EG) activity;
            final AwS429S0200000_28 awS429S0200000_28 = new AwS429S0200000_28(this, activity, 15);
            C10GR c10gr = new C10GR(c19eg, r4, awS429S0200000_28) { // from class: X.0zzF
                public final C19EG LL;
                public final C0X54 LLILLJJLI;
                public final Function0<Unit> LLILLL;
                public final int LLILZ = 100;

                @Override // X.InterfaceC20660415sw
                public final C688120Qyw i2() {
                    Context contextLJFF = C2214201BlK.LJFF();
                    if (contextLJFF == null) {
                        contextLJFF = this.LL;
                    }
                    if (contextLJFF instanceof C19EG) {
                        return new C688120Qyw(contextLJFF, (LifecycleOwner) contextLJFF, null);
                    }
                    return null;
                }

                @Override // X.InterfaceC20660515sx
                public final int getPriority() {
                    return this.LLILZ;
                }

                @Override // X.InterfaceC20659015si
                public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                    C20684815ws.onEventV3("age_gate_popup_task_executed");
                    this.LLILLL.invoke();
                }

                @Override // X.AbstractC20656215sG
                public final void onPopupStateChanged(EnumC20657015sO enumC20657015sO, EnumC20657015sO enumC20657015sO2) {
                    C0X54 c0x54;
                    super.onPopupStateChanged(enumC20657015sO, enumC20657015sO2);
                    if (enumC20657015sO2 == EnumC20657015sO.SHOWED) {
                        C0X54 c0x542 = this.LLILLJJLI;
                        if (c0x542 != null) {
                            c0x542.LIZIZ();
                            return;
                        }
                        return;
                    }
                    if (enumC20657015sO2 != EnumC20657015sO.DISMISSED || (c0x54 = this.LLILLJJLI) == null) {
                        return;
                    }
                    c0x54.LIZ();
                }

                {
                    this.LL = c19eg;
                    this.LLILLJJLI = r4;
                    this.LLILLL = awS429S0200000_28;
                }
            };
            if (C294570Bgd.LIZ()) {
                PopupManager.LJIIZILJ(c10gr, new C1668306g5("pns_compliance_age_gate_trigger"));
                return;
            } else {
                PopupManager.LJIJI(c10gr, true);
                return;
            }
        }
        LJIL(false);
        c0x53.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final void LJIIIIZZ(final Activity activity, final InterfaceC19256710Vh interfaceC19256710Vh, final String str) {
        if (LJIIIZ) {
            return;
        }
        InterfaceC313170CPj.LIZ.getClass();
        C11NZ<DoBStatus> doBStatus = C312940COm.LIZIZ.getDoBStatus();
        long jCurrentTimeMillis = System.currentTimeMillis();
        doBStatus.LJJIJIIJIL(new AfS0S1000100_9(jCurrentTimeMillis, 0)).LJJIJIIJI(new AfS0S1000100_9(jCurrentTimeMillis, 1)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.10Vc
            /* JADX WARN: Removed duplicated region for block: B:21:0x009e  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x00e1  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x0123  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x0126  */
            @Override // X.C09JN
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void accept(java.lang.Object r24) {
                /*
                    Method dump skipped, instruction units count: 346
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C19256210Vc.accept(java.lang.Object):void");
            }
        }, new C09JN() { // from class: X.10Vd
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("AgeGateServiceImpl@450b.showEditDoBAgeGateWithDobCheck$2");
                C1C7U.LIZIZ("AgeGateServiceImpl@450b.showEditDoBAgeGateWithDobCheck$2");
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final void LJIJ(C19EG c19eg, ViewGroup viewGroup, C0TGX c0tgx) {
        DecisionMakerNetworkApi.EligibilityModel eligibilityModelLIZ;
        List<DecisionMakerNetworkApi.PPFActionModel> list;
        DecisionMakerNetworkApi.PPFActionModel pPFActionModel;
        String str;
        IGatekeeperService iGatekeeperService = (IGatekeeperService) PluggableExtentionKt.pluggableSpi$default(IGatekeeperService.class, false, false, false, 14, null);
        if (iGatekeeperService != null && (eligibilityModelLIZ = iGatekeeperService.LIZ("tiktok_profile_page")) != null && (list = eligibilityModelLIZ.actionList) != null && (pPFActionModel = (DecisionMakerNetworkApi.PPFActionModel) C13LP.LJJJLZIJ(0, list)) != null && (str = pPFActionModel.actionParams) != null) {
            PopupManager.LJIJI(new C1915020zvw(c19eg, viewGroup, c0tgx, str), true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0083  */
    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJLI(com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity r21, X.C1238590iKv r22, java.lang.String r23, int r24, java.lang.String r25, int r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, final int r30, final java.lang.String r31, final int r32, final int r33, final boolean r34) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.agegate.AgeGateServiceImpl.LJIJJLI(com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity, X.0iKv, java.lang.String, int, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, int, int, boolean):void");
    }
}
