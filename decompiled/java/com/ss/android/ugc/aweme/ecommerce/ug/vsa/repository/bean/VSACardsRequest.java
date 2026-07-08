package com.ss.android.ugc.aweme.ecommerce.ug.vsa.repository.bean;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public final class VSACardsRequest {

    @C09CT("page_source_info")
    public final String pageSourceInfo;

    @C09CT("vsa_info_list")
    public final List<VSAInfoInfo> vsaInfoList;

    public VSACardsRequest() {
        this(null, null);
    }

    public VSACardsRequest(List<VSAInfoInfo> list, String str) {
        this.vsaInfoList = list;
        this.pageSourceInfo = str;
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class VSAInfoInfo {

        @C09CT("ad_id")
        public final String adId;

        @C09CT("aweme_id")
        public final String awemeId;

        @C09CT("campaign_id")
        public final String campaignId;

        @C09CT("campaign_name")
        public final String campaignName;

        @C09CT("card_style")
        public final Integer cardStyle;

        @C09CT("creative_id")
        public final String creativeId;

        @C09CT("previous_page")
        public final String previousPage;

        @C09CT("product_id")
        public final List<String> productIdList;

        public VSAInfoInfo() {
            this(null, null, null, null, null, null, null, 0);
        }

        public VSAInfoInfo(String str, List<String> list, String str2, String str3, String str4, String str5, String str6, Integer num) {
            this.awemeId = str;
            this.productIdList = list;
            this.campaignName = str2;
            this.campaignId = str3;
            this.creativeId = str4;
            this.adId = str5;
            this.previousPage = str6;
            this.cardStyle = num;
        }
    }
}
