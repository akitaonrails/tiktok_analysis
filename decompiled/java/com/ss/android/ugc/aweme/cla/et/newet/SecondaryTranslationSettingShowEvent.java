package com.ss.android.ugc.aweme.cla.et.newet;

import X.AbstractC207072161e;
import X.AnonymousClass0158;
import X.AnonymousClass0159;
import X.C13LE;
import X.C2097608Jq;
import X.C2805016t;
import X.InterfaceC1282004zy;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class SecondaryTranslationSettingShowEvent extends AbstractC207072161e {
    public final Map<String, C2805016t> LJII;

    public SecondaryTranslationSettingShowEvent() {
        super("secondary_translation_setting_show");
        Class cls = Integer.TYPE;
        this.LJII = C2097608Jq.LJIIIIZZ(new Pair("enter_from", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("enter_method", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("group_id", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("is_author", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(cls)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("item_duration", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(cls)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("more_translation_options", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(cls)), AbstractC207072161e.LJ("{\"min\":\"0\",\"max\":\"1\"}", "range"), false)), new Pair("not_translate_langs", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("target_lang", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("translate_sticker_status", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(AnonymousClass0158.class)), AbstractC207072161e.LJ("{\"allowed\":[\"on\",\"off\"]}", "enum"), false)), new Pair("translate_title_status", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(AnonymousClass0159.class)), AbstractC207072161e.LJ("{\"allowed\":[\"on\",\"off\"]}", "enum"), false)), new Pair("user_id", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)));
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
