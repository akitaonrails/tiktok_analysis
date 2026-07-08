package com.ss.android.ugc.aweme.ogc.news.sticker.creator.widget.editor.sheet.base;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class ArticleStickerContentCheckResponse {

    @C09CT("status_code")
    public Integer statusCode;

    @C09CT("status_msg")
    public String statusMessage;

    public ArticleStickerContentCheckResponse() {
        this(null, null);
    }

    public ArticleStickerContentCheckResponse(Integer num, String str) {
        this.statusCode = num;
        this.statusMessage = str;
    }
}
