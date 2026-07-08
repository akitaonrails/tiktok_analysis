package com.ss.android.ugc.aweme.account.setpwd;

import X.C01GW;
import X.C0XZ4;
import X.C1236860iI8;
import X.C1237010iIN;
import X.C19481011Jo;
import X.C452501pT;
import X.C854700Xfw;
import Y.AfS182S0100000_13;
import android.os.Bundle;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AwS557S0100000_13;

/* JADX INFO: loaded from: classes14.dex */
public final class EmailCodeChangePwdFragment extends InputCodeFragmentV2 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiHELIOSOionODIoZwo+KSwgCiA3LQYkKCE0LRU7LQkhKSIhLCEn";
    public final C01GW LLLLLJLJLL = C452501pT.LIZIZ(new AwS557S0100000_13(this, 92));
    public final C01GW LLLLLL = C452501pT.LIZIZ(new AwS557S0100000_13(this, 91));

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
        c1237010iIN.LJIIIIZZ = getString(2131833845);
        boolean z = true;
        c1237010iIN.LJIIIZ = getString(2131833843, this.LLLLLJLJLL.getValue());
        c1237010iIN.LIZ = " ";
        c1237010iIN.LJIIL = false;
        c1237010iIN.LJII = this.LLLLLL.getValue() != null ? getString(2131828515) : "";
        if (!((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().isLogin() && this.LLLLLL.getValue() != null) {
            z = false;
        }
        c1237010iIN.LJFF = z;
        return c1237010iIN;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final void uT() {
        zT("resend").LJIILL();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zT("auto_system").LJIILL();
    }

    public final C19481011Jo zT(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object value = this.LLLLLL.getValue();
        if (value != null) {
            linkedHashMap.put("conditional_login_ticket", value);
        }
        return C0XZ4.LJJIII(C0XZ4.LIZ, this, this, "", 11, str, linkedHashMap, null, null, null, null, 960).LJFF(new C854700Xfw(this, 5));
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final void rT(String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object value = this.LLLLLL.getValue();
        if (value != null) {
            linkedHashMap.put("conditional_login_ticket", value);
        }
        C0XZ4.LIZ.LJJJ(this, this, str, 11, linkedHashMap, str2, mT()).LJIIIIZZ(new AfS182S0100000_13(this, 51)).LJIILL();
    }
}
