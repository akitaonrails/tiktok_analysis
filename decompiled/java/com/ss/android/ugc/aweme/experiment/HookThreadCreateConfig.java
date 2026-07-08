package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import java.util.Set;

/* JADX INFO: loaded from: classes29.dex */
public final class HookThreadCreateConfig {

    @C09CT("high_priority")
    public final Set<String> threadListOfHighPriority;

    @C09CT("low_priority")
    public final Set<String> threadListOfLowPriority;

    public HookThreadCreateConfig(Set<String> set, Set<String> set2) {
        this.threadListOfHighPriority = set;
        this.threadListOfLowPriority = set2;
    }
}
