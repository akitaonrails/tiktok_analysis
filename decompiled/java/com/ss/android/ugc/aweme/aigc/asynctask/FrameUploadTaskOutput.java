package com.ss.android.ugc.aweme.aigc.asynctask;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class FrameUploadTaskOutput extends AbsTaskOutput {
    public final String LIZ;
    public final int LIZIZ;
    public final String LIZJ;

    @C09CT("zip_url")
    public final String zipUrl;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrameUploadTaskOutput)) {
            return false;
        }
        FrameUploadTaskOutput frameUploadTaskOutput = (FrameUploadTaskOutput) obj;
        return Intrinsics.LJFF(this.LIZ, frameUploadTaskOutput.LIZ) && this.LIZIZ == frameUploadTaskOutput.LIZIZ && Intrinsics.LJFF(this.LIZJ, frameUploadTaskOutput.LIZJ) && Intrinsics.LJFF(this.zipUrl, frameUploadTaskOutput.zipUrl);
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31) + this.zipUrl.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FrameUploadTaskOutput(status=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", zipUrl=");
        sbLIZ.append(this.zipUrl);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FrameUploadTaskOutput() {
        this("", 0, "", "");
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

    public FrameUploadTaskOutput(String str, int i, String str2, String str3) {
        super(str, i, str2, null, "");
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = str2;
        this.zipUrl = str3;
    }
}
