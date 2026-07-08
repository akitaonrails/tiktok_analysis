package com.ss.android.ugc.aweme.account.unbind;

import X.C01GW;
import X.C0XZ4;
import X.C1236860iI8;
import X.C1237010iIN;
import X.C452501pT;
import X.C786410Ut5;
import X.C852810Xct;
import X.C853080XdK;
import X.C853090XdL;
import X.C853130XdP;
import X.C853310Xdh;
import X.C853770XeR;
import X.C854460XfY;
import X.EnumC854430XfV;
import Y.ACListenerS148S0100000_13;
import Y.AObserverS217S0100000_13;
import Y.AfS182S0100000_13;
import android.os.Bundle;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ICoinEmailAccountService;
import com.ss.android.ugc.aweme.account.login.v2.base.AccountFlowFragmentViewModel;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2;
import com.ss.android.ugc.aweme.account.model.VerificationMethodType;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.AwS557S0100000_13;

/* JADX INFO: loaded from: classes14.dex */
public final class UnbindInputCodeFragment extends InputCodeFragmentV2 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjHELIOSFiPCExISsoZxo9KiwiLQY9ODA4CiA3LQM+KCg+LSs4";
    public final C01GW LLLLLJLJLL = C452501pT.LIZIZ(new AwS557S0100000_13(this, 106));

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final String ZR() {
        return "UnbindInputCodeFragment";
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final void uT() {
        if (OR().yQ2()) {
            if (NS() == VerificationMethodType.MOBILE) {
                OR().wQ2(new InputCodeFragmentV2.VerifyCodeActions.ClickResendPhoneCodeAction(new C853310Xdh(zT()), this));
                return;
            } else {
                OR().wQ2(new InputCodeFragmentV2.VerifyCodeActions.ClickResendEmailCodeAction(new C853130XdP(zT()), this));
                return;
            }
        }
        C854460XfY.LIZ.getClass();
        Map mapLJIIJJI = C854460XfY.LJIIJJI(this);
        C853770XeR c853770XeR = C853770XeR.LIZ;
        c853770XeR.getClass();
        if (C853770XeR.LIZIZ(this)) {
            C853770XeR.LJ(c853770XeR, this, "resend", null, mapLJIIJJI, null, new AwS557S0100000_13(this, 107), 20);
            return;
        }
        AwS557S0100000_13 awS557S0100000_13 = new AwS557S0100000_13(this, 108);
        c853770XeR.getClass();
        C853770XeR.LIZJ(this, "resend", null, mapLJIIJJI, awS557S0100000_13);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final C1236860iI8 eT() {
        C1236860iI8 c1236860iI8 = new C1236860iI8();
        c1236860iI8.LIZ = zT();
        C853770XeR.LIZ.getClass();
        c1236860iI8.LIZIZ = C853770XeR.LIZIZ(this) || NS() == VerificationMethodType.MOBILE;
        C852810Xct.LIZ.getClass();
        c1236860iI8.LJ = C852810Xct.LIZIZ(this);
        return c1236860iI8;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C1237010iIN iS() {
        String string;
        C1237010iIN c1237010iIN = new C1237010iIN(null, null, false, null, null, false, null, false, false, null, false, null, null, null, null, 67108863);
        c1237010iIN.LJIIIIZZ = getString(2131857885);
        C853770XeR.LIZ.getClass();
        if (C853770XeR.LIZIZ(this)) {
            string = getString(C853770XeR.LIZ(this) ? 2131857884 : 2131857873, zT());
        } else {
            string = getString(2131833843, zT());
        }
        c1237010iIN.LJIIIZ = string;
        c1237010iIN.LIZ = " ";
        c1237010iIN.LJIIL = false;
        return c1237010iIN;
    }

    public final String zT() {
        return (String) this.LLLLLJLJLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, X.InterfaceC1237610iJL
    public final void LJJLL() {
        super.LJJLL();
        C853770XeR.LIZ.getClass();
        XS((C853770XeR.LIZIZ(this) || NS() == VerificationMethodType.MOBILE) ? EnumC854430XfV.SMS : EnumC854430XfV.EMAIL);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        clearFromXmlViewCache();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        super.onViewCreated(view, bundle);
        TuxTextView tuxTextViewZS = ZS();
        C854460XfY c854460XfY = C854460XfY.LIZ;
        VerificationMethodType verificationMethodTypeNS = NS();
        c854460XfY.getClass();
        if (!((ArrayList) C854460XfY.LJFF(this, verificationMethodTypeNS)).isEmpty()) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LLLLZLL(tuxTextViewZS, i);
        C786410Ut5.h9(tuxTextViewZS, new ACListenerS148S0100000_13(this, 30));
        tuxTextViewZS.setText(getString(2131823012));
        if (!OR().yQ2()) {
            VS();
        }
        ((AccountFlowFragmentViewModel) this.LLILLJJLI.getValue()).LLILLJJLI.observe(getViewLifecycleOwner(), new AObserverS217S0100000_13(this, 0));
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final void rT(String str, String str2) {
        if (OR().yQ2()) {
            if (NS() == VerificationMethodType.MOBILE) {
                OR().wQ2(new InputCodeFragmentV2.VerifyCodeActions.VerifyPhoneCodeAction(new C853080XdK(zT(), str, this.LLLLL, this.LLLLLIL, false), this));
                return;
            } else {
                OR().wQ2(new InputCodeFragmentV2.VerifyCodeActions.VerifyEmailCodeAction(new C853090XdL(zT(), str, str2, mT(), this.LLLLL, this.LLLLLIL), this));
                return;
            }
        }
        C853770XeR.LIZ.getClass();
        if (C853770XeR.LIZIZ(this)) {
            C0XZ4 c0xz4 = C0XZ4.LIZ;
            C854460XfY.LIZ.getClass();
            Map mapLJIIJJI = C854460XfY.LJIIJJI(this);
            c0xz4.getClass();
            C0XZ4.LJJIL(this, this, str, 22, mapLJIIJJI).LJIIIIZZ(new AfS182S0100000_13(this, 113)).LJII(new AfS182S0100000_13(this, 114)).LJIILL();
            return;
        }
        ICoinEmailAccountService iCoinEmailAccountService = (ICoinEmailAccountService) PluggableExtentionKt.pluggableSpi$default(ICoinEmailAccountService.class, false, false, false, 14, null);
        if (iCoinEmailAccountService != null) {
            iCoinEmailAccountService.LIZJ();
        }
        C0XZ4 c0xz42 = C0XZ4.LIZ;
        C854460XfY.LIZ.getClass();
        c0xz42.LJJJ(this, this, str, 25, C854460XfY.LJIIJJI(this), str2, mT()).LJIIIIZZ(new AfS182S0100000_13(this, 111)).LJII(new AfS182S0100000_13(this, 112)).LJIILL();
    }
}
