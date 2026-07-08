package com.ss.android.ugc.aweme.ecommerce.search.vision.repo;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class HistoryProduct {

    @C09CT("images")
    public final List<Image> images;

    @C09CT("magellan_product_id")
    public final String productId;

    @C09CT("title")
    public final String productTitle;

    @C09CT("seller_id")
    public final String sellerId;

    @C09CT("view_time_stamp")
    public final String timeStamp;

    public HistoryProduct(String str, String str2, List<Image> list, String str3, String str4) {
        this.productId = str;
        this.productTitle = str2;
        this.images = list;
        this.sellerId = str3;
        this.timeStamp = str4;
    }
}
