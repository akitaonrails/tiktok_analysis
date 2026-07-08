package kotlin.jvm.internal;

import X.C03FA;
import X.C03JV;
import X.C044V;
import X.C09AY;
import X.C0H9H;
import X.C13BV;
import X.C1697810uHb;
import X.C1741890vQh;
import X.C197039127h;
import X.C384050F3z;
import X.C418440Gaw;
import X.C426750GoL;
import X.C814420VxA;
import X.C936903lP;
import X.C937203lS;
import X.C948003nC;
import X.C957003oe;
import X.C957403oi;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListState;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectState;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.osp.auction.AuctionAddressPayState;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionLabelVO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpMainState;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpMainState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.vm.SkuState;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public class AwS16S0001000_1 extends C09AY implements Function1 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f958i0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case 16:
                return invoke$16(this, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj);
            case 19:
                return invoke$19(this, obj);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj);
            case 21:
                return invoke$21(this, obj);
            case 22:
                return invoke$22(this, obj);
            case 23:
                return invoke$23(this, obj);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this, obj);
            case 25:
                return invoke$25(this, obj);
            case 26:
                return invoke$26(this, obj);
            case 27:
                return invoke$27(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS16S0001000_1(int i, int i2) {
        super(1);
        this.$t = i2;
        this.f958i0 = i;
    }

    public static final Object invoke$0(AwS16S0001000_1 awS16S0001000_1, Object obj) {
        AddressListState addressListState = (AddressListState) obj;
        return addressListState.copy(awS16S0001000_1.f958i0, addressListState.addressItems, addressListState.selectAddressId, addressListState.policyItemVO, addressListState.addressState, addressListState.changeOnOrderToast);
    }

    public static final Object invoke$1(AwS16S0001000_1 awS16S0001000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("rank", Integer.valueOf(awS16S0001000_1.f958i0 + 1));
        laneParams.plusAssign("option_name", "zipcode");
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS16S0001000_1 awS16S0001000_1, Object obj) {
        SkuState skuState = (SkuState) obj;
        return skuState.copy(skuState.checkedSkuArray, skuState.showToast, skuState.currentImage, skuState.buyButton, skuState.buyButtonInterestId, skuState.buttonDynamicData, skuState.preOrderInfo, skuState.currentPriceData, skuState.hidePriceTip, skuState.purchaseNotice, skuState.promotionDealVO, skuState.specifications, skuState.currentQuantityLimit, skuState.currentQuantity, skuState.currentImagePosition, skuState.currentInstallmentPlan, skuState.keyBoardVisibility, skuState.skuFragmentClosed, skuState.skuDataState, skuState.addToCartButton, skuState.paymentModule, skuState.showLoadingView, skuState.skuStockInfo, skuState.forceRefresh, skuState.originalProductPackStruct, skuState.localSizeSalePropList, skuState.isQuantityEditable, skuState.slideToBnpl, skuState.exceptionUX, skuState.counterDescription, Integer.valueOf(awS16S0001000_1.f958i0), skuState.cutPriceSkuPanel, skuState.skuPanelWaistBanner, skuState.skuPanelSellingPoints, skuState.skuHeaderTopLabels);
    }

    public static final Object invoke$11(AwS16S0001000_1 awS16S0001000_1, Object obj) {
        SkuState skuState = (SkuState) obj;
        return skuState.copy(skuState.checkedSkuArray, skuState.showToast, skuState.currentImage, skuState.buyButton, skuState.buyButtonInterestId, skuState.buttonDynamicData, skuState.preOrderInfo, skuState.currentPriceData, skuState.hidePriceTip, skuState.purchaseNotice, skuState.promotionDealVO, skuState.specifications, skuState.currentQuantityLimit, skuState.currentQuantity, awS16S0001000_1.f958i0, skuState.currentInstallmentPlan, skuState.keyBoardVisibility, skuState.skuFragmentClosed, skuState.skuDataState, skuState.addToCartButton, skuState.paymentModule, skuState.showLoadingView, skuState.skuStockInfo, skuState.forceRefresh, skuState.originalProductPackStruct, skuState.localSizeSalePropList, skuState.isQuantityEditable, skuState.slideToBnpl, skuState.exceptionUX, skuState.counterDescription, skuState.topOutsideWidgetVisibleHeight, skuState.cutPriceSkuPanel, skuState.skuPanelWaistBanner, skuState.skuPanelSellingPoints, skuState.skuHeaderTopLabels);
    }

    public static final Object invoke$12(AwS16S0001000_1 awS16S0001000_1, Object obj) {
        List<PromotionLabel> list;
        List<PromotionLabel> listSubList;
        String strValueOf;
        Object obj2;
        Object obj3;
        PromotionLabelVO promotionDealVO = ((SkuState) obj).getPromotionDealVO();
        if (promotionDealVO == null || (list = promotionDealVO.promotionLabels) == null) {
            return null;
        }
        int i = awS16S0001000_1.f958i0;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        int i2 = 0;
        if (list.size() >= i) {
            listSubList = list.subList(0, i);
        } else {
            listSubList = C13BV.INSTANCE;
        }
        for (PromotionLabel promotionLabel : listSubList) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                PromotionLabel promotionLabel2 = promotionLabel;
                Integer numValueOf = Integer.valueOf(i2);
                Map<String, Object> map3 = promotionLabel2.daInfo;
                String strValueOf2 = CardStruct.IStatusCode.DEFAULT;
                if (map3 != null && (obj3 = map3.get("promotion_tag_id")) != null) {
                    strValueOf = String.valueOf(obj3);
                } else {
                    strValueOf = CardStruct.IStatusCode.DEFAULT;
                }
                map.put(numValueOf, strValueOf);
                Integer numValueOf2 = Integer.valueOf(i2);
                Map<String, Object> map4 = promotionLabel2.daInfo;
                if (map4 != null && (obj2 = map4.get("promotion_tag_type")) != null) {
                    strValueOf2 = String.valueOf(obj2);
                }
                map2.put(numValueOf2, strValueOf2);
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        C044V c044v = C044V.LIZ;
        String strLJIIIIZZ = C1741890vQh.LJIIIIZZ(map2);
        String strLJIIIIZZ2 = C1741890vQh.LJIIIIZZ(map);
        c044v.getClass();
        C044V.LJIIL(i, strLJIIIIZZ, strLJIIIIZZ2);
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS16S0001000_1 awS16S0001000_1, Object obj) {
        com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuState skuState = (com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuState) obj;
        return skuState.copy(skuState.checkedSkuArray, skuState.showToast, skuState.currentImage, skuState.preOrderInfo, skuState.currentPrice, skuState.currentPriceV2, skuState.quantityNoticeInfos, skuState.promotionView, skuState.originalPrice, skuState.priceAfterCoupon, skuState.discountText, skuState.taxDescription, skuState.depositFeeDesc, skuState.unitPriceDescription, skuState.currentQuantityLimit, skuState.currentQuantity, skuState.contentList, skuState.keyBoardVisibility, skuState.skuPanelCloseEvent, skuState.skuDataState, skuState.addToCartButton, skuState.showLoadingView, skuState.showLoadingSpinner, skuState.skuStockInfo, skuState.forceRefresh, skuState.originalProductPackStruct, skuState.protectionProgramText, skuState.productTitle, skuState.promotionLabelVO, skuState.productSellerInfo, skuState.skuPanelReminder, skuState.isPriceHidden, skuState.isQuantityEditable, awS16S0001000_1.f958i0, skuState.scrollOrientation, skuState.bottomAreaElem, skuState.bizEnvChange, skuState.focusSpecAction, skuState.allSkuSelected, skuState.totalPrice, skuState.couponEvent, skuState.carouselImages, skuState.carouselNeedToScrollToFirst, skuState.counterDisclaimer, skuState.exceptionUX, skuState.selectedPurchaseMethod, skuState.selectedPeriodText, skuState.pricePrefix, skuState.extraInfoData, skuState.paymentInfo, skuState.summaryInfo, skuState.refreshFlag, skuState.hidePaymentMethodView, skuState.promotionWaist);
    }

    public static final Object invoke$14(AwS16S0001000_1 awS16S0001000_1, Object obj) {
        com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuState skuState = (com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuState) obj;
        return skuState.copy(skuState.checkedSkuArray, skuState.showToast, skuState.currentImage, skuState.preOrderInfo, skuState.currentPrice, skuState.currentPriceV2, skuState.quantityNoticeInfos, skuState.promotionView, skuState.originalPrice, skuState.priceAfterCoupon, skuState.discountText, skuState.taxDescription, skuState.depositFeeDesc, skuState.unitPriceDescription, skuState.currentQuantityLimit, skuState.currentQuantity, skuState.contentList, skuState.keyBoardVisibility, skuState.skuPanelCloseEvent, skuState.skuDataState, skuState.addToCartButton, skuState.showLoadingView, skuState.showLoadingSpinner, skuState.skuStockInfo, skuState.forceRefresh, skuState.originalProductPackStruct, skuState.protectionProgramText, skuState.productTitle, skuState.promotionLabelVO, skuState.productSellerInfo, skuState.skuPanelReminder, skuState.isPriceHidden, skuState.isQuantityEditable, skuState.scrollOffset, awS16S0001000_1.f958i0, skuState.bottomAreaElem, skuState.bizEnvChange, skuState.focusSpecAction, skuState.allSkuSelected, skuState.totalPrice, skuState.couponEvent, skuState.carouselImages, skuState.carouselNeedToScrollToFirst, skuState.counterDisclaimer, skuState.exceptionUX, skuState.selectedPurchaseMethod, skuState.selectedPeriodText, skuState.pricePrefix, skuState.extraInfoData, skuState.paymentInfo, skuState.summaryInfo, skuState.refreshFlag, skuState.hidePaymentMethodView, skuState.promotionWaist);
    }

    public static final Object invoke$15(AwS16S0001000_1 awS16S0001000_1, Object obj) {
        C957003oe c957003oe = (C957003oe) obj;
        c957003oe.setTextFont(92);
        c957003oe.setGravity(16);
        C426750GoL.LJIIIZ(c957003oe, Integer.valueOf(awS16S0001000_1.f958i0), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), 0, false, 16);
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS16S0001000_1 awS16S0001000_1, Object obj) {
        DeliveryPanelState deliveryPanelState = (DeliveryPanelState) obj;
        return deliveryPanelState.copy(deliveryPanelState.changePage, deliveryPanelState.apply, deliveryPanelState.selectedLogistic, deliveryPanelState.selectedShipToInfo, deliveryPanelState.addressRenderData, deliveryPanelState.status, deliveryPanelState.logisticList, deliveryPanelState.claimVoucherExceptionUX, deliveryPanelState.exposedItems, deliveryPanelState.exposedAddOnItems, deliveryPanelState.dispatchInfo, deliveryPanelState.shippingToAddressInfo, deliveryPanelState.logistics, deliveryPanelState.pdpLogisticModule, deliveryPanelState.privacyPolicyStatement, deliveryPanelState.shippingPolicyModule, deliveryPanelState.hasMapLocationChanged, awS16S0001000_1.f958i0, deliveryPanelState.pickupSelectAddress, deliveryPanelState.pickUpList, deliveryPanelState.pickupSelectIdx, deliveryPanelState.savePickUpStatus, deliveryPanelState.savePickUpToast, deliveryPanelState.getPudoAddressStatus, deliveryPanelState.pudoSelectedLogistic, deliveryPanelState.centerAddress, deliveryPanelState.pudoSource, deliveryPanelState.changeAddressJumpSchema);
    }

    public static final Object invoke$17(AwS16S0001000_1 awS16S0001000_1, Object obj) {
        DeliveryPanelState deliveryPanelState = (DeliveryPanelState) obj;
        return deliveryPanelState.copy(deliveryPanelState.changePage, deliveryPanelState.apply, deliveryPanelState.selectedLogistic, deliveryPanelState.selectedShipToInfo, deliveryPanelState.addressRenderData, awS16S0001000_1.f958i0, deliveryPanelState.logisticList, deliveryPanelState.claimVoucherExceptionUX, deliveryPanelState.exposedItems, deliveryPanelState.exposedAddOnItems, deliveryPanelState.dispatchInfo, deliveryPanelState.shippingToAddressInfo, deliveryPanelState.logistics, deliveryPanelState.pdpLogisticModule, deliveryPanelState.privacyPolicyStatement, deliveryPanelState.shippingPolicyModule, deliveryPanelState.hasMapLocationChanged, deliveryPanelState.tab, deliveryPanelState.pickupSelectAddress, deliveryPanelState.pickUpList, deliveryPanelState.pickupSelectIdx, deliveryPanelState.savePickUpStatus, deliveryPanelState.savePickUpToast, deliveryPanelState.getPudoAddressStatus, deliveryPanelState.pudoSelectedLogistic, deliveryPanelState.centerAddress, deliveryPanelState.pudoSource, deliveryPanelState.changeAddressJumpSchema);
    }

    public static final Object invoke$18(AwS16S0001000_1 awS16S0001000_1, Object obj) {
        AuctionAddressPayState auctionAddressPayState = (AuctionAddressPayState) obj;
        return auctionAddressPayState.copy(auctionAddressPayState.pageLoadStatus, auctionAddressPayState.adapterList, auctionAddressPayState.address, auctionAddressPayState.payment, awS16S0001000_1.f958i0, auctionAddressPayState.showDialogState, auctionAddressPayState.loadSuccess, auctionAddressPayState.otpString);
    }

    public static final Object invoke$19(AwS16S0001000_1 awS16S0001000_1, Object obj) {
        AuctionAddressPayState auctionAddressPayState = (AuctionAddressPayState) obj;
        return auctionAddressPayState.copy(awS16S0001000_1.f958i0, auctionAddressPayState.adapterList, auctionAddressPayState.address, auctionAddressPayState.payment, auctionAddressPayState.abnormalStatus, auctionAddressPayState.showDialogState, auctionAddressPayState.loadSuccess, auctionAddressPayState.otpString);
    }

    public static final Object invoke$2(AwS16S0001000_1 awS16S0001000_1, Object obj) {
        AddressSelectState addressSelectState = (AddressSelectState) obj;
        return addressSelectState.copy(addressSelectState.selectedAddress, awS16S0001000_1.f958i0, addressSelectState.renderDataList, addressSelectState.selectedRegions, addressSelectState.applyBtnEnable, addressSelectState.currentAddressSelectType, addressSelectState.selectCountry, addressSelectState.chooseLocation, addressSelectState.reachableAddress, addressSelectState.logDuration);
    }

    public static final Object invoke$20(AwS16S0001000_1 awS16S0001000_1, Object obj) {
        return C03JV.LIZ((C03JV) obj, 0, null, null, false, null, false, null, null, null, null, null, null, null, null, 0, null, null, 0, null, null, false, 0L, false, false, null, null, false, null, null, null, null, null, false, null, null, false, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, false, 0, false, null, null, false, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, 0, null, null, null, null, null, new C948003nC(Integer.valueOf(awS16S0001000_1.f958i0)), null, null, null, null, false, null, null, false, null, null, false, null, null, null, null, null, null, null, -1, -1, -1, 1048574);
    }

    public static final Object invoke$21(AwS16S0001000_1 awS16S0001000_1, Object obj) {
        C197039127h c197039127h = (C197039127h) obj;
        int i = awS16S0001000_1.f958i0;
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
        c384050F3z.LIZ = Integer.valueOf(i);
        c197039127h.setBackground(c384050F3z.LIZ(c197039127h.getContext()));
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$22(AwS16S0001000_1 awS16S0001000_1, Object obj) {
        View view = (View) obj;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        if (awS16S0001000_1.f958i0 != 0) {
            layoutParams.setMarginStart(C0H9H.LIZIZ(12));
        }
        layoutParams.setMarginEnd(C0H9H.LIZIZ(12));
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(view);
        view.setLayoutParams(layoutParams);
        return Unit.LIZ;
    }

    public static final Object invoke$23(AwS16S0001000_1 awS16S0001000_1, Object obj) {
        SeaPdpMainState seaPdpMainState = (SeaPdpMainState) obj;
        return seaPdpMainState.copy(seaPdpMainState.isFullScreen, seaPdpMainState.bottomBarVO, seaPdpMainState.bottomBarData, seaPdpMainState.tabs, seaPdpMainState.dismiss, seaPdpMainState.sheetState, seaPdpMainState.contentList, seaPdpMainState.bottomSheetSlideOffset, seaPdpMainState.creatorSheetVO, seaPdpMainState.scrollOrientation, seaPdpMainState.creatorSheetSlideOffset, seaPdpMainState.scrollOffset, seaPdpMainState.seaFocusTabAction, seaPdpMainState.seaFocusTabActionNew, seaPdpMainState.selectedTabName, seaPdpMainState.loadingStatus, seaPdpMainState.flashSaleState, seaPdpMainState.flashSaleCountDown, seaPdpMainState.cartTip, seaPdpMainState.cartEntry, awS16S0001000_1.f958i0, seaPdpMainState.shareInfo, seaPdpMainState.showLoadingDialog, seaPdpMainState.blockInfo, seaPdpMainState.showFloatShop, seaPdpMainState.bizEnvChange, seaPdpMainState.slideToPaymentModule, seaPdpMainState.lynxAirItemName, seaPdpMainState.exceptionUX, seaPdpMainState.lynxPopupState, seaPdpMainState.bottomFloatingState, seaPdpMainState.seaEntranceBubble, seaPdpMainState.bottomMynaBannerState, seaPdpMainState.mediaWindow);
    }

    public static final Object invoke$24(AwS16S0001000_1 awS16S0001000_1, Object obj) {
        C957403oi c957403oi = (C957403oi) obj;
        c957403oi.LJ(C03FA.LIZIZ);
        c957403oi.LIZJ("sub_page_name", "choose_your_location");
        c957403oi.LIZJ("is_fullscreen", 0);
        c957403oi.LIZJ("address_num", Integer.valueOf(awS16S0001000_1.f958i0));
        return Unit.LIZ;
    }

    public static final Object invoke$25(AwS16S0001000_1 awS16S0001000_1, Object obj) {
        HashMap map = (HashMap) obj;
        map.put("path", "/api/v1/shop/shipping_address/input_item");
        map.put("page_name", "shipping_address");
        map.put("use_cache", Integer.valueOf(awS16S0001000_1.f958i0));
        return Unit.LIZ;
    }

    public static final Object invoke$26(AwS16S0001000_1 awS16S0001000_1, Object obj) {
        PdpMainState pdpMainState = (PdpMainState) obj;
        return pdpMainState.copy(pdpMainState.isFullScreen, pdpMainState.bottomBarVO, pdpMainState.dismiss, pdpMainState.sheetState, pdpMainState.contentList, pdpMainState.bottomSheetSlideOffset, pdpMainState.creatorSheetVO, pdpMainState.scrollOrientation, pdpMainState.creatorSheetSlideOffset, pdpMainState.scrollOffset, pdpMainState.currentFocusModule, pdpMainState.loadingStatus, pdpMainState.flashSaleState, pdpMainState.flashSaleCountDown, pdpMainState.cartTip, pdpMainState.cartEntry, awS16S0001000_1.f958i0, pdpMainState.shareInfo, pdpMainState.blockInfo, pdpMainState.showFavoriteGuide, pdpMainState.shopInfo, pdpMainState.bottomAreaElem, pdpMainState.protectionProgramText, pdpMainState.bizEnvChange, pdpMainState.userRight, pdpMainState.exceptionUX, pdpMainState.lynxPopupState, pdpMainState.bottomFloatingState, pdpMainState.openSkuOnInit, pdpMainState.addCartData);
    }

    public static final Object invoke$27(AwS16S0001000_1 awS16S0001000_1, Object obj) {
        return C936903lP.LIZ((C936903lP) obj, null, null, null, 0, new C937203lS(awS16S0001000_1.f958i0, true), null, 0, null, null, null, 0, 2031);
    }

    public static final Object invoke$3(AwS16S0001000_1 awS16S0001000_1, Object obj) {
        return C03JV.LIZ((C03JV) obj, 0, null, null, false, null, false, null, null, null, null, null, null, null, null, awS16S0001000_1.f958i0, null, null, 0, null, null, false, 0L, false, false, null, null, false, null, null, null, null, null, false, null, null, false, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, false, 0, false, null, null, false, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, false, null, null, null, null, null, null, null, -16385, -1, -1, 1048575);
    }

    public static final Object invoke$4(AwS16S0001000_1 awS16S0001000_1, Object obj) {
        return C03JV.LIZ((C03JV) obj, awS16S0001000_1.f958i0, null, null, false, null, false, null, null, null, null, null, null, null, null, 0, null, null, 0, null, null, false, 0L, false, false, null, null, false, null, null, null, null, null, false, null, null, false, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, false, 0, false, null, null, false, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, false, null, null, null, null, null, null, null, -2, -1, -1, 1048575);
    }

    public static final Object invoke$5(AwS16S0001000_1 awS16S0001000_1, Object obj) {
        return C03JV.LIZ((C03JV) obj, 0, null, null, false, null, false, null, null, null, null, null, null, null, null, awS16S0001000_1.f958i0, null, null, 0, null, null, false, 0L, false, false, null, null, false, null, null, null, null, null, false, null, null, false, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, false, 0, false, null, null, false, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, false, null, null, null, null, null, null, null, -16385, -1, -1, 1048575);
    }

    public static final Object invoke$6(AwS16S0001000_1 awS16S0001000_1, Object obj) {
        return C03JV.LIZ((C03JV) obj, 0, null, null, false, null, false, null, null, null, null, null, null, null, null, 0, null, null, awS16S0001000_1.f958i0, null, null, false, 0L, false, false, null, null, false, null, null, null, null, null, false, null, null, false, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, false, 0, false, null, null, false, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, false, null, null, null, null, null, null, null, -131073, -1, -1, 1048575);
    }

    public static final Object invoke$7(AwS16S0001000_1 awS16S0001000_1, Object obj) {
        return C03JV.LIZ((C03JV) obj, awS16S0001000_1.f958i0, null, null, false, null, false, null, null, null, null, null, null, null, null, 0, null, null, 0, null, null, false, 0L, false, false, null, null, false, null, null, null, null, null, false, null, null, false, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, false, 0, false, null, null, false, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, false, null, null, null, null, null, null, null, -2, -1, -1, 1048575);
    }

    public static final Object invoke$8(AwS16S0001000_1 awS16S0001000_1, Object obj) {
        SeaPdpMainState seaPdpMainState = (SeaPdpMainState) obj;
        return seaPdpMainState.copy(seaPdpMainState.isFullScreen, seaPdpMainState.bottomBarVO, seaPdpMainState.bottomBarData, seaPdpMainState.tabs, seaPdpMainState.dismiss, awS16S0001000_1.f958i0, seaPdpMainState.contentList, seaPdpMainState.bottomSheetSlideOffset, seaPdpMainState.creatorSheetVO, seaPdpMainState.scrollOrientation, seaPdpMainState.creatorSheetSlideOffset, seaPdpMainState.scrollOffset, seaPdpMainState.seaFocusTabAction, seaPdpMainState.seaFocusTabActionNew, seaPdpMainState.selectedTabName, seaPdpMainState.loadingStatus, seaPdpMainState.flashSaleState, seaPdpMainState.flashSaleCountDown, seaPdpMainState.cartTip, seaPdpMainState.cartEntry, seaPdpMainState.bodyContent, seaPdpMainState.shareInfo, seaPdpMainState.showLoadingDialog, seaPdpMainState.blockInfo, seaPdpMainState.showFloatShop, seaPdpMainState.bizEnvChange, seaPdpMainState.slideToPaymentModule, seaPdpMainState.lynxAirItemName, seaPdpMainState.exceptionUX, seaPdpMainState.lynxPopupState, seaPdpMainState.bottomFloatingState, seaPdpMainState.seaEntranceBubble, seaPdpMainState.bottomMynaBannerState, seaPdpMainState.mediaWindow);
    }

    public static final Object invoke$9(AwS16S0001000_1 awS16S0001000_1, Object obj) {
        PdpMainState pdpMainState = (PdpMainState) obj;
        return pdpMainState.copy(pdpMainState.isFullScreen, pdpMainState.bottomBarVO, pdpMainState.dismiss, awS16S0001000_1.f958i0, pdpMainState.contentList, pdpMainState.bottomSheetSlideOffset, pdpMainState.creatorSheetVO, pdpMainState.scrollOrientation, pdpMainState.creatorSheetSlideOffset, pdpMainState.scrollOffset, pdpMainState.currentFocusModule, pdpMainState.loadingStatus, pdpMainState.flashSaleState, pdpMainState.flashSaleCountDown, pdpMainState.cartTip, pdpMainState.cartEntry, pdpMainState.bodyContent, pdpMainState.shareInfo, pdpMainState.blockInfo, pdpMainState.showFavoriteGuide, pdpMainState.shopInfo, pdpMainState.bottomAreaElem, pdpMainState.protectionProgramText, pdpMainState.bizEnvChange, pdpMainState.userRight, pdpMainState.exceptionUX, pdpMainState.lynxPopupState, pdpMainState.bottomFloatingState, pdpMainState.openSkuOnInit, pdpMainState.addCartData);
    }
}
