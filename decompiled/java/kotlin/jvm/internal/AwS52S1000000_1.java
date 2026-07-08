package kotlin.jvm.internal;

import X.C03JV;
import X.C03O8;
import X.C047L;
import X.C04CA;
import X.C09AY;
import X.C0HEZ;
import X.C1010603xI;
import X.C1397620mTQ;
import X.C15438062q;
import X.C1741890vQh;
import X.C1754870vld;
import X.C1756010vnT;
import X.C197039127h;
import X.C291001Au;
import X.C418440Gaw;
import X.C719202rO;
import X.C723002s0;
import X.C872803b4;
import X.C873003b6;
import X.C890103dr;
import X.C890803dy;
import X.C893703eR;
import X.C896103ep;
import X.C936903lP;
import X.C945303ml;
import X.C945703mp;
import X.C946403mw;
import X.C948003nC;
import X.C957403oi;
import X.EnumC880203cG;
import X.InterfaceC1891350zJl;
import android.graphics.drawable.GradientDrawable;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListState;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentState;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuState;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public class AwS52S1000000_1 extends C09AY implements Function1 {
    public final int $t;
    public String s0;

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
            case 38:
                return invoke$38(this, obj);
            case 39:
                return invoke$39(this, obj);
            case 40:
                return invoke$40(this, obj);
            case 41:
                return invoke$41(this, obj);
            case 42:
                return invoke$42(this, obj);
            case 43:
                return invoke$43(this, obj);
            case 44:
                return invoke$44(this, obj);
            case 45:
                return invoke$45(this, obj);
            case 46:
                return invoke$46(this, obj);
            case 47:
                return invoke$47(this, obj);
            case 48:
                return invoke$48(this, obj);
            case 49:
                return invoke$49(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS52S1000000_1(int i) {
        super(1);
        this.$t = i;
        this.s0 = "size_guide";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS52S1000000_1(String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
    }

    public static final Object invoke$0(AwS52S1000000_1 awS52S1000000_1, Object obj) {
        ((HashMap) obj).put("toast_name", awS52S1000000_1.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS52S1000000_1 awS52S1000000_1, Object obj) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(ColorProtector.parseColor(awS52S1000000_1.s0));
        gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(8));
        ((C197039127h) obj).setBackground(gradientDrawable);
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS52S1000000_1 awS52S1000000_1, Object obj) {
        return C890803dy.LIZ((C890803dy) obj, null, null, null, false, null, null, null, null, null, null, null, false, null, null, EnumC880203cG.BIND_ERROR, awS52S1000000_1.s0, null, null, null, null, null, 4091903);
    }

    public static final Object invoke$11(AwS52S1000000_1 awS52S1000000_1, Object obj) {
        return C890803dy.LIZ((C890803dy) obj, null, null, null, false, null, null, null, null, new C948003nC(awS52S1000000_1.s0), null, null, false, null, null, null, null, null, null, null, null, null, 4189695);
    }

    public static final Object invoke$12(AwS52S1000000_1 awS52S1000000_1, Object obj) {
        PaymentState paymentState = (PaymentState) obj;
        return paymentState.copy(paymentState.checkedPaymentMethod, paymentState.paymentList, paymentState.paymentInfo, paymentState.systemError, paymentState.emailHintVisible, paymentState.paymentInfoForThreeStepCache, paymentState.paymentInfoForNextStep, paymentState.showLoading, paymentState.resendPayAction, paymentState.scrollUpAction, paymentState.scrollUpDistance, new C948003nC<>(awS52S1000000_1.s0), paymentState.checkedCreditMethod, paymentState.installmentPlanChanged, paymentState.abnormalStatus, paymentState.exceptionUX, paymentState.changeBindCardStatus, paymentState.bindCardErrorMsg, paymentState.bindCardErrorAction, paymentState.chooseSaveStatus, paymentState.subPaymentMethodIsChecked, paymentState.checkedAnchorPaymentMethod, paymentState.summaryPanelStatus, paymentState.summary, paymentState.dialogContent, paymentState.buttonTrigger);
    }

    public static final Object invoke$13(AwS52S1000000_1 awS52S1000000_1, Object obj) {
        C957403oi c957403oi = (C957403oi) obj;
        c957403oi.LJ(C03O8.LIZ);
        String str = awS52S1000000_1.s0;
        if (str != null) {
            c957403oi.LIZLLL("popup_name", str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS52S1000000_1 awS52S1000000_1, Object obj) {
        PaymentState paymentState = (PaymentState) obj;
        return paymentState.copy(paymentState.checkedPaymentMethod, paymentState.paymentList, paymentState.paymentInfo, paymentState.systemError, paymentState.emailHintVisible, paymentState.paymentInfoForThreeStepCache, paymentState.paymentInfoForNextStep, paymentState.showLoading, paymentState.resendPayAction, paymentState.scrollUpAction, paymentState.scrollUpDistance, new C948003nC<>(awS52S1000000_1.s0), paymentState.checkedCreditMethod, paymentState.installmentPlanChanged, paymentState.abnormalStatus, paymentState.exceptionUX, paymentState.changeBindCardStatus, paymentState.bindCardErrorMsg, paymentState.bindCardErrorAction, paymentState.chooseSaveStatus, paymentState.subPaymentMethodIsChecked, paymentState.checkedAnchorPaymentMethod, paymentState.summaryPanelStatus, paymentState.summary, paymentState.dialogContent, paymentState.buttonTrigger);
    }

    public static final Object invoke$15(AwS52S1000000_1 awS52S1000000_1, Object obj) {
        return C03JV.LIZ((C03JV) obj, 0, null, null, false, null, false, null, null, null, null, null, null, null, null, 0, null, null, 0, null, null, false, 0L, false, false, null, null, false, null, null, null, null, null, false, null, null, false, null, null, null, null, false, false, null, null, null, new C948003nC(awS52S1000000_1.s0), null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, false, 0, false, null, null, false, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, false, null, null, null, null, null, null, null, -1, -131073, -1, 1048575);
    }

    public static final Object invoke$16(AwS52S1000000_1 awS52S1000000_1, Object obj) {
        ((C957403oi) obj).LIZLLL("source", awS52S1000000_1.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS52S1000000_1 awS52S1000000_1, Object obj) {
        return C1754870vld.LIZ((C1754870vld) obj, null, 0, null, 0, 0.0f, false, null, new C291001Au(awS52S1000000_1.s0), null, 383);
    }

    public static final Object invoke$18(AwS52S1000000_1 awS52S1000000_1, Object obj) {
        SkuState skuState = (SkuState) obj;
        return skuState.copy(skuState.checkedSkuArray, skuState.showToast, skuState.currentImage, skuState.preOrderInfo, skuState.currentPrice, skuState.currentPriceV2, skuState.quantityNoticeInfos, skuState.promotionView, skuState.originalPrice, skuState.priceAfterCoupon, skuState.discountText, skuState.taxDescription, skuState.depositFeeDesc, skuState.unitPriceDescription, skuState.currentQuantityLimit, skuState.currentQuantity, skuState.contentList, skuState.keyBoardVisibility, skuState.skuPanelCloseEvent, skuState.skuDataState, skuState.addToCartButton, skuState.showLoadingView, skuState.showLoadingSpinner, skuState.skuStockInfo, skuState.forceRefresh, skuState.originalProductPackStruct, skuState.protectionProgramText, skuState.productTitle, skuState.promotionLabelVO, skuState.productSellerInfo, skuState.skuPanelReminder, skuState.isPriceHidden, skuState.isQuantityEditable, skuState.scrollOffset, skuState.scrollOrientation, skuState.bottomAreaElem, skuState.bizEnvChange, skuState.focusSpecAction, skuState.allSkuSelected, awS52S1000000_1.s0, skuState.couponEvent, skuState.carouselImages, skuState.carouselNeedToScrollToFirst, skuState.counterDisclaimer, skuState.exceptionUX, skuState.selectedPurchaseMethod, skuState.selectedPeriodText, skuState.pricePrefix, skuState.extraInfoData, skuState.paymentInfo, skuState.summaryInfo, skuState.refreshFlag, skuState.hidePaymentMethodView, skuState.promotionWaist);
    }

    public static final Object invoke$19(AwS52S1000000_1 awS52S1000000_1, Object obj) {
        SkuState skuState = (SkuState) obj;
        return skuState.copy(skuState.checkedSkuArray, skuState.showToast, skuState.currentImage, skuState.preOrderInfo, skuState.currentPrice, skuState.currentPriceV2, skuState.quantityNoticeInfos, skuState.promotionView, skuState.originalPrice, skuState.priceAfterCoupon, skuState.discountText, skuState.taxDescription, skuState.depositFeeDesc, skuState.unitPriceDescription, skuState.currentQuantityLimit, skuState.currentQuantity, skuState.contentList, skuState.keyBoardVisibility, skuState.skuPanelCloseEvent, skuState.skuDataState, skuState.addToCartButton, skuState.showLoadingView, skuState.showLoadingSpinner, skuState.skuStockInfo, skuState.forceRefresh, skuState.originalProductPackStruct, skuState.protectionProgramText, skuState.productTitle, skuState.promotionLabelVO, skuState.productSellerInfo, skuState.skuPanelReminder, skuState.isPriceHidden, skuState.isQuantityEditable, skuState.scrollOffset, skuState.scrollOrientation, skuState.bottomAreaElem, skuState.bizEnvChange, skuState.focusSpecAction, skuState.allSkuSelected, skuState.totalPrice, skuState.couponEvent, skuState.carouselImages, skuState.carouselNeedToScrollToFirst, skuState.counterDisclaimer, skuState.exceptionUX, skuState.selectedPurchaseMethod, awS52S1000000_1.s0, skuState.pricePrefix, skuState.extraInfoData, skuState.paymentInfo, skuState.summaryInfo, skuState.refreshFlag, skuState.hidePaymentMethodView, skuState.promotionWaist);
    }

    public static final Object invoke$2(AwS52S1000000_1 awS52S1000000_1, Object obj) {
        AddressListState addressListState = (AddressListState) obj;
        return addressListState.copy(addressListState.status, addressListState.addressItems, addressListState.selectAddressId, addressListState.policyItemVO, addressListState.addressState, new C948003nC<>(awS52S1000000_1.s0));
    }

    public static final Object invoke$20(AwS52S1000000_1 awS52S1000000_1, Object obj) {
        SkuState skuState = (SkuState) obj;
        return skuState.copy(skuState.checkedSkuArray, skuState.showToast, skuState.currentImage, skuState.preOrderInfo, skuState.currentPrice, skuState.currentPriceV2, skuState.quantityNoticeInfos, skuState.promotionView, skuState.originalPrice, skuState.priceAfterCoupon, skuState.discountText, skuState.taxDescription, skuState.depositFeeDesc, skuState.unitPriceDescription, skuState.currentQuantityLimit, skuState.currentQuantity, skuState.contentList, skuState.keyBoardVisibility, skuState.skuPanelCloseEvent, skuState.skuDataState, skuState.addToCartButton, skuState.showLoadingView, skuState.showLoadingSpinner, skuState.skuStockInfo, skuState.forceRefresh, skuState.originalProductPackStruct, skuState.protectionProgramText, skuState.productTitle, skuState.promotionLabelVO, skuState.productSellerInfo, skuState.skuPanelReminder, skuState.isPriceHidden, skuState.isQuantityEditable, skuState.scrollOffset, skuState.scrollOrientation, skuState.bottomAreaElem, skuState.bizEnvChange, new C047L(awS52S1000000_1.s0, 0), skuState.allSkuSelected, skuState.totalPrice, skuState.couponEvent, skuState.carouselImages, skuState.carouselNeedToScrollToFirst, skuState.counterDisclaimer, skuState.exceptionUX, skuState.selectedPurchaseMethod, skuState.selectedPeriodText, skuState.pricePrefix, skuState.extraInfoData, skuState.paymentInfo, skuState.summaryInfo, skuState.refreshFlag, skuState.hidePaymentMethodView, skuState.promotionWaist);
    }

    public static final Object invoke$21(AwS52S1000000_1 awS52S1000000_1, Object obj) {
        ((LaneParams) obj).plusAssign("current_select_address_id", awS52S1000000_1.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$22(AwS52S1000000_1 awS52S1000000_1, Object obj) {
        return C1756010vnT.LIZ((C1756010vnT) obj, awS52S1000000_1.s0, null, null, null, null, 126);
    }

    public static final Object invoke$23(AwS52S1000000_1 awS52S1000000_1, Object obj) {
        ((LaneParams) obj).plusAssign("schema", awS52S1000000_1.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$24(AwS52S1000000_1 awS52S1000000_1, Object obj) {
        C945303ml c945303ml = (C945303ml) obj;
        C945703mp c945703mp = c945303ml.LJIIJJI;
        return C945303ml.LIZ(c945303ml, null, null, null, null, new C945703mp(c945703mp.LIZ, c945703mp.LIZIZ, c945703mp.LIZJ, awS52S1000000_1.s0), null, 14335);
    }

    public static final Object invoke$25(AwS52S1000000_1 awS52S1000000_1, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(((PaymentMethod) obj).LJIIJ(), awS52S1000000_1.s0));
    }

    public static final Object invoke$26(AwS52S1000000_1 awS52S1000000_1, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(((PaymentMethod) obj).LJIIJ(), awS52S1000000_1.s0));
    }

    public static final Object invoke$27(AwS52S1000000_1 awS52S1000000_1, Object obj) {
        C03JV c03jv = (C03JV) obj;
        List<InterfaceC1891350zJl> list = c03jv.LLILLJJLI;
        String str = awS52S1000000_1.s0;
        Iterator<InterfaceC1891350zJl> it2 = list.iterator();
        int i = 0;
        while (true) {
            if (it2.hasNext()) {
                InterfaceC1891350zJl next = it2.next();
                if (next instanceof C719202rO) {
                    List<C723002s0> list2 = ((C719202rO) next).LLJIJIL;
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                    Iterator<C723002s0> it3 = list2.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(it3.next().LLJJ);
                    }
                    if (arrayList.contains(str)) {
                        break;
                    }
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        return C03JV.LIZ(c03jv, 0, null, null, false, null, false, null, null, null, null, null, null, null, null, 0, null, null, 0, null, null, false, 0L, false, false, null, null, false, null, null, null, null, null, false, null, null, false, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, new C893703eR(i), null, false, null, false, 0, false, null, null, false, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, false, null, null, null, null, null, null, null, -1, Integer.MAX_VALUE, -1, 1048575);
    }

    public static final Object invoke$28(AwS52S1000000_1 awS52S1000000_1, Object obj) {
        return C03JV.LIZ((C03JV) obj, 0, null, null, false, null, false, null, null, null, null, null, null, null, null, 0, null, null, 0, null, null, false, 0L, false, false, null, null, false, null, null, null, null, null, false, null, null, false, null, null, null, null, false, false, null, null, null, new C948003nC(awS52S1000000_1.s0), null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, false, 0, false, null, null, false, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, false, null, null, null, null, null, null, null, -1, -131073, -1, 1048575);
    }

    public static final Object invoke$29(AwS52S1000000_1 awS52S1000000_1, Object obj) {
        boolean z;
        C945303ml c945303ml = (C945303ml) obj;
        C946403mw c946403mw = c945303ml.LIZJ;
        String str = awS52S1000000_1.s0;
        int i = 0;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (Intrinsics.LJFF(Boolean.valueOf(z), Boolean.TRUE)) {
            i = 8;
        }
        return C945303ml.LIZ(c945303ml, C946403mw.LIZ(c946403mw, i, awS52S1000000_1.s0, 94), null, null, null, null, null, 16379);
    }

    public static final Object invoke$3(AwS52S1000000_1 awS52S1000000_1, Object obj) {
        AddressListState addressListState = (AddressListState) obj;
        return addressListState.copy(addressListState.status, addressListState.addressItems, awS52S1000000_1.s0, addressListState.policyItemVO, addressListState.addressState, addressListState.changeOnOrderToast);
    }

    public static final Object invoke$30(AwS52S1000000_1 awS52S1000000_1, Object obj) {
        C1010603xI.LIZJ((LaneParams) obj, awS52S1000000_1.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$31(AwS52S1000000_1 awS52S1000000_1, Object obj) {
        ((LaneParams) obj).plusAssign("module_name", awS52S1000000_1.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$32(AwS52S1000000_1 awS52S1000000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("entrance_type", "sales_seller_detail");
        String str = awS52S1000000_1.s0;
        if (str == null) {
            str = "";
        }
        laneParams.plusAssign("shop_id", str);
        return Unit.LIZ;
    }

    public static final Object invoke$33(AwS52S1000000_1 awS52S1000000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("module_name", "seller_detail");
        String str = awS52S1000000_1.s0;
        if (str == null) {
            str = "";
        }
        laneParams.plusAssign("shop_id", str);
        return Unit.LIZ;
    }

    public static final Object invoke$34(AwS52S1000000_1 awS52S1000000_1, Object obj) {
        ((HashMap) obj).put("button_name", awS52S1000000_1.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$35(AwS52S1000000_1 awS52S1000000_1, Object obj) {
        ((HashMap) obj).put("button_name", awS52S1000000_1.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$36(AwS52S1000000_1 awS52S1000000_1, Object obj) {
        return C890803dy.LIZ((C890803dy) obj, null, null, null, false, null, null, null, null, new C948003nC(awS52S1000000_1.s0), null, null, false, null, null, null, null, null, null, null, null, null, 4193791);
    }

    public static final Object invoke$37(AwS52S1000000_1 awS52S1000000_1, Object obj) {
        InstallmentPlan installmentPlan;
        C873003b6 c873003b6 = ((C872803b4) obj).LL;
        Boolean bool = null;
        if (c873003b6 != null) {
            installmentPlan = c873003b6.LJI;
        } else {
            installmentPlan = null;
        }
        C890103dr c890103dr = C890103dr.LIZ;
        String str = awS52S1000000_1.s0;
        if (installmentPlan != null) {
            bool = installmentPlan.isRecommend;
        }
        C890103dr.LJFF(c890103dr, str, null, null, null, null, null, bool, 62);
        return Unit.LIZ;
    }

    public static final Object invoke$38(AwS52S1000000_1 awS52S1000000_1, Object obj) {
        ((LaneParams) obj).plusAssign("module_name", awS52S1000000_1.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$39(AwS52S1000000_1 awS52S1000000_1, Object obj) {
        TuxTextView tuxTextView = (TuxTextView) obj;
        tuxTextView.setText(awS52S1000000_1.s0);
        tuxTextView.setTextColorRes(R.attr.a04);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS52S1000000_1 awS52S1000000_1, Object obj) {
        AddressListState addressListState = (AddressListState) obj;
        return addressListState.copy(addressListState.status, addressListState.addressItems, awS52S1000000_1.s0, addressListState.policyItemVO, addressListState.addressState, addressListState.changeOnOrderToast);
    }

    public static final Object invoke$40(AwS52S1000000_1 awS52S1000000_1, Object obj) {
        C197039127h c197039127h = (C197039127h) obj;
        GradientDrawable gradientDrawable = new GradientDrawable();
        String str = awS52S1000000_1.s0;
        if (str != null) {
            gradientDrawable.setColor(C0HEZ.LIZIZ(str));
        }
        gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(8));
        c197039127h.setBackground(gradientDrawable);
        return Unit.LIZ;
    }

    public static final Object invoke$41(AwS52S1000000_1 awS52S1000000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("key", awS52S1000000_1.s0);
        laneParams.plusAssign("error_code", 0);
        return Unit.LIZ;
    }

    public static final Object invoke$42(AwS52S1000000_1 awS52S1000000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("key", awS52S1000000_1.s0);
        laneParams.plusAssign("error_code", 1);
        return Unit.LIZ;
    }

    public static final Object invoke$43(AwS52S1000000_1 awS52S1000000_1, Object obj) {
        HashMap map = (HashMap) obj;
        map.put("button_name", awS52S1000000_1.s0);
        map.put("module_name", "purchase_protections");
        map.put("is_clickable", CardStruct.IStatusCode.DEFAULT);
        return Unit.LIZ;
    }

    public static final Object invoke$44(AwS52S1000000_1 awS52S1000000_1, Object obj) {
        Map map = (Map) obj;
        map.put("is_coupon_available", -1);
        map.put("coupon_zone", "actionsheet");
        HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(awS52S1000000_1.s0);
        if (mapLJIIJ != null) {
            C04CA.LIZIZ(mapLJIIJ, map);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$45(AwS52S1000000_1 awS52S1000000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("module_name", "sku");
        laneParams.plusAssign("select_type", awS52S1000000_1.s0);
        laneParams.plusAssign("checkout_type", "one_step_checkout");
        return Unit.LIZ;
    }

    public static final Object invoke$46(AwS52S1000000_1 awS52S1000000_1, Object obj) {
        ((C1397620mTQ) obj).LIZJ(0, awS52S1000000_1.s0, AFwS228S0000000_1.get$arr$(913));
        return Unit.LIZ;
    }

    public static final Object invoke$47(AwS52S1000000_1 awS52S1000000_1, Object obj) {
        C936903lP c936903lP = (C936903lP) obj;
        return C936903lP.LIZ(c936903lP, null, null, null, 0, null, null, 0, null, null, awS52S1000000_1.s0, c936903lP.LLJIJIL + 1, 511);
    }

    public static final Object invoke$48(AwS52S1000000_1 awS52S1000000_1, Object obj) {
        C936903lP c936903lP = (C936903lP) obj;
        return C936903lP.LIZ(c936903lP, null, null, null, 0, null, null, 0, null, null, awS52S1000000_1.s0, c936903lP.LLJIJIL + 1, 511);
    }

    public static final Object invoke$49(AwS52S1000000_1 awS52S1000000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("bar_name", "tiktok_paylater_installment");
        laneParams.plusAssign("slide_type", awS52S1000000_1.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS52S1000000_1 awS52S1000000_1, Object obj) {
        DeliveryPanelState deliveryPanelState = (DeliveryPanelState) obj;
        return deliveryPanelState.copy(deliveryPanelState.changePage, deliveryPanelState.apply, deliveryPanelState.selectedLogistic, deliveryPanelState.selectedShipToInfo, deliveryPanelState.addressRenderData, deliveryPanelState.status, deliveryPanelState.logisticList, deliveryPanelState.claimVoucherExceptionUX, deliveryPanelState.exposedItems, deliveryPanelState.exposedAddOnItems, deliveryPanelState.dispatchInfo, deliveryPanelState.shippingToAddressInfo, deliveryPanelState.logistics, deliveryPanelState.pdpLogisticModule, deliveryPanelState.privacyPolicyStatement, deliveryPanelState.shippingPolicyModule, deliveryPanelState.hasMapLocationChanged, deliveryPanelState.tab, deliveryPanelState.pickupSelectAddress, deliveryPanelState.pickUpList, deliveryPanelState.pickupSelectIdx, 3, deliveryPanelState.savePickUpToast, deliveryPanelState.getPudoAddressStatus, deliveryPanelState.pudoSelectedLogistic, deliveryPanelState.centerAddress, deliveryPanelState.pudoSource, awS52S1000000_1.s0);
    }

    public static final Object invoke$6(AwS52S1000000_1 awS52S1000000_1, Object obj) {
        PaymentState paymentState = (PaymentState) obj;
        return paymentState.copy(paymentState.checkedPaymentMethod, paymentState.paymentList, paymentState.paymentInfo, paymentState.systemError, paymentState.emailHintVisible, paymentState.paymentInfoForThreeStepCache, paymentState.paymentInfoForNextStep, paymentState.showLoading, paymentState.resendPayAction, paymentState.scrollUpAction, paymentState.scrollUpDistance, new C948003nC<>(awS52S1000000_1.s0), paymentState.checkedCreditMethod, paymentState.installmentPlanChanged, paymentState.abnormalStatus, paymentState.exceptionUX, paymentState.changeBindCardStatus, paymentState.bindCardErrorMsg, paymentState.bindCardErrorAction, paymentState.chooseSaveStatus, paymentState.subPaymentMethodIsChecked, paymentState.checkedAnchorPaymentMethod, paymentState.summaryPanelStatus, paymentState.summary, paymentState.dialogContent, paymentState.buttonTrigger);
    }

    public static final Object invoke$7(AwS52S1000000_1 awS52S1000000_1, Object obj) {
        PaymentState paymentState = (PaymentState) obj;
        return paymentState.copy(paymentState.checkedPaymentMethod, paymentState.paymentList, paymentState.paymentInfo, paymentState.systemError, paymentState.emailHintVisible, paymentState.paymentInfoForThreeStepCache, paymentState.paymentInfoForNextStep, paymentState.showLoading, paymentState.resendPayAction, paymentState.scrollUpAction, paymentState.scrollUpDistance, new C948003nC<>(awS52S1000000_1.s0), paymentState.checkedCreditMethod, paymentState.installmentPlanChanged, paymentState.abnormalStatus, paymentState.exceptionUX, paymentState.changeBindCardStatus, paymentState.bindCardErrorMsg, paymentState.bindCardErrorAction, paymentState.chooseSaveStatus, paymentState.subPaymentMethodIsChecked, paymentState.checkedAnchorPaymentMethod, paymentState.summaryPanelStatus, paymentState.summary, paymentState.dialogContent, paymentState.buttonTrigger);
    }

    public static final Object invoke$8(AwS52S1000000_1 awS52S1000000_1, Object obj) {
        PaymentState paymentState = (PaymentState) obj;
        return paymentState.copy(paymentState.checkedPaymentMethod, paymentState.paymentList, paymentState.paymentInfo, paymentState.systemError, paymentState.emailHintVisible, paymentState.paymentInfoForThreeStepCache, paymentState.paymentInfoForNextStep, paymentState.showLoading, paymentState.resendPayAction, paymentState.scrollUpAction, paymentState.scrollUpDistance, new C948003nC<>(awS52S1000000_1.s0), paymentState.checkedCreditMethod, paymentState.installmentPlanChanged, paymentState.abnormalStatus, paymentState.exceptionUX, paymentState.changeBindCardStatus, paymentState.bindCardErrorMsg, paymentState.bindCardErrorAction, paymentState.chooseSaveStatus, paymentState.subPaymentMethodIsChecked, paymentState.checkedAnchorPaymentMethod, paymentState.summaryPanelStatus, paymentState.summary, paymentState.dialogContent, paymentState.buttonTrigger);
    }

    public static final Object invoke$9(AwS52S1000000_1 awS52S1000000_1, Object obj) {
        return C896103ep.LIZ((C896103ep) obj, null, null, new C948003nC(awS52S1000000_1.s0), null, null, null, 119);
    }
}
