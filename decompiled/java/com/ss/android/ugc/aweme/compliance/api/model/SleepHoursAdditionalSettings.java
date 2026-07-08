package com.ss.android.ugc.aweme.compliance.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes19.dex */
public final class SleepHoursAdditionalSettings {

    @C09CT("ab_group")
    public final Integer abGroup;

    @C09CT("cumulative_use_limit")
    public final Integer cumulativeUseLimit;

    @C09CT("meditation_video_urls")
    public final String meditationVideo;

    @C09CT("sleep_hours_end_timestamp")
    public final Long sleepHoursEndTimestamp;

    @C09CT("sleep_hours_start_timestamp")
    public final Long sleepHoursStartTimestamp;

    public SleepHoursAdditionalSettings() {
        this(0L, 0L, 0, 0, "");
    }

    public SleepHoursAdditionalSettings(Long l, Long l2, Integer num, Integer num2, String str) {
        this.sleepHoursStartTimestamp = l;
        this.sleepHoursEndTimestamp = l2;
        this.abGroup = num;
        this.cumulativeUseLimit = num2;
        this.meditationVideo = str;
    }
}
