package com.ss.android.ugc.aweme.ecommerce.network;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public final class WeakNetworkOptimizeConfig {

    @C09CT("high_priority_paths")
    public final List<String> highPriorityPaths;

    @C09CT("priority_optimize_switch")
    public final int priorityOptimizeSwitch;

    public WeakNetworkOptimizeConfig(int i, List<String> list) {
        this.priorityOptimizeSwitch = i;
        this.highPriorityPaths = list;
    }
}
