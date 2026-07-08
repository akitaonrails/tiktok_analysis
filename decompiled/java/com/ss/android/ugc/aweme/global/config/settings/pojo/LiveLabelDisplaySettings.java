package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import X.C316660CbA;

/* JADX INFO: loaded from: classes5.dex */
public class LiveLabelDisplaySettings {

    @C09CT("display_duration")
    public Long displayDuration;

    @C09CT("display_intervals")
    public Long displayIntervals;

    @C09CT("most_display_times")
    public Integer mostDisplayTimes;

    public Long getDisplayDuration() throws C316660CbA {
        Long l = this.displayDuration;
        if (l != null) {
            return l;
        }
        throw new C316660CbA();
    }

    public Long getDisplayIntervals() throws C316660CbA {
        Long l = this.displayIntervals;
        if (l != null) {
            return l;
        }
        throw new C316660CbA();
    }

    public Integer getMostDisplayTimes() throws C316660CbA {
        Integer num = this.mostDisplayTimes;
        if (num != null) {
            return num;
        }
        throw new C316660CbA();
    }
}
