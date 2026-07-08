package com.ss.android.ugc.aweme.components.purchaseoption;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class PurchaseOptionWithPrice {

    @C09CT("discount_tag")
    public final String discountTag;

    @C09CT("discounted_price")
    public final PricePacket discountedPrice;

    @C09CT("is_full_width")
    public final boolean isFullWidth;

    @C09CT("original_price")
    public final PricePacket originalPrice;

    @C09CT("promotion_text")
    public final String promotionText;

    @C09CT("purchase_category")
    public final MarketplacePurchaseCategory purchaseCategory;

    @C09CT("sku_ids")
    public final List<String> skuIds;

    @C09CT("subtitle")
    public final String subtitle;

    @C09CT("title")
    public final String title;

    public PurchaseOptionWithPrice() {
        this(null, null, null, null, null, null, null, false, null, 511, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseOptionWithPrice)) {
            return false;
        }
        PurchaseOptionWithPrice purchaseOptionWithPrice = (PurchaseOptionWithPrice) obj;
        return Intrinsics.LJFF(this.skuIds, purchaseOptionWithPrice.skuIds) && Intrinsics.LJFF(this.title, purchaseOptionWithPrice.title) && Intrinsics.LJFF(this.subtitle, purchaseOptionWithPrice.subtitle) && Intrinsics.LJFF(this.promotionText, purchaseOptionWithPrice.promotionText) && Intrinsics.LJFF(this.originalPrice, purchaseOptionWithPrice.originalPrice) && Intrinsics.LJFF(this.discountedPrice, purchaseOptionWithPrice.discountedPrice) && Intrinsics.LJFF(this.discountTag, purchaseOptionWithPrice.discountTag) && this.isFullWidth == purchaseOptionWithPrice.isFullWidth && this.purchaseCategory == purchaseOptionWithPrice.purchaseCategory;
    }

    public PurchaseOptionWithPrice(List<String> list, String str, String str2, String str3, PricePacket pricePacket, PricePacket pricePacket2, String str4, boolean z, MarketplacePurchaseCategory marketplacePurchaseCategory) {
        this.skuIds = list;
        this.title = str;
        this.subtitle = str2;
        this.promotionText = str3;
        this.originalPrice = pricePacket;
        this.discountedPrice = pricePacket2;
        this.discountTag = str4;
        this.isFullWidth = z;
        this.purchaseCategory = marketplacePurchaseCategory;
    }

    public PurchaseOptionWithPrice(List list, String str, String str2, String str3, PricePacket pricePacket, PricePacket pricePacket2, String str4, boolean z, MarketplacePurchaseCategory marketplacePurchaseCategory, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? new PricePacket(null, null, null, null) : pricePacket, (i & 32) != 0 ? null : pricePacket2, (i & 64) == 0 ? str4 : "", (i & 128) != 0 ? false : z, (i & 256) != 0 ? MarketplacePurchaseCategory.MARKETPLACE_PURCHASE_CATEGORY_DEFAULT : marketplacePurchaseCategory);
    }
}
