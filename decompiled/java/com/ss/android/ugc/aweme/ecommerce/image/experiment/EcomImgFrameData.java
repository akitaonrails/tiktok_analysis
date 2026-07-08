package com.ss.android.ugc.aweme.ecommerce.image.experiment;

import X.C09CT;
import X.C13BV;
import X.C1697810uHb;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes21.dex */
public final class EcomImgFrameData {

    @C09CT("debug")
    public final int debug;

    @C09CT("enable")
    public final int enable;

    @C09CT("inline_flush_points")
    public final List<String> inlineFlushPoints;

    @C09CT("inline_scene_allowlist")
    public final List<String> inlineSceneAllowlist;

    @C09CT("inline_scene_mode")
    public final int inlineSceneMode;

    @C09CT("max_frame_ms_budget")
    public final long maxFrameMsBudget;

    @C09CT("max_task_per_frame")
    public final int maxTaskPerFrame;

    @C09CT("mode")
    public final int mode;

    @C09CT("render_with_ui")
    public final int renderWithUI;

    @C09CT("repost_on_submit")
    public final int repostOnSubmit;

    public EcomImgFrameData() {
        this(0, 0, 0, 0L, 0, 0, null, 0, null, 0, 1023, null);
    }

    public EcomImgFrameData(int i, int i2, int i3, long j, int i4, int i5, List<String> list, int i6, List<String> list2, int i7) {
        this.enable = i;
        this.mode = i2;
        this.maxTaskPerFrame = i3;
        this.maxFrameMsBudget = j;
        this.renderWithUI = i4;
        this.repostOnSubmit = i5;
        this.inlineFlushPoints = list;
        this.inlineSceneMode = i6;
        this.inlineSceneAllowlist = list2;
        this.debug = i7;
    }

    public EcomImgFrameData(int i, int i2, int i3, long j, int i4, int i5, List list, int i6, List list2, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? 0 : i, (i8 & 2) != 0 ? 1 : i2, (i8 & 4) != 0 ? 15 : i3, (i8 & 8) != 0 ? 32L : j, (i8 & 16) != 0 ? 0 : i4, (i8 & 32) != 0 ? 0 : i5, (i8 & 64) != 0 ? C1697810uHb.LJIIJJI("props_updated", "bind", "layout_children") : list, (i8 & 128) != 0 ? 0 : i6, (i8 & 256) != 0 ? C13BV.INSTANCE : list2, (i8 & 512) == 0 ? i7 : 0);
    }
}
