package com.ss.android.ugc.aweme.sticker.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class SharedCommentStickerStruct implements Serializable {

    @C09CT("first_comment_image_url")
    public final String firstCommentImageUrl;

    @C09CT("quoted_comment_author_id")
    public final String quotedCommentAuthorId;

    @C09CT("quoted_comment_id")
    public final String quotedCommentId;

    public SharedCommentStickerStruct() {
        this("", "", null);
    }

    public SharedCommentStickerStruct(String str, String str2, String str3) {
        this.quotedCommentId = str;
        this.quotedCommentAuthorId = str2;
        this.firstCommentImageUrl = str3;
    }
}
