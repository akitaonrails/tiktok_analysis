package com.ss.android.ugc.aweme.account.login.v2.ui.fragments;

import X.AbstractC19483511Kn;
import X.C01GW;
import X.C09JN;
import X.C0I7D;
import X.C0WZX;
import X.C0XGR;
import X.C0XQ5;
import X.C0XQ6;
import X.C0XZ4;
import X.C1239250iLz;
import X.C1260730iud;
import X.C1308910kAL;
import X.C19252910Tv;
import X.C19285410ce;
import X.C19EG;
import X.C20684815ws;
import X.C2204961BRm;
import X.C452501pT;
import X.C784500Uq0;
import X.C786410Ut5;
import X.C851660Xb2;
import X.C851730Xb9;
import X.C851910XbR;
import X.C851920XbS;
import X.C851940XbU;
import X.C851990XbZ;
import X.C852810Xct;
import X.EnumC851500Xam;
import X.EnumC851960XbW;
import X.EnumC852660Xce;
import X.EnumC852910Xd3;
import X.InterfaceC1246800iYA;
import X.InterfaceC1254030ijp;
import X.InterfaceC851560Xas;
import Y.AfS16S1400000_13;
import Y.AfS178S0100000_9;
import Y.AfS182S0100000_13;
import Y.AfS36S1300000_13;
import Y.AfS40S1200000_13;
import Y.AfS64S0400000_13;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ICoinEmailAccountService;
import com.ss.android.ugc.aweme.account.eventtracking.SetPasswordClickNextEvent;
import com.ss.android.ugc.aweme.account.eventtracking.SkipPasswordEvent;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.login.v2.network.SetPasswordMobHelper;
import com.ss.android.ugc.aweme.account.oneclicklogin.IOneClickLoginService;
import com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AwS222S0300000_13;
import kotlin.jvm.internal.AwS557S0100000_13;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes14.dex */
public final class CreatePasswordFragment extends BaseUpdatePasswordFragment implements InterfaceC851560Xas {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiJSA0IStiHELIOSP319PSxiLz0yLygpJzsgZgY+LC4nLRUtOjwkJzcoDz0yLygpJzs=";
    public View LLLLLJLJLL;
    public LinearLayout LLLLLL;
    public boolean LLLLLLJ;
    public boolean LLLLLLL;
    public final C01GW LLLLLLIL = C452501pT.LIZIZ(new AwS557S0100000_13(this, 66));
    public final long LLLLLLLLL = System.currentTimeMillis();
    public final C01GW LLLLLLLLLL = C452501pT.LIZIZ(new AwS557S0100000_13(this, 65));

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void ES() {
        this.LLLLLLL = false;
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("platform", "sms_verification");
        C20684815ws.LJIILLIIL("click_password_skip", c0xgr.LIZ);
        if (getArguments().getBoolean("phone_signup")) {
            getArguments().putInt("next_page", EnumC852910Xd3.OPTIONAL_SIGNUP_PAGES.getValue());
            getArguments().putInt("previous_page", EnumC852910Xd3.CREATE_PASSWORD_FOR_PHONE.getValue());
            fo(getArguments());
        } else {
            if (!kT(getArguments())) {
                super.ES();
                return;
            }
            SkipPasswordEvent skipPasswordEvent = new SkipPasswordEvent();
            skipPasswordEvent.LJI(RR(), "page");
            skipPasswordEvent.LJI(getEnterFrom(), "enter_from");
            skipPasswordEvent.LJI(getEnterMethod(), "enter_method");
            skipPasswordEvent.LJIIIIZZ();
            Bundle arguments = getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            arguments.putInt("next_page", EnumC852910Xd3.OPTIONAL_SIGNUP_PAGES.getValue());
            arguments.putInt("previous_page", EnumC852910Xd3.CREATE_PASSWORD_FOR_EMAIL.getValue());
            fo(arguments);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment
    public final void hT() {
        final String string;
        Bundle arguments;
        Bundle arguments2;
        Editable editableLLJILLL;
        C0I7D c0i7d = this.LLLLIL;
        if (c0i7d == null || (editableLLJILLL = C2204961BRm.LLJILLL(c0i7d, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibECfF1owsk1PEpk5Z4F7WzzjzzRSEqABvkznnOFAK0X6fjqI5jkdkJLi06dwQ=", null))) == null || (string = editableLLJILLL.toString()) == null) {
            string = "";
        }
        if (ZS(string)) {
            return;
        }
        int i = C851920XbS.LIZ[VR().ordinal()];
        if (i == 1) {
            C0XZ4 c0xz4 = C0XZ4.LIZ;
            final String strYS = YS();
            final String strXS = XS();
            c0xz4.getClass();
            SetPasswordMobHelper setPasswordMobHelper = new SetPasswordMobHelper(this);
            C1239250iLz.LIZIZ(this, this, AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0XWZ
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r4v1, types: [X.0XGw, X.0XWP] */
                @Override // X.InterfaceC1254030ijp
                public final void LIZ(final C11KY c11ky) {
                    C852170Xbr c852170Xbr = C852170Xbr.LIZ;
                    Boolean bool = Boolean.FALSE;
                    BaseAccountFlowFragment mobParams = this.getMobParams();
                    c852170Xbr.getClass();
                    C852170Xbr.LJIIJ(bool, "email", mobParams, true, null);
                    final C0XYD c0xyd = this;
                    ?? r4 = new AbstractC849650XUt() { // from class: X.0XWP
                        @Override // X.C0XH7
                        public final void LJFF(C0XGA c0xga) {
                            ((C11KY) c11ky).onError(new C0XZJ(c0xga.LIZLLL, c0xga.LJFF, EnumC852660Xce.SET_OR_RESET_PASSWORD, c0xyd.LLJJLIIIJLLLLLLLZ(), null, ""));
                        }

                        @Override // X.C0XH7
                        public final void LJI(C0XGA c0xga) {
                            ((C11KY) c11ky).onSuccess(c0xga);
                        }

                        @Override // X.C0XH7
                        public final void LJ(C0XGA c0xga, int i2) {
                            ((C11KY) c11ky).onError(new C0XZJ(i2, c0xga.LJFF, EnumC852660Xce.SET_OR_RESET_PASSWORD, c0xyd.LLJJLIIIJLLLLLLLZ(), null, ""));
                        }
                    };
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    C0XZ4 c0xz42 = C0XZ4.LIZ;
                    String str = strXS;
                    c0xz42.getClass();
                    C0XZ4.LJJIJLIJ(str, linkedHashMap);
                    this.gk(r4);
                    this.Fb().LIZIZ(a0.LJLIIIL(string).toString(), strYS, linkedHashMap, r4);
                }
            }).LJIIIIZZ(new AfS36S1300000_13((BaseUpdatePasswordFragment) this, setPasswordMobHelper, (BaseUpdatePasswordFragment) this, string, 2)).LJII(new AfS40S1200000_13(setPasswordMobHelper, (BaseUpdatePasswordFragment) this, string, 5))).LJIILL();
            return;
        }
        if (i == 2) {
            C0XZ4 c0xz42 = C0XZ4.LIZ;
            String strXS2 = XS();
            c0xz42.getClass();
            C0XZ4.LJJIJIL(this, this, string, strXS2, null).LJIIIIZZ(new AfS182S0100000_13(this, 85)).LJIILL();
            return;
        }
        if (i != 3) {
            if (i == 4) {
                C0XZ4 c0xz43 = C0XZ4.LIZ;
                final String strYS2 = YS();
                final String strXS3 = XS();
                c0xz43.getClass();
                SetPasswordMobHelper setPasswordMobHelper2 = new SetPasswordMobHelper(this);
                C1239250iLz.LIZIZ(this, this, AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0XXS
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r4v1, types: [X.0XGw, X.0XXR] */
                    @Override // X.InterfaceC1254030ijp
                    public final void LIZ(final C11KY c11ky) {
                        C852170Xbr c852170Xbr = C852170Xbr.LIZ;
                        Boolean bool = Boolean.FALSE;
                        BaseAccountFlowFragment mobParams = this.getMobParams();
                        c852170Xbr.getClass();
                        C852170Xbr.LJIIJ(bool, "sms_verification", mobParams, true, null);
                        final C0XYD c0xyd = this;
                        ?? r4 = new AbstractC849650XUt() { // from class: X.0XXR
                            @Override // X.C0XH7
                            public final void LJFF(C0XGA c0xga) {
                                ((C11KY) c11ky).onError(new C0XZJ(c0xga.LIZLLL, c0xga.LJFF, EnumC852660Xce.SET_OR_RESET_PASSWORD, c0xyd.LLJJLIIIJLLLLLLLZ(), null, ""));
                            }

                            @Override // X.C0XH7
                            public final void LJI(C0XGA c0xga) {
                                C0XZV c0xzv = (C0XZV) c0xga;
                                if (c0xzv.LJIIIZ == null) {
                                    C0XWW<C849630XUr> c0xww = c11ky;
                                    C0XYG c0xyg = C0XZJ.Companion;
                                    EnumC852660Xce enumC852660Xce = EnumC852660Xce.SET_OR_RESET_PASSWORD;
                                    EnumC852910Xd3 enumC852910Xd3LLJJLIIIJLLLLLLLZ = c0xyd.LLJJLIIIJLLLLLLLZ();
                                    c0xyg.getClass();
                                    ((C11KY) c0xww).onError(C0XYG.LIZ(enumC852660Xce, enumC852910Xd3LLJJLIIIJLLLLLLLZ));
                                    return;
                                }
                                ((C11KY) c11ky).onSuccess(c0xzv);
                            }

                            @Override // X.C0XH7
                            public final void LJ(C0XGA c0xga, int i2) {
                                String str;
                                C0XWW<C849630XUr> c0xww = c11ky;
                                if (c0xga != null) {
                                    str = c0xga.LJFF;
                                } else {
                                    str = null;
                                }
                                ((C11KY) c0xww).onError(new C0XZJ(i2, str, EnumC852660Xce.SET_OR_RESET_PASSWORD, c0xyd.LLJJLIIIJLLLLLLLZ(), null, ""));
                            }
                        };
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        C0XZ4 c0xz44 = C0XZ4.LIZ;
                        String str = strXS3;
                        c0xz44.getClass();
                        C0XZ4.LJJIJLIJ(str, linkedHashMap);
                        this.gk(r4);
                        this.m8().LJIILIIL(string, strYS2, linkedHashMap, r4);
                    }
                }).LJIIIIZZ(new AfS36S1300000_13((BaseUpdatePasswordFragment) this, setPasswordMobHelper2, (BaseUpdatePasswordFragment) this, string, 3)).LJII(new AfS40S1200000_13(setPasswordMobHelper2, (BaseUpdatePasswordFragment) this, string, 8))).LJIIIIZZ(new AfS178S0100000_9(this, 12)).LJIILL();
                return;
            }
            return;
        }
        C0XQ6.LIZ(getContext());
        SetPasswordClickNextEvent setPasswordClickNextEvent = new SetPasswordClickNextEvent();
        setPasswordClickNextEvent.LJI(RR(), "page");
        setPasswordClickNextEvent.LJI(getEnterFrom(), "enter_from");
        setPasswordClickNextEvent.LJI(getEnterMethod(), "enter_method");
        setPasswordClickNextEvent.LJIIIIZZ();
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            JS(arguments3);
        }
        if (kT(getArguments())) {
            C0XZ4.LIZ.getClass();
            C0XZ4.LJJIJIL(this, this, string, null, null).LJIIIIZZ(new AfS182S0100000_13(this, 84)).LJIILL();
            return;
        }
        Set<String> set = C1260730iud.LIZ;
        if (!C851730Xb9.LIZIZ() || ((arguments2 = getArguments()) != null && arguments2.getBoolean("IS_AGE_GATE_PASSED"))) {
            Bundle arguments4 = getArguments();
            if (arguments4 != null) {
                arguments4.putBoolean("email_signup", true);
            }
            C852810Xct.LIZ.getClass();
            if (C852810Xct.LIZIZ && (arguments = getArguments()) != null) {
                arguments.putBoolean("finish_activity_after_signup_login", true);
            }
            C0XZ4 c0xz44 = C0XZ4.LIZ;
            String strLJ = C852810Xct.LJ(getArguments());
            String strXS4 = XS();
            c0xz44.getClass();
            C0XZ4.LJIIJ(this, this, strLJ, string, true, strXS4).LJIIIIZZ(new AfS178S0100000_9(this, 38)).LJIILL();
            return;
        }
        mT();
        C852810Xct.LIZ.getClass();
        C786410Ut5.LJJJI("args_password", string, getArguments());
        Bundle arguments5 = getArguments();
        if (arguments5 != null) {
            arguments5.putBoolean("email_signup", true);
            arguments5.putInt("next_page", EnumC852910Xd3.AGE_GATE_SIGN_UP.getValue());
            if (kT(arguments5)) {
                C786410Ut5.LJJJI("password", string, arguments5);
                arguments5.putBoolean("email_otp_signup", true);
            }
            fo(arguments5);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final String hS() {
        return (String) this.LLLLLLLLLL.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010b  */
    @Override // com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1237010iIN iS() {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CreatePasswordFragment.iS():X.0iIN");
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final List<View> qS() {
        View viewFindViewById = this.LLLLLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.f66) : null;
            this.LLLLLL = (LinearLayout) viewFindViewById;
        }
        return Collections.singletonList(viewFindViewById);
    }

