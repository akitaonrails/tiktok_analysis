package com.ss.android.ugc.aweme.comment.model;

/* JADX INFO: loaded from: classes20.dex */
public final class CommentKeyboardModelKt {
    public static final int landScapeCode(CommentKeyboardModel commentKeyboardModel) {
        if (commentKeyboardModel == null) {
            return 0;
        }
        return commentKeyboardModel.isLandscapeMode() ? 1 : 0;
    }
}
