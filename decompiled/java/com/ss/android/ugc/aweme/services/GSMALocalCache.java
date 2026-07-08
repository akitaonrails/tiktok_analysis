package com.ss.android.ugc.aweme.services;

import X.C09CT;

/* JADX INFO: loaded from: classes20.dex */
public final class GSMALocalCache {
    public static final int $stable = 8;

    @C09CT("opt_out_required")
    public boolean optOutRequired;

    @C09CT("phone")
    public String phone;

    @C09CT("show_count")
    public int showCount;

    @C09CT("uid")
    public String uid;

    @C09CT("user_preference")
    public int userPreference;

    public final GSMALocalCache copy(int i, int i2, boolean z, String str, String str2) {
        return new GSMALocalCache(i, i2, z, str, str2);
    }

    public GSMALocalCache() {
        this(0, 0, false, "", "");
    }

    public final void setOptOutRequired(boolean z) {
        this.optOutRequired = z;
    }

    public final void setPhone(String str) {
        this.phone = str;
    }

    public final void setShowCount(int i) {
        this.showCount = i;
    }

    public final void setUid(String str) {
        this.uid = str;
    }

    public final void setUserPreference(int i) {
        this.userPreference = i;
    }

    public GSMALocalCache(int i, int i2, boolean z, String str, String str2) {
        this.userPreference = i;
        this.showCount = i2;
        this.optOutRequired = z;
        this.uid = str;
        this.phone = str2;
    }
}
