package com.ss.android.ugc.aweme.aigc.asynctask;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCResultType;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class GeneralI2VServerProgressTaskOutput extends AbsTaskOutput {
    public final String LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    @C09CT("extra")
    public final String extra;

    @C09CT("child_fail_reason_msg")
    public final String failReasonMsg;

    @C09CT("child_videoUrl")
    public final String videoUrl;

    @C09CT("child_videoUrlList")
    public final List<AIGCServerTaskOutput> videoUrlList;

    @C09CT("file_url_type")
    public final AIGCResultType videoUrlType;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GeneralI2VServerProgressTaskOutput)) {
            return false;
        }
        GeneralI2VServerProgressTaskOutput generalI2VServerProgressTaskOutput = (GeneralI2VServerProgressTaskOutput) obj;
        return Intrinsics.LJFF(this.LIZ, generalI2VServerProgressTaskOutput.LIZ) && this.LIZIZ == generalI2VServerProgressTaskOutput.LIZIZ && Intrinsics.LJFF(this.LIZJ, generalI2VServerProgressTaskOutput.LIZJ) && Intrinsics.LJFF(this.LIZLLL, generalI2VServerProgressTaskOutput.LIZLLL) && Intrinsics.LJFF(this.failReasonMsg, generalI2VServerProgressTaskOutput.failReasonMsg) && Intrinsics.LJFF(this.videoUrl, generalI2VServerProgressTaskOutput.videoUrl) && this.videoUrlType == generalI2VServerProgressTaskOutput.videoUrlType && Intrinsics.LJFF(this.videoUrlList, generalI2VServerProgressTaskOutput.videoUrlList) && Intrinsics.LJFF(this.extra, generalI2VServerProgressTaskOutput.extra);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31;
        String str = this.LIZLLL;
        return ((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.failReasonMsg.hashCode()) * 31) + this.videoUrl.hashCode()) * 31) + this.videoUrlType.hashCode()) * 31) + this.videoUrlList.hashCode()) * 31) + this.extra.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GeneralI2VServerProgressTaskOutput(status=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", errorSource=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", failReasonMsg=");
        sbLIZ.append(this.failReasonMsg);
        sbLIZ.append(", videoUrl=");
        sbLIZ.append(this.videoUrl);
        sbLIZ.append(", videoUrlType=");
        sbLIZ.append(this.videoUrlType);
        sbLIZ.append(", videoUrlList=");
        sbLIZ.append(this.videoUrlList);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.extra);
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
    public final String LIZLLL() {
        return this.failReasonMsg;
    }

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput
    public final String LJ() {
        return this.LIZ;
    }

    public GeneralI2VServerProgressTaskOutput(String str, int i, String str2, String str3, String str4, String str5, AIGCResultType aIGCResultType, List<AIGCServerTaskOutput> list, String str6) {
        super(str, i, str2, null, "");
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.failReasonMsg = str4;
        this.videoUrl = str5;
        this.videoUrlType = aIGCResultType;
        this.videoUrlList = list;
        this.extra = str6;
    }

    public GeneralI2VServerProgressTaskOutput(String str, int i, String str2, String str3, String str4, String str5, AIGCResultType aIGCResultType, List list, String str6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? "" : str5, (i2 & 64) != 0 ? AIGCResultType.VIDEO : aIGCResultType, (i2 & 128) != 0 ? C13BV.INSTANCE : list, (i2 & 256) == 0 ? str6 : "");
    }
}
