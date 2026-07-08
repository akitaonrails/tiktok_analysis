package com.ss.android.ugc.aweme.ecommerce.anchor.showcase.models;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public final class ShopProductInfo implements Serializable {

    @C09CT("schema")
    public final String schema;

    @C09CT("shop_name")
    public final String shopName;

    @C09CT("shop_product_extra_info")
    public final ShopProductExtraInfo shopProductExtraInfo;

    @C09CT("shop_product_id_list")
    public final List<String> shopProductIdList;

    public ShopProductInfo() {
        this(null, null, null, null);
    }

    public ShopProductInfo(List<String> list, String str, ShopProductExtraInfo shopProductExtraInfo, String str2) {
        this.shopProductIdList = list;
        this.shopName = str;
        this.shopProductExtraInfo = shopProductExtraInfo;
        this.schema = str2;
    }
}
