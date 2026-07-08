package com.ss.android.ugc.aweme.feed.experiment;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes29.dex */
public final class SeekBarThumbnailExperimentV2Data {

    @C09CT("avoid_multi_times_download")
    public final boolean avoidMultiTimeDownload;

    @C09CT("portrait_cover_scenes")
    public final List<String> scenes;

    @C09CT("portrait_cover_duration_threshold")
    public final long threshHold;

    public SeekBarThumbnailExperimentV2Data() {
        this(0L, false, null, 7, null);
    }

    public SeekBarThumbnailExperimentV2Data(long j, boolean z, List<String> list) {
        this.threshHold = j;
        this.avoidMultiTimeDownload = z;
        this.scenes = list;
    }

    public SeekBarThumbnailExperimentV2Data(long j, boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? -1L : j, (i & 2) != 0 ? false : z, (i & 4) != 0 ? C13BV.INSTANCE : list);
    }
}
