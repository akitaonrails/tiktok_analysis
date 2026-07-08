package com.ss.android.ugc.aweme.vibefeed.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class SummaryPageResponse extends BaseResponse {

    @C09CT("co_liked_item_result")
    public final SummaryCoLikedItemResult coLikedItemResult;

    @C09CT("log_pb")
    public final LogPbBean logPB;

    @C09CT("summary_stats")
    public final SummaryStats summaryStats;

    public SummaryPageResponse() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SummaryPageResponse)) {
            return false;
        }
        SummaryPageResponse summaryPageResponse = (SummaryPageResponse) obj;
        return Intrinsics.LJFF(this.summaryStats, summaryPageResponse.summaryStats) && Intrinsics.LJFF(this.logPB, summaryPageResponse.logPB) && Intrinsics.LJFF(this.coLikedItemResult, summaryPageResponse.coLikedItemResult);
    }

    public final int hashCode() {
        SummaryStats summaryStats = this.summaryStats;
        int iHashCode = (summaryStats == null ? 0 : summaryStats.hashCode()) * 31;
        LogPbBean logPbBean = this.logPB;
        int iHashCode2 = (iHashCode + (logPbBean == null ? 0 : logPbBean.hashCode())) * 31;
        SummaryCoLikedItemResult summaryCoLikedItemResult = this.coLikedItemResult;
        return iHashCode2 + (summaryCoLikedItemResult != null ? summaryCoLikedItemResult.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SummaryPageResponse(summaryStats=");
        sbLIZ.append(this.summaryStats);
        sbLIZ.append(", logPB=");
        sbLIZ.append(this.logPB);
        sbLIZ.append(", coLikedItemResult=");
        sbLIZ.append(this.coLikedItemResult);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SummaryPageResponse(SummaryStats summaryStats, LogPbBean logPbBean, SummaryCoLikedItemResult summaryCoLikedItemResult) {
        this.summaryStats = summaryStats;
        this.logPB = logPbBean;
        this.coLikedItemResult = summaryCoLikedItemResult;
    }
}
