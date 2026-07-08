package com.ss.android.ugc.gamora.editor.sticker.donation.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class OrganizationSearchResultResponse extends BaseResponse {

    @C09CT("cursor")
    public final Integer cursor;

    @C09CT("has_more")
    public final Boolean hasMore;

    @C09CT("ngos")
    public final List<OrganizationSearchResultModel> orgList;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrganizationSearchResultResponse)) {
            return false;
        }
        OrganizationSearchResultResponse organizationSearchResultResponse = (OrganizationSearchResultResponse) obj;
        return Intrinsics.LJFF(this.cursor, organizationSearchResultResponse.cursor) && Intrinsics.LJFF(this.hasMore, organizationSearchResultResponse.hasMore) && Intrinsics.LJFF(this.orgList, organizationSearchResultResponse.orgList);
    }

    public final int hashCode() {
        Integer num = this.cursor;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.hasMore;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        List<OrganizationSearchResultModel> list = this.orgList;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OrganizationSearchResultResponse(cursor=");
        sbLIZ.append(this.cursor);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(", orgList=");
        sbLIZ.append(this.orgList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public OrganizationSearchResultResponse(Integer num, Boolean bool, List<OrganizationSearchResultModel> list) {
        this.cursor = num;
        this.hasMore = bool;
        this.orgList = list;
    }
}
