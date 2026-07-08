package com.ss.android.ugc.aweme.ecommercelive.audience.common.business.feed.popcard.api;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ECImage;

/* JADX INFO: loaded from: classes33.dex */
public final class GoLiveCard {

    @C09CT("btnSchema")
    public final String btnSchema;

    @C09CT("button_text")
    public final String buttonText;

    @C09CT("commission")
    public final Integer commission;

    @C09CT("content")
    public final String content;

    @C09CT("cover")
    public final ECImage cover;

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("delay_time")
    public final Long delay;

    @C09CT("product_id")
    public final String productId;

    @C09CT("schema")
    public final String schema;

    @C09CT("style")
    public final Integer style;

    @C09CT("title")
    public final String title;

    @C09CT("trigger_point")
    public final Integer triggerPoint;

    public GoLiveCard() {
        this(null, null, null, null, null, null, -1, -1, null, null, null, null);
    }

    public GoLiveCard(String str, String str2, String str3, ECImage eCImage, Integer num, String str4, Integer num2, Integer num3, String str5, String str6, Long l, String str7) {
        this.productId = str;
        this.title = str2;
        this.content = str3;
        this.cover = eCImage;
        this.commission = num;
        this.buttonText = str4;
        this.style = num2;
        this.triggerPoint = num3;
        this.schema = str5;
        this.btnSchema = str6;
        this.delay = l;
        this.daInfo = str7;
    }
}
