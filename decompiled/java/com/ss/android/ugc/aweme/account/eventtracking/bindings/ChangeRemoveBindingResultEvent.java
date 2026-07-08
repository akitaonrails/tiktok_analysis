package com.ss.android.ugc.aweme.account.eventtracking.bindings;

import X.AbstractC207072161e;
import X.C13LE;
import X.C2097608Jq;
import X.C2805016t;
import X.EnumC854490Xfb;
import X.EnumC854520Xfe;
import X.EnumC854530Xff;
import X.InterfaceC1282004zy;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes14.dex */
public final class ChangeRemoveBindingResultEvent extends AbstractC207072161e {
    public final Map<String, C2805016t> LJII;

    public ChangeRemoveBindingResultEvent() {
        super("change_remove_binding_result");
        this.LJII = C2097608Jq.LJIIIIZZ(new Pair("action_type", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(EnumC854530Xff.class)), AbstractC207072161e.LJ("{\"allowed\":[\"change\",\"unlink\"]}", "enum"), false)), new Pair("enter_from", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("enter_method", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("error_code", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("is_safe_env", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(EnumC854520Xfe.class)), AbstractC207072161e.LJ("{\"allowed\":[\"0\",\"1\"]}", "enum"), false)), new Pair("is_success", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("unlink_type", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("is_email_verified", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(EnumC854490Xfb.class)), AbstractC207072161e.LJ("{\"allowed\":[\"0\",\"1\",\"null\"]}", "enum"), false)));
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
