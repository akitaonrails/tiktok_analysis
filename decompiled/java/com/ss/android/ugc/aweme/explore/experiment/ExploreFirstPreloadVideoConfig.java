package com.ss.android.ugc.aweme.explore.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes29.dex */
public final class ExploreFirstPreloadVideoConfig {

    @C09CT("is_load_data_enable")
    public final boolean isLoadDataEnable;

    @C09CT("is_prefetch_data_enable")
    public final boolean isPrefetchDataEnable;

    @C09CT("preload_audio_size_kbs")
    public final int preloadAudioSizeKBs;

    @C09CT("preload_video_count")
    public final int preloadVideoCount;

    public ExploreFirstPreloadVideoConfig() {
        this(false, false, 5, 100);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExploreFirstPreloadVideoConfig)) {
            return false;
        }
        ExploreFirstPreloadVideoConfig exploreFirstPreloadVideoConfig = (ExploreFirstPreloadVideoConfig) obj;
        return this.isPrefetchDataEnable == exploreFirstPreloadVideoConfig.isPrefetchDataEnable && this.isLoadDataEnable == exploreFirstPreloadVideoConfig.isLoadDataEnable && this.preloadVideoCount == exploreFirstPreloadVideoConfig.preloadVideoCount && this.preloadAudioSizeKBs == exploreFirstPreloadVideoConfig.preloadAudioSizeKBs;
    }

    public int hashCode() {
        return (((((C786410Ut5.Z2(this.isPrefetchDataEnable) * 31) + C786410Ut5.Z2(this.isLoadDataEnable)) * 31) + this.preloadVideoCount) * 31) + this.preloadAudioSizeKBs;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExploreFirstPreloadVideoConfig(isPrefetchDataEnable=");
        sbLIZ.append(this.isPrefetchDataEnable);
        sbLIZ.append(", isLoadDataEnable=");
        sbLIZ.append(this.isLoadDataEnable);
        sbLIZ.append(", preloadVideoCount=");
        sbLIZ.append(this.preloadVideoCount);
        sbLIZ.append(", preloadAudioSizeKBs=");
        sbLIZ.append(this.preloadAudioSizeKBs);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isLoadDataEnable() {
        return this.isLoadDataEnable;
    }

    public final boolean isPrefetchDataEnable() {
        return this.isPrefetchDataEnable;
    }

    public ExploreFirstPreloadVideoConfig(boolean z, boolean z2, int i, int i2) {
        this.isPrefetchDataEnable = z;
        this.isLoadDataEnable = z2;
        this.preloadVideoCount = i;
        this.preloadAudioSizeKBs = i2;
    }
}
