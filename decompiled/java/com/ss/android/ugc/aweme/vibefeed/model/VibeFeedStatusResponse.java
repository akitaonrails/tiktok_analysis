package com.ss.android.ugc.aweme.vibefeed.model;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.vibefeed.viewmodel.VibeFeedUser;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class VibeFeedStatusResponse extends BaseResponse {

    @C09CT("item_status_list")
    public final List<VibeItemStatus> itemStatusList;

    @C09CT("joined_feed_uids")
    public final List<String> joinedFeedUids;

    @C09CT("joined_feed_users")
    public final List<VibeFeedUser> joinedFeedUsers;

    @C09CT("visit_finished_uids")
    public final List<String> visitFinishedUids;

    @C09CT("visit_finished_users")
    public final List<VibeFeedUser> visitFinishedUsers;

    public VibeFeedStatusResponse() {
        this(null, null, null, null, null, 31, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VibeFeedStatusResponse)) {
            return false;
        }
        VibeFeedStatusResponse vibeFeedStatusResponse = (VibeFeedStatusResponse) obj;
        return Intrinsics.LJFF(this.itemStatusList, vibeFeedStatusResponse.itemStatusList) && Intrinsics.LJFF(this.visitFinishedUids, vibeFeedStatusResponse.visitFinishedUids) && Intrinsics.LJFF(this.visitFinishedUsers, vibeFeedStatusResponse.visitFinishedUsers) && Intrinsics.LJFF(this.joinedFeedUsers, vibeFeedStatusResponse.joinedFeedUsers) && Intrinsics.LJFF(this.joinedFeedUids, vibeFeedStatusResponse.joinedFeedUids);
    }

    public final int hashCode() {
        List<VibeItemStatus> list = this.itemStatusList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.visitFinishedUids;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<VibeFeedUser> list3 = this.visitFinishedUsers;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<VibeFeedUser> list4 = this.joinedFeedUsers;
        int iHashCode4 = (iHashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<String> list5 = this.joinedFeedUids;
        return iHashCode4 + (list5 != null ? list5.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VibeFeedStatusResponse(itemStatusList=");
        sbLIZ.append(this.itemStatusList);
        sbLIZ.append(", visitFinishedUids=");
        sbLIZ.append(this.visitFinishedUids);
        sbLIZ.append(", visitFinishedUsers=");
        sbLIZ.append(this.visitFinishedUsers);
        sbLIZ.append(", joinedFeedUsers=");
        sbLIZ.append(this.joinedFeedUsers);
        sbLIZ.append(", joinedFeedUids=");
        sbLIZ.append(this.joinedFeedUids);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VibeFeedStatusResponse(List<VibeItemStatus> list, List<String> list2, List<VibeFeedUser> list3, List<VibeFeedUser> list4, List<String> list5) {
        this.itemStatusList = list;
        this.visitFinishedUids = list2;
        this.visitFinishedUsers = list3;
        this.joinedFeedUsers = list4;
        this.joinedFeedUids = list5;
    }

    public VibeFeedStatusResponse(List list, List list2, List list3, List list4, List list5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2, (i & 4) != 0 ? C13BV.INSTANCE : list3, (i & 8) != 0 ? C13BV.INSTANCE : list4, (i & 16) != 0 ? C13BV.INSTANCE : list5);
    }
}
