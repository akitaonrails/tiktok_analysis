package com.ss.android.ugc.aweme.account.login.twostep;

import X.C01GW;
import X.C0XZ4;
import X.C1233960iDS;
import X.C1236860iI8;
import X.C1237010iIN;
import X.C19481011Jo;
import X.C452501pT;
import X.C852810Xct;
import X.C854700Xfw;
import X.EnumC852660Xce;
import X.EnumC852910Xd3;
import Y.AfS182S0100000_13;
import android.os.Bundle;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2;
import kotlin.jvm.internal.AwS557S0100000_13;

/* JADX INFO: loaded from: classes14.dex */
public final class VerifyPhoneForTicketFragment extends InputCodeFragmentV2 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiJSA0ISHELIOStiPTg8OzEpOWEFLTclLzYDICoiLAk8OhElKiQ2PAM+KCg+LSs4";
    public final C01GW LLLLLJLJLL = C452501pT.LIZIZ(new AwS557S0100000_13(this, 50));
    public final C01GW LLLLLL = C452501pT.LIZIZ(new AwS557S0100000_13(this, 49));

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final C1236860iI8 eT() {
        C1236860iI8 c1236860iI8 = new C1236860iI8();
        c1236860iI8.LIZIZ = true;
        c1236860iI8.LIZ = (String) this.LLLLLJLJLL.getValue();
        C852810Xct.LIZ.getClass();
        c1236860iI8.LJ = C852810Xct.LIZIZ(this);
        return c1236860iI8;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C1237010iIN iS() {
        C1237010iIN c1237010iIN = new C1237010iIN(null, null, false, null, null, false, null, false, false, null, false, null, null, null, null, 67108863);
        c1237010iIN.LJIIIIZZ = getString(2131857406);
        c1237010iIN.LJIIIZ = getString(2131857341, this.LLLLLJLJLL.getValue());
        c1237010iIN.LIZ = getString(2131857404);
        c1237010iIN.LJIILL = true;
        c1237010iIN.LJIIL = false;
        c1237010iIN.LJI = true;
        return c1237010iIN;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final void uT() {
        zT("resend").LJIILL();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, X.InterfaceC1237610iJL
    public final void LJJLL() {
        super.LJJLL();
        if (((Boolean) this.LLLLLL.getValue()).booleanValue()) {
            C1233960iDS c1233960iDS = C1233960iDS.LIZ;
            String enterFrom = getEnterFrom();
            String enterMethod = getEnterMethod();
            c1233960iDS.getClass();
            C1233960iDS.LJFF(enterFrom, enterMethod, "sms");
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        clearFromXmlViewCache();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zT("user_click").LJIILL();
    }

    public final C19481011Jo zT(String str) {
        C0XZ4 c0xz4 = C0XZ4.LIZ;
        String str2 = (String) this.LLLLLJLJLL.getValue();
        EnumC852660Xce enumC852660XceSR = SR();
        EnumC852910Xd3 enumC852910Xd3VR = VR();
        c0xz4.getClass();
        return C0XZ4.LJJIIZ(this, this, str2, enumC852660XceSR, enumC852910Xd3VR, "", str, null).LJFF(new C854700Xfw(this, 11));
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final void rT(String str, String str2) {
        if (((Boolean) this.LLLLLL.getValue()).booleanValue()) {
            C1233960iDS.LJ(C1233960iDS.LIZ, getEnterFrom(), getEnterMethod(), "sms");
        }
        C0XZ4.LIZ.getClass();
        C0XZ4.LJJIL(this, this, str, 22, null).LJIIIIZZ(new AfS182S0100000_13(this, 20)).LJIILL();
    }
}
