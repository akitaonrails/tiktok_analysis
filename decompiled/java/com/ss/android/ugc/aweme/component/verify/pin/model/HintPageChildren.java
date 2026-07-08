package com.ss.android.ugc.aweme.component.verify.pin.model;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class HintPageChildren {

    @C09CT("desc")
    public final String desc;

    @C09CT("tracking_id")
    public final String trackingId;

    @C09CT("mod_type")
    public final String type;

    @C09CT("url")
    public final String url;

    public HintPageChildren() {
        this(null, null, null, null);
    }

    public HintPageChildren(String str, String str2, String str3, String str4) {
        this.type = str;
        this.desc = str2;
        this.url = str3;
        this.trackingId = str4;
    }
}
