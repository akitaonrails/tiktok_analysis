package com.ss.android.ugc.aweme.poi.search;

import X.C09CT;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiSearchBannerResModel {

    @C09CT("campaign_name")
    public final String campaignName;

    @C09CT("img_url")
    public final String resource;

    @C09CT("schema")
    public final String schema;

    public PoiSearchBannerResModel() {
        this(null, null, null);
    }

    public PoiSearchBannerResModel(String str, String str2, String str3) {
        this.schema = str;
        this.campaignName = str2;
        this.resource = str3;
    }
}
