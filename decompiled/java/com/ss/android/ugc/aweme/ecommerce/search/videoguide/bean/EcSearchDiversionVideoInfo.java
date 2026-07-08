package com.ss.android.ugc.aweme.ecommerce.search.videoguide.bean;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class EcSearchDiversionVideoInfo {

    @C09CT("author_uid")
    public final String authorUid;

    @C09CT("aweme_id")
    public final String awemeId;

    @C09CT("rec_score_info")
    public final String recScoreInfo;

    public EcSearchDiversionVideoInfo() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EcSearchDiversionVideoInfo)) {
            return false;
        }
        EcSearchDiversionVideoInfo ecSearchDiversionVideoInfo = (EcSearchDiversionVideoInfo) obj;
        return Intrinsics.LJFF(this.awemeId, ecSearchDiversionVideoInfo.awemeId) && Intrinsics.LJFF(this.authorUid, ecSearchDiversionVideoInfo.authorUid) && Intrinsics.LJFF(this.recScoreInfo, ecSearchDiversionVideoInfo.recScoreInfo);
    }

    public final int hashCode() {
        String str = this.awemeId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.authorUid;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.recScoreInfo;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EcSearchDiversionVideoInfo(awemeId=");
        sbLIZ.append(this.awemeId);
        sbLIZ.append(", authorUid=");
        sbLIZ.append(this.authorUid);
        sbLIZ.append(", recScoreInfo=");
        sbLIZ.append(this.recScoreInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public EcSearchDiversionVideoInfo(String str, String str2, String str3) {
        this.awemeId = str;
        this.authorUid = str2;
        this.recScoreInfo = str3;
    }
}
