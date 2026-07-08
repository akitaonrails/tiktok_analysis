package com.ss.android.ugc.aweme.creative.taskscheduler.downgrade;

import X.C09CT;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes33.dex */
public final class DowngradeStrategy {

    @C09CT("execution_interval")
    public final long executionInterval;

    @C09CT("strategy")
    public final String strategy;

    @C09CT("tasks")
    public final ArrayList<String> taskList;

    public DowngradeStrategy() {
        this("not_execute", -1L, new ArrayList());
    }

    public DowngradeStrategy(String str, long j, ArrayList<String> arrayList) {
        this.strategy = str;
        this.executionInterval = j;
        this.taskList = arrayList;
    }
}
