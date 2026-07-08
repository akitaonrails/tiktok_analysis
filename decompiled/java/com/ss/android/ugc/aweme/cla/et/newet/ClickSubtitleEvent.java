package com.ss.android.ugc.aweme.cla.et.newet;

import X.AbstractC207072161e;
import X.C016H;
import X.C13LE;
import X.C164M;
import X.C2097608Jq;
import X.C2805016t;
import X.InterfaceC1282004zy;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class ClickSubtitleEvent extends AbstractC207072161e {
    public final Map<String, C2805016t> LJII;

    public ClickSubtitleEvent() {
        super("click_subtitle");
        this.LJII = C2097608Jq.LJIIIIZZ(new Pair("author_id", new C2805016t(true, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("enter_from", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("group_id", new C2805016t(true, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("have_transl", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("item_duration", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(Integer.TYPE)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("search_id", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("search_keyword", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("search_type", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("subtitle_lang", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("subtitle_source_lang", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("subtitle_type", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(C164M.class)), AbstractC207072161e.LJ("{\"allowed\":[\"closed_creator\",\"sticker_creator\",\"asr\",\"cec\",\"capcut_creator\",\"tp_creator\"]}", "enum"), false)), new Pair("use_transl", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(C016H.class)), AbstractC207072161e.LJ("{\"allowed\":[\"1\",\"-1\",\"0\"]}", "enum"), false)));
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
