package com.ss.android.ugc.aweme.compliance.api.model;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class UserDetailsInfoBean {

    @C09CT("is_minor")
    public final Boolean isMinor;

    @C09CT("time_usage_today")
    public final int todayUsageTime;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserDetailsInfoBean)) {
            return false;
        }
        UserDetailsInfoBean userDetailsInfoBean = (UserDetailsInfoBean) obj;
        return Intrinsics.LJFF(this.isMinor, userDetailsInfoBean.isMinor) && this.todayUsageTime == userDetailsInfoBean.todayUsageTime;
    }

    public UserDetailsInfoBean() {
        this(Boolean.FALSE, 0);
    }

    public UserDetailsInfoBean(Boolean bool, int i) {
        this.isMinor = bool;
        this.todayUsageTime = i;
    }
}
