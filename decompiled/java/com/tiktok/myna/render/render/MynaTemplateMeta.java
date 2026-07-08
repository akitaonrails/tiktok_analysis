package com.tiktok.myna.render.render;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class MynaTemplateMeta {

    @C09CT("name")
    public final String name;

    @C09CT("url")
    public final String url;

    @C09CT("version")
    public final String version;

    public MynaTemplateMeta() {
        this(null, null, null);
    }

    public MynaTemplateMeta(String str, String str2, String str3) {
        this.name = str;
        this.version = str2;
        this.url = str3;
    }
}
