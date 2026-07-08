package com.ss.android.ugc.profile.business.ur.school.datasource;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SchoolFriendsResponse extends BaseResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("next_page_token")
    public final String nextPageToken;

    @C09CT("total_count")
    public final Integer totalCount;

    @C09CT("users")
    public final List<User> userList;

    public SchoolFriendsResponse() {
        this(null, null, false, null, 15, null);
    }

    public final SchoolFriendsResponse copy(List<? extends User> list, String str, boolean z, Integer num) {
        return new SchoolFriendsResponse(list, str, z, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchoolFriendsResponse)) {
            return false;
        }
        SchoolFriendsResponse schoolFriendsResponse = (SchoolFriendsResponse) obj;
        return Intrinsics.LJFF(this.userList, schoolFriendsResponse.userList) && Intrinsics.LJFF(this.nextPageToken, schoolFriendsResponse.nextPageToken) && this.hasMore == schoolFriendsResponse.hasMore && Intrinsics.LJFF(this.totalCount, schoolFriendsResponse.totalCount);
    }

    public int hashCode() {
        List<User> list = this.userList;
        int iHashCode = (((((list == null ? 0 : list.hashCode()) * 31) + this.nextPageToken.hashCode()) * 31) + C786410Ut5.Z2(this.hasMore)) * 31;
        Integer num = this.totalCount;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SchoolFriendsResponse(userList=");
        sbLIZ.append(this.userList);
        sbLIZ.append(", nextPageToken=");
        sbLIZ.append(this.nextPageToken);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(", totalCount=");
        sbLIZ.append(this.totalCount);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final String getNextPageToken() {
        return this.nextPageToken;
    }

    public final Integer getTotalCount() {
        return this.totalCount;
    }

    public final List<User> getUserList() {
        return this.userList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SchoolFriendsResponse(List<? extends User> list, String str, boolean z, Integer num) {
        this.userList = list;
        this.nextPageToken = str;
        this.hasMore = z;
        this.totalCount = num;
    }

    public SchoolFriendsResponse(List list, String str, boolean z, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : num);
    }
}
