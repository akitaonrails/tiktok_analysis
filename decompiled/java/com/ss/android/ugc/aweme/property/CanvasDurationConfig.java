package com.ss.android.ugc.aweme.property;

import X.C09CT;

/* JADX INFO: loaded from: classes9.dex */
public final class CanvasDurationConfig {

    @C09CT("canvas_default_duration_without_music")
    public final int defaultDuration;

    @C09CT("canvas_max_duration_with_music")
    public final int maxDuration;

    @C09CT("canvas_min_duration_with_music")
    public final int minDuration;

    public CanvasDurationConfig(int i, int i2, int i3) {
        this.defaultDuration = i;
        this.minDuration = i2;
        this.maxDuration = i3;
    }
}
