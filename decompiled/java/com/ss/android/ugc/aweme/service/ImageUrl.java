package com.ss.android.ugc.aweme.service;

import X.C09CT;

/* JADX INFO: loaded from: classes26.dex */
public final class ImageUrl {

    @C09CT("Uri")
    public final String uri;

    @C09CT("Url")
    public final String url;

    public ImageUrl() {
        this("", "");
    }

    public ImageUrl(String str, String str2) {
        this.uri = str;
        this.url = str2;
    }
}
