package com.ss.android.ugc.aweme.base;

import X.C09CT;

/* JADX INFO: loaded from: classes19.dex */
public final class LsFrequency {

    @C09CT("frequency_day")
    public final Integer frequencyDay;

    @C09CT("frequency_times")
    public final Integer frequencyTimes;

    public LsFrequency() {
        this(null, null);
    }

    public LsFrequency(Integer num, Integer num2) {
        this.frequencyDay = num;
        this.frequencyTimes = num2;
    }
}
