package com.ss.android.ugc.aweme.cla.et.newet;

import X.AbstractC207072161e;
import X.C13IQ;
import X.C13LE;
import X.C2097608Jq;
import X.C2805016t;
import X.EnumC1782660wUS;
import X.EnumC1782700wUW;
import X.InterfaceC1282004zy;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes32.dex */
public final class ClaCaptionConsistencyCheckEvent extends AbstractC207072161e {
    public final Map<String, C2805016t> LJII;

    public ClaCaptionConsistencyCheckEvent() {
        super("cla_caption_consistency_check");
        C13IQ c13iqLIZIZ = AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class));
        getClass();
        C13IQ c13iqLIZIZ2 = AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class));
        getClass();
        C13IQ c13iqLIZIZ3 = AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class));
        getClass();
        Class cls = Integer.TYPE;
        C13IQ c13iqLIZIZ4 = AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class));
        getClass();
        C13IQ c13iqLIZIZ5 = AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class));
        getClass();
        this.LJII = C2097608Jq.LJIIIIZZ(new Pair("author_id", new C2805016t(true, c13iqLIZIZ, AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("group_id", new C2805016t(true, c13iqLIZIZ2, AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("enter_from", new C2805016t(false, c13iqLIZIZ3, AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("displayed_caption_type", new C2805016t(true, AbstractC207072161e.LIZIZ(C13LE.LIZ(EnumC1782660wUS.class)), AbstractC207072161e.LJ("{\"allowed\":[\"original\",\"translated\"]}", "enum"), false)), new Pair("mismatch_type", new C2805016t(true, AbstractC207072161e.LIZIZ(C13LE.LIZ(EnumC1782700wUW.class)), AbstractC207072161e.LJ("{\"allowed\":[\"caption_shown_when_caption_switch_off\",\"translation_shown_when_translation_switch_off\",\"caption_not_shown_when_caption_switch_on\",\"mixed\"]}", "enum"), false)), new Pair("is_native_lang_video", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(cls)), AbstractC207072161e.LJ("{\"min\":\"0\",\"max\":\"1\"}", "range"), false)), new Pair("caption_lang_code", new C2805016t(false, c13iqLIZIZ4, AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("target_translation_lang", new C2805016t(false, c13iqLIZIZ5, AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("is_caption_on_native", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(cls)), AbstractC207072161e.LJ("{\"min\":\"0\",\"max\":\"1\"}", "range"), false)), new Pair("is_caption_on_foreign", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(cls)), AbstractC207072161e.LJ("{\"min\":\"0\",\"max\":\"1\"}", "range"), false)), new Pair("is_master_translation_on", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(cls)), AbstractC207072161e.LJ("{\"min\":\"0\",\"max\":\"1\"}", "range"), false)), new Pair("is_landscape_screen", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(cls)), AbstractC207072161e.LJ("{\"min\":\"0\",\"max\":\"1\"}", "range"), false)));
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
