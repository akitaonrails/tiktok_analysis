package com.ss.android.ugc.aweme.account.login.twostep.event;

import X.AbstractC207072161e;
import X.C13LE;
import X.C2097608Jq;
import X.C2805016t;
import X.InterfaceC1282004zy;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes20.dex */
public final class TwosvSetupMethodRemoveSuccessEvent extends AbstractC207072161e {
    public final Map<String, C2805016t> LJII;

    public TwosvSetupMethodRemoveSuccessEvent() {
        super("twosv_setup_method_remove_success");
        Class cls = Integer.TYPE;
        this.LJII = C2097608Jq.LJIIIIZZ(new Pair("enter_from", new C2805016t(true, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), null, false)), new Pair("is_email_removed", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(cls)), null, false)), new Pair("is_pw_removed", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(cls)), null, false)), new Pair("is_sms_removed", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(cls)), null, false)), new Pair("is_totp_removed", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(cls)), null, false)), new Pair("type", new C2805016t(true, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), null, false)), new Pair("verification_method", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), null, false)));
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
