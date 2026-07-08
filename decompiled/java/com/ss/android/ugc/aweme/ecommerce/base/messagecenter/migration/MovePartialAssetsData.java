package com.ss.android.ugc.aweme.ecommerce.base.messagecenter.migration;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class MovePartialAssetsData {

    @C09CT("button_text")
    public final String buttonText;

    @C09CT("content")
    public final String content;

    @C09CT("dark_image_url")
    public final String darkImageUrl;

    @C09CT("light_image_url")
    public final String lightImageUrl;

    @C09CT("schema_link")
    public final String schemaLink;

    @C09CT("title")
    public final String title;

    public MovePartialAssetsData() {
        this(null, null, null, null, null, null);
    }

    public MovePartialAssetsData(String str, String str2, String str3, String str4, String str5, String str6) {
        this.title = str;
        this.content = str2;
        this.lightImageUrl = str3;
        this.darkImageUrl = str4;
        this.buttonText = str5;
        this.schemaLink = str6;
    }
}
