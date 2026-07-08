package com.ss.android.ugc.aweme.aigc.asynctask;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class GeneralI2VPostProcessingTaskOutput extends AbsTaskOutput {
    public final String LIZ;
    public final int LIZIZ;
    public final String LIZJ;

    @C09CT("fileLocalPath")
    public final String fileLocalPath;

    public GeneralI2VPostProcessingTaskOutput() {
        this("", 0, "", null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GeneralI2VPostProcessingTaskOutput)) {
            return false;
        }
        GeneralI2VPostProcessingTaskOutput generalI2VPostProcessingTaskOutput = (GeneralI2VPostProcessingTaskOutput) obj;
        return Intrinsics.LJFF(this.LIZ, generalI2VPostProcessingTaskOutput.LIZ) && this.LIZIZ == generalI2VPostProcessingTaskOutput.LIZIZ && Intrinsics.LJFF(this.LIZJ, generalI2VPostProcessingTaskOutput.LIZJ) && Intrinsics.LJFF(this.fileLocalPath, generalI2VPostProcessingTaskOutput.fileLocalPath);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31;
        String str = this.fileLocalPath;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GeneralI2VPostProcessingTaskOutput(status=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", fileLocalPath=");
        sbLIZ.append(this.fileLocalPath);
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

    public GeneralI2VPostProcessingTaskOutput(String str, int i, String str2, String str3) {
        super(str, i, str2, null, "");
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = str2;
        this.fileLocalPath = str3;
    }
}
