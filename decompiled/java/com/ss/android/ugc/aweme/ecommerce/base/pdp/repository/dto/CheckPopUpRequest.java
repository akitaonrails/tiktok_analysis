package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class CheckPopUpRequest {

    @C09CT("coupon_context")
    public final String couponContext;

    @C09CT("external_pass_through_params")
    public final String externalPassThroughParams;

    @C09CT("page_source_info")
    public final String pageSourceInfo;

    @C09CT("pass_through_params")
    public final String passThroughParams;

    @C09CT("pop_up_entries")
    public final List<CheckPopUpEntry> popUpEntries;

    @C09CT("product_id")
    public final String productId;

    @C09CT("selected_address_id")
    public final String selectedAddressId;

    @C09CT("ship_to_addr")
    public final List<Region> shipToAddr;

    @C09CT("trigger_type")
    public final Integer triggerType;

    public CheckPopUpRequest(String str, String str2, Integer num, String str3, List<Region> list, String str4, String str5, String str6, List<CheckPopUpEntry> list2) {
        this.productId = str;
        this.couponContext = str2;
        this.triggerType = num;
        this.selectedAddressId = str3;
        this.shipToAddr = list;
        this.passThroughParams = str4;
        this.pageSourceInfo = str5;
        this.externalPassThroughParams = str6;
        this.popUpEntries = list2;
    }
}
