package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PromotionCouponModule {

    @C09CT("banner_text")
    public String bannerText;

    @C09CT("button_text")
    public String buttonText;

    @C09CT("coupon_price")
    public ECRichText couponPrice;

    @C09CT("description_text")
    public ECRichText description;

    @C09CT("promotion_coupon_module_type")
    public Integer promotionCouponModuleType;

    @C09CT("selected_status")
    public Integer selectedStatus;

    @C09CT("style_type")
    public Integer styleType;

    @C09CT("sub_item")
    public List<PromotionCouponModuleSubItem> subItem;

    @C09CT("tc_schema")
    public String tcSchema;

    @C09CT("tc_title")
    public String tcTitle;

    @C09CT("title")
    public String title;

    @C09CT("title_icon")
    public Icon titleIcon;

    @C09CT("vap_schema")
    public String vapSchema;

    public PromotionCouponModule() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromotionCouponModule)) {
            return false;
        }
        PromotionCouponModule promotionCouponModule = (PromotionCouponModule) obj;
        return Intrinsics.LJFF(this.title, promotionCouponModule.title) && Intrinsics.LJFF(this.titleIcon, promotionCouponModule.titleIcon) && Intrinsics.LJFF(this.styleType, promotionCouponModule.styleType) && Intrinsics.LJFF(this.bannerText, promotionCouponModule.bannerText) && Intrinsics.LJFF(this.tcTitle, promotionCouponModule.tcTitle) && Intrinsics.LJFF(this.tcSchema, promotionCouponModule.tcSchema) && Intrinsics.LJFF(this.buttonText, promotionCouponModule.buttonText) && Intrinsics.LJFF(this.description, promotionCouponModule.description) && Intrinsics.LJFF(this.vapSchema, promotionCouponModule.vapSchema) && Intrinsics.LJFF(this.promotionCouponModuleType, promotionCouponModule.promotionCouponModuleType) && Intrinsics.LJFF(this.subItem, promotionCouponModule.subItem) && Intrinsics.LJFF(this.couponPrice, promotionCouponModule.couponPrice) && Intrinsics.LJFF(this.selectedStatus, promotionCouponModule.selectedStatus);
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Icon icon = this.titleIcon;
        int iHashCode2 = (iHashCode + (icon == null ? 0 : icon.hashCode())) * 31;
        Integer num = this.styleType;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.bannerText;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tcTitle;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.tcSchema;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.buttonText;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        ECRichText eCRichText = this.description;
        int iHashCode8 = (iHashCode7 + (eCRichText == null ? 0 : eCRichText.hashCode())) * 31;
        String str6 = this.vapSchema;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num2 = this.promotionCouponModuleType;
        int iHashCode10 = (iHashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<PromotionCouponModuleSubItem> list = this.subItem;
        int iHashCode11 = (iHashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        ECRichText eCRichText2 = this.couponPrice;
        int iHashCode12 = (iHashCode11 + (eCRichText2 == null ? 0 : eCRichText2.hashCode())) * 31;
        Integer num3 = this.selectedStatus;
        return iHashCode12 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return "PromotionCouponModule(title=" + this.title + ", titleIcon=" + this.titleIcon + ", styleType=" + this.styleType + ", bannerText=" + this.bannerText + ", tcTitle=" + this.tcTitle + ", tcSchema=" + this.tcSchema + ", buttonText=" + this.buttonText + ", description=" + this.description + ", vapSchema=" + this.vapSchema + ", promotionCouponModuleType=" + this.promotionCouponModuleType + ", subItem=" + this.subItem + ", couponPrice=" + this.couponPrice + ", selectedStatus=" + this.selectedStatus + ')';
    }

    public PromotionCouponModule(String str, Icon icon, Integer num, String str2, String str3, String str4, String str5, ECRichText eCRichText, String str6, Integer num2, List<PromotionCouponModuleSubItem> list, ECRichText eCRichText2, Integer num3) {
        this.title = str;
        this.titleIcon = icon;
        this.styleType = num;
        this.bannerText = str2;
        this.tcTitle = str3;
        this.tcSchema = str4;
        this.buttonText = str5;
        this.description = eCRichText;
        this.vapSchema = str6;
        this.promotionCouponModuleType = num2;
        this.subItem = list;
        this.couponPrice = eCRichText2;
        this.selectedStatus = num3;
    }
}
