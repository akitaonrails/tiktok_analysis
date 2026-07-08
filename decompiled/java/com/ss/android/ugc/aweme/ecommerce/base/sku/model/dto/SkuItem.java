package com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto;

import X.C09CT;
import X.C13LP;
import X.C15438062q;
import X.C2327809Ae;
import X.C702402og;
import X.InterfaceC1053504Ab;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.model.message.ext.PromotionView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BCMStandardTrack;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BuyButton;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.NextRequestScene;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpButtonAreaIdV2;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PriceDescDetail;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PurchaseNotice;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellingPointLabel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.AddToCartButton;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.CounterDescription;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.PreOrderInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.PriceAfterCouponConfig;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.QuantityNoticeInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuPrice;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuPriceV2;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuQuantityProperty;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuSaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuSupply;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuVoucher;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.view.bannerlayout.SeaSkuPanelWaistBanner;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SkuItem implements InterfaceC1053504Ab, Parcelable {

    @C09CT("add_to_cart_button")
    public AddToCartButton addToCartButton;

    @C09CT("bcm_standard_track")
    public BCMStandardTrack bcmStandardTrack;

    @C09CT("pdp_button_area_id")
    public String bottomAreaId;

    @C09CT("button_dynamic_data")
    public Map<String, String> buttonDynamicData;

    @C09CT("buy_button")
    public BuyButton buyButton;

    @C09CT("buy_button_interest_id")
    public String buyButtonInterestId;

    @C09CT("counter_description")
    public CounterDescription counterDescription;

    @C09CT("da_info")
    public String daInfo;

    @C09CT("deduction_text")
    public String deductionText;

    @C09CT("disclaimer_text")
    public String disclaimerText;

    @C09CT("is_support_try_on")
    public Boolean isSupportTryOn;

    @C09CT("link")
    public String link;

    @C09CT("low_stock_warning")
    public String lowStockWarning;

    @C09CT("minimum_buy_quantity")
    public Integer minBuyQuantity;

    @C09CT("need_icon")
    public Boolean needIcon;

    @C09CT("sku_original_image")
    public Image originalImage;

    @C09CT("pdp_button_area_id_v2")
    public List<PdpButtonAreaIdV2> pdpButtonAreaIdV2;

    @C09CT("pre_order_info")
    public PreOrderInfo preOrderInfo;

    @C09CT("price")
    public SkuPrice price;

    @C09CT("price_after_coupon_config")
    public PriceAfterCouponConfig priceAfterCouponConfig;

    @C09CT("price_desc_detail")
    public PriceDescDetail priceDescDetail;

    @C09CT("price_v2")
    public List<SkuPriceV2> priceV2;

    @C09CT("promotion_key_list")
    public List<String> promotionKeyList;

    @C09CT("promotion_limit_quantity")
    public Integer promotionLimitQuantity;

    @C09CT("promotion_limit_quantity_v2")
    public Integer promotionPruchaseLimit;

    @C09CT("promotion_view")
    public PromotionView promotionView;

    @C09CT("purchase_limit")
    public Integer purchaseLimit;

    @C09CT("purchase_limit_toast")
    public String purchaseLimitToast;

    @C09CT("purchase_notice")
    public PurchaseNotice purchaseNotice;

    @C09CT("quantity_promotion_notice_info")
    public QuantityNoticeInfo quantityPromotionNoticeInfo;

    @C09CT("sale_prop_value_ids")
    public String salePropValueIds;

    @C09CT("show_waist_banner")
    public Boolean showWaistBanner;

    @C09CT("sku_id")
    public String skuId;

    @C09CT("sku_logistics_info")
    public ECRichText skuLogisticsInfo;

    @C09CT("sku_next_request_scene")
    public List<NextRequestScene> skuNextRequestScenes;

    @C09CT("sku_panel_waist_banner")
    public SeaSkuPanelWaistBanner skuPanelWaistBanner;

    @C09CT("quantity_property")
    public SkuQuantityProperty skuQuantityProperty;

    @C09CT("sku_sale_props")
    public List<SkuSaleProp> skuSalePropList;

    @C09CT("sku_selling_points")
    public List<SellingPointLabel> skuSellingPoints;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public Integer skuStatus;

    @C09CT("sku_supply")
    public SkuSupply skuSupply;

    @C09CT("stock")
    public Integer stockNum;

    @C09CT("unavailable_info_id")
    public Integer unavailableInfoId;

    @C09CT("voucher_info")
    public SkuVoucher voucherInfo;

    @C09CT("warehouse_id")
    public String warehouseId;
    public static final C702402og Companion = new Object() { // from class: X.02og
    };
    public static final Parcelable.Creator<SkuItem> CREATOR = new Parcelable.Creator<SkuItem>() { // from class: X.02mZ
        @Override // android.os.Parcelable.Creator
        public final SkuItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Integer numValueOf;
            Integer numValueOf2;
            SkuPrice skuPriceCreateFromParcel;
            ArrayList arrayList2;
            boolean z;
            Boolean boolValueOf;
            SkuVoucher skuVoucherCreateFromParcel;
            AddToCartButton addToCartButtonCreateFromParcel;
            PurchaseNotice purchaseNoticeCreateFromParcel;
            BuyButton buyButtonCreateFromParcel;
            SkuQuantityProperty skuQuantityPropertyCreateFromParcel;
            Integer numValueOf3;
            Integer numValueOf4;
            PreOrderInfo preOrderInfoCreateFromParcel;
            Integer numValueOf5;
            Integer numValueOf6;
            boolean z2;
            Boolean boolValueOf2;
            PriceDescDetail priceDescDetailCreateFromParcel;
            Integer numValueOf7;
            SkuSupply skuSupplyCreateFromParcel;
            BCMStandardTrack bCMStandardTrackCreateFromParcel;
            CounterDescription counterDescriptionCreateFromParcel;
            ArrayList arrayList3;
            boolean z3;
            Boolean boolValueOf3;
            ArrayList arrayList4;
            LinkedHashMap linkedHashMap;
            PriceAfterCouponConfig priceAfterCouponConfigCreateFromParcel;
            QuantityNoticeInfo quantityNoticeInfoCreateFromParcel;
            ArrayList arrayList5;
            SeaSkuPanelWaistBanner seaSkuPanelWaistBannerCreateFromParcel;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(SkuSaleProp.CREATOR.createFromParcel(parcel));
                }
            }
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                skuPriceCreateFromParcel = null;
            } else {
                skuPriceCreateFromParcel = SkuPrice.CREATOR.createFromParcel(parcel);
            }
            SkuPrice skuPrice = skuPriceCreateFromParcel;
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(SkuPriceV2.CREATOR.createFromParcel(parcel));
                }
            }
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
                skuVoucherCreateFromParcel = null;
            } else {
                skuVoucherCreateFromParcel = SkuVoucher.CREATOR.createFromParcel(parcel);
            }
            SkuVoucher skuVoucher = skuVoucherCreateFromParcel;
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                addToCartButtonCreateFromParcel = null;
            } else {
                addToCartButtonCreateFromParcel = AddToCartButton.CREATOR.createFromParcel(parcel);
            }
            AddToCartButton addToCartButton = addToCartButtonCreateFromParcel;
            if (parcel.readInt() == 0) {
                purchaseNoticeCreateFromParcel = null;
            } else {
                purchaseNoticeCreateFromParcel = PurchaseNotice.CREATOR.createFromParcel(parcel);
            }
            PurchaseNotice purchaseNotice = purchaseNoticeCreateFromParcel;
            PromotionView promotionView = (PromotionView) parcel.readParcelable(SkuItem.class.getClassLoader());
            if (parcel.readInt() == 0) {
                buyButtonCreateFromParcel = null;
            } else {
                buyButtonCreateFromParcel = BuyButton.CREATOR.createFromParcel(parcel);
            }
            BuyButton buyButton = buyButtonCreateFromParcel;
            if (parcel.readInt() == 0) {
                skuQuantityPropertyCreateFromParcel = null;
            } else {
                skuQuantityPropertyCreateFromParcel = SkuQuantityProperty.CREATOR.createFromParcel(parcel);
            }
            SkuQuantityProperty skuQuantityProperty = skuQuantityPropertyCreateFromParcel;
            if (parcel.readInt() == 0) {
                numValueOf3 = null;
            } else {
                numValueOf3 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf4 = null;
            } else {
                numValueOf4 = Integer.valueOf(parcel.readInt());
            }
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                preOrderInfoCreateFromParcel = null;
            } else {
                preOrderInfoCreateFromParcel = PreOrderInfo.CREATOR.createFromParcel(parcel);
            }
            PreOrderInfo preOrderInfo = preOrderInfoCreateFromParcel;
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string7 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf5 = null;
            } else {
                numValueOf5 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf6 = null;
            } else {
                numValueOf6 = Integer.valueOf(parcel.readInt());
            }
            String string8 = parcel.readString();
            Image image = (Image) parcel.readParcelable(SkuItem.class.getClassLoader());
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
                priceDescDetailCreateFromParcel = null;
            } else {
                priceDescDetailCreateFromParcel = PriceDescDetail.CREATOR.createFromParcel(parcel);
            }
            PriceDescDetail priceDescDetail = priceDescDetailCreateFromParcel;
            String string9 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf7 = null;
            } else {
                numValueOf7 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                skuSupplyCreateFromParcel = null;
            } else {
                skuSupplyCreateFromParcel = SkuSupply.CREATOR.createFromParcel(parcel);
            }
            SkuSupply skuSupply = skuSupplyCreateFromParcel;
            if (parcel.readInt() == 0) {
                bCMStandardTrackCreateFromParcel = null;
            } else {
                bCMStandardTrackCreateFromParcel = BCMStandardTrack.CREATOR.createFromParcel(parcel);
            }
            BCMStandardTrack bCMStandardTrack = bCMStandardTrackCreateFromParcel;
            if (parcel.readInt() == 0) {
                counterDescriptionCreateFromParcel = null;
            } else {
                counterDescriptionCreateFromParcel = CounterDescription.CREATOR.createFromParcel(parcel);
            }
            CounterDescription counterDescription = counterDescriptionCreateFromParcel;
            String string10 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i5 = parcel.readInt();
                arrayList3 = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList3.add(PdpButtonAreaIdV2.CREATOR.createFromParcel(parcel));
                }
            }
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
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int i7 = parcel.readInt();
                arrayList4 = new ArrayList(i7);
                for (int i8 = 0; i8 != i7; i8++) {
                    arrayList4.add(NextRequestScene.CREATOR.createFromParcel(parcel));
                }
            }
            String string11 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i9 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i9);
                for (int i10 = 0; i10 != i9; i10++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
            }
            if (parcel.readInt() == 0) {
                priceAfterCouponConfigCreateFromParcel = null;
            } else {
                priceAfterCouponConfigCreateFromParcel = PriceAfterCouponConfig.CREATOR.createFromParcel(parcel);
            }
            PriceAfterCouponConfig priceAfterCouponConfig = priceAfterCouponConfigCreateFromParcel;
            if (parcel.readInt() == 0) {
                quantityNoticeInfoCreateFromParcel = null;
            } else {
                quantityNoticeInfoCreateFromParcel = QuantityNoticeInfo.CREATOR.createFromParcel(parcel);
            }
            QuantityNoticeInfo quantityNoticeInfo = quantityNoticeInfoCreateFromParcel;
            if (parcel.readInt() == 0) {
                arrayList5 = null;
            } else {
                int i11 = parcel.readInt();
                arrayList5 = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList5.add(SellingPointLabel.CREATOR.createFromParcel(parcel));
                }
            }
            ECRichText eCRichText = (ECRichText) parcel.readParcelable(SkuItem.class.getClassLoader());
            if (parcel.readInt() == 0) {
                seaSkuPanelWaistBannerCreateFromParcel = null;
            } else {
                seaSkuPanelWaistBannerCreateFromParcel = SeaSkuPanelWaistBanner.CREATOR.createFromParcel(parcel);
            }
            return new SkuItem(string, arrayList, string2, numValueOf, string3, numValueOf2, string4, skuPrice, arrayList2, boolValueOf, skuVoucher, string5, addToCartButton, purchaseNotice, promotionView, buyButton, skuQuantityProperty, numValueOf3, numValueOf4, string6, preOrderInfo, arrayListCreateStringArrayList, string7, numValueOf5, numValueOf6, string8, image, boolValueOf2, priceDescDetail, string9, numValueOf7, skuSupply, bCMStandardTrack, counterDescription, string10, arrayList3, boolValueOf3, arrayList4, string11, linkedHashMap, priceAfterCouponConfig, quantityNoticeInfo, arrayList5, eCRichText, seaSkuPanelWaistBannerCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SkuItem[] newArray(int i) {
            return new SkuItem[i];
        }
    };
    public static final int $stable = 8;

    public SkuItem() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuItem)) {
            return false;
        }
        SkuItem skuItem = (SkuItem) obj;
        return Intrinsics.LJFF(this.skuId, skuItem.skuId) && Intrinsics.LJFF(this.skuSalePropList, skuItem.skuSalePropList) && Intrinsics.LJFF(this.salePropValueIds, skuItem.salePropValueIds) && Intrinsics.LJFF(this.stockNum, skuItem.stockNum) && Intrinsics.LJFF(this.lowStockWarning, skuItem.lowStockWarning) && Intrinsics.LJFF(this.purchaseLimit, skuItem.purchaseLimit) && Intrinsics.LJFF(this.purchaseLimitToast, skuItem.purchaseLimitToast) && Intrinsics.LJFF(this.price, skuItem.price) && Intrinsics.LJFF(this.priceV2, skuItem.priceV2) && Intrinsics.LJFF(this.needIcon, skuItem.needIcon) && Intrinsics.LJFF(this.voucherInfo, skuItem.voucherInfo) && Intrinsics.LJFF(this.warehouseId, skuItem.warehouseId) && Intrinsics.LJFF(this.addToCartButton, skuItem.addToCartButton) && Intrinsics.LJFF(this.purchaseNotice, skuItem.purchaseNotice) && Intrinsics.LJFF(this.promotionView, skuItem.promotionView) && Intrinsics.LJFF(this.buyButton, skuItem.buyButton) && Intrinsics.LJFF(this.skuQuantityProperty, skuItem.skuQuantityProperty) && Intrinsics.LJFF(this.minBuyQuantity, skuItem.minBuyQuantity) && Intrinsics.LJFF(this.promotionLimitQuantity, skuItem.promotionLimitQuantity) && Intrinsics.LJFF(this.link, skuItem.link) && Intrinsics.LJFF(this.preOrderInfo, skuItem.preOrderInfo) && Intrinsics.LJFF(this.promotionKeyList, skuItem.promotionKeyList) && Intrinsics.LJFF(this.deductionText, skuItem.deductionText) && Intrinsics.LJFF(this.skuStatus, skuItem.skuStatus) && Intrinsics.LJFF(this.unavailableInfoId, skuItem.unavailableInfoId) && Intrinsics.LJFF(this.bottomAreaId, skuItem.bottomAreaId) && Intrinsics.LJFF(this.originalImage, skuItem.originalImage) && Intrinsics.LJFF(this.showWaistBanner, skuItem.showWaistBanner) && Intrinsics.LJFF(this.priceDescDetail, skuItem.priceDescDetail) && Intrinsics.LJFF(this.disclaimerText, skuItem.disclaimerText) && Intrinsics.LJFF(this.promotionPruchaseLimit, skuItem.promotionPruchaseLimit) && Intrinsics.LJFF(this.skuSupply, skuItem.skuSupply) && Intrinsics.LJFF(this.bcmStandardTrack, skuItem.bcmStandardTrack) && Intrinsics.LJFF(this.counterDescription, skuItem.counterDescription) && Intrinsics.LJFF(this.daInfo, skuItem.daInfo) && Intrinsics.LJFF(this.pdpButtonAreaIdV2, skuItem.pdpButtonAreaIdV2) && Intrinsics.LJFF(this.isSupportTryOn, skuItem.isSupportTryOn) && Intrinsics.LJFF(this.skuNextRequestScenes, skuItem.skuNextRequestScenes) && Intrinsics.LJFF(this.buyButtonInterestId, skuItem.buyButtonInterestId) && Intrinsics.LJFF(this.buttonDynamicData, skuItem.buttonDynamicData) && Intrinsics.LJFF(this.priceAfterCouponConfig, skuItem.priceAfterCouponConfig) && Intrinsics.LJFF(this.quantityPromotionNoticeInfo, skuItem.quantityPromotionNoticeInfo) && Intrinsics.LJFF(this.skuSellingPoints, skuItem.skuSellingPoints) && Intrinsics.LJFF(this.skuLogisticsInfo, skuItem.skuLogisticsInfo) && Intrinsics.LJFF(this.skuPanelWaistBanner, skuItem.skuPanelWaistBanner);
    }

    public final int hashCode() {
        String str = this.skuId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<SkuSaleProp> list = this.skuSalePropList;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.salePropValueIds;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.stockNum;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.lowStockWarning;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.purchaseLimit;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.purchaseLimitToast;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        SkuPrice skuPrice = this.price;
        int iHashCode8 = (iHashCode7 + (skuPrice == null ? 0 : skuPrice.hashCode())) * 31;
        List<SkuPriceV2> list2 = this.priceV2;
        int iHashCode9 = (iHashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.needIcon;
        int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        SkuVoucher skuVoucher = this.voucherInfo;
        int iHashCode11 = (iHashCode10 + (skuVoucher == null ? 0 : skuVoucher.hashCode())) * 31;
        String str5 = this.warehouseId;
        int iHashCode12 = (iHashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        AddToCartButton addToCartButton = this.addToCartButton;
        int iHashCode13 = (iHashCode12 + (addToCartButton == null ? 0 : addToCartButton.hashCode())) * 31;
        PurchaseNotice purchaseNotice = this.purchaseNotice;
        int iHashCode14 = (iHashCode13 + (purchaseNotice == null ? 0 : purchaseNotice.hashCode())) * 31;
        PromotionView promotionView = this.promotionView;
        int iHashCode15 = (iHashCode14 + (promotionView == null ? 0 : promotionView.hashCode())) * 31;
        BuyButton buyButton = this.buyButton;
        int iHashCode16 = (iHashCode15 + (buyButton == null ? 0 : buyButton.hashCode())) * 31;
        SkuQuantityProperty skuQuantityProperty = this.skuQuantityProperty;
        int iHashCode17 = (iHashCode16 + (skuQuantityProperty == null ? 0 : skuQuantityProperty.hashCode())) * 31;
        Integer num3 = this.minBuyQuantity;
        int iHashCode18 = (iHashCode17 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.promotionLimitQuantity;
        int iHashCode19 = (iHashCode18 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str6 = this.link;
        int iHashCode20 = (iHashCode19 + (str6 == null ? 0 : str6.hashCode())) * 31;
        PreOrderInfo preOrderInfo = this.preOrderInfo;
        int iHashCode21 = (iHashCode20 + (preOrderInfo == null ? 0 : preOrderInfo.hashCode())) * 31;
        List<String> list3 = this.promotionKeyList;
        int iHashCode22 = (iHashCode21 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str7 = this.deductionText;
        int iHashCode23 = (iHashCode22 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num5 = this.skuStatus;
        int iHashCode24 = (iHashCode23 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.unavailableInfoId;
        int iHashCode25 = (iHashCode24 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str8 = this.bottomAreaId;
        int iHashCode26 = (iHashCode25 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Image image = this.originalImage;
        int iHashCode27 = (iHashCode26 + (image == null ? 0 : image.hashCode())) * 31;
        Boolean bool2 = this.showWaistBanner;
        int iHashCode28 = (iHashCode27 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        PriceDescDetail priceDescDetail = this.priceDescDetail;
        int iHashCode29 = (iHashCode28 + (priceDescDetail == null ? 0 : priceDescDetail.hashCode())) * 31;
        String str9 = this.disclaimerText;
        int iHashCode30 = (iHashCode29 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Integer num7 = this.promotionPruchaseLimit;
        int iHashCode31 = (iHashCode30 + (num7 == null ? 0 : num7.hashCode())) * 31;
        SkuSupply skuSupply = this.skuSupply;
        int iHashCode32 = (iHashCode31 + (skuSupply == null ? 0 : skuSupply.hashCode())) * 31;
        BCMStandardTrack bCMStandardTrack = this.bcmStandardTrack;
        int iHashCode33 = (iHashCode32 + (bCMStandardTrack == null ? 0 : bCMStandardTrack.hashCode())) * 31;
        CounterDescription counterDescription = this.counterDescription;
        int iHashCode34 = (iHashCode33 + (counterDescription == null ? 0 : counterDescription.hashCode())) * 31;
        String str10 = this.daInfo;
        int iHashCode35 = (iHashCode34 + (str10 == null ? 0 : str10.hashCode())) * 31;
        List<PdpButtonAreaIdV2> list4 = this.pdpButtonAreaIdV2;
        int iHashCode36 = (iHashCode35 + (list4 == null ? 0 : list4.hashCode())) * 31;
        Boolean bool3 = this.isSupportTryOn;
        int iHashCode37 = (iHashCode36 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        List<NextRequestScene> list5 = this.skuNextRequestScenes;
        int iHashCode38 = (iHashCode37 + (list5 == null ? 0 : list5.hashCode())) * 31;
        String str11 = this.buyButtonInterestId;
        int iHashCode39 = (iHashCode38 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Map<String, String> map = this.buttonDynamicData;
        int iHashCode40 = (iHashCode39 + (map == null ? 0 : map.hashCode())) * 31;
        PriceAfterCouponConfig priceAfterCouponConfig = this.priceAfterCouponConfig;
        int iHashCode41 = (iHashCode40 + (priceAfterCouponConfig == null ? 0 : priceAfterCouponConfig.hashCode())) * 31;
        QuantityNoticeInfo quantityNoticeInfo = this.quantityPromotionNoticeInfo;
        int iHashCode42 = (iHashCode41 + (quantityNoticeInfo == null ? 0 : quantityNoticeInfo.hashCode())) * 31;
        List<SellingPointLabel> list6 = this.skuSellingPoints;
        int iHashCode43 = (iHashCode42 + (list6 == null ? 0 : list6.hashCode())) * 31;
        ECRichText eCRichText = this.skuLogisticsInfo;
        int iHashCode44 = (iHashCode43 + (eCRichText == null ? 0 : eCRichText.hashCode())) * 31;
        SeaSkuPanelWaistBanner seaSkuPanelWaistBanner = this.skuPanelWaistBanner;
        return iHashCode44 + (seaSkuPanelWaistBanner != null ? seaSkuPanelWaistBanner.hashCode() : 0);
    }

    public final String toString() {
        return "SkuItem(skuId=" + this.skuId + ", skuSalePropList=" + this.skuSalePropList + ", salePropValueIds=" + this.salePropValueIds + ", stockNum=" + this.stockNum + ", lowStockWarning=" + this.lowStockWarning + ", purchaseLimit=" + this.purchaseLimit + ", purchaseLimitToast=" + this.purchaseLimitToast + ", price=" + this.price + ", priceV2=" + this.priceV2 + ", needIcon=" + this.needIcon + ", voucherInfo=" + this.voucherInfo + ", warehouseId=" + this.warehouseId + ", addToCartButton=" + this.addToCartButton + ", purchaseNotice=" + this.purchaseNotice + ", promotionView=" + this.promotionView + ", buyButton=" + this.buyButton + ", skuQuantityProperty=" + this.skuQuantityProperty + ", minBuyQuantity=" + this.minBuyQuantity + ", promotionLimitQuantity=" + this.promotionLimitQuantity + ", link=" + this.link + ", preOrderInfo=" + this.preOrderInfo + ", promotionKeyList=" + this.promotionKeyList + ", deductionText=" + this.deductionText + ", skuStatus=" + this.skuStatus + ", unavailableInfoId=" + this.unavailableInfoId + ", bottomAreaId=" + this.bottomAreaId + ", originalImage=" + this.originalImage + ", showWaistBanner=" + this.showWaistBanner + ", priceDescDetail=" + this.priceDescDetail + ", disclaimerText=" + this.disclaimerText + ", promotionPruchaseLimit=" + this.promotionPruchaseLimit + ", skuSupply=" + this.skuSupply + ", bcmStandardTrack=" + this.bcmStandardTrack + ", counterDescription=" + this.counterDescription + ", daInfo=" + this.daInfo + ", pdpButtonAreaIdV2=" + this.pdpButtonAreaIdV2 + ", isSupportTryOn=" + this.isSupportTryOn + ", skuNextRequestScenes=" + this.skuNextRequestScenes + ", buyButtonInterestId=" + this.buyButtonInterestId + ", buttonDynamicData=" + this.buttonDynamicData + ", priceAfterCouponConfig=" + this.priceAfterCouponConfig + ", quantityPromotionNoticeInfo=" + this.quantityPromotionNoticeInfo + ", skuSellingPoints=" + this.skuSellingPoints + ", skuLogisticsInfo=" + this.skuLogisticsInfo + ", skuPanelWaistBanner=" + this.skuPanelWaistBanner + ')';
    }

    public final Float LJ() {
        String str;
        SkuPrice skuPrice = this.price;
        if (skuPrice == null || (str = skuPrice.originalPriceVal) == null) {
            return null;
        }
        return C2327809Ae.LJIIIIZZ(str);
    }

    public final Float LJFF() {
        Price price;
        String priceVal;
        SkuPrice skuPrice = this.price;
        if (skuPrice == null || (price = skuPrice.realPrice) == null || (priceVal = price.getPriceVal()) == null) {
            return null;
        }
        return C2327809Ae.LJIIIIZZ(priceVal);
    }

    public final String LJI() {
        List<SkuSaleProp> list = this.skuSalePropList;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<SkuSaleProp> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().propValue);
        }
        return C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
    }

    @Override // X.InterfaceC1053504Ab
    public final List<SkuSaleProp> LIZ() {
        return this.skuSalePropList;
    }

    @Override // X.InterfaceC1053504Ab
    public final Integer LIZIZ() {
        return this.stockNum;
    }

    @Override // X.InterfaceC1053504Ab
    public final String LIZJ() {
        return this.salePropValueIds;
    }

    @Override // X.InterfaceC1053504Ab
    public final Integer LIZLLL() {
        return this.minBuyQuantity;
    }

    @Override // X.InterfaceC1053504Ab
    public final String getDaInfo() {
        return this.daInfo;
    }

    @Override // X.InterfaceC1053504Ab
    public final String getSkuId() {
        return this.skuId;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.skuId);
        List<SkuSaleProp> list = this.skuSalePropList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<SkuSaleProp> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.salePropValueIds);
        Integer num = this.stockNum;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.lowStockWarning);
        Integer num2 = this.purchaseLimit;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.purchaseLimitToast);
        SkuPrice skuPrice = this.price;
        if (skuPrice == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            skuPrice.writeToParcel(parcel, i);
        }
        List<SkuPriceV2> list2 = this.priceV2;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<SkuPriceV2> it3 = list2.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(parcel, i);
            }
        }
        Boolean bool = this.needIcon;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        SkuVoucher skuVoucher = this.voucherInfo;
        if (skuVoucher == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            skuVoucher.writeToParcel(parcel, i);
        }
        parcel.writeString(this.warehouseId);
        AddToCartButton addToCartButton = this.addToCartButton;
        if (addToCartButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            addToCartButton.writeToParcel(parcel, i);
        }
        PurchaseNotice purchaseNotice = this.purchaseNotice;
        if (purchaseNotice == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(purchaseNotice.desc);
        }
        parcel.writeParcelable(this.promotionView, i);
        BuyButton buyButton = this.buyButton;
        if (buyButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buyButton.writeToParcel(parcel, i);
        }
        SkuQuantityProperty skuQuantityProperty = this.skuQuantityProperty;
        if (skuQuantityProperty == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            skuQuantityProperty.writeToParcel(parcel, i);
        }
        Integer num3 = this.minBuyQuantity;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Integer num4 = this.promotionLimitQuantity;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        parcel.writeString(this.link);
        PreOrderInfo preOrderInfo = this.preOrderInfo;
        if (preOrderInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            preOrderInfo.writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.promotionKeyList);
        parcel.writeString(this.deductionText);
        Integer num5 = this.skuStatus;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num5.intValue());
        }
        Integer num6 = this.unavailableInfoId;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num6.intValue());
        }
        parcel.writeString(this.bottomAreaId);
        parcel.writeParcelable(this.originalImage, i);
        Boolean bool2 = this.showWaistBanner;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        PriceDescDetail priceDescDetail = this.priceDescDetail;
        if (priceDescDetail == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            priceDescDetail.writeToParcel(parcel, i);
        }
        parcel.writeString(this.disclaimerText);
        Integer num7 = this.promotionPruchaseLimit;
        if (num7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num7.intValue());
        }
        SkuSupply skuSupply = this.skuSupply;
        if (skuSupply == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            skuSupply.writeToParcel(parcel, i);
        }
        BCMStandardTrack bCMStandardTrack = this.bcmStandardTrack;
        if (bCMStandardTrack == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bCMStandardTrack.writeToParcel(parcel, i);
        }
        CounterDescription counterDescription = this.counterDescription;
        if (counterDescription == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(counterDescription.text, i);
        }
        parcel.writeString(this.daInfo);
        List<PdpButtonAreaIdV2> list3 = this.pdpButtonAreaIdV2;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            Iterator<PdpButtonAreaIdV2> it4 = list3.iterator();
            while (it4.hasNext()) {
                it4.next().writeToParcel(parcel, i);
            }
        }
        Boolean bool3 = this.isSupportTryOn;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        List<NextRequestScene> list4 = this.skuNextRequestScenes;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list4.size());
            Iterator<NextRequestScene> it5 = list4.iterator();
            while (it5.hasNext()) {
                it5.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.buyButtonInterestId);
        Map<String, String> map = this.buttonDynamicData;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
        PriceAfterCouponConfig priceAfterCouponConfig = this.priceAfterCouponConfig;
        if (priceAfterCouponConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            priceAfterCouponConfig.writeToParcel(parcel, i);
        }
        QuantityNoticeInfo quantityNoticeInfo = this.quantityPromotionNoticeInfo;
        if (quantityNoticeInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            quantityNoticeInfo.writeToParcel(parcel, i);
        }
        List<SellingPointLabel> list5 = this.skuSellingPoints;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list5.size());
            Iterator<SellingPointLabel> it6 = list5.iterator();
            while (it6.hasNext()) {
                it6.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeParcelable(this.skuLogisticsInfo, i);
        SeaSkuPanelWaistBanner seaSkuPanelWaistBanner = this.skuPanelWaistBanner;
        if (seaSkuPanelWaistBanner == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            seaSkuPanelWaistBanner.writeToParcel(parcel, i);
        }
    }

    public SkuItem(String str, List<SkuSaleProp> list, String str2, Integer num, String str3, Integer num2, String str4, SkuPrice skuPrice, List<SkuPriceV2> list2, Boolean bool, SkuVoucher skuVoucher, String str5, AddToCartButton addToCartButton, PurchaseNotice purchaseNotice, PromotionView promotionView, BuyButton buyButton, SkuQuantityProperty skuQuantityProperty, Integer num3, Integer num4, String str6, PreOrderInfo preOrderInfo, List<String> list3, String str7, Integer num5, Integer num6, String str8, Image image, Boolean bool2, PriceDescDetail priceDescDetail, String str9, Integer num7, SkuSupply skuSupply, BCMStandardTrack bCMStandardTrack, CounterDescription counterDescription, String str10, List<PdpButtonAreaIdV2> list4, Boolean bool3, List<NextRequestScene> list5, String str11, Map<String, String> map, PriceAfterCouponConfig priceAfterCouponConfig, QuantityNoticeInfo quantityNoticeInfo, List<SellingPointLabel> list6, ECRichText eCRichText, SeaSkuPanelWaistBanner seaSkuPanelWaistBanner) {
        this.skuId = str;
        this.skuSalePropList = list;
        this.salePropValueIds = str2;
        this.stockNum = num;
        this.lowStockWarning = str3;
        this.purchaseLimit = num2;
        this.purchaseLimitToast = str4;
        this.price = skuPrice;
        this.priceV2 = list2;
        this.needIcon = bool;
        this.voucherInfo = skuVoucher;
        this.warehouseId = str5;
        this.addToCartButton = addToCartButton;
        this.purchaseNotice = purchaseNotice;
        this.promotionView = promotionView;
        this.buyButton = buyButton;
        this.skuQuantityProperty = skuQuantityProperty;
        this.minBuyQuantity = num3;
        this.promotionLimitQuantity = num4;
        this.link = str6;
        this.preOrderInfo = preOrderInfo;
        this.promotionKeyList = list3;
        this.deductionText = str7;
        this.skuStatus = num5;
        this.unavailableInfoId = num6;
        this.bottomAreaId = str8;
        this.originalImage = image;
        this.showWaistBanner = bool2;
        this.priceDescDetail = priceDescDetail;
        this.disclaimerText = str9;
        this.promotionPruchaseLimit = num7;
        this.skuSupply = skuSupply;
        this.bcmStandardTrack = bCMStandardTrack;
        this.counterDescription = counterDescription;
        this.daInfo = str10;
        this.pdpButtonAreaIdV2 = list4;
        this.isSupportTryOn = bool3;
        this.skuNextRequestScenes = list5;
        this.buyButtonInterestId = str11;
        this.buttonDynamicData = map;
        this.priceAfterCouponConfig = priceAfterCouponConfig;
        this.quantityPromotionNoticeInfo = quantityNoticeInfo;
        this.skuSellingPoints = list6;
        this.skuLogisticsInfo = eCRichText;
        this.skuPanelWaistBanner = seaSkuPanelWaistBanner;
    }
}
