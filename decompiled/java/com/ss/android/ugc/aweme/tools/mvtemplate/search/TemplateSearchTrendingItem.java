package com.ss.android.ugc.aweme.tools.mvtemplate.search;

import X.C09CT;

/* JADX INFO: loaded from: classes23.dex */
public final class TemplateSearchTrendingItem {

    @C09CT("resource_id")
    public final String resourceId;

    @C09CT("title")
    public final String title;

    public TemplateSearchTrendingItem() {
        this("", "");
    }

    public TemplateSearchTrendingItem(String str, String str2) {
        this.title = str;
        this.resourceId = str2;
    }
}
