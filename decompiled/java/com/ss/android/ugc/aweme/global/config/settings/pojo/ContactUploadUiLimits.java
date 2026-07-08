package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import X.C316660CbA;

/* JADX INFO: loaded from: classes5.dex */
public class ContactUploadUiLimits {

    @C09CT("max_close_times")
    public Integer maxCloseTimes;

    @C09CT("max_display_times")
    public Integer maxDisplayTimes;

    public Integer getMaxCloseTimes() throws C316660CbA {
        Integer num = this.maxCloseTimes;
        if (num != null) {
            return num;
        }
        throw new C316660CbA();
    }

    public Integer getMaxDisplayTimes() throws C316660CbA {
        Integer num = this.maxDisplayTimes;
        if (num != null) {
            return num;
        }
        throw new C316660CbA();
    }
}
