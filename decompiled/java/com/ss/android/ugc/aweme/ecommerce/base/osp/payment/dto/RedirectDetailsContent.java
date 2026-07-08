package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class RedirectDetailsContent {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("body")
    public RedirectDetailsContentBody body;

    @C09CT("header")
    public String header;

    @C09CT("method")
    public String method;

    @C09CT("url")
    public String url;

    public RedirectDetailsContent() {
        this(null, null, null, null);
    }

    public RedirectDetailsContent(RedirectDetailsContentBody redirectDetailsContentBody, String str, String str2, String str3) {
        this.body = redirectDetailsContentBody;
        this.header = str;
        this.method = str2;
        this.url = str3;
    }
}
