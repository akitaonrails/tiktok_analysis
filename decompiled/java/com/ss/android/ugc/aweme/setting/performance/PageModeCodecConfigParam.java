package com.ss.android.ugc.aweme.setting.performance;

import X.C09CT;

/* JADX INFO: loaded from: classes35.dex */
public final class PageModeCodecConfigParam {

    @C09CT("higher_fps_threshold")
    public final int highFpsBar;

    @C09CT("higher_fps_min_side_threshold")
    public final int highFpsResolutionVideoMinSide;

    @C09CT("lower_fps_min_side_threshold")
    public final int highResolutionVideoMinSide;

    @C09CT("page_mode")
    public final int pageMode;

    public PageModeCodecConfigParam() {
        this(-1, 0, 0, 0);
    }

    public PageModeCodecConfigParam(int i, int i2, int i3, int i4) {
        this.pageMode = i;
        this.highResolutionVideoMinSide = i2;
        this.highFpsResolutionVideoMinSide = i3;
        this.highFpsBar = i4;
    }
}
