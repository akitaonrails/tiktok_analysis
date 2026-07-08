package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.dto;

import X.C09CT;
import X.C15438062q;
import com.ss.android.ugc.aweme.commercialize.ucp.api.model.PdpSupplementData;
import com.ss.android.ugc.aweme.commercialize.ucp.api.model.SupplementDiscount;
import com.ss.android.ugc.aweme.commercialize.ucp.api.model.SupplementReview;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class AcShopDetailDto implements Serializable {

    @C09CT("arrival_days_desc")
    public final String arrivalDaysDesc;

    @C09CT("channel_name")
    public final String channelName;

    @C09CT("description")
    public final String description;

    @C09CT("discounts")
    public final List<RecommendDiscountDto> discounts;

    @C09CT("external_shop_id")
    public final String externalShopId;

    @C09CT("is_free_return")
    public final Integer isFreeReturn;

    @C09CT("is_free_shipping")
    public final Integer isFreeShipping;

    @C09CT("product_high_lights")
    public final List<String> productHighLights;

    @C09CT("external_product_id")
    public final String productId;

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
    public final RecommendReviewSectionDto review;

    @C09CT("selling_points")
    public final List<String> sellingPoints;

    @C09CT("shipping_strategy")
    public final String shippingStrategy;

    @C09CT("shop_domain")
    public final String shopDomain;

    @C09CT("shop_id")
    public final String shopId;

    @C09CT("external_shop_logo_url")
    public final String shopLogoUrl;

    @C09CT("shop_name")
    public final String shopName;

    @C09CT("external_shop_name")
    public final String shopifyShopName;

    @C09CT("size_chart")
    public final String sizeChart;

    @C09CT("spu_id")
    public final String spuId;

    @C09CT("spu_image_url")
    public final String spuImageUrl;

    @C09CT("spu_name")
    public final String spuName;

    @C09CT("stripe_profile_id")
    public final String stripeProfileId;

    @C09CT("url")
    public final String url;

    @C09CT("variants")
    public final List<RecommendVariantDto> variants;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AcShopDetailDto)) {
            return false;
        }
        AcShopDetailDto acShopDetailDto = (AcShopDetailDto) obj;
        return Intrinsics.LJFF(this.protocolType, acShopDetailDto.protocolType) && Intrinsics.LJFF(this.spuId, acShopDetailDto.spuId) && Intrinsics.LJFF(this.spuName, acShopDetailDto.spuName) && Intrinsics.LJFF(this.shopId, acShopDetailDto.shopId) && Intrinsics.LJFF(this.shopName, acShopDetailDto.shopName) && Intrinsics.LJFF(this.spuImageUrl, acShopDetailDto.spuImageUrl) && Intrinsics.LJFF(this.productSpuImageList, acShopDetailDto.productSpuImageList) && Intrinsics.LJFF(this.productId, acShopDetailDto.productId) && Intrinsics.LJFF(this.shopDomain, acShopDetailDto.shopDomain) && Intrinsics.LJFF(this.shopifyShopName, acShopDetailDto.shopifyShopName) && Intrinsics.LJFF(this.channelName, acShopDetailDto.channelName) && Intrinsics.LJFF(this.promotionText, acShopDetailDto.promotionText) && Intrinsics.LJFF(this.description, acShopDetailDto.description) && Intrinsics.LJFF(this.discounts, acShopDetailDto.discounts) && Intrinsics.LJFF(this.productHighLights, acShopDetailDto.productHighLights) && Intrinsics.LJFF(this.sellingPoints, acShopDetailDto.sellingPoints) && Intrinsics.LJFF(this.shippingStrategy, acShopDetailDto.shippingStrategy) && Intrinsics.LJFF(this.arrivalDaysDesc, acShopDetailDto.arrivalDaysDesc) && Intrinsics.LJFF(this.isFreeShipping, acShopDetailDto.isFreeShipping) && Intrinsics.LJFF(this.returnStrategy, acShopDetailDto.returnStrategy) && Intrinsics.LJFF(this.isFreeReturn, acShopDetailDto.isFreeReturn) && Intrinsics.LJFF(this.returnRequirement, acShopDetailDto.returnRequirement) && Intrinsics.LJFF(this.shopLogoUrl, acShopDetailDto.shopLogoUrl) && Intrinsics.LJFF(this.externalShopId, acShopDetailDto.externalShopId) && Intrinsics.LJFF(this.productPlatformId, acShopDetailDto.productPlatformId) && Intrinsics.LJFF(this.stripeProfileId, acShopDetailDto.stripeProfileId) && Intrinsics.LJFF(this.url, acShopDetailDto.url) && Intrinsics.LJFF(this.sizeChart, acShopDetailDto.sizeChart) && Intrinsics.LJFF(this.variants, acShopDetailDto.variants) && Intrinsics.LJFF(this.review, acShopDetailDto.review);
    }

    public int hashCode() {
        Integer num = this.protocolType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.spuId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.spuName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.shopId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.shopName;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.spuImageUrl;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<String> list = this.productSpuImageList;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        String str6 = this.productId;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.shopDomain;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.shopifyShopName;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.channelName;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.promotionText;
        int iHashCode12 = (iHashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.description;
        int iHashCode13 = (iHashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        List<RecommendDiscountDto> list2 = this.discounts;
        int iHashCode14 = (iHashCode13 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.productHighLights;
        int iHashCode15 = (iHashCode14 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<String> list4 = this.sellingPoints;
        int iHashCode16 = (iHashCode15 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str12 = this.shippingStrategy;
        int iHashCode17 = (iHashCode16 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.arrivalDaysDesc;
        int iHashCode18 = (iHashCode17 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Integer num2 = this.isFreeShipping;
        int iHashCode19 = (iHashCode18 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str14 = this.returnStrategy;
        int iHashCode20 = (iHashCode19 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Integer num3 = this.isFreeReturn;
        int iHashCode21 = (iHashCode20 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List<String> list5 = this.returnRequirement;
        int iHashCode22 = (iHashCode21 + (list5 == null ? 0 : list5.hashCode())) * 31;
        String str15 = this.shopLogoUrl;
        int iHashCode23 = (iHashCode22 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.externalShopId;
        int iHashCode24 = (iHashCode23 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.productPlatformId;
        int iHashCode25 = (iHashCode24 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.stripeProfileId;
        int iHashCode26 = (iHashCode25 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.url;
        int iHashCode27 = (iHashCode26 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.sizeChart;
        int iHashCode28 = (iHashCode27 + (str20 == null ? 0 : str20.hashCode())) * 31;
        List<RecommendVariantDto> list6 = this.variants;
        int iHashCode29 = (iHashCode28 + (list6 == null ? 0 : list6.hashCode())) * 31;
        RecommendReviewSectionDto recommendReviewSectionDto = this.review;
        return iHashCode29 + (recommendReviewSectionDto != null ? recommendReviewSectionDto.hashCode() : 0);
    }

    public String toString() {
        return "AcShopDetailDto(protocolType=" + this.protocolType + ", spuId=" + this.spuId + ", spuName=" + this.spuName + ", shopId=" + this.shopId + ", shopName=" + this.shopName + ", spuImageUrl=" + this.spuImageUrl + ", productSpuImageList=" + this.productSpuImageList + ", productId=" + this.productId + ", shopDomain=" + this.shopDomain + ", shopifyShopName=" + this.shopifyShopName + ", channelName=" + this.channelName + ", promotionText=" + this.promotionText + ", description=" + this.description + ", discounts=" + this.discounts + ", productHighLights=" + this.productHighLights + ", sellingPoints=" + this.sellingPoints + ", shippingStrategy=" + this.shippingStrategy + ", arrivalDaysDesc=" + this.arrivalDaysDesc + ", isFreeShipping=" + this.isFreeShipping + ", returnStrategy=" + this.returnStrategy + ", isFreeReturn=" + this.isFreeReturn + ", returnRequirement=" + this.returnRequirement + ", shopLogoUrl=" + this.shopLogoUrl + ", externalShopId=" + this.externalShopId + ", productPlatformId=" + this.productPlatformId + ", stripeProfileId=" + this.stripeProfileId + ", url=" + this.url + ", sizeChart=" + this.sizeChart + ", variants=" + this.variants + ", review=" + this.review + ')';
    }

    public final PdpSupplementData toPdpSupplementData() {
        ArrayList arrayList;
        String str = this.promotionText;
        String str2 = this.description;
        List<String> list = this.productSpuImageList;
        List<String> list2 = this.productHighLights;
        List<String> list3 = this.sellingPoints;
        String str3 = this.shippingStrategy;
        String str4 = this.arrivalDaysDesc;
        Integer num = this.isFreeShipping;
        String str5 = this.returnStrategy;
        Integer num2 = this.isFreeReturn;
        List<String> list4 = this.returnRequirement;
        String str6 = this.shopifyShopName;
        if (str6 == null) {
            str6 = this.shopName;
        }
        String str7 = this.shopId;
        String str8 = this.shopLogoUrl;
        String str9 = this.productId;
        String str10 = this.externalShopId;
        String str11 = this.stripeProfileId;
        String str12 = this.productPlatformId;
        String str13 = this.url;
        String str14 = this.sizeChart;
        List<RecommendVariantDto> list5 = this.variants;
        ArrayList arrayList2 = null;
        if (list5 != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list5, 10));
            Iterator<RecommendVariantDto> it2 = list5.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().toSupplement());
            }
        } else {
            arrayList = null;
        }
        RecommendReviewSectionDto recommendReviewSectionDto = this.review;
        SupplementReview supplement = recommendReviewSectionDto != null ? recommendReviewSectionDto.toSupplement() : null;
        List<RecommendDiscountDto> list6 = this.discounts;
        if (list6 != null) {
            arrayList2 = new ArrayList(C15438062q.LJIJJ(list6, 10));
            for (RecommendDiscountDto recommendDiscountDto : list6) {
                arrayList2.add(new SupplementDiscount(recommendDiscountDto.code, recommendDiscountDto.scope, recommendDiscountDto.title, recommendDiscountDto.type));
            }
        }
        return new PdpSupplementData(str, str2, list, list2, list3, str3, null, str4, num, str5, num2, list4, str6, str7, str8, str9, str10, str11, str12, str14, arrayList, supplement, arrayList2, null, this.protocolType, str13, false);
    }

    public final Integer isFreeReturn() {
        return this.isFreeReturn;
    }

    public final Integer isFreeShipping() {
        return this.isFreeShipping;
    }

    public AcShopDetailDto(Integer num, String str, String str2, String str3, String str4, String str5, List<String> list, String str6, String str7, String str8, String str9, String str10, String str11, List<RecommendDiscountDto> list2, List<String> list3, List<String> list4, String str12, String str13, Integer num2, String str14, Integer num3, List<String> list5, String str15, String str16, String str17, String str18, String str19, String str20, List<RecommendVariantDto> list6, RecommendReviewSectionDto recommendReviewSectionDto) {
        this.protocolType = num;
        this.spuId = str;
        this.spuName = str2;
        this.shopId = str3;
        this.shopName = str4;
        this.spuImageUrl = str5;
        this.productSpuImageList = list;
        this.productId = str6;
        this.shopDomain = str7;
        this.shopifyShopName = str8;
        this.channelName = str9;
        this.promotionText = str10;
        this.description = str11;
        this.discounts = list2;
        this.productHighLights = list3;
        this.sellingPoints = list4;
        this.shippingStrategy = str12;
        this.arrivalDaysDesc = str13;
        this.isFreeShipping = num2;
        this.returnStrategy = str14;
        this.isFreeReturn = num3;
        this.returnRequirement = list5;
        this.shopLogoUrl = str15;
        this.externalShopId = str16;
        this.productPlatformId = str17;
        this.stripeProfileId = str18;
        this.url = str19;
        this.sizeChart = str20;
        this.variants = list6;
        this.review = recommendReviewSectionDto;
    }
}
