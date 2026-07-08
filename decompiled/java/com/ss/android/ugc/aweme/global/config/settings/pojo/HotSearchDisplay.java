package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import X.C316660CbA;

/* JADX INFO: loaded from: classes5.dex */
public class HotSearchDisplay {

    @C09CT("most_display_times")
    public Integer mostDisplayTimes;

    @C09CT("one_display_intervals")
    public Long oneDisplayIntervals;

    @C09CT("op_most_display_times")
    public Integer opMostDisplayTimes;

    @C09CT("op_one_display_intervals")
    public Long opOneDisplayIntervals;

    public Integer getMostDisplayTimes() throws C316660CbA {
        Integer num = this.mostDisplayTimes;
        if (num != null) {
            return num;
        }
        throw new C316660CbA();
    }

    public Long getOneDisplayIntervals() throws C316660CbA {
        Long l = this.oneDisplayIntervals;
        if (l != null) {
            return l;
        }
        throw new C316660CbA();
    }

    public Integer getOpMostDisplayTimes() throws C316660CbA {
        Integer num = this.opMostDisplayTimes;
        if (num != null) {
            return num;
        }
        throw new C316660CbA();
    }

    public Long getOpOneDisplayIntervals() throws C316660CbA {
        Long l = this.opOneDisplayIntervals;
        if (l != null) {
            return l;
        }
        throw new C316660CbA();
    }
}
