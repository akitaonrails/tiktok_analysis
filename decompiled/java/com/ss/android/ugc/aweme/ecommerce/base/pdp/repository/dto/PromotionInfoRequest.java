package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class PromotionInfoRequest {

    @C09CT("ab_img")
    public final Boolean abImg;

    @C09CT("biz_template")
    public final Integer bizTemplate;

    @C09CT("entrance_style")
    public final Integer entranceStyle;

    @C09CT("kol_id")
    public final String kolId;

    @C09CT("page_source_info")
    public final String pageSourceInfo;

    @C09CT("product_enter_context")
    public final Map<String, Object> productEnterContext;

    @C09CT("product_id")
    public final List<String> productId;

    @C09CT("product_source_info")
    public final Map<String, Object> productSourceInfo;

    @C09CT("promotion_response_style")
    public final Integer promotionResponseStyle;

    @C09CT("related_product_ids")
    public final List<String> relatedProductIds;

    @C09CT("schema_custom_fields")
    public final Map<String, Object> schemaCustomField;

    @C09CT("template")
    public final String template;

    @C09CT("traffic_signature")
    public final String trafficSignature;

    public PromotionInfoRequest() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public PromotionInfoRequest(Integer num, List<String> list, String str, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, String str2, Integer num2, String str3, Integer num3, List<String> list2, String str4, Boolean bool, Map<String, ? extends Object> map3) {
        this.entranceStyle = num;
        this.relatedProductIds = list;
        this.template = str;
        this.productEnterContext = map;
        this.productSourceInfo = map2;
        this.pageSourceInfo = str2;
        this.bizTemplate = num2;
        this.kolId = str3;
        this.promotionResponseStyle = num3;
        this.productId = list2;
        this.trafficSignature = str4;
        this.abImg = bool;
        this.schemaCustomField = map3;
    }
}
