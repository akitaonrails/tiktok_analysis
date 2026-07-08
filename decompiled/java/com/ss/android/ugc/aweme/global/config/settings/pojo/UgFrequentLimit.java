package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import X.C316660CbA;

/* JADX INFO: loaded from: classes29.dex */
public class UgFrequentLimit {

    @C09CT("days_no_show")
    public Integer daysNoShow;

    @C09CT("days_window")
    public Integer daysWindow;

    @C09CT("max_close")
    public Integer maxClose;

    public Integer getDaysNoShow() throws C316660CbA {
        Integer num = this.daysNoShow;
        if (num != null) {
            return num;
        }
        throw new C316660CbA();
    }

    public Integer getDaysWindow() throws C316660CbA {
        Integer num = this.daysWindow;
        if (num != null) {
            return num;
        }
        throw new C316660CbA();
    }

    public Integer getMaxClose() throws C316660CbA {
        Integer num = this.maxClose;
        if (num != null) {
            return num;
        }
        throw new C316660CbA();
    }
}
