package com.ss.android.ugc.aweme.setting;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes15.dex */
public final class ContentCheckPermissionResponse extends BaseResponse {

    @C09CT("is_eligible")
    public Boolean isEligible;

    @C09CT("usage_count_today")
    public Integer usageCountToday;

    public ContentCheckPermissionResponse() {
        this(null, -1);
    }

    public final Integer getUsageCountToday() {
        return this.usageCountToday;
    }

    public final Boolean isEligible() {
        return this.isEligible;
    }

    public final void setEligible(Boolean bool) {
        this.isEligible = bool;
    }

    public final void setUsageCountToday(Integer num) {
        this.usageCountToday = num;
    }

    public ContentCheckPermissionResponse(Boolean bool, Integer num) {
        this.isEligible = bool;
        this.usageCountToday = num;
    }
}
