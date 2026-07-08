package com.ss.android.ugc.aweme.cla.et.newet;

import X.AbstractC207072161e;
import X.AnonymousClass1629;
import X.C016E;
import X.C016F;
import X.C016G;
import X.C13LE;
import X.C2097608Jq;
import X.C2805016t;
import X.EnumC20038913at;
import X.InterfaceC1282004zy;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class ClaPerfCaptionLoadStartEvent extends AbstractC207072161e {
    public final Map<String, C2805016t> LJII;

    public ClaPerfCaptionLoadStartEvent() {
        super("cla_perf_caption_load_start");
        Class cls = Integer.TYPE;
        this.LJII = C2097608Jq.LJIIIIZZ(new Pair("author_id", new C2805016t(true, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("caption_original_language", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("caption_type", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(EnumC20038913at.class)), AbstractC207072161e.LJ("{\"allowed\":[\"offline\",\"realtime\"]}", "enum"), false)), new Pair("cla_subtitle_id", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("enter_from", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("group_id", new C2805016t(true, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("ignore_in_funnel", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(cls)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("is_fullscreen", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(C016E.class)), AbstractC207072161e.LJ("{\"allowed\":[0,1]}", "enum"), false)), new Pair("is_lazy_load", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(C016F.class)), AbstractC207072161e.LJ("{\"allowed\":[1,0]}", "enum"), false)), new Pair("is_smart_lazy_load", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(C016G.class)), AbstractC207072161e.LJ("{\"allowed\":[1,0]}", "enum"), false)), new Pair("is_translated_caption", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(cls)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("item_duration", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(cls)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("original_source_tag", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("player_session_id", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("source_tag", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("subtitle_id", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("target_language", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("trigger_method", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(AnonymousClass1629.class)), AbstractC207072161e.LJ("{\"allowed\":[\"land_on_item\",\"click_expand\",\"toggle_enable\",\"switch_language\",\"smart_lazy_load\"]}", "enum"), false)), new Pair("user_id", new C2805016t(true, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), AbstractC207072161e.LJ("{}", "ordinary"), false)), new Pair("video_first_caption_pts", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(cls)), AbstractC207072161e.LJ("{}", "ordinary"), false)));
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
