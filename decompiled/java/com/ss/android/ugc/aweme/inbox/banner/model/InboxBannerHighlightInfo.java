package com.ss.android.ugc.aweme.inbox.banner.model;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class InboxBannerHighlightInfo {

    @C09CT("template_highlight_content")
    public final String content;

    @C09CT("template_highlight_content_schema")
    public final String schema;

    public InboxBannerHighlightInfo() {
        this(null, null);
    }

    public InboxBannerHighlightInfo(String str, String str2) {
        this.content = str;
        this.schema = str2;
    }
}
