package com.ss.android.ugc.aweme.commercialize.anchor.settings;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public final class CardFrequency implements Serializable {

    @C09CT("display_times_per_day")
    public Integer displayTimesPerDay;

    @C09CT("display_interval_hours_percard")
    public Integer intervalHours;

    @C09CT("show_seconds")
    public Integer showSeconds;

    public CardFrequency() {
        this(0, 0, 0);
    }

    public final Integer getDisplayTimesPerDay() {
        return this.displayTimesPerDay;
    }

    public final Integer getIntervalHours() {
        return this.intervalHours;
    }

    public final Integer getShowSeconds() {
        return this.showSeconds;
    }

    public final void setDisplayTimesPerDay(Integer num) {
        this.displayTimesPerDay = num;
    }

    public final void setIntervalHours(Integer num) {
        this.intervalHours = num;
    }

    public final void setShowSeconds(Integer num) {
        this.showSeconds = num;
    }

    public CardFrequency(Integer num, Integer num2, Integer num3) {
        this.intervalHours = num;
        this.displayTimesPerDay = num2;
        this.showSeconds = num3;
    }
}
