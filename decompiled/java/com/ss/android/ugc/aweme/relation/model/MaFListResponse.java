package com.ss.android.ugc.aweme.relation.model;

import X.C09CT;
import X.C1261860iwS;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1294060jmO;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.following.model.AliasPermissionUserData;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class MaFListResponse extends BaseResponse implements Serializable {

    @C09CT("alias_permissions")
    public final List<AliasPermissionUserData> aliasPermissions;

    @C09CT("user_list")
    public final List<User> depUserList;

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("log_pb")
    public final LogPbBean logPb;

    @C09CT("next_page_token")
    public final String nextPageToken;

    @C09CT("recommend_more_users")
    public final List<RecMorePairList> recMoreUserPairList;

    @C09CT("users")
    public final List<C1261860iwS> userList;

    public MaFListResponse() {
        this(null, null, null, false, null, null, null, 127, null);
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getDepUserList$annotations() {
    }

    public final MaFListResponse copy(List<? extends User> list, List<C1261860iwS> list2, String str, boolean z, LogPbBean logPbBean, List<RecMorePairList> list3, List<AliasPermissionUserData> list4) {
        return new MaFListResponse(list, list2, str, z, logPbBean, list3, list4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MaFListResponse)) {
            return false;
        }
        MaFListResponse maFListResponse = (MaFListResponse) obj;
        return Intrinsics.LJFF(this.depUserList, maFListResponse.depUserList) && Intrinsics.LJFF(this.userList, maFListResponse.userList) && Intrinsics.LJFF(this.nextPageToken, maFListResponse.nextPageToken) && this.hasMore == maFListResponse.hasMore && Intrinsics.LJFF(this.logPb, maFListResponse.logPb) && Intrinsics.LJFF(this.recMoreUserPairList, maFListResponse.recMoreUserPairList) && Intrinsics.LJFF(this.aliasPermissions, maFListResponse.aliasPermissions);
    }

    public int hashCode() {
        List<User> list = this.depUserList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<C1261860iwS> list2 = this.userList;
        int iHashCode2 = (((((iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31) + this.nextPageToken.hashCode()) * 31) + C786410Ut5.Z2(this.hasMore)) * 31;
        LogPbBean logPbBean = this.logPb;
        int iHashCode3 = (iHashCode2 + (logPbBean == null ? 0 : logPbBean.hashCode())) * 31;
        List<RecMorePairList> list3 = this.recMoreUserPairList;
        int iHashCode4 = (iHashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<AliasPermissionUserData> list4 = this.aliasPermissions;
        return iHashCode4 + (list4 != null ? list4.hashCode() : 0);
    }

    public final List<User> getUserListWithRid() {
        List<User> list = this.depUserList;
        if (list == null) {
            return null;
        }
        for (User user : list) {
            LogPbBean logPbBean = this.logPb;
            user.setRequestId(logPbBean != null ? logPbBean.getImprId() : null);
        }
        return list;
    }

    public final List<C1261860iwS> getUsers() {
        List<C1261860iwS> list = this.userList;
        return list == null ? C13BV.INSTANCE : list;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        String imprId;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MaFListResponse(base: ");
        sbLIZ.append(super.toString());
        sbLIZ.append(", users: ");
        sbLIZ.append(getUsers().size());
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
        sbLIZ.append(", aliasPermission size: ");
        List<AliasPermissionUserData> list = this.aliasPermissions;
        sbLIZ.append(list != null ? list.size() : 0);
        sbLIZ.append(", )");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<AliasPermissionUserData> getAliasPermissions() {
        return this.aliasPermissions;
    }

    public final List<User> getDepUserList() {
        return this.depUserList;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final String getNextPageToken() {
        return this.nextPageToken;
    }

    public final List<RecMorePairList> getRecMoreUserPairList() {
        return this.recMoreUserPairList;
    }

    public final List<C1261860iwS> getUserList() {
        return this.userList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MaFListResponse(List<? extends User> list, List<C1261860iwS> list2, String str, boolean z, LogPbBean logPbBean, List<RecMorePairList> list3, List<AliasPermissionUserData> list4) {
        this.depUserList = list;
        this.userList = list2;
        this.nextPageToken = str;
        this.hasMore = z;
        this.logPb = logPbBean;
        this.recMoreUserPairList = list3;
        this.aliasPermissions = list4;
    }

    public MaFListResponse(List list, List list2, String str, boolean z, LogPbBean logPbBean, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? C13BV.INSTANCE : list2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : logPbBean, (i & 32) != 0 ? null : list3, (i & 64) == 0 ? list4 : null);
    }
}
