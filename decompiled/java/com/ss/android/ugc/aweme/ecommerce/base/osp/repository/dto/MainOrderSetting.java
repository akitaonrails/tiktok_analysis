package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class MainOrderSetting {

    @C09CT("add_note_position")
    public Integer addNotePosition;

    @C09CT("change_product_count")
    public Integer changeProductCount;

    @C09CT("has_note")
    public Integer hasNote;

    @C09CT("logistics_display_type")
    public Integer logisticsDisplayType;

    @C09CT("low_stock_warning_style")
    public Integer lowStockWarningStyle;

    @C09CT("rights_display_style")
    public Integer rightsDisplayStyle;

    @C09CT("self_pickup_display_type")
    public Integer selfCollectionOpt;

    @C09CT("seller_coupon_style")
    public Integer sellerCouponStyle;

    @C09CT("shop_info_display_style")
    public Integer shopInfoDisplayStyle;

    @C09CT("sku_card_style")
    public Integer skuCardStyle;

    @C09CT("total_price_style")
    public Integer totalPriceStyle;

    @C09CT("use_coupon_applied_price_promotion_label")
    public Boolean useCouponAppliedPricePromotionLabel;

    public MainOrderSetting() {
        this(null, null, null, null, null, null, null, null, Boolean.FALSE, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MainOrderSetting)) {
            return false;
        }
        MainOrderSetting mainOrderSetting = (MainOrderSetting) obj;
        return Intrinsics.LJFF(this.changeProductCount, mainOrderSetting.changeProductCount) && Intrinsics.LJFF(this.hasNote, mainOrderSetting.hasNote) && Intrinsics.LJFF(this.skuCardStyle, mainOrderSetting.skuCardStyle) && Intrinsics.LJFF(this.addNotePosition, mainOrderSetting.addNotePosition) && Intrinsics.LJFF(this.sellerCouponStyle, mainOrderSetting.sellerCouponStyle) && Intrinsics.LJFF(this.shopInfoDisplayStyle, mainOrderSetting.shopInfoDisplayStyle) && Intrinsics.LJFF(this.rightsDisplayStyle, mainOrderSetting.rightsDisplayStyle) && Intrinsics.LJFF(this.lowStockWarningStyle, mainOrderSetting.lowStockWarningStyle) && Intrinsics.LJFF(this.useCouponAppliedPricePromotionLabel, mainOrderSetting.useCouponAppliedPricePromotionLabel) && Intrinsics.LJFF(this.logisticsDisplayType, mainOrderSetting.logisticsDisplayType) && Intrinsics.LJFF(this.totalPriceStyle, mainOrderSetting.totalPriceStyle) && Intrinsics.LJFF(this.selfCollectionOpt, mainOrderSetting.selfCollectionOpt);
    }

    public final int hashCode() {
        Integer num = this.changeProductCount;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.hasNote;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.skuCardStyle;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.addNotePosition;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.sellerCouponStyle;
        int iHashCode5 = (iHashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.shopInfoDisplayStyle;
        int iHashCode6 = (iHashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.rightsDisplayStyle;
        int iHashCode7 = (iHashCode6 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.lowStockWarningStyle;
        int iHashCode8 = (iHashCode7 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Boolean bool = this.useCouponAppliedPricePromotionLabel;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num9 = this.logisticsDisplayType;
        int iHashCode10 = (iHashCode9 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.totalPriceStyle;
        int iHashCode11 = (iHashCode10 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.selfCollectionOpt;
        return iHashCode11 + (num11 != null ? num11.hashCode() : 0);
    }

    public final String toString() {
        return "MainOrderSetting(changeProductCount=" + this.changeProductCount + ", hasNote=" + this.hasNote + ", skuCardStyle=" + this.skuCardStyle + ", addNotePosition=" + this.addNotePosition + ", sellerCouponStyle=" + this.sellerCouponStyle + ", shopInfoDisplayStyle=" + this.shopInfoDisplayStyle + ", rightsDisplayStyle=" + this.rightsDisplayStyle + ", lowStockWarningStyle=" + this.lowStockWarningStyle + ", useCouponAppliedPricePromotionLabel=" + this.useCouponAppliedPricePromotionLabel + ", logisticsDisplayType=" + this.logisticsDisplayType + ", totalPriceStyle=" + this.totalPriceStyle + ", selfCollectionOpt=" + this.selfCollectionOpt + ')';
    }

    public MainOrderSetting(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Boolean bool, Integer num9, Integer num10, Integer num11) {
        this.changeProductCount = num;
        this.hasNote = num2;
        this.skuCardStyle = num3;
        this.addNotePosition = num4;
        this.sellerCouponStyle = num5;
        this.shopInfoDisplayStyle = num6;
        this.rightsDisplayStyle = num7;
        this.lowStockWarningStyle = num8;
        this.useCouponAppliedPricePromotionLabel = bool;
        this.logisticsDisplayType = num9;
        this.totalPriceStyle = num10;
        this.selfCollectionOpt = num11;
    }
}
