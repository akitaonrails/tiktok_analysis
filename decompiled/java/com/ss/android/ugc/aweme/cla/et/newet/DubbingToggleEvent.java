package com.ss.android.ugc.aweme.cla.et.newet;

import X.AbstractC207072161e;
import X.AnonymousClass0157;
import X.C13LE;
import X.C2097608Jq;
import X.C2805016t;
import X.EnumC2745014l;
import X.EnumC2747014n;
import X.InterfaceC1282004zy;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class DubbingToggleEvent extends AbstractC207072161e {
    public final Map<String, C2805016t> LJII;

    public DubbingToggleEvent() {
        super("dubbing_toggle");
        this.LJII = C2097608Jq.LJIIIIZZ(new Pair("action_type", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(EnumC2745014l.class)), AbstractC207072161e.LJ("{\"allowed\":[\"click\",\"show\"]}", "enum"), false)), new Pair("click_type", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(AnonymousClass0157.class)), AbstractC207072161e.LJ("{\"allowed\":[\"off\",\"on\"]}", "enum"), false)), new Pair("enter_from", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(EnumC2747014n.class)), AbstractC207072161e.LJ("{\"allowed\":[\"homepage_hot\",\"others_homepage\"]}", "enum"), false)), new Pair("group_id", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("target_language", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)));
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
