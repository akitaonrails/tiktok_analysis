package com.ss.android.ugc.aweme.aigc.asynctask;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class CreationDownloadTaskOutput extends AbsTaskOutput {
    public final String LIZ;
    public final int LIZIZ;
    public final String LIZJ;

    @C09CT("fileLocalPath")
    public final String fileLocalPath;

    @C09CT("fileLocalPathList")
    public final String fileLocalPathList;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreationDownloadTaskOutput)) {
            return false;
        }
        CreationDownloadTaskOutput creationDownloadTaskOutput = (CreationDownloadTaskOutput) obj;
        return Intrinsics.LJFF(this.LIZ, creationDownloadTaskOutput.LIZ) && this.LIZIZ == creationDownloadTaskOutput.LIZIZ && Intrinsics.LJFF(this.LIZJ, creationDownloadTaskOutput.LIZJ) && Intrinsics.LJFF(this.fileLocalPath, creationDownloadTaskOutput.fileLocalPath) && Intrinsics.LJFF(this.fileLocalPathList, creationDownloadTaskOutput.fileLocalPathList);
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31) + this.fileLocalPath.hashCode()) * 31) + this.fileLocalPathList.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreationDownloadTaskOutput(status=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", fileLocalPath=");
        sbLIZ.append(this.fileLocalPath);
        sbLIZ.append(", fileLocalPathList=");
        sbLIZ.append(this.fileLocalPathList);
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

    public CreationDownloadTaskOutput(String str, int i, String str2, String str3, String str4) {
        super(str, i, str2, null, "");
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = str2;
        this.fileLocalPath = str3;
        this.fileLocalPathList = str4;
    }
}
