package com.ss.android.ugc.aweme.poi.osp.repo.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class SubmitOrderRequest implements Serializable {

    @C09CT("buy_sku_list")
    public final List<BuySkuItem> buySkuList;

    @C09CT("marketing_identifier_str")
    public final String marketingIdentifierStr;

    @C09CT("order_attribute")
    public final OrderAttribute orderAttribute;

    @C09CT("order_attribute_json")
    public final String orderAttributeJson;

    @C09CT("pay_info")
    public final String payInfo;

    @C09CT("poi_id")
    public final String poiId;

    @C09CT("price_secret")
    public final String priceSecret;

    public SubmitOrderRequest(String str, List<BuySkuItem> list, String str2, String str3, OrderAttribute orderAttribute, String str4, String str5) {
        this.poiId = str;
        this.buySkuList = list;
        this.priceSecret = str2;
        this.payInfo = str3;
        this.orderAttribute = orderAttribute;
        this.orderAttributeJson = str4;
        this.marketingIdentifierStr = str5;
    }
}
