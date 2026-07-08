package com.ss.android.ugc.aweme.account.changemail;

import X.C01GW;
import X.C0XZ4;
import X.C1236860iI8;
import X.C1237010iIN;
import X.C19481011Jo;
import X.C452501pT;
import X.C786410Ut5;
import X.C852810Xct;
import X.C853090XdL;
import X.C853130XdP;
import X.C854460XfY;
import X.C854700Xfw;
import X.EnumC854430XfV;
import Y.ACListenerS148S0100000_13;
import Y.AfS182S0100000_13;
import android.os.Bundle;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2;
import com.ss.android.ugc.aweme.account.model.VerificationMethodType;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS557S0100000_13;

/* JADX INFO: loaded from: classes14.dex */
public final class VerifyEmailBeforeChangeFragment extends InputCodeFragmentV2 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiKicyJiHELIOSIpJC46JGsaLD06LjwJJC46JAcpLyAhLQYkKCE0LQM+KCg+LSs4";
    public final C01GW LLLLLJLJLL = C452501pT.LIZIZ(new AwS557S0100000_13(this, 37));

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final C1236860iI8 eT() {
        C1236860iI8 c1236860iI8 = new C1236860iI8();
        c1236860iI8.LIZ = (String) this.LLLLLJLJLL.getValue();
        c1236860iI8.LIZIZ = false;
        c1236860iI8.LJ = false;
        return c1236860iI8;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C1237010iIN iS() {
        C1237010iIN c1237010iIN = new C1237010iIN(null, null, false, null, null, false, null, false, false, null, false, null, null, null, null, 67108863);
        c1237010iIN.LJIIIIZZ = getString(2131823013);
        c1237010iIN.LJIIIZ = getString(2131833843, this.LLLLLJLJLL.getValue());
        c1237010iIN.LIZ = " ";
        c1237010iIN.LJIIL = false;
        return c1237010iIN;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, X.InterfaceC1237610iJL
    public final void LJJLL() {
        super.LJJLL();
        XS(EnumC854430XfV.EMAIL);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        clearFromXmlViewCache();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final void uT() {
        if (OR().yQ2()) {
            OR().wQ2(new InputCodeFragmentV2.VerifyCodeActions.ClickResendEmailCodeAction(new C853130XdP((String) this.LLLLLJLJLL.getValue()), this));
        } else {
            zT("resend").LJIILL();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C852810Xct.LIZ.getClass();
        if (C852810Xct.LIZIZ(this)) {
            C852810Xct.LJIILJJIL(this, false);
        } else {
            zT("auto_system").LJIILL();
        }
    }

    public final C19481011Jo zT(String str) {
        int iPS = PS();
        C0XZ4 c0xz4 = C0XZ4.LIZ;
        String str2 = (String) this.LLLLLJLJLL.getValue();
        C854460XfY.LIZ.getClass();
        return C0XZ4.LJJIII(c0xz4, this, this, str2, iPS, str, C854460XfY.LJIIJJI(this), null, null, null, null, 960).LJFF(new C854700Xfw(this, 7));
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
        ZS().setText(getString(2131823012));
        C786410Ut5.h9(ZS(), new ACListenerS148S0100000_13(this, 13));
        VS();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final void rT(String str, String str2) {
        if (OR().yQ2()) {
            OR().wQ2(new InputCodeFragmentV2.VerifyCodeActions.VerifyEmailCodeAction(new C853090XdL("", str, str2, mT(), this.LLLLL, this.LLLLLIL), this));
            return;
        }
        C0XZ4 c0xz4 = C0XZ4.LIZ;
        int iPS = PS();
        C854460XfY.LIZ.getClass();
        c0xz4.LJJJ(this, this, str, iPS, C854460XfY.LJIIJJI(this), str2, mT()).LJIIIIZZ(new AfS182S0100000_13(this, 16)).LJII(new AfS182S0100000_13(this, 17)).LJIILL();
    }
}
