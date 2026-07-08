package com.ss.android.ugc.aweme.compliance.api.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class DonationSessionRequest {

    @C09CT("fundraiser_id")
    public final String fundraiserId;

    @C09CT("item_id_str")
    public final String itemIdStr;

    @C09CT("item_type")
    public final int itemType;

    @C09CT("organization_id")
    public final String organizationId;

    @C09CT("sec_uid")
    public final String secUid;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DonationSessionRequest)) {
            return false;
        }
        DonationSessionRequest donationSessionRequest = (DonationSessionRequest) obj;
        return Intrinsics.LJFF(this.itemIdStr, donationSessionRequest.itemIdStr) && this.itemType == donationSessionRequest.itemType && Intrinsics.LJFF(this.secUid, donationSessionRequest.secUid) && Intrinsics.LJFF(this.organizationId, donationSessionRequest.organizationId) && Intrinsics.LJFF(this.fundraiserId, donationSessionRequest.fundraiserId);
    }

    public final int hashCode() {
        return (((((((this.itemIdStr.hashCode() * 31) + this.itemType) * 31) + this.secUid.hashCode()) * 31) + this.organizationId.hashCode()) * 31) + this.fundraiserId.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DonationSessionRequest(itemIdStr=");
        sbLIZ.append(this.itemIdStr);
        sbLIZ.append(", itemType=");
        sbLIZ.append(this.itemType);
        sbLIZ.append(", secUid=");
        sbLIZ.append(this.secUid);
        sbLIZ.append(", organizationId=");
        sbLIZ.append(this.organizationId);
        sbLIZ.append(", fundraiserId=");
        sbLIZ.append(this.fundraiserId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DonationSessionRequest() {
        this("", 0, "", "", "");
    }

    public DonationSessionRequest(String str, int i, String str2, String str3, String str4) {
        this.itemIdStr = str;
        this.itemType = i;
        this.secUid = str2;
        this.organizationId = str3;
        this.fundraiserId = str4;
    }
}
