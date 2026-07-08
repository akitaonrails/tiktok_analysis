package com.ss.android.ugc.aweme.account.login.v2.ui.fragments;

import X.C01GW;
import X.C1236860iI8;
import X.C1237010iIN;
import X.C1260730iud;
import X.C452501pT;
import X.C786410Ut5;
import X.C851620Xay;
import X.C851630Xaz;
import X.C851660Xb2;
import X.C851730Xb9;
import X.C851830XbJ;
import X.C852810Xct;
import X.EnumC852910Xd3;
import X.InterfaceC851650Xb1;
import android.os.Bundle;
import android.view.View;
import java.util.Set;
import kotlin.jvm.internal.AwS557S0100000_13;

/* JADX INFO: loaded from: classes14.dex */
public final class EmailOTPSignupCodeVerifyFragment extends InputCodeFragmentV2 implements InterfaceC851650Xb1 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiJSA0IStiP319PSHELIOSxiLz0yLygpJzsgZgAhKCY/BxEcGiY0JjA8CiA3LRMpOyY1MQM+KCg+LSs4";
    public View LLLLLJLJLL;
    public final C01GW LLLLLL = C452501pT.LIZIZ(new AwS557S0100000_13(this, 69));
    public final String LLLLLLIL = "email/username";

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final C1236860iI8 eT() {
        C1236860iI8 c1236860iI8 = new C1236860iI8();
        c1236860iI8.LIZ = (String) this.LLLLLL.getValue();
        c1236860iI8.LIZIZ = false;
        C852810Xct.LIZ.getClass();
        c1236860iI8.LJ = C852810Xct.LIZIZ(this);
        return c1236860iI8;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final void uT() {
        C851830XbJ.LIZ(this, this, (String) this.LLLLLL.getValue(), "resend", new AwS557S0100000_13(this, 70));
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void clearFromXmlViewCache() {
        super.clearFromXmlViewCache();
        this.LLLLLJLJLL = null;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C1237010iIN iS() {
        return new C1237010iIN(" ", null, false, getString(2131858060), getString(2131858061, this.LLLLLL.getValue()), false, "email_sign_up_homepage", true, false, null, false, null, null, null, null, 67095806);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        clearFromXmlViewCache();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final String hS() {
        return this.LLLLLLIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r11, android.os.Bundle r12) {
        /*
            r10 = this;
            super.onViewCreated(r11, r12)
            X.0XbR r2 = X.C851910XbR.LIZ
            android.view.View r3 = r10.LLLLLJLJLL
            if (r3 != 0) goto L18
            android.view.View r1 = r10.getView()
            if (r1 == 0) goto L64
            r0 = 2131371475(0x7f0a25d3, float:1.8362986E38)
            android.view.View r3 = r1.findViewById(r0)
        L16:
            r10.LLLLLJLJLL = r3
        L18:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.account.oneclicklogin.IOneClickLoginService> r0 = com.ss.android.ugc.aweme.account.oneclicklogin.IOneClickLoginService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.account.oneclicklogin.IOneClickLoginService r0 = (com.ss.android.ugc.aweme.account.oneclicklogin.IOneClickLoginService) r0
            boolean r0 = r0.LIZIZ()
            if (r0 == 0) goto L62
            com.ss.android.ugc.aweme.compliance.api.services.edm.IPnsEdmConsentService r1 = com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider.LJIJ()
            java.lang.String r0 = "sign_up"
            boolean r0 = r1.LIZLLL(r0)
            if (r0 == 0) goto L62
            X.0XeK r0 = X.C853700XeK.LIZ
            r0.getClass()
            boolean r0 = X.C853700XeK.LIZ()
            if (r0 != 0) goto L62
            r4 = 1
        L43:
            boolean r5 = r10.wS()
            java.lang.String r6 = r10.PR()
            java.lang.String r7 = r10.LLLLLLIL
            r8 = 0
            r9 = 1
            r2.getClass()
            X.0HZQ r0 = X.C851910XbR.LIZ(r3, r4, r5, r6, r7, r8, r9)
            r10.LLLF = r0
            com.bytedance.tux.input.TuxTextView r1 = r10.ZS()
            r0 = 8
            X.C786410Ut5.LLLLZLL(r1, r0)
            return
        L62:
            r4 = 0
            goto L43
        L64:
            r3 = 0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.EmailOTPSignupCodeVerifyFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final void rT(String str, String str2) {
        String str3;
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (str2 == null) {
                str3 = "code";
            } else {
                str3 = str2;
            }
            C786410Ut5.LJJJI("verify_method", str3, arguments);
            JS(arguments);
        }
        Set<String> set = C1260730iud.LIZ;
        if (C851730Xb9.LIZIZ()) {
            iT().setEnabled(true);
        }
        C851630Xaz c851630Xaz = C851630Xaz.LIZ;
        String str4 = (String) this.LLLLLL.getValue();
        String strMT = mT();
        c851630Xaz.getClass();
        C851630Xaz.LIZ(this, str4, str, str2, strMT);
    }

    @Override // X.InterfaceC851550Xar
    public final void QK(EnumC852910Xd3 enumC852910Xd3, Bundle bundle, C851660Xb2 c851660Xb2) {
        C851620Xay.LIZ(this, enumC852910Xd3, bundle, c851660Xb2);
    }
}
