package com.ss.android.ugc.aweme.poi.osp.repo.model;

import X.C09CT;
import X.C1193480hAA;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class SkuData {
    public static final C1193480hAA Companion = new Object() { // from class: X.0hAA
    };

    @C09CT("buy_limit")
    public final SkuQuantityLimit buyLimit;

    @C09CT("extra_map")
    public final Map<String, String> extraMap;

    @C09CT("guidelines")
    public final Guidelines guidelines;

    @C09CT("image")
    public final UrlModel image;

    @C09CT("is_out_of_stock")
    public final Boolean isOutOfStock;

    @C09CT("merchant_id")
    public final String merchantId;

    @C09CT("name")
    public final String name;

    @C09CT("num")
    public final Integer num;

    @C09CT("out_of_stock_text")
    public final String outOfStockText;

    @C09CT("price")
    public final SkuPrice price;

    @C09CT("product_id")
    public final String productId;

    @C09CT("sku_id")
    public final String skuId;

    @C09CT("sub_tag")
    public final String subTag;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuData)) {
            return false;
        }
        SkuData skuData = (SkuData) obj;
        return Intrinsics.LJFF(this.skuId, skuData.skuId) && Intrinsics.LJFF(this.productId, skuData.productId) && Intrinsics.LJFF(this.name, skuData.name) && Intrinsics.LJFF(this.subTag, skuData.subTag) && Intrinsics.LJFF(this.num, skuData.num) && Intrinsics.LJFF(this.image, skuData.image) && Intrinsics.LJFF(this.buyLimit, skuData.buyLimit) && Intrinsics.LJFF(this.price, skuData.price) && Intrinsics.LJFF(this.merchantId, skuData.merchantId) && Intrinsics.LJFF(this.isOutOfStock, skuData.isOutOfStock) && Intrinsics.LJFF(this.outOfStockText, skuData.outOfStockText) && Intrinsics.LJFF(this.guidelines, skuData.guidelines) && Intrinsics.LJFF(this.extraMap, skuData.extraMap);
    }

    public int hashCode() {
        String str = this.skuId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.productId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.subTag;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.num;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        UrlModel urlModel = this.image;
        int iHashCode6 = (iHashCode5 + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        SkuQuantityLimit skuQuantityLimit = this.buyLimit;
        int iHashCode7 = (iHashCode6 + (skuQuantityLimit == null ? 0 : skuQuantityLimit.hashCode())) * 31;
        SkuPrice skuPrice = this.price;
        int iHashCode8 = (iHashCode7 + (skuPrice == null ? 0 : skuPrice.hashCode())) * 31;
        String str5 = this.merchantId;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.isOutOfStock;
        int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str6 = this.outOfStockText;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Guidelines guidelines = this.guidelines;
        int iHashCode12 = (iHashCode11 + (guidelines == null ? 0 : guidelines.hashCode())) * 31;
        Map<String, String> map = this.extraMap;
        return iHashCode12 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "SkuData(skuId=" + this.skuId + ", productId=" + this.productId + ", name=" + this.name + ", subTag=" + this.subTag + ", num=" + this.num + ", image=" + this.image + ", buyLimit=" + this.buyLimit + ", price=" + this.price + ", merchantId=" + this.merchantId + ", isOutOfStock=" + this.isOutOfStock + ", outOfStockText=" + this.outOfStockText + ", guidelines=" + this.guidelines + ", extraMap=" + this.extraMap + ')';
    }

    public final String resolveExclusiveDealText() {
        String str;
        Map<String, String> map = this.extraMap;
        if (map == null || (str = map.get("exclusive_deal_text")) == null || str.length() <= 0) {
            return null;
        }
        return str;
    }

    public final Boolean isOutOfStock() {
        return this.isOutOfStock;
    }

    public SkuData(String str, String str2, String str3, String str4, Integer num, UrlModel urlModel, SkuQuantityLimit skuQuantityLimit, SkuPrice skuPrice, String str5, Boolean bool, String str6, Guidelines guidelines, Map<String, String> map) {
        this.skuId = str;
        this.productId = str2;
        this.name = str3;
        this.subTag = str4;
        this.num = num;
        this.image = urlModel;
        this.buyLimit = skuQuantityLimit;
        this.price = skuPrice;
        this.merchantId = str5;
        this.isOutOfStock = bool;
        this.outOfStockText = str6;
        this.guidelines = guidelines;
        this.extraMap = map;
    }
}
