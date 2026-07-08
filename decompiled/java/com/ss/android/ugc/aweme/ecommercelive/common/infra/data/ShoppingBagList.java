package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public final class ShoppingBagList {

    @C09CT("avatar_url")
    public final String avatarUrl;

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("product_list")
    public final List<Product> productList;

    @C09CT("product_num")
    public final int productNum;

    @C09CT("title")
    public final String title;

    @C09CT("title_info")
    public final CardTitleInfo titleInfo;

    public ShoppingBagList() {
        this(null, 0, "", "", null, null);
    }

    public ShoppingBagList(List<Product> list, int i, String str, String str2, String str3, CardTitleInfo cardTitleInfo) {
        this.productList = list;
        this.productNum = i;
        this.avatarUrl = str;
        this.title = str2;
        this.daInfo = str3;
        this.titleInfo = cardTitleInfo;
    }
}
