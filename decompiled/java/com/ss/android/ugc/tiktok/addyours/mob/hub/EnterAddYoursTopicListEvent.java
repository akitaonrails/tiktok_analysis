package com.ss.android.ugc.tiktok.addyours.mob.hub;

import X.AbstractC207072161e;
import X.C13LE;
import X.C2097608Jq;
import X.C2805016t;
import X.InterfaceC1282004zy;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class EnterAddYoursTopicListEvent extends AbstractC207072161e {
    public final Map<String, C2805016t> LJII;

    public EnterAddYoursTopicListEvent() {
        super("enter_add_yours_topic_list");
        Class cls = Integer.TYPE;
        this.LJII = C2097608Jq.LJIIIIZZ(new Pair("added_topic_cnt", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(cls)), null, false)), new Pair("category_name", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), null, false)), new Pair("enter_from", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), null, false)), new Pair("enter_method", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), null, false)), new Pair("to_add_topic_cnt", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(cls)), null, false)));
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
