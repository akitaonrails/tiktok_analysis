package com.ss.android.tracker.event.bus;

import X.AbstractC207072161e;
import X.AnonymousClass0143;
import X.C13LE;
import X.C2097608Jq;
import X.C2805016t;
import X.InterfaceC1282004zy;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class ProfileTabClientShowEvent extends AbstractC207072161e {
    public final Map<String, C2805016t> LJII;

    public ProfileTabClientShowEvent() {
        super("profile_tab_client_show");
        this.LJII = C2097608Jq.LJIIIIZZ(new Pair("author_id", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ(null, "ordinary"), false)), new Pair("enter_from", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ(null, "ordinary"), false)), new Pair("group_id", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ(null, "ordinary"), false)), new Pair("music_id", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ(null, "ordinary"), false)), new Pair("request_id", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ(null, "ordinary"), false)), new Pair("screen_form", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(AnonymousClass0143.class)), AbstractC207072161e.LJ(null, "ordinary"), false)), new Pair("tab_name", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ(null, "ordinary"), false)), new Pair("tag_id", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ(null, "ordinary"), false)), new Pair("to_user_id", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ(null, "ordinary"), false)));
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
