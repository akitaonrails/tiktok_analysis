package com.ss.android.ugc.aweme.search.ecom.data;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class ProductGroup {

    @C09CT("author_type")
    public final Integer authorType;

    @C09CT("creator_showcase_text")
    public final CreatorShowcaseText creatorShowcaseText;

    @C09CT("creator_showcase_type")
    public final Integer creatorShowcaseType;

    @C09CT("has_more")
    public final Boolean hasMore;

    @C09CT("product_list")
    public final List<Product> productList;

    @C09CT("product_volume")
    public final Integer productVolume;

    @C09CT("schema")
    public final String schema;

    @C09CT("shop_icon")
    public final ShopIcon shopIcon;

    @C09CT("shop_id")
    public final String shopId;

    @C09CT("shop_type")
    public final Integer shopType;

    @C09CT("show_entrance")
    public final Boolean showEntrance;

    @C09CT("sold_count")
    public final String soldCount;

    @C09CT("total")
    public final Integer total;

    public ProductGroup() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public ProductGroup(Boolean bool, List<Product> list, Integer num, Boolean bool2, Integer num2, String str, String str2, Integer num3, CreatorShowcaseText creatorShowcaseText, Integer num4, ShopIcon shopIcon, String str3, Integer num5) {
        this.hasMore = bool;
        this.productList = list;
        this.total = num;
        this.showEntrance = bool2;
        this.shopType = num2;
        this.schema = str;
        this.shopId = str2;
        this.authorType = num3;
        this.creatorShowcaseText = creatorShowcaseText;
        this.creatorShowcaseType = num4;
        this.shopIcon = shopIcon;
        this.soldCount = str3;
        this.productVolume = num5;
    }
}
