package com.ss.android.ugc.aweme.relation.model;

import X.C00I6;
import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.following.model.AliasPermissionUserData;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class FriendsListResponse extends BaseResponse {

    @C09CT("alias_permissions")
    public final List<AliasPermissionUserData> aliasPermissions;

    @C09CT("friends")
    public final List<C00I6> friends;

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("log_pb")
    public final LogPbBean logPb;

    @C09CT("next_page_token")
    public final String nextPageToken;

    public FriendsListResponse() {
        this(null, false, null, null, null, 31, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsListResponse)) {
            return false;
        }
        FriendsListResponse friendsListResponse = (FriendsListResponse) obj;
        return Intrinsics.LJFF(this.friends, friendsListResponse.friends) && this.hasMore == friendsListResponse.hasMore && Intrinsics.LJFF(this.nextPageToken, friendsListResponse.nextPageToken) && Intrinsics.LJFF(this.logPb, friendsListResponse.logPb) && Intrinsics.LJFF(this.aliasPermissions, friendsListResponse.aliasPermissions);
    }

    public final int hashCode() {
        int iHashCode = ((((this.friends.hashCode() * 31) + C786410Ut5.Z2(this.hasMore)) * 31) + this.nextPageToken.hashCode()) * 31;
        LogPbBean logPbBean = this.logPb;
        int iHashCode2 = (iHashCode + (logPbBean == null ? 0 : logPbBean.hashCode())) * 31;
        List<AliasPermissionUserData> list = this.aliasPermissions;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final List<C00I6> getUserList() {
        List<C00I6> list = this.friends;
        for (C00I6 c00i6 : list) {
            LogPbBean logPbBean = this.logPb;
            c00i6.setRequestId(logPbBean != null ? logPbBean.getImprId() : null);
        }
        return list;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        String imprId;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FriendsListResponse(message: ");
        sbLIZ.append(super.toString());
        sbLIZ.append(", user size: ");
        sbLIZ.append(getUserList().size());
        sbLIZ.append(", nextPageToken: ");
        sbLIZ.append(this.nextPageToken);
        sbLIZ.append(", hasMore: ");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(", logId: ");
        LogPbBean logPbBean = this.logPb;
        if (logPbBean == null || (imprId = logPbBean.getImprId()) == null) {
            imprId = "";
        }
        sbLIZ.append(imprId);
        sbLIZ.append(", alias permission size: ");
        List<AliasPermissionUserData> list = this.aliasPermissions;
        sbLIZ.append(list != null ? list.size() : 0);
        sbLIZ.append(", )");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FriendsListResponse(List<C00I6> list, boolean z, String str, LogPbBean logPbBean, List<AliasPermissionUserData> list2) {
        this.friends = list;
        this.hasMore = z;
        this.nextPageToken = str;
        this.logPb = logPbBean;
        this.aliasPermissions = list2;
    }

    public FriendsListResponse(List list, boolean z, String str, LogPbBean logPbBean, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? null : logPbBean, (i & 16) == 0 ? list2 : null);
    }
}
