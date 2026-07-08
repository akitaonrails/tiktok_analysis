package com.ss.android.ugc.profile.platform.exp;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class CampusGroupChatConfig {

    @C09CT("enabled")
    public final boolean enabled;

    @C09CT("fetch_count")
    public final int fetchCount;

    @C09CT("tab_red_dot_limit_hours")
    public final int redDotLimit;

    public CampusGroupChatConfig() {
        this(false, 10, 24);
    }

    public CampusGroupChatConfig(boolean z, int i, int i2) {
        this.enabled = z;
        this.fetchCount = i;
        this.redDotLimit = i2;
    }
}
