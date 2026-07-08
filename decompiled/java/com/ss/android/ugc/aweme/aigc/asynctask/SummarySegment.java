package com.ss.android.ugc.aweme.aigc.asynctask;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class SummarySegment {

    @C09CT("asset_id")
    public final String assetId;

    @C09CT("asset_type")
    public final AssetType assetType;

    @C09CT("end_time_ms")
    public final long endTimeMs;

    @C09CT("original_duration_ms")
    public final long originalDurationMs;

    @C09CT("original_resolution")
    public final String originalResolution;

    @C09CT("start_time_ms")
    public final long startTimeMs;

    @C09CT("summary_video_url")
    public final String summaryVideoUrl;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SummarySegment)) {
            return false;
        }
        SummarySegment summarySegment = (SummarySegment) obj;
        return Intrinsics.LJFF(this.assetId, summarySegment.assetId) && this.assetType == summarySegment.assetType && this.startTimeMs == summarySegment.startTimeMs && this.endTimeMs == summarySegment.endTimeMs && this.originalDurationMs == summarySegment.originalDurationMs && Intrinsics.LJFF(this.originalResolution, summarySegment.originalResolution) && Intrinsics.LJFF(this.summaryVideoUrl, summarySegment.summaryVideoUrl);
    }

    public final int hashCode() {
        return (((((((((((this.assetId.hashCode() * 31) + this.assetType.hashCode()) * 31) + C786410Ut5.Y2(this.startTimeMs)) * 31) + C786410Ut5.Y2(this.endTimeMs)) * 31) + C786410Ut5.Y2(this.originalDurationMs)) * 31) + this.originalResolution.hashCode()) * 31) + this.summaryVideoUrl.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SummarySegment(assetId=");
        sbLIZ.append(this.assetId);
        sbLIZ.append(", assetType=");
        sbLIZ.append(this.assetType);
        sbLIZ.append(", startTimeMs=");
        sbLIZ.append(this.startTimeMs);
        sbLIZ.append(", endTimeMs=");
        sbLIZ.append(this.endTimeMs);
        sbLIZ.append(", originalDurationMs=");
        sbLIZ.append(this.originalDurationMs);
        sbLIZ.append(", originalResolution=");
        sbLIZ.append(this.originalResolution);
        sbLIZ.append(", summaryVideoUrl=");
        sbLIZ.append(this.summaryVideoUrl);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SummarySegment() {
        this("", AssetType.IMAGE, 0L, 0L, 0L, "", "");
    }

    public SummarySegment(String str, AssetType assetType, long j, long j2, long j3, String str2, String str3) {
        this.assetId = str;
        this.assetType = assetType;
        this.startTimeMs = j;
        this.endTimeMs = j2;
        this.originalDurationMs = j3;
        this.originalResolution = str2;
        this.summaryVideoUrl = str3;
    }
}
