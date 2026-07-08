package com.ss.android.ugc.aweme.poi.detail.container.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiBookingProviderInfo implements Serializable {

    @C09CT("cta_icon_key")
    public final String iconKey;

    @C09CT("provider")
    public final Integer provider;

    @C09CT("cta_title")
    public final String title;

    @C09CT("track_info")
    public final String track_info;

    @C09CT("url")
    public final String url;

    public PoiBookingProviderInfo(Integer num, String str, String str2, String str3, String str4) {
        this.provider = num;
        this.url = str;
        this.iconKey = str2;
        this.title = str3;
        this.track_info = str4;
    }
}
