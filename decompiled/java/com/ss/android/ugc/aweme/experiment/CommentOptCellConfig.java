package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentOptCellConfig {

    @C09CT("tt_comment_opt_cell_struct")
    public final int commentOptCellStruct;

    @C09CT("tt_comment_opt_like_button")
    public final int commentOptLikeButton;

    @C09CT("tt_comment_opt_reply_button")
    public final int commentOptReplyButton;

    public CommentOptCellConfig() {
        this(0, 0, 0);
    }

    public CommentOptCellConfig(int i, int i2, int i3) {
        this.commentOptCellStruct = i;
        this.commentOptLikeButton = i2;
        this.commentOptReplyButton = i3;
    }
}
