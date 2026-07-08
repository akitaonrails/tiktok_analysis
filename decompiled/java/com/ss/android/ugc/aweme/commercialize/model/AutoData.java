package com.ss.android.ugc.aweme.commercialize.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AutoData implements Serializable {

    @C09CT("full_text")
    public final String fullText;

    @C09CT("image_url")
    public final String imageUrl;

    @C09CT("open_url")
    public final String openUrl;

    @C09CT("text")
    public final String text;

    @C09CT("web_url")
    public final String webUrl;

    public final String getFullText() {
        return this.fullText;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getOpenUrl() {
        return this.openUrl;
    }

    public final String getText() {
        return this.text;
    }

    public final String getWebUrl() {
        return this.webUrl;
    }

    public AutoData(String str, String str2, String str3, String str4, String str5) {
        this.text = str;
        this.fullText = str2;
        this.imageUrl = str3;
        this.webUrl = str4;
        this.openUrl = str5;
    }
}
