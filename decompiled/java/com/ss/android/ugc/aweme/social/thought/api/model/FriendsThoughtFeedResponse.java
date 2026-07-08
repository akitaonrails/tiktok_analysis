package com.ss.android.ugc.aweme.social.thought.api.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class FriendsThoughtFeedResponse extends BaseResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("entry_avatars")
    public final List<User> entryAvatars;

    @C09CT("feed_items")
    public final List<ThoughtAggregatedModel> feedItems;

    @C09CT("has_more")
    public final Boolean hasMore;

    @C09CT("next_page_token")
    public final String nextPageToken;

    public FriendsThoughtFeedResponse() {
        this(null, null, null, null);
    }

    public final FriendsThoughtFeedResponse copy(List<ThoughtAggregatedModel> list, String str, Boolean bool, List<? extends User> list2) {
        return new FriendsThoughtFeedResponse(list, str, bool, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsThoughtFeedResponse)) {
            return false;
        }
        FriendsThoughtFeedResponse friendsThoughtFeedResponse = (FriendsThoughtFeedResponse) obj;
        return Intrinsics.LJFF(this.feedItems, friendsThoughtFeedResponse.feedItems) && Intrinsics.LJFF(this.nextPageToken, friendsThoughtFeedResponse.nextPageToken) && Intrinsics.LJFF(this.hasMore, friendsThoughtFeedResponse.hasMore) && Intrinsics.LJFF(this.entryAvatars, friendsThoughtFeedResponse.entryAvatars);
    }

    public int hashCode() {
        List<ThoughtAggregatedModel> list = this.feedItems;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.nextPageToken;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.hasMore;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<User> list2 = this.entryAvatars;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FriendsThoughtFeedResponse(feedItems=");
        sbLIZ.append(this.feedItems);
        sbLIZ.append(", nextPageToken=");
        sbLIZ.append(this.nextPageToken);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(", entryAvatars=");
        sbLIZ.append(this.entryAvatars);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<User> getEntryAvatars() {
        return this.entryAvatars;
    }

    public final List<ThoughtAggregatedModel> getFeedItems() {
        return this.feedItems;
    }

    public final Boolean getHasMore() {
        return this.hasMore;
    }

    public final String getNextPageToken() {
        return this.nextPageToken;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FriendsThoughtFeedResponse(List<ThoughtAggregatedModel> list, String str, Boolean bool, List<? extends User> list2) {
        this.feedItems = list;
        this.nextPageToken = str;
        this.hasMore = bool;
        this.entryAvatars = list2;
    }
}
