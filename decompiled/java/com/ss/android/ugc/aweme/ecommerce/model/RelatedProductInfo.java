package com.ss.android.ugc.aweme.ecommerce.model;

import X.C09CT;
import X.C13LG;

/* JADX INFO: loaded from: classes33.dex */
public final class RelatedProductInfo {

    @C09CT("author_id")
    public final String authorId;

    @C09CT("click_product_id_list")
    public final C13LG<Long> clickProductIdList;

    @C09CT("expo_product_id_list")
    public final C13LG<Long> expoProductIdList;

    @C09CT("product_id_list")
    public final C13LG<Long> productIdList;

    @C09CT("session_impression_info")
    public final C13LG<Object> sessionImpressionInfo;

    @C09CT("video_id")
    public final String videoId;

    public RelatedProductInfo() {
        this(null, null, new C13LG(50), new C13LG(50), new C13LG(50), new C13LG(1));
    }

    public RelatedProductInfo(String str, String str2, C13LG<Long> c13lg, C13LG<Long> c13lg2, C13LG<Long> c13lg3, C13LG<Object> c13lg4) {
        this.videoId = str;
        this.authorId = str2;
        this.productIdList = c13lg;
        this.expoProductIdList = c13lg2;
        this.clickProductIdList = c13lg3;
        this.sessionImpressionInfo = c13lg4;
    }
}
