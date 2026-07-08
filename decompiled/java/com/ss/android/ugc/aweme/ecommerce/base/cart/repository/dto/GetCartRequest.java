package com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.FieldContext;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class GetCartRequest {

    @C09CT("biz_id")
    public final String bizId;

    @C09CT("buyer_addr_id")
    public final String buyerAddrId;

    @C09CT("cart_type")
    public final Integer cartType;

    @C09CT("client_ab_param")
    public final String clientAbParam;

    @C09CT("field_ctx")
    public final FieldContext fieldContext;

    @C09CT("is_first_screen")
    public final Boolean isFirstScreen;

    @C09CT("page_source_info")
    public final String pageSourceInfo;

    @C09CT("selected_cart_item_ids")
    public final List<String> selectedCartItemIds;

    @C09CT("ship_to_addr")
    public final List<District> shipToAddr;

    @C09CT("traffic_source_list")
    public final List<Integer> trafficSourceList;

    public GetCartRequest() {
        this(Boolean.TRUE, null, null, null, null, null, null, 10, null, null);
    }

    public GetCartRequest(Boolean bool, List<String> list, String str, List<District> list2, List<Integer> list3, String str2, String str3, Integer num, String str4, FieldContext fieldContext) {
        this.isFirstScreen = bool;
        this.selectedCartItemIds = list;
        this.buyerAddrId = str;
        this.shipToAddr = list2;
        this.trafficSourceList = list3;
        this.pageSourceInfo = str2;
        this.bizId = str3;
        this.cartType = num;
        this.clientAbParam = str4;
        this.fieldContext = fieldContext;
    }
}
