package com.ss.android.ugc.aweme.comment.commentlist.ui;

import X.C09CT;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentCharLimitConfig {

    @C09CT("char_limit")
    public final int charLimit;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("expand_step")
    public final int expandLinesStep;

    @C09CT("fold_lines")
    public final int foldLines;

    public CommentCharLimitConfig() {
        this(true, 6, 6, 2200);
    }

    public CommentCharLimitConfig(boolean z, int i, int i2, int i3) {
        this.enable = z;
        this.foldLines = i;
        this.expandLinesStep = i2;
        this.charLimit = i3;
    }
}
