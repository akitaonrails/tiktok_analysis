package com.ss.android.ugc.aweme.ecommerce.showcase.service.api;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class MegaSaleProductListRequestBody {

    @C09CT("page_size")
    public final int pageSize;

    @C09CT("scroll_param")
    public final String scrollParam;

    @C09CT("seller_id")
    public final String sellerId;

    public MegaSaleProductListRequestBody(String str, int i, String str2) {
        this.sellerId = str;
        this.pageSize = i;
        this.scrollParam = str2;
    }
}
