package com.ss.android.ugc.aweme.ecommerce.mall.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class EcMallPreloadOptConfigModel {

    @C09CT("auto_clean_preload_view")
    public final boolean autoCleanPreloadView;

    @C09CT("clean_by_spark")
    public final Boolean cleanBySpark;

    @C09CT("clean_when_low_memory")
    public final Boolean cleanWhenLowMemory;

    @C09CT("expired_time_second")
    public final Integer expiredTime;

    public EcMallPreloadOptConfigModel() {
        this(false, null, null, null);
    }

    public EcMallPreloadOptConfigModel(boolean z, Integer num, Boolean bool, Boolean bool2) {
        this.autoCleanPreloadView = z;
        this.expiredTime = num;
        this.cleanBySpark = bool;
        this.cleanWhenLowMemory = bool2;
    }
}
