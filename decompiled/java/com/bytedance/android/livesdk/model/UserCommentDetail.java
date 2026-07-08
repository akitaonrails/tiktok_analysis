package com.bytedance.android.livesdk.model;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class UserCommentDetail {

    @C09CT("comment_cnt")
    public long commentCnt;

    @C09CT("top_comment")
    public CommentDetail topComment;

    @C09CT("top_comment_list")
    public List<CommentDetail> topCommentList = new ArrayList();

    @C09CT("total_comment_cnt")
    public long totalCommentCnt;

    @C09CT("user")
    public User user;
}
