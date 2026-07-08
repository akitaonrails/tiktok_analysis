package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class CommentTopBarComponentDisplayStrategy implements Serializable {

    @C09CT("end_time")
    public Long endTime;

    @C09CT("exposures")
    public Long exposures;

    @C09CT("max_continuous_display")
    public Long maxContinuousDisplay;

    @C09CT("max_exposure_daily")
    public Long maxExposureDaily;

    @C09CT("start_time")
    public Long startTime;

    public CommentTopBarComponentDisplayStrategy() {
        this(null, null, null, null, null);
    }

    public final void setEndTime(Long l) {
        this.endTime = l;
    }

    public final void setExposures(Long l) {
        this.exposures = l;
    }

    public final void setMaxContinuousDisplay(Long l) {
        this.maxContinuousDisplay = l;
    }

    public final void setMaxExposureDaily(Long l) {
        this.maxExposureDaily = l;
    }

    public final void setStartTime(Long l) {
        this.startTime = l;
    }

    public CommentTopBarComponentDisplayStrategy(Long l, Long l2, Long l3, Long l4, Long l5) {
        this.startTime = l;
        this.endTime = l2;
        this.exposures = l3;
        this.maxExposureDaily = l4;
        this.maxContinuousDisplay = l5;
    }
}
