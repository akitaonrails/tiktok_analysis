package com.ss.android.ugc.aweme.comment.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class CommentPostStickerStruct implements Serializable {

    @C09CT("original_item_id")
    public String originalAwemeId;

    @C09CT("original_comment_id")
    public String originalCommentId;

    public CommentPostStickerStruct() {
        this(null, null);
    }

    public CommentPostStickerStruct(String str, String str2) {
        this.originalAwemeId = str;
        this.originalCommentId = str2;
    }
}
