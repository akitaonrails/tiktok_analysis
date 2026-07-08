package com.ss.android.ugc.aweme.account.eventtracking.bindings;

import X.AbstractC207072161e;
import X.C0N6C;
import X.C13LE;
import X.C2097608Jq;
import X.C2805016t;
import X.EnumC1235120iFK;
import X.EnumC854510Xfd;
import X.InterfaceC1282004zy;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes20.dex */
public final class ShowUnlinkPhoneEmailPopupEvent extends AbstractC207072161e {
    public final Map<String, C2805016t> LJII;

    public ShowUnlinkPhoneEmailPopupEvent() {
        super("show_unlink_phone_email_popup");
        this.LJII = C2097608Jq.LJIIIIZZ(new Pair("enter_from", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(C0N6C.class)), AbstractC207072161e.LJ("{\"allowed\":[\"manage_my_account\"]}", "enum"), false)), new Pair("is_email_verified", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(EnumC1235120iFK.class)), AbstractC207072161e.LJ("{\"allowed\":[\"0\",\"1\",\"null\"]}", "enum"), false)), new Pair("unlink_type", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(EnumC854510Xfd.class)), AbstractC207072161e.LJ("{\"allowed\":[\"email\",\"phone\"]}", "enum"), false)));
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
