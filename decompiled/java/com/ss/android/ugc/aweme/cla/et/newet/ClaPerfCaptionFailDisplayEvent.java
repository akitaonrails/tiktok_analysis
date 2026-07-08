package com.ss.android.ugc.aweme.cla.et.newet;

import X.AbstractC207072161e;
import X.C13LE;
import X.C2097608Jq;
import X.C2805016t;
import X.InterfaceC1282004zy;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class ClaPerfCaptionFailDisplayEvent extends AbstractC207072161e {
    public final Map<String, C2805016t> LJII;

    public ClaPerfCaptionFailDisplayEvent() {
        super("cla_perf_caption_fail_display");
        Class cls = Integer.TYPE;
        this.LJII = C2097608Jq.LJIIIIZZ(new Pair("author_id", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), null, false)), new Pair("caption_type", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), null, false)), new Pair("enter_from", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), null, false)), new Pair("group_id", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), null, false)), new Pair("hit_preload", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(cls)), null, false)), new Pair("is_smart_lazy_load", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(cls)), null, false)), new Pair("is_translated_caption", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(cls)), null, false)), new Pair("item_duration", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(cls)), null, false)), new Pair("overdue_duration", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(cls)), null, false)), new Pair("player_session_id", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), null, false)), new Pair("subtitle_id", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), null, false)), new Pair("swipe_pts", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(cls)), null, false)), new Pair("target_language", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), null, false)), new Pair("trigger_method", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), null, false)), new Pair("user_id", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(String.class)), null, false)), new Pair("video_first_caption_pts", new C2805016t(false, AbstractC207072161e.LIZIZ(C13LE.LIZ(cls)), null, false)));
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
