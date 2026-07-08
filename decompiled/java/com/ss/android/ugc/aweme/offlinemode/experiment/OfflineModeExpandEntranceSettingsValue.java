package com.ss.android.ugc.aweme.offlinemode.experiment;

import X.C09CT;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: loaded from: classes10.dex */
public final class OfflineModeExpandEntranceSettingsValue {

    @C09CT("block_count_down_duration_milli")
    public final long block_count_down_duration_milli;

    @C09CT("empty_status_view_interval_hours")
    public final int empty_status_view_interval_hours;

    @C09CT("loadmore_count_down_duration_milli")
    public final long loadmore_count_down_duration_milli;

    @C09CT("push_interval_hours")
    public final int push_interval_hours;

    @C09CT("single_user_max_empty_view_count")
    public final int single_user_max_empty_view_count;

    @C09CT("single_user_max_push_cnt")
    public final int single_user_max_push_cnt;

    public OfflineModeExpandEntranceSettingsValue() {
        this(3, 72, Mp4ScreenVideoLoadTimeout.CONTROL, 6000L, 3, 72);
    }

    public OfflineModeExpandEntranceSettingsValue(int i, int i2, long j, long j2, int i3, int i4) {
        this.single_user_max_empty_view_count = i;
        this.empty_status_view_interval_hours = i2;
        this.loadmore_count_down_duration_milli = j;
        this.block_count_down_duration_milli = j2;
        this.single_user_max_push_cnt = i3;
        this.push_interval_hours = i4;
    }
}
