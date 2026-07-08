package com.ss.android.ugc.aweme.account.setpwd;

import X.C01GW;
import X.C0XGR;
import X.C0XZ4;
import X.C1236860iI8;
import X.C1237010iIN;
import X.C20684815ws;
import X.C452501pT;
import X.C786410Ut5;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.View;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2;
import kotlin.jvm.internal.AwS557S0100000_13;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes14.dex */
public final class OrgLoginOtpFragment extends InputCodeFragmentV2 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmHELIOSJjFiOionODIoZwAhLwkjLiY9BzE8Dz0yLygpJzs=";
    public final C01GW LLLLLJLJLL = C452501pT.LIZIZ(new AwS557S0100000_13(this, 94));
    public final C01GW LLLLLL = C452501pT.LIZIZ(new AwS557S0100000_13(this, 93));

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C1237010iIN iS() {
        String string = getString(2131839034, this.LLLLLL.getValue());
        int iLJJJ = a0.LJJJ(string, (String) this.LLLLLL.getValue(), 0, false, 6);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        if (iLJJJ >= 0) {
            C786410Ut5.q2(spannableStringBuilder, new StyleSpan(1), iLJJJ, ((String) this.LLLLLL.getValue()).length() + iLJJJ, 33);
        }
        C1237010iIN c1237010iIN = new C1237010iIN(null, null, false, null, null, false, null, false, false, null, false, null, null, null, null, 67108863);
        c1237010iIN.LJIIIIZZ = getString(2131839035);
        c1237010iIN.LJIIIZ = spannableStringBuilder;
        c1237010iIN.LIZ = " ";
        c1237010iIN.LJIIL = true;
        c1237010iIN.LJFF = true;
        return c1237010iIN;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final void uT() {
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final C1236860iI8 eT() {
        C1236860iI8 c1236860iI8 = new C1236860iI8();
        c1236860iI8.LIZ = (String) this.LLLLLJLJLL.getValue();
        c1236860iI8.LIZIZ = false;
        c1236860iI8.LJ = true;
        return c1236860iI8;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, X.InterfaceC1237610iJL
    public final void LJJLL() {
        super.LJJLL();
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_method", getEnterMethod());
        c0xgr.LIZLLL("enter_from", getEnterFrom());
        c0xgr.LIZLLL("login_panel_type", PR());
        c0xgr.LIZLLL("platform", "business_otp");
        Bundle arguments = getArguments();
        c0xgr.LIZLLL("tt_account_type", arguments != null ? arguments.getString("tt_account_type") : null);
        c0xgr.LIZLLL("business_platform_name", (String) this.LLLLLL.getValue());
        Bundle arguments2 = getArguments();
        c0xgr.LIZLLL("is_org_account", arguments2 != null ? arguments2.getString("is_org_account") : null);
        Bundle arguments3 = getArguments();
        c0xgr.LIZLLL("is_org_account_inter_period", arguments3 != null ? arguments3.getString("is_org_account_inter_period") : null);
        C20684815ws.LJIILLIIL("start_business_login_code_typing", c0xgr.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        clearFromXmlViewCache();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        String string2;
        super.onViewCreated(view, bundle);
        C786410Ut5.LLLLZLL(gT(), 4);
        C786410Ut5.c(hT(), 4);
        gT().setEnabled(false);
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_method", getEnterMethod());
        c0xgr.LIZLLL("enter_from", getEnterFrom());
        c0xgr.LIZLLL("login_panel_type", PR());
        c0xgr.LIZLLL("platform", "business_otp");
        Bundle arguments = getArguments();
        String string3 = null;
        if (arguments != null) {
            string = arguments.getString("tt_account_type");
        } else {
            string = null;
        }
        c0xgr.LIZLLL("tt_account_type", string);
        c0xgr.LIZLLL("business_platform_name", (String) this.LLLLLL.getValue());
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            string2 = arguments2.getString("is_org_account");
        } else {
            string2 = null;
        }
        c0xgr.LIZLLL("is_org_account", string2);
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            string3 = arguments3.getString("is_org_account_inter_period");
        }
        c0xgr.LIZLLL("is_org_account_inter_period", string3);
        C20684815ws.LJIILLIIL("business_login_code_page_show", c0xgr.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final void rT(String str, String str2) {
        C0XZ4.LJIJ(C0XZ4.LIZ, this, this, (String) this.LLLLLJLJLL.getValue(), str, "business_otp", null, 96).LJIILL();
    }
}
