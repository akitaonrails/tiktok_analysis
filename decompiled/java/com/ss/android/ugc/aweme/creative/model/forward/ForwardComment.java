package com.ss.android.ugc.aweme.creative.model.forward;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public final class ForwardComment implements Serializable {

    @C09CT("comment_author_id")
    public final String commentAuthorId;

    @C09CT("original_comment_id")
    public final String commentId;

    @C09CT("is_comment_post_video")
    public final boolean isCommentPostVideo;

    @C09CT("original_video_item_id")
    public final String originAwemeId;

    @C09CT("original_item_author_id")
    public final String originVideoAuthorId;

    public ForwardComment() {
        this("", "", "", "", true);
    }

    public final String getCommentAuthorId() {
        return this.commentAuthorId;
    }

    public final String getCommentId() {
        return this.commentId;
    }

    public final String getOriginAwemeId() {
        return this.originAwemeId;
    }

    public final String getOriginVideoAuthorId() {
        return this.originVideoAuthorId;
    }

    public final boolean isCommentPostVideo() {
        return this.isCommentPostVideo;
    }

    public ForwardComment(String str, String str2, String str3, String str4, boolean z) {
        this.commentId = str;
        this.commentAuthorId = str2;
        this.originAwemeId = str3;
        this.originVideoAuthorId = str4;
        this.isCommentPostVideo = z;
    }
}
