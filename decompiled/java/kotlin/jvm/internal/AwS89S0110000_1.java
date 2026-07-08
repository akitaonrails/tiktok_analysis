package kotlin.jvm.internal;

import X.C035X;
import X.C03JV;
import X.C03O0;
import X.C03RN;
import X.C03RP;
import X.C03WD;
import X.C043B;
import X.C044Z;
import X.C09AY;
import X.C1018703yb;
import X.C1019103yf;
import X.C1054004Ag;
import X.C13LP;
import X.C1748770vbn;
import X.C1748780vbo;
import X.C2188811AlT;
import X.C2262851Dhb;
import X.C2341109Fh;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.C815203Gk;
import X.C821703Ix;
import X.C833003Ng;
import X.C833103Nh;
import X.C890803dy;
import X.C957403oi;
import X.C965403q0;
import X.EnumC1014603xw;
import X.EnumC10383044f;
import X.EnumC880203cG;
import android.content.Context;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectState;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.address.OspAddressViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.shop.USAggregationOrderSingleSkuCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.MiniOspFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentState;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.DiscountInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InterestFeePromotion;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PrivacyPopup;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDetail;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpMainState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.vm.SkuState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.SeaSkuSpecViewModel;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class AwS89S0110000_1 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public boolean z1;

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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS89S0110000_1(SeaSkuSpecViewModel seaSkuSpecViewModel, int i) {
        super(1);
        this.$t = i;
        this.z1 = false;
        this.l0 = seaSkuSpecViewModel;
    }

    public static final Object invoke$0(AwS89S0110000_1 awS89S0110000_1, Object obj) {
        ((OspAddressViewModel) awS89S0110000_1.l0).setState(new AwS16S0010000_1(awS89S0110000_1.z1, 0));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS89S0110000_1 awS89S0110000_1, Object obj) {
        String str;
        PaymentMethod paymentMethod;
        List<InstallmentPlan> list;
        InstallmentPlan next;
        List<DiscountInfo> list2;
        List<InstallmentInfo> list3;
        DiscountInfo discountInfo = (DiscountInfo) obj;
        if (!awS89S0110000_1.z1 || (str = discountInfo.discountSourceId) == null || (paymentMethod = (PaymentMethod) awS89S0110000_1.l0) == null) {
            return null;
        }
        InstallmentInfo installmentInfo = paymentMethod.installmentInfo;
        if ((installmentInfo == null && ((list3 = paymentMethod.installmentInfoList) == null || (installmentInfo = (InstallmentInfo) C13LP.LJJJLL(list3)) == null)) || (list = installmentInfo.installmentPlans) == null) {
            return null;
        }
        Iterator<InstallmentPlan> it2 = list.iterator();
        loop0: while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                InterestFeePromotion interestFeePromotion = next.interestFeePromotion;
                if (interestFeePromotion != null && (list2 = interestFeePromotion.discountInfoList) != null && !list2.isEmpty()) {
                    Iterator<DiscountInfo> it3 = list2.iterator();
                    while (it3.hasNext()) {
                        if (Intrinsics.LJFF(it3.next().discountSourceId, str)) {
                            break loop0;
                        }
                    }
                }
            } else {
                next = null;
                break;
            }
        }
        InstallmentPlan installmentPlan = next;
        if (installmentPlan == null) {
            return null;
        }
        return installmentPlan.tenure;
    }

    public static final Object invoke$10(AwS89S0110000_1 awS89S0110000_1, Object obj) throws JSONException {
        PdpMainState pdpMainState = (PdpMainState) obj;
        boolean z = awS89S0110000_1.z1;
        PdpViewModel pdpViewModel = (PdpViewModel) awS89S0110000_1.l0;
        return pdpMainState.copy(z, pdpMainState.bottomBarVO, pdpMainState.dismiss, pdpMainState.sheetState, pdpViewModel.xR2(pdpViewModel.LLJILLL, false, false, false, false, false), pdpMainState.bottomSheetSlideOffset, pdpMainState.creatorSheetVO, pdpMainState.scrollOrientation, pdpMainState.creatorSheetSlideOffset, pdpMainState.scrollOffset, pdpMainState.currentFocusModule, pdpMainState.loadingStatus, pdpMainState.flashSaleState, pdpMainState.flashSaleCountDown, pdpMainState.cartTip, pdpMainState.cartEntry, pdpMainState.bodyContent, pdpMainState.shareInfo, pdpMainState.blockInfo, pdpMainState.showFavoriteGuide, pdpMainState.shopInfo, pdpMainState.bottomAreaElem, pdpMainState.protectionProgramText, pdpMainState.bizEnvChange, pdpMainState.userRight, pdpMainState.exceptionUX, pdpMainState.lynxPopupState, pdpMainState.bottomFloatingState, pdpMainState.openSkuOnInit, pdpMainState.addCartData);
    }

    public static final Object invoke$11(AwS89S0110000_1 awS89S0110000_1, Object obj) {
        SkuState skuState = (SkuState) obj;
        boolean z = awS89S0110000_1.z1;
        if (z) {
            ((C044Z) awS89S0110000_1.l0).LJJJZ(new AwS16S0010000_1(z, 9));
        } else if (Intrinsics.LJFF(skuState.getKeyBoardVisibility(), Boolean.TRUE)) {
            ((C044Z) awS89S0110000_1.l0).LJJJZ(new AwS16S0010000_1(awS89S0110000_1.z1, 10));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS89S0110000_1 awS89S0110000_1, Object obj) {
        SkuState skuState = (SkuState) obj;
        if (awS89S0110000_1.z1) {
            return skuState.copy(skuState.checkedSkuArray, skuState.showToast, skuState.currentImage, skuState.buyButton, skuState.buyButtonInterestId, skuState.buttonDynamicData, skuState.preOrderInfo, skuState.currentPriceData, skuState.hidePriceTip, skuState.purchaseNotice, skuState.promotionDealVO, skuState.specifications, skuState.currentQuantityLimit, skuState.currentQuantity, skuState.currentImagePosition, skuState.currentInstallmentPlan, skuState.keyBoardVisibility, skuState.skuFragmentClosed, (EnumC10383044f) awS89S0110000_1.l0, skuState.addToCartButton, skuState.paymentModule, skuState.showLoadingView, skuState.skuStockInfo, new Object(), skuState.originalProductPackStruct, skuState.localSizeSalePropList, skuState.isQuantityEditable, skuState.slideToBnpl, skuState.exceptionUX, skuState.counterDescription, skuState.topOutsideWidgetVisibleHeight, skuState.cutPriceSkuPanel, skuState.skuPanelWaistBanner, skuState.skuPanelSellingPoints, skuState.skuHeaderTopLabels);
        }
        return skuState.copy(skuState.checkedSkuArray, skuState.showToast, skuState.currentImage, skuState.buyButton, skuState.buyButtonInterestId, skuState.buttonDynamicData, skuState.preOrderInfo, skuState.currentPriceData, skuState.hidePriceTip, skuState.purchaseNotice, skuState.promotionDealVO, skuState.specifications, skuState.currentQuantityLimit, skuState.currentQuantity, skuState.currentImagePosition, skuState.currentInstallmentPlan, skuState.keyBoardVisibility, skuState.skuFragmentClosed, (EnumC10383044f) awS89S0110000_1.l0, skuState.addToCartButton, skuState.paymentModule, skuState.showLoadingView, skuState.skuStockInfo, skuState.forceRefresh, skuState.originalProductPackStruct, skuState.localSizeSalePropList, skuState.isQuantityEditable, skuState.slideToBnpl, skuState.exceptionUX, skuState.counterDescription, skuState.topOutsideWidgetVisibleHeight, skuState.cutPriceSkuPanel, skuState.skuPanelWaistBanner, skuState.skuPanelSellingPoints, skuState.skuHeaderTopLabels);
    }

    public static final Object invoke$13(AwS89S0110000_1 awS89S0110000_1, Object obj) {
        if (awS89S0110000_1.z1) {
            ((SeaSkuSpecViewModel) awS89S0110000_1.l0).setState(AFwS228S0000000_1.get$arr$(365));
        } else {
            ((SeaSkuSpecViewModel) awS89S0110000_1.l0).setState(AFwS228S0000000_1.get$arr$(366));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS89S0110000_1 awS89S0110000_1, Object obj) {
        com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuState skuState = (com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuState) obj;
        if (awS89S0110000_1.z1) {
            return skuState.copy(skuState.checkedSkuArray, skuState.showToast, skuState.currentImage, skuState.preOrderInfo, skuState.currentPrice, skuState.currentPriceV2, skuState.quantityNoticeInfos, skuState.promotionView, skuState.originalPrice, skuState.priceAfterCoupon, skuState.discountText, skuState.taxDescription, skuState.depositFeeDesc, skuState.unitPriceDescription, skuState.currentQuantityLimit, skuState.currentQuantity, skuState.contentList, skuState.keyBoardVisibility, skuState.skuPanelCloseEvent, (EnumC10383044f) awS89S0110000_1.l0, skuState.addToCartButton, skuState.showLoadingView, skuState.showLoadingSpinner, skuState.skuStockInfo, new Object(), skuState.originalProductPackStruct, skuState.protectionProgramText, skuState.productTitle, skuState.promotionLabelVO, skuState.productSellerInfo, skuState.skuPanelReminder, skuState.isPriceHidden, skuState.isQuantityEditable, skuState.scrollOffset, skuState.scrollOrientation, skuState.bottomAreaElem, skuState.bizEnvChange, skuState.focusSpecAction, skuState.allSkuSelected, skuState.totalPrice, skuState.couponEvent, skuState.carouselImages, skuState.carouselNeedToScrollToFirst, skuState.counterDisclaimer, skuState.exceptionUX, skuState.selectedPurchaseMethod, skuState.selectedPeriodText, skuState.pricePrefix, skuState.extraInfoData, skuState.paymentInfo, skuState.summaryInfo, skuState.refreshFlag, skuState.hidePaymentMethodView, skuState.promotionWaist);
        }
        return skuState.copy(skuState.checkedSkuArray, skuState.showToast, skuState.currentImage, skuState.preOrderInfo, skuState.currentPrice, skuState.currentPriceV2, skuState.quantityNoticeInfos, skuState.promotionView, skuState.originalPrice, skuState.priceAfterCoupon, skuState.discountText, skuState.taxDescription, skuState.depositFeeDesc, skuState.unitPriceDescription, skuState.currentQuantityLimit, skuState.currentQuantity, skuState.contentList, skuState.keyBoardVisibility, skuState.skuPanelCloseEvent, (EnumC10383044f) awS89S0110000_1.l0, skuState.addToCartButton, skuState.showLoadingView, skuState.showLoadingSpinner, skuState.skuStockInfo, skuState.forceRefresh, skuState.originalProductPackStruct, skuState.protectionProgramText, skuState.productTitle, skuState.promotionLabelVO, skuState.productSellerInfo, skuState.skuPanelReminder, skuState.isPriceHidden, skuState.isQuantityEditable, skuState.scrollOffset, skuState.scrollOrientation, skuState.bottomAreaElem, skuState.bizEnvChange, skuState.focusSpecAction, skuState.allSkuSelected, skuState.totalPrice, skuState.couponEvent, skuState.carouselImages, skuState.carouselNeedToScrollToFirst, skuState.counterDisclaimer, skuState.exceptionUX, skuState.selectedPurchaseMethod, skuState.selectedPeriodText, skuState.pricePrefix, skuState.extraInfoData, skuState.paymentInfo, skuState.summaryInfo, skuState.refreshFlag, skuState.hidePaymentMethodView, skuState.promotionWaist);
    }

    public static final Object invoke$15(AwS89S0110000_1 awS89S0110000_1, Object obj) {
        com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuState skuState = (com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuState) obj;
        boolean z = awS89S0110000_1.z1;
        if (z) {
            ((C043B) awS89S0110000_1.l0).LJJJZ(new AwS16S0010000_1(z, 13));
        } else if (Intrinsics.LJFF(skuState.getKeyBoardVisibility(), Boolean.TRUE)) {
            ((C043B) awS89S0110000_1.l0).LJJJZ(new AwS16S0010000_1(awS89S0110000_1.z1, 14));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS89S0110000_1 awS89S0110000_1, Object obj) {
        return C03JV.LIZ((C03JV) obj, 0, null, null, false, null, false, null, null, null, null, null, null, null, null, 0, null, null, 0, null, null, false, 0L, false, false, new C035X((PrivacyPopup) awS89S0110000_1.l0, Boolean.valueOf(awS89S0110000_1.z1)), null, false, null, null, null, null, null, false, null, null, false, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, false, 0, false, null, null, false, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, false, null, null, null, null, null, null, null, -16777217, -1, -1, 1048575);
    }

    public static final Object invoke$17(AwS89S0110000_1 awS89S0110000_1, Object obj) {
        Object obj2;
        C03JV c03jv = (C03JV) obj;
        PaymentInfo paymentInfo = (PaymentInfo) awS89S0110000_1.l0;
        if (awS89S0110000_1.z1) {
            obj2 = new Object();
        } else {
            obj2 = null;
        }
        return C03JV.LIZ(c03jv, 0, null, null, false, null, false, paymentInfo, null, null, null, null, null, null, null, 0, null, null, 0, null, null, false, 0L, false, false, null, null, false, null, null, null, null, null, false, null, null, false, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, false, 0, false, null, null, false, obj2, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, false, null, null, null, null, null, null, null, -65, -1, -1025, 1048575);
    }

    public static final Object invoke$18(AwS89S0110000_1 awS89S0110000_1, Object obj) {
        Object obj2;
        C03JV c03jv = (C03JV) obj;
        PaymentInfo paymentInfo = (PaymentInfo) awS89S0110000_1.l0;
        if (awS89S0110000_1.z1) {
            obj2 = new Object();
        } else {
            obj2 = null;
        }
        return C03JV.LIZ(c03jv, 0, null, null, false, null, false, paymentInfo, null, null, null, null, null, null, null, 0, null, null, 0, null, null, false, 0L, false, false, null, null, false, null, null, null, null, null, false, null, null, false, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, false, 0, false, null, null, false, obj2, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, false, null, null, null, null, null, null, null, -65, -1, -1025, 1048575);
    }

    public static final Object invoke$19(AwS89S0110000_1 awS89S0110000_1, Object obj) {
        HashMap map = (HashMap) obj;
        map.put("aggregate_logistic_panel_config_data", (C821703Ix) awS89S0110000_1.l0);
        map.put("aggregate_logistic_from_combined_sku", Boolean.valueOf(awS89S0110000_1.z1));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS89S0110000_1 awS89S0110000_1, Object obj) {
        String str;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("button_name", "message");
        if (awS89S0110000_1.z1) {
            str = "edit_message";
        } else {
            str = "add_message";
        }
        laneParams.plusAssign("button_type", str);
        laneParams.putAll(((C815203Gk) awS89S0110000_1.l0).LLILLJJLI.LLLZLZ.LIZ("c09380.d5533"));
        return Unit.LIZ;
    }

    public static final Object invoke$20(AwS89S0110000_1 awS89S0110000_1, Object obj) {
        C1748780vbo.LIZIZ((C1748770vbn) obj, "lib_track_builtin_lane_business", new AwS89S0110000_1((C821703Ix) awS89S0110000_1.l0, awS89S0110000_1.z1, 19));
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$21(AwS89S0110000_1 awS89S0110000_1, Object obj) {
        int i;
        TuxIconView tuxIconView = new TuxIconView((Context) awS89S0110000_1.l0, null, 0, 6, null);
        boolean z = awS89S0110000_1.z1;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        C786410Ut5.M6(tuxIconView, new LinearLayout.LayoutParams(iLIZIZ, iLIZIZ));
        tuxIconView.setIconRes(R.raw.icon_pen_fill);
        if (z) {
            i = R.attr.ezq;
        } else {
            i = R.attr.ezy;
        }
        tuxIconView.setTintColorRes(i);
        return tuxIconView;
    }

    public static final Object invoke$22(AwS89S0110000_1 awS89S0110000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("button_name", ((UserRightDetail) awS89S0110000_1.l0).nameEn);
        laneParams.plusAssign("is_clickable", Integer.valueOf(awS89S0110000_1.z1 ? 1 : 0));
        return Unit.LIZ;
    }

    public static final Object invoke$23(AwS89S0110000_1 awS89S0110000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("button_name", ((UserRightDetail) awS89S0110000_1.l0).nameEn);
        laneParams.plusAssign("is_clickable", Integer.valueOf(awS89S0110000_1.z1 ? 1 : 0));
        return Unit.LIZ;
    }

    public static final Object invoke$24(AwS89S0110000_1 awS89S0110000_1, Object obj) {
        String str;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("button_name", "message");
        if (awS89S0110000_1.z1) {
            str = "edit_message";
        } else {
            str = "add_message";
        }
        laneParams.plusAssign("button_type", str);
        laneParams.putAll(((USAggregationOrderSingleSkuCell) awS89S0110000_1.l0).L5().LLLZLZ.LIZ("c09380.d5533"));
        return Unit.LIZ;
    }

    public static final Object invoke$25(AwS89S0110000_1 awS89S0110000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("button_name", ((UserRightDetail) awS89S0110000_1.l0).nameEn);
        laneParams.plusAssign("is_clickable", Integer.valueOf(awS89S0110000_1.z1 ? 1 : 0));
        return Unit.LIZ;
    }

    public static final Object invoke$26(AwS89S0110000_1 awS89S0110000_1, Object obj) {
        return C890803dy.LIZ((C890803dy) obj, (PaymentMethod) awS89S0110000_1.l0, null, null, awS89S0110000_1.z1, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 4194286);
    }

    public static final Object invoke$27(AwS89S0110000_1 awS89S0110000_1, Object obj) {
        String str;
        PaymentMethod paymentMethod;
        List<InstallmentPlan> list;
        InstallmentPlan next;
        List<DiscountInfo> list2;
        List<InstallmentInfo> list3;
        DiscountInfo discountInfo = (DiscountInfo) obj;
        if (!awS89S0110000_1.z1 || (str = discountInfo.discountSourceId) == null || (paymentMethod = (PaymentMethod) awS89S0110000_1.l0) == null) {
            return null;
        }
        InstallmentInfo installmentInfo = paymentMethod.installmentInfo;
        if ((installmentInfo == null && ((list3 = paymentMethod.installmentInfoList) == null || (installmentInfo = (InstallmentInfo) C13LP.LJJJLL(list3)) == null)) || (list = installmentInfo.installmentPlans) == null) {
            return null;
        }
        Iterator<InstallmentPlan> it2 = list.iterator();
        loop0: while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                InterestFeePromotion interestFeePromotion = next.interestFeePromotion;
                if (interestFeePromotion != null && (list2 = interestFeePromotion.discountInfoList) != null && !list2.isEmpty()) {
                    Iterator<DiscountInfo> it3 = list2.iterator();
                    while (it3.hasNext()) {
                        if (Intrinsics.LJFF(it3.next().discountSourceId, str)) {
                            break loop0;
                        }
                    }
                }
            } else {
                next = null;
                break;
            }
        }
        InstallmentPlan installmentPlan = next;
        if (installmentPlan == null) {
            return null;
        }
        return installmentPlan.tenure;
    }

    public static final Object invoke$28(AwS89S0110000_1 awS89S0110000_1, Object obj) {
        return C2262851Dhb.LIZ((C2262851Dhb) obj, null, null, null, null, new C833103Nh(new C833003Ng(awS89S0110000_1.z1, 2), (ECRichText) awS89S0110000_1.l0), null, null, null, null, null, null, 2031);
    }

    public static final Object invoke$29(AwS89S0110000_1 awS89S0110000_1, Object obj) {
        return C2262851Dhb.LIZ((C2262851Dhb) obj, null, null, null, null, new C833103Nh(new C833003Ng(awS89S0110000_1.z1, 2), (ECRichText) awS89S0110000_1.l0), null, null, null, null, null, null, 2031);
    }

    public static final Object invoke$3(AwS89S0110000_1 awS89S0110000_1, Object obj) {
        HashMap map = (HashMap) obj;
        map.put("banner_name", "rights_text");
        map.put("is_clickable", Boolean.valueOf(awS89S0110000_1.z1));
        map.put("banner_position", "title");
        map.put("banner_text", "Secure payments");
        ((MiniOspFragment) awS89S0110000_1.l0).getClass();
        map.put("page_name", "mini_order_submit");
        return Unit.LIZ;
    }

    public static final Object invoke$30(AwS89S0110000_1 awS89S0110000_1, Object obj) {
        String str;
        C957403oi c957403oi = (C957403oi) obj;
        ConcurrentHashMap<String, Object> concurrentHashMap = ((C1054004Ag) awS89S0110000_1.l0).LIZIZ;
        c957403oi.getClass();
        ((HashMap) c957403oi.LIZ).putAll(concurrentHashMap);
        c957403oi.LIZJ("is_inapp", "1");
        if (awS89S0110000_1.z1) {
            str = "full";
        } else {
            str = "half";
        }
        c957403oi.LIZJ("landpage_form", str);
        return Unit.LIZ;
    }

    public static final Object invoke$31(AwS89S0110000_1 awS89S0110000_1, Object obj) {
        int currentAddressSelectType;
        AddressSelectState addressSelectState = (AddressSelectState) obj;
        boolean z = awS89S0110000_1.z1;
        Integer num = (Integer) awS89S0110000_1.l0;
        if (num != null) {
            currentAddressSelectType = num.intValue();
        } else {
            currentAddressSelectType = addressSelectState.getCurrentAddressSelectType();
        }
        return addressSelectState.copy(addressSelectState.selectedAddress, addressSelectState.status, addressSelectState.renderDataList, addressSelectState.selectedRegions, z, currentAddressSelectType, addressSelectState.selectCountry, addressSelectState.chooseLocation, addressSelectState.reachableAddress, addressSelectState.logDuration);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$32(kotlin.jvm.internal.AwS89S0110000_1 r20, java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS89S0110000_1.invoke$32(kotlin.jvm.internal.AwS89S0110000_1, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$4(AwS89S0110000_1 awS89S0110000_1, Object obj) {
        PaymentState paymentState = (PaymentState) obj;
        return paymentState.copy(paymentState.checkedPaymentMethod, paymentState.paymentList, paymentState.paymentInfo, paymentState.systemError, paymentState.emailHintVisible, paymentState.paymentInfoForThreeStepCache, paymentState.paymentInfoForNextStep, awS89S0110000_1.z1, paymentState.resendPayAction, paymentState.scrollUpAction, paymentState.scrollUpDistance, paymentState.toast, paymentState.checkedCreditMethod, paymentState.installmentPlanChanged, paymentState.abnormalStatus, paymentState.exceptionUX, (EnumC880203cG) awS89S0110000_1.l0, paymentState.bindCardErrorMsg, paymentState.bindCardErrorAction, paymentState.chooseSaveStatus, paymentState.subPaymentMethodIsChecked, paymentState.checkedAnchorPaymentMethod, paymentState.summaryPanelStatus, paymentState.summary, paymentState.dialogContent, paymentState.buttonTrigger);
    }

    public static final Object invoke$5(AwS89S0110000_1 awS89S0110000_1, Object obj) {
        ((Function0) awS89S0110000_1.l0).invoke();
        if (awS89S0110000_1.z1) {
            String value = C03RN.ACTIVATE_DIALOG.getValue();
            if (C03RP.LIZIZ().enableActivateLogTrack) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("page_name", "payment_method");
                linkedHashMap.put("popup_name", value);
                linkedHashMap.put("action_type", "activate");
                C1018703yb.LIZIZ("tiktokec_popup_click", linkedHashMap);
            }
        } else {
            C03O0 c03o0 = C03O0.LIZ;
            String value2 = C03RN.ACTIVATE_DIALOG.getValue();
            c03o0.getClass();
            C03O0.LJJIFFI(value2, "activate");
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$6(AwS89S0110000_1 awS89S0110000_1, Object obj) {
        String strJ3;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start setGoogleAndPixPayStatusListener gp result ");
        sbLIZ.append(awS89S0110000_1.z1);
        sbLIZ.append(" pix result ");
        sbLIZ.append(zBooleanValue);
        sbLIZ.append('}');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LIZ(strLIZIZ);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("google", awS89S0110000_1.z1);
            jSONObject.put("pix", zBooleanValue);
            jSONObject.put("enable_pix", true);
            strJ3 = C786410Ut5.J3(jSONObject);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            strJ3 = null;
        }
        C03WD.LJI("pix_google_pay", "REQUEST_GOOGLE_AVAILABLE", strJ3);
        ((Function1) awS89S0110000_1.l0).invoke(new Pair(Boolean.valueOf(awS89S0110000_1.z1), Boolean.valueOf(zBooleanValue)));
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS89S0110000_1 awS89S0110000_1, Object obj) {
        String str;
        PaymentMethod paymentMethod;
        List<InstallmentPlan> list;
        InstallmentPlan next;
        List<DiscountInfo> list2;
        List<InstallmentInfo> list3;
        DiscountInfo discountInfo = (DiscountInfo) obj;
        if (!awS89S0110000_1.z1 || (str = discountInfo.discountSourceId) == null || (paymentMethod = (PaymentMethod) awS89S0110000_1.l0) == null) {
            return null;
        }
        InstallmentInfo installmentInfo = paymentMethod.installmentInfo;
        if ((installmentInfo == null && ((list3 = paymentMethod.installmentInfoList) == null || (installmentInfo = (InstallmentInfo) C13LP.LJJJLL(list3)) == null)) || (list = installmentInfo.installmentPlans) == null) {
            return null;
        }
        Iterator<InstallmentPlan> it2 = list.iterator();
        loop0: while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                InterestFeePromotion interestFeePromotion = next.interestFeePromotion;
                if (interestFeePromotion != null && (list2 = interestFeePromotion.discountInfoList) != null && !list2.isEmpty()) {
                    Iterator<DiscountInfo> it3 = list2.iterator();
                    while (it3.hasNext()) {
                        if (Intrinsics.LJFF(it3.next().discountSourceId, str)) {
                            break loop0;
                        }
                    }
                }
            } else {
                next = null;
                break;
            }
        }
        InstallmentPlan installmentPlan = next;
        if (installmentPlan == null) {
            return null;
        }
        return installmentPlan.tenure;
    }

    public static final Object invoke$8(AwS89S0110000_1 awS89S0110000_1, Object obj) {
        if (Intrinsics.LJFF(((C03JV) obj).LLLLLZ, Boolean.FALSE) && awS89S0110000_1.z1) {
            C1019103yf.LIZ(EnumC1014603xw.ERR91, null, null);
        } else {
            ((OrderSubmitAssemViewModel) awS89S0110000_1.l0).setState(new AwS16S0010000_1(awS89S0110000_1.z1, 7));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS89S0110000_1 awS89S0110000_1, Object obj) {
        Object obj2;
        C03JV c03jv = (C03JV) obj;
        PaymentInfo paymentInfo = (PaymentInfo) awS89S0110000_1.l0;
        if (awS89S0110000_1.z1) {
            obj2 = new Object();
        } else {
            obj2 = null;
        }
        return C03JV.LIZ(c03jv, 0, null, null, false, null, false, paymentInfo, null, null, null, null, null, null, null, 0, null, null, 0, null, null, false, 0L, false, false, null, null, false, null, null, null, null, null, false, null, null, false, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, false, 0, false, null, null, false, obj2, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, false, null, null, null, null, null, null, null, -65, -1, -1025, 1048575);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS89S0110000_1(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r3, boolean r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            switch(r5) {
                case 1: goto Lf;
                case 7: goto Lf;
                case 27: goto Lf;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r3
            r1.z1 = r4
            r0 = 1
        Lb:
            r1.<init>(r0)
            return
        Lf:
            r1 = r2
            r1.z1 = r4
            r1.l0 = r3
            r0 = 1
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS89S0110000_1.<init>(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod, boolean, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS89S0110000_1(C821703Ix c821703Ix, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c821703Ix;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS89S0110000_1(C965403q0 c965403q0, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c965403q0;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS89S0110000_1(C043B c043b, boolean z, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = c043b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS89S0110000_1(C044Z c044z, boolean z, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = c044z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS89S0110000_1(C1054004Ag c1054004Ag, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1054004Ag;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS89S0110000_1(Context context, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = context;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS89S0110000_1(OspAddressViewModel ospAddressViewModel, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = ospAddressViewModel;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS89S0110000_1(PaymentInfo paymentInfo, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = paymentInfo;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS89S0110000_1(PrivacyPopup privacyPopup, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = privacyPopup;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS89S0110000_1(OrderSubmitAssemViewModel orderSubmitAssemViewModel, boolean z, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = orderSubmitAssemViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS89S0110000_1(UserRightDetail userRightDetail, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = userRightDetail;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS89S0110000_1(PdpViewModel pdpViewModel, boolean z, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = pdpViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS89S0110000_1(ECRichText eCRichText, boolean z, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = eCRichText;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS89S0110000_1(Function0 function0, Function0<Unit> function02, boolean z) {
        super(1);
        this.$t = z ? 1 : 0;
        this.l0 = function0;
        this.z1 = function02;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS89S0110000_1(Function1 function1, boolean z, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS89S0110000_1(boolean z, C815203Gk c815203Gk, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = c815203Gk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS89S0110000_1(boolean z, EnumC880203cG enumC880203cG, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = enumC880203cG;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS89S0110000_1(boolean z, EnumC10383044f enumC10383044f, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = enumC10383044f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS89S0110000_1(boolean z, USAggregationOrderSingleSkuCell uSAggregationOrderSingleSkuCell, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = uSAggregationOrderSingleSkuCell;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS89S0110000_1(boolean z, MiniOspFragment miniOspFragment, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = miniOspFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS89S0110000_1(boolean z, Integer num, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = num;
    }
}
