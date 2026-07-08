package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class BundleInfo {

    @C09CT("add_button")
    public final BundleAddButton bundleAddButton;

    @C09CT("bundle_id")
    public final String bundleId;

    @C09CT("bundle_schema")
    public final String bundleSchema;

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("product_list")
    public final List<BundleProduct> productList;

    @C09CT("sub_title")
    public final String subtitle;

    @C09CT("title")
    public final String title;

    @C09CT("total_price")
    public final BundleTotalPrice totalPrice;

    public BundleInfo(String str, List<BundleProduct> list, String str2, BundleTotalPrice bundleTotalPrice, BundleAddButton bundleAddButton, String str3, String str4, String str5) {
        this.bundleId = str;
        this.productList = list;
        this.title = str2;
        this.totalPrice = bundleTotalPrice;
        this.bundleAddButton = bundleAddButton;
        this.bundleSchema = str3;
        this.subtitle = str4;
        this.daInfo = str5;
    }
}
