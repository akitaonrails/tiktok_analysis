package com.ss.android.ugc.gamora.editor.sticker.donation.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class OrganizationResponse extends BaseResponse {

    @C09CT("cursor")
    public final int cursor;

    @C09CT("has_more")
    public final int hasMore;

    @C09CT("donation_text")
    public final MatchDonationText matchDonationText;

    @C09CT("organizations")
    public final List<OrganizationModel> orgList;

    @C09CT("powered_by")
    public final String poweredBy;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrganizationResponse)) {
            return false;
        }
        OrganizationResponse organizationResponse = (OrganizationResponse) obj;
        return this.cursor == organizationResponse.cursor && this.hasMore == organizationResponse.hasMore && Intrinsics.LJFF(this.poweredBy, organizationResponse.poweredBy) && Intrinsics.LJFF(this.matchDonationText, organizationResponse.matchDonationText) && Intrinsics.LJFF(this.orgList, organizationResponse.orgList);
    }

    public final int hashCode() {
        int i = ((this.cursor * 31) + this.hasMore) * 31;
        String str = this.poweredBy;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        MatchDonationText matchDonationText = this.matchDonationText;
        int iHashCode2 = (iHashCode + (matchDonationText == null ? 0 : matchDonationText.hashCode())) * 31;
        List<OrganizationModel> list = this.orgList;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OrganizationResponse(cursor=");
        sbLIZ.append(this.cursor);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(", poweredBy=");
        sbLIZ.append(this.poweredBy);
        sbLIZ.append(", matchDonationText=");
        sbLIZ.append(this.matchDonationText);
        sbLIZ.append(", orgList=");
        sbLIZ.append(this.orgList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public OrganizationResponse(int i, int i2, String str, MatchDonationText matchDonationText, List<OrganizationModel> list) {
        this.cursor = i;
        this.hasMore = i2;
        this.poweredBy = str;
        this.matchDonationText = matchDonationText;
        this.orgList = list;
    }
}
