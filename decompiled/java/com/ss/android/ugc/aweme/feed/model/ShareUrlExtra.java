package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;

/* JADX INFO: loaded from: classes20.dex */
public final class ShareUrlExtra {

    @C09CT("item_id")
    public String itemId;

    @C09CT("link_id")
    public String linkId;

    @C09CT("from_uid")
    public String shareUserId;

    public ShareUrlExtra() {
        this(null, null, null);
    }

    public final void setItemId(String str) {
        this.itemId = str;
    }

    public final void setLinkId(String str) {
        this.linkId = str;
    }

    public final void setShareUserId(String str) {
        this.shareUserId = str;
    }

    public ShareUrlExtra(String str, String str2, String str3) {
        this.itemId = str;
        this.linkId = str2;
        this.shareUserId = str3;
    }
}
