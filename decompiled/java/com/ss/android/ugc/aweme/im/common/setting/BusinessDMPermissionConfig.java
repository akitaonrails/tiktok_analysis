package com.ss.android.ugc.aweme.im.common.setting;

import X.C09CT;

/* JADX INFO: loaded from: classes15.dex */
public final class BusinessDMPermissionConfig {

    @C09CT("business_dm_permission_guide_banner_interval_in_day")
    public final long guideBannerShowIntervalInDay;

    public BusinessDMPermissionConfig() {
        this(30L);
    }

    public BusinessDMPermissionConfig(long j) {
        this.guideBannerShowIntervalInDay = j;
    }
}
