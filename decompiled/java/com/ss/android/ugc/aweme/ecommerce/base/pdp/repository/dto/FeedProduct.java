package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class FeedProduct {

    @C09CT("biz_type")
    public final Integer bizType;

    @C09CT("product_id")
    public final String id;

    @C09CT("image_aspect_ratio")
    public final Integer imageAspectRatio;

    @C09CT("images")
    public final List<Image> images;

    @C09CT("is_selected")
    public final boolean isSelected;

    @C09CT("log_extra")
    public final String logExtra;

    @C09CT("price")
    public final Price price;

    @C09CT("product_rating_str")
    public final String productRating;

    @C09CT("promotion_labels")
    public final List<PromotionLabel> promotionLabels;

    @C09CT("promotion_view")
    public final PromotionView promotionView;

    @C09CT("sales_type")
    public final Integer saleType;

    @C09CT("schema")
    public final String schema;

    @C09CT("seller")
    public final SellerInfo seller;

    @C09CT("selling_points")
    public final List<Object> sellingPoints;

    @C09CT("sku_schema")
    public final String skuSchema;

    @C09CT("skus")
    public final List<SkuItem> skus;

    @C09CT("sold_count")
    public final Integer soldCount;

    @C09CT("bcm_standard_track")
    public final BCMStandardTrack standardEvent;

    @C09CT("title")
    public final String title;

    public FeedProduct() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null);
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Image> list = this.images;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Price price = this.price;
        int iHashCode4 = (iHashCode3 + (price == null ? 0 : price.hashCode())) * 31;
        PromotionView promotionView = this.promotionView;
        int iHashCode5 = (iHashCode4 + (promotionView == null ? 0 : promotionView.hashCode())) * 31;
        List<SkuItem> list2 = this.skus;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str3 = this.schema;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.soldCount;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.productRating;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.bizType;
        int iHashCode10 = (iHashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.saleType;
        int iHashCode11 = (iHashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str5 = this.skuSchema;
        int iHashCode12 = (iHashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        SellerInfo sellerInfo = this.seller;
        int iHashCode13 = (((iHashCode12 + (sellerInfo == null ? 0 : sellerInfo.hashCode())) * 31) + C786410Ut5.Z2(this.isSelected)) * 31;
        String str6 = this.logExtra;
        int iHashCode14 = (iHashCode13 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<Object> list3 = this.sellingPoints;
        int iHashCode15 = (iHashCode14 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Integer num4 = this.imageAspectRatio;
        int iHashCode16 = (iHashCode15 + (num4 == null ? 0 : num4.hashCode())) * 31;
        BCMStandardTrack bCMStandardTrack = this.standardEvent;
        int iHashCode17 = (iHashCode16 + (bCMStandardTrack == null ? 0 : bCMStandardTrack.hashCode())) * 31;
        List<PromotionLabel> list4 = this.promotionLabels;
        return iHashCode17 + (list4 != null ? list4.hashCode() : 0);
    }

    public FeedProduct(String str, String str2, List<Image> list, Price price, PromotionView promotionView, List<SkuItem> list2, String str3, Integer num, String str4, Integer num2, Integer num3, String str5, SellerInfo sellerInfo, boolean z, String str6, List<Object> list3, Integer num4, BCMStandardTrack bCMStandardTrack, List<PromotionLabel> list4) {
        this.id = str;
        this.title = str2;
        this.images = list;
        this.price = price;
        this.promotionView = promotionView;
        this.skus = list2;
        this.schema = str3;
        this.soldCount = num;
        this.productRating = str4;
        this.bizType = num2;
        this.saleType = num3;
        this.skuSchema = str5;
        this.seller = sellerInfo;
        this.isSelected = z;
        this.logExtra = str6;
        this.sellingPoints = list3;
        this.imageAspectRatio = num4;
        this.standardEvent = bCMStandardTrack;
        this.promotionLabels = list4;
    }
}
