package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes12.dex */
public final class ImagePreloadConfig {

    @C09CT("default_horizontal_count")
    public final int defaultHorizontalCount;

    @C09CT("detail_vertical_count")
    public final int detailVerticalCount;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("fyp_vertical_count")
    public final int fypVerticalCount;

    public ImagePreloadConfig() {
        this(false, 0, 0, 0);
    }

    public ImagePreloadConfig(boolean z, int i, int i2, int i3) {
        this.enable = z;
        this.fypVerticalCount = i;
        this.detailVerticalCount = i2;
        this.defaultHorizontalCount = i3;
    }
}
