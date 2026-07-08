package com.bytedance.touchpoint.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class AttributionResponse {

    @C09CT("action")
    public int action;

    @C09CT("jump_link")
    public final String jumpLink;

    @C09CT("status_msg")
    public String msg;

    @C09CT("status_code")
    public int statusCode;

    public AttributionResponse() {
        this(0, "", 0, null);
    }

    public AttributionResponse(int i, String str, int i2, String str2) {
        this.statusCode = i;
        this.msg = str;
        this.action = i2;
        this.jumpLink = str2;
    }
}
