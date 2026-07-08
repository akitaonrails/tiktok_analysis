package com.ss.android.ugc.aweme.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class InsightTypeResponse extends BaseResponse {

    @C09CT("video_like_distrubution_7d")
    public final DataInsightsMetric videoLikeRateHistory;

    @C09CT("video_retention_rate_history_7d")
    public final DataInsightsMetric videoRetentionRateHistory;

    public InsightTypeResponse() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InsightTypeResponse)) {
            return false;
        }
        InsightTypeResponse insightTypeResponse = (InsightTypeResponse) obj;
        return Intrinsics.LJFF(this.videoRetentionRateHistory, insightTypeResponse.videoRetentionRateHistory) && Intrinsics.LJFF(this.videoLikeRateHistory, insightTypeResponse.videoLikeRateHistory);
    }

    public final int hashCode() {
        DataInsightsMetric dataInsightsMetric = this.videoRetentionRateHistory;
        int iHashCode = (dataInsightsMetric == null ? 0 : dataInsightsMetric.hashCode()) * 31;
        DataInsightsMetric dataInsightsMetric2 = this.videoLikeRateHistory;
        return iHashCode + (dataInsightsMetric2 != null ? dataInsightsMetric2.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InsightTypeResponse(videoRetentionRateHistory=");
        sbLIZ.append(this.videoRetentionRateHistory);
        sbLIZ.append(", videoLikeRateHistory=");
        sbLIZ.append(this.videoLikeRateHistory);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public InsightTypeResponse(DataInsightsMetric dataInsightsMetric, DataInsightsMetric dataInsightsMetric2) {
        this.videoRetentionRateHistory = dataInsightsMetric;
        this.videoLikeRateHistory = dataInsightsMetric2;
    }
}
