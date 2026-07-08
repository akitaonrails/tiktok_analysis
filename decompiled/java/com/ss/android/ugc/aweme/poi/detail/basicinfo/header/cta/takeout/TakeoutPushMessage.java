package com.ss.android.ugc.aweme.poi.detail.basicinfo.header.cta.takeout;

import X.C09CT;

/* JADX INFO: loaded from: classes19.dex */
public final class TakeoutPushMessage {

    @C09CT("partner_name")
    public final String partnerName;

    @C09CT("poi_id")
    public final String poiId;

    @C09CT("ttoclid")
    public final String ttoclid;

    @C09CT("url")
    public final String url;

    public TakeoutPushMessage() {
        this(null, null, null, null);
    }

    public TakeoutPushMessage(String str, String str2, String str3, String str4) {
        this.url = str;
        this.poiId = str2;
        this.ttoclid = str3;
        this.partnerName = str4;
    }
}
