package com.ss.android.ugc.aweme.im.message.content;

import X.C09CT;

/* JADX INFO: loaded from: classes15.dex */
public final class LinkInfo {

    @C09CT("action_type")
    public final Integer actionType;

    @C09CT("link_url")
    public final String linkUrl;

    public LinkInfo() {
        this(null, null);
    }

    public LinkInfo(String str, Integer num) {
        this.linkUrl = str;
        this.actionType = num;
    }
}
