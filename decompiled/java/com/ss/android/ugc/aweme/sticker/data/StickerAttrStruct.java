package com.ss.android.ugc.aweme.sticker.data;

import X.C09CT;

/* JADX INFO: loaded from: classes23.dex */
public class StickerAttrStruct {

    @C09CT("comment_sticker_id")
    public String commentStickerId;

    @C09CT("poll_sticker_id")
    public String pollStickerId;

    public String getCommentStickerId() {
        return this.commentStickerId;
    }

    public String getPollStickerId() {
        return this.pollStickerId;
    }

    public void setCommentStickerId(String str) {
        this.commentStickerId = str;
    }

    public void setPollStickerId(String str) {
        this.pollStickerId = str;
    }
}
