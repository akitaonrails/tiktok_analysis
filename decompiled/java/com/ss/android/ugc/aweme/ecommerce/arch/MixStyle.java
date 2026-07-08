package com.ss.android.ugc.aweme.ecommerce.arch;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class MixStyle {

    @C09CT("background_style")
    public final BackgroundStyle bgStyle;

    @C09CT("column")
    public final int column;

    @C09CT("corner_radius")
    public final float cornerRadius;

    @C09CT("is_dynamic_span_size")
    public final boolean isDynamicSpanSize;

    @C09CT("inset")
    public final Inset marginInfo;

    @C09CT("spacing")
    public final SpaceInfo spaceInfo;

    public MixStyle() {
        this(0.0f, null, null, null, 1, false);
    }

    public MixStyle(float f, Inset inset, BackgroundStyle backgroundStyle, SpaceInfo spaceInfo, int i, boolean z) {
        this.cornerRadius = f;
        this.marginInfo = inset;
        this.bgStyle = backgroundStyle;
        this.spaceInfo = spaceInfo;
        this.column = i;
        this.isDynamicSpanSize = z;
    }
}
