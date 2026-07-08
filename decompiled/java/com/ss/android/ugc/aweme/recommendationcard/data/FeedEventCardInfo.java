package com.ss.android.ugc.aweme.recommendationcard.data;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class FeedEventCardInfo {

    @C09CT("business_id")
    public final String businessId;

    @C09CT("client_data")
    public final String clientData;

    @C09CT("extra")
    public final String extra;

    @C09CT("fe_data")
    public final String feData;

    @C09CT("feed_card_template")
    public final FeedCardTemplate feedCardTemplate;

    @C09CT("is_feed_card_template")
    public final Boolean isFeedCardTemplate;

    @C09CT("schema")
    public final String schema;

    @C09CT("setting_key")
    public final String settingKey;

    public FeedEventCardInfo(String str, String str2, String str3, String str4, String str5, FeedCardTemplate feedCardTemplate, Boolean bool, String str6) {
        this.settingKey = str;
        this.schema = str2;
        this.feData = str3;
        this.clientData = str4;
        this.extra = str5;
        this.feedCardTemplate = feedCardTemplate;
        this.isFeedCardTemplate = bool;
        this.businessId = str6;
    }
}
