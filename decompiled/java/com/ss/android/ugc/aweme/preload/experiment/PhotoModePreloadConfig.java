package com.ss.android.ugc.aweme.preload.experiment;

import X.C09CT;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: loaded from: classes35.dex */
public final class PhotoModePreloadConfig {

    @C09CT("create_photo_client_delay")
    public final long createPhotoClientDelay;

    @C09CT("preload_delay_time_mills")
    public final long delayTimeMills;

    @C09CT("detail_group_range_size")
    public final int detailGroupRangeSize;

    @C09CT("detail_horizontal_load_count")
    public final int detailHorizontalLoadCount;

    @C09CT("detail_vertical_load_horizontal_count")
    public final int detailVerticalLoadHorizontalCount;

    @C09CT("detail_vertical_trigger_delta")
    public final int detailVerticalTriggerDelta;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("horizontal_load_count")
    public final int horizontalLoadCount;

    @C09CT("preload_pool_size")
    public final int preloadPoolSize;

    @C09CT("preload_to_bitmap")
    public final boolean preloadToBitmap;

    @C09CT("preload_task_trigger_type")
    public final int taskTriggerType;

    @C09CT("use_split_load")
    public final boolean useSplitLoad;

    @C09CT("vertical_load_horizontal_count")
    public final int verticalLoadHorizontalCount;

    @C09CT("vertical_trigger_delta")
    public final int verticalTriggerDelta;

    public PhotoModePreloadConfig() {
        this(false, 0, 0, 0, 0, 8, 0, 0, 0L, 3, Mp4ScreenVideoLoadTimeout.CONTROL, false, 0, false);
    }

    public PhotoModePreloadConfig(boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, long j2, boolean z2, int i9, boolean z3) {
        this.enable = z;
        this.verticalTriggerDelta = i;
        this.verticalLoadHorizontalCount = i2;
        this.horizontalLoadCount = i3;
        this.detailVerticalTriggerDelta = i4;
        this.detailGroupRangeSize = i5;
        this.detailVerticalLoadHorizontalCount = i6;
        this.detailHorizontalLoadCount = i7;
        this.delayTimeMills = j;
        this.preloadPoolSize = i8;
        this.createPhotoClientDelay = j2;
        this.useSplitLoad = z2;
        this.taskTriggerType = i9;
        this.preloadToBitmap = z3;
    }
}
