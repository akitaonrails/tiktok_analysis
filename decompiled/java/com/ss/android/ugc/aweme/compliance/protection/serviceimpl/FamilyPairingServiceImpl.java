package com.ss.android.ugc.aweme.compliance.protection.serviceimpl;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C0XQ7;
import X.C11S5;
import X.C1233040iBy;
import X.C15XY;
import X.C15YD;
import X.C15YE;
import X.C15YK;
import X.C15YQ;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C257820A8m;
import X.C286080BJe;
import X.C297270Bkz;
import X.C452501pT;
import X.C516201zk;
import X.C5183020f;
import X.C734760Sry;
import X.C786410Ut5;
import X.DialogC1389620mGW;
import X.EnumC20536615Xo;
import X.EnumC20537615Xy;
import Y.AfS144S0000000_27;
import Y.AfS161S0200000_27;
import android.app.Activity;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.compliance.api.model.EngagementCountSettings;
import com.ss.android.ugc.aweme.compliance.api.model.FamilyPairingBean;
import com.ss.android.ugc.aweme.compliance.api.model.GuardianRestrictionBean;
import com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService;
import com.ss.android.ugc.aweme.compliance.protection.familypairing.FamilyPairingManager;
import com.ss.android.ugc.aweme.compliance.protection.familypairing.FamilyPairingManagerV2;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pns.businessmodel.PnSEngagementCountSettings;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AwS377S0200000_11;

