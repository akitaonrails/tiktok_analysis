package com.ss.android.ugc.aweme.account.login.v2.ui.fragments;

import X.C01GW;
import X.C0HZQ;
import X.C0XGR;
import X.C0XUD;
import X.C0XZ3;
import X.C0XZ4;
import X.C123100dR;
import X.C1234920iF0;
import X.C1236860iI8;
import X.C1236880iIA;
import X.C1237010iIN;
import X.C1237220iIi;
import X.C1247510iZJ;
import X.C1266060j3E;
import X.C19EG;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2187451AjH;
import X.C452501pT;
import X.C616540OGe;
import X.C786410Ut5;
import X.C851910XbR;
import X.C852810Xct;
import X.EnumC852660Xce;
import X.EnumC852910Xd3;
import X.InterfaceC1234930iF1;
import Y.ACListenerS154S0100000_19;
import Y.ACListenerS85S0300000_19;
import Y.ARunnableS119S0100000_19;
import Y.AfS188S0100000_19;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil;
import com.ss.android.ugc.aweme.account.login.v2.base.AvailableWaysViewModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS133S1100000_19;
import kotlin.jvm.internal.AwS385S0200000_19;
import kotlin.jvm.internal.AwS557S0100000_13;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class EmailOTPLoginCodeVerifyFragment extends InputCodeFragmentV2 implements InterfaceC1234930iF1 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiJSA0IStiP319PSHELIOSxiLz0yLygpJzsgZgAhKCY/BxEcBSA0ISsPJis2HiA+ICkqDjctLiI2JjE=";
    public TuxTextView LLLLLJLJLL;
    public final C01GW LLLLLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 269));
    public final C01GW LLLLLLIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 270));
    public final C01GW LLLLLLJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 271));
    public final String LLLLLLL = "email/username";
    public final C01GW LLLLLLLLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 272));
    public final C01GW LLLLLLLLLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 265));
    public final C01GW LLLLLLLZIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 267));
    public final C01GW LLLLLLZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 268));
    public final C01GW LLLLLLZZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 266));
    public boolean LLLLLZ = true;

    public final void ET() {
        Map<String, String> mapLJIIIIZZ;
        if (zT() || DT()) {
            mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("passport_ticket", CT()), new Pair("email_theme", "2"));
        } else {
            mapLJIIIIZZ = NR();
            mapLJIIIIZZ.put("use_passport_ticket", "1");
        }
        C0XZ4.LJJIII(C0XZ4.LIZ, this, this, getEmail(), zT() ? 23 : 13, mT(), mapLJIIIIZZ, null, null, null, null, 960).LJIIIIZZ(new AfS188S0100000_19(this, 9)).LJFF(new C1266060j3E(this, 3)).LJIILL();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final void xT() {
    }

    public final TuxTextView AT() {
        View viewFindViewById = this.LLLLLJLJLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.kpl) : null;
            this.LLLLLJLJLL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final String CT() {
        return (String) this.LLLLLLLLL.getValue();
    }

    public final boolean DT() {
        return ((Boolean) this.LLLLLLJ.getValue()).booleanValue();
    }

    @Override // X.InterfaceC1234930iF1
    public final void ND() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        Bundle bundle = new Bundle(arguments);
        C1234920iF0.LJ(this);
        if (zT()) {
            C786410Ut5.LJJJI("passport_ticket", CT(), bundle);
            bundle.putInt("next_page", EnumC852910Xd3.FAILED_3P_PASSWORD_LOGIN.getValue());
        } else if (DT()) {
            C786410Ut5.LJJJI("passport_ticket", CT(), bundle);
            bundle.putInt("next_page", EnumC852910Xd3.EMAIL_HL_LOGIN_SWITCH_TO_PASSWORD.getValue());
        } else {
            C786410Ut5.LJJJI("passport_ticket", null, bundle);
            bundle.putInt("next_page", EnumC852910Xd3.EMAIL_OTP_LOGIN_SWITCH_TO_PASSWORD.getValue());
        }
        bundle.putInt("current_scene", SR().getValue());
        fo(bundle);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final C1236860iI8 eT() {
        C1236860iI8 c1236860iI8 = new C1236860iI8();
        c1236860iI8.LIZ = getEmail();
        c1236860iI8.LIZIZ = false;
        c1236860iI8.LJ = ((Boolean) this.LLLLLLLLLL.getValue()).booleanValue();
        Bundle arguments = getArguments();
        c1236860iI8.LJII = arguments != null ? arguments.getBoolean("user_cross_activity_timer") : false;
        return c1236860iI8;
    }

    public final String getEmail() {
        return (String) this.LLLLLL.getValue();
    }

    @Override // X.InterfaceC1234930iF1
    public final C1247510iZJ lo() {
        C1247510iZJ c1247510iZJ = new C1247510iZJ();
        c1247510iZJ.LIZIZ(2131839758);
        c1247510iZJ.LIZ(new AwS598S0100000_19((InterfaceC1234930iF1) this, 94));
        return c1247510iZJ;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final String mT() {
        return this.LLLLILI ? "resend" : "click_continue";
    }

    public final boolean zT() {
        return ((Boolean) this.LLLLLLIL.getValue()).booleanValue();
    }

    @Override // X.InterfaceC1234930iF1
    public final void Dr() {
        TuxTextView tuxTextViewZS = ZS();
        if (tuxTextViewZS != null) {
            C786410Ut5.LLLLZLL(tuxTextViewZS, 0);
            tuxTextViewZS.setText(getString(2131835945));
            C786410Ut5.h9(tuxTextViewZS, new ACListenerS154S0100000_19(this, 63));
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void clearFromXmlViewCache() {
        super.clearFromXmlViewCache();
        this.LLLLLJLJLL = null;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C1237010iIN iS() {
        return new C1237010iIN(" ", null, false, getString(2131823013), C1236880iIA.LIZIZ(C1236880iIA.LIZLLL(getString(2131833843, getEmail()), new String[]{getEmail()}, 52), getContext(), R.attr.a1j, getEmail()), false, "email_login_homepage", true, false, null, C123100dR.LIZ((String) this.LLLLLLLZIL.getValue()), (String) this.LLLLLLLZIL.getValue(), (String) this.LLLLLLZ.getValue(), (String) this.LLLLLLZZ.getValue(), null, 35638526);
    }

    @Override // X.InterfaceC1234930iF1
    public final void mp() {
        TuxTextView tuxTextViewZS = ZS();
        if (tuxTextViewZS != null) {
            C786410Ut5.LLLLZLL(tuxTextViewZS, 8);
        }
        TuxTextView tuxTextViewAT = AT();
        if (tuxTextViewAT != null) {
            C786410Ut5.LLLLZLL(tuxTextViewAT, 8);
        }
    }

    @Override // X.InterfaceC1234930iF1
    public final C0XGR nP() {
        return C1234920iF0.LIZJ(this);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        clearFromXmlViewCache();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        C0HZQ c0hzq;
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(EmailOTPLoginCodeVerifyFragment.class.getName());
        }
        super.onResume();
        if (zT() && (c0hzq = this.LLLF) != null) {
            HandlerHook.viewPostDelay(c0hzq, new ARunnableS119S0100000_19(this, 22), 100L);
        }
        if (this.LLLLLZ) {
            this.LLLLLZ = false;
        } else {
            C20684815ws.LJIILLIIL("switch_to_verify_login", nP().LIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final String hS() {
        return this.LLLLLLL;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final void uT() {
        ET();
    }

    @Override // X.InterfaceC1234930iF1
    public final C1247510iZJ HL(Context context) {
        C1247510iZJ c1247510iZJ = new C1247510iZJ();
        c1247510iZJ.LIZIZ(2131835945);
        c1247510iZJ.LIZ(new AwS385S0200000_19(this, context, 16));
        return c1247510iZJ;
    }

    @Override // X.InterfaceC1234930iF1
    public final void e4(String str) {
        PhoneNumberUtil.PhoneNumber phoneNumberLIZLLL = PhoneNumberUtil.LIZLLL(str);
        if (phoneNumberLIZLLL != null) {
            C852810Xct.LIZ.getClass();
            C852810Xct.LJIJ(this, phoneNumberLIZLLL);
        }
        C852810Xct.LIZ.getClass();
        C852810Xct.LJIJI(getArguments(), str);
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        if (zT()) {
            C786410Ut5.LJJJI("passport_ticket", CT(), arguments);
            arguments.putInt("next_page", EnumC852910Xd3.VERIFY_OR_BIND_PHONE.getValue());
            arguments.putInt("current_scene", EnumC852660Xce.EMAIL_OTP_LOGIN.getValue());
        } else {
            arguments.putInt("next_page", EnumC852910Xd3.PHONE_SMS_LOGIN.getValue());
            arguments.putInt("current_scene", SR().getValue());
        }
        arguments.putBoolean("code_sent", false);
        C20684815ws.LJIILLIIL("email_login_enter_phone", nP().LIZ);
        fo(arguments);
    }

    @Override // X.InterfaceC1234930iF1
    public final void e9(Context context) {
        C1234920iF0.LJFF(this, context);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AvailableWaysViewModel.GetAvailableWayType getAvailableWayTypeLIZIZ = C1234920iF0.LIZIZ(this);
        if (getAvailableWayTypeLIZIZ.shouldGetAvailableWays) {
            if (getAvailableWayTypeLIZIZ.shouldFetchAvailableWaysOnCreate) {
                C19EG activity = getActivity();
                if (activity != null) {
                    ((AvailableWaysViewModel) ViewModelProviders.of(activity).get(AvailableWaysViewModel.class)).wQ2(getEmail(), CT(), getEnterFrom(), getEnterMethod(), PR(), RR());
                    return;
                }
                return;
            }
            C19EG activity2 = getActivity();
            if (activity2 == null) {
                return;
            }
            ((AvailableWaysViewModel) ViewModelProviders.of(activity2).get(AvailableWaysViewModel.class)).vQ2(getEmail());
        }
    }

    @Override // X.InterfaceC1234930iF1
    public final C1247510iZJ ve(String str) {
        C1247510iZJ c1247510iZJ = new C1247510iZJ();
        c1247510iZJ.LIZIZ(2131839757);
        c1247510iZJ.LIZ(new AwS133S1100000_19(this, str, 2));
        return c1247510iZJ;
    }

    @Override // X.InterfaceC1234930iF1
    public final void Us(BaseI18nLoginFragment baseI18nLoginFragment, AvailableWaysViewModel.AvailableWays availableWays) {
        TuxTextView tuxTextViewAT = AT();
        if (tuxTextViewAT != null) {
            C786410Ut5.LLLLZLL(tuxTextViewAT, 0);
            tuxTextViewAT.setTextColorRes(R.attr.a1n);
            tuxTextViewAT.setText(getString(2131824501));
            C786410Ut5.h9(tuxTextViewAT, new ACListenerS85S0300000_19(this, baseI18nLoginFragment, availableWays, 5));
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C1237220iIi c1237220iIi;
        super.onViewCreated(view, bundle);
        if (zT()) {
            C1234920iF0.LJI(this, this, getEmail());
            View viewFindViewById = view.findViewById(R.id.gyc);
            if (viewFindViewById != null) {
                C851910XbR c851910XbR = C851910XbR.LIZ;
                C0XUD.LIZ.getClass();
                boolean z = !C0XUD.LJIIJJI;
                String str = this.LLLLLLL;
                AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(58);
                c851910XbR.getClass();
                this.LLLF = C851910XbR.LIZ(viewFindViewById, true, z, "", str, aFwS257S0000000_19, true);
                return;
            }
            return;
        }
        if (!((Boolean) this.LLLLLLLLLL.getValue()).booleanValue() && ((c1237220iIi = this.LLLLII) == null || !c1237220iIi.LIZIZ())) {
            ET();
        }
        C1234920iF0.LJI(this, this, getEmail());
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final void rT(String str, String str2) {
        String str3;
        String email;
        if (str2 == null) {
            str3 = "code";
        } else {
            str3 = str2;
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            C786410Ut5.LJJJI("verify_method", str3, arguments);
        }
        if (zT()) {
            String enterFrom = getEnterFrom();
            getEnterMethod();
            getEmail();
            C0XZ3.LIZIZ(enterFrom, this, this, str, CT(), SR(), str2, new AwS557S0100000_13(this, 68));
            return;
        }
        Map<String, String> mapNR = NR();
        if (DT()) {
            mapNR.put("passport_ticket", CT());
        }
        C0XZ4 c0xz4 = C0XZ4.LIZ;
        if (DT()) {
            email = "";
        } else {
            email = getEmail();
        }
        String strMT = mT();
        c0xz4.getClass();
        C0XZ4.LJIIIZ(this, this, email, str, str3, strMT, mapNR).LJIILL();
    }

    @Override // X.InterfaceC1234930iF1
    public final void hB(String str, String str2, boolean z, boolean z2) {
        C1234920iF0.LIZLLL(this, str, str2, z, z2);
    }
}
