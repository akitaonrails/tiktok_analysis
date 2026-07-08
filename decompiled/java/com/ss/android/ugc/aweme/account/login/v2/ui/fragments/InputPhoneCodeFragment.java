package com.ss.android.ugc.aweme.account.login.v2.ui.fragments;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C0HZQ;
import X.C0XQ5;
import X.C0XUD;
import X.C1236860iI8;
import X.C1236890iIB;
import X.C1237010iIN;
import X.C2187451AjH;
import X.C452501pT;
import X.C616540OGe;
import X.C786410Ut5;
import X.C851910XbR;
import X.C852810Xct;
import X.C853080XdK;
import X.C853310Xdh;
import X.C854460XfY;
import X.EnumC1237100iIW;
import X.InterfaceC853100XdM;
import Y.ACListenerS148S0100000_13;
import Y.ARunnableS113S0100000_13;
import android.os.Bundle;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.login.v2.base.AccountFlowSharedViewModel;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.AFwS247S0000000_13;
import kotlin.jvm.internal.AwS557S0100000_13;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class InputPhoneCodeFragment extends InputCodeFragmentV2 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiJSA0IStiHELIOSP319PSxiLz0yLygpJzsgZgwiOTonGC0jJyoQJyEpDz0yLygpJzs=";
    public final C01GW LLLLLJLJLL = C452501pT.LIZIZ(new AwS557S0100000_13(this, 76));
    public final String LLLLLL = "phone";

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C1237010iIN iS() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final C1236860iI8 eT() {
        C1236860iI8 c1236860iI8 = new C1236860iI8();
        c1236860iI8.LIZ = (String) this.LLLLLJLJLL.getValue();
        c1236860iI8.LIZIZ = true;
        C852810Xct.LIZ.getClass();
        c1236860iI8.LJ = C852810Xct.LIZIZ(this);
        return c1236860iI8;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0Xdi] */
    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, X.InterfaceC1237610iJL
    public final void LJJLL() {
        super.LJJLL();
        OR().wQ2(new InputCodeFragmentV2.VerifyCodeActions.StartCodeTypingAction(new InterfaceC853100XdM() { // from class: X.0Xdi
        }, this));
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
            C2187451AjH.LJJIJIIJI(InputPhoneCodeFragment.class.getName());
        }
        super.onResume();
        if (!Intrinsics.LJFF(RR(), "failed_3p_login") || (c0hzq = this.LLLF) == null) {
            return;
        }
        HandlerHook.viewPostDelay(c0hzq, new ARunnableS113S0100000_13(this, 87), 100L);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final void uT() {
        OR().wQ2(new InputCodeFragmentV2.VerifyCodeActions.ClickResendPhoneCodeAction(new C853310Xdh((String) this.LLLLLJLJLL.getValue()), this));
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final String hS() {
        return this.LLLLLL;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C852810Xct.LIZ.getClass();
        if (!C852810Xct.LIZIZ(this)) {
            uT();
        }
        if (OR().yQ2()) {
            TuxTextView tuxTextViewKS = kS();
            Bundle arguments = getArguments();
            if (arguments != null && arguments.getBoolean("show_edit_icon")) {
                C786410Ut5.h9(tuxTextViewKS, new ACListenerS148S0100000_13(this, 19));
            }
            if (Intrinsics.LJFF(RR(), "failed_3p_login")) {
                C1236890iIB c1236890iIB = C1236890iIB.LIZ;
                TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.dnx);
                String str = (String) this.LLLLLJLJLL.getValue();
                C854460XfY.LIZ.getClass();
                String strLJIIJ = C854460XfY.LJIIJ(this);
                C0XQ5.LIZIZ.LJIIJ();
                boolean z = !AbstractC848400XPy.LJJIJIIJIL();
                AFwS200S0000000_13 aFwS200S0000000_13 = AFwS200S0000000_13.get$arr$(83);
                AwS557S0100000_13 awS557S0100000_13 = new AwS557S0100000_13(this, 75);
                c1236890iIB.getClass();
                C1236890iIB.LJ(this, tuxTextView, str, strLJIIJ, z, aFwS200S0000000_13, awS557S0100000_13);
                View viewFindViewById = view.findViewById(R.id.gyc);
                if (viewFindViewById != null) {
                    C851910XbR c851910XbR = C851910XbR.LIZ;
                    C0XUD.LIZ.getClass();
                    boolean z2 = !C0XUD.LJIIJJI;
                    String str2 = this.LLLLLL;
                    AFwS247S0000000_13 aFwS247S0000000_13 = AFwS247S0000000_13.get$arr$(15);
                    c851910XbR.getClass();
                    this.LLLF = C851910XbR.LIZ(viewFindViewById, true, z2, "", str2, aFwS247S0000000_13, true);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final void rT(String str, String str2) {
        boolean zIsChecked;
        AccountFlowSharedViewModel accountFlowSharedViewModelOR = OR();
        String str3 = (String) this.LLLLLJLJLL.getValue();
        EnumC1237100iIW enumC1237100iIW = this.LLLLLIL;
        boolean z = this.LLLLL;
        C0HZQ c0hzq = this.LLLF;
        if (c0hzq != null) {
            zIsChecked = c0hzq.isChecked();
        } else {
            zIsChecked = false;
        }
        accountFlowSharedViewModelOR.wQ2(new InputCodeFragmentV2.VerifyCodeActions.VerifyPhoneCodeAction(new C853080XdK(str3, str, z, enumC1237100iIW, zIsChecked), this));
    }
}
