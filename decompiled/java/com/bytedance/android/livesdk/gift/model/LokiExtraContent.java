package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class LokiExtraContent {

    @C09CT("bef_view_fit_mode")
    public int befViewFitMode;

    @C09CT("bef_view_render_fps")
    public int befViewRenderFPS;

    @C09CT("bef_view_render_size")
    public BEFViewRenderSize befViewRenderSize;

    @C09CT("gift_duration")
    public Long giftDuration;

    @C09CT("gift_type")
    public String giftType;

    @C09CT("should_multi_frame")
    public boolean ismultiFrame;

    @C09CT("model_names")
    public String modelNames;

    @C09CT("need_screen_shot")
    public boolean needScreenShot;

    @C09CT("requirements")
    public List<String> requirements;

    @C09CT("view_overlay")
    public String viewOverlay;

    public LokiExtraContent() {
        this(null, null, false, false, null, null, 0, 0, null, null);
    }

    public LokiExtraContent(String str, Long l, boolean z, boolean z2, String str2, BEFViewRenderSize bEFViewRenderSize, int i, int i2, String str3, List<String> list) {
        this.giftType = str;
        this.giftDuration = l;
        this.needScreenShot = z;
        this.ismultiFrame = z2;
        this.viewOverlay = str2;
        this.befViewRenderSize = bEFViewRenderSize;
        this.befViewRenderFPS = i;
        this.befViewFitMode = i2;
        this.modelNames = str3;
        this.requirements = list;
    }
}