    @Override // com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void clearFromXmlViewCache() {
        super.clearFromXmlViewCache();
        this.LLLLLJLJLL = null;
        this.LLLLLL = null;
    }

    public final boolean lT() {
        Bundle arguments = getArguments();
        return arguments != null && arguments.getInt("progress", -1) >= 0;
    }

    public final void mT() {
        if (SR() == EnumC852660Xce.SIGN_UP) {
            C0XGR c0xgr = new C0XGR();
            c0xgr.LIZIZ(System.currentTimeMillis() - this.LLLLLLLLL, "stay_time");
            C20684815ws.LJIILLIIL("input_email_pwd_page", c0xgr.LIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final boolean onBackPressed() {
        fT();
        if (lT()) {
            if (C784500Uq0.LIZJ(getActivity())) {
                return true;
            }
            super.onBackPressed();
            return false;
        }
        if (this.LLLLLLL) {
            return true;
        }
        if (!this.LLLLLLJ) {
            C0XQ5.LJIIJJI(13, 2, null);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        clearFromXmlViewCache();
    }

    public final boolean kT(Bundle bundle) {
        if (C19285410ce.LIZ() || (bundle != null && bundle.getBoolean("is_need_verify_email", false))) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        Bundle arguments;
        super.onViewCreated(view, bundle);
        Bundle arguments2 = getArguments();
        if (arguments2 != null && arguments2.getBoolean("need_show_gsma_text")) {
            C0XGR c0xgr = new C0XGR();
            c0xgr.LIZLLL("enter_from", getEnterFrom());
            c0xgr.LIZLLL("enter_method", getEnterMethod());
            c0xgr.LIZLLL("age_gate", "forward");
            C20684815ws.LJIILLIIL("show_gsma_signup_banner", c0xgr.LIZ);
            View viewFindViewById = view.findViewById(R.id.flu);
            TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.flv);
            TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.flw);
            C19EG activity = getActivity();
            if (activity != null) {
                C786410Ut5.LJLLLLLL(0, viewFindViewById);
                viewFindViewById.setBackground(C1308910kAL.LJ(R.attr.a0l, activity));
            }
            tuxIconView.setIconRes(R.raw.icon_tick_circle_fill);
            tuxIconView.setTintColorRes(R.attr.a0i);
            tuxTextView.setText(getString(2131835427));
            tuxTextView.setTuxFont(52);
            Bundle arguments3 = getArguments();
            if (arguments3 != null) {
                arguments3.getBoolean("need_show_gsma_text", false);
            }
        }
        C851910XbR c851910XbR = C851910XbR.LIZ;
        View viewFindViewById2 = this.LLLLLJLJLL;
        View viewFindViewById3 = null;
        if (viewFindViewById2 == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById2 = view2.findViewById(R.id.f67);
            } else {
                viewFindViewById2 = null;
            }
            this.LLLLLJLJLL = viewFindViewById2;
        }
        if (!((IOneClickLoginService) ServiceManager.get().getService(IOneClickLoginService.class)).LIZIZ() || !ComplianceServiceProvider.LJIJ().LIZLLL("sign_up") || ((arguments = getArguments()) != null && arguments.getBoolean("ocl_checkbox_shown"))) {
            z = false;
        } else {
            z = true;
        }
        boolean zWS = wS();
        String strPR = PR();
        String strHS = hS();
        c851910XbR.getClass();
        this.LLLF = C851910XbR.LIZ(viewFindViewById2, z, zWS, strPR, strHS, null, true);
        C0I7D c0i7d = this.LLLLIL;
        if (c0i7d != null) {
            c0i7d.addTextChangedListener(new C851940XbU() { // from class: X.0XbT
                @Override // android.text.TextWatcher
                public final void afterTextChanged(Editable editable) {
                    if (editable != null) {
                        editable.length();
                    }
                    this.LL.getClass();
                }
            });
        }
        InterfaceC1246800iYA interfaceC1246800iYALIZIZ = C19252910Tv.LIZIZ.LIZLLL().LIZIZ();
        View view3 = this.LLLLLL;
        if (view3 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById3 = view4.findViewById(R.id.f66);
            }
            this.LLLLLL = (LinearLayout) viewFindViewById3;
            view3 = viewFindViewById3;
        }
        interfaceC1246800iYALIZIZ.LIZLLL(view3);
    }

    @Override // X.InterfaceC851550Xar
    public final void QK(final EnumC852910Xd3 enumC852910Xd3, final Bundle bundle, final C851660Xb2 c851660Xb2) {
        String strUR;
        InputCodeFragmentV2 inputCodeFragmentV2;
        if (bundle.getBoolean("email_otp_signup", false)) {
            C851990XbZ c851990XbZ = C851990XbZ.LIZ;
            EnumC851960XbW enumC851960XbW = EnumC851960XbW.VERIFY_EMAIL_CODE;
            c851990XbZ.getClass();
            C851990XbZ.LIZ(enumC852910Xd3, enumC851960XbW);
            BaseAccountFlowFragment currentFragment = c851660Xb2.getCurrentFragment();
            if (currentFragment != null) {
                C852810Xct.LIZ.getClass();
                String strLJ = C852810Xct.LJ(bundle);
                bundle.putBoolean("IS_AGE_GATE_PASSED", true);
                C0XZ4 c0xz4 = C0XZ4.LIZ;
                String string = bundle.getString("code", "");
                EnumC852660Xce enumC852660Xce = EnumC852660Xce.SIGN_UP;
                String string2 = bundle.getString("verify_method", "code");
                if (!(currentFragment instanceof InputCodeFragmentV2) || (inputCodeFragmentV2 = (InputCodeFragmentV2) currentFragment) == null || (strUR = inputCodeFragmentV2.mT()) == null) {
                    strUR = currentFragment.UR();
                }
                ICoinEmailAccountService iCoinEmailAccountService = (ICoinEmailAccountService) PluggableExtentionKt.pluggableSpi$default(ICoinEmailAccountService.class, false, false, false, 14, null);
                if (iCoinEmailAccountService != null) {
                    iCoinEmailAccountService.LIZ();
                }
                AwS222S0300000_13 awS222S0300000_13 = new AwS222S0300000_13(this, enumC852910Xd3, currentFragment, c851660Xb2, 0);
                c0xz4.getClass();
                C0XZ4.LJJJIL(currentFragment, currentFragment, strLJ, string, enumC852660Xce, enumC852910Xd3, string2, strUR, 27, awS222S0300000_13).LJIIIIZZ(new AfS64S0400000_13(this, enumC852910Xd3, currentFragment, bundle, c851660Xb2, 0)).LJIILL();
                return;
            }
            return;
        }
        if (bundle.getBoolean("email_signup", false)) {
            C851990XbZ c851990XbZ2 = C851990XbZ.LIZ;
            EnumC851960XbW enumC851960XbW2 = EnumC851960XbW.EMAIL_REGISTER;
            c851990XbZ2.getClass();
            C851990XbZ.LIZ(enumC852910Xd3, enumC851960XbW2);
            final BaseAccountFlowFragment currentFragment2 = c851660Xb2.getCurrentFragment();
            if (currentFragment2 == null) {
                return;
            }
            final SetPasswordMobHelper setPasswordMobHelper = new SetPasswordMobHelper(currentFragment2);
            C852810Xct.LIZ.getClass();
            final String string3 = bundle.getString("args_password", "");
            C0XZ4 c0xz42 = C0XZ4.LIZ;
            String strLJ2 = C852810Xct.LJ(bundle);
            EnumC851500Xam.Companion.getClass();
            String value = EnumC851500Xam.ruleStrategies$delegate.getValue();
            c0xz42.getClass();
            C1239250iLz.LIZIZ(currentFragment2, currentFragment2, C0XZ4.LJIIJ(currentFragment2, currentFragment2, strLJ2, string3, false, value).LJIIIIZZ(new C09JN(currentFragment2, string3, this, enumC852910Xd3, bundle, c851660Xb2) { // from class: X.0Xap
                public final /* synthetic */ BaseAccountFlowFragment LLILLJJLI;
                public final /* synthetic */ String LLILLL;
                public final /* synthetic */ EnumC852910Xd3 LLILZ;
                public final /* synthetic */ Bundle LLILZIL;
                public final /* synthetic */ InterfaceC851540Xaq LLILZLL;

                {
                    this.LLILZ = enumC852910Xd3;
                    this.LLILZIL = bundle;
                    this.LLILZLL = c851660Xb2;
                }

                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("AgeGateSignupCreatePasswordEntryPoint@bd9e.emailRegister$1$1");
                    C0XT7 c0xt7 = (C0XT7) obj;
                    this.LL.LIZ(true, "email", this.LLILLJJLI.getEnterFrom(), this.LLILLJJLI.getEnterMethod(), this.LLILLJJLI.PR(), 0, this.LLILLJJLI, this.LLILLL);
                    C852170Xbr c852170Xbr = C852170Xbr.LIZ;
                    BaseAccountFlowFragment baseAccountFlowFragment = this.LLILLJJLI;
                    C0XO3 c0xo3 = ((C849560XUk) c0xt7.LJIIIZ).LJIIJ;
                    c852170Xbr.getClass();
                    C852170Xbr.LJIIL(true, "email", baseAccountFlowFragment, c0xo3, null);
                    C851520Xao.LIZIZ(this.LLILZ, this.LLILLJJLI, this.LLILZIL, ((C849560XUk) c0xt7.LJIIIZ).LJIIJ, this.LLILZLL);
                    C1C7U.LIZIZ("AgeGateSignupCreatePasswordEntryPoint@bd9e.emailRegister$1$1");
                }
            }).LJII(new AfS16S1400000_13(setPasswordMobHelper, currentFragment2, string3, this, enumC852910Xd3, c851660Xb2, 1))).LJIILL();
            return;
        }
        c851660Xb2.LIZJ(c851660Xb2.getCurrentFragment(), enumC852910Xd3);
    }
}
