package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes22.dex */
public final class ReplyCommentLoadNumConfig {

    @C09CT("reply_comment_first_page_load_num")
    public final int replyCommentFirstPageLoadNum;

    @C09CT("reply_comment_non_first_page_load_num")
    public final int replyCommentNonFirstPageLoadNum;

    public ReplyCommentLoadNumConfig() {
        this(3, 5);
    }

    public ReplyCommentLoadNumConfig(int i, int i2) {
        this.replyCommentFirstPageLoadNum = i;
        this.replyCommentNonFirstPageLoadNum = i2;
    }
}
