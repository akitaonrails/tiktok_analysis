package com.ss.android.ugc.aweme.property.bytebench;

import X.C09CT;

/* JADX INFO: loaded from: classes9.dex */
public final class CameraLayoutHwDecodeConfig {
    public static final int $stable = 0;

    @C09CT("higher_fps_min_side_threshold")
    public final int higherFpsMinSideThreshold;

    @C09CT("higher_fps_threshold")
    public final int higherFpsThreshold;

    @C09CT("lower_fps_min_side_threshold")
    public final int lowerFpsMinSideThreshold;

    @C09CT("page_mode")
    public final int pageMode;

    public CameraLayoutHwDecodeConfig() {
        this(105, 40, 9999, 9999);
    }

    public CameraLayoutHwDecodeConfig(int i, int i2, int i3, int i4) {
        this.pageMode = i;
        this.higherFpsThreshold = i2;
        this.lowerFpsMinSideThreshold = i3;
        this.higherFpsMinSideThreshold = i4;
    }
}
