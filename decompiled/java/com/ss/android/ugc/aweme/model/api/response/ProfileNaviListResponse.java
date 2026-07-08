package com.ss.android.ugc.aweme.model.api.response;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.model.api.data.ProfileNaviDataModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ProfileNaviListResponse extends BaseResponse {

    @C09CT("has_more")
    public final int hasMore;

    @C09CT("total")
    public final Long naviCount;

    @C09CT("navis")
    public final List<ProfileNaviDataModel> naviList;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileNaviListResponse)) {
            return false;
        }
        ProfileNaviListResponse profileNaviListResponse = (ProfileNaviListResponse) obj;
        return Intrinsics.LJFF(this.naviCount, profileNaviListResponse.naviCount) && this.hasMore == profileNaviListResponse.hasMore && Intrinsics.LJFF(this.naviList, profileNaviListResponse.naviList);
    }

    public final int hashCode() {
        Long l = this.naviCount;
        int iHashCode = (((l == null ? 0 : l.hashCode()) * 31) + this.hasMore) * 31;
        List<ProfileNaviDataModel> list = this.naviList;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProfileNaviListResponse(naviCount=");
        sbLIZ.append(this.naviCount);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(", naviList=");
        sbLIZ.append(this.naviList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ProfileNaviListResponse(Long l, int i, List<ProfileNaviDataModel> list) {
        this.naviCount = l;
        this.hasMore = i;
        this.naviList = list;
    }
}
