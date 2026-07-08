package com.ss.android.ugc.aweme.eventtrack.eventfiles;

import X.AbstractC207072161e;
import X.C13LE;
import X.C2097608Jq;
import X.C2805016t;
import X.EnumC174000le;
import X.InterfaceC1282004zy;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class ExpandDanmakuEvent extends AbstractC207072161e {
    public final Map<String, C2805016t> LJII;

    public ExpandDanmakuEvent() {
        super("expand_danmaku");
        this.LJII = C2097608Jq.LJIIIIZZ(new Pair("is_author", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(Integer.TYPE)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("author_id", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("enter_from", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("group_id", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("enter_method", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(EnumC174000le.class)), AbstractC207072161e.LJ("{\"allowed\":[\"long_press\",\"video\"]}", "enum"), false)), new Pair("user_id", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)));
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
