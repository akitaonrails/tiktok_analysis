package com.ss.android.ugc.aweme.account.eventtracking.bindings;

import X.AbstractC207072161e;
import X.C13LE;
import X.C2097608Jq;
import X.C2805016t;
import X.EnumC1235130iFL;
import X.EnumC1235140iFM;
import X.EnumC1235160iFO;
import X.EnumC1235170iFP;
import X.EnumC1235240iFW;
import X.EnumC1235260iFY;
import X.InterfaceC1282004zy;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes20.dex */
public final class ExitUnlinkPhoneEmailConfirmPageEvent extends AbstractC207072161e {
    public final Map<String, C2805016t> LJII;

    public ExitUnlinkPhoneEmailConfirmPageEvent() {
        super("exit_unlink_phone_email_confirm_page");
        this.LJII = C2097608Jq.LJIIIIZZ(new Pair("action_type", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(EnumC1235130iFL.class)), AbstractC207072161e.LJ("{\"allowed\":[\"change\",\"unlink\"]}", "enum"), false)), new Pair("exit_method", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(EnumC1235240iFW.class)), AbstractC207072161e.LJ("{\"allowed\":[\"click_continue\",\"go_back\"]}", "enum"), false)), new Pair("is_2sv_on", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(EnumC1235160iFO.class)), AbstractC207072161e.LJ("{\"allowed\":[\"0\",\"1\"]}", "enum"), false)), new Pair("is_email_verified", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(EnumC1235260iFY.class)), AbstractC207072161e.LJ("{\"allowed\":[\"0\",\"1\",\"null\"]}", "enum"), false)), new Pair("is_env_safe", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(EnumC1235170iFP.class)), AbstractC207072161e.LJ("{\"allowed\":[\"0\",\"1\"]}", "enum"), false)), new Pair("unlink_type", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(EnumC1235140iFM.class)), AbstractC207072161e.LJ("{\"allowed\":[\"email\",\"phone\"]}", "enum"), false)));
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

    public final void LJIIJ(EnumC1235160iFO enumC1235160iFO) {
        LJI(Integer.valueOf(enumC1235160iFO.getValue()), "is_2sv_on");
    }

    public final void LJIIJJI(EnumC1235170iFP enumC1235170iFP) {
        LJI(Integer.valueOf(enumC1235170iFP.getValue()), "is_env_safe");
    }
}
