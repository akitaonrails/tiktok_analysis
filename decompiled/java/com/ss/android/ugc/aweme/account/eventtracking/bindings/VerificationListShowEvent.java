package com.ss.android.ugc.aweme.account.eventtracking.bindings;

import X.AbstractC207072161e;
import X.C13LE;
import X.C2097608Jq;
import X.C2805016t;
import X.EnumC20520082c;
import X.EnumC20521082d;
import X.EnumC20522082e;
import X.EnumC854480Xfa;
import X.InterfaceC1282004zy;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes14.dex */
public final class VerificationListShowEvent extends AbstractC207072161e {
    public final Map<String, C2805016t> LJII;

    public VerificationListShowEvent() {
        super("verification_list_show");
        this.LJII = C2097608Jq.LJIIIIZZ(new Pair("enter_from", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("enter_method", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("is_email_show", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(EnumC20520082c.class)), AbstractC207072161e.LJ("{\"allowed\":[\"false\",\"true\"]}", "enum"), false)), new Pair("is_pw_show", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(EnumC20521082d.class)), AbstractC207072161e.LJ("{\"allowed\":[\"false\",\"true\"]}", "enum"), false)), new Pair("is_sms_show", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(EnumC20522082e.class)), AbstractC207072161e.LJ("{\"allowed\":[\"false\",\"true\"]}", "enum"), false)), new Pair("page", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("verification_method", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(EnumC854480Xfa.class)), AbstractC207072161e.LJ("{\"allowed\":[\"email\",\"password\",\"sms\"]}", "enum"), false)));
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
