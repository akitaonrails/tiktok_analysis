package com.ss.android.ugc.aweme.commercialize.ucp.api.model;

import X.C09CT;
import X.C786410Ut5;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class PdpSupplementData implements Serializable {

    @C09CT("arrival_days_desc")
    public final String arrivalDaysDesc;

    @C09CT("description")
    public final String description;

    @C09CT("discounts")
    public final List<SupplementDiscount> discounts;

    @C09CT("domain_for_display")
    public final String domainForDisplay;

    @C09CT("external_product_id")
    public final String externalProductId;

    @C09CT("external_shop_id")
    public final String externalShopId;

    @C09CT("from_recommendation_child_pdp")
    public final boolean fromRecommendationChildPdp;

    @C09CT("is_free_return")
    public final Integer isFreeReturn;

    @C09CT("is_free_shipping")
    public final Integer isFreeShipping;

    @C09CT("product_high_lights")
    public final List<String> productHighLights;

    @C09CT("product_platform_id")
    public final String productPlatformId;

    @C09CT("product_spu_image_list")
    public final List<String> productSpuImageList;

    @C09CT("promotion_text")
    public final String promotionText;

    @C09CT("protocol_type")
    public final Integer protocolType;

    @C09CT("return_requirement")
    public final List<String> returnRequirement;

    @C09CT("return_strategy")
    public final String returnStrategy;

    @C09CT("review")
    public final SupplementReview review;

    @C09CT("seller_profile_id")
    public final String sellerProfileId;

    @C09CT("selling_points")
    public final List<String> sellingPoints;

    @C09CT("shipping_policy_detail")
    public final String shippingPolicyDetail;

    @C09CT("shipping_strategy")
    public final String shippingStrategy;

    @C09CT("shop_id")
    public final String shopId;

    @C09CT("external_shop_logo_url")
    public final String shopLogoUrl;

    @C09CT("external_shop_name")
    public final String shopName;

    @C09CT("size_chart")
    public final String sizeChart;

    @C09CT("url")
    public final String url;

    @C09CT("variants")
    public final List<SupplementVariant> variants;

    public PdpSupplementData() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false);
    }

    public final PdpSupplementData copy(String str, String str2, List<String> list, List<String> list2, List<String> list3, String str3, String str4, String str5, Integer num, String str6, Integer num2, List<String> list4, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, List<SupplementVariant> list5, SupplementReview supplementReview, List<SupplementDiscount> list6, String str15, Integer num3, String str16, boolean z) {
        return new PdpSupplementData(str, str2, list, list2, list3, str3, str4, str5, num, str6, num2, list4, str7, str8, str9, str10, str11, str12, str13, str14, list5, supplementReview, list6, str15, num3, str16, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PdpSupplementData)) {
            return false;
        }
        PdpSupplementData pdpSupplementData = (PdpSupplementData) obj;
        return Intrinsics.LJFF(this.promotionText, pdpSupplementData.promotionText) && Intrinsics.LJFF(this.description, pdpSupplementData.description) && Intrinsics.LJFF(this.productSpuImageList, pdpSupplementData.productSpuImageList) && Intrinsics.LJFF(this.productHighLights, pdpSupplementData.productHighLights) && Intrinsics.LJFF(this.sellingPoints, pdpSupplementData.sellingPoints) && Intrinsics.LJFF(this.shippingStrategy, pdpSupplementData.shippingStrategy) && Intrinsics.LJFF(this.shippingPolicyDetail, pdpSupplementData.shippingPolicyDetail) && Intrinsics.LJFF(this.arrivalDaysDesc, pdpSupplementData.arrivalDaysDesc) && Intrinsics.LJFF(this.isFreeShipping, pdpSupplementData.isFreeShipping) && Intrinsics.LJFF(this.returnStrategy, pdpSupplementData.returnStrategy) && Intrinsics.LJFF(this.isFreeReturn, pdpSupplementData.isFreeReturn) && Intrinsics.LJFF(this.returnRequirement, pdpSupplementData.returnRequirement) && Intrinsics.LJFF(this.shopName, pdpSupplementData.shopName) && Intrinsics.LJFF(this.shopId, pdpSupplementData.shopId) && Intrinsics.LJFF(this.shopLogoUrl, pdpSupplementData.shopLogoUrl) && Intrinsics.LJFF(this.externalProductId, pdpSupplementData.externalProductId) && Intrinsics.LJFF(this.externalShopId, pdpSupplementData.externalShopId) && Intrinsics.LJFF(this.sellerProfileId, pdpSupplementData.sellerProfileId) && Intrinsics.LJFF(this.productPlatformId, pdpSupplementData.productPlatformId) && Intrinsics.LJFF(this.sizeChart, pdpSupplementData.sizeChart) && Intrinsics.LJFF(this.variants, pdpSupplementData.variants) && Intrinsics.LJFF(this.review, pdpSupplementData.review) && Intrinsics.LJFF(this.discounts, pdpSupplementData.discounts) && Intrinsics.LJFF(this.domainForDisplay, pdpSupplementData.domainForDisplay) && Intrinsics.LJFF(this.protocolType, pdpSupplementData.protocolType) && Intrinsics.LJFF(this.url, pdpSupplementData.url) && this.fromRecommendationChildPdp == pdpSupplementData.fromRecommendationChildPdp;
    }

    public int hashCode() {
        String str = this.promotionText;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.productSpuImageList;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.productHighLights;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.sellingPoints;
        int iHashCode5 = (iHashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str3 = this.shippingStrategy;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.shippingPolicyDetail;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.arrivalDaysDesc;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.isFreeShipping;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.returnStrategy;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num2 = this.isFreeReturn;
        int iHashCode11 = (iHashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<String> list4 = this.returnRequirement;
        int iHashCode12 = (iHashCode11 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str7 = this.shopName;
        int iHashCode13 = (iHashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.shopId;
        int iHashCode14 = (iHashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.shopLogoUrl;
        int iHashCode15 = (iHashCode14 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.externalProductId;
        int iHashCode16 = (iHashCode15 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.externalShopId;
        int iHashCode17 = (iHashCode16 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.sellerProfileId;
        int iHashCode18 = (iHashCode17 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.productPlatformId;
        int iHashCode19 = (iHashCode18 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.sizeChart;
        int iHashCode20 = (iHashCode19 + (str14 == null ? 0 : str14.hashCode())) * 31;
        List<SupplementVariant> list5 = this.variants;
        int iHashCode21 = (iHashCode20 + (list5 == null ? 0 : list5.hashCode())) * 31;
        SupplementReview supplementReview = this.review;
        int iHashCode22 = (iHashCode21 + (supplementReview == null ? 0 : supplementReview.hashCode())) * 31;
        List<SupplementDiscount> list6 = this.discounts;
        int iHashCode23 = (iHashCode22 + (list6 == null ? 0 : list6.hashCode())) * 31;
        String str15 = this.domainForDisplay;
        int iHashCode24 = (iHashCode23 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Integer num3 = this.protocolType;
        int iHashCode25 = (iHashCode24 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str16 = this.url;
        return ((iHashCode25 + (str16 != null ? str16.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.fromRecommendationChildPdp);
    }

    public String toString() {
        return "PdpSupplementData(promotionText=" + this.promotionText + ", description=" + this.description + ", productSpuImageList=" + this.productSpuImageList + ", productHighLights=" + this.productHighLights + ", sellingPoints=" + this.sellingPoints + ", shippingStrategy=" + this.shippingStrategy + ", shippingPolicyDetail=" + this.shippingPolicyDetail + ", arrivalDaysDesc=" + this.arrivalDaysDesc + ", isFreeShipping=" + this.isFreeShipping + ", returnStrategy=" + this.returnStrategy + ", isFreeReturn=" + this.isFreeReturn + ", returnRequirement=" + this.returnRequirement + ", shopName=" + this.shopName + ", shopId=" + this.shopId + ", shopLogoUrl=" + this.shopLogoUrl + ", externalProductId=" + this.externalProductId + ", externalShopId=" + this.externalShopId + ", sellerProfileId=" + this.sellerProfileId + ", productPlatformId=" + this.productPlatformId + ", sizeChart=" + this.sizeChart + ", variants=" + this.variants + ", review=" + this.review + ", discounts=" + this.discounts + ", domainForDisplay=" + this.domainForDisplay + ", protocolType=" + this.protocolType + ", url=" + this.url + ", fromRecommendationChildPdp=" + this.fromRecommendationChildPdp + ')';
    }

    public final Integer isFreeReturn() {
        return this.isFreeReturn;
    }

    public final Integer isFreeShipping() {
        return this.isFreeShipping;
    }

    public PdpSupplementData(String str, String str2, List<String> list, List<String> list2, List<String> list3, String str3, String str4, String str5, Integer num, String str6, Integer num2, List<String> list4, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, List<SupplementVariant> list5, SupplementReview supplementReview, List<SupplementDiscount> list6, String str15, Integer num3, String str16, boolean z) {
        this.promotionText = str;
        this.description = str2;
        this.productSpuImageList = list;
        this.productHighLights = list2;
        this.sellingPoints = list3;
        this.shippingStrategy = str3;
        this.shippingPolicyDetail = str4;
        this.arrivalDaysDesc = str5;
        this.isFreeShipping = num;
        this.returnStrategy = str6;
        this.isFreeReturn = num2;
        this.returnRequirement = list4;
        this.shopName = str7;
        this.shopId = str8;
        this.shopLogoUrl = str9;
        this.externalProductId = str10;
        this.externalShopId = str11;
        this.sellerProfileId = str12;
        this.productPlatformId = str13;
        this.sizeChart = str14;
        this.variants = list5;
        this.review = supplementReview;
        this.discounts = list6;
        this.domainForDisplay = str15;
        this.protocolType = num3;
        this.url = str16;
        this.fromRecommendationChildPdp = z;
    }
}
