package com.ss.android.ugc.aweme.friendstab.repo;

import X.C09CT;
import X.C2188811AlT;
import X.EnumC1586890rOh;
import com.ss.android.ugc.aweme.comment.model.CommentItemList;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsV3FeedModel {

    @C09CT("aweme")
    public final Aweme aweme;

    @C09CT("comment_data")
    public final CommentItemList commentData;

    @C09CT("feed_type")
    public final int feedType;

    @C09CT("repost")
    public final FriendsV3RepostModel repostItem;

    @C09CT("cell_room")
    public final RoomFeedCellStruct roomStruct;

    @C09CT("source")
    public final int source;

    public FriendsV3FeedModel() {
        this(null, null, null, null, -1, EnumC1586890rOh.UNKNOWN.getDataLevel());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FriendsV3FeedModel(aweme=");
        sbLIZ.append(this.aweme);
        sbLIZ.append(", roomStruct=");
        sbLIZ.append(this.roomStruct);
        sbLIZ.append(", repostItem=");
        sbLIZ.append(this.repostItem);
        sbLIZ.append(", commentData=");
        sbLIZ.append(this.commentData);
        sbLIZ.append(", feedType=");
        sbLIZ.append(this.feedType);
        sbLIZ.append(", source=");
        sbLIZ.append(this.source);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FriendsV3FeedModel(Aweme aweme, RoomFeedCellStruct roomFeedCellStruct, FriendsV3RepostModel friendsV3RepostModel, CommentItemList commentItemList, int i, int i2) {
        this.aweme = aweme;
        this.roomStruct = roomFeedCellStruct;
        this.repostItem = friendsV3RepostModel;
        this.commentData = commentItemList;
        this.feedType = i;
        this.source = i2;
    }
}
