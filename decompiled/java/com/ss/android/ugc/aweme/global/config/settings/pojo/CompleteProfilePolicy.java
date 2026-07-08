package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import X.C316660CbA;

/* JADX INFO: loaded from: classes5.dex */
public class CompleteProfilePolicy {

    @C09CT("interval")
    public Integer interval;

    @C09CT("times")
    public Integer times;

    public Integer getInterval() throws C316660CbA {
        Integer num = this.interval;
        if (num != null) {
            return num;
        }
        throw new C316660CbA();
    }

    public Integer getTimes() throws C316660CbA {
        Integer num = this.times;
        if (num != null) {
            return num;
        }
        throw new C316660CbA();
    }
}
