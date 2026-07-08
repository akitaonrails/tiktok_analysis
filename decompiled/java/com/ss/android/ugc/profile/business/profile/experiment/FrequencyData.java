package com.ss.android.ugc.profile.business.profile.experiment;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class FrequencyData implements Serializable {
    public static final int $stable = 0;

    @C09CT("day")
    public final Integer day;

    @C09CT("s2_day")
    public final Integer s2Day;

    @C09CT("show")
    public final Integer show;

    @C09CT("single_show")
    public final Integer singleShow;

    @C09CT("total_show")
    public final Integer totalShow;

    public FrequencyData() {
        this(null, null, null, null, null);
    }

    public final Integer getDay() {
        return this.day;
    }

    public final Integer getS2Day() {
        return this.s2Day;
    }

    public final Integer getShow() {
        return this.show;
    }

    public final Integer getSingleShow() {
        return this.singleShow;
    }

    public final Integer getTotalShow() {
        return this.totalShow;
    }

    public FrequencyData(Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
        this.day = num;
        this.show = num2;
        this.s2Day = num3;
        this.totalShow = num4;
        this.singleShow = num5;
    }
}
