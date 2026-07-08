package com.ss.android.ugc.aweme.cla.et.newet;

import X.AbstractC207072161e;
import X.C016J;
import X.C016U;
import X.C016Y;
import X.C13LE;
import X.C164L;
import X.C2097608Jq;
import X.C2805016t;
import X.EnumC20703715zv;
import X.InterfaceC1282004zy;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class HideSubtitleEvent extends AbstractC207072161e {
    public final Map<String, C2805016t> LJII;

    public HideSubtitleEvent() {
        super("hide_subtitle");
        Class cls = Integer.TYPE;
        this.LJII = C2097608Jq.LJIIIIZZ(new Pair("author_id", new C2805016t(true, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("captions_show_type", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(C016U.class)), AbstractC207072161e.LJ("{\"allowed\":[\"hidden\",\"captions\",\"icon\"]}", "enum"), false)), new Pair("captions_unavailable_reason", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(EnumC20703715zv.class)), AbstractC207072161e.LJ("{\"allowed\":[\"no_authorization\",\"speech_not_recognized\",\"language_not_supported\",\"others\"]}", "enum"), false)), new Pair("enter_from", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("enter_method", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(C016Y.class)), AbstractC207072161e.LJ("{\"allowed\":[\"long_press\",\"click_subtitle\",\"share_panel\",\"click_icon\",\"caption_setting\",\"feed_lower_button\"]}", "enum"), false)), new Pair("group_id", new C2805016t(true, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("has_subtitle", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(cls)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("have_transl", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("is_landscape_screen", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(cls)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("item_duration", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(cls)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("search_id", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("search_keyword", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("search_type", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("subtitle_index", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(cls)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("subtitle_lang", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("subtitle_position", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(Double.TYPE)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("subtitle_source_lang", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("subtitle_type", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(C164L.class)), AbstractC207072161e.LJ("{\"allowed\":[\"asr\",\"closed_creator\",\"sticker_creator\",\"cec\",\"capcut_creator\",\"tp_creator\"]}", "enum"), false)), new Pair("use_transl", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(C016J.class)), AbstractC207072161e.LJ("{\"allowed\":[\"1\",\"-1\",\"0\"]}", "enum"), false)), new Pair("user_id", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)));
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
