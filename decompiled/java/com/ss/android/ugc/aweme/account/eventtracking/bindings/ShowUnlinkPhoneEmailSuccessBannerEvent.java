package com.ss.android.ugc.aweme.account.eventtracking.bindings;

import X.AbstractC207072161e;
import X.C0N68;
import X.C0N6A;
import X.C0TVL;
import X.C13LE;
import X.C2097608Jq;
import X.C2805016t;
import X.InterfaceC1282004zy;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes14.dex */
public final class ShowUnlinkPhoneEmailSuccessBannerEvent extends AbstractC207072161e {
    public final Map<String, C2805016t> LJII;

    public ShowUnlinkPhoneEmailSuccessBannerEvent() {
        super("show_unlink_phone_email_success_banner");
        this.LJII = C2097608Jq.LJIIIIZZ(new Pair("enter_from", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(C0N68.class)), AbstractC207072161e.LJ("{\"allowed\":[\"manage_my_account\"]}", "enum"), false)), new Pair("is_env_safe", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(C0N6A.class)), AbstractC207072161e.LJ("{\"allowed\":[\"0\",\"1\"]}", "enum"), false)), new Pair("unlink_type", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(C0TVL.class)), AbstractC207072161e.LJ("{\"allowed\":[\"email\",\"phone\"]}", "enum"), false)));
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
