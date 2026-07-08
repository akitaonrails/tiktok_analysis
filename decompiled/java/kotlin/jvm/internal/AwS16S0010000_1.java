package kotlin.jvm.internal;

import X.AbstractC1250290idn;
import X.C035J;
import X.C03JV;
import X.C03ZA;
import X.C09AY;
import X.C1251150ifB;
import X.C15438062q;
import X.C291001Au;
import X.C418440Gaw;
import X.C703302op;
import X.C786410Ut5;
import X.C814420VxA;
import X.C818903Hv;
import X.C862603Yq;
import X.C862703Yr;
import X.C890803dy;
import X.C926703jl;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.osp.auction.AuctionAddressPayState;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentState;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpMainState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.vm.SkuState;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public class AwS16S0010000_1 extends C09AY implements Function1 {
    public final int $t;
    public boolean z0;

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
            case 28:
                return invoke$28(this, obj);
            case 29:
                return invoke$29(this, obj);
            case 30:
                return invoke$30(this, obj);
            case 31:
                return invoke$31(this, obj);
            case 32:
                return invoke$32(this, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return invoke$33(this, obj);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return invoke$34(this, obj);
            case 35:
                return invoke$35(this, obj);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return invoke$36(this, obj);
            case 37:
                return invoke$37(this, obj);
            default:
                return null;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS16S0010000_1(int r3) {
        /*
            r2 = this;
            r2.$t = r3
            int r3 = 17 - r3
            if (r3 == 0) goto Lf
            r1 = r2
            r0 = 0
            r1.z0 = r0
            r0 = 1
        Lb:
            r1.<init>(r0)
            return
        Lf:
            r1 = r2
            r0 = 1
            r1.z0 = r0
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS16S0010000_1.<init>(int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS16S0010000_1(boolean z, int i) {
        super(1);
        this.$t = i;
        this.z0 = z;
    }

    public static final Object invoke$0(AwS16S0010000_1 awS16S0010000_1, Object obj) {
        return C818903Hv.LIZ((C818903Hv) obj, null, null, null, null, Boolean.valueOf(awS16S0010000_1.z0), 31);
    }

    public static final Object invoke$1(AwS16S0010000_1 awS16S0010000_1, Object obj) {
        PaymentState paymentState = (PaymentState) obj;
        List<Object> paymentList = paymentState.getPaymentList();
        boolean z = awS16S0010000_1.z0;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(paymentList, 10));
        for (Object objLIZ : paymentList) {
            if (objLIZ instanceof C862603Yq) {
                C862703Yr c862703Yr = (C862703Yr) objLIZ;
                c862703Yr.getClass();
                objLIZ = new C862603Yq(c862703Yr.LIZ, c862703Yr.LIZIZ, null);
            } else if ((objLIZ instanceof C03ZA) && z) {
                objLIZ = C03ZA.LIZ((C03ZA) objLIZ, null, new Object(), 287);
            }
            arrayList.add(objLIZ);
        }
        return paymentState.copy(paymentState.checkedPaymentMethod, arrayList, paymentState.paymentInfo, paymentState.systemError, paymentState.emailHintVisible, paymentState.paymentInfoForThreeStepCache, paymentState.paymentInfoForNextStep, paymentState.showLoading, paymentState.resendPayAction, paymentState.scrollUpAction, paymentState.scrollUpDistance, paymentState.toast, paymentState.checkedCreditMethod, new Object(), paymentState.abnormalStatus, paymentState.exceptionUX, paymentState.changeBindCardStatus, paymentState.bindCardErrorMsg, paymentState.bindCardErrorAction, paymentState.chooseSaveStatus, paymentState.subPaymentMethodIsChecked, paymentState.checkedAnchorPaymentMethod, paymentState.summaryPanelStatus, paymentState.summary, paymentState.dialogContent, paymentState.buttonTrigger);
    }

    public static final Object invoke$10(AwS16S0010000_1 awS16S0010000_1, Object obj) {
        SkuState skuState = (SkuState) obj;
        return skuState.copy(skuState.checkedSkuArray, skuState.showToast, skuState.currentImage, skuState.buyButton, skuState.buyButtonInterestId, skuState.buttonDynamicData, skuState.preOrderInfo, skuState.currentPriceData, skuState.hidePriceTip, skuState.purchaseNotice, skuState.promotionDealVO, skuState.specifications, skuState.currentQuantityLimit, skuState.currentQuantity, skuState.currentImagePosition, skuState.currentInstallmentPlan, Boolean.valueOf(awS16S0010000_1.z0), skuState.skuFragmentClosed, skuState.skuDataState, skuState.addToCartButton, skuState.paymentModule, skuState.showLoadingView, skuState.skuStockInfo, skuState.forceRefresh, skuState.originalProductPackStruct, skuState.localSizeSalePropList, skuState.isQuantityEditable, skuState.slideToBnpl, skuState.exceptionUX, skuState.counterDescription, skuState.topOutsideWidgetVisibleHeight, skuState.cutPriceSkuPanel, skuState.skuPanelWaistBanner, skuState.skuPanelSellingPoints, skuState.skuHeaderTopLabels);
    }

    public static final Object invoke$11(AwS16S0010000_1 awS16S0010000_1, Object obj) {
        com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuState skuState = (com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuState) obj;
        return skuState.copy(skuState.checkedSkuArray, skuState.showToast, skuState.currentImage, skuState.preOrderInfo, skuState.currentPrice, skuState.currentPriceV2, skuState.quantityNoticeInfos, skuState.promotionView, skuState.originalPrice, skuState.priceAfterCoupon, skuState.discountText, skuState.taxDescription, skuState.depositFeeDesc, skuState.unitPriceDescription, skuState.currentQuantityLimit, skuState.currentQuantity, skuState.contentList, skuState.keyBoardVisibility, skuState.skuPanelCloseEvent, skuState.skuDataState, skuState.addToCartButton, skuState.showLoadingView, Boolean.valueOf(awS16S0010000_1.z0), skuState.skuStockInfo, skuState.forceRefresh, skuState.originalProductPackStruct, skuState.protectionProgramText, skuState.productTitle, skuState.promotionLabelVO, skuState.productSellerInfo, skuState.skuPanelReminder, skuState.isPriceHidden, skuState.isQuantityEditable, skuState.scrollOffset, skuState.scrollOrientation, skuState.bottomAreaElem, skuState.bizEnvChange, skuState.focusSpecAction, skuState.allSkuSelected, skuState.totalPrice, skuState.couponEvent, skuState.carouselImages, skuState.carouselNeedToScrollToFirst, skuState.counterDisclaimer, skuState.exceptionUX, skuState.selectedPurchaseMethod, skuState.selectedPeriodText, skuState.pricePrefix, skuState.extraInfoData, skuState.paymentInfo, skuState.summaryInfo, skuState.refreshFlag, skuState.hidePaymentMethodView, skuState.promotionWaist);
    }

    public static final Object invoke$12(AwS16S0010000_1 awS16S0010000_1, Object obj) {
        com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuState skuState = (com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuState) obj;
        return skuState.copy(skuState.checkedSkuArray, skuState.showToast, skuState.currentImage, skuState.preOrderInfo, skuState.currentPrice, skuState.currentPriceV2, skuState.quantityNoticeInfos, skuState.promotionView, skuState.originalPrice, skuState.priceAfterCoupon, skuState.discountText, skuState.taxDescription, skuState.depositFeeDesc, skuState.unitPriceDescription, skuState.currentQuantityLimit, skuState.currentQuantity, skuState.contentList, skuState.keyBoardVisibility, skuState.skuPanelCloseEvent, skuState.skuDataState, skuState.addToCartButton, awS16S0010000_1.z0, skuState.showLoadingSpinner, skuState.skuStockInfo, skuState.forceRefresh, skuState.originalProductPackStruct, skuState.protectionProgramText, skuState.productTitle, skuState.promotionLabelVO, skuState.productSellerInfo, skuState.skuPanelReminder, skuState.isPriceHidden, skuState.isQuantityEditable, skuState.scrollOffset, skuState.scrollOrientation, skuState.bottomAreaElem, skuState.bizEnvChange, skuState.focusSpecAction, skuState.allSkuSelected, skuState.totalPrice, skuState.couponEvent, skuState.carouselImages, skuState.carouselNeedToScrollToFirst, skuState.counterDisclaimer, skuState.exceptionUX, skuState.selectedPurchaseMethod, skuState.selectedPeriodText, skuState.pricePrefix, skuState.extraInfoData, skuState.paymentInfo, skuState.summaryInfo, skuState.refreshFlag, skuState.hidePaymentMethodView, skuState.promotionWaist);
    }

    public static final Object invoke$13(AwS16S0010000_1 awS16S0010000_1, Object obj) {
        com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuState skuState = (com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuState) obj;
        return skuState.copy(skuState.checkedSkuArray, skuState.showToast, skuState.currentImage, skuState.preOrderInfo, skuState.currentPrice, skuState.currentPriceV2, skuState.quantityNoticeInfos, skuState.promotionView, skuState.originalPrice, skuState.priceAfterCoupon, skuState.discountText, skuState.taxDescription, skuState.depositFeeDesc, skuState.unitPriceDescription, skuState.currentQuantityLimit, skuState.currentQuantity, skuState.contentList, Boolean.valueOf(awS16S0010000_1.z0), skuState.skuPanelCloseEvent, skuState.skuDataState, skuState.addToCartButton, skuState.showLoadingView, skuState.showLoadingSpinner, skuState.skuStockInfo, skuState.forceRefresh, skuState.originalProductPackStruct, skuState.protectionProgramText, skuState.productTitle, skuState.promotionLabelVO, skuState.productSellerInfo, skuState.skuPanelReminder, skuState.isPriceHidden, skuState.isQuantityEditable, skuState.scrollOffset, skuState.scrollOrientation, skuState.bottomAreaElem, skuState.bizEnvChange, skuState.focusSpecAction, skuState.allSkuSelected, skuState.totalPrice, skuState.couponEvent, skuState.carouselImages, skuState.carouselNeedToScrollToFirst, skuState.counterDisclaimer, skuState.exceptionUX, skuState.selectedPurchaseMethod, skuState.selectedPeriodText, skuState.pricePrefix, skuState.extraInfoData, skuState.paymentInfo, skuState.summaryInfo, skuState.refreshFlag, skuState.hidePaymentMethodView, skuState.promotionWaist);
    }

    public static final Object invoke$14(AwS16S0010000_1 awS16S0010000_1, Object obj) {
        com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuState skuState = (com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuState) obj;
        return skuState.copy(skuState.checkedSkuArray, skuState.showToast, skuState.currentImage, skuState.preOrderInfo, skuState.currentPrice, skuState.currentPriceV2, skuState.quantityNoticeInfos, skuState.promotionView, skuState.originalPrice, skuState.priceAfterCoupon, skuState.discountText, skuState.taxDescription, skuState.depositFeeDesc, skuState.unitPriceDescription, skuState.currentQuantityLimit, skuState.currentQuantity, skuState.contentList, Boolean.valueOf(awS16S0010000_1.z0), skuState.skuPanelCloseEvent, skuState.skuDataState, skuState.addToCartButton, skuState.showLoadingView, skuState.showLoadingSpinner, skuState.skuStockInfo, skuState.forceRefresh, skuState.originalProductPackStruct, skuState.protectionProgramText, skuState.productTitle, skuState.promotionLabelVO, skuState.productSellerInfo, skuState.skuPanelReminder, skuState.isPriceHidden, skuState.isQuantityEditable, skuState.scrollOffset, skuState.scrollOrientation, skuState.bottomAreaElem, skuState.bizEnvChange, skuState.focusSpecAction, skuState.allSkuSelected, skuState.totalPrice, skuState.couponEvent, skuState.carouselImages, skuState.carouselNeedToScrollToFirst, skuState.counterDisclaimer, skuState.exceptionUX, skuState.selectedPurchaseMethod, skuState.selectedPeriodText, skuState.pricePrefix, skuState.extraInfoData, skuState.paymentInfo, skuState.summaryInfo, skuState.refreshFlag, skuState.hidePaymentMethodView, skuState.promotionWaist);
    }

    public static final Object invoke$15(AwS16S0010000_1 awS16S0010000_1, Object obj) {
        AuctionAddressPayState auctionAddressPayState = (AuctionAddressPayState) obj;
        return auctionAddressPayState.copy(auctionAddressPayState.pageLoadStatus, auctionAddressPayState.adapterList, auctionAddressPayState.address, auctionAddressPayState.payment, auctionAddressPayState.abnormalStatus, awS16S0010000_1.z0, auctionAddressPayState.loadSuccess, auctionAddressPayState.otpString);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$16(kotlin.jvm.internal.AwS16S0010000_1 r9, java.lang.Object r10) {
        /*
            r3 = r10
            X.03ml r3 = (X.C945303ml) r3
            boolean r0 = r9.z0
            r4 = 0
            if (r0 == 0) goto L19
            X.03ma r0 = r3.LJIIJ
            if (r0 == 0) goto L19
            java.lang.CharSequence r0 = r0.LIZIZ()
            r2 = 0
            if (r0 == 0) goto L19
            int r0 = r0.length()
            if (r0 != 0) goto L1b
        L19:
            r2 = 8
        L1b:
            X.03mw r1 = r3.LJFF
            r0 = 126(0x7e, float:1.77E-43)
            X.03mw r6 = X.C946403mw.LIZ(r1, r2, r4, r0)
            r10 = 16351(0x3fdf, float:2.2913E-41)
            r5 = r4
            r7 = r4
            r8 = r4
            r9 = r4
            X.03ml r0 = X.C945303ml.LIZ(r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS16S0010000_1.invoke$16(kotlin.jvm.internal.AwS16S0010000_1, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$17(AwS16S0010000_1 awS16S0010000_1, Object obj) {
        return C03JV.LIZ((C03JV) obj, 0, null, null, false, null, false, null, null, null, null, null, null, null, null, 0, null, null, 0, null, null, false, 0L, false, false, null, null, false, null, null, null, null, null, false, null, null, false, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, awS16S0010000_1.z0, 0, false, null, null, false, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, false, null, null, null, null, null, null, null, -1, -1, -9, 1048575);
    }

    public static final Object invoke$18(AwS16S0010000_1 awS16S0010000_1, Object obj) {
        C03JV c03jv = (C03JV) obj;
        if (awS16S0010000_1.z0) {
            return C03JV.LIZ(c03jv, 0, null, null, false, null, false, null, null, null, null, null, null, null, null, 0, null, null, 0, null, null, false, 0L, false, false, null, null, false, null, null, null, null, null, false, null, null, false, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, false, 0, false, null, null, false, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, false, null, null, null, null, null, null, null, -4194305, -1, -1, 1048575);
        }
        return C03JV.LIZ(c03jv, 0, null, null, false, null, false, null, null, null, null, null, null, null, null, 0, null, null, 0, null, null, false, 0L, false, false, null, null, false, null, null, null, null, null, false, null, null, false, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, false, 0, false, null, null, false, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, false, null, null, null, null, null, null, null, -5242881, -1, -1, 1048575);
    }

    public static final Object invoke$19(AwS16S0010000_1 awS16S0010000_1, Object obj) {
        return C03JV.LIZ((C03JV) obj, 0, null, null, false, null, awS16S0010000_1.z0, null, null, null, null, null, null, null, null, 0, null, null, 0, null, null, false, 0L, false, false, null, null, false, null, null, null, null, null, false, null, null, false, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, false, 0, false, null, null, false, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, false, null, null, null, null, null, null, null, -33, -1, -1, 1048575);
    }

    public static final Object invoke$2(AwS16S0010000_1 awS16S0010000_1, Object obj) {
        return C890803dy.LIZ((C890803dy) obj, null, null, null, false, null, null, null, null, null, null, Boolean.valueOf(awS16S0010000_1.z0), false, null, null, null, null, null, null, null, null, null, 4192255);
    }

    public static final Object invoke$20(AwS16S0010000_1 awS16S0010000_1, Object obj) {
        return C03JV.LIZ((C03JV) obj, 0, null, null, false, null, false, null, null, null, null, null, null, null, null, 0, null, null, 0, null, null, false, 0L, false, false, null, null, false, null, null, null, null, null, awS16S0010000_1.z0, null, null, false, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, false, 0, false, null, null, false, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, false, null, null, null, null, null, null, null, -1, -5, -1, 1048575);
    }

    public static final Object invoke$21(AwS16S0010000_1 awS16S0010000_1, Object obj) {
        return C03JV.LIZ((C03JV) obj, 0, null, null, false, null, false, null, null, null, null, null, null, null, null, 0, null, null, 0, null, null, false, 0L, awS16S0010000_1.z0, false, null, null, false, null, null, null, null, null, false, null, null, false, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, false, 0, false, null, null, false, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, false, null, null, null, null, null, null, null, -5242881, -1, -1, 1048575);
    }

    public static final Object invoke$22(AwS16S0010000_1 awS16S0010000_1, Object obj) {
        return C03JV.LIZ((C03JV) obj, 0, null, null, false, null, false, null, null, null, null, null, null, null, null, 0, null, null, 0, null, null, awS16S0010000_1.z0, 0L, false, false, null, null, false, null, null, null, null, null, false, null, null, false, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, false, 0, false, null, null, false, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, false, null, null, null, null, null, null, null, -1048577, -1, -1, 1048575);
    }

    public static final Object invoke$23(AwS16S0010000_1 awS16S0010000_1, Object obj) {
        return C03JV.LIZ((C03JV) obj, 0, null, null, false, null, false, null, null, null, null, null, null, null, null, 0, null, null, 0, null, null, false, 0L, false, false, null, null, false, null, null, null, null, null, false, null, null, false, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, Boolean.valueOf(awS16S0010000_1.z0), null, null, null, null, null, false, null, null, false, null, false, 0, false, null, null, false, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, false, null, null, null, null, null, null, null, -1, -16777217, -1, 1048575);
    }

    public static final Object invoke$24(AwS16S0010000_1 awS16S0010000_1, Object obj) {
        return C03JV.LIZ((C03JV) obj, 0, null, null, false, null, false, null, null, null, null, null, null, null, null, 0, null, null, 0, null, null, false, 0L, false, false, null, null, false, null, null, null, null, null, false, null, null, false, null, null, null, null, false, awS16S0010000_1.z0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, false, 0, false, null, null, false, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, false, null, null, null, null, null, null, null, -1, -8193, -1, 1048575);
    }

    public static final Object invoke$25(AwS16S0010000_1 awS16S0010000_1, Object obj) {
        return C03JV.LIZ((C03JV) obj, 0, null, null, false, null, false, null, null, null, null, null, null, null, null, 0, null, null, 0, null, null, false, 0L, false, false, null, null, false, null, null, null, null, null, awS16S0010000_1.z0, null, null, false, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, false, 0, false, null, null, false, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, false, null, null, null, null, null, null, null, -1, -5, -1, 1048575);
    }

    public static final Object invoke$26(AwS16S0010000_1 awS16S0010000_1, Object obj) {
        return C03JV.LIZ((C03JV) obj, 0, null, null, false, null, false, null, null, null, null, null, null, null, null, 0, null, null, 0, null, null, false, 0L, false, false, null, null, false, null, null, null, null, null, false, null, null, false, null, null, null, null, awS16S0010000_1.z0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, false, 0, false, null, null, false, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, false, null, null, null, null, null, null, null, -1, -4097, -1, 1048575);
    }

    public static final Object invoke$27(AwS16S0010000_1 awS16S0010000_1, Object obj) {
        return C03JV.LIZ((C03JV) obj, 0, null, null, false, null, false, null, null, null, null, null, null, null, null, 0, null, null, 0, null, null, awS16S0010000_1.z0, 0L, false, false, null, null, false, null, null, null, null, null, false, null, null, false, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, false, 0, false, null, null, false, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, false, null, null, null, null, null, null, null, -1048577, -1, -1, 1048575);
    }

    public static final Object invoke$28(AwS16S0010000_1 awS16S0010000_1, Object obj) {
        C035J c035j = (C035J) obj;
        return new C035J(c035j.LIZ, awS16S0010000_1.z0, c035j.LIZJ);
    }

    public static final Object invoke$29(AwS16S0010000_1 awS16S0010000_1, Object obj) {
        String str;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("module_name", "protection");
        if (awS16S0010000_1.z0) {
            str = "check";
        } else {
            str = "uncheck";
        }
        laneParams.plusAssign("click_area", str);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS16S0010000_1 awS16S0010000_1, Object obj) {
        return C890803dy.LIZ((C890803dy) obj, null, null, null, false, null, null, null, null, null, Boolean.valueOf(awS16S0010000_1.z0), null, false, null, null, null, null, null, null, null, null, null, 4193279);
    }

    public static /* bridge */ /* synthetic */ Object invoke$30(AwS16S0010000_1 awS16S0010000_1, Object obj) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        View view = (View) obj;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            if (awS16S0010000_1.z0) {
                boolean z = layoutParams instanceof ViewGroup.MarginLayoutParams;
                if (z) {
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams;
                    if (marginLayoutParams4 != null) {
                        marginLayoutParams4.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                    }
                    if (z && (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                        marginLayoutParams3.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                    }
                }
            } else {
                boolean z2 = layoutParams instanceof ViewGroup.MarginLayoutParams;
                if (z2) {
                    ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams;
                    if (marginLayoutParams5 != null) {
                        marginLayoutParams5.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
                    }
                    if (z2 && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                        marginLayoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
                    }
                }
            }
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams2.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            }
        } else {
            layoutParams = null;
        }
        C786410Ut5.W5(view, layoutParams);
        return Unit.LIZ;
    }

    public static final Object invoke$31(AwS16S0010000_1 awS16S0010000_1, Object obj) {
        return C890803dy.LIZ((C890803dy) obj, null, null, null, awS16S0010000_1.z0, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 4194287);
    }

    public static final Object invoke$32(AwS16S0010000_1 awS16S0010000_1, Object obj) {
        C1251150ifB c1251150ifB;
        AbstractC1250290idn abstractC1250290idn = (AbstractC1250290idn) obj;
        if ((abstractC1250290idn instanceof C1251150ifB) && (c1251150ifB = (C1251150ifB) abstractC1250290idn) != null) {
            c1251150ifB.LIZLLL = !awS16S0010000_1.z0;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$33(AwS16S0010000_1 awS16S0010000_1, Object obj) {
        return C890803dy.LIZ((C890803dy) obj, null, null, null, false, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, Boolean.valueOf(awS16S0010000_1.z0), null, 3145727);
    }

    public static final Object invoke$34(AwS16S0010000_1 awS16S0010000_1, Object obj) {
        return C926703jl.LIZ((C926703jl) obj, null, null, null, awS16S0010000_1.z0, 15);
    }

    public static final Object invoke$35(AwS16S0010000_1 awS16S0010000_1, Object obj) {
        SeaPdpMainState seaPdpMainState = (SeaPdpMainState) obj;
        return seaPdpMainState.copy(awS16S0010000_1.z0, seaPdpMainState.bottomBarVO, seaPdpMainState.bottomBarData, seaPdpMainState.tabs, seaPdpMainState.dismiss, seaPdpMainState.sheetState, seaPdpMainState.contentList, seaPdpMainState.bottomSheetSlideOffset, seaPdpMainState.creatorSheetVO, seaPdpMainState.scrollOrientation, seaPdpMainState.creatorSheetSlideOffset, seaPdpMainState.scrollOffset, seaPdpMainState.seaFocusTabAction, seaPdpMainState.seaFocusTabActionNew, seaPdpMainState.selectedTabName, seaPdpMainState.loadingStatus, seaPdpMainState.flashSaleState, seaPdpMainState.flashSaleCountDown, seaPdpMainState.cartTip, seaPdpMainState.cartEntry, seaPdpMainState.bodyContent, seaPdpMainState.shareInfo, seaPdpMainState.showLoadingDialog, seaPdpMainState.blockInfo, seaPdpMainState.showFloatShop, seaPdpMainState.bizEnvChange, seaPdpMainState.slideToPaymentModule, seaPdpMainState.lynxAirItemName, seaPdpMainState.exceptionUX, seaPdpMainState.lynxPopupState, seaPdpMainState.bottomFloatingState, seaPdpMainState.seaEntranceBubble, seaPdpMainState.bottomMynaBannerState, seaPdpMainState.mediaWindow);
    }

    public static final Object invoke$36(AwS16S0010000_1 awS16S0010000_1, Object obj) {
        Region region = (Region) obj;
        if (awS16S0010000_1.z0 && C703302op.LIZ(region.code)) {
            return region.code;
        }
        String str = region.name;
        if (str != null) {
            return str;
        }
        return "";
    }

    public static final Object invoke$37(AwS16S0010000_1 awS16S0010000_1, Object obj) {
        return C03JV.LIZ((C03JV) obj, 0, null, null, false, null, false, null, null, null, null, null, null, null, null, 0, null, null, 0, null, null, false, 0L, false, false, null, null, false, null, null, new C291001Au(Boolean.valueOf(awS16S0010000_1.z0)), null, null, false, null, null, false, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, false, 0, false, null, null, false, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, false, null, null, null, null, null, null, null, -536870913, -1, -1, 1048575);
    }

    public static final Object invoke$4(AwS16S0010000_1 awS16S0010000_1, Object obj) {
        PaymentState paymentState = (PaymentState) obj;
        return paymentState.copy(paymentState.checkedPaymentMethod, paymentState.paymentList, paymentState.paymentInfo, paymentState.systemError, awS16S0010000_1.z0, paymentState.paymentInfoForThreeStepCache, paymentState.paymentInfoForNextStep, paymentState.showLoading, paymentState.resendPayAction, paymentState.scrollUpAction, paymentState.scrollUpDistance, paymentState.toast, paymentState.checkedCreditMethod, paymentState.installmentPlanChanged, paymentState.abnormalStatus, paymentState.exceptionUX, paymentState.changeBindCardStatus, paymentState.bindCardErrorMsg, paymentState.bindCardErrorAction, paymentState.chooseSaveStatus, paymentState.subPaymentMethodIsChecked, paymentState.checkedAnchorPaymentMethod, paymentState.summaryPanelStatus, paymentState.summary, paymentState.dialogContent, paymentState.buttonTrigger);
    }

    public static final Object invoke$5(AwS16S0010000_1 awS16S0010000_1, Object obj) {
        return C03JV.LIZ((C03JV) obj, 0, null, null, false, null, false, null, null, null, null, null, null, null, null, 0, null, null, 0, null, null, false, 0L, false, false, null, null, false, null, null, null, null, null, false, null, null, false, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, Boolean.valueOf(awS16S0010000_1.z0), null, null, null, null, null, false, null, null, false, null, false, 0, false, null, null, false, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, false, null, null, null, null, null, null, null, -1, -16777217, -1, 1048575);
    }

    public static final Object invoke$6(AwS16S0010000_1 awS16S0010000_1, Object obj) {
        return C03JV.LIZ((C03JV) obj, 0, null, null, false, null, false, null, null, null, null, null, null, null, null, 0, null, null, 0, null, null, false, 0L, false, false, null, null, false, null, null, null, null, null, false, null, null, false, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, false, 0, false, null, null, false, null, null, null, awS16S0010000_1.z0, null, null, false, null, null, null, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, false, null, null, null, null, null, null, null, -1, -1, -8193, 1048575);
    }

    public static final Object invoke$7(AwS16S0010000_1 awS16S0010000_1, Object obj) {
        return C03JV.LIZ((C03JV) obj, 0, null, null, false, null, false, null, null, null, null, null, null, null, null, 0, null, null, 0, null, null, false, 0L, false, false, null, null, false, null, null, null, null, null, false, null, null, false, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, false, 0, false, null, null, false, null, null, null, false, null, Boolean.valueOf(awS16S0010000_1.z0), false, null, null, null, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, false, null, null, null, null, null, null, null, -1, -1, -32769, 1048575);
    }

    public static final Object invoke$8(AwS16S0010000_1 awS16S0010000_1, Object obj) {
        SkuState skuState = (SkuState) obj;
        return skuState.copy(skuState.checkedSkuArray, skuState.showToast, skuState.currentImage, skuState.buyButton, skuState.buyButtonInterestId, skuState.buttonDynamicData, skuState.preOrderInfo, skuState.currentPriceData, skuState.hidePriceTip, skuState.purchaseNotice, skuState.promotionDealVO, skuState.specifications, skuState.currentQuantityLimit, skuState.currentQuantity, skuState.currentImagePosition, skuState.currentInstallmentPlan, skuState.keyBoardVisibility, skuState.skuFragmentClosed, skuState.skuDataState, skuState.addToCartButton, skuState.paymentModule, awS16S0010000_1.z0, skuState.skuStockInfo, skuState.forceRefresh, skuState.originalProductPackStruct, skuState.localSizeSalePropList, skuState.isQuantityEditable, skuState.slideToBnpl, skuState.exceptionUX, skuState.counterDescription, skuState.topOutsideWidgetVisibleHeight, skuState.cutPriceSkuPanel, skuState.skuPanelWaistBanner, skuState.skuPanelSellingPoints, skuState.skuHeaderTopLabels);
    }

    public static final Object invoke$9(AwS16S0010000_1 awS16S0010000_1, Object obj) {
        SkuState skuState = (SkuState) obj;
        return skuState.copy(skuState.checkedSkuArray, skuState.showToast, skuState.currentImage, skuState.buyButton, skuState.buyButtonInterestId, skuState.buttonDynamicData, skuState.preOrderInfo, skuState.currentPriceData, skuState.hidePriceTip, skuState.purchaseNotice, skuState.promotionDealVO, skuState.specifications, skuState.currentQuantityLimit, skuState.currentQuantity, skuState.currentImagePosition, skuState.currentInstallmentPlan, Boolean.valueOf(awS16S0010000_1.z0), skuState.skuFragmentClosed, skuState.skuDataState, skuState.addToCartButton, skuState.paymentModule, skuState.showLoadingView, skuState.skuStockInfo, skuState.forceRefresh, skuState.originalProductPackStruct, skuState.localSizeSalePropList, skuState.isQuantityEditable, skuState.slideToBnpl, skuState.exceptionUX, skuState.counterDescription, skuState.topOutsideWidgetVisibleHeight, skuState.cutPriceSkuPanel, skuState.skuPanelWaistBanner, skuState.skuPanelSellingPoints, skuState.skuHeaderTopLabels);
    }
}
