package com.ss.android.ugc.aweme.account.login.passkey.passkeyets;

import X.AbstractC207072161e;
import X.C13LE;
import X.C2097608Jq;
import X.C2805016t;
import X.InterfaceC1282004zy;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes14.dex */
public final class PasskeyRegistrationGoogleErrorEvent extends AbstractC207072161e {
    public final Map<String, C2805016t> LJII;

    public PasskeyRegistrationGoogleErrorEvent() {
        super("passkey_registration_google_error");
        this.LJII = C2097608Jq.LJIIIIZZ(new Pair("error_code", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), null, false)), new Pair("error_string", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), null, false)), new Pair("error_type", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), null, false)), new Pair("gms_version", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), null, false)));
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
