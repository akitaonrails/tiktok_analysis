package com.ss.android.ugc.aweme.aigc.asynctask;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class ImageUploadTaskOutput extends AbsTaskOutput {
    public final String LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;

    @C09CT("image_upload_duration")
    public final long imageUploadDuration;

    @C09CT("imageXId")
    public final List<String> imageXIdList;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageUploadTaskOutput)) {
            return false;
        }
        ImageUploadTaskOutput imageUploadTaskOutput = (ImageUploadTaskOutput) obj;
        return Intrinsics.LJFF(this.LIZ, imageUploadTaskOutput.LIZ) && this.LIZIZ == imageUploadTaskOutput.LIZIZ && Intrinsics.LJFF(this.LIZJ, imageUploadTaskOutput.LIZJ) && Intrinsics.LJFF(this.LIZLLL, imageUploadTaskOutput.LIZLLL) && Intrinsics.LJFF(this.imageXIdList, imageUploadTaskOutput.imageXIdList) && Intrinsics.LJFF(this.LJ, imageUploadTaskOutput.LJ) && this.imageUploadDuration == imageUploadTaskOutput.imageUploadDuration;
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31;
        String str = this.LIZLLL;
        return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.imageXIdList.hashCode()) * 31) + this.LJ.hashCode()) * 31) + C786410Ut5.Y2(this.imageUploadDuration);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageUploadTaskOutput(status=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", errorSource=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", imageXIdList=");
        sbLIZ.append(this.imageXIdList);
        sbLIZ.append(", fileSuffix=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", imageUploadDuration=");
        sbLIZ.append(this.imageUploadDuration);
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
    public final String LIZJ() {
        return this.LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput
    public final String LJ() {
        return this.LIZ;
    }

    public ImageUploadTaskOutput(String str, int i, String str2, String str3, List<String> list, String str4, long j) {
        super(str, i, str2, null, "");
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.imageXIdList = list;
        this.LJ = str4;
        this.imageUploadDuration = j;
    }

    public ImageUploadTaskOutput(String str, int i, String str2, String str3, List list, String str4, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? C13BV.INSTANCE : list, (i2 & 32) == 0 ? str4 : "", (i2 & 64) != 0 ? 0L : j);
    }
}
