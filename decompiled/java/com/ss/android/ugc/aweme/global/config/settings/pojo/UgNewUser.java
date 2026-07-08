package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import X.C316660CbA;

/* JADX INFO: loaded from: classes29.dex */
public class UgNewUser {

    @C09CT("active_time_limit")
    public Integer activeTimeLimit;

    @C09CT("download_time_limit")
    public Integer downloadTimeLimit;

    public Integer getActiveTimeLimit() throws C316660CbA {
        Integer num = this.activeTimeLimit;
        if (num != null) {
            return num;
        }
        throw new C316660CbA();
    }

    public Integer getDownloadTimeLimit() throws C316660CbA {
        Integer num = this.downloadTimeLimit;
        if (num != null) {
            return num;
        }
        throw new C316660CbA();
    }
}
