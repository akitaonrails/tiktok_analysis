package com.ss.android.ugc.aweme.ecommerce.model;

import X.C09CT;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class OrderSubmitEnterParamsV2 {

    @C09CT("biz_type")
    public final int bizType;

    @C09CT("btm_token")
    public final String btmToken;

    @C09CT("buyNowSchema")
    public final String buyNowSchema;

    @C09CT("buy_type")
    public final int buyType;

    @C09CT("chain_key")
    public final String chainKey;

    @C09CT("combined_area")
    public final List<RegionV2> combinedArea;

    @C09CT("free_shipping")
    public final Integer freeShipping;

    @C09CT("order_request_params")
    public final HashMap<String, Object> orderRequestParams;

    @C09CT("pdp_from")
    public final String pdpFrom;

    @C09CT("pipo_bnpl_selected_tenure")
    public final String pipoBnplSelectedTenure;

    @C09CT("platform_link_based_item")
    public final PlatformLinkBasedItem platformLinkBasedItem;

    @C09CT("postponeBillFetch")
    public Boolean postponeBillFetch;

    @C09CT("repo_id")
    public final String repoId;

    @C09CT("requestParams")
    public final OrderSubmitRequestParamV2 requestParams;

    @C09CT("sea_one_step_mask")
    public final Integer seaOneStepMask;

    @C09CT("sea_one_step_type")
    public final Integer seaOneStepType;

    @C09CT("from_soft_intercept")
    public final Integer softIntercept;

    @C09CT("trackParams")
    public final HashMap<String, Object> trackParams;

    @C09CT("voucherTypeId")
    public final String voucherTypeId;

    public OrderSubmitEnterParamsV2(OrderSubmitRequestParamV2 orderSubmitRequestParamV2, HashMap<String, Object> map, int i, String str, List<RegionV2> list, String str2, int i2, String str3, Boolean bool, String str4, String str5, Integer num, HashMap<String, Object> map2, String str6, Integer num2, String str7, PlatformLinkBasedItem platformLinkBasedItem, Integer num3, Integer num4) {
        this.requestParams = orderSubmitRequestParamV2;
        this.trackParams = map;
        this.bizType = i;
        this.chainKey = str;
        this.combinedArea = list;
        this.repoId = str2;
        this.buyType = i2;
        this.pdpFrom = str3;
        this.postponeBillFetch = bool;
        this.voucherTypeId = str4;
        this.pipoBnplSelectedTenure = str5;
        this.freeShipping = num;
        this.orderRequestParams = map2;
        this.buyNowSchema = str6;
        this.softIntercept = num2;
        this.btmToken = str7;
        this.platformLinkBasedItem = platformLinkBasedItem;
        this.seaOneStepType = num3;
        this.seaOneStepMask = num4;
    }
}
