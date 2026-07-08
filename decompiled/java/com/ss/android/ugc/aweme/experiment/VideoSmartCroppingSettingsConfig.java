package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes32.dex */
public final class VideoSmartCroppingSettingsConfig {

    @C09CT("adapt_inline_caption")
    public final boolean adapt_inline_caption;

    @C09CT("area_adjust")
    public final boolean area_adjust;

    @C09CT("show_area")
    public final boolean show_area;

    @C09CT("sticker_percentage")
    public final float sticker_percentage;

    public VideoSmartCroppingSettingsConfig() {
        this(false, 0.3f, true, false);
    }

    public VideoSmartCroppingSettingsConfig(boolean z, float f, boolean z2, boolean z3) {
        this.show_area = z;
        this.sticker_percentage = f;
        this.adapt_inline_caption = z2;
        this.area_adjust = z3;
    }
}
