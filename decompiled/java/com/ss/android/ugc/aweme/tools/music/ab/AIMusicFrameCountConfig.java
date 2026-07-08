package com.ss.android.ugc.aweme.tools.music.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes4.dex */
public final class AIMusicFrameCountConfig {

    @C09CT("enable_change_extract_num")
    public final boolean enable;

    @C09CT("image_extract_num")
    public final int imageExtractCount;

    @C09CT("video_extract_num")
    public final int videoExtractCount;

    public AIMusicFrameCountConfig() {
        this(false, 5, 5);
    }

    public AIMusicFrameCountConfig(boolean z, int i, int i2) {
        this.enable = z;
        this.videoExtractCount = i;
        this.imageExtractCount = i2;
    }
}
