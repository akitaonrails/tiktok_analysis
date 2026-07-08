package com.ss.android.ugc.aweme.memory.ab;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ActivityConfig {
    public static final int $stable = 8;

    @C09CT("activityList")
    public final List<String> activityList;

    @C09CT("enable")
    public final boolean enable;

    public ActivityConfig() {
        this(false, null);
    }

    public ActivityConfig(boolean z, List<String> list) {
        this.enable = z;
        this.activityList = list;
    }
}
