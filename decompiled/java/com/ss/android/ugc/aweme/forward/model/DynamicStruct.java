package com.ss.android.ugc.aweme.forward.model;

import X.C09CT;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class DynamicStruct implements Serializable {

    @C09CT("aweme")
    public Aweme aweme;

    @C09CT("time")
    public long blockFavoriteTime;

    @C09CT("comment_list")
    public List<Comment> comments;

    @C09CT("favorite_ids")
    public List<String> favoriteIds;

    @C09CT("favorite_list")
    public List<Aweme> favorites;

    @C09CT("type")
    public int itemType;

    @C09CT("count")
    public int likeCount;

    public Aweme getAweme() {
        return this.aweme;
    }

    public long getBlockFavoriteTime() {
        return this.blockFavoriteTime;
    }

    public List<Comment> getComments() {
        return this.comments;
    }

    public List<String> getFavoriteIds() {
        return this.favoriteIds;
    }

    public List<Aweme> getFavorites() {
        return this.favorites;
    }

    public int getItemType() {
        return this.itemType;
    }

    public int getLikeCount() {
        return this.likeCount;
    }

    public void setAweme(Aweme aweme) {
        this.aweme = aweme;
    }

    public void setBlockFavoriteTime(long j) {
        this.blockFavoriteTime = j;
    }

    public void setComments(List<Comment> list) {
        this.comments = list;
    }

    public void setFavoriteIds(List<String> list) {
        this.favoriteIds = list;
    }

    public void setFavorites(List<Aweme> list) {
        this.favorites = list;
    }

    public void setItemType(int i) {
        this.itemType = i;
    }

    public void setLikeCount(int i) {
        this.likeCount = i;
    }

    public void setRequestId(String str) {
        Aweme aweme = this.aweme;
        if (aweme != null) {
            aweme.setRequestId(str);
        }
    }
}
