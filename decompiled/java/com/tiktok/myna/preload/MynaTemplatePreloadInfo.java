package com.tiktok.myna.preload;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class MynaTemplatePreloadInfo {

    @C09CT("name")
    public final String name;

    @C09CT("num")
    public final int num;

    @C09CT("url")
    public final String url;

    public MynaTemplatePreloadInfo() {
        this(null, null, 0);
    }

    public MynaTemplatePreloadInfo(String str, String str2, int i) {
        this.name = str;
        this.url = str2;
        this.num = i;
    }
}
