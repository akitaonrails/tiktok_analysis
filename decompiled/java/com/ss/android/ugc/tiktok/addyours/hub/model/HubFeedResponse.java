package com.ss.android.ugc.tiktok.addyours.hub.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.tiktok.addyours.model.AddYoursPagination;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class HubFeedResponse extends BaseResponse {

    @C09CT("has_more")
    public final Boolean hasMore;

    @C09CT("pagination")
    public final AddYoursPagination pagination;

    @C09CT("shared_count")
    public final Long sharedCount;

    @C09CT("topic_list")
    public final List<AddYoursTopic> topicList;

    @C09CT("unfinished_count")
    public final Long unFinishedCount;

    @C09CT("viewed_user")
    public final User viewedUser;

    public HubFeedResponse() {
        this(null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HubFeedResponse)) {
            return false;
        }
        HubFeedResponse hubFeedResponse = (HubFeedResponse) obj;
        return Intrinsics.LJFF(this.topicList, hubFeedResponse.topicList) && Intrinsics.LJFF(this.hasMore, hubFeedResponse.hasMore) && Intrinsics.LJFF(this.pagination, hubFeedResponse.pagination) && Intrinsics.LJFF(this.sharedCount, hubFeedResponse.sharedCount) && Intrinsics.LJFF(this.unFinishedCount, hubFeedResponse.unFinishedCount) && Intrinsics.LJFF(this.viewedUser, hubFeedResponse.viewedUser);
    }

    public final int hashCode() {
        List<AddYoursTopic> list = this.topicList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.hasMore;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        AddYoursPagination addYoursPagination = this.pagination;
        int iHashCode3 = (iHashCode2 + (addYoursPagination == null ? 0 : addYoursPagination.hashCode())) * 31;
        Long l = this.sharedCount;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.unFinishedCount;
        int iHashCode5 = (iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        User user = this.viewedUser;
        return iHashCode5 + (user != null ? user.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HubFeedResponse(topicList=");
        sbLIZ.append(this.topicList);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(", pagination=");
        sbLIZ.append(this.pagination);
        sbLIZ.append(", sharedCount=");
        sbLIZ.append(this.sharedCount);
        sbLIZ.append(", unFinishedCount=");
        sbLIZ.append(this.unFinishedCount);
        sbLIZ.append(", viewedUser=");
        sbLIZ.append(this.viewedUser);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public HubFeedResponse(List<AddYoursTopic> list, Boolean bool, AddYoursPagination addYoursPagination, Long l, Long l2, User user) {
        this.topicList = list;
        this.hasMore = bool;
        this.pagination = addYoursPagination;
        this.sharedCount = l;
        this.unFinishedCount = l2;
        this.viewedUser = user;
    }
}
