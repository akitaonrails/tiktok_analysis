package com.ss.android.ugc.aweme.ecommerce.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes33.dex */
public final class GetItemProductInfoRequest implements Serializable {

    @C09CT("advertiser_id")
    public final String advertiserId;

    @C09CT("anchor_req_type")
    public final Integer anchorReqType;

    @C09CT("anchor_scene")
    public final Integer anchorScene;

    @C09CT("anchor_style")
    public final Integer anchorStyle;

    @C09CT("aweme_id")
    public final String awemeId;

    @C09CT("ec_campaign_info")
    public final String ecCampaignInfo;

    @C09CT("from_multi_panel")
    public final Boolean fromMultiPanel;

    @C09CT("is_anchor_dynamic_view")
    public final Boolean isAnchorDynamicView;

    @C09CT("is_from_ad")
    public final Boolean isFromAd;

    @C09CT("kol_id")
    public final String kolId;

    @C09CT("product_enter_context")
    public final Map<String, EnterContext> productEnterContext;

    @C09CT("product_id")
    public final List<String> productIds;

    @C09CT("support_single_stream")
    public final Boolean supportSingleStream;

    @C09CT("traffic_source_list")
    public final int[] trafficSourceList;

    @C09CT("use_new_promotion")
    public final int useNewPromotion;

    public GetItemProductInfoRequest() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 1, 0, null);
    }

    public final String getAdvertiserId() {
        return this.advertiserId;
    }

    public final Integer getAnchorReqType() {
        return this.anchorReqType;
    }

    public final Integer getAnchorScene() {
        return this.anchorScene;
    }

    public final Integer getAnchorStyle() {
        return this.anchorStyle;
    }

    public final String getAwemeId() {
        return this.awemeId;
    }

    public final String getEcCampaignInfo() {
        return this.ecCampaignInfo;
    }

    public final Boolean getFromMultiPanel() {
        return this.fromMultiPanel;
    }

    public final String getKolId() {
        return this.kolId;
    }

    public final Map<String, EnterContext> getProductEnterContext() {
        return this.productEnterContext;
    }

    public final List<String> getProductIds() {
        return this.productIds;
    }

    public final Boolean getSupportSingleStream() {
        return this.supportSingleStream;
    }

    public final int[] getTrafficSourceList() {
        return this.trafficSourceList;
    }

    public final int getUseNewPromotion() {
        return this.useNewPromotion;
    }

    public final Boolean isAnchorDynamicView() {
        return this.isAnchorDynamicView;
    }

    public final Boolean isFromAd() {
        return this.isFromAd;
    }

    public GetItemProductInfoRequest(List<String> list, String str, Map<String, EnterContext> map, Boolean bool, int[] iArr, Integer num, Boolean bool2, Integer num2, Boolean bool3, String str2, Boolean bool4, String str3, int i, Integer num3, String str4) {
        this.productIds = list;
        this.kolId = str;
        this.productEnterContext = map;
        this.fromMultiPanel = bool;
        this.trafficSourceList = iArr;
        this.anchorReqType = num;
        this.isAnchorDynamicView = bool2;
        this.anchorScene = num2;
        this.isFromAd = bool3;
        this.awemeId = str2;
        this.supportSingleStream = bool4;
        this.ecCampaignInfo = str3;
        this.useNewPromotion = i;
        this.anchorStyle = num3;
        this.advertiserId = str4;
    }
}
