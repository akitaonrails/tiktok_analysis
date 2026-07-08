package com.ss.android.ugc.tiktok.addyours.mob.invite;

import X.AbstractC207072161e;
import X.C13LE;
import X.C2097608Jq;
import X.C2805016t;
import X.InterfaceC1282004zy;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class SelectAddYoursInviteeEvent extends AbstractC207072161e {
    public final Map<String, C2805016t> LJII;

    public SelectAddYoursInviteeEvent() {
        super("select_add_yours_invitee");
        Class cls = Integer.TYPE;
        this.LJII = C2097608Jq.LJIIIIZZ(new Pair("action_type", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), null, false)), new Pair("enter_from", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), null, false)), new Pair("follow_status", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(cls)), null, false)), new Pair("from_user_id", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), null, false)), new Pair("has_invited", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(cls)), null, false)), new Pair("is_search_result", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), null, false)), new Pair("to_user_id", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), null, false)));
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
