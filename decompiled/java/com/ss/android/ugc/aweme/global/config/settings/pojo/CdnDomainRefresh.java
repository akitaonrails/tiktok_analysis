package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import X.C316660CbA;

/* JADX INFO: loaded from: classes5.dex */
public class CdnDomainRefresh {

    @C09CT("keepalive_timeout")
    public Integer keepaliveTimeout;

    @C09CT("refresh_interval")
    public Integer refreshInterval;

    @C09CT("refresh_switch")
    public Boolean refreshSwitch;

    public Integer getKeepaliveTimeout() throws C316660CbA {
        Integer num = this.keepaliveTimeout;
        if (num != null) {
            return num;
        }
        throw new C316660CbA();
    }

    public Integer getRefreshInterval() throws C316660CbA {
        Integer num = this.refreshInterval;
        if (num != null) {
            return num;
        }
        throw new C316660CbA();
    }

    public Boolean getRefreshSwitch() throws C316660CbA {
        Boolean bool = this.refreshSwitch;
        if (bool != null) {
            return bool;
        }
        throw new C316660CbA();
    }
}
