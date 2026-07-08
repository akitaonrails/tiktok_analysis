package com.ss.android.ugc.aweme.video.experiment.mediabox.cover;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class MediaBoxBlurCoverConfig {

    @C09CT("blur_place_holder_hide_duration")
    public final int blurPlaceHolderHideDuration;

    @C09CT("enable_blur_place_holder")
    public final boolean enableBlurPlaceHolder;

    public MediaBoxBlurCoverConfig() {
        this(false, 200);
    }

    public MediaBoxBlurCoverConfig(boolean z, int i) {
        this.enableBlurPlaceHolder = z;
        this.blurPlaceHolderHideDuration = i;
    }
}
