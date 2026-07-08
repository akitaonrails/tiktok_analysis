package webcast.api.pgc_sub;

import X.C09CT;

/* JADX INFO: loaded from: classes8.dex */
public final class PGCCommentActionRequest {

    @C09CT("comment_action_type")
    public int commentActionType;

    @C09CT("comment_id")
    public long commentId;

    @C09CT("comment_type")
    public int commentType;

    @C09CT("post_id")
    public long postId;

    @C09CT("sec_anchor_id")
    public String secAnchorId = "";

    @C09CT("sec_comment_user_id")
    public String secCommentUserId = "";
}
