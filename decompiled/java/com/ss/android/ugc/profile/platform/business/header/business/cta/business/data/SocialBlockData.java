package com.ss.android.ugc.profile.platform.business.header.business.cta.business.data;

import X.C09CT;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;

/* JADX INFO: loaded from: classes20.dex */
public final class SocialBlockData extends BizBaseData {
    public static final int $stable = 8;

    @C09CT("blocking_by_type")
    public Integer blockingByType;

    public final Integer getBlockingByType() {
        return this.blockingByType;
    }

    public final void setBlockingByType(Integer num) {
        this.blockingByType = num;
    }
}
