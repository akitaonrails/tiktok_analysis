package com.ss.android.ugc.aweme.fangroup.model;

import X.C09CT;

/* JADX INFO: loaded from: classes20.dex */
public final class FanGroupListOption {

    @C09CT("need_check_min_eligible_user")
    public final boolean needCheckMinEligibleUser;

    @C09CT("need_threshold_config")
    public final boolean needThresholdConfig;

    public FanGroupListOption() {
        this(true, true);
    }

    public FanGroupListOption(boolean z, boolean z2) {
        this.needThresholdConfig = z;
        this.needCheckMinEligibleUser = z2;
    }
}
