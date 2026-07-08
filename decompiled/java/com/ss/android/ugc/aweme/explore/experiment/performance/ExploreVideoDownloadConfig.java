package com.ss.android.ugc.aweme.explore.experiment.performance;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes19.dex */
public final class ExploreVideoDownloadConfig {

    @C09CT("download_video_cnt")
    public final int downloadVideoCnt;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("preload_audio_size")
    public final int preloadPhotoModeAudioSize;

    @C09CT("preload_video_size")
    public final int preloadVideoSize;

    public ExploreVideoDownloadConfig() {
        this(false, 0, 0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExploreVideoDownloadConfig)) {
            return false;
        }
        ExploreVideoDownloadConfig exploreVideoDownloadConfig = (ExploreVideoDownloadConfig) obj;
        return this.enable == exploreVideoDownloadConfig.enable && this.downloadVideoCnt == exploreVideoDownloadConfig.downloadVideoCnt && this.preloadVideoSize == exploreVideoDownloadConfig.preloadVideoSize && this.preloadPhotoModeAudioSize == exploreVideoDownloadConfig.preloadPhotoModeAudioSize;
    }

    public final int hashCode() {
        return (((((C786410Ut5.Z2(this.enable) * 31) + this.downloadVideoCnt) * 31) + this.preloadVideoSize) * 31) + this.preloadPhotoModeAudioSize;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExploreVideoDownloadConfig(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", downloadVideoCnt=");
        sbLIZ.append(this.downloadVideoCnt);
        sbLIZ.append(", preloadVideoSize=");
        sbLIZ.append(this.preloadVideoSize);
        sbLIZ.append(", preloadPhotoModeAudioSize=");
        sbLIZ.append(this.preloadPhotoModeAudioSize);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ExploreVideoDownloadConfig(boolean z, int i, int i2, int i3) {
        this.enable = z;
        this.downloadVideoCnt = i;
        this.preloadVideoSize = i2;
        this.preloadPhotoModeAudioSize = i3;
    }
}
