package com.ss.android.ugc.aweme.cla.et.newet;

import X.AbstractC207072161e;
import X.C014B;
import X.C015A;
import X.C015B;
import X.C13LE;
import X.C2097608Jq;
import X.C2805016t;
import X.EnumC1780990wRl;
import X.InterfaceC1282004zy;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class ChangeTranslElementStatusEvent extends AbstractC207072161e {
    public final Map<String, C2805016t> LJII;

    public ChangeTranslElementStatusEvent() {
        super("change_transl_element_status");
        this.LJII = C2097608Jq.LJIIIIZZ(new Pair("element", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(EnumC1780990wRl.class)), AbstractC207072161e.LJ("{\"allowed\":[\"title\",\"sticker\",\"dubbing\"]}", "enum"), false)), new Pair("enter_from", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("enter_method", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(C014B.class)), AbstractC207072161e.LJ("{\"allowed\":[\"click_subtitle\",\"long_press\",\"share_panel\"]}", "enum"), false)), new Pair("group_id", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("is_author", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(Integer.TYPE)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("overall_status", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(C015A.class)), AbstractC207072161e.LJ("{\"allowed\":[\"on\",\"off\"]}", "enum"), false)), new Pair("to_status", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(C015B.class)), AbstractC207072161e.LJ("{\"allowed\":[\"on\",\"off\"]}", "enum"), false)), new Pair("user_id", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)));
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
