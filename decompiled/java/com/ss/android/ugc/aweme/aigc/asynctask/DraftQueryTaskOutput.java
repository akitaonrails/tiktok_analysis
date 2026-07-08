package com.ss.android.ugc.aweme.aigc.asynctask;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class DraftQueryTaskOutput extends AbsTaskOutput {
    public final String LIZ;
    public final int LIZIZ;
    public final String LIZJ;

    @C09CT("content_source")
    public final String contentSource;

    @C09CT("content_type")
    public final String contentType;

    @C09CT("shoot_way")
    public final String shootWay;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraftQueryTaskOutput)) {
            return false;
        }
        DraftQueryTaskOutput draftQueryTaskOutput = (DraftQueryTaskOutput) obj;
        return Intrinsics.LJFF(this.LIZ, draftQueryTaskOutput.LIZ) && this.LIZIZ == draftQueryTaskOutput.LIZIZ && Intrinsics.LJFF(this.LIZJ, draftQueryTaskOutput.LIZJ) && Intrinsics.LJFF(this.contentType, draftQueryTaskOutput.contentType) && Intrinsics.LJFF(this.contentSource, draftQueryTaskOutput.contentSource) && Intrinsics.LJFF(this.shootWay, draftQueryTaskOutput.shootWay);
    }

    public final int hashCode() {
        return (((((((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31) + this.contentType.hashCode()) * 31) + this.contentSource.hashCode()) * 31) + this.shootWay.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DraftQueryTaskOutput(status=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", contentType=");
        sbLIZ.append(this.contentType);
        sbLIZ.append(", contentSource=");
        sbLIZ.append(this.contentSource);
        sbLIZ.append(", shootWay=");
        sbLIZ.append(this.shootWay);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DraftQueryTaskOutput() {
        this("", 0, "", "", "", "");
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

    public DraftQueryTaskOutput(String str, int i, String str2, String str3, String str4, String str5) {
        super(str, i, str2, null, "");
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = str2;
        this.contentType = str3;
        this.contentSource = str4;
        this.shootWay = str5;
    }
}
