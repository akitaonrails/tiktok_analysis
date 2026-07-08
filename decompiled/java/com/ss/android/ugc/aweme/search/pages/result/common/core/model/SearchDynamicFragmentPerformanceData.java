package com.ss.android.ugc.aweme.search.pages.result.common.core.model;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchDynamicFragmentPerformanceData {

    @C09CT("loadEndTimestamp")
    public final long lynxLoadEndStamp;

    @C09CT("loadStartTimestamp")
    public final long lynxLoadStartStamp;

    @C09CT("requestEndTimestamp")
    public final long requestEndTimeStamp;

    @C09CT("requestStartTimestamp")
    public final long requestStartTimeStamp;

    @C09CT("searchTimestamp")
    public final long searchTimeStamp;

    public SearchDynamicFragmentPerformanceData(long j, long j2, long j3, long j4, long j5) {
        this.searchTimeStamp = j;
        this.requestStartTimeStamp = j2;
        this.requestEndTimeStamp = j3;
        this.lynxLoadStartStamp = j4;
        this.lynxLoadEndStamp = j5;
    }
}
