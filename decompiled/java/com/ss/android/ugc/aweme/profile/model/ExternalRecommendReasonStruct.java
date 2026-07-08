package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ExternalRecommendReasonStruct implements Serializable {
    public String cacheReason;

    @C09CT("external_username")
    public String externalUsername;

    @C09CT("hashed_phone_number")
    public String hashedPhoneNumber;

    @C09CT("reason")
    public String reason;

    @C09CT("reason_starling")
    public String reasonStarling;

    public ExternalRecommendReasonStruct() {
        this(null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExternalRecommendReasonStruct)) {
            return false;
        }
        ExternalRecommendReasonStruct externalRecommendReasonStruct = (ExternalRecommendReasonStruct) obj;
        return Intrinsics.LJFF(this.reason, externalRecommendReasonStruct.reason) && Intrinsics.LJFF(this.hashedPhoneNumber, externalRecommendReasonStruct.hashedPhoneNumber) && Intrinsics.LJFF(this.externalUsername, externalRecommendReasonStruct.externalUsername) && Intrinsics.LJFF(this.reasonStarling, externalRecommendReasonStruct.reasonStarling) && Intrinsics.LJFF(this.cacheReason, externalRecommendReasonStruct.cacheReason);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExternalRecommendReasonStruct(reason=");
        sbLIZ.append(this.reason);
        sbLIZ.append(", hashedPhoneNumber=");
        sbLIZ.append(this.hashedPhoneNumber);
        sbLIZ.append(", externalUsername=");
        sbLIZ.append(this.externalUsername);
        sbLIZ.append(", reasonStarling=");
        sbLIZ.append(this.reasonStarling);
        sbLIZ.append(", cacheReason=");
        sbLIZ.append(this.cacheReason);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isValid() {
        String str;
        String str2 = this.hashedPhoneNumber;
        return ((str2 == null || str2.length() == 0) && ((str = this.externalUsername) == null || str.length() == 0)) ? false : true;
    }

    public final void setCacheReason(String str) {
        this.cacheReason = str;
    }

    public final void setExternalUsername(String str) {
        this.externalUsername = str;
    }

    public final void setHashedPhoneNumber(String str) {
        this.hashedPhoneNumber = str;
    }

    public final void setReason(String str) {
        this.reason = str;
    }

    public final void setReasonStarling(String str) {
        this.reasonStarling = str;
    }

    public ExternalRecommendReasonStruct(String str, String str2, String str3, String str4, String str5) {
        this.reason = str;
        this.hashedPhoneNumber = str2;
        this.externalUsername = str3;
        this.reasonStarling = str4;
        this.cacheReason = str5;
    }
}
