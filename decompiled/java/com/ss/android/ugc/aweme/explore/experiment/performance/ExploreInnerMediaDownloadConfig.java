package com.ss.android.ugc.aweme.explore.experiment.performance;

import X.C09CT;

/* JADX INFO: loaded from: classes32.dex */
public final class ExploreInnerMediaDownloadConfig {

    @C09CT("download_image_cnt")
    public final int downloadImageCnt;

    @C09CT("download_video_cnt")
    public final int downloadVideoCnt;

    @C09CT("download_video_size")
    public final int downloadVideoSize;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("enable_download_image")
    public final boolean enableDownloadImage;

    @C09CT("enable_download_video")
    public final boolean enableDownloadVideo;

    public ExploreInnerMediaDownloadConfig() {
        this(false, false, 0, false, 0, 0);
    }

    public ExploreInnerMediaDownloadConfig(boolean z, boolean z2, int i, boolean z3, int i2, int i3) {
        this.enable = z;
        this.enableDownloadImage = z2;
        this.downloadImageCnt = i;
        this.enableDownloadVideo = z3;
        this.downloadVideoCnt = i2;
        this.downloadVideoSize = i3;
    }
}
