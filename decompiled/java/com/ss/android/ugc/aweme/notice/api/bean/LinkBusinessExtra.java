package com.ss.android.ugc.aweme.notice.api.bean;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class LinkBusinessExtra {

    @C09CT("item_id")
    public final String itemId;

    @C09CT("link_id")
    public final String linkId;

    @C09CT("share_type")
    public final int shareType;

    @C09CT("type")
    public final String type;

    public LinkBusinessExtra() {
        this("", "", "", -1);
    }

    public LinkBusinessExtra(String str, String str2, String str3, int i) {
        this.type = str;
        this.linkId = str2;
        this.itemId = str3;
        this.shareType = i;
    }
}
