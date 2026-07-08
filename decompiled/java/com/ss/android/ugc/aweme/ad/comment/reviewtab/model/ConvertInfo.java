package com.ss.android.ugc.aweme.ad.comment.reviewtab.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes28.dex */
public final class ConvertInfo implements Serializable {

    @C09CT("ad_id")
    public final long adId;

    @C09CT("app_id")
    public final Long appId;

    @C09CT("converted_id")
    public final String convertId;

    @C09CT("creative_id")
    public final long creativeId;

    @C09CT("external_url")
    public final String externalUrl;

    @C09CT("item_id")
    public final long itemId;

    public ConvertInfo() {
        this(null, 0L, 0L, 0L, null, null);
    }

    public final long getAdId() {
        return this.adId;
    }

    public final Long getAppId() {
        return this.appId;
    }

    public final String getConvertId() {
        return this.convertId;
    }

    public final long getCreativeId() {
        return this.creativeId;
    }

    public final String getExternalUrl() {
        return this.externalUrl;
    }

    public final long getItemId() {
        return this.itemId;
    }

    public ConvertInfo(String str, long j, long j2, long j3, Long l, String str2) {
        this.convertId = str;
        this.adId = j;
        this.creativeId = j2;
        this.itemId = j3;
        this.appId = l;
        this.externalUrl = str2;
    }
}
