package com.bytedance.touchpoint.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class Request {

    @C09CT("body")
    public Body body;

    @C09CT("method")
    public String method;

    @C09CT("url")
    public String url;

    public Request(String str, Body body, String str2) {
        this.url = str;
        this.body = body;
        this.method = str2;
    }
}
