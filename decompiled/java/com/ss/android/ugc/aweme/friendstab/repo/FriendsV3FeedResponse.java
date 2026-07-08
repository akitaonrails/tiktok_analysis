package com.ss.android.ugc.aweme.friendstab.repo;

import X.C09CT;
import X.EnumC1586890rOh;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsV3FeedResponse extends BaseResponse {

    @C09CT("feed_page_token")
    public final String feedPageToken;

    @C09CT("feed_page_token_up")
    public final String feedPageTokenUp;

    @C09CT("friend_feed_data")
    public final List<FriendsV3FeedModel> friendsV3Feeds;

    @C09CT("has_more")
    public final Boolean hasMore;

    @C09CT("has_more_up")
    public final Boolean hasMoreUp;

    @C09CT("landing_info")
    public final LandingInfo landingInfo;

    @C09CT("last_view_item_id")
    public final String lastViewedItemId;

    @C09CT("log_pb")
    public LogPbBean logPb;

    @C09CT("newly_shown_maf_ids")
    public final List<String> newlyShownMafIds;

    @C09CT("order_type")
    public final int orderType;

    @C09CT("source")
    public final int source;

    public FriendsV3FeedResponse() {
        this(null, Boolean.FALSE, null, Boolean.FALSE, null, null, null, null, EnumC1586890rOh.UNKNOWN.getDataLevel(), 0, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsV3FeedResponse)) {
            return false;
        }
        FriendsV3FeedResponse friendsV3FeedResponse = (FriendsV3FeedResponse) obj;
        return Intrinsics.LJFF(this.friendsV3Feeds, friendsV3FeedResponse.friendsV3Feeds) && Intrinsics.LJFF(this.hasMore, friendsV3FeedResponse.hasMore) && Intrinsics.LJFF(this.feedPageToken, friendsV3FeedResponse.feedPageToken) && Intrinsics.LJFF(this.hasMoreUp, friendsV3FeedResponse.hasMoreUp) && Intrinsics.LJFF(this.feedPageTokenUp, friendsV3FeedResponse.feedPageTokenUp) && Intrinsics.LJFF(this.lastViewedItemId, friendsV3FeedResponse.lastViewedItemId) && Intrinsics.LJFF(this.landingInfo, friendsV3FeedResponse.landingInfo) && Intrinsics.LJFF(this.newlyShownMafIds, friendsV3FeedResponse.newlyShownMafIds) && this.source == friendsV3FeedResponse.source && this.orderType == friendsV3FeedResponse.orderType && Intrinsics.LJFF(this.logPb, friendsV3FeedResponse.logPb);
    }

    public final int hashCode() {
        List<FriendsV3FeedModel> list = this.friendsV3Feeds;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.hasMore;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.feedPageToken;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool2 = this.hasMoreUp;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.feedPageTokenUp;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lastViewedItemId;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        LandingInfo landingInfo = this.landingInfo;
        int iHashCode7 = (iHashCode6 + (landingInfo == null ? 0 : landingInfo.hashCode())) * 31;
        List<String> list2 = this.newlyShownMafIds;
        int iHashCode8 = (((((iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31) + this.source) * 31) + this.orderType) * 31;
        LogPbBean logPbBean = this.logPb;
        return iHashCode8 + (logPbBean != null ? logPbBean.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "FriendsV3FeedResponse(friendsV3Feeds=" + this.friendsV3Feeds + ", hasMore=" + this.hasMore + ", feedPageToken=" + this.feedPageToken + ", hasMoreUp=" + this.hasMoreUp + ", feedPageTokenUp=" + this.feedPageTokenUp + ", lastViewedItemId=" + this.lastViewedItemId + ", landingInfo=" + this.landingInfo + ", newlyShownMafIds=" + this.newlyShownMafIds + ", source=" + this.source + ", orderType=" + this.orderType + ", logPb=" + this.logPb + ')';
    }

    public static FriendsV3FeedResponse LJ(FriendsV3FeedResponse friendsV3FeedResponse, List list) {
        Boolean bool = friendsV3FeedResponse.hasMore;
        String str = friendsV3FeedResponse.feedPageToken;
        Boolean bool2 = friendsV3FeedResponse.hasMoreUp;
        String str2 = friendsV3FeedResponse.feedPageTokenUp;
        String str3 = friendsV3FeedResponse.lastViewedItemId;
        LandingInfo landingInfo = friendsV3FeedResponse.landingInfo;
        List<String> list2 = friendsV3FeedResponse.newlyShownMafIds;
        int i = friendsV3FeedResponse.source;
        int i2 = friendsV3FeedResponse.orderType;
        LogPbBean logPbBean = friendsV3FeedResponse.logPb;
        friendsV3FeedResponse.getClass();
        return new FriendsV3FeedResponse(list, bool, str, bool2, str2, str3, landingInfo, list2, i, i2, logPbBean);
    }

    public FriendsV3FeedResponse(List<FriendsV3FeedModel> list, Boolean bool, String str, Boolean bool2, String str2, String str3, LandingInfo landingInfo, List<String> list2, int i, int i2, LogPbBean logPbBean) {
        this.friendsV3Feeds = list;
        this.hasMore = bool;
        this.feedPageToken = str;
        this.hasMoreUp = bool2;
        this.feedPageTokenUp = str2;
        this.lastViewedItemId = str3;
        this.landingInfo = landingInfo;
        this.newlyShownMafIds = list2;
        this.source = i;
        this.orderType = i2;
        this.logPb = logPbBean;
    }
}
