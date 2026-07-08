package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import X.C316660CbA;

/* JADX INFO: loaded from: classes5.dex */
public class ApiConfigEntity {

    @C09CT("api_name")
    public String apiName;

    @C09CT("delay_time")
    public Long delayTime;

    @C09CT("is_banned")
    public Boolean isBanned;

    public Long getDelayTime() throws C316660CbA {
        Long l = this.delayTime;
        if (l != null) {
            return l;
        }
        throw new C316660CbA();
    }

    public Boolean getIsBanned() throws C316660CbA {
        Boolean bool = this.isBanned;
        if (bool != null) {
            return bool;
        }
        throw new C316660CbA();
    }

    public String getApiName() {
        return this.apiName;
    }
}
