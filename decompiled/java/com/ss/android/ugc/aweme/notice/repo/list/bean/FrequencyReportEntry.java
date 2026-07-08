package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class FrequencyReportEntry {

    @C09CT("nid")
    public final long nid;

    @C09CT("params")
    public final BehaviorParam param;

    public FrequencyReportEntry(long j, BehaviorParam behaviorParam) {
        this.nid = j;
        this.param = behaviorParam;
    }
}
