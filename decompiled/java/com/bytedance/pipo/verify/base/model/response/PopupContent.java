package com.bytedance.pipo.verify.base.model.response;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class PopupContent {

    @C09CT("desc")
    public final String desc;

    @C09CT("tracking_id")
    public final String trackingId;

    @C09CT("popup_type")
    public final String type;

    @C09CT("url")
    public final String url;

    public PopupContent() {
        this(null, null, null, null);
    }

    public PopupContent(String str, String str2, String str3, String str4) {
        this.type = str;
        this.desc = str2;
        this.url = str3;
        this.trackingId = str4;
    }
}
