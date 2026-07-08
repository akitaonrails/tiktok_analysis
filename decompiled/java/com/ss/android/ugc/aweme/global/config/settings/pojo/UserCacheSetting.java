package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import X.C316660CbA;

/* JADX INFO: loaded from: classes5.dex */
public class UserCacheSetting {

    @C09CT("enable_ru_cache")
    public Integer enableRuCache;

    @C09CT("enable_ru_insert")
    public Integer enableRuInsert;

    @C09CT("ru_cache_intervals")
    public Long ruCacheIntervals;

    public Integer getEnableRuCache() throws C316660CbA {
        Integer num = this.enableRuCache;
        if (num != null) {
            return num;
        }
        throw new C316660CbA();
    }

    public Integer getEnableRuInsert() throws C316660CbA {
        Integer num = this.enableRuInsert;
        if (num != null) {
            return num;
        }
        throw new C316660CbA();
    }

    public Long getRuCacheIntervals() throws C316660CbA {
        Long l = this.ruCacheIntervals;
        if (l != null) {
            return l;
        }
        throw new C316660CbA();
    }
}
