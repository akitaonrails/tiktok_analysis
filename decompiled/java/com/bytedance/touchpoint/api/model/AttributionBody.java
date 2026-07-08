package com.bytedance.touchpoint.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class AttributionBody {

    @C09CT("af_sub5")
    public String afSub5;

    @C09CT("campaign")
    public String campaign;

    @C09CT("media_source")
    public String mediaSource;

    @C09CT("media_type")
    public String mediaType;

    public AttributionBody(String str, String str2, String str3, String str4) {
        this.mediaSource = str;
        this.campaign = str2;
        this.mediaType = str3;
        this.afSub5 = str4;
    }
}
