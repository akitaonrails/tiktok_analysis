package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class EcUgVSAData implements Serializable {

    @C09CT("custom_shop_ads_type")
    public final Integer adType;

    @C09CT("campaign_id")
    public final String campaignId;

    @C09CT("campaign_name")
    public final String campaignName;

    @C09CT("creative_id")
    public final String creativeId;

    @C09CT("open_url")
    public final String openUrl;

    @C09CT("pdp_template_url")
    public final String pdpTemplateUrl;

    @C09CT("previous_page")
    public final String previousPage;

    @C09CT("product_infos")
    public final List<EcUgVSAProductInfo> productInfoList;

    public static final class EcUgVSAProductInfo implements Serializable {

        @C09CT("product_id")
        public final String productId;

        public EcUgVSAProductInfo(String str) {
            this.productId = str;
        }
    }

    public EcUgVSAData(Integer num, String str, String str2, List<EcUgVSAProductInfo> list, String str3, String str4, String str5, String str6) {
        this.adType = num;
        this.openUrl = str;
        this.pdpTemplateUrl = str2;
        this.productInfoList = list;
        this.campaignName = str3;
        this.campaignId = str4;
        this.creativeId = str5;
        this.previousPage = str6;
    }
}
