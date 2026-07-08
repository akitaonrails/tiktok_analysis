package com.ss.android.ugc.aweme.aigc.asynctask;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class VideoUploadTosTaskOutput extends AbsTaskOutput {
    public final String LIZ;
    public final int LIZIZ;
    public final String LIZJ;

    @C09CT("vid")
    public final String vid;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoUploadTosTaskOutput)) {
            return false;
        }
        VideoUploadTosTaskOutput videoUploadTosTaskOutput = (VideoUploadTosTaskOutput) obj;
        return Intrinsics.LJFF(this.LIZ, videoUploadTosTaskOutput.LIZ) && this.LIZIZ == videoUploadTosTaskOutput.LIZIZ && Intrinsics.LJFF(this.LIZJ, videoUploadTosTaskOutput.LIZJ) && Intrinsics.LJFF(this.vid, videoUploadTosTaskOutput.vid);
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31) + this.vid.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoUploadTosTaskOutput(status=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", vid=");
        sbLIZ.append(this.vid);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VideoUploadTosTaskOutput() {
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

    public VideoUploadTosTaskOutput(String str, int i, String str2, String str3) {
        super(str, i, str2, null, "");
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = str2;
        this.vid = str3;
    }
}
