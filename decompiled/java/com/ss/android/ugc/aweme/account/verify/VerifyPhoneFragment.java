package com.ss.android.ugc.aweme.account.verify;

import X.C01GW;
import X.C0XZ4;
import X.C1236860iI8;
import X.C1237010iIN;
import X.C452501pT;
import X.C786410Ut5;
import X.C852810Xct;
import X.C854700Xfw;
import X.EnumC852660Xce;
import X.EnumC852910Xd3;
import Y.AfS182S0100000_13;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.AwS557S0100000_13;

/* JADX INFO: loaded from: classes14.dex */
public final class VerifyPhoneFragment extends InputCodeFragmentV2 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmHELIOSJjFiPyohISM1Zxk2OiwqMB87JyspDz0yLygpJzs=";
    public final C01GW LLLLLJLJLL = C452501pT.LIZIZ(new AwS557S0100000_13(this, 111));

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final void uT() {
        String str = (String) this.LLLLLJLJLL.getValue();
        C0XZ4 c0xz4 = C0XZ4.LIZ;
        EnumC852660Xce enumC852660XceSR = SR();
        EnumC852910Xd3 enumC852910Xd3VR = VR();
        c0xz4.getClass();
        C0XZ4.LJJIIZ(this, this, str, enumC852660XceSR, enumC852910Xd3VR, "", "resend", null).LJFF(new C854700Xfw(this, 2)).LJIILL();
    }

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
        c1237010iIN.LJIIIIZZ = getString(2131829360);
        c1237010iIN.LJIIIZ = C786410Ut5.k4(Locale.US, getString(2131829359), Arrays.copyOf(new Object[]{this.LLLLLJLJLL.getValue()}, 1));
        c1237010iIN.LIZ = " ";
        c1237010iIN.LJIIL = false;
        return c1237010iIN;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final void rT(String str, String str2) {
        C0XZ4.LIZ.getClass();
        C0XZ4.LJJIL(this, this, str, 22, null).LJIIIIZZ(new AfS182S0100000_13(this, 62)).LJIILL();
    }
}
