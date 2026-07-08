package com.ss.android.ugc.aweme.net.experiment;

import X.C08CX;
import X.C09CT;
import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes24.dex */
public final class RepeatRequestFilterStrategy {

    @C09CT("blackList")
    public final Set<String> blackList;

    @C09CT("enable_during_start_up")
    public final boolean enableDuringStartup;

    @C09CT("limit")
    public final int limit;

    @C09CT("strictMode")
    public final boolean strictMode;

    @C09CT("whiteList")
    public final Set<String> whiteList;

    public RepeatRequestFilterStrategy() {
        this(0, false, false, null, null, 31, null);
    }

    public RepeatRequestFilterStrategy(int i, boolean z, boolean z2, Set<String> set, Set<String> set2) {
        this.limit = i;
        this.enableDuringStartup = z;
        this.strictMode = z2;
        this.blackList = set;
        this.whiteList = set2;
    }

    public RepeatRequestFilterStrategy(int i, boolean z, boolean z2, Set set, Set set2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? false : z, (i2 & 4) == 0 ? z2 : false, (i2 & 8) != 0 ? C08CX.INSTANCE : set, (i2 & 16) != 0 ? Collections.singleton("/aweme/v1/aweme/stats/") : set2);
    }
}
