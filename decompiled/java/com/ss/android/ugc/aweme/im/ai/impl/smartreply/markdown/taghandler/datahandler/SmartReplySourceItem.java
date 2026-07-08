package com.ss.android.ugc.aweme.im.ai.impl.smartreply.markdown.taghandler.datahandler;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class SmartReplySourceItem {

    @C09CT("comment_id")
    public final String commentId;

    @C09CT("content")
    public final String content;

    @C09CT("create_time")
    public final Long createTime;

    @C09CT("image_url")
    public final String imageUrl;

    @C09CT("item_id")
    public final String itemId;

    @C09CT("schema")
    public final String schema;

    @C09CT("type")
    public final String type;

    public SmartReplySourceItem() {
        this(null, null, null, null, null, null, null);
    }

    public SmartReplySourceItem(String str, String str2, String str3, String str4, Long l, String str5, String str6) {
        this.type = str;
        this.content = str2;
        this.imageUrl = str3;
        this.schema = str4;
        this.createTime = l;
        this.commentId = str5;
        this.itemId = str6;
    }
}
