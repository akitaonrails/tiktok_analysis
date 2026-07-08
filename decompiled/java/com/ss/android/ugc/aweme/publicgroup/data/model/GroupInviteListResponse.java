package com.ss.android.ugc.aweme.publicgroup.data.model;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class GroupInviteListResponse extends BaseResponse {

    @C09CT("invitation_candidates")
    public final List<InvitationUserInfo> candidates;

    @C09CT("cells")
    public final List<InvitationListCell> cells;

    @C09CT("has_more")
    public final Boolean hasMore;

    @C09CT("next_cursor")
    public final Integer nextCursor;

    public GroupInviteListResponse() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupInviteListResponse)) {
            return false;
        }
        GroupInviteListResponse groupInviteListResponse = (GroupInviteListResponse) obj;
        return Intrinsics.LJFF(this.candidates, groupInviteListResponse.candidates) && Intrinsics.LJFF(this.hasMore, groupInviteListResponse.hasMore) && Intrinsics.LJFF(this.nextCursor, groupInviteListResponse.nextCursor) && Intrinsics.LJFF(this.cells, groupInviteListResponse.cells);
    }

    public final int hashCode() {
        List<InvitationUserInfo> list = this.candidates;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.hasMore;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.nextCursor;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        List<InvitationListCell> list2 = this.cells;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GroupInviteListResponse(candidates=");
        sbLIZ.append(this.candidates);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(", nextCursor=");
        sbLIZ.append(this.nextCursor);
        sbLIZ.append(", cells=");
        sbLIZ.append(this.cells);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public GroupInviteListResponse(List<InvitationUserInfo> list, Boolean bool, Integer num, List<InvitationListCell> list2) {
        this.candidates = list;
        this.hasMore = bool;
        this.nextCursor = num;
        this.cells = list2;
    }

    public GroupInviteListResponse(List list, Boolean bool, Integer num, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? Boolean.FALSE : bool, (i & 4) != 0 ? 0 : num, (i & 8) != 0 ? C13BV.INSTANCE : list2);
    }
}
