package kotlin.jvm.internal;

import X.AbstractC848400XPy;
import X.AbstractC879060Ye8;
import X.C013C;
import X.C062P;
import X.C09AY;
import X.C0I0B;
import X.C0XGR;
import X.C0XQ7;
import X.C0Z9N;
import X.C1215500hjg;
import X.C1215680hjy;
import X.C1215770hk7;
import X.C1219580hqG;
import X.C1229980i72;
import X.C1230910i8X;
import X.C1230930i8Z;
import X.C1230980i8e;
import X.C1231850iA3;
import X.C1231880iA6;
import X.C1233670iCz;
import X.C1237870iJl;
import X.C1248930ibb;
import X.C1260250itr;
import X.C1260490iuF;
import X.C1260520iuI;
import X.C1260670iuX;
import X.C1397620mTQ;
import X.C1397660mTU;
import X.C1528205ya;
import X.C19EG;
import X.C1ECC;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C491001vg;
import X.C696620RUe;
import X.InterfaceC1231870iA5;
import android.app.Activity;
import android.content.Context;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationActivityViewModel;
import com.ss.android.ugc.aweme.detailpage.manageadmin.viewmodel.ManageAdminViewModel;
import com.ss.android.ugc.aweme.fangroup.fragment.FanGroupListFragment;
import com.ss.android.ugc.aweme.model.BannerDisplayInfo;
import com.ss.android.ugc.aweme.model.PhotoTopicBannerReadStatus;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.profile.business.ur.edit.ProfileLemon8ServiceImpl;
import com.ss.android.ugc.profile.business.ur.editprofileviewmodel.EditProfileNamesViewModel;
import com.ss.android.ugc.profile.business.ur.platform.business.RelationFollowingProtocol;
import com.ss.android.ugc.profile.platform.business.navbar.assemble.ProfileNavBarRootComponent;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public class AwS103S1200000_19 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case 16:
                return invoke$16(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS103S1200000_19 awS103S1200000_19, Object obj) {
        String str;
        String str2 = awS103S1200000_19.s0;
        if (Intrinsics.LJFF(str2, "personal_homepage")) {
            str = "tiktok_selfhomepage_banner";
        } else if (Intrinsics.LJFF(str2, "edit_profile")) {
            str = "tiktok_edit_profile";
        } else {
            str = "";
        }
        if (((Boolean) C1ECC.LIZJ.getValue()).booleanValue()) {
            ((ProfileLemon8ServiceImpl) awS103S1200000_19.l1).LJIIJJI((Activity) awS103S1200000_19.l2, C2097608Jq.LJIIJ(new Pair("from_scene", str)), null, new AwS135S1200000_19((Activity) awS103S1200000_19.l2, (ProfileLemon8ServiceImpl) awS103S1200000_19.l1, str, 0));
        } else {
            ProfileLemon8ServiceImpl.LJIJI((ProfileLemon8ServiceImpl) awS103S1200000_19.l1, (Activity) awS103S1200000_19.l2, str);
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", awS103S1200000_19.s0);
        C20684815ws.LJIILLIIL("click_lemon8_intro_popup", c2344009Gk.LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS103S1200000_19 awS103S1200000_19, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LIZJ(2, awS103S1200000_19.s0, new AwS598S0100000_19((Function0) awS103S1200000_19.l2, (Function0<Unit>) 80));
        c1397620mTQ.LIZJ(1, ((C19EG) awS103S1200000_19.l1).getString(2131857411), null);
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS103S1200000_19 awS103S1200000_19, Object obj) {
        C1397660mTU c1397660mTU = (C1397660mTU) obj;
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute((Activity) awS103S1200000_19.l1, ((C1237870iJl) awS103S1200000_19.l2).LIZLLL);
        smartRouteBuildRoute.withParam("enter_from", ((C1237870iJl) awS103S1200000_19.l2).LIZIZ);
        smartRouteBuildRoute.withParam("enter_method", awS103S1200000_19.s0);
        smartRouteBuildRoute.open();
        C1237870iJl c1237870iJl = (C1237870iJl) awS103S1200000_19.l2;
        c1237870iJl.getClass();
        Locale locale = Locale.ROOT;
        if (Intrinsics.LJFF("instagram".toLowerCase(locale), c1237870iJl.LIZ.toLowerCase(locale))) {
            C0XGR c0xgr = new C0XGR();
            c0xgr.LIZLLL("enter_from", ((C1237870iJl) awS103S1200000_19.l2).LIZIZ);
            c0xgr.LIZLLL("platform", ((C1237870iJl) awS103S1200000_19.l2).LIZ);
            C20684815ws.LJIILLIIL("account_recover_notify_confirm", c0xgr.LIZ);
        } else {
            ((C1237870iJl) awS103S1200000_19.l2).LIZ("use_phone_email", awS103S1200000_19.s0);
        }
        if (!((Activity) awS103S1200000_19.l1).isFinishing()) {
            c1397660mTU.LIZ().LIZIZ(null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS103S1200000_19 awS103S1200000_19, Object obj) {
        C1397660mTU c1397660mTU = (C1397660mTU) obj;
        if (!((Activity) awS103S1200000_19.l1).isFinishing()) {
            c1397660mTU.LIZ().LIZIZ(null);
        }
        ((C1237870iJl) awS103S1200000_19.l2).LIZ("dismiss", awS103S1200000_19.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS103S1200000_19 awS103S1200000_19, Object obj) {
        ManageAdminViewModel manageAdminViewModel = (ManageAdminViewModel) awS103S1200000_19.l1;
        Context context = (Context) awS103S1200000_19.l2;
        String str = awS103S1200000_19.s0;
        ((AbstractC879060Ye8) manageAdminViewModel.LLILLJJLI.getValue()).LJIIZILJ(str, C0Z9N.ORDINARY.getValue(), C2097608Jq.LJ(), new C1219580hqG(context, manageAdminViewModel, str));
        C1528205ya.LIZJ.LJJIII("click_remove_admin_pop", ((ManageAdminViewModel) awS103S1200000_19.l1).vQ2().LL, new Pair[]{new Pair<>("enter_from", "admin_management"), new Pair<>("enter_method", "cell"), new Pair<>("result", "remove")}, C0I0B.LJFF.LIZIZ());
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS103S1200000_19 awS103S1200000_19, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJ(2131830182, new AwS103S1200000_19((Context) awS103S1200000_19.l2, (ManageAdminViewModel) awS103S1200000_19.l1, awS103S1200000_19.s0, 12));
        c1397620mTQ.LJII(2131830190, new AwS598S0100000_19((ManageAdminViewModel) awS103S1200000_19.l1, 883));
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS103S1200000_19 awS103S1200000_19, Object obj) {
        return C1233670iCz.LIZ((C1233670iCz) obj, null, new C491001vg(TwoStepVerificationActivityViewModel.AQ2((TwoStepVerificationActivityViewModel) awS103S1200000_19.l1, (Integer) awS103S1200000_19.l2, awS103S1200000_19.s0)), null, false, null, 29);
    }

    public static final Object invoke$15(AwS103S1200000_19 awS103S1200000_19, Object obj) {
        return C1233670iCz.LIZ((C1233670iCz) obj, null, null, new C491001vg(TwoStepVerificationActivityViewModel.AQ2((TwoStepVerificationActivityViewModel) awS103S1200000_19.l1, (Integer) awS103S1200000_19.l2, awS103S1200000_19.s0)), false, null, 27);
    }

    public static final Object invoke$16(AwS103S1200000_19 awS103S1200000_19, Object obj) {
        TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel = (TwoStepVerificationActivityViewModel) awS103S1200000_19.l1;
        twoStepVerificationActivityViewModel.setState(new AwS103S1200000_19(twoStepVerificationActivityViewModel, (Integer) awS103S1200000_19.l2, awS103S1200000_19.s0, 15));
        TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel2 = (TwoStepVerificationActivityViewModel) awS103S1200000_19.l1;
        twoStepVerificationActivityViewModel2.listSetItems(twoStepVerificationActivityViewModel2.DQ2());
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS103S1200000_19 awS103S1200000_19, Object obj) {
        int i;
        String string;
        C062P c062p = (C062P) obj;
        if (((C1230910i8X) awS103S1200000_19.l1).useSelectStyle()) {
            if (((C1230910i8X) awS103S1200000_19.l1).useAnchorSelectStyle()) {
                C1230930i8Z.LIZLLL.LIZIZ.getClass();
            } else {
                C1230930i8Z.LIZJ.LIZIZ.getClass();
            }
            i = 0;
        } else {
            i = R.attr.zp;
        }
        if (((C1230910i8X) awS103S1200000_19.l1).useSelectStyle()) {
            string = C1230930i8Z.LIZJ.LIZIZ.LIZ;
        } else {
            Context context = ((FanGroupListFragment) awS103S1200000_19.l2).getContext();
            if (context != null) {
                string = context.getString(2131830143);
            } else {
                string = null;
            }
        }
        String str = awS103S1200000_19.s0;
        Integer numValueOf = Integer.valueOf(i);
        if (string == null) {
            string = "";
        }
        c062p.LIZ = new C1229980i72(str, new C1230980i8e(numValueOf, string), 0, false, (C1230910i8X) awS103S1200000_19.l1, 12);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ java.lang.Object invoke$3(kotlin.jvm.internal.AwS103S1200000_19 r9, java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS103S1200000_19.invoke$3(kotlin.jvm.internal.AwS103S1200000_19, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$4(AwS103S1200000_19 awS103S1200000_19, Object obj) {
        if (!((C013C) awS103S1200000_19.l1).element) {
            C1215770hk7 c1215770hk7 = C1215770hk7.LIZ;
            String str = awS103S1200000_19.s0;
            c1215770hk7.getClass();
            if (C1215770hk7.LIZIZ(str)) {
                Keva kevaLIZ = C1215770hk7.LIZ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("username_to_nickname_pop_up_shown_count");
                sbLIZ.append('_');
                sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
                int i = kevaLIZ.getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
                Keva kevaLIZ2 = C1215770hk7.LIZ();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("username_to_nickname_pop_up_shown_count");
                sbLIZ2.append('_');
                sbLIZ2.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
                kevaLIZ2.storeInt(C2188811AlT.LIZIZ(sbLIZ2), i + 1);
            }
        }
        ((InterfaceC1231870iA5) awS103S1200000_19.l2).LIZ(awS103S1200000_19.s0, ((C013C) awS103S1200000_19.l1).element);
        C1231880iA6 c1231880iA6 = C1231880iA6.LIZ;
        boolean z = ((C013C) awS103S1200000_19.l1).element;
        c1231880iA6.getClass();
        C1231880iA6.LIZIZ(true, z);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS103S1200000_19 awS103S1200000_19, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        C013C c013c = (C013C) awS103S1200000_19.l1;
        c1397620mTQ.LJFF(2131845401, new AwS103S1200000_19((InterfaceC1231870iA5) awS103S1200000_19.l2, awS103S1200000_19.s0, c013c, 4));
        c1397620mTQ.LJII(2131845402, new AwS385S0200000_19((InterfaceC1231870iA5) awS103S1200000_19.l2, (C013C) awS103S1200000_19.l1, 77));
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS103S1200000_19 awS103S1200000_19, Object obj) {
        ((InterfaceC1231870iA5) awS103S1200000_19.l1).onCanceled();
        C1231880iA6 c1231880iA6 = C1231880iA6.LIZ;
        boolean z = ((C013C) awS103S1200000_19.l2).element;
        String str = awS103S1200000_19.s0;
        c1231880iA6.getClass();
        C1231880iA6.LIZ(str, false, z);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS103S1200000_19 awS103S1200000_19, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        if (iIntValue != 0) {
            if (iIntValue == 1 || iIntValue == 2) {
                C1260490iuF c1260490iuFLIZ = C1260250itr.LIZ();
                c1260490iuFLIZ.LJFF(c1260490iuFLIZ.LIZJ() + 1);
                C1260490iuF.LJII(C1260250itr.LIZ());
                C1260250itr.LIZ().LIZIZ();
                C1260520iuI.LIZIZ.LIZJ(PhotoTopicBannerReadStatus.DISMISS, null, null, null, null);
                C1260670iuX.LIZLLL((C1260670iuX) awS103S1200000_19.l2, String.valueOf(((BannerDisplayInfo) awS103S1200000_19.l1).category), awS103S1200000_19.s0, "manual");
            }
        } else {
            if (C1260250itr.LIZ().LIZ.getInt(C1260490iuF.LJ("photo_mode_banner_bottom_show_times"), 0) > 0) {
                C1260490iuF c1260490iuFLIZ2 = C1260250itr.LIZ();
                c1260490iuFLIZ2.LJFF(c1260490iuFLIZ2.LIZJ() + 1);
                C1260490iuF.LJII(C1260250itr.LIZ());
                C1260250itr.LIZ().LIZIZ();
                C1260520iuI.LIZIZ.LIZJ(PhotoTopicBannerReadStatus.DISMISS, null, null, null, null);
            } else {
                C1260250itr.LIZ().LJFF(1);
                C1260490iuF.LJII(C1260250itr.LIZ());
                C1260490iuF c1260490iuFLIZ3 = C1260250itr.LIZ();
                c1260490iuFLIZ3.LIZ.storeInt(C1260490iuF.LJ("photo_mode_banner_bottom_show_times"), c1260490iuFLIZ3.LIZ.getInt(C1260490iuF.LJ("photo_mode_banner_bottom_show_times"), 0) + 1);
            }
            C1260670iuX.LIZLLL((C1260670iuX) awS103S1200000_19.l2, String.valueOf(((BannerDisplayInfo) awS103S1200000_19.l1).category), awS103S1200000_19.s0, "auto");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS103S1200000_19 awS103S1200000_19, Object obj) {
        String str = awS103S1200000_19.s0;
        ((EditProfileNamesViewModel) awS103S1200000_19.l1).getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tiktok.com/@");
        sbLIZ.append(str);
        return C1215500hjg.LIZ((C1215500hjg) obj, str, null, C2188811AlT.LIZIZ(sbLIZ), 0, null, false, false, false, null, (C1215680hjy) awS103S1200000_19.l2, null, null, 3578);
    }

    public static final Object invoke$9(AwS103S1200000_19 awS103S1200000_19, Object obj) {
        C696620RUe c696620RUe = (C696620RUe) obj;
        c696620RUe.LL = ((C1248930ibb) awS103S1200000_19.l1).LIZIZ;
        c696620RUe.LLILLJJLI = awS103S1200000_19.s0;
        c696620RUe.LLJ = ((ProfileNavBarRootComponent) awS103S1200000_19.l2).bp();
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS103S1200000_19(X.InterfaceC1231870iA5 r3, java.lang.String r4, X.C013C r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            int r6 = 4 - r6
            if (r6 == 0) goto L12
            r1 = r2
            r1.l1 = r3
            r1.l2 = r5
            r1.s0 = r4
            r0 = 1
        Le:
            r1.<init>(r0)
            return
        L12:
            r1 = r2
            r1.l1 = r5
            r1.s0 = r4
            r1.l2 = r3
            r0 = 1
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS103S1200000_19.<init>(X.0iA5, java.lang.String, X.013C, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS103S1200000_19(C1230910i8X c1230910i8X, FanGroupListFragment fanGroupListFragment, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1230910i8X;
        this.l2 = fanGroupListFragment;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS103S1200000_19(C1231850iA3 c1231850iA3, String str, C013C c013c, int i) {
        super(1);
        this.$t = i;
        this.l1 = c013c;
        this.s0 = str;
        this.l2 = c1231850iA3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS103S1200000_19(C1248930ibb c1248930ibb, String str, ProfileNavBarRootComponent profileNavBarRootComponent, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1248930ibb;
        this.s0 = str;
        this.l2 = profileNavBarRootComponent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS103S1200000_19(C19EG c19eg, String str, AwS137S0110000_19 awS137S0110000_19, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c19eg;
        this.l2 = awS137S0110000_19;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS103S1200000_19(Activity activity, C1237870iJl c1237870iJl, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = activity;
        this.l2 = c1237870iJl;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS103S1200000_19(Activity activity, ProfileLemon8ServiceImpl profileLemon8ServiceImpl, String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = profileLemon8ServiceImpl;
        this.l2 = activity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS103S1200000_19(Context context, ManageAdminViewModel manageAdminViewModel, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = manageAdminViewModel;
        this.l2 = context;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS103S1200000_19(TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel, Integer num, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = twoStepVerificationActivityViewModel;
        this.l2 = num;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS103S1200000_19(BannerDisplayInfo bannerDisplayInfo, C1260670iuX c1260670iuX, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = bannerDisplayInfo;
        this.l2 = c1260670iuX;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS103S1200000_19(RelationFollowingProtocol relationFollowingProtocol, C19EG c19eg, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = relationFollowingProtocol;
        this.l2 = c19eg;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS103S1200000_19(String str, EditProfileNamesViewModel editProfileNamesViewModel, C1215680hjy c1215680hjy, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = editProfileNamesViewModel;
        this.l2 = c1215680hjy;
    }
}
