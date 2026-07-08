package com.ss.android.ugc.aweme.poi.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes19.dex */
public final class FreqConfig {

    @C09CT("frequency_day")
    public final Integer frequencyDay;

    @C09CT("frequency_times")
    public final Integer frequencyTimes;

    public FreqConfig() {
        this(null, null);
    }

    public FreqConfig(Integer num, Integer num2) {
        this.frequencyDay = num;
        this.frequencyTimes = num2;
    }
}
