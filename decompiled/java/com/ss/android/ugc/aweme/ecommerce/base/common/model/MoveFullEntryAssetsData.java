package com.ss.android.ugc.aweme.ecommerce.base.common.model;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class MoveFullEntryAssetsData {

    @C09CT("action_area_text")
    public final String actionAreaText;

    @C09CT("content")
    public final String content;

    @C09CT("dark_icon_url")
    public final String darkIconUrl;

    @C09CT("light_icon_url")
    public final String lightIconUrl;

    @C09CT("schema_link")
    public final String schemaLink;

    public MoveFullEntryAssetsData() {
        this(null, null, null, null, null);
    }

    public MoveFullEntryAssetsData(String str, String str2, String str3, String str4, String str5) {
        this.content = str;
        this.actionAreaText = str2;
        this.lightIconUrl = str3;
        this.darkIconUrl = str4;
        this.schemaLink = str5;
    }
}
