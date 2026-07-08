package com.ss.android.ugc.aweme.account.changemail;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C0HZQ;
import X.C0XQ5;
import X.C0XUD;
import X.C0XZ4;
import X.C1236860iI8;
import X.C1236880iIA;
import X.C1237010iIN;
import X.C1237220iIi;
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
import kotlin.jvm.internal.AFwS247S0000000_13;
import kotlin.jvm.internal.AwS557S0100000_13;

/* JADX INFO: loaded from: classes14.dex */
public final class ChangeEmailVerifyFragment extends InputCodeFragmentV2 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiKiHELIOScyJiIpJC46JGsPIS49LyAJJC46JBMpOyY1MQM+KCg+LSs4";
    public final C01GW LLLLLJLJLL = C452501pT.LIZIZ(new AwS557S0100000_13(this, 36));
    public final String LLLLLL = "email/username";

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final void uT() {
        if (OR().yQ2()) {
            OR().wQ2(new InputCodeFragmentV2.VerifyCodeActions.ClickResendEmailCodeAction(new C853130XdP(getEmail()), this));
        } else {
            ChangeEmailFragment.LLLLJ.invoke(this, getEmail(), "resend", null, 7).LJIIIIZZ(new AfS182S0100000_13(this, 15)).LJIILL();
        }
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
        C1237010iIN c1237010iIN = new C1237010iIN(null, null, false, null, null, false, null, false, false, null, false, null, null, null, null, 67108863);
        c1237010iIN.LJIIIIZZ = getString(2131823013);
        c1237010iIN.LJIIIZ = C1236880iIA.LIZIZ(C1236880iIA.LIZLLL(getString(2131833843, getEmail()), new String[]{getEmail()}, 52), getContext(), R.attr.a1j, getEmail());
        c1237010iIN.LIZ = " ";
        c1237010iIN.LJIIL = false;
        return c1237010iIN;
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
            C2187451AjH.LJJIJIIJI(ChangeEmailVerifyFragment.class.getName());
        }
        super.onResume();
        if (!rS() || (c0hzq = this.LLLF) == null) {
            return;
        }
        HandlerHook.viewPostDelay(c0hzq, new ARunnableS113S0100000_13(this, 84), 100L);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final String hS() {
        return this.LLLLLL;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            C852810Xct.LIZ.getClass();
            C852810Xct.LJIILL(arguments, "email_verification");
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        View viewFindViewById;
        TuxTextView tuxTextView;
        C1237220iIi c1237220iIi;
        super.onViewCreated(view, bundle);
        C852810Xct.LIZ.getClass();
        if (!C852810Xct.LIZIZ(this) && ((c1237220iIi = this.LLLLII) == null || !c1237220iIi.LIZIZ())) {
            uT();
        }
        if (OR().yQ2()) {
            TuxTextView tuxTextViewKS = kS();
            Bundle arguments = getArguments();
            if (arguments != null && arguments.getBoolean("show_edit_icon")) {
                C786410Ut5.h9(tuxTextViewKS, new ACListenerS148S0100000_13(this, 11));
            }
        }
        if (rS()) {
            C0XQ5.LIZIZ.LJIIJ();
            if (!AbstractC848400XPy.LJJIJIIJIL() && (tuxTextView = (TuxTextView) view.findViewById(R.id.dnx)) != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 0);
                tuxTextView.setText(getString(2131821286));
                GS(new ACListenerS148S0100000_13(this, 12), tuxTextView);
            }
        }
        if (rS() && (viewFindViewById = view.findViewById(R.id.gyc)) != null) {
            C851910XbR c851910XbR = C851910XbR.LIZ;
            C0XUD.LIZ.getClass();
            boolean z = !C0XUD.LJIIJJI;
            String str = this.LLLLLL;
            AFwS247S0000000_13 aFwS247S0000000_13 = AFwS247S0000000_13.get$arr$(10);
            c851910XbR.getClass();
            this.LLLF = C851910XbR.LIZ(viewFindViewById, true, z, "", str, aFwS247S0000000_13, false);
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
        C852810Xct.LIZ.getClass();
        String strLJIIJ = C852810Xct.LJIIJ(this);
        boolean z2 = requireArguments().getBoolean("from_changePwd", false);
        C854460XfY.LIZ.getClass();
        c0xz4.LJ(this, this, email2, str, strLJIIJ, z2, C854460XfY.LJIIJJI(this), str2, mT()).LJIIIIZZ(new AfS182S0100000_13(this, 14)).LJIILL();
    }
}
