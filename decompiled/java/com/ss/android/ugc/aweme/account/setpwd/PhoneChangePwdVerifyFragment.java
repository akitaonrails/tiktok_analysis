package com.ss.android.ugc.aweme.account.setpwd;

import X.C01GW;
import X.C0XZ4;
import X.C1236860iI8;
import X.C1237010iIN;
import X.C19481011Jo;
import X.C452501pT;
import X.C854700Xfw;
import X.EnumC852660Xce;
import X.EnumC852910Xd3;
import Y.AfS182S0100000_13;
import android.os.Bundle;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AwS557S0100000_13;

/* JADX INFO: loaded from: classes14.dex */
public final class PhoneChangePwdVerifyFragment extends InputCodeFragmentV2 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiOiHELIOSonODIoZx87JyspCicyJiIpGTg3HiA+ICkqDjctLiI2JjE=";
    public final C01GW LLLLLJLJLL = C452501pT.LIZIZ(new AwS557S0100000_13(this, 96));
    public final C01GW LLLLLL = C452501pT.LIZIZ(new AwS557S0100000_13(this, 95));

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final C1236860iI8 eT() {
        C1236860iI8 c1236860iI8 = new C1236860iI8();
        c1236860iI8.LIZ = (String) this.LLLLLJLJLL.getValue();
        c1236860iI8.LIZIZ = true;
        c1236860iI8.LIZLLL = Boolean.FALSE;
        c1236860iI8.LJ = false;
        return c1236860iI8;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C1237010iIN iS() {
        C1237010iIN c1237010iIN = new C1237010iIN(null, null, false, null, null, false, null, false, false, null, false, null, null, null, null, 67108863);
        c1237010iIN.LJIIIIZZ = getString(2131829360);
        boolean z = true;
        c1237010iIN.LJIIIZ = getString(2131847687, this.LLLLLJLJLL.getValue());
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
        zT("user_click").LJIILL();
    }

    public final C19481011Jo zT(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object value = this.LLLLLL.getValue();
        if (value != null) {
            linkedHashMap.put("conditional_login_ticket", value);
        }
        C0XZ4 c0xz4 = C0XZ4.LIZ;
        String str2 = (String) this.LLLLLJLJLL.getValue();
        EnumC852660Xce enumC852660XceSR = SR();
        EnumC852910Xd3 enumC852910Xd3VR = VR();
        c0xz4.getClass();
        return C0XZ4.LJJIIZ(this, this, str2, enumC852660XceSR, enumC852910Xd3VR, "", str, linkedHashMap).LJFF(new C854700Xfw(this, 6));
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final void rT(String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object value = this.LLLLLL.getValue();
        if (value != null) {
            linkedHashMap.put("conditional_login_ticket", value);
        }
        C0XZ4.LIZ.getClass();
        C0XZ4.LJJIL(this, this, str, 13, linkedHashMap).LJIIIIZZ(new AfS182S0100000_13(this, 52)).LJIILL();
    }
}
