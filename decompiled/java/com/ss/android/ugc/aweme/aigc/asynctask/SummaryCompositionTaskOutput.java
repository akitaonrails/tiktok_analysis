package com.ss.android.ugc.aweme.aigc.asynctask;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class SummaryCompositionTaskOutput extends AbsTaskOutput {

    @C09CT("errorCode")
    public final int errorCode;

    @C09CT("errorMsg")
    public final String errorMsg;

    @C09CT("outputPath")
    public final String outputPath;

    @C09CT("segmentsJson")
    public final String segmentsJson;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final String status;

    @C09CT("totalDurationMs")
    public final long totalDurationMs;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SummaryCompositionTaskOutput)) {
            return false;
        }
        SummaryCompositionTaskOutput summaryCompositionTaskOutput = (SummaryCompositionTaskOutput) obj;
        return Intrinsics.LJFF(this.outputPath, summaryCompositionTaskOutput.outputPath) && Intrinsics.LJFF(this.segmentsJson, summaryCompositionTaskOutput.segmentsJson) && this.totalDurationMs == summaryCompositionTaskOutput.totalDurationMs && Intrinsics.LJFF(this.status, summaryCompositionTaskOutput.status) && this.errorCode == summaryCompositionTaskOutput.errorCode && Intrinsics.LJFF(this.errorMsg, summaryCompositionTaskOutput.errorMsg);
    }

    public final int hashCode() {
        return (((((((((this.outputPath.hashCode() * 31) + this.segmentsJson.hashCode()) * 31) + C786410Ut5.Y2(this.totalDurationMs)) * 31) + this.status.hashCode()) * 31) + this.errorCode) * 31) + this.errorMsg.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SummaryCompositionTaskOutput(outputPath=");
        sbLIZ.append(this.outputPath);
        sbLIZ.append(", segmentsJson=");
        sbLIZ.append(this.segmentsJson);
        sbLIZ.append(", totalDurationMs=");
        sbLIZ.append(this.totalDurationMs);
        sbLIZ.append(", status=");
        sbLIZ.append(this.status);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.errorCode);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.errorMsg);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SummaryCompositionTaskOutput() {
        this("", "", 0L, "", 0, "");
    }

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput
    public final int LIZ() {
        return this.errorCode;
    }

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput
    public final String LIZIZ() {
        return this.errorMsg;
    }

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput
    public final String LJ() {
        return this.status;
    }

    public SummaryCompositionTaskOutput(String str, String str2, long j, String str3, int i, String str4) {
        super(str3, i, str4, null, "");
        this.outputPath = str;
        this.segmentsJson = str2;
        this.totalDurationMs = j;
        this.status = str3;
        this.errorCode = i;
        this.errorMsg = str4;
    }
}
