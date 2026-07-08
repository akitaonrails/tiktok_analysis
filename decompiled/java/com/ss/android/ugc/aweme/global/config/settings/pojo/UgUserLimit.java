package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import X.C316660CbA;

/* JADX INFO: loaded from: classes29.dex */
public class UgUserLimit {

    @C09CT("active_days")
    public Integer activeDays;

    @C09CT("show_for_active")
    public Boolean showForActive;

    public Integer getActiveDays() throws C316660CbA {
        Integer num = this.activeDays;
        if (num != null) {
            return num;
        }
        throw new C316660CbA();
    }

    public Boolean getShowForActive() throws C316660CbA {
        Boolean bool = this.showForActive;
        if (bool != null) {
            return bool;
        }
        throw new C316660CbA();
    }
}
