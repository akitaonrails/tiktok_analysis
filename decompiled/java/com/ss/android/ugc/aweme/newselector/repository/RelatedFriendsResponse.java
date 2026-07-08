package com.ss.android.ugc.aweme.newselector.repository;

import X.C09CT;
import X.C2097608Jq;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class RelatedFriendsResponse extends BaseResponse {

    @C09CT("related_user_infos")
    public final List<RelatedFriendStruct> relatedFriends;

    @C09CT("related_user_lists")
    public final Map<Long, RelatedUserList> relatedUserListMap;

    public RelatedFriendsResponse() {
        this(null, C2097608Jq.LJ());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RelatedFriendsResponse)) {
            return false;
        }
        RelatedFriendsResponse relatedFriendsResponse = (RelatedFriendsResponse) obj;
        return Intrinsics.LJFF(this.relatedFriends, relatedFriendsResponse.relatedFriends) && Intrinsics.LJFF(this.relatedUserListMap, relatedFriendsResponse.relatedUserListMap);
    }

    public final int hashCode() {
        List<RelatedFriendStruct> list = this.relatedFriends;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Map<Long, RelatedUserList> map = this.relatedUserListMap;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RelatedFriendsResponse(relatedFriends=");
        sbLIZ.append(this.relatedFriends);
        sbLIZ.append(", relatedUserListMap=");
        sbLIZ.append(this.relatedUserListMap);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RelatedFriendsResponse(List<RelatedFriendStruct> list, Map<Long, RelatedUserList> map) {
        this.relatedFriends = list;
        this.relatedUserListMap = map;
    }
}
