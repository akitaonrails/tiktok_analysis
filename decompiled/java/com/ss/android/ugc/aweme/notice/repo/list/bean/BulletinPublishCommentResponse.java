package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentRethinkPopup;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinPublishCommentResponse implements Serializable {

    @C09CT("comment")
    public final Comment comment;

    @C09CT("error_code")
    public final Integer errorCode;

    @C09CT("prompts")
    public final String prompts;

    @C09CT("rethink_popup")
    public final CommentRethinkPopup rethinkPopup;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public BulletinPublishCommentResponse(Comment comment, CommentRethinkPopup commentRethinkPopup, Integer num, Integer num2, String str, String str2) {
        this.comment = comment;
        this.rethinkPopup = commentRethinkPopup;
        this.statusCode = num;
        this.errorCode = num2;
        this.statusMsg = str;
        this.prompts = str2;
    }
}
