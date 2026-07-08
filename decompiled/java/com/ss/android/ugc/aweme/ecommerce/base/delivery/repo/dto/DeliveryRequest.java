package com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class DeliveryRequest {

    @C09CT("address_client_template")
    public final String addressClientTemplate;

    @C09CT("buyer_addr_id")
    public final String addressId;

    @C09CT("ship_to_addr")
    public final List<Region> area;

    @C09CT("experiment")
    public final Map<String, Object> experiment;

    @C09CT("order_skus")
    public final List<OrderSKUDTO> orderSKUs;

    @C09CT("pdp_to_logistic_list_info")
    public final String pdpToLogisticListInfo;

    @C09CT("traffic_source_list")
    public final int[] trafficSourceList;

    public DeliveryRequest() {
        this(null, null, null, null, null, null, null);
    }

    public DeliveryRequest(List<OrderSKUDTO> list, String str, List<Region> list2, Map<String, ? extends Object> map, String str2, int[] iArr, String str3) {
        this.orderSKUs = list;
        this.addressId = str;
        this.area = list2;
        this.experiment = map;
        this.pdpToLogisticListInfo = str2;
        this.trafficSourceList = iArr;
        this.addressClientTemplate = str3;
    }
}
