package com.ss.android.ugc.aweme.follow.presenter;

import X.C09CT;
import X.C0PLT;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.ss.android.ugc.aweme.follow.LastViewData;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public class FollowFeed extends C0PLT {

    @C09CT("aweme")
    public Aweme aweme;
    public long blockFavoriteTime;

    @C09CT("comment_list")
    public List<Comment> commentList;
    public List<String> favoriteIds;

    @C09CT("favorite_list")
    public List<Aweme> favorites;

    @C09CT("feed_type")
    public int feedType;
    public boolean isFromPreload;
    public LastViewData lastViewData;

    @C09CT("count")
    public int likeCount;

    @C09CT("like_list")
    public List<User> likeList;
    public boolean mIsMomentStyle;
    public User mRecommendUser;

    @C09CT("recommend_reason")
    public String recommendReason;

    @C09CT("cell_room")
    public RoomFeedCellStruct roomStruct;

    @C09CT("score")
    public double score;

    @C09CT("source")
    public int source;

    @C09CT("user")
    public List<User> user;

    @Override // X.C0PLT
    public boolean needUpdateComment() {
        return true;
    }

    @Override // X.C0PLT
    public List<Comment> getCommentList() {
        Aweme aweme;
        if (this.commentList == null || (aweme = this.aweme) == null || !aweme.getAwemeControl().canShowComment()) {
            this.commentList = new ArrayList();
        }
        return this.commentList;
    }

    @Override // X.C0PLT
    public int getFeedType() {
        int i = this.feedType;
        if (i == -1) {
            return 65288;
        }
        if (i == 1) {
            return 65280;
        }
        if (i == 2) {
            return 65281;
        }
        if (i != 3) {
            return i;
        }
        return 65298;
    }

    public FollowFeed() {
    }

    @Override // X.C0PLT
    public Aweme getAweme() {
        return this.aweme;
    }

    public long getBlockFavoriteTime() {
        return this.blockFavoriteTime;
    }

    public List<String> getFavoriteIds() {
        return this.favoriteIds;
    }

    public List<Aweme> getFavorites() {
        return this.favorites;
    }

    public LastViewData getLastViewData() {
        return this.lastViewData;
    }

    public int getLikeCount() {
        return this.likeCount;
    }

    @Override // X.C0PLT
    public List<User> getLikeList() {
        return this.likeList;
    }

    public String getRecommendReason() {
        return this.recommendReason;
    }

    public User getRecommendUser() {
        return this.mRecommendUser;
    }

    public RoomFeedCellStruct getRoomStruct() {
        return this.roomStruct;
    }

    public double getScore() {
        return this.score;
    }

    public int getSource() {
        return this.source;
    }

    public List<User> getUser() {
        return this.user;
    }

    public boolean isFromPreload() {
        return this.isFromPreload;
    }

    public boolean isMomentStyle() {
        return this.mIsMomentStyle;
    }

    public FollowFeed(Aweme aweme) {
        this.feedType = 65280;
        this.aweme = aweme;
        this.commentList = new ArrayList();
    }

    public static FollowFeed createLastWatchHistoryItem(LastViewData lastViewData) {
        FollowFeed followFeed = new FollowFeed();
        followFeed.setFeedType(65297);
        followFeed.setLastViewData(lastViewData);
        return followFeed;
    }

    @Override // X.C0PLT
    public void setAweme(Aweme aweme) {
        this.aweme = aweme;
    }

    public void setBlockFavoriteTime(long j) {
        this.blockFavoriteTime = j;
    }

    @Override // X.C0PLT
    public void setCommentList(List<Comment> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.commentList = list;
    }

    public void setFavoriteIds(List<String> list) {
        this.favoriteIds = list;
    }

    public void setFavorites(List<Aweme> list) {
        this.favorites = list;
    }

    @Override // X.C0PLT
    public void setFeedType(int i) {
        this.feedType = i;
    }

    public void setFromPreload(boolean z) {
        this.isFromPreload = z;
    }

    public void setIsMomentStyle(boolean z) {
        this.mIsMomentStyle = z;
    }

    public void setLastViewData(LastViewData lastViewData) {
        this.lastViewData = lastViewData;
    }

    public void setLikeCount(int i) {
        this.likeCount = i;
    }

    public void setLikeList(List<User> list) {
        this.likeList = list;
    }

    public void setRecommendReason(String str) {
        this.recommendReason = str;
    }

    public void setRecommendUser(User user) {
        this.mRecommendUser = user;
    }

    @Override // X.C0PLT, X.C0X12
    public void setRequestId(String str) {
        super.setRequestId(str);
        Aweme aweme = this.aweme;
        if (aweme != null) {
            aweme.setRequestId(str);
        }
    }

    public void setRoomStruct(RoomFeedCellStruct roomFeedCellStruct) {
        this.roomStruct = roomFeedCellStruct;
    }

    public void setScore(double d) {
        this.score = d;
    }

    public void setSource(int i) {
        this.source = i;
    }

    public void setUser(List<User> list) {
        this.user = list;
    }
}
