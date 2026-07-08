package com.ss.android.ugc.aweme.inbox.banner.model;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class InboxBannerButtonInfo {

    @C09CT("schema_url")
    public final String schemaUrl;

    @C09CT("title")
    public final String title;

    public InboxBannerButtonInfo() {
        this(null, null);
    }

    public InboxBannerButtonInfo(String str, String str2) {
        this.title = str;
        this.schemaUrl = str2;
    }
}
