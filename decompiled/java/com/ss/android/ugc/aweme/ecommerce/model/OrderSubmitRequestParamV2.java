package com.ss.android.ugc.aweme.ecommerce.model;

import X.C09CT;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class OrderSubmitRequestParamV2 {

    @C09CT("activity_ids")
    public final List<String> activityIds;

    @C09CT("activity_user_selection")
    public final ActivityUserSelectionV2 activityUserSelection;

    @C09CT("bill_info_server_params")
    public final String billInfoParams;

    @C09CT("buyer_addr_id")
    public final String buyerAddrId;

    @C09CT("claim_voucher_metas")
    public final List<VoucherMetaV2> claimVoucherMetas;

    @C09CT("claim_voucher_type_ids")
    public final List<String> claimVoucherTypeIds;

    @C09CT("da_info")
    public final Map<String, String> daInfo;

    @C09CT("is_from_follow")
    public final Boolean isFromFollow;

    @C09CT("key_timestamp")
    public final Long keyTimestamp;

    @C09CT("notice_voucher_type_id")
    public final String noticeVoucherTypeId;

    @C09CT("one_step_order_type")
    public final Integer oneStepOrderType;

    @C09CT("order_request_params")
    public final HashMap<String, Object> orderRequestParams;

    @C09CT("order_shop")
    public final List<OrderShopDigestV2> orderShop;

    @C09CT("pre_log_id")
    public final String preLogId;

    @C09CT("promotion_ids")
    public final List<String> promotionIds;

    @C09CT("selected_voucher_metas")
    public final List<VoucherMetaV2> selectedVoucherMetas;

    @C09CT("use_activity_user_selection")
    public final Boolean useActivityUserSelection;

    @C09CT("use_user_selection")
    public final Boolean useUserSelection;

    public OrderSubmitRequestParamV2() {
        this(null, null, null, null, null, null, 0L, null, null, null, null, Boolean.FALSE, null, null, null, null, null, null);
    }

    public OrderSubmitRequestParamV2(String str, List<OrderShopDigestV2> list, HashMap<String, Object> map, List<String> list2, Boolean bool, List<String> list3, Long l, List<String> list4, List<VoucherMetaV2> list5, String str2, Integer num, Boolean bool2, Map<String, String> map2, String str3, String str4, List<VoucherMetaV2> list6, Boolean bool3, ActivityUserSelectionV2 activityUserSelectionV2) {
        this.buyerAddrId = str;
        this.orderShop = list;
        this.orderRequestParams = map;
        this.promotionIds = list2;
        this.useUserSelection = bool;
        this.activityIds = list3;
        this.keyTimestamp = l;
        this.claimVoucherTypeIds = list4;
        this.claimVoucherMetas = list5;
        this.noticeVoucherTypeId = str2;
        this.oneStepOrderType = num;
        this.isFromFollow = bool2;
        this.daInfo = map2;
        this.preLogId = str3;
        this.billInfoParams = str4;
        this.selectedVoucherMetas = list6;
        this.useActivityUserSelection = bool3;
        this.activityUserSelection = activityUserSelectionV2;
    }
}
