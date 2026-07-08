package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class BundleDealRequest {

    @C09CT("kol_id")
    public final String KolId;

    @C09CT("bundle_id_list")
    public final List<String> bundleIdList;

    @C09CT("chain_key")
    public final String chainKey;

    @C09CT("parent_product_id")
    public final String parentProductId;

    @C09CT("selected_address_id")
    public final String selectedAddressId;

    @C09CT("seller_id")
    public final String sellerId;

    @C09CT("traffic_source")
    public final Integer trafficSource;

    @C09CT("traffic_source_list")
    public final List<Integer> trafficSourceList;

    public BundleDealRequest(List<String> list, String str, String str2, String str3, Integer num, List<Integer> list2, String str4, String str5) {
        this.bundleIdList = list;
        this.sellerId = str;
        this.chainKey = str2;
        this.KolId = str3;
        this.trafficSource = num;
        this.trafficSourceList = list2;
        this.selectedAddressId = str4;
        this.parentProductId = str5;
    }
}
