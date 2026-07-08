package com.ss.android.ugc.aweme.ecommerce.base.sku.vm;

import X.AnonymousClass0464;
import X.C004I;
import X.C041I;
import X.C043Z;
import X.C044L;
import X.C047F;
import X.C047L;
import X.C10366043o;
import X.C10462047g;
import X.C13BV;
import X.C2097608Jq;
import X.C755502xF;
import X.C7735030j;
import X.C786410Ut5;
import X.EnumC10383044f;
import X.InterfaceC0148002o;
import X.InterfaceC746802vq;
import android.text.SpannableStringBuilder;
import com.bytedance.android.livesdk.model.message.ext.PromotionView;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.CouponClaimedEvent;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ExchangeInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpBottomAreaElem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionExtraInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionWaist;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.AddToCartButton;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.PreOrderInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.QuantityNoticeInfo;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SkuState implements C004I, InterfaceC0148002o {
    public static final int $stable = 8;
    public AddToCartButton addToCartButton;
    public final Boolean allSkuSelected;
    public final Object bizEnvChange;
    public final PdpBottomAreaElem bottomAreaElem;
    public final List<Image> carouselImages;
    public final Boolean carouselNeedToScrollToFirst;
    public final List<String> checkedSkuArray;
    public final List<InterfaceC746802vq> contentList;
    public final String counterDisclaimer;
    public final CouponClaimedEvent couponEvent;
    public final Image currentImage;
    public final String currentPrice;
    public final SpannableStringBuilder currentPriceV2;
    public final Pair<Integer, C044L> currentQuantity;
    public final C7735030j currentQuantityLimit;
    public final String depositFeeDesc;
    public final String discountText;
    public final ExceptionUX exceptionUX;
    public final C10462047g extraInfoData;
    public final C047L focusSpecAction;
    public final Object forceRefresh;
    public final Object hidePaymentMethodView;
    public final boolean isPriceHidden;
    public final boolean isQuantityEditable;
    public final Boolean keyBoardVisibility;
    public final String originalPrice;
    public final ProductPackStruct originalProductPackStruct;
    public final PaymentInfo paymentInfo;
    public final PreOrderInfo preOrderInfo;
    public final C041I priceAfterCoupon;
    public final String pricePrefix;
    public final AnonymousClass0464 productSellerInfo;
    public final String productTitle;
    public final PromotionExtraInfo promotionLabelVO;
    public final PromotionView promotionView;
    public final PromotionWaist promotionWaist;
    public final LinkRichText protectionProgramText;
    public final Map<Integer, QuantityNoticeInfo> quantityNoticeInfos;
    public final Object refreshFlag;
    public final int scrollOffset;
    public final int scrollOrientation;
    public final String selectedPeriodText;
    public final Integer selectedPurchaseMethod;
    public Boolean showLoadingSpinner;
    public final boolean showLoadingView;
    public final C047F showToast;
    public final EnumC10383044f skuDataState;
    public final C043Z skuPanelCloseEvent;
    public final ExchangeInfo skuPanelReminder;
    public final C10366043o skuStockInfo;
    public final C755502xF summaryInfo;
    public final String taxDescription;
    public final String totalPrice;
    public final String unitPriceDescription;

    public SkuState() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, false, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 4194303, null);
    }

    public final SkuState copy(List<String> list, C047F c047f, Image image, PreOrderInfo preOrderInfo, String str, SpannableStringBuilder spannableStringBuilder, Map<Integer, QuantityNoticeInfo> map, PromotionView promotionView, String str2, C041I c041i, String str3, String str4, String str5, String str6, C7735030j c7735030j, Pair<Integer, C044L> pair, List<? extends InterfaceC746802vq> list2, Boolean bool, C043Z c043z, EnumC10383044f enumC10383044f, AddToCartButton addToCartButton, boolean z, Boolean bool2, C10366043o c10366043o, Object obj, ProductPackStruct productPackStruct, LinkRichText linkRichText, String str7, PromotionExtraInfo promotionExtraInfo, AnonymousClass0464 anonymousClass0464, ExchangeInfo exchangeInfo, boolean z2, boolean z3, int i, int i2, PdpBottomAreaElem pdpBottomAreaElem, Object obj2, C047L c047l, Boolean bool3, String str8, CouponClaimedEvent couponClaimedEvent, List<Image> list3, Boolean bool4, String str9, ExceptionUX exceptionUX, Integer num, String str10, String str11, C10462047g c10462047g, PaymentInfo paymentInfo, C755502xF c755502xF, Object obj3, Object obj4, PromotionWaist promotionWaist) {
        return new SkuState(list, c047f, image, preOrderInfo, str, spannableStringBuilder, map, promotionView, str2, c041i, str3, str4, str5, str6, c7735030j, pair, list2, bool, c043z, enumC10383044f, addToCartButton, z, bool2, c10366043o, obj, productPackStruct, linkRichText, str7, promotionExtraInfo, anonymousClass0464, exchangeInfo, z2, z3, i, i2, pdpBottomAreaElem, obj2, c047l, bool3, str8, couponClaimedEvent, list3, bool4, str9, exceptionUX, num, str10, str11, c10462047g, paymentInfo, c755502xF, obj3, obj4, promotionWaist);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuState)) {
            return false;
        }
        SkuState skuState = (SkuState) obj;
        return Intrinsics.LJFF(this.checkedSkuArray, skuState.checkedSkuArray) && Intrinsics.LJFF(this.showToast, skuState.showToast) && Intrinsics.LJFF(this.currentImage, skuState.currentImage) && Intrinsics.LJFF(this.preOrderInfo, skuState.preOrderInfo) && Intrinsics.LJFF(this.currentPrice, skuState.currentPrice) && Intrinsics.LJFF(this.currentPriceV2, skuState.currentPriceV2) && Intrinsics.LJFF(this.quantityNoticeInfos, skuState.quantityNoticeInfos) && Intrinsics.LJFF(this.promotionView, skuState.promotionView) && Intrinsics.LJFF(this.originalPrice, skuState.originalPrice) && Intrinsics.LJFF(this.priceAfterCoupon, skuState.priceAfterCoupon) && Intrinsics.LJFF(this.discountText, skuState.discountText) && Intrinsics.LJFF(this.taxDescription, skuState.taxDescription) && Intrinsics.LJFF(this.depositFeeDesc, skuState.depositFeeDesc) && Intrinsics.LJFF(this.unitPriceDescription, skuState.unitPriceDescription) && Intrinsics.LJFF(this.currentQuantityLimit, skuState.currentQuantityLimit) && Intrinsics.LJFF(this.currentQuantity, skuState.currentQuantity) && Intrinsics.LJFF(this.contentList, skuState.contentList) && Intrinsics.LJFF(this.keyBoardVisibility, skuState.keyBoardVisibility) && Intrinsics.LJFF(this.skuPanelCloseEvent, skuState.skuPanelCloseEvent) && this.skuDataState == skuState.skuDataState && Intrinsics.LJFF(this.addToCartButton, skuState.addToCartButton) && this.showLoadingView == skuState.showLoadingView && Intrinsics.LJFF(this.showLoadingSpinner, skuState.showLoadingSpinner) && Intrinsics.LJFF(this.skuStockInfo, skuState.skuStockInfo) && Intrinsics.LJFF(this.forceRefresh, skuState.forceRefresh) && Intrinsics.LJFF(this.originalProductPackStruct, skuState.originalProductPackStruct) && Intrinsics.LJFF(this.protectionProgramText, skuState.protectionProgramText) && Intrinsics.LJFF(this.productTitle, skuState.productTitle) && Intrinsics.LJFF(this.promotionLabelVO, skuState.promotionLabelVO) && Intrinsics.LJFF(this.productSellerInfo, skuState.productSellerInfo) && Intrinsics.LJFF(this.skuPanelReminder, skuState.skuPanelReminder) && this.isPriceHidden == skuState.isPriceHidden && this.isQuantityEditable == skuState.isQuantityEditable && this.scrollOffset == skuState.scrollOffset && this.scrollOrientation == skuState.scrollOrientation && Intrinsics.LJFF(this.bottomAreaElem, skuState.bottomAreaElem) && Intrinsics.LJFF(this.bizEnvChange, skuState.bizEnvChange) && Intrinsics.LJFF(this.focusSpecAction, skuState.focusSpecAction) && Intrinsics.LJFF(this.allSkuSelected, skuState.allSkuSelected) && Intrinsics.LJFF(this.totalPrice, skuState.totalPrice) && Intrinsics.LJFF(this.couponEvent, skuState.couponEvent) && Intrinsics.LJFF(this.carouselImages, skuState.carouselImages) && Intrinsics.LJFF(this.carouselNeedToScrollToFirst, skuState.carouselNeedToScrollToFirst) && Intrinsics.LJFF(this.counterDisclaimer, skuState.counterDisclaimer) && Intrinsics.LJFF(this.exceptionUX, skuState.exceptionUX) && Intrinsics.LJFF(this.selectedPurchaseMethod, skuState.selectedPurchaseMethod) && Intrinsics.LJFF(this.selectedPeriodText, skuState.selectedPeriodText) && Intrinsics.LJFF(this.pricePrefix, skuState.pricePrefix) && Intrinsics.LJFF(this.extraInfoData, skuState.extraInfoData) && Intrinsics.LJFF(this.paymentInfo, skuState.paymentInfo) && Intrinsics.LJFF(this.summaryInfo, skuState.summaryInfo) && Intrinsics.LJFF(this.refreshFlag, skuState.refreshFlag) && Intrinsics.LJFF(this.hidePaymentMethodView, skuState.hidePaymentMethodView) && Intrinsics.LJFF(this.promotionWaist, skuState.promotionWaist);
    }

    public int hashCode() {
        List<String> list = this.checkedSkuArray;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        C047F c047f = this.showToast;
        int iHashCode2 = (iHashCode + (c047f == null ? 0 : c047f.hashCode())) * 31;
        Image image = this.currentImage;
        int iHashCode3 = (iHashCode2 + (image == null ? 0 : image.hashCode())) * 31;
        PreOrderInfo preOrderInfo = this.preOrderInfo;
        int iHashCode4 = (((iHashCode3 + (preOrderInfo == null ? 0 : preOrderInfo.hashCode())) * 31) + this.currentPrice.hashCode()) * 31;
        SpannableStringBuilder spannableStringBuilder = this.currentPriceV2;
        int iHashCode5 = (iHashCode4 + (spannableStringBuilder == null ? 0 : spannableStringBuilder.hashCode())) * 31;
        Map<Integer, QuantityNoticeInfo> map = this.quantityNoticeInfos;
        int iHashCode6 = (iHashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        PromotionView promotionView = this.promotionView;
        int iHashCode7 = (iHashCode6 + (promotionView == null ? 0 : promotionView.hashCode())) * 31;
        String str = this.originalPrice;
        int iHashCode8 = (iHashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        C041I c041i = this.priceAfterCoupon;
        int iHashCode9 = (iHashCode8 + (c041i == null ? 0 : c041i.hashCode())) * 31;
        String str2 = this.discountText;
        int iHashCode10 = (iHashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.taxDescription;
        int iHashCode11 = (iHashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.depositFeeDesc;
        int iHashCode12 = (iHashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.unitPriceDescription;
        int iHashCode13 = (((((((iHashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.currentQuantityLimit.hashCode()) * 31) + this.currentQuantity.hashCode()) * 31) + this.contentList.hashCode()) * 31;
        Boolean bool = this.keyBoardVisibility;
        int iHashCode14 = (((((iHashCode13 + (bool == null ? 0 : bool.hashCode())) * 31) + this.skuPanelCloseEvent.hashCode()) * 31) + this.skuDataState.hashCode()) * 31;
        AddToCartButton addToCartButton = this.addToCartButton;
        int iHashCode15 = (((iHashCode14 + (addToCartButton == null ? 0 : addToCartButton.hashCode())) * 31) + C786410Ut5.Z2(this.showLoadingView)) * 31;
        Boolean bool2 = this.showLoadingSpinner;
        int iHashCode16 = (((((iHashCode15 + (bool2 == null ? 0 : bool2.hashCode())) * 31) + this.skuStockInfo.hashCode()) * 31) + this.forceRefresh.hashCode()) * 31;
        ProductPackStruct productPackStruct = this.originalProductPackStruct;
        int iHashCode17 = (iHashCode16 + (productPackStruct == null ? 0 : productPackStruct.hashCode())) * 31;
        LinkRichText linkRichText = this.protectionProgramText;
        int iHashCode18 = (iHashCode17 + (linkRichText == null ? 0 : linkRichText.hashCode())) * 31;
        String str6 = this.productTitle;
        int iHashCode19 = (iHashCode18 + (str6 == null ? 0 : str6.hashCode())) * 31;
        PromotionExtraInfo promotionExtraInfo = this.promotionLabelVO;
        int iHashCode20 = (iHashCode19 + (promotionExtraInfo == null ? 0 : promotionExtraInfo.hashCode())) * 31;
        AnonymousClass0464 anonymousClass0464 = this.productSellerInfo;
        int iHashCode21 = (iHashCode20 + (anonymousClass0464 == null ? 0 : anonymousClass0464.hashCode())) * 31;
        ExchangeInfo exchangeInfo = this.skuPanelReminder;
        int iHashCode22 = (((((((((iHashCode21 + (exchangeInfo == null ? 0 : exchangeInfo.hashCode())) * 31) + C786410Ut5.Z2(this.isPriceHidden)) * 31) + C786410Ut5.Z2(this.isQuantityEditable)) * 31) + this.scrollOffset) * 31) + this.scrollOrientation) * 31;
        PdpBottomAreaElem pdpBottomAreaElem = this.bottomAreaElem;
        int iHashCode23 = (iHashCode22 + (pdpBottomAreaElem == null ? 0 : pdpBottomAreaElem.hashCode())) * 31;
        Object obj = this.bizEnvChange;
        int iHashCode24 = (iHashCode23 + (obj == null ? 0 : obj.hashCode())) * 31;
        C047L c047l = this.focusSpecAction;
        int iHashCode25 = (iHashCode24 + (c047l == null ? 0 : c047l.hashCode())) * 31;
        Boolean bool3 = this.allSkuSelected;
        int iHashCode26 = (iHashCode25 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str7 = this.totalPrice;
        int iHashCode27 = (iHashCode26 + (str7 == null ? 0 : str7.hashCode())) * 31;
        CouponClaimedEvent couponClaimedEvent = this.couponEvent;
        int iHashCode28 = (iHashCode27 + (couponClaimedEvent == null ? 0 : couponClaimedEvent.hashCode())) * 31;
        List<Image> list2 = this.carouselImages;
        int iHashCode29 = (iHashCode28 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool4 = this.carouselNeedToScrollToFirst;
        int iHashCode30 = (iHashCode29 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str8 = this.counterDisclaimer;
        int iHashCode31 = (iHashCode30 + (str8 == null ? 0 : str8.hashCode())) * 31;
        ExceptionUX exceptionUX = this.exceptionUX;
        int iHashCode32 = (iHashCode31 + (exceptionUX == null ? 0 : exceptionUX.hashCode())) * 31;
        Integer num = this.selectedPurchaseMethod;
        int iHashCode33 = (iHashCode32 + (num == null ? 0 : num.hashCode())) * 31;
        String str9 = this.selectedPeriodText;
        int iHashCode34 = (iHashCode33 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.pricePrefix;
        int iHashCode35 = (iHashCode34 + (str10 == null ? 0 : str10.hashCode())) * 31;
        C10462047g c10462047g = this.extraInfoData;
        int iHashCode36 = (iHashCode35 + (c10462047g == null ? 0 : c10462047g.hashCode())) * 31;
        PaymentInfo paymentInfo = this.paymentInfo;
        int iHashCode37 = (iHashCode36 + (paymentInfo == null ? 0 : paymentInfo.hashCode())) * 31;
        C755502xF c755502xF = this.summaryInfo;
        int iHashCode38 = (iHashCode37 + (c755502xF == null ? 0 : c755502xF.hashCode())) * 31;
        Object obj2 = this.refreshFlag;
        int iHashCode39 = (iHashCode38 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.hidePaymentMethodView;
        int iHashCode40 = (iHashCode39 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        PromotionWaist promotionWaist = this.promotionWaist;
        return iHashCode40 + (promotionWaist != null ? promotionWaist.hashCode() : 0);
    }

    public String toString() {
        return "SkuState(checkedSkuArray=" + this.checkedSkuArray + ", showToast=" + this.showToast + ", currentImage=" + this.currentImage + ", preOrderInfo=" + this.preOrderInfo + ", currentPrice=" + this.currentPrice + ", currentPriceV2=" + ((Object) this.currentPriceV2) + ", quantityNoticeInfos=" + this.quantityNoticeInfos + ", promotionView=" + this.promotionView + ", originalPrice=" + this.originalPrice + ", priceAfterCoupon=" + this.priceAfterCoupon + ", discountText=" + this.discountText + ", taxDescription=" + this.taxDescription + ", depositFeeDesc=" + this.depositFeeDesc + ", unitPriceDescription=" + this.unitPriceDescription + ", currentQuantityLimit=" + this.currentQuantityLimit + ", currentQuantity=" + this.currentQuantity + ", contentList=" + this.contentList + ", keyBoardVisibility=" + this.keyBoardVisibility + ", skuPanelCloseEvent=" + this.skuPanelCloseEvent + ", skuDataState=" + this.skuDataState + ", addToCartButton=" + this.addToCartButton + ", showLoadingView=" + this.showLoadingView + ", showLoadingSpinner=" + this.showLoadingSpinner + ", skuStockInfo=" + this.skuStockInfo + ", forceRefresh=" + this.forceRefresh + ", originalProductPackStruct=" + this.originalProductPackStruct + ", protectionProgramText=" + this.protectionProgramText + ", productTitle=" + this.productTitle + ", promotionLabelVO=" + this.promotionLabelVO + ", productSellerInfo=" + this.productSellerInfo + ", skuPanelReminder=" + this.skuPanelReminder + ", isPriceHidden=" + this.isPriceHidden + ", isQuantityEditable=" + this.isQuantityEditable + ", scrollOffset=" + this.scrollOffset + ", scrollOrientation=" + this.scrollOrientation + ", bottomAreaElem=" + this.bottomAreaElem + ", bizEnvChange=" + this.bizEnvChange + ", focusSpecAction=" + this.focusSpecAction + ", allSkuSelected=" + this.allSkuSelected + ", totalPrice=" + this.totalPrice + ", couponEvent=" + this.couponEvent + ", carouselImages=" + this.carouselImages + ", carouselNeedToScrollToFirst=" + this.carouselNeedToScrollToFirst + ", counterDisclaimer=" + this.counterDisclaimer + ", exceptionUX=" + this.exceptionUX + ", selectedPurchaseMethod=" + this.selectedPurchaseMethod + ", selectedPeriodText=" + this.selectedPeriodText + ", pricePrefix=" + this.pricePrefix + ", extraInfoData=" + this.extraInfoData + ", paymentInfo=" + this.paymentInfo + ", summaryInfo=" + this.summaryInfo + ", refreshFlag=" + this.refreshFlag + ", hidePaymentMethodView=" + this.hidePaymentMethodView + ", promotionWaist=" + this.promotionWaist + ')';
    }

    public final AddToCartButton getAddToCartButton() {
        return this.addToCartButton;
    }

    public final Boolean getAllSkuSelected() {
        return this.allSkuSelected;
    }

    public final Object getBizEnvChange() {
        return this.bizEnvChange;
    }

    public final PdpBottomAreaElem getBottomAreaElem() {
        return this.bottomAreaElem;
    }

    public final List<Image> getCarouselImages() {
        return this.carouselImages;
    }

    public final Boolean getCarouselNeedToScrollToFirst() {
        return this.carouselNeedToScrollToFirst;
    }

    public final List<String> getCheckedSkuArray() {
        return this.checkedSkuArray;
    }

    public final List<InterfaceC746802vq> getContentList() {
        return this.contentList;
    }

    public final String getCounterDisclaimer() {
        return this.counterDisclaimer;
    }

    public final CouponClaimedEvent getCouponEvent() {
        return this.couponEvent;
    }

    public final Image getCurrentImage() {
        return this.currentImage;
    }

    public final String getCurrentPrice() {
        return this.currentPrice;
    }

    public final SpannableStringBuilder getCurrentPriceV2() {
        return this.currentPriceV2;
    }

    public final Pair<Integer, C044L> getCurrentQuantity() {
        return this.currentQuantity;
    }

    public final C7735030j getCurrentQuantityLimit() {
        return this.currentQuantityLimit;
    }

    public final String getDepositFeeDesc() {
        return this.depositFeeDesc;
    }

    public final String getDiscountText() {
        return this.discountText;
    }

    public final ExceptionUX getExceptionUX() {
        return this.exceptionUX;
    }

    public final C10462047g getExtraInfoData() {
        return this.extraInfoData;
    }

    public final C047L getFocusSpecAction() {
        return this.focusSpecAction;
    }

    public final Object getForceRefresh() {
        return this.forceRefresh;
    }

    public final Object getHidePaymentMethodView() {
        return this.hidePaymentMethodView;
    }

    public final Boolean getKeyBoardVisibility() {
        return this.keyBoardVisibility;
    }

    public final String getOriginalPrice() {
        return this.originalPrice;
    }

    public final ProductPackStruct getOriginalProductPackStruct() {
        return this.originalProductPackStruct;
    }

    public final PaymentInfo getPaymentInfo() {
        return this.paymentInfo;
    }

    public final PreOrderInfo getPreOrderInfo() {
        return this.preOrderInfo;
    }

    public final C041I getPriceAfterCoupon() {
        return this.priceAfterCoupon;
    }

    public final String getPricePrefix() {
        return this.pricePrefix;
    }

    public final AnonymousClass0464 getProductSellerInfo() {
        return this.productSellerInfo;
    }

    public final String getProductTitle() {
        return this.productTitle;
    }

    public final PromotionExtraInfo getPromotionLabelVO() {
        return this.promotionLabelVO;
    }

    public final PromotionView getPromotionView() {
        return this.promotionView;
    }

    public final PromotionWaist getPromotionWaist() {
        return this.promotionWaist;
    }

    public final LinkRichText getProtectionProgramText() {
        return this.protectionProgramText;
    }

    public final Map<Integer, QuantityNoticeInfo> getQuantityNoticeInfos() {
        return this.quantityNoticeInfos;
    }

    public final Object getRefreshFlag() {
        return this.refreshFlag;
    }

    public final int getScrollOffset() {
        return this.scrollOffset;
    }

    public final int getScrollOrientation() {
        return this.scrollOrientation;
    }

    public final String getSelectedPeriodText() {
        return this.selectedPeriodText;
    }

    public final Integer getSelectedPurchaseMethod() {
        return this.selectedPurchaseMethod;
    }

    public final Boolean getShowLoadingSpinner() {
        return this.showLoadingSpinner;
    }

    public final boolean getShowLoadingView() {
        return this.showLoadingView;
    }

    public final C047F getShowToast() {
        return this.showToast;
    }

    public final EnumC10383044f getSkuDataState() {
        return this.skuDataState;
    }

    public final C043Z getSkuPanelCloseEvent() {
        return this.skuPanelCloseEvent;
    }

    public final ExchangeInfo getSkuPanelReminder() {
        return this.skuPanelReminder;
    }

    public final C10366043o getSkuStockInfo() {
        return this.skuStockInfo;
    }

    public final C755502xF getSummaryInfo() {
        return this.summaryInfo;
    }

    public final String getTaxDescription() {
        return this.taxDescription;
    }

    public final String getTotalPrice() {
        return this.totalPrice;
    }

    public final String getUnitPriceDescription() {
        return this.unitPriceDescription;
    }

    public final boolean isPriceHidden() {
        return this.isPriceHidden;
    }

    public final boolean isQuantityEditable() {
        return this.isQuantityEditable;
    }

    public final void setAddToCartButton(AddToCartButton addToCartButton) {
        this.addToCartButton = addToCartButton;
    }

    public final void setShowLoadingSpinner(Boolean bool) {
        this.showLoadingSpinner = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SkuState(List<String> list, C047F c047f, Image image, PreOrderInfo preOrderInfo, String str, SpannableStringBuilder spannableStringBuilder, Map<Integer, QuantityNoticeInfo> map, PromotionView promotionView, String str2, C041I c041i, String str3, String str4, String str5, String str6, C7735030j c7735030j, Pair<Integer, C044L> pair, List<? extends InterfaceC746802vq> list2, Boolean bool, C043Z c043z, EnumC10383044f enumC10383044f, AddToCartButton addToCartButton, boolean z, Boolean bool2, C10366043o c10366043o, Object obj, ProductPackStruct productPackStruct, LinkRichText linkRichText, String str7, PromotionExtraInfo promotionExtraInfo, AnonymousClass0464 anonymousClass0464, ExchangeInfo exchangeInfo, boolean z2, boolean z3, int i, int i2, PdpBottomAreaElem pdpBottomAreaElem, Object obj2, C047L c047l, Boolean bool3, String str8, CouponClaimedEvent couponClaimedEvent, List<Image> list3, Boolean bool4, String str9, ExceptionUX exceptionUX, Integer num, String str10, String str11, C10462047g c10462047g, PaymentInfo paymentInfo, C755502xF c755502xF, Object obj3, Object obj4, PromotionWaist promotionWaist) {
        this.checkedSkuArray = list;
        this.showToast = c047f;
        this.currentImage = image;
        this.preOrderInfo = preOrderInfo;
        this.currentPrice = str;
        this.currentPriceV2 = spannableStringBuilder;
        this.quantityNoticeInfos = map;
        this.promotionView = promotionView;
        this.originalPrice = str2;
        this.priceAfterCoupon = c041i;
        this.discountText = str3;
        this.taxDescription = str4;
        this.depositFeeDesc = str5;
        this.unitPriceDescription = str6;
        this.currentQuantityLimit = c7735030j;
        this.currentQuantity = pair;
        this.contentList = list2;
        this.keyBoardVisibility = bool;
        this.skuPanelCloseEvent = c043z;
        this.skuDataState = enumC10383044f;
        this.addToCartButton = addToCartButton;
        this.showLoadingView = z;
        this.showLoadingSpinner = bool2;
        this.skuStockInfo = c10366043o;
        this.forceRefresh = obj;
        this.originalProductPackStruct = productPackStruct;
        this.protectionProgramText = linkRichText;
        this.productTitle = str7;
        this.promotionLabelVO = promotionExtraInfo;
        this.productSellerInfo = anonymousClass0464;
        this.skuPanelReminder = exchangeInfo;
        this.isPriceHidden = z2;
        this.isQuantityEditable = z3;
        this.scrollOffset = i;
        this.scrollOrientation = i2;
        this.bottomAreaElem = pdpBottomAreaElem;
        this.bizEnvChange = obj2;
        this.focusSpecAction = c047l;
        this.allSkuSelected = bool3;
        this.totalPrice = str8;
        this.couponEvent = couponClaimedEvent;
        this.carouselImages = list3;
        this.carouselNeedToScrollToFirst = bool4;
        this.counterDisclaimer = str9;
        this.exceptionUX = exceptionUX;
        this.selectedPurchaseMethod = num;
        this.selectedPeriodText = str10;
        this.pricePrefix = str11;
        this.extraInfoData = c10462047g;
        this.paymentInfo = paymentInfo;
        this.summaryInfo = c755502xF;
        this.refreshFlag = obj3;
        this.hidePaymentMethodView = obj4;
        this.promotionWaist = promotionWaist;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SkuState(List list, C047F c047f, Image image, PreOrderInfo preOrderInfo, String str, SpannableStringBuilder spannableStringBuilder, Map map, PromotionView promotionView, String str2, C041I c041i, String str3, String str4, String str5, String str6, C7735030j c7735030j, Pair pair, List list2, Boolean bool, C043Z c043z, EnumC10383044f enumC10383044f, AddToCartButton addToCartButton, boolean z, Boolean bool2, C10366043o c10366043o, Object obj, ProductPackStruct productPackStruct, LinkRichText linkRichText, String str7, PromotionExtraInfo promotionExtraInfo, AnonymousClass0464 anonymousClass0464, ExchangeInfo exchangeInfo, boolean z2, boolean z3, int i, int i2, PdpBottomAreaElem pdpBottomAreaElem, Object obj2, C047L c047l, Boolean bool3, String str8, CouponClaimedEvent couponClaimedEvent, List list3, Boolean bool4, String str9, ExceptionUX exceptionUX, Integer num, String str10, String str11, C10462047g c10462047g, PaymentInfo paymentInfo, C755502xF c755502xF, Object obj3, Object obj4, PromotionWaist promotionWaist, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        Boolean bool5;
        C7735030j c7735030j2 = c7735030j;
        C10366043o c10366043o2 = c10366043o;
        C043Z c043z2 = c043z;
        Pair pair2 = pair;
        list = (i3 & 1) != 0 ? null : list;
        c047f = (i3 & 2) != 0 ? null : c047f;
        image = (i3 & 4) != 0 ? null : image;
        preOrderInfo = (i3 & 8) != 0 ? null : preOrderInfo;
        str = (i3 & 16) != 0 ? "" : str;
        spannableStringBuilder = (i3 & 32) != 0 ? null : spannableStringBuilder;
        map = (i3 & 64) != 0 ? C2097608Jq.LJ() : map;
        promotionView = (i3 & 128) != 0 ? null : promotionView;
        str2 = (i3 & 256) != 0 ? null : str2;
        c041i = (i3 & 512) != 0 ? null : c041i;
        str3 = (i3 & 1024) != 0 ? null : str3;
        str4 = (i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : str4;
        str5 = (i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : str5;
        str6 = (i3 & 8192) != 0 ? null : str6;
        c7735030j2 = (i3 & 16384) != 0 ? new C7735030j(1, 200) : c7735030j2;
        pair2 = (32768 & i3) != 0 ? new Pair(1, new C044L(false, 3)) : pair2;
        list2 = (65536 & i3) != 0 ? C13BV.INSTANCE : list2;
        bool = (131072 & i3) != 0 ? null : bool;
        c043z2 = (i3 & 262144) != 0 ? new C043Z(2) : c043z2;
        enumC10383044f = (524288 & i3) != 0 ? EnumC10383044f.INIT : enumC10383044f;
        addToCartButton = (1048576 & i3) != 0 ? null : addToCartButton;
        z = (2097152 & i3) != 0 ? false : z;
        bool2 = (4194304 & i3) != 0 ? null : bool2;
        if ((8388608 & i3) != 0) {
            bool5 = null;
            c10366043o2 = new C10366043o(null, null);
        } else {
            bool5 = null;
        }
        this(list, c047f, image, preOrderInfo, str, spannableStringBuilder, map, promotionView, str2, c041i, str3, str4, str5, str6, c7735030j2, pair2, list2, bool, c043z2, enumC10383044f, addToCartButton, z, bool2, c10366043o2, (16777216 & i3) != 0 ? new Object() : obj, (33554432 & i3) != 0 ? bool5 : productPackStruct, (67108864 & i3) != 0 ? bool5 : linkRichText, (134217728 & i3) != 0 ? bool5 : str7, (268435456 & i3) != 0 ? bool5 : promotionExtraInfo, (536870912 & i3) != 0 ? bool5 : anonymousClass0464, (1073741824 & i3) != 0 ? bool5 : exchangeInfo, (i3 & Integer.MIN_VALUE) != 0 ? false : z2, (i4 & 1) != 0 ? true : z3, (i4 & 2) != 0 ? 0 : i, (i4 & 4) != 0 ? 1 : i2, (i4 & 8) != 0 ? bool5 : pdpBottomAreaElem, (i4 & 16) != 0 ? bool5 : obj2, (i4 & 32) != 0 ? bool5 : c047l, (i4 & 64) == 0 ? bool3 : bool5, (i4 & 128) != 0 ? null : str8, (i4 & 256) != 0 ? null : couponClaimedEvent, (i4 & 512) != 0 ? null : list3, (i4 & 1024) != 0 ? null : bool4, (i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : str9, (i4 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : exceptionUX, (i4 & 8192) != 0 ? null : num, (i4 & 16384) != 0 ? null : str10, (32768 & i4) != 0 ? null : str11, (65536 & i4) != 0 ? null : c10462047g, (131072 & i4) != 0 ? null : paymentInfo, (i4 & 262144) != 0 ? null : c755502xF, (524288 & i4) != 0 ? null : obj3, (1048576 & i4) != 0 ? null : obj4, (i4 & 2097152) != 0 ? null : promotionWaist);
    }
}
