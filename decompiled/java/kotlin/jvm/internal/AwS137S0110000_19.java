package kotlin.jvm.internal;

import X.C09AY;
import X.C0FNV;
import X.C0TN5;
import X.C0TVK;
import X.C0XQ5;
import X.C0XQ7;
import X.C0XTR;
import X.C0XWJ;
import X.C1233710iD3;
import X.C1233960iDS;
import X.C1235080iFG;
import X.C1262300ixA;
import X.C1262980iyG;
import X.C12ES;
import X.C13BV;
import X.C1458750o41;
import X.C1899490zWt;
import X.C19EG;
import X.C293530Bex;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.DialogC1240080iNK;
import X.EnumC1234990iF7;
import X.EnumC1235020iFA;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.ILoginService;
import com.ss.android.ugc.aweme.account.login.rememberaccount.LoginMethodListFragment;
import com.ss.android.ugc.aweme.account.login.twostep.AvailableWaysUserData;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationActivityAssem;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManagementActivity;
import com.ss.android.ugc.aweme.account.security.SecurityCheckUpViewModel;
import com.ss.android.ugc.aweme.relation.usercard.vm.UserCardListViewModel;
import com.ss.android.ugc.aweme.services.PasswordService;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.profile.business.ur.platform.HeaderRecommendUserCardUserComponent;
import com.ss.android.ugc.profile.business.ur.ui.ProfileEditFragment;
import com.ss.android.ugc.profile.platform.base.base.ProfileInfoAssem;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes20.dex */
public class AwS137S0110000_19 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case 16:
                return invoke$16(this);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS137S0110000_19 awS137S0110000_19) {
        String str;
        if (awS137S0110000_19.z1) {
            C19EG activity = ((TwoStepVerificationActivityAssem) awS137S0110000_19.l0).getActivity();
            if (activity != null) {
                activity.finish();
            }
        } else {
            ILoginService iLoginServiceLIZJ = C0XQ7.LIZJ();
            Bundle bundle = new Bundle();
            bundle.putBoolean("should_force_logout", true);
            iLoginServiceLIZJ.logout("user_logout", "user_logout", bundle, null);
            ((TwoStepVerificationActivityAssem) awS137S0110000_19.l0).cp();
        }
        C1233960iDS c1233960iDS = C1233960iDS.LIZ;
        C13BV c13bv = C13BV.INSTANCE;
        String enterFrom = ((TwoStepVerificationActivityAssem) awS137S0110000_19.l0).getEnterFrom();
        if (awS137S0110000_19.z1) {
            str = "dismiss";
        } else {
            str = "logout";
        }
        c1233960iDS.getClass();
        C1233960iDS.LIZJ("off", enterFrom, false, str, c13bv);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS137S0110000_19 awS137S0110000_19) {
        boolean z;
        if (awS137S0110000_19.z1 && Intrinsics.LJFF(((AvailableWaysUserData) awS137S0110000_19.l0).has_mobile, Boolean.TRUE)) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$10(AwS137S0110000_19 awS137S0110000_19) {
        C1262980iyG c1262980iyG = (C1262980iyG) awS137S0110000_19.l0;
        final C1262300ixA c1262300ixA = c1262980iyG.LL;
        final String str = c1262980iyG.LLILZIL;
        final boolean z = awS137S0110000_19.z1;
        return new ViewModelProvider.Factory(c1262300ixA, str, z) { // from class: X.0iyP
            public final C1262300ixA LIZ;
            public final String LIZIZ;
            public final boolean LIZJ;

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
                return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
                return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final <T extends ViewModel> T create(Class<T> cls) {
                C1262300ixA c1262300ixA2 = this.LIZ;
                String str2 = this.LIZIZ;
                C323720CmY c323720CmY = null;
                if (this.LIZJ) {
                    c323720CmY = new C323720CmY(0);
                }
                return new UserCardListViewModel(c1262300ixA2, str2, c323720CmY);
            }

            {
                this.LIZ = c1262300ixA;
                this.LIZIZ = str;
                this.LIZJ = z;
            }
        };
    }

    public static final Object invoke$11(AwS137S0110000_19 awS137S0110000_19) {
        LoginMethodListFragment loginMethodListFragment = (LoginMethodListFragment) awS137S0110000_19.l0;
        DialogC1240080iNK dialogC1240080iNK = loginMethodListFragment.LLLFF;
        if (dialogC1240080iNK != null) {
            C0FNV.LIZ(dialogC1240080iNK);
        }
        loginMethodListFragment.LLLFF = null;
        if (awS137S0110000_19.z1) {
            C0XWJ.LIZ.getClass();
            C0XWJ.LJI(true, null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS137S0110000_19 awS137S0110000_19) {
        LoginMethodListFragment loginMethodListFragment = (LoginMethodListFragment) awS137S0110000_19.l0;
        DialogC1240080iNK dialogC1240080iNK = loginMethodListFragment.LLLFF;
        if (dialogC1240080iNK != null) {
            C0FNV.LIZ(dialogC1240080iNK);
        }
        loginMethodListFragment.LLLFF = null;
        if (awS137S0110000_19.z1) {
            C0XWJ.LIZ.getClass();
            C0XWJ.LJI(true, null);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$13(AwS137S0110000_19 awS137S0110000_19) {
        if (awS137S0110000_19.z1) {
            C786410Ut5.LJLLLLLL(0, ((HeaderRecommendUserCardUserComponent) awS137S0110000_19.l0).zp());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS137S0110000_19 awS137S0110000_19) {
        if (awS137S0110000_19.z1) {
            ((HeaderRecommendUserCardUserComponent) awS137S0110000_19.l0).Gp().withState(AFwS257S0000000_19.get$arr$(702));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$15(kotlin.jvm.internal.AwS137S0110000_19 r8) {
        /*
            X.01GW r3 = X.C0APO.LIZ
            java.lang.Object r0 = r3.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 <= 0) goto L4d
            X.0hkj r0 = X.C1216150hkj.LIZ
            r0.getClass()
            X.01GW r7 = X.C1216150hkj.LIZJ
            java.lang.Object r2 = r7.getValue()
            com.bytedance.keva.Keva r2 = (com.bytedance.keva.Keva) r2
            r0 = 0
            java.lang.String r4 = "last_cache_time"
            long r0 = r2.getLong(r4, r0)
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r0
            java.lang.Object r0 = r3.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r0 = r0 * 24
            int r0 = r0 * 60
            int r0 = r0 * 60
            long r2 = (long) r0
            r0 = 1024(0x400, double:5.06E-321)
            long r2 = r2 * r0
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 < 0) goto L7c
            java.lang.Object r2 = r7.getValue()
            com.bytedance.keva.Keva r2 = (com.bytedance.keva.Keva) r2
            long r0 = java.lang.System.currentTimeMillis()
            r2.storeLong(r4, r0)
        L4d:
            X.140q r2 = X.C201962140q.LIZIZ
            java.lang.String r1 = "AIMusic"
            java.lang.String r0 = "storeAIMusicResult"
            X.C201955140j.LIZLLL(r2, r1, r0)
            X.0hkj r0 = X.C1216150hkj.LIZ
            r0.getClass()
            X.01GW r0 = X.C1216150hkj.LIZJ
            java.lang.Object r3 = r0.getValue()
            com.bytedance.keva.Keva r3 = (com.bytedance.keva.Keva) r3
            boolean r0 = r8.z1
            if (r0 == 0) goto L7f
            java.lang.String r2 = "unlimited_ai_music_list"
        L69:
            com.ss.android.ugc.aweme.utils.GsonProvider r0 = X.C7740030o.LIZ()
            com.google.gson.Gson r1 = r0.getGson()
            java.lang.Object r0 = r8.l0
            X.0o41 r0 = (X.C1458750o41) r0
            java.lang.String r0 = com.bytedance.mt.protector.impl.GsonProtectorUtils.toJson(r1, r0)
            r3.storeString(r2, r0)
        L7c:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L7f:
            java.lang.String r2 = "ai_music_list"
            goto L69
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS137S0110000_19.invoke$15(kotlin.jvm.internal.AwS137S0110000_19):java.lang.Object");
    }

    public static final Object invoke$16(AwS137S0110000_19 awS137S0110000_19) {
        View view;
        float fLIZJ;
        int marginStart;
        Object parent = ((C1899490zWt) awS137S0110000_19.l0).getParent();
        if (parent instanceof View) {
            view = (View) parent;
        } else {
            view = null;
        }
        float f = 0.0f;
        if (view == null) {
            return Float.valueOf(0.0f);
        }
        if (C293530Bex.LIZ()) {
            fLIZJ = C12ES.LIZJ(80.0f, ((C1899490zWt) awS137S0110000_19.l0).getContext());
        } else {
            fLIZJ = C12ES.LIZJ(((C1899490zWt) awS137S0110000_19.l0).LLLILZ, ((C1899490zWt) awS137S0110000_19.l0).getContext());
        }
        ViewGroup.LayoutParams layoutParams = ((C1899490zWt) awS137S0110000_19.l0).getPendantLayout().getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginStart = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
        } else {
            marginStart = 0;
        }
        float f2 = fLIZJ + marginStart;
        if (awS137S0110000_19.z1) {
            float width = view.getWidth() - f2;
            if (width >= 0.0f) {
                f = width;
            }
        }
        return Float.valueOf(f);
    }

    public static final Object invoke$17(AwS137S0110000_19 awS137S0110000_19) {
        View view;
        float width;
        Object parent = ((C1899490zWt) awS137S0110000_19.l0).getParent();
        if (parent instanceof View) {
            view = (View) parent;
        } else {
            view = null;
        }
        float width2 = 0.0f;
        if (view == null) {
            return Float.valueOf(0.0f);
        }
        if (C293530Bex.LIZ()) {
            if (awS137S0110000_19.z1) {
                width2 = view.getWidth() - C12ES.LIZJ(48.0f, ((C1899490zWt) awS137S0110000_19.l0).getContext());
            }
            return Float.valueOf(width2);
        }
        if (!awS137S0110000_19.z1) {
            width = -C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        } else {
            width = view.getWidth() - C12ES.LIZJ(32.0f, ((C1899490zWt) awS137S0110000_19.l0).getContext());
        }
        return Float.valueOf(width);
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS137S0110000_19 awS137S0110000_19) {
        boolean z;
        if (awS137S0110000_19.z1 && Intrinsics.LJFF(((AvailableWaysUserData) awS137S0110000_19.l0).has_mobile, Boolean.TRUE)) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AwS137S0110000_19 awS137S0110000_19) {
        boolean z;
        if (awS137S0110000_19.z1 && Intrinsics.LJFF(((AvailableWaysUserData) awS137S0110000_19.l0).has_email, Boolean.TRUE)) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$4(AwS137S0110000_19 awS137S0110000_19) {
        ((ProfileEditFragment) awS137S0110000_19.l0).rT(awS137S0110000_19.z1);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$5(kotlin.jvm.internal.AwS137S0110000_19 r7) {
        /*
            boolean r0 = X.C299890BpD.LIZ()
            r5 = 1
            if (r0 == 0) goto L2c
            boolean r0 = r7.z1
            if (r0 != 0) goto L2c
            java.lang.Object r1 = r7.l0
            com.ss.android.ugc.profile.platform.base.base.ProfileInfoAssem r1 = (com.ss.android.ugc.profile.platform.base.base.ProfileInfoAssem) r1
            boolean r0 = r1.LLJIJIL
            if (r0 == 0) goto L1e
            X.16FB r1 = r1.LLIZLLLIL
            if (r1 == 0) goto L1b
            r0 = 0
            r1.setRefreshing(r0)
        L1b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1e:
            com.ss.android.ugc.profile.platform.framework.aweme.profile.viewmodel.ProfileViewModel r2 = r1.LLJI
            if (r2 == 0) goto L2c
            kotlin.jvm.internal.AwS47S0010000_35 r1 = new kotlin.jvm.internal.AwS47S0010000_35
            r0 = 28
            r1.<init>(r5, r0)
            r2.setState(r1)
        L2c:
            java.lang.Object r1 = r7.l0
            com.ss.android.ugc.profile.platform.base.base.ProfileInfoAssem r1 = (com.ss.android.ugc.profile.platform.base.base.ProfileInfoAssem) r1
            boolean r0 = r1.LLJ
            if (r0 != 0) goto L1b
            r1.LLJ = r5
            r2 = 0
            X.0igD r3 = X.EnumC1251790igD.NORMAL
            java.lang.String r4 = "pullToRefresh"
            r6 = 0
            com.ss.android.ugc.profile.platform.base.base.ProfileInfoAssem.Ho(r1, r2, r3, r4, r5, r6)
            java.lang.Object r0 = r7.l0
            com.ss.android.ugc.profile.platform.base.base.ProfileInfoAssem r0 = (com.ss.android.ugc.profile.platform.base.base.ProfileInfoAssem) r0
            r0.HH()
            X.09Gk r2 = new X.09Gk
            r2.<init>()
            java.lang.Object r0 = r7.l0
            com.ss.android.ugc.profile.platform.base.base.ProfileInfoAssem r0 = (com.ss.android.ugc.profile.platform.base.base.ProfileInfoAssem) r0
            java.lang.String r1 = r0.getEnterFrom()
            java.lang.String r0 = "enter_from"
            r2.LJIIIIZZ(r0, r1)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "refresh_page"
            X.C20684815ws.LJIILLIIL(r0, r1)
            java.lang.Object r0 = r7.l0
            com.ss.android.ugc.profile.platform.base.base.ProfileInfoAssem r0 = (com.ss.android.ugc.profile.platform.base.base.ProfileInfoAssem) r0
            r0.No()
            java.lang.Object r0 = r7.l0
            com.ss.android.ugc.profile.platform.base.base.ProfileInfoAssem r0 = (com.ss.android.ugc.profile.platform.base.base.ProfileInfoAssem) r0
            r0.Oo()
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS137S0110000_19.invoke$5(kotlin.jvm.internal.AwS137S0110000_19):java.lang.Object");
    }

    public static final Object invoke$6(AwS137S0110000_19 awS137S0110000_19) {
        ((C1235080iFG) awS137S0110000_19.l0).LJIIJ();
        ((C1235080iFG) awS137S0110000_19.l0).LJII(awS137S0110000_19.z1, EnumC1235020iFA.UNLINK, EnumC1234990iF7.UNKNOWN);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS137S0110000_19 awS137S0110000_19) {
        SecurityCheckUpViewModel securityCheckUpViewModel = (SecurityCheckUpViewModel) awS137S0110000_19.l0;
        C0TVK c0tvk = C0TVK.PASSKEY;
        securityCheckUpViewModel.LLILZIL = c0tvk;
        C0TN5 c0tn5 = C0TN5.LIZ;
        String str = securityCheckUpViewModel.vQ2().LLILLJJLI;
        boolean z = !awS137S0110000_19.z1;
        c0tn5.getClass();
        C0TN5.LIZ(c0tvk, str, z);
        if (awS137S0110000_19.z1) {
            ((SecurityCheckUpViewModel) awS137S0110000_19.l0).setState(AFwS257S0000000_19.get$arr$(672));
        } else {
            Activity activity = ((SecurityCheckUpViewModel) awS137S0110000_19.l0).vQ2().LL.get();
            if (activity != null) {
                ((SecurityCheckUpViewModel) awS137S0110000_19.l0).LLILZ.LJIIIIZZ(activity, "security_checkup_page");
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS137S0110000_19 awS137S0110000_19) {
        SecurityCheckUpViewModel securityCheckUpViewModel = (SecurityCheckUpViewModel) awS137S0110000_19.l0;
        C0TVK c0tvk = C0TVK.PASSWORD;
        securityCheckUpViewModel.LLILZIL = c0tvk;
        C0TN5 c0tn5 = C0TN5.LIZ;
        String str = securityCheckUpViewModel.vQ2().LLILLJJLI;
        boolean z = !awS137S0110000_19.z1;
        c0tn5.getClass();
        C0TN5.LIZ(c0tvk, str, z);
        Activity activity = ((SecurityCheckUpViewModel) awS137S0110000_19.l0).vQ2().LL.get();
        if (activity != null) {
            PasswordService passwordServiceLJIIJJI = C0XQ5.LIZIZ.LJIIJJI();
            Bundle bundle = new Bundle();
            bundle.putBoolean("show_success_toast", false);
            passwordServiceLJIIJJI.changePassword(activity, "security_checkup_page", "click", bundle, new C0XTR() { // from class: X.0iFl
                @Override // X.C0XTR
                public final void onResult(int i, int i2, Object obj) {
                }
            });
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS137S0110000_19 awS137S0110000_19) {
        SecurityCheckUpViewModel securityCheckUpViewModel = (SecurityCheckUpViewModel) awS137S0110000_19.l0;
        C0TVK c0tvk = C0TVK.TWOSV;
        securityCheckUpViewModel.LLILZIL = c0tvk;
        C0TN5 c0tn5 = C0TN5.LIZ;
        String str = securityCheckUpViewModel.vQ2().LLILLJJLI;
        boolean z = !awS137S0110000_19.z1;
        c0tn5.getClass();
        C0TN5.LIZ(c0tvk, str, z);
        Activity activity = ((SecurityCheckUpViewModel) awS137S0110000_19.l0).vQ2().LL.get();
        if (activity != null) {
            String str2 = TwoStepVerificationManagementActivity._pnsPageId;
            C1233710iD3.LIZ(activity, "security_checkup_page", null, null, 0, false, null);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS137S0110000_19(C1235080iFG c1235080iFG, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1235080iFG;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS137S0110000_19(C1262980iyG c1262980iyG, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1262980iyG;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS137S0110000_19(C1458750o41 c1458750o41, boolean z, int i) {
        super(0);
        this.$t = i;
        this.z1 = z;
        this.l0 = c1458750o41;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS137S0110000_19(C1899490zWt c1899490zWt, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1899490zWt;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS137S0110000_19(LoginMethodListFragment loginMethodListFragment, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = loginMethodListFragment;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS137S0110000_19(SecurityCheckUpViewModel securityCheckUpViewModel, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = securityCheckUpViewModel;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS137S0110000_19(ProfileEditFragment profileEditFragment, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = profileEditFragment;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS137S0110000_19(boolean z, AvailableWaysUserData availableWaysUserData, int i) {
        super(0);
        this.$t = i;
        this.z1 = z;
        this.l0 = availableWaysUserData;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS137S0110000_19(boolean z, TwoStepVerificationActivityAssem twoStepVerificationActivityAssem, int i) {
        super(0);
        this.$t = i;
        this.z1 = z;
        this.l0 = twoStepVerificationActivityAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS137S0110000_19(boolean z, HeaderRecommendUserCardUserComponent headerRecommendUserCardUserComponent, int i) {
        super(0);
        this.$t = i;
        this.z1 = z;
        this.l0 = headerRecommendUserCardUserComponent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS137S0110000_19(boolean z, ProfileInfoAssem profileInfoAssem, int i) {
        super(0);
        this.$t = i;
        this.z1 = z;
        this.l0 = profileInfoAssem;
    }
}
