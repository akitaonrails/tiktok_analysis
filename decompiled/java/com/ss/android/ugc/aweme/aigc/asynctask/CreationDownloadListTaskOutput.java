package com.ss.android.ugc.aweme.aigc.asynctask;

import X.C09CT;
import X.C2188811AlT;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class CreationDownloadListTaskOutput extends AbsTaskOutput {
    public final String LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    @C09CT("downloadItemList")
    public final List<DownloadItemResult> downloadItemList;

    public CreationDownloadListTaskOutput() {
        this("", 0, "", null, new ArrayList());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreationDownloadListTaskOutput)) {
            return false;
        }
        CreationDownloadListTaskOutput creationDownloadListTaskOutput = (CreationDownloadListTaskOutput) obj;
        return Intrinsics.LJFF(this.LIZ, creationDownloadListTaskOutput.LIZ) && this.LIZIZ == creationDownloadListTaskOutput.LIZIZ && Intrinsics.LJFF(this.LIZJ, creationDownloadListTaskOutput.LIZJ) && Intrinsics.LJFF(this.LIZLLL, creationDownloadListTaskOutput.LIZLLL) && Intrinsics.LJFF(this.downloadItemList, creationDownloadListTaskOutput.downloadItemList);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31;
        String str = this.LIZLLL;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.downloadItemList.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreationDownloadListTaskOutput(status=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", errorSource=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", downloadItemList=");
        sbLIZ.append(this.downloadItemList);
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

    public CreationDownloadListTaskOutput(String str, int i, String str2, String str3, List<DownloadItemResult> list) {
        super(str, i, str2, null, "");
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.downloadItemList = list;
    }
}
