package com.ss.android.ugc.aweme.aigc.asynctask;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class FaceDetectTaskOutput extends AbsTaskOutput {
    public final String LIZ;
    public final int LIZIZ;
    public final String LIZJ;

    @C09CT("duration")
    public final long durationMs;

    @C09CT("face_count_list")
    public final List<Integer> faceCountList;

    @C09CT("input_id")
    public final String inputId;

    @C09CT("use_cache")
    public final boolean useCache;

    public FaceDetectTaskOutput() {
        this(null, 0, null, null, 0L, false, null, 127, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FaceDetectTaskOutput)) {
            return false;
        }
        FaceDetectTaskOutput faceDetectTaskOutput = (FaceDetectTaskOutput) obj;
        return Intrinsics.LJFF(this.LIZ, faceDetectTaskOutput.LIZ) && this.LIZIZ == faceDetectTaskOutput.LIZIZ && Intrinsics.LJFF(this.LIZJ, faceDetectTaskOutput.LIZJ) && Intrinsics.LJFF(this.faceCountList, faceDetectTaskOutput.faceCountList) && this.durationMs == faceDetectTaskOutput.durationMs && this.useCache == faceDetectTaskOutput.useCache && Intrinsics.LJFF(this.inputId, faceDetectTaskOutput.inputId);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31) + this.faceCountList.hashCode()) * 31) + C786410Ut5.Y2(this.durationMs)) * 31) + C786410Ut5.Z2(this.useCache)) * 31;
        String str = this.inputId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FaceDetectTaskOutput(status=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", faceCountList=");
        sbLIZ.append(this.faceCountList);
        sbLIZ.append(", durationMs=");
        sbLIZ.append(this.durationMs);
        sbLIZ.append(", useCache=");
        sbLIZ.append(this.useCache);
        sbLIZ.append(", inputId=");
        sbLIZ.append(this.inputId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput
    public final int LIZ() {
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput
    public final String LIZIZ() {
        return this.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput
    public final String LJ() {
        return this.LIZ;
    }

    public FaceDetectTaskOutput(String str, int i, String str2, List<Integer> list, long j, boolean z, String str3) {
        super(str, i, str2, null, "");
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = str2;
        this.faceCountList = list;
        this.durationMs = j;
        this.useCache = z;
        this.inputId = str3;
    }

    public FaceDetectTaskOutput(String str, int i, String str2, List list, long j, boolean z, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) == 0 ? str2 : "", (i2 & 8) != 0 ? C13BV.INSTANCE : list, (i2 & 16) != 0 ? 0L : j, (i2 & 32) == 0 ? z : false, (i2 & 64) != 0 ? null : str3);
    }
}
