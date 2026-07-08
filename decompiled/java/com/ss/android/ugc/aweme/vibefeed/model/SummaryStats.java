package com.ss.android.ugc.aweme.vibefeed.model;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class SummaryStats {

    @C09CT("co_liked_count")
    public Integer coLikeCount;

    @C09CT("history_co_liked_count")
    public Integer historyCoLikedCount;

    @C09CT("history_days_together")
    public Long historyDaysTogether;

    @C09CT("history_time_spent_seconds")
    public Long historyTimeSpentMin;

    public SummaryStats() {
        this(0, 0, 0L, 0L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SummaryStats)) {
            return false;
        }
        SummaryStats summaryStats = (SummaryStats) obj;
        return Intrinsics.LJFF(this.coLikeCount, summaryStats.coLikeCount) && Intrinsics.LJFF(this.historyCoLikedCount, summaryStats.historyCoLikedCount) && Intrinsics.LJFF(this.historyTimeSpentMin, summaryStats.historyTimeSpentMin) && Intrinsics.LJFF(this.historyDaysTogether, summaryStats.historyDaysTogether);
    }

    public SummaryStats(Integer num, Integer num2, Long l, Long l2) {
        this.coLikeCount = num;
        this.historyCoLikedCount = num2;
        this.historyTimeSpentMin = l;
        this.historyDaysTogether = l2;
    }
}
