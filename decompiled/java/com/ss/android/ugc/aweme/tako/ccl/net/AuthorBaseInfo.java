package com.ss.android.ugc.aweme.tako.ccl.net;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class AuthorBaseInfo {

    @C09CT("avator_url")
    public final UrlStruct avatorUrl;

    @C09CT("nickname")
    public final String nickname;

    public AuthorBaseInfo() {
        this(null, null);
    }

    public AuthorBaseInfo(String str, UrlStruct urlStruct) {
        this.nickname = str;
        this.avatorUrl = urlStruct;
    }
}
