package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.lockup;

import X.C09CT;
import X.C705102p7;
import X.C786410Ut5;
import X.EnumC1752690vi7;
import X.InterfaceC997603vC;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.header.section.model.PromotionActivityInfoModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrandInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickStyle;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CombinedSalesVolume;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LockUpBadge;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PriceDescDetail;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PriceDescDetailItem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductDetailReview;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductLogo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPrice;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPriceV2;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionExtraInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RangePrice;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SinglePriceItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.PreOrderInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PlacementLabel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class UsProductInfoVO implements InterfaceC997603vC {
    public Integer bizType;
    public final BrandInfo brandInfo;
    public int brickName = EnumC1752690vi7.PRODUCT_INFO.getValue();
    public BrickStyle brickStyle;
    public boolean clientAddMarginTop;
    public final CombinedSalesVolume combinedSalesVolume;
    public final String deductionText;
    public final String discount;
    public final LinkRichText globalShippingTag;
    public final ECRichText globalShippingTagECRichText;
    public String hybridExtra;
    public final Boolean isFavorite;
    public boolean isFullScreen;
    public boolean isPlatform;

    @C09CT("is_price_hidden")
    public boolean isPriceHidden;
    public final LockUpBadge lockUpBadge;
    public final String lockUpStaticSellingPoint;
    public final SinglePriceItem minPrice;
    public final boolean needDivider;
    public final String originPrice;
    public final List<PlacementLabel> placementLabels;
    public final PreOrderInfo preOrderInfo;
    public ProductPrice price;
    public final List<LinkRichText> priceAdditionalList;
    public final PriceDescDetail priceDescDetail;
    public final List<PriceDescDetailItem> priceDescDetailList;
    public List<ProductPriceV2> priceV2;
    public final List<ProductLogo> productLogos;
    public final PromotionActivityInfoModel promotionActivityInfoModel;
    public final PromotionExtraInfo promotionExtraInfo;
    public final String purchaseLimit;
    public final RangePrice rangePrice;
    public final String realPrice;
    public final ProductDetailReview review;
    public final SellerInfo sellerInfo;

    @C09CT("sku_id")
    public final String skuId;
    public List<SkuItem> skus;
    public final Integer soldCount;
    public final List<String> sortList;
    public final List<String> sortListV2;
    public final String taxDescription;
    public final String title;
    public final String unitPriceDescription;
    public static final C705102p7 Companion = new Object() { // from class: X.02p7
    };
    public static final int $stable = 8;

    public final UsProductInfoVO copy(String str, String str2, String str3, String str4, String str5, List<ProductLogo> list, ProductDetailReview productDetailReview, CombinedSalesVolume combinedSalesVolume, PromotionActivityInfoModel promotionActivityInfoModel, List<LinkRichText> list2, Boolean bool, Integer num, boolean z, List<String> list3, List<String> list4, BrandInfo brandInfo, LinkRichText linkRichText, ECRichText eCRichText, SellerInfo sellerInfo, PreOrderInfo preOrderInfo, PromotionExtraInfo promotionExtraInfo, String str6, String str7, String str8, List<PriceDescDetailItem> list5, PriceDescDetail priceDescDetail, LockUpBadge lockUpBadge, String str9, String str10, List<PlacementLabel> list6, List<ProductPriceV2> list7, SinglePriceItem singlePriceItem, RangePrice rangePrice, boolean z2, Integer num2, ProductPrice productPrice, boolean z3, boolean z4, String str11, List<SkuItem> list8, boolean z5) {
        return new UsProductInfoVO(str, str2, str3, str4, str5, list, productDetailReview, combinedSalesVolume, promotionActivityInfoModel, list2, bool, num, z, list3, list4, brandInfo, linkRichText, eCRichText, sellerInfo, preOrderInfo, promotionExtraInfo, str6, str7, str8, list5, priceDescDetail, lockUpBadge, str9, str10, list6, list7, singlePriceItem, rangePrice, z2, num2, productPrice, z3, z4, str11, list8, z5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsProductInfoVO)) {
            return false;
        }
        UsProductInfoVO usProductInfoVO = (UsProductInfoVO) obj;
        return Intrinsics.LJFF(this.title, usProductInfoVO.title) && Intrinsics.LJFF(this.realPrice, usProductInfoVO.realPrice) && Intrinsics.LJFF(this.originPrice, usProductInfoVO.originPrice) && Intrinsics.LJFF(this.discount, usProductInfoVO.discount) && Intrinsics.LJFF(this.purchaseLimit, usProductInfoVO.purchaseLimit) && Intrinsics.LJFF(this.productLogos, usProductInfoVO.productLogos) && Intrinsics.LJFF(this.review, usProductInfoVO.review) && Intrinsics.LJFF(this.combinedSalesVolume, usProductInfoVO.combinedSalesVolume) && Intrinsics.LJFF(this.promotionActivityInfoModel, usProductInfoVO.promotionActivityInfoModel) && Intrinsics.LJFF(this.priceAdditionalList, usProductInfoVO.priceAdditionalList) && Intrinsics.LJFF(this.isFavorite, usProductInfoVO.isFavorite) && Intrinsics.LJFF(this.soldCount, usProductInfoVO.soldCount) && this.needDivider == usProductInfoVO.needDivider && Intrinsics.LJFF(this.sortList, usProductInfoVO.sortList) && Intrinsics.LJFF(this.sortListV2, usProductInfoVO.sortListV2) && Intrinsics.LJFF(this.brandInfo, usProductInfoVO.brandInfo) && Intrinsics.LJFF(this.globalShippingTag, usProductInfoVO.globalShippingTag) && Intrinsics.LJFF(this.globalShippingTagECRichText, usProductInfoVO.globalShippingTagECRichText) && Intrinsics.LJFF(this.sellerInfo, usProductInfoVO.sellerInfo) && Intrinsics.LJFF(this.preOrderInfo, usProductInfoVO.preOrderInfo) && Intrinsics.LJFF(this.promotionExtraInfo, usProductInfoVO.promotionExtraInfo) && Intrinsics.LJFF(this.deductionText, usProductInfoVO.deductionText) && Intrinsics.LJFF(this.taxDescription, usProductInfoVO.taxDescription) && Intrinsics.LJFF(this.unitPriceDescription, usProductInfoVO.unitPriceDescription) && Intrinsics.LJFF(this.priceDescDetailList, usProductInfoVO.priceDescDetailList) && Intrinsics.LJFF(this.priceDescDetail, usProductInfoVO.priceDescDetail) && Intrinsics.LJFF(this.lockUpBadge, usProductInfoVO.lockUpBadge) && Intrinsics.LJFF(this.lockUpStaticSellingPoint, usProductInfoVO.lockUpStaticSellingPoint) && Intrinsics.LJFF(this.skuId, usProductInfoVO.skuId) && Intrinsics.LJFF(this.placementLabels, usProductInfoVO.placementLabels) && Intrinsics.LJFF(this.priceV2, usProductInfoVO.priceV2) && Intrinsics.LJFF(this.minPrice, usProductInfoVO.minPrice) && Intrinsics.LJFF(this.rangePrice, usProductInfoVO.rangePrice) && this.isFullScreen == usProductInfoVO.isFullScreen && Intrinsics.LJFF(this.bizType, usProductInfoVO.bizType) && Intrinsics.LJFF(this.price, usProductInfoVO.price) && this.clientAddMarginTop == usProductInfoVO.clientAddMarginTop && this.isPlatform == usProductInfoVO.isPlatform && Intrinsics.LJFF(this.hybridExtra, usProductInfoVO.hybridExtra) && Intrinsics.LJFF(this.skus, usProductInfoVO.skus) && this.isPriceHidden == usProductInfoVO.isPriceHidden;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.realPrice;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.originPrice;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.discount;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.purchaseLimit;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<ProductLogo> list = this.productLogos;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        ProductDetailReview productDetailReview = this.review;
        int iHashCode7 = (iHashCode6 + (productDetailReview == null ? 0 : productDetailReview.hashCode())) * 31;
        CombinedSalesVolume combinedSalesVolume = this.combinedSalesVolume;
        int iHashCode8 = (iHashCode7 + (combinedSalesVolume == null ? 0 : combinedSalesVolume.hashCode())) * 31;
        PromotionActivityInfoModel promotionActivityInfoModel = this.promotionActivityInfoModel;
        int iHashCode9 = (iHashCode8 + (promotionActivityInfoModel == null ? 0 : promotionActivityInfoModel.hashCode())) * 31;
        List<LinkRichText> list2 = this.priceAdditionalList;
        int iHashCode10 = (iHashCode9 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.isFavorite;
        int iHashCode11 = (iHashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.soldCount;
        int iHashCode12 = (((iHashCode11 + (num == null ? 0 : num.hashCode())) * 31) + C786410Ut5.Z2(this.needDivider)) * 31;
        List<String> list3 = this.sortList;
        int iHashCode13 = (iHashCode12 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<String> list4 = this.sortListV2;
        int iHashCode14 = (iHashCode13 + (list4 == null ? 0 : list4.hashCode())) * 31;
        BrandInfo brandInfo = this.brandInfo;
        int iHashCode15 = (iHashCode14 + (brandInfo == null ? 0 : brandInfo.hashCode())) * 31;
        LinkRichText linkRichText = this.globalShippingTag;
        int iHashCode16 = (iHashCode15 + (linkRichText == null ? 0 : linkRichText.hashCode())) * 31;
        ECRichText eCRichText = this.globalShippingTagECRichText;
        int iHashCode17 = (iHashCode16 + (eCRichText == null ? 0 : eCRichText.hashCode())) * 31;
        SellerInfo sellerInfo = this.sellerInfo;
        int iHashCode18 = (iHashCode17 + (sellerInfo == null ? 0 : sellerInfo.hashCode())) * 31;
        PreOrderInfo preOrderInfo = this.preOrderInfo;
        int iHashCode19 = (iHashCode18 + (preOrderInfo == null ? 0 : preOrderInfo.hashCode())) * 31;
        PromotionExtraInfo promotionExtraInfo = this.promotionExtraInfo;
        int iHashCode20 = (iHashCode19 + (promotionExtraInfo == null ? 0 : promotionExtraInfo.hashCode())) * 31;
        String str6 = this.deductionText;
        int iHashCode21 = (iHashCode20 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.taxDescription;
        int iHashCode22 = (iHashCode21 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.unitPriceDescription;
        int iHashCode23 = (iHashCode22 + (str8 == null ? 0 : str8.hashCode())) * 31;
        List<PriceDescDetailItem> list5 = this.priceDescDetailList;
        int iHashCode24 = (iHashCode23 + (list5 == null ? 0 : list5.hashCode())) * 31;
        PriceDescDetail priceDescDetail = this.priceDescDetail;
        int iHashCode25 = (iHashCode24 + (priceDescDetail == null ? 0 : priceDescDetail.hashCode())) * 31;
        LockUpBadge lockUpBadge = this.lockUpBadge;
        int iHashCode26 = (iHashCode25 + (lockUpBadge == null ? 0 : lockUpBadge.hashCode())) * 31;
        String str9 = this.lockUpStaticSellingPoint;
        int iHashCode27 = (iHashCode26 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.skuId;
        int iHashCode28 = (iHashCode27 + (str10 == null ? 0 : str10.hashCode())) * 31;
        List<PlacementLabel> list6 = this.placementLabels;
        int iHashCode29 = (iHashCode28 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<ProductPriceV2> list7 = this.priceV2;
        int iHashCode30 = (iHashCode29 + (list7 == null ? 0 : list7.hashCode())) * 31;
        SinglePriceItem singlePriceItem = this.minPrice;
        int iHashCode31 = (iHashCode30 + (singlePriceItem == null ? 0 : singlePriceItem.hashCode())) * 31;
        RangePrice rangePrice = this.rangePrice;
        int iHashCode32 = (((iHashCode31 + (rangePrice == null ? 0 : rangePrice.hashCode())) * 31) + C786410Ut5.Z2(this.isFullScreen)) * 31;
        Integer num2 = this.bizType;
        int iHashCode33 = (iHashCode32 + (num2 == null ? 0 : num2.hashCode())) * 31;
        ProductPrice productPrice = this.price;
        int iHashCode34 = (((((iHashCode33 + (productPrice == null ? 0 : productPrice.hashCode())) * 31) + C786410Ut5.Z2(this.clientAddMarginTop)) * 31) + C786410Ut5.Z2(this.isPlatform)) * 31;
        String str11 = this.hybridExtra;
        int iHashCode35 = (iHashCode34 + (str11 == null ? 0 : str11.hashCode())) * 31;
        List<SkuItem> list8 = this.skus;
        return ((iHashCode35 + (list8 != null ? list8.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.isPriceHidden);
    }

    public String toString() {
        return "UsProductInfoVO(title=" + this.title + ", realPrice=" + this.realPrice + ", originPrice=" + this.originPrice + ", discount=" + this.discount + ", purchaseLimit=" + this.purchaseLimit + ", productLogos=" + this.productLogos + ", review=" + this.review + ", combinedSalesVolume=" + this.combinedSalesVolume + ", promotionActivityInfoModel=" + this.promotionActivityInfoModel + ", priceAdditionalList=" + this.priceAdditionalList + ", isFavorite=" + this.isFavorite + ", soldCount=" + this.soldCount + ", needDivider=" + this.needDivider + ", sortList=" + this.sortList + ", sortListV2=" + this.sortListV2 + ", brandInfo=" + this.brandInfo + ", globalShippingTag=" + this.globalShippingTag + ", globalShippingTagECRichText=" + this.globalShippingTagECRichText + ", sellerInfo=" + this.sellerInfo + ", preOrderInfo=" + this.preOrderInfo + ", promotionExtraInfo=" + this.promotionExtraInfo + ", deductionText=" + this.deductionText + ", taxDescription=" + this.taxDescription + ", unitPriceDescription=" + this.unitPriceDescription + ", priceDescDetailList=" + this.priceDescDetailList + ", priceDescDetail=" + this.priceDescDetail + ", lockUpBadge=" + this.lockUpBadge + ", lockUpStaticSellingPoint=" + this.lockUpStaticSellingPoint + ", skuId=" + this.skuId + ", placementLabels=" + this.placementLabels + ", priceV2=" + this.priceV2 + ", minPrice=" + this.minPrice + ", rangePrice=" + this.rangePrice + ", isFullScreen=" + this.isFullScreen + ", bizType=" + this.bizType + ", price=" + this.price + ", clientAddMarginTop=" + this.clientAddMarginTop + ", isPlatform=" + this.isPlatform + ", hybridExtra=" + this.hybridExtra + ", skus=" + this.skus + ", isPriceHidden=" + this.isPriceHidden + ')';
    }

    public final Integer getBizType() {
        return this.bizType;
    }

    public final BrandInfo getBrandInfo() {
        return this.brandInfo;
    }

    @Override // X.InterfaceC997603vC
    public int getBrickName() {
        return this.brickName;
    }

    @Override // X.InterfaceC997603vC
    public BrickStyle getBrickStyle() {
        return this.brickStyle;
    }

    public final boolean getClientAddMarginTop() {
        return this.clientAddMarginTop;
    }

    public final CombinedSalesVolume getCombinedSalesVolume() {
        return this.combinedSalesVolume;
    }

    public final String getDeductionText() {
        return this.deductionText;
    }

    public final String getDiscount() {
        return this.discount;
    }

    public final LinkRichText getGlobalShippingTag() {
        return this.globalShippingTag;
    }

    public final ECRichText getGlobalShippingTagECRichText() {
        return this.globalShippingTagECRichText;
    }

    public final String getHybridExtra() {
        return this.hybridExtra;
    }

    public final LockUpBadge getLockUpBadge() {
        return this.lockUpBadge;
    }

    public final String getLockUpStaticSellingPoint() {
        return this.lockUpStaticSellingPoint;
    }

    public final SinglePriceItem getMinPrice() {
        return this.minPrice;
    }

    public final boolean getNeedDivider() {
        return this.needDivider;
    }

    public final String getOriginPrice() {
        return this.originPrice;
    }

    public final List<PlacementLabel> getPlacementLabels() {
        return this.placementLabels;
    }

    public final PreOrderInfo getPreOrderInfo() {
        return this.preOrderInfo;
    }

    public final ProductPrice getPrice() {
        return this.price;
    }

    public final List<LinkRichText> getPriceAdditionalList() {
        return this.priceAdditionalList;
    }

    public final PriceDescDetail getPriceDescDetail() {
        return this.priceDescDetail;
    }

    public final List<PriceDescDetailItem> getPriceDescDetailList() {
        return this.priceDescDetailList;
    }

    public final List<ProductPriceV2> getPriceV2() {
        return this.priceV2;
    }

    public final List<ProductLogo> getProductLogos() {
        return this.productLogos;
    }

    public final PromotionActivityInfoModel getPromotionActivityInfoModel() {
        return this.promotionActivityInfoModel;
    }

    public final PromotionExtraInfo getPromotionExtraInfo() {
        return this.promotionExtraInfo;
    }

    public final String getPurchaseLimit() {
        return this.purchaseLimit;
    }

    public final RangePrice getRangePrice() {
        return this.rangePrice;
    }

    public final String getRealPrice() {
        return this.realPrice;
    }

    public final ProductDetailReview getReview() {
        return this.review;
    }

    public final SellerInfo getSellerInfo() {
        return this.sellerInfo;
    }

    public final String getSkuId() {
        return this.skuId;
    }

    public final List<SkuItem> getSkus() {
        return this.skus;
    }

    public final Integer getSoldCount() {
        return this.soldCount;
    }

    public final List<String> getSortList() {
        return this.sortList;
    }

    public final List<String> getSortListV2() {
        return this.sortListV2;
    }

    public final String getTaxDescription() {
        return this.taxDescription;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUnitPriceDescription() {
        return this.unitPriceDescription;
    }

    public final Boolean isFavorite() {
        return this.isFavorite;
    }

    public final boolean isFullScreen() {
        return this.isFullScreen;
    }

    public final boolean isPlatform() {
        return this.isPlatform;
    }

    public final boolean isPriceHidden() {
        return this.isPriceHidden;
    }

    public final void setBizType(Integer num) {
        this.bizType = num;
    }

    public void setBrickName(int i) {
        this.brickName = i;
    }

    public void setBrickStyle(BrickStyle brickStyle) {
        this.brickStyle = brickStyle;
    }

    public final void setClientAddMarginTop(boolean z) {
        this.clientAddMarginTop = z;
    }

    public final void setFullScreen(boolean z) {
        this.isFullScreen = z;
    }

    public final void setHybridExtra(String str) {
        this.hybridExtra = str;
    }

    public final void setPlatform(boolean z) {
        this.isPlatform = z;
    }

    public final void setPrice(ProductPrice productPrice) {
        this.price = productPrice;
    }

    public final void setPriceHidden(boolean z) {
        this.isPriceHidden = z;
    }

    public final void setPriceV2(List<ProductPriceV2> list) {
        this.priceV2 = list;
    }

    public final void setSkus(List<SkuItem> list) {
        this.skus = list;
    }

    public UsProductInfoVO(String str, String str2, String str3, String str4, String str5, List<ProductLogo> list, ProductDetailReview productDetailReview, CombinedSalesVolume combinedSalesVolume, PromotionActivityInfoModel promotionActivityInfoModel, List<LinkRichText> list2, Boolean bool, Integer num, boolean z, List<String> list3, List<String> list4, BrandInfo brandInfo, LinkRichText linkRichText, ECRichText eCRichText, SellerInfo sellerInfo, PreOrderInfo preOrderInfo, PromotionExtraInfo promotionExtraInfo, String str6, String str7, String str8, List<PriceDescDetailItem> list5, PriceDescDetail priceDescDetail, LockUpBadge lockUpBadge, String str9, String str10, List<PlacementLabel> list6, List<ProductPriceV2> list7, SinglePriceItem singlePriceItem, RangePrice rangePrice, boolean z2, Integer num2, ProductPrice productPrice, boolean z3, boolean z4, String str11, List<SkuItem> list8, boolean z5) {
        this.title = str;
        this.realPrice = str2;
        this.originPrice = str3;
        this.discount = str4;
        this.purchaseLimit = str5;
        this.productLogos = list;
        this.review = productDetailReview;
        this.combinedSalesVolume = combinedSalesVolume;
        this.promotionActivityInfoModel = promotionActivityInfoModel;
        this.priceAdditionalList = list2;
        this.isFavorite = bool;
        this.soldCount = num;
        this.needDivider = z;
        this.sortList = list3;
        this.sortListV2 = list4;
        this.brandInfo = brandInfo;
        this.globalShippingTag = linkRichText;
        this.globalShippingTagECRichText = eCRichText;
        this.sellerInfo = sellerInfo;
        this.preOrderInfo = preOrderInfo;
        this.promotionExtraInfo = promotionExtraInfo;
        this.deductionText = str6;
        this.taxDescription = str7;
        this.unitPriceDescription = str8;
        this.priceDescDetailList = list5;
        this.priceDescDetail = priceDescDetail;
        this.lockUpBadge = lockUpBadge;
        this.lockUpStaticSellingPoint = str9;
        this.skuId = str10;
        this.placementLabels = list6;
        this.priceV2 = list7;
        this.minPrice = singlePriceItem;
        this.rangePrice = rangePrice;
        this.isFullScreen = z2;
        this.bizType = num2;
        this.price = productPrice;
        this.clientAddMarginTop = z3;
        this.isPlatform = z4;
        this.hybridExtra = str11;
        this.skus = list8;
        this.isPriceHidden = z5;
    }
}
