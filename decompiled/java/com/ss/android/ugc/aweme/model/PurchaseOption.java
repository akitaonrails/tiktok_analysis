package com.ss.android.ugc.aweme.model;

import X.C09CT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class PurchaseOption implements Serializable {
    public static final int $stable = 8;

    @C09CT("discount_id")
    public final Long discountId;

    @C09CT("discount_percentage")
    public final int discountPercentage;

    @C09CT("discounted_price")
    public final PriceInfo discountedPrice;

    @C09CT("discount_string")
    public final String discountedString;

    @C09CT("is_best")
    public final Boolean isBest;

    @C09CT("is_hot")
    public final Boolean isHot;

    @C09CT("num_videos")
    public final int numVideos;

    @C09CT("price")
    public final PriceInfo price;

    @C09CT("purchase_category")
    public final PurchaseCategory purchaseCategory;

    @C09CT("title")
    public final String title;

    public PurchaseOption() {
        this(0, null, "", PurchaseCategory.PURCHASE_CATEGORY_DEFAULT_OPTION, null, null, null, null, 0, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseOption)) {
            return false;
        }
        PurchaseOption purchaseOption = (PurchaseOption) obj;
        return this.numVideos == purchaseOption.numVideos && Intrinsics.LJFF(this.price, purchaseOption.price) && Intrinsics.LJFF(this.title, purchaseOption.title) && this.purchaseCategory == purchaseOption.purchaseCategory && Intrinsics.LJFF(this.discountedPrice, purchaseOption.discountedPrice) && Intrinsics.LJFF(this.discountedString, purchaseOption.discountedString) && Intrinsics.LJFF(this.discountId, purchaseOption.discountId) && Intrinsics.LJFF(this.isHot, purchaseOption.isHot) && this.discountPercentage == purchaseOption.discountPercentage && Intrinsics.LJFF(this.isBest, purchaseOption.isBest);
    }

    public final Boolean isBest() {
        return this.isBest;
    }

    public final Boolean isHot() {
        return this.isHot;
    }

    public PurchaseOption(int i, PriceInfo priceInfo, String str, PurchaseCategory purchaseCategory, PriceInfo priceInfo2, String str2, Long l, Boolean bool, int i2, Boolean bool2) {
        this.numVideos = i;
        this.price = priceInfo;
        this.title = str;
        this.purchaseCategory = purchaseCategory;
        this.discountedPrice = priceInfo2;
        this.discountedString = str2;
        this.discountId = l;
        this.isHot = bool;
        this.discountPercentage = i2;
        this.isBest = bool2;
    }
}
