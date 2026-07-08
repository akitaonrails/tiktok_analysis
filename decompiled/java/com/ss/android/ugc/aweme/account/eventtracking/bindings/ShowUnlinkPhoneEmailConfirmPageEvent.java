package com.ss.android.ugc.aweme.account.eventtracking.bindings;

import X.AbstractC207072161e;
import X.C13LE;
import X.C2097608Jq;
import X.C2805016t;
import X.EnumC1235190iFR;
import X.EnumC1235200iFS;
import X.EnumC1235210iFT;
import X.EnumC1235220iFU;
import X.EnumC1235270iFZ;
import X.InterfaceC1282004zy;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes20.dex */
public final class ShowUnlinkPhoneEmailConfirmPageEvent extends AbstractC207072161e {
    public final Map<String, C2805016t> LJII;

    public ShowUnlinkPhoneEmailConfirmPageEvent() {
        super("show_unlink_phone_email_confirm_page");
        this.LJII = C2097608Jq.LJIIIIZZ(new Pair("action_type", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(EnumC1235200iFS.class)), AbstractC207072161e.LJ("{\"allowed\":[\"change\",\"unlink\"]}", "enum"), false)), new Pair("is_2sv_on", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(EnumC1235220iFU.class)), AbstractC207072161e.LJ("{\"allowed\":[\"0\",\"1\"]}", "enum"), false)), new Pair("is_email_verified", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(EnumC1235270iFZ.class)), AbstractC207072161e.LJ("{\"allowed\":[\"0\",\"1\",\"null\"]}", "enum"), false)), new Pair("is_env_safe", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(EnumC1235210iFT.class)), AbstractC207072161e.LJ("{\"allowed\":[\"0\",\"1\"]}", "enum"), false)), new Pair("unlink_type", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(EnumC1235190iFR.class)), AbstractC207072161e.LJ("{\"allowed\":[\"email\",\"phone\"]}", "enum"), false)));
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
