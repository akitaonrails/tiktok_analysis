package com.ss.android.ugc.aweme.account.login.twostep.event;

import X.AbstractC207072161e;
import X.C081W;
import X.C081X;
import X.C081Y;
import X.C081Z;
import X.C13LE;
import X.C2097608Jq;
import X.C2805016t;
import X.EnumC1233950iDR;
import X.EnumC20492081a;
import X.EnumC20501081j;
import X.InterfaceC1282004zy;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes20.dex */
public final class TwosvSetupMethodAddSuccessEvent extends AbstractC207072161e {
    public final Map<String, C2805016t> LJII;

    public TwosvSetupMethodAddSuccessEvent() {
        super("twosv_setup_method_add_success");
        Class cls = Integer.TYPE;
        this.LJII = C2097608Jq.LJIIIIZZ(new Pair("enter_from", new C2805016t(true, AbstractC207072161e.LIZIZ(C13LE.LIZ(EnumC20501081j.class)), AbstractC207072161e.LJ("{\"allowed\":[\"discovery\"]}", "enum"), false)), new Pair("is_email_linked", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(cls)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("is_email_selected", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(C081W.class)), AbstractC207072161e.LJ("{\"allowed\":[\"true\",\"false\"]}", "enum"), false)), new Pair("is_mobile_linked", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(cls)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("is_password_set", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(cls)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("is_pw_selected", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(C081X.class)), AbstractC207072161e.LJ("{\"allowed\":[\"true\",\"false\"]}", "enum"), false)), new Pair("is_sms_selected", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(C081Y.class)), AbstractC207072161e.LJ("{\"allowed\":[\"true\",\"false\"]}", "enum"), false)), new Pair("is_totp_selected", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(C081Z.class)), AbstractC207072161e.LJ("{\"allowed\":[\"true\",\"false\"]}", "enum"), false)), new Pair("is_trusted", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(EnumC20492081a.class)), AbstractC207072161e.LJ("{\"allowed\":[\"true\",\"false\"]}", "enum"), false)), new Pair("page_type", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("type", new C2805016t(true, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("verified_method", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(EnumC1233950iDR.class)), AbstractC207072161e.LJ("{\"allowed\":[\"email\",\"sms\",\"password\",\"trusted_environment\"]}", "enum"), false)), new Pair("verify_method", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)));
    }

    @Override // X.AbstractC207072161e
    public final Map<String, C2805016t> LIZJ() {
        return this.LJII;
    }

    @Override // X.AbstractC207072161e
    public final AbstractC207072161e LJII(InterfaceC1282004zy interfaceC1282004zy) {
        LIZ().add(interfaceC1282004zy);
        return this;
    }
}
