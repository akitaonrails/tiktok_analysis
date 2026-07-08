package com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class BundleAddItemsToCartRequest {

    @C09CT("add_item_source_page")
    public final Integer addItemSourcePage;

    @C09CT("aggregation_count")
    public final Integer aggregationCount;

    @C09CT("bundle_id")
    public final String bundleId;

    @C09CT("cart_item_data")
    public final List<AddItemToCartRequest> items;

    @C09CT("mobile_pipe_ctx")
    public final String mobilePipeCtx;

    public BundleAddItemsToCartRequest(List<AddItemToCartRequest> list, String str, Integer num, Integer num2, String str2) {
        this.items = list;
        this.bundleId = str;
        this.aggregationCount = num;
        this.addItemSourcePage = num2;
        this.mobilePipeCtx = str2;
    }
}
