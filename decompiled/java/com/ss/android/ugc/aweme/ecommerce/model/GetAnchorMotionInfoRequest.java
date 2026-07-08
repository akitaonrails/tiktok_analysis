package com.ss.android.ugc.aweme.ecommerce.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes33.dex */
public final class GetAnchorMotionInfoRequest implements Serializable {

    @C09CT("advertiser_id")
    public final String advertiserId;

    @C09CT("anchor_scene")
    public final Integer anchorScene;

    @C09CT("anchor_style")
    public final Integer anchorStyle;

    @C09CT("aweme_id")
    public final String awemeId;

    @C09CT("client_payload_map")
    public final Map<String, String> clientPayloadMap;

    @C09CT("ec_campaign_info")
    public final String ecCampaignInfo;

    @C09CT("is_from_ad")
    public final Boolean isFromAd;

    @C09CT("kol_id")
    public final String kolId;

    @C09CT("product_enter_context")
    public final Map<String, EnterContext> productEnterContext;

    @C09CT("product_id")
    public final List<String> productIds;

    @C09CT("selling_point_type")
    public final Integer sellingPointType;

    @C09CT("traffic_source_list")
    public final int[] trafficSourceList;

    public GetAnchorMotionInfoRequest() {
        this(null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final Boolean isFromAd() {
        return this.isFromAd;
    }

    public GetAnchorMotionInfoRequest(List<String> list, String str, Map<String, EnterContext> map, int[] iArr, Integer num, Boolean bool, String str2, String str3, Integer num2, String str4, Map<String, String> map2, Integer num3) {
        this.productIds = list;
        this.kolId = str;
        this.productEnterContext = map;
        this.trafficSourceList = iArr;
        this.anchorScene = num;
        this.isFromAd = bool;
        this.awemeId = str2;
        this.ecCampaignInfo = str3;
        this.anchorStyle = num2;
        this.advertiserId = str4;
        this.clientPayloadMap = map2;
        this.sellingPointType = num3;
    }
}
