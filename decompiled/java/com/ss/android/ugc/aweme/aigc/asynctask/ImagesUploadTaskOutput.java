package com.ss.android.ugc.aweme.aigc.asynctask;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ImagesUploadTaskOutput extends AbsTaskOutput {
    public final String LIZ;
    public final int LIZIZ;
    public final String LIZJ;

    @C09CT("imageXIdMap")
    public final List<String> imageXIdList;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImagesUploadTaskOutput)) {
            return false;
        }
        ImagesUploadTaskOutput imagesUploadTaskOutput = (ImagesUploadTaskOutput) obj;
        return Intrinsics.LJFF(this.LIZ, imagesUploadTaskOutput.LIZ) && this.LIZIZ == imagesUploadTaskOutput.LIZIZ && Intrinsics.LJFF(this.LIZJ, imagesUploadTaskOutput.LIZJ) && Intrinsics.LJFF(this.imageXIdList, imagesUploadTaskOutput.imageXIdList);
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31) + this.imageXIdList.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImagesUploadTaskOutput(status=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", imageXIdList=");
        sbLIZ.append(this.imageXIdList);
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

    public ImagesUploadTaskOutput(String str, int i, String str2, List<String> list) {
        super(str, i, str2, null, "");
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = str2;
        this.imageXIdList = list;
    }

    public ImagesUploadTaskOutput(String str, int i, String str2, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? C13BV.INSTANCE : list);
    }
}
