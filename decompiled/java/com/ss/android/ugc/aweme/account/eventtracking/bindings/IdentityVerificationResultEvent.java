package com.ss.android.ugc.aweme.account.eventtracking.bindings;

import X.AbstractC207072161e;
import X.C13LE;
import X.C2097608Jq;
import X.C2805016t;
import X.EnumC854390XfR;
import X.EnumC854440XfW;
import X.InterfaceC1282004zy;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes14.dex */
public final class IdentityVerificationResultEvent extends AbstractC207072161e {
    public final Map<String, C2805016t> LJII;

    public IdentityVerificationResultEvent() {
        super("identity_verification_result");
        this.LJII = C2097608Jq.LJIIIIZZ(new Pair("enter_from", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("enter_method", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("error_code", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("is_success", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(EnumC854440XfW.class)), AbstractC207072161e.LJ("{\"allowed\":[\"0\",\"1\"]}", "enum"), false)), new Pair("page", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("verification_method", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(EnumC854390XfR.class)), AbstractC207072161e.LJ("{\"allowed\":[\"email\",\"password\",\"sms\"]}", "enum"), false)));
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
