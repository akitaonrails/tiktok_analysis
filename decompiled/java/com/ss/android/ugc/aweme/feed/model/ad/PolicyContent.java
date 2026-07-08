package com.ss.android.ugc.aweme.feed.model.ad;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class PolicyContent implements Serializable {

    @C09CT("description")
    public final String description;

    @C09CT("language")
    public final String language;

    @C09CT("region")
    public final String region;

    @C09CT("title")
    public final String title;

    @C09CT("type")
    public final String type;

    @C09CT("uri")
    public final String uri;

    public PolicyContent() {
        this(null, null, null, null, null, null);
    }

    public PolicyContent(String str, String str2, String str3, String str4, String str5, String str6) {
        this.type = str;
        this.title = str2;
        this.description = str3;
        this.uri = str4;
        this.region = str5;
        this.language = str6;
    }
}
