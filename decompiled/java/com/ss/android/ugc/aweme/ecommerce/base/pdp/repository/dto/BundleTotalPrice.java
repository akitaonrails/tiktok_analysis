package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class BundleTotalPrice {

    @C09CT("activity_id")
    public final String activityId;

    @C09CT("price")
    public final BundlePrice price;

    @C09CT("save_title")
    public final String saveTitle;

    @C09CT("total_title")
    public final String totalTitle;

    public BundleTotalPrice(String str, String str2, BundlePrice bundlePrice, String str3) {
        this.saveTitle = str;
        this.totalTitle = str2;
        this.price = bundlePrice;
        this.activityId = str3;
    }
}
