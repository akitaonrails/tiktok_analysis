package com.ss.android.ugc.aweme.account.login.v2.ui.fragments;

import X.AbstractC19483511Kn;
import X.C01GW;
import X.C0XZ4;
import X.C123100dR;
import X.C1236860iI8;
import X.C1237010iIN;
import X.C1239250iLz;
import X.C2093608Ic;
import X.C452501pT;
import X.C850040XWg;
import X.C852170Xbr;
import X.C852810Xct;
import X.EnumC1237820iJg;
import X.EnumC852910Xd3;
import Y.AfS108S0300000_13;
import Y.AfS149S0200000_13;
import Y.AfS182S0100000_13;
import com.ss.android.ugc.aweme.services.interceptor.ConditionalBindLoginParam;
import com.ss.android.ugc.aweme.services.interceptor.ForcePhoneVerificationManager;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS557S0100000_13;

/* JADX INFO: loaded from: classes14.dex */
public final class ForceVerifyPhoneInputCodeFragment extends InputCodeFragmentV2 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiJSA0IStiP319PSxiHELIOSLz0yLygpJzsgZgMjOyw2HiA+ICkqGC0jJyoaJjU5PQw8LCAKOy40JSAiPQ==";
    public final C01GW LLLLLJLJLL = C452501pT.LIZIZ(new AwS557S0100000_13(this, 72));

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final C1236860iI8 eT() {
        C1236860iI8 c1236860iI8 = new C1236860iI8();
        c1236860iI8.LIZ = (String) this.LLLLLJLJLL.getValue();
        c1236860iI8.LIZIZ = true;
        C852810Xct.LIZ.getClass();
        c1236860iI8.LJ = C852810Xct.LIZIZ(this);
        c1236860iI8.LIZLLL = Boolean.TRUE;
        return c1236860iI8;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C1237010iIN iS() {
        C1237010iIN c1237010iIN = new C1237010iIN(null, null, false, null, null, false, null, false, false, null, false, null, null, null, null, 67108863);
        c1237010iIN.LJIIIIZZ = getString(2131829360);
        c1237010iIN.LJIIIZ = getString(2131829359, this.LLLLLJLJLL.getValue());
        c1237010iIN.LIZ = " ";
        c1237010iIN.LJIIJJI = "ForceVerifyPhoneInputCodeFragment";
        return c1237010iIN;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final void uT() {
        C0XZ4 c0xz4 = C0XZ4.LIZ;
        C852810Xct.LIZ.getClass();
        String strLJIIIIZZ = C852810Xct.LJIIIIZZ(this);
        EnumC852910Xd3 enumC852910Xd3VR = VR();
        c0xz4.getClass();
        C0XZ4.LJJIIJ(this, this, strLJIIIIZZ, enumC852910Xd3VR, "resend", null, null).LJIIIIZZ(new AfS182S0100000_13(this, 32)).LJIILL();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final void rT(String str, String str2) {
        ConditionalBindLoginParam param = ForcePhoneVerificationManager.INSTANCE.getParam((String) this.LLLLLJLJLL.getValue(), str);
        if (param == null) {
            pn(0, getString(2131834217));
            return;
        }
        C0XZ4.LIZ.getClass();
        Map<String, String> originParam = param.getOriginParam();
        if (originParam == null) {
            originParam = new LinkedHashMap<>();
        }
        originParam.put("mix_mode", "1");
        originParam.put("mobile", C2093608Ic.LIZIZ(param.getMobile()));
        originParam.put("sms_code", C2093608Ic.LIZIZ(param.getCode()));
        originParam.put("type", C2093608Ic.LIZIZ("42"));
        originParam.put("verify_logic_type", String.valueOf(param.getVerifyLogicType()));
        originParam.put("phone_number_source", String.valueOf(EnumC1237820iJg.DYA_BIND_PHONE_CONDITIONAL_BIND_PHONE.getValue()));
        String profileKey = param.getProfileKey();
        if (profileKey != null && C123100dR.LIZ(profileKey)) {
            originParam.put("profile_key", profileKey);
        }
        String emailCodeKey = param.getEmailCodeKey();
        if (emailCodeKey != null && C123100dR.LIZ(emailCodeKey)) {
            originParam.put("email_code_key", emailCodeKey);
        }
        C852170Xbr c852170Xbr = C852170Xbr.LIZ;
        Boolean bool = Boolean.TRUE;
        c852170Xbr.getClass();
        C852170Xbr.LJIIJ(bool, "phone", this, false, null);
        C1239250iLz.LIZIZ(this, this, AbstractC19483511Kn.LJ(new C850040XWg(this, "/passport/mobile/conditional_bind_login/", originParam)).LJIIIIZZ(new AfS108S0300000_13(this, this, param, 2)).LJII(new AfS149S0200000_13(this, param, 6))).LJIIIIZZ(new AfS182S0100000_13(this, 31)).LJIILL();
    }
}
