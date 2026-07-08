package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class VideoReplyStruct implements Serializable {

    @C09CT("alias_comment_id")
    public long aliasCommentId;

    @C09CT("aweme_id")
    public long awemeId;

    @C09CT("collect_stat")
    public Integer collectStat;

    @C09CT("comment_id")
    public long commentId;

    @C09CT("comment_msg")
    public String commentMsg;

    @C09CT("comment_user_id")
    public long commentUserId;

    @C09CT("user_avatar")
    public UrlModel userAvatar;

    @C09CT("user_name")
    public String userName;

    public VideoReplyStruct() {
        this(0L, 0L, 0L, "", "", 0L, null, null);
    }

    public final long getAliasCommentId() {
        return this.aliasCommentId;
    }

    public final long getAwemeId() {
        return this.awemeId;
    }

    public final Integer getCollectStat() {
        return this.collectStat;
    }

    public final long getCommentId() {
        return this.commentId;
    }

    public final String getCommentMsg() {
        return this.commentMsg;
    }

    public final long getCommentUserId() {
        return this.commentUserId;
    }

    public final UrlModel getUserAvatar() {
        return this.userAvatar;
    }

    public final String getUserName() {
        return this.userName;
    }

    public final void setCollectStat(Integer num) {
        this.collectStat = num;
    }

    public VideoReplyStruct(long j, long j2, long j3, String str, String str2, long j4, UrlModel urlModel, Integer num) {
        this.awemeId = j;
        this.commentId = j2;
        this.aliasCommentId = j3;
        this.userName = str;
        this.commentMsg = str2;
        this.commentUserId = j4;
        this.userAvatar = urlModel;
        this.collectStat = num;
    }
}
