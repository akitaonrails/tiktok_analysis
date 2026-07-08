package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoLinkItem {

    @C09CT("icon")
    public final String icon;

    @C09CT("link")
    public final String link;

    @C09CT("name")
    public final String name;

    @C09CT("snippet")
    public final String snippet;

    @C09CT("title")
    public final String title;

    public TakoLinkItem() {
        this("", "", "", "", "");
    }

    public TakoLinkItem(String str, String str2, String str3, String str4, String str5) {
        this.link = str;
        this.name = str2;
        this.title = str3;
        this.snippet = str4;
        this.icon = str5;
    }
}