/* JADX INFO: loaded from: classes32.dex */
public final class FamilyPairingServiceImpl implements IFamilyPairingService {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(119));

    @Override // com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService
    public final void LJIJJ() {
        C15YQ.LIZ(1).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS144S0000000_27(this, 2), new AfS144S0000000_27(3));
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService
    public final void LJIL() {
        C15YQ.LIZ(2).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS144S0000000_27(this, 0), new AfS144S0000000_27(1));
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService
    public final boolean LJIILJJIL() {
        GuardianRestrictionBean guardianRestrictionBean;
        EngagementCountSettings engagementCountSettings;
        PnSEngagementCountSettings pnSEngagementCountSettings;
        C01GW c01gw = C257820A8m.LIZ;
        if (((Number) c01gw.getValue()).intValue() != 0) {
            return ((Number) c01gw.getValue()).intValue() == 2;
        }
        if (C297270Bkz.LIZ()) {
            C15XY c15xy = (C15XY) this.LIZ.getValue();
            return (c15xy == null || (pnSEngagementCountSettings = (PnSEngagementCountSettings) c15xy.LJIIIIZZ(EnumC20536615Xo.FP_ENGAGEMENT_COUNT_SETTINGS, PnSEngagementCountSettings.class)) == null || !pnSEngagementCountSettings.showRequestPermissionEntry) ? false : true;
        }
        FamilyPairingBean familyPairingBeanLJIIZILJ = LIZ().LJIIZILJ();
        return (familyPairingBeanLJIIZILJ == null || (guardianRestrictionBean = familyPairingBeanLJIIZILJ.restriction) == null || (engagementCountSettings = guardianRestrictionBean.engagementCountSettings) == null || !engagementCountSettings.showRequestPermissionEntry) ? false : true;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService
    public final boolean LJIJ() {
        GuardianRestrictionBean guardianRestrictionBean;
        EngagementCountSettings engagementCountSettings;
        PnSEngagementCountSettings pnSEngagementCountSettings;
        if (((Number) C286080BJe.LIZ.getValue()).intValue() != 0) {
            return true;
        }
        if (C297270Bkz.LIZ()) {
            C15XY c15xy = (C15XY) this.LIZ.getValue();
            return (c15xy == null || (pnSEngagementCountSettings = (PnSEngagementCountSettings) c15xy.LJIIIIZZ(EnumC20536615Xo.FP_ENGAGEMENT_COUNT_SETTINGS, PnSEngagementCountSettings.class)) == null || Integer.valueOf(pnSEngagementCountSettings.engagementCountStatus) == null) ? false : true;
        }
        FamilyPairingBean familyPairingBeanLJIIZILJ = LIZ().LJIIZILJ();
        return (familyPairingBeanLJIIZILJ == null || (guardianRestrictionBean = familyPairingBeanLJIIZILJ.restriction) == null || (engagementCountSettings = guardianRestrictionBean.engagementCountSettings) == null || Integer.valueOf(engagementCountSettings.engagementCountStatus) == null) ? false : true;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService
    public final boolean showEngagementCount() {
        GuardianRestrictionBean guardianRestrictionBean;
        EngagementCountSettings engagementCountSettings;
        PnSEngagementCountSettings pnSEngagementCountSettings;
        C01GW c01gw = C286080BJe.LIZ;
        if (((Number) c01gw.getValue()).intValue() != 0) {
            return ((Number) c01gw.getValue()).intValue() == 2;
        }
        if (C297270Bkz.LIZ()) {
            C15XY c15xy = (C15XY) this.LIZ.getValue();
            if (c15xy == null || (pnSEngagementCountSettings = (PnSEngagementCountSettings) c15xy.LJIIIIZZ(EnumC20536615Xo.FP_ENGAGEMENT_COUNT_SETTINGS, PnSEngagementCountSettings.class)) == null || pnSEngagementCountSettings.engagementCountStatus != 0) {
                return true;
            }
        } else {
            FamilyPairingBean familyPairingBeanLJIIZILJ = LIZ().LJIIZILJ();
            if (familyPairingBeanLJIIZILJ == null || (guardianRestrictionBean = familyPairingBeanLJIIZILJ.restriction) == null || (engagementCountSettings = guardianRestrictionBean.engagementCountSettings) == null || engagementCountSettings.engagementCountStatus != 0) {
                return true;
            }
        }
        return false;
    }

    public static C15YD LIZ() {
        return C297270Bkz.LIZ() ? FamilyPairingManagerV2.LIZ : FamilyPairingManager.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService
    public final EnumC20537615Xy LIZIZ() {
        return LIZ().LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService
    public final boolean LJIIIZ() {
        return LIZ().LJIIIZ();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService
    public final int LJIILL() {
        return LIZ().LJII();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService
    public final boolean LJIJJLI() {
        return LIZ().LJIL();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService
    public final void LJIILIIL() {
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService
    public final void LJI(C734760Sry c734760Sry) {
        c734760Sry.LIZ(showEngagementCount());
        LIZ().LJI(c734760Sry);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService
    public final boolean LJIIJJI(String str) {
        return LIZ().LJIIJJI(str);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService
    public final void LJIIL(C734760Sry c734760Sry) {
        LIZ().LJIIL(c734760Sry);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService
    public final void LJIIZILJ(AwS377S0200000_11 awS377S0200000_11, C5183020f c5183020f) {
        C15YQ.LIZ(1).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS161S0200000_27(this, awS377S0200000_11, c5183020f, 0), new C516201zk(c5183020f, 18));
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService
    public final void LJIJI(Activity activity, String str) {
        C15YE.LIZJ(activity, str);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService
    public final void LJIILLIIL(final Activity activity, final String str, final boolean z) {
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() && ((ISettingService) ServiceManager.get().getService(ISettingService.class)).isShowFamilyPairingForNotLoginUser()) {
            C15YE.LIZ.getClass();
            if (activity != null) {
                if (!C15YE.LIZ()) {
                    C1233040iBy c1233040iBy = new C1233040iBy(activity);
                    c1233040iBy.LIZJ(activity.getString(R.string.jb4));
                    c1233040iBy.LIZLLL();
                    return;
                }
                SmartRouter.buildRoute(activity, "aweme://roma_redirect/?spark_page=fp_welcome_page&enter_from=settings&wellbeing_challenge_enter_from=family_pairing_page&bdhm_bid=i18n_lynx_privacy_and_safety&gecko_url_redirection=1").open();
                return;
            }
            return;
        }
        C15YE.LIZ.getClass();
        if (activity == null) {
            return;
        }
        if (!C15YE.LIZ()) {
            C1233040iBy c1233040iBy2 = new C1233040iBy(activity);
            c1233040iBy2.LIZJ(activity.getString(R.string.jb4));
            c1233040iBy2.LIZLLL();
        } else {
            C15YE.LJIILIIL(C1697810uHb.LJIILJJIL("tns_familypairing", "fe_tns_filter_keywords", "fe_tns_content_levels", "fe_tns_reminder"));
            final DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(activity);
            C786410Ut5.J4(dialogC1389620mGW);
            C15YE.LJIILL(new C15YK() { // from class: X.15Xv
                @Override // X.C15YK
                public final void onSuccess() {
                    C786410Ut5.LJIIJ(dialogC1389620mGW);
                    C15YE.LIZ.getClass();
                    EnumC20537615Xy enumC20537615XyLIZIZ = C15YE.LJ().LIZIZ();
                    if (enumC20537615XyLIZIZ == EnumC20537615Xy.CHILD) {
                        C0XI4 c0xi4 = new C0XI4("aweme://roma_redirect/?spark_page=fp_teen_page&enter_from=settings&wellbeing_challenge_enter_from=family_pairing_page");
                        String str2 = str;
                        boolean z2 = z;
                        c0xi4.LJ("wellbeing_challenge_enter_from", str2);
                        c0xi4.LIZLLL(Boolean.valueOf(z2), "show_badge");
                        SmartRouter.buildRoute(activity, c0xi4.LJFF()).open();
                        return;
                    }
                    if (enumC20537615XyLIZIZ == EnumC20537615Xy.PARENT) {
                        C0XI4 c0xi42 = new C0XI4("aweme://roma_redirect/?spark_page=fp_parent_main_page&enter_from=settings&wellbeing_challenge_enter_from=family_pairing_page");
                        String str3 = str;
                        boolean z3 = z;
                        c0xi42.LJ("wellbeing_challenge_enter_from", str3);
                        c0xi42.LIZLLL(Boolean.valueOf(z3), "show_badge");
                        SmartRouter.buildRoute(activity, c0xi42.LJFF()).open();
                        return;
                    }
                    C0XI4 c0xi43 = new C0XI4("aweme://roma_redirect/?spark_page=fp_welcome_page&enter_from=settings&wellbeing_challenge_enter_from=family_pairing_page&bdhm_bid=i18n_lynx_privacy_and_safety&gecko_url_redirection=1");
                    String str4 = str;
                    boolean z4 = z;
                    c0xi43.LJ("wellbeing_challenge_enter_from", str4);
                    c0xi43.LIZLLL(Boolean.valueOf(z4), "show_badge");
                    SmartRouter.buildRoute(activity, c0xi43.LJFF()).open();
                }

                @Override // X.C15YK
                public final void onFailed(Exception exc) {
                    C786410Ut5.LJIIJ(dialogC1389620mGW);
                    C1354920lMY.LIZJ(activity, exc);
                }
            }, "");
        }
    }
}
