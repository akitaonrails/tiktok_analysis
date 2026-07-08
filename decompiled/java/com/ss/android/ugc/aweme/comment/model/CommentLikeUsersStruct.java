package com.ss.android.ugc.aweme.comment.model;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class CommentLikeUsersStruct extends Comment {
    public Aweme aweme;
    public int dialogHeight;
    public String eventType = "";
    public List<? extends User> likeUsers;
    public long likeUsersCount;

    public final Aweme getAweme() {
        return this.aweme;
    }

    public final int getDialogHeight() {
        return this.dialogHeight;
    }

    public final String getEventType() {
        return this.eventType;
    }

    public final List<User> getLikeUsers() {
        return this.likeUsers;
    }

    public final long getLikeUsersCount() {
        return this.likeUsersCount;
    }

    public final void setAweme(Aweme aweme) {
        this.aweme = aweme;
    }

    public final void setDialogHeight(int i) {
        this.dialogHeight = i;
    }

    public final void setEventType(String str) {
        this.eventType = str;
    }

    public final void setLikeUsers(List<? extends User> list) {
        this.likeUsers = list;
    }

    public final void setLikeUsersCount(long j) {
        this.likeUsersCount = j;
    }
}
