package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Video;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CombinedSalesVolume;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DynamicSellingPointsBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PriceDescDetail;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPrice;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPriceV2;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionExtraInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PurchaseNotice;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeRecSKU;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Specification;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.PriceAfterCouponConfig;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ProductBase implements Parcelable {

    @C09CT("category_id")
    public String categoryId;

    @C09CT("category_name")
    public String categoryName;

    @C09CT("combined_sales_volume")
    public CombinedSalesVolume combinedSalesVolume;

    @C09CT("default_selected_purchase_type")
    public Integer defaultSelectedPurchaseType;

    @C09CT("desc_video")
    public Video descVideo;

    @C09CT("dynamic_selling_points_base")
    public DynamicSellingPointsBase dynamicSellingPointsBase;

    @C09CT("global_shipping_tag")
    public LinkRichText globalShippingTag;

    @C09CT("global_shipping_tag_ec_richtext")
    public ECRichText globalShippingTagECRichText;

    @C09CT("has_size_chart")
    public Boolean hasSizeChart;

    @C09CT("header_images_da_info")
    public String headerImageDaInfo;

    @C09CT("header_video")
    public Video headerVideo;

    @C09CT("images")
    public List<Image> images;

    @C09CT("is_bundle")
    public Boolean isBundleProduct;

    @C09CT("is_gallery_find_similar_hidden")
    public Boolean isGalleryFindSimilarHidden;

    @C09CT("is_gift")
    public Boolean isGift;

    @C09CT("is_header_find_similar_hidden")
    public Boolean isHeaderFindSimilarHidden;

    @C09CT("is_price_hidden")
    public Boolean isPriceHidden;

    @C09CT("pre_order_type")
    public Integer preOrderType;

    @C09CT("price_additional")
    public List<LinkRichText> priceAdditionalList;

    @C09CT("price_after_coupon_config")
    public PriceAfterCouponConfig priceAfterCouponConfig;

    @C09CT("price_desc_detail")
    public PriceDescDetail priceDescDetail;

    @C09CT("price")
    public ProductPrice priceInfo;

    @C09CT("price_v2")
    public List<ProductPriceV2> priceInfoV2;

    @C09CT("promotion_extra_info")
    public PromotionExtraInfo promotionExtraInfo;

    @C09CT("purchase_notice")
    public PurchaseNotice purchaseNotice;

    @C09CT("sold_count")
    public String sales;

    @C09CT("size_guide")
    public SizeGuide sizeGuide;

    @C09CT("size_rec_sku")
    public SizeRecSKU sizeRecSku;

    @C09CT("specifications")
    public List<Specification> specs;

    @C09CT("title")
    public String title;
    public static final Parcelable.Creator<ProductBase> CREATOR = new Parcelable.Creator<ProductBase>() { // from class: X.02mY
        @Override // android.os.Parcelable.Creator
        public final ProductBase createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            Video videoCreateFromParcel;
            Video videoCreateFromParcel2;
            ArrayList arrayList;
            ArrayList arrayList2;
            CombinedSalesVolume combinedSalesVolumeCreateFromParcel;
            ProductPrice productPriceCreateFromParcel;
            ArrayList arrayList3;
            Integer numValueOf;
            PurchaseNotice purchaseNoticeCreateFromParcel;
            SizeGuide sizeGuideCreateFromParcel;
            PromotionExtraInfo promotionExtraInfoCreateFromParcel;
            Integer numValueOf2;
            boolean z2;
            Boolean boolValueOf2;
            DynamicSellingPointsBase dynamicSellingPointsBaseCreateFromParcel;
            LinkRichText linkRichTextCreateFromParcel;
            ArrayList arrayList4;
            PriceDescDetail priceDescDetailCreateFromParcel;
            boolean z3;
            Boolean boolValueOf3;
            PriceAfterCouponConfig priceAfterCouponConfigCreateFromParcel;
            boolean z4;
            Boolean boolValueOf4;
            boolean z5;
            Boolean boolValueOf5;
            boolean z6;
            Boolean boolValueOf6;
            SizeRecSKU sizeRecSKUCreateFromParcel;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            if (parcel.readInt() == 0) {
                videoCreateFromParcel = null;
            } else {
                videoCreateFromParcel = Video.CREATOR.createFromParcel(parcel);
            }
            Video video = videoCreateFromParcel;
            if (parcel.readInt() == 0) {
                videoCreateFromParcel2 = null;
            } else {
                videoCreateFromParcel2 = Video.CREATOR.createFromParcel(parcel);
            }
            Video video2 = videoCreateFromParcel2;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(ProductBase.class.getClassLoader()));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(Specification.CREATOR.createFromParcel(parcel));
                }
            }
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                combinedSalesVolumeCreateFromParcel = null;
            } else {
                combinedSalesVolumeCreateFromParcel = CombinedSalesVolume.CREATOR.createFromParcel(parcel);
            }
            CombinedSalesVolume combinedSalesVolume = combinedSalesVolumeCreateFromParcel;
            if (parcel.readInt() == 0) {
                productPriceCreateFromParcel = null;
            } else {
                productPriceCreateFromParcel = ProductPrice.CREATOR.createFromParcel(parcel);
            }
            ProductPrice productPrice = productPriceCreateFromParcel;
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i5 = parcel.readInt();
                arrayList3 = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList3.add(ProductPriceV2.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                purchaseNoticeCreateFromParcel = null;
            } else {
                purchaseNoticeCreateFromParcel = PurchaseNotice.CREATOR.createFromParcel(parcel);
            }
            PurchaseNotice purchaseNotice = purchaseNoticeCreateFromParcel;
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                sizeGuideCreateFromParcel = null;
            } else {
                sizeGuideCreateFromParcel = SizeGuide.CREATOR.createFromParcel(parcel);
            }
            SizeGuide sizeGuide = sizeGuideCreateFromParcel;
            if (parcel.readInt() == 0) {
                promotionExtraInfoCreateFromParcel = null;
            } else {
                promotionExtraInfoCreateFromParcel = PromotionExtraInfo.CREATOR.createFromParcel(parcel);
            }
            PromotionExtraInfo promotionExtraInfo = promotionExtraInfoCreateFromParcel;
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolValueOf2 = Boolean.valueOf(z2);
            }
            if (parcel.readInt() == 0) {
                dynamicSellingPointsBaseCreateFromParcel = null;
            } else {
                dynamicSellingPointsBaseCreateFromParcel = DynamicSellingPointsBase.CREATOR.createFromParcel(parcel);
            }
            DynamicSellingPointsBase dynamicSellingPointsBase = dynamicSellingPointsBaseCreateFromParcel;
            if (parcel.readInt() == 0) {
                linkRichTextCreateFromParcel = null;
            } else {
                linkRichTextCreateFromParcel = LinkRichText.CREATOR.createFromParcel(parcel);
            }
            LinkRichText linkRichText = linkRichTextCreateFromParcel;
            ECRichText eCRichText = (ECRichText) parcel.readParcelable(ProductBase.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int i7 = parcel.readInt();
                arrayList4 = new ArrayList(i7);
                for (int i8 = 0; i8 != i7; i8++) {
                    arrayList4.add(LinkRichText.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                priceDescDetailCreateFromParcel = null;
            } else {
                priceDescDetailCreateFromParcel = PriceDescDetail.CREATOR.createFromParcel(parcel);
            }
            PriceDescDetail priceDescDetail = priceDescDetailCreateFromParcel;
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolValueOf3 = Boolean.valueOf(z3);
            }
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                priceAfterCouponConfigCreateFromParcel = null;
            } else {
                priceAfterCouponConfigCreateFromParcel = PriceAfterCouponConfig.CREATOR.createFromParcel(parcel);
            }
            PriceAfterCouponConfig priceAfterCouponConfig = priceAfterCouponConfigCreateFromParcel;
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolValueOf4 = Boolean.valueOf(z4);
            }
            if (parcel.readInt() == 0) {
                boolValueOf5 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                boolValueOf5 = Boolean.valueOf(z5);
            }
            if (parcel.readInt() == 0) {
                boolValueOf6 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolValueOf6 = Boolean.valueOf(z6);
            }
            if (parcel.readInt() == 0) {
                sizeRecSKUCreateFromParcel = null;
            } else {
                sizeRecSKUCreateFromParcel = SizeRecSKU.CREATOR.createFromParcel(parcel);
            }
            return new ProductBase(string, boolValueOf, video, video2, arrayList, arrayList2, string2, combinedSalesVolume, productPrice, arrayList3, numValueOf, purchaseNotice, string3, sizeGuide, promotionExtraInfo, numValueOf2, boolValueOf2, dynamicSellingPointsBase, linkRichText, eCRichText, arrayList4, priceDescDetail, boolValueOf3, string4, string5, priceAfterCouponConfig, boolValueOf4, boolValueOf5, boolValueOf6, sizeRecSKUCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ProductBase[] newArray(int i) {
            return new ProductBase[i];
        }
    };
    public static final int $stable = 8;

    public ProductBase() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductBase)) {
            return false;
        }
        ProductBase productBase = (ProductBase) obj;
        return Intrinsics.LJFF(this.title, productBase.title) && Intrinsics.LJFF(this.hasSizeChart, productBase.hasSizeChart) && Intrinsics.LJFF(this.headerVideo, productBase.headerVideo) && Intrinsics.LJFF(this.descVideo, productBase.descVideo) && Intrinsics.LJFF(this.images, productBase.images) && Intrinsics.LJFF(this.specs, productBase.specs) && Intrinsics.LJFF(this.sales, productBase.sales) && Intrinsics.LJFF(this.combinedSalesVolume, productBase.combinedSalesVolume) && Intrinsics.LJFF(this.priceInfo, productBase.priceInfo) && Intrinsics.LJFF(this.priceInfoV2, productBase.priceInfoV2) && Intrinsics.LJFF(this.defaultSelectedPurchaseType, productBase.defaultSelectedPurchaseType) && Intrinsics.LJFF(this.purchaseNotice, productBase.purchaseNotice) && Intrinsics.LJFF(this.categoryName, productBase.categoryName) && Intrinsics.LJFF(this.sizeGuide, productBase.sizeGuide) && Intrinsics.LJFF(this.promotionExtraInfo, productBase.promotionExtraInfo) && Intrinsics.LJFF(this.preOrderType, productBase.preOrderType) && Intrinsics.LJFF(this.isGift, productBase.isGift) && Intrinsics.LJFF(this.dynamicSellingPointsBase, productBase.dynamicSellingPointsBase) && Intrinsics.LJFF(this.globalShippingTag, productBase.globalShippingTag) && Intrinsics.LJFF(this.globalShippingTagECRichText, productBase.globalShippingTagECRichText) && Intrinsics.LJFF(this.priceAdditionalList, productBase.priceAdditionalList) && Intrinsics.LJFF(this.priceDescDetail, productBase.priceDescDetail) && Intrinsics.LJFF(this.isPriceHidden, productBase.isPriceHidden) && Intrinsics.LJFF(this.headerImageDaInfo, productBase.headerImageDaInfo) && Intrinsics.LJFF(this.categoryId, productBase.categoryId) && Intrinsics.LJFF(this.priceAfterCouponConfig, productBase.priceAfterCouponConfig) && Intrinsics.LJFF(this.isBundleProduct, productBase.isBundleProduct) && Intrinsics.LJFF(this.isHeaderFindSimilarHidden, productBase.isHeaderFindSimilarHidden) && Intrinsics.LJFF(this.isGalleryFindSimilarHidden, productBase.isGalleryFindSimilarHidden) && Intrinsics.LJFF(this.sizeRecSku, productBase.sizeRecSku);
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.hasSizeChart;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Video video = this.headerVideo;
        int iHashCode3 = (iHashCode2 + (video == null ? 0 : video.hashCode())) * 31;
        Video video2 = this.descVideo;
        int iHashCode4 = (iHashCode3 + (video2 == null ? 0 : video2.hashCode())) * 31;
        List<Image> list = this.images;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<Specification> list2 = this.specs;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.sales;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CombinedSalesVolume combinedSalesVolume = this.combinedSalesVolume;
        int iHashCode8 = (iHashCode7 + (combinedSalesVolume == null ? 0 : combinedSalesVolume.hashCode())) * 31;
        ProductPrice productPrice = this.priceInfo;
        int iHashCode9 = (iHashCode8 + (productPrice == null ? 0 : productPrice.hashCode())) * 31;
        List<ProductPriceV2> list3 = this.priceInfoV2;
        int iHashCode10 = (iHashCode9 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Integer num = this.defaultSelectedPurchaseType;
        int iHashCode11 = (iHashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        PurchaseNotice purchaseNotice = this.purchaseNotice;
        int iHashCode12 = (iHashCode11 + (purchaseNotice == null ? 0 : purchaseNotice.hashCode())) * 31;
        String str3 = this.categoryName;
        int iHashCode13 = (iHashCode12 + (str3 == null ? 0 : str3.hashCode())) * 31;
        SizeGuide sizeGuide = this.sizeGuide;
        int iHashCode14 = (iHashCode13 + (sizeGuide == null ? 0 : sizeGuide.hashCode())) * 31;
        PromotionExtraInfo promotionExtraInfo = this.promotionExtraInfo;
        int iHashCode15 = (iHashCode14 + (promotionExtraInfo == null ? 0 : promotionExtraInfo.hashCode())) * 31;
        Integer num2 = this.preOrderType;
        int iHashCode16 = (iHashCode15 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool2 = this.isGift;
        int iHashCode17 = (iHashCode16 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        DynamicSellingPointsBase dynamicSellingPointsBase = this.dynamicSellingPointsBase;
        int iHashCode18 = (iHashCode17 + (dynamicSellingPointsBase == null ? 0 : dynamicSellingPointsBase.hashCode())) * 31;
        LinkRichText linkRichText = this.globalShippingTag;
        int iHashCode19 = (iHashCode18 + (linkRichText == null ? 0 : linkRichText.hashCode())) * 31;
        ECRichText eCRichText = this.globalShippingTagECRichText;
        int iHashCode20 = (iHashCode19 + (eCRichText == null ? 0 : eCRichText.hashCode())) * 31;
        List<LinkRichText> list4 = this.priceAdditionalList;
        int iHashCode21 = (iHashCode20 + (list4 == null ? 0 : list4.hashCode())) * 31;
        PriceDescDetail priceDescDetail = this.priceDescDetail;
        int iHashCode22 = (iHashCode21 + (priceDescDetail == null ? 0 : priceDescDetail.hashCode())) * 31;
        Boolean bool3 = this.isPriceHidden;
        int iHashCode23 = (iHashCode22 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str4 = this.headerImageDaInfo;
        int iHashCode24 = (iHashCode23 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.categoryId;
        int iHashCode25 = (iHashCode24 + (str5 == null ? 0 : str5.hashCode())) * 31;
        PriceAfterCouponConfig priceAfterCouponConfig = this.priceAfterCouponConfig;
        int iHashCode26 = (iHashCode25 + (priceAfterCouponConfig == null ? 0 : priceAfterCouponConfig.hashCode())) * 31;
        Boolean bool4 = this.isBundleProduct;
        int iHashCode27 = (iHashCode26 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.isHeaderFindSimilarHidden;
        int iHashCode28 = (iHashCode27 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.isGalleryFindSimilarHidden;
        int iHashCode29 = (iHashCode28 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        SizeRecSKU sizeRecSKU = this.sizeRecSku;
        return iHashCode29 + (sizeRecSKU != null ? sizeRecSKU.hashCode() : 0);
    }

    public final String toString() {
        return "ProductBase(title=" + this.title + ", hasSizeChart=" + this.hasSizeChart + ", headerVideo=" + this.headerVideo + ", descVideo=" + this.descVideo + ", images=" + this.images + ", specs=" + this.specs + ", sales=" + this.sales + ", combinedSalesVolume=" + this.combinedSalesVolume + ", priceInfo=" + this.priceInfo + ", priceInfoV2=" + this.priceInfoV2 + ", defaultSelectedPurchaseType=" + this.defaultSelectedPurchaseType + ", purchaseNotice=" + this.purchaseNotice + ", categoryName=" + this.categoryName + ", sizeGuide=" + this.sizeGuide + ", promotionExtraInfo=" + this.promotionExtraInfo + ", preOrderType=" + this.preOrderType + ", isGift=" + this.isGift + ", dynamicSellingPointsBase=" + this.dynamicSellingPointsBase + ", globalShippingTag=" + this.globalShippingTag + ", globalShippingTagECRichText=" + this.globalShippingTagECRichText + ", priceAdditionalList=" + this.priceAdditionalList + ", priceDescDetail=" + this.priceDescDetail + ", isPriceHidden=" + this.isPriceHidden + ", headerImageDaInfo=" + this.headerImageDaInfo + ", categoryId=" + this.categoryId + ", priceAfterCouponConfig=" + this.priceAfterCouponConfig + ", isBundleProduct=" + this.isBundleProduct + ", isHeaderFindSimilarHidden=" + this.isHeaderFindSimilarHidden + ", isGalleryFindSimilarHidden=" + this.isGalleryFindSimilarHidden + ", sizeRecSku=" + this.sizeRecSku + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        Boolean bool = this.hasSizeChart;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Video video = this.headerVideo;
        if (video == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            video.writeToParcel(parcel, i);
        }
        Video video2 = this.descVideo;
        if (video2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            video2.writeToParcel(parcel, i);
        }
        List<Image> list = this.images;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<Image> it2 = list.iterator();
            while (it2.hasNext()) {
                parcel.writeParcelable(it2.next(), i);
            }
        }
        List<Specification> list2 = this.specs;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<Specification> it3 = list2.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.sales);
        CombinedSalesVolume combinedSalesVolume = this.combinedSalesVolume;
        if (combinedSalesVolume == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            combinedSalesVolume.writeToParcel(parcel, i);
        }
        ProductPrice productPrice = this.priceInfo;
        if (productPrice == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            productPrice.writeToParcel(parcel, i);
        }
        List<ProductPriceV2> list3 = this.priceInfoV2;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            Iterator<ProductPriceV2> it4 = list3.iterator();
            while (it4.hasNext()) {
                it4.next().writeToParcel(parcel, i);
            }
        }
        Integer num = this.defaultSelectedPurchaseType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        PurchaseNotice purchaseNotice = this.purchaseNotice;
        if (purchaseNotice == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(purchaseNotice.desc);
        }
        parcel.writeString(this.categoryName);
        SizeGuide sizeGuide = this.sizeGuide;
        if (sizeGuide == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sizeGuide.writeToParcel(parcel, i);
        }
        PromotionExtraInfo promotionExtraInfo = this.promotionExtraInfo;
        if (promotionExtraInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            promotionExtraInfo.writeToParcel(parcel, i);
        }
        Integer num2 = this.preOrderType;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Boolean bool2 = this.isGift;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        DynamicSellingPointsBase dynamicSellingPointsBase = this.dynamicSellingPointsBase;
        if (dynamicSellingPointsBase == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dynamicSellingPointsBase.writeToParcel(parcel, i);
        }
        LinkRichText linkRichText = this.globalShippingTag;
        if (linkRichText == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkRichText.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.globalShippingTagECRichText, i);
        List<LinkRichText> list4 = this.priceAdditionalList;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list4.size());
            Iterator<LinkRichText> it5 = list4.iterator();
            while (it5.hasNext()) {
                it5.next().writeToParcel(parcel, i);
            }
        }
        PriceDescDetail priceDescDetail = this.priceDescDetail;
        if (priceDescDetail == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            priceDescDetail.writeToParcel(parcel, i);
        }
        Boolean bool3 = this.isPriceHidden;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.headerImageDaInfo);
        parcel.writeString(this.categoryId);
        PriceAfterCouponConfig priceAfterCouponConfig = this.priceAfterCouponConfig;
        if (priceAfterCouponConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            priceAfterCouponConfig.writeToParcel(parcel, i);
        }
        Boolean bool4 = this.isBundleProduct;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        Boolean bool5 = this.isHeaderFindSimilarHidden;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool5.booleanValue() ? 1 : 0);
        }
        Boolean bool6 = this.isGalleryFindSimilarHidden;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool6.booleanValue() ? 1 : 0);
        }
        SizeRecSKU sizeRecSKU = this.sizeRecSku;
        if (sizeRecSKU == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sizeRecSKU.writeToParcel(parcel, i);
        }
    }

    public ProductBase(String str, Boolean bool, Video video, Video video2, List<Image> list, List<Specification> list2, String str2, CombinedSalesVolume combinedSalesVolume, ProductPrice productPrice, List<ProductPriceV2> list3, Integer num, PurchaseNotice purchaseNotice, String str3, SizeGuide sizeGuide, PromotionExtraInfo promotionExtraInfo, Integer num2, Boolean bool2, DynamicSellingPointsBase dynamicSellingPointsBase, LinkRichText linkRichText, ECRichText eCRichText, List<LinkRichText> list4, PriceDescDetail priceDescDetail, Boolean bool3, String str4, String str5, PriceAfterCouponConfig priceAfterCouponConfig, Boolean bool4, Boolean bool5, Boolean bool6, SizeRecSKU sizeRecSKU) {
        this.title = str;
        this.hasSizeChart = bool;
        this.headerVideo = video;
        this.descVideo = video2;
        this.images = list;
        this.specs = list2;
        this.sales = str2;
        this.combinedSalesVolume = combinedSalesVolume;
        this.priceInfo = productPrice;
        this.priceInfoV2 = list3;
        this.defaultSelectedPurchaseType = num;
        this.purchaseNotice = purchaseNotice;
        this.categoryName = str3;
        this.sizeGuide = sizeGuide;
        this.promotionExtraInfo = promotionExtraInfo;
        this.preOrderType = num2;
        this.isGift = bool2;
        this.dynamicSellingPointsBase = dynamicSellingPointsBase;
        this.globalShippingTag = linkRichText;
        this.globalShippingTagECRichText = eCRichText;
        this.priceAdditionalList = list4;
        this.priceDescDetail = priceDescDetail;
        this.isPriceHidden = bool3;
        this.headerImageDaInfo = str4;
        this.categoryId = str5;
        this.priceAfterCouponConfig = priceAfterCouponConfig;
        this.isBundleProduct = bool4;
        this.isHeaderFindSimilarHidden = bool5;
        this.isGalleryFindSimilarHidden = bool6;
        this.sizeRecSku = sizeRecSKU;
    }
}
