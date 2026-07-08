package com.ss.android.ugc.aweme.cla.et.newet;

import X.AbstractC207072161e;
import X.C13LE;
import X.C2097608Jq;
import X.C2805016t;
import X.InterfaceC1282004zy;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class SeeTranslationButtonShowEvent extends AbstractC207072161e {
    public final Map<String, C2805016t> LJII;

    static {
        new Object() { // from class: X.014c
        };
    }

    public SeeTranslationButtonShowEvent() {
        super("see_translation_button_show");
        Class cls = Integer.TYPE;
        this.LJII = C2097608Jq.LJIIIIZZ(new Pair("auto_trans_status", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), null, false)), new Pair("aweme_type", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(cls)), null, false)), new Pair("enter_from", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), null, false)), new Pair("enter_method", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), null, false)), new Pair("entrance_pos", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(cls)), null, false)), new Pair("group_id", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), null, false)), new Pair("has_dubbing", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(cls)), null, false)), new Pair("is_dubbed", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(cls)), null, false)), new Pair("target_language", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), null, false)));
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
