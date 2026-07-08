package com.ss.android.ugc.aweme.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class MidInsertRequest {

    @C09CT("aweme_id")
    public final String awemeId;

    @C09CT("aweme_type")
    public final Integer awemeType;

    @C09CT("card_type")
    public final String cardType;

    @C09CT("is_ad")
    public final Boolean isAd;

    @C09CT("request_type")
    public final String requestType;

    public MidInsertRequest() {
        this("", null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MidInsertRequest)) {
            return false;
        }
        MidInsertRequest midInsertRequest = (MidInsertRequest) obj;
        return Intrinsics.LJFF(this.awemeId, midInsertRequest.awemeId) && Intrinsics.LJFF(this.isAd, midInsertRequest.isAd) && Intrinsics.LJFF(this.awemeType, midInsertRequest.awemeType) && Intrinsics.LJFF(this.cardType, midInsertRequest.cardType) && Intrinsics.LJFF(this.requestType, midInsertRequest.requestType);
    }

    public final int hashCode() {
        String str = this.awemeId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.isAd;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.awemeType;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.cardType;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.requestType;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MidInsertRequest(awemeId=");
        sbLIZ.append(this.awemeId);
        sbLIZ.append(", isAd=");
        sbLIZ.append(this.isAd);
        sbLIZ.append(", awemeType=");
        sbLIZ.append(this.awemeType);
        sbLIZ.append(", cardType=");
        sbLIZ.append(this.cardType);
        sbLIZ.append(", requestType=");
        sbLIZ.append(this.requestType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MidInsertRequest(String str, Boolean bool, Integer num, String str2, String str3) {
        this.awemeId = str;
        this.isAd = bool;
        this.awemeType = num;
        this.cardType = str2;
        this.requestType = str3;
    }
}
