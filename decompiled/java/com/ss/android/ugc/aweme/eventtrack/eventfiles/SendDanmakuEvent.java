package com.ss.android.ugc.aweme.eventtrack.eventfiles;

import X.AbstractC207072161e;
import X.C13LE;
import X.C2097608Jq;
import X.C2805016t;
import X.EnumC1361130lWZ;
import X.InterfaceC1282004zy;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class SendDanmakuEvent extends AbstractC207072161e {
    public final Map<String, C2805016t> LJII;

    public SendDanmakuEvent() {
        super("send_danmaku");
        Class cls = Integer.TYPE;
        this.LJII = C2097608Jq.LJIIIIZZ(new Pair("is_author", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(cls)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("author_id", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("danmaku_length", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(cls)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("enter_from", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("enter_method", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(EnumC1361130lWZ.class)), AbstractC207072161e.LJ("{\"allowed\":[\"video\"]}", "enum"), false)), new Pair("group_id", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("user_id", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)));
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
