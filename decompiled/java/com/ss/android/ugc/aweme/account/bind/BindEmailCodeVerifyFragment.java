package com.ss.android.ugc.aweme.account.bind;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C0HZQ;
import X.C0XQ5;
import X.C0XUD;
import X.C0XZ4;
import X.C1236860iI8;
import X.C1236880iIA;
import X.C1237010iIN;
import X.C2187451AjH;
import X.C452501pT;
import X.C616540OGe;
import X.C786410Ut5;
import X.C851910XbR;
import X.C852810Xct;
import X.C853090XdL;
import X.C853130XdP;
import X.C854460XfY;
import X.EnumC1237100iIW;
import Y.ACListenerS148S0100000_13;
import Y.ARunnableS113S0100000_13;
import Y.AfS182S0100000_13;
import android.os.Bundle;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.login.v2.base.AccountFlowSharedViewModel;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AFwS247S0000000_13;
import kotlin.jvm.internal.AwS557S0100000_13;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes14.dex */
public final class BindEmailCodeVerifyFragment extends InputCodeFragmentV2 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiHELIOSKyY9LGsOICE3DSgtICMQJyEpHyohISM1Dz0yLygpJzs=";
    public final C01GW LLLLLJLJLL = C452501pT.LIZIZ(new AwS557S0100000_13(this, 31));
    public final C01GW LLLLLL = C452501pT.LIZIZ(new AwS557S0100000_13(this, 32));
    public final C01GW LLLLLLIL = C452501pT.LIZIZ(new AwS557S0100000_13(this, 33));
    public final String LLLLLLJ = "email/username";

    static {
        new Regex("(.)");
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final C1236860iI8 eT() {
        C1236860iI8 c1236860iI8 = new C1236860iI8();
        c1236860iI8.LIZ = getEmail();
        c1236860iI8.LIZIZ = false;
        C852810Xct.LIZ.getClass();
        c1236860iI8.LJ = C852810Xct.LIZIZ(this);
        return c1236860iI8;
    }

    public final String getEmail() {
        return (String) this.LLLLLJLJLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C1237010iIN iS() {
        boolean zZS = zS();
        C1237010iIN c1237010iIN = new C1237010iIN(null, null, false, null, null, false, null, false, false, null, false, null, null, null, null, 67108863);
        c1237010iIN.LJIIIIZZ = getString(2131823013);
        c1237010iIN.LJIIIZ = C1236880iIA.LIZIZ(C1236880iIA.LIZLLL(getString(2131833843, getEmail()), new String[]{getEmail()}, 52), getContext(), R.attr.a1j, getEmail());
        Bundle arguments = getArguments();
        c1237010iIN.LIZ = (arguments == null || arguments.getInt("progress", -1) < 0) ? " " : getString(2131857337);
        if (!zZS) {
            c1237010iIN.LJIIL = false;
            return c1237010iIN;
        }
        c1237010iIN.LJIIL = true;
        c1237010iIN.LJIIJJI = "optional_signup_email_code";
        c1237010iIN.LJIILIIL = "aweme://roma_redirect/?spark_page=TT_CSP_Common_TopicList&entrance=PII_email_otp&enter_from=PII_email_otp";
        return c1237010iIN;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        super.clearFromXmlViewCache();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        C0HZQ c0hzq;
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(BindEmailCodeVerifyFragment.class.getName());
        }
        super.onResume();
        if (!rS() || (c0hzq = this.LLLF) == null) {
            return;
        }
        HandlerHook.viewPostDelay(c0hzq, new ARunnableS113S0100000_13(this, 82), 100L);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final void uT() {
        if (OR().yQ2()) {
            OR().wQ2(new InputCodeFragmentV2.VerifyCodeActions.ClickResendEmailCodeAction(new C853130XdP(getEmail()), this));
        } else {
            BindEmailFragment.LLLLLILLIL.invoke(this, getEmail(), "resend").LJIIIIZZ(new AfS182S0100000_13(this, 9)).LJIILL();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void clearFromXmlViewCache() {
        super.clearFromXmlViewCache();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final String hS() {
        return this.LLLLLLJ;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (((Boolean) this.LLLLLL.getValue()).booleanValue()) {
            BindEmailFragment.LLLLLILLIL.invoke(this, getEmail(), "user_click").LJIIIIZZ(new AfS182S0100000_13(this, 7)).LJIILL();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        View viewFindViewById;
        TuxTextView tuxTextView;
        super.onViewCreated(view, bundle);
        if (rS()) {
            C0XQ5.LIZIZ.LJIIJ();
            if (!AbstractC848400XPy.LJJIJIIJIL() && (tuxTextView = (TuxTextView) view.findViewById(R.id.dnx)) != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 0);
                tuxTextView.setText(getString(2131821286));
                GS(new ACListenerS148S0100000_13(this, 7), tuxTextView);
            }
        }
        if ((rS() || zS()) && (viewFindViewById = view.findViewById(R.id.gyc)) != null) {
            C851910XbR c851910XbR = C851910XbR.LIZ;
            C0XUD.LIZ.getClass();
            boolean z = !C0XUD.LJIIJJI;
            String str = this.LLLLLLJ;
            AFwS247S0000000_13 aFwS247S0000000_13 = AFwS247S0000000_13.get$arr$(9);
            boolean zZS = zS();
            c851910XbR.getClass();
            this.LLLF = C851910XbR.LIZ(viewFindViewById, true, z, "", str, aFwS247S0000000_13, zZS);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final void rT(String str, String str2) {
        boolean zIsChecked = false;
        if (OR().yQ2()) {
            AccountFlowSharedViewModel accountFlowSharedViewModelOR = OR();
            String email = getEmail();
            String strMT = mT();
            boolean z = this.LLLLL;
            EnumC1237100iIW enumC1237100iIW = this.LLLLLIL;
            C0HZQ c0hzq = this.LLLF;
            if (c0hzq != null) {
                zIsChecked = c0hzq.isChecked();
            }
            accountFlowSharedViewModelOR.wQ2(new InputCodeFragmentV2.VerifyCodeActions.VerifyEmailCodeAction(new C853090XdL(email, str, str2, strMT, z, enumC1237100iIW, zIsChecked), this));
            return;
        }
        C0XZ4 c0xz4 = C0XZ4.LIZ;
        String email2 = getEmail();
        Bundle arguments = getArguments();
        if (arguments != null) {
            zIsChecked = arguments.getBoolean("from_changePwd", false);
        }
        getEnterFrom();
        getEnterMethod();
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            arguments2.getString("page");
        }
        String strMT2 = mT();
        C854460XfY.LIZ.getClass();
        Map mapLJIIIZ = C854460XfY.LJIIIZ(this);
        c0xz4.getClass();
        C0XZ4.LIZ(this, this, email2, str, zIsChecked, str2, strMT2, mapLJIIIZ).LJIIIIZZ(new AfS182S0100000_13(this, 8)).LJIILL();
    }
}
