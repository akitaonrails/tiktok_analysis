package kotlin.jvm.internal;

import X.C034S;
import X.C03NF;
import X.C03O1;
import X.C043B;
import X.C044L;
import X.C044M;
import X.C09AY;
import X.C1120604Zw;
import X.C1388190mED;
import X.C1389880mGw;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13LP;
import X.C1745060vVo;
import X.C1AQS;
import X.C23250099c;
import X.C2327809Ae;
import X.C340180DVg;
import X.C419910GdJ;
import X.C7727030b;
import X.C817503Hh;
import X.C829203Lu;
import X.C830403Mg;
import X.C928103jz;
import X.C936903lP;
import X.C985403tE;
import X.InterfaceC911603hK;
import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.api.model.DialogButton;
import com.ss.android.ugc.aweme.ecommerce.api.model.DialogContent;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LeadMessage;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticTextDTO;
import com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.dto.MiniCheckoutPopup;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.MiniOspActivity;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.utils.PollOrderManager;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PurchaseMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PurchaseMethodItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem.SkuPanelBaseReusedAssem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.vm.SkuState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.SkuPanelCounterWidget;
import com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.counter.SeaSkuCounterCell;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelAssemVM;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS545S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public class AwS109S0101000_1 extends C09AY implements Function1 {
    public final int $t;
    public int i1;
    public Object l0;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS109S0101000_1 awS109S0101000_1, Object obj) {
        String string;
        SkuItem skuItemZQ2 = ((SeaSkuCounterCell) awS109S0101000_1.l0).N5().zQ2(((C936903lP) obj).LL);
        if (skuItemZQ2 == null || (string = skuItemZQ2.purchaseLimitToast) == null) {
            string = ((SeaSkuCounterCell) awS109S0101000_1.l0).itemView.getContext().getResources().getString(2131832583, Integer.valueOf(awS109S0101000_1.i1));
        }
        C1389880mGw c1389880mGw = new C1389880mGw(((SeaSkuCounterCell) awS109S0101000_1.l0).itemView);
        c1389880mGw.LJIIIZ(string);
        c1389880mGw.LJIIJ();
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS109S0101000_1 awS109S0101000_1, Object obj) {
        SkuState skuState = (SkuState) obj;
        return skuState.copy(skuState.checkedSkuArray, skuState.showToast, skuState.currentImage, skuState.buyButton, skuState.buyButtonInterestId, skuState.buttonDynamicData, skuState.preOrderInfo, skuState.currentPriceData, skuState.hidePriceTip, skuState.purchaseNotice, skuState.promotionDealVO, skuState.specifications, skuState.currentQuantityLimit, new Pair<>(Integer.valueOf(awS109S0101000_1.i1), (C044L) awS109S0101000_1.l0), skuState.currentImagePosition, skuState.currentInstallmentPlan, skuState.keyBoardVisibility, skuState.skuFragmentClosed, skuState.skuDataState, skuState.addToCartButton, skuState.paymentModule, skuState.showLoadingView, skuState.skuStockInfo, skuState.forceRefresh, skuState.originalProductPackStruct, skuState.localSizeSalePropList, skuState.isQuantityEditable, skuState.slideToBnpl, skuState.exceptionUX, skuState.counterDescription, skuState.topOutsideWidgetVisibleHeight, skuState.cutPriceSkuPanel, skuState.skuPanelWaistBanner, skuState.skuPanelSellingPoints, skuState.skuHeaderTopLabels);
    }

    public static final Object invoke$10(AwS109S0101000_1 awS109S0101000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("module_name", "sku_fixed_user_rights");
        laneParams.plusAssign("sku_panel_rights_cnt", Integer.valueOf(awS109S0101000_1.i1));
        for (Map.Entry entry : ((Map) awS109S0101000_1.l0).entrySet()) {
            laneParams.put(entry.getKey(), entry.getValue());
        }
        laneParams.withNotCheckParams((Map) awS109S0101000_1.l0);
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS109S0101000_1 awS109S0101000_1, Object obj) {
        String str;
        LeadMessage leadMessage;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String currency;
        String priceVal;
        Float fLJIIIIZZ;
        String str9;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("is_fullscreen", CardStruct.IStatusCode.DEFAULT);
        laneParams.plusAssign("page_name", "logistics");
        laneParams.plusAssign("sub_page_name", "shipping");
        laneParams.plusAssign("previous_page", "product_detail");
        laneParams.plusAssign("option_type", "shipping_type");
        Map<String, String> map = ((LogisticDTO) awS109S0101000_1.l0).eventTrackInfo;
        if (map != null && (str9 = map.get("ship_from")) != null) {
            laneParams.plusAssign("ship_from", str9);
        }
        Price price = ((LogisticDTO) awS109S0101000_1.l0).shippingFee;
        if (price != null && (priceVal = price.getPriceVal()) != null && (fLJIIIIZZ = C2327809Ae.LJIIIIZZ(priceVal)) != null) {
            laneParams.plusAssign("shipping_price", Float.valueOf(fLJIIIIZZ.floatValue()));
        }
        Price price2 = ((LogisticDTO) awS109S0101000_1.l0).shippingFee;
        if (price2 != null && (currency = price2.getCurrency()) != null) {
            laneParams.plusAssign("shipping_currency", currency);
        }
        Map<String, String> map2 = ((LogisticDTO) awS109S0101000_1.l0).eventTrackInfo;
        if (map2 != null && (str8 = map2.get("shipping_type")) != null) {
            laneParams.plusAssign("option_name", str8);
        }
        Map<String, String> map3 = ((LogisticDTO) awS109S0101000_1.l0).eventTrackInfo;
        if (map3 != null && (str7 = map3.get("est_delivery_day_max")) != null) {
            laneParams.plusAssign("est_delivery_day_max", str7);
        }
        Map<String, String> map4 = ((LogisticDTO) awS109S0101000_1.l0).eventTrackInfo;
        if (map4 != null && (str6 = map4.get("est_delivery_day_min")) != null) {
            laneParams.plusAssign("est_delivery_day_min", str6);
        }
        Map<String, String> map5 = ((LogisticDTO) awS109S0101000_1.l0).eventTrackInfo;
        if (map5 != null && (str5 = map5.get("est_logistic_delivery_day_max")) != null) {
            laneParams.plusAssign("est_logistic_delivery_day_max", str5);
        }
        Map<String, String> map6 = ((LogisticDTO) awS109S0101000_1.l0).eventTrackInfo;
        if (map6 != null && (str4 = map6.get("est_logistic_delivery_day_min")) != null) {
            laneParams.plusAssign("est_logistic_delivery_day_min", str4);
        }
        Map<String, String> map7 = ((LogisticDTO) awS109S0101000_1.l0).eventTrackInfo;
        if (map7 != null && (str3 = map7.get("edt_type")) != null) {
            laneParams.plusAssign("edt_type", str3);
        }
        laneParams.plusAssign("rank", Integer.valueOf(awS109S0101000_1.i1));
        LogisticTextDTO logisticTextDTO = ((LogisticDTO) awS109S0101000_1.l0).logisticText;
        if (logisticTextDTO != null && (leadMessage = logisticTextDTO.leadMessage) != null && (str2 = leadMessage.fromOverseas) != null && str2.length() != 0) {
            str = "overseas";
        } else {
            str = "local";
        }
        laneParams.plusAssign("ship_from", str);
        laneParams.plusAssign("option_type", "shipping_type");
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS109S0101000_1 awS109S0101000_1, Object obj) {
        String string;
        SkuState skuState = (SkuState) obj;
        if (awS109S0101000_1.i1 > skuState.getCurrentQuantityLimit().LIZIZ) {
            SkuPanelCounterWidget skuPanelCounterWidget = (SkuPanelCounterWidget) awS109S0101000_1.l0;
            View view = skuPanelCounterWidget.LLILZ;
            if (view != null) {
                SkuItem skuItem = skuPanelCounterWidget.LJII().LLJJJJ;
                if (skuItem == null || (string = skuItem.purchaseLimitToast) == null) {
                    string = C1745060vVo.LIZ(skuPanelCounterWidget).getResources().getString(2131832583, Integer.valueOf(skuState.getCurrentQuantityLimit().LIZIZ));
                }
                C1389880mGw c1389880mGw = new C1389880mGw(view);
                c1389880mGw.LJIIIZ(string);
                c1389880mGw.LJIIJ();
            }
            ((SkuPanelCounterWidget) awS109S0101000_1.l0).LJII().Fl(skuState.getCurrentQuantityLimit().LIZIZ, new C044L(true, 2));
            return Unit.LIZ;
        }
        if (awS109S0101000_1.i1 < skuState.getCurrentQuantityLimit().LIZ) {
            SkuPanelCounterWidget skuPanelCounterWidget2 = (SkuPanelCounterWidget) awS109S0101000_1.l0;
            View view2 = skuPanelCounterWidget2.LLILZ;
            if (view2 != null) {
                if (skuPanelCounterWidget2.LJII().LLJJIJIIJIL != -1) {
                    if (skuPanelCounterWidget2.LJII().ct()) {
                        skuPanelCounterWidget2.LJIIJ().LIZIZ(skuPanelCounterWidget2.LJIIJ().LJFF);
                    } else {
                        String string2 = C1745060vVo.LIZ(skuPanelCounterWidget2).getResources().getString(2131832592, Integer.valueOf(skuState.getCurrentQuantityLimit().LIZ));
                        C1389880mGw c1389880mGw2 = new C1389880mGw(view2);
                        c1389880mGw2.LJIIIZ(string2);
                        c1389880mGw2.LJIIJ();
                    }
                }
                return Unit.LIZ;
            }
            return null;
        }
        ((SkuPanelCounterWidget) awS109S0101000_1.l0).LJII().Fl(awS109S0101000_1.i1, new C044L(true, false));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS109S0101000_1 awS109S0101000_1, Object obj) {
        Integer num;
        String[] strArr;
        PurchaseMethodInfo purchaseMethodInfo;
        List<PurchaseMethodItem> list;
        PurchaseMethodItem purchaseMethodItem;
        ProductPackStruct productPackStructDh = ((C043B) awS109S0101000_1.l0).Dh();
        if (productPackStructDh != null && (purchaseMethodInfo = productPackStructDh.purchaseMethodInfo) != null && (list = purchaseMethodInfo.itemList) != null && (purchaseMethodItem = (PurchaseMethodItem) C13LP.LJJJLZIJ(awS109S0101000_1.i1, list)) != null) {
            num = purchaseMethodItem.purchaseMethodType;
        } else {
            num = null;
        }
        SkuPanelState skuPanelStateDw = ((C043B) awS109S0101000_1.l0).dw();
        if (skuPanelStateDw != null) {
            skuPanelStateDw.purchaseMethod = num;
        }
        C043B c043b = (C043B) awS109S0101000_1.l0;
        SkuPanelState skuPanelStateDw2 = c043b.dw();
        if (skuPanelStateDw2 == null || (strArr = skuPanelStateDw2.checkedSkuIds) == null) {
            strArr = new String[0];
        }
        c043b.dc(false, strArr);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS109S0101000_1 awS109S0101000_1, Object obj) {
        com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuState skuState = (com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuState) obj;
        return skuState.copy(skuState.checkedSkuArray, skuState.showToast, skuState.currentImage, skuState.preOrderInfo, skuState.currentPrice, skuState.currentPriceV2, skuState.quantityNoticeInfos, skuState.promotionView, skuState.originalPrice, skuState.priceAfterCoupon, skuState.discountText, skuState.taxDescription, skuState.depositFeeDesc, skuState.unitPriceDescription, skuState.currentQuantityLimit, new Pair<>(Integer.valueOf(awS109S0101000_1.i1), (C044L) awS109S0101000_1.l0), skuState.contentList, skuState.keyBoardVisibility, skuState.skuPanelCloseEvent, skuState.skuDataState, skuState.addToCartButton, skuState.showLoadingView, skuState.showLoadingSpinner, skuState.skuStockInfo, skuState.forceRefresh, skuState.originalProductPackStruct, skuState.protectionProgramText, skuState.productTitle, skuState.promotionLabelVO, skuState.productSellerInfo, skuState.skuPanelReminder, skuState.isPriceHidden, skuState.isQuantityEditable, skuState.scrollOffset, skuState.scrollOrientation, skuState.bottomAreaElem, skuState.bizEnvChange, skuState.focusSpecAction, skuState.allSkuSelected, skuState.totalPrice, skuState.couponEvent, skuState.carouselImages, skuState.carouselNeedToScrollToFirst, skuState.counterDisclaimer, skuState.exceptionUX, skuState.selectedPurchaseMethod, skuState.selectedPeriodText, skuState.pricePrefix, skuState.extraInfoData, skuState.paymentInfo, skuState.summaryInfo, skuState.refreshFlag, skuState.hidePaymentMethodView, skuState.promotionWaist);
    }

    public static final Object invoke$5(AwS109S0101000_1 awS109S0101000_1, Object obj) {
        String string;
        com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuState skuState = (com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuState) obj;
        if (awS109S0101000_1.i1 > skuState.getCurrentQuantityLimit().LIZIZ) {
            View contentView = ((ReusedUISlotAssem) ((C044M) awS109S0101000_1.l0)).getContentView();
            if (contentView != null) {
                SkuPanelBaseReusedAssem skuPanelBaseReusedAssem = (SkuPanelBaseReusedAssem) ((C044M) awS109S0101000_1.l0);
                SkuItem skuItem = skuPanelBaseReusedAssem.getViewModel().LLJJL;
                if (skuItem == null || (string = skuItem.purchaseLimitToast) == null) {
                    string = skuPanelBaseReusedAssem.sp().getResources().getString(2131832583, Integer.valueOf(skuState.getCurrentQuantityLimit().LIZIZ));
                }
                C1389880mGw c1389880mGw = new C1389880mGw(contentView);
                c1389880mGw.LJIIIZ(string);
                c1389880mGw.LJIIJ();
            }
            ((SkuPanelBaseReusedAssem) ((C044M) awS109S0101000_1.l0)).getViewModel().Fl(skuState.getCurrentQuantityLimit().LIZIZ, new C044L(true, true));
        } else if (awS109S0101000_1.i1 < skuState.getCurrentQuantityLimit().LIZ) {
            View contentView2 = ((ReusedUISlotAssem) ((C044M) awS109S0101000_1.l0)).getContentView();
            if (contentView2 != null) {
                SkuPanelBaseReusedAssem skuPanelBaseReusedAssem2 = (SkuPanelBaseReusedAssem) ((C044M) awS109S0101000_1.l0);
                if (skuPanelBaseReusedAssem2.getViewModel().LLJJIJIIJIL != -1) {
                    if (skuPanelBaseReusedAssem2.getViewModel().ct()) {
                        skuPanelBaseReusedAssem2.getViewModel().EQ2().LIZIZ(contentView2, skuPanelBaseReusedAssem2.getViewModel().EQ2().LJ);
                    } else {
                        String string2 = skuPanelBaseReusedAssem2.sp().getResources().getString(2131832592, Integer.valueOf(skuState.getCurrentQuantityLimit().LIZ));
                        C1389880mGw c1389880mGw2 = new C1389880mGw(contentView2);
                        c1389880mGw2.LJIIIZ(string2);
                        c1389880mGw2.LJIIJ();
                    }
                }
            }
        } else {
            ((SkuPanelBaseReusedAssem) ((C044M) awS109S0101000_1.l0)).getViewModel().Fl(awS109S0101000_1.i1, new C044L(true, false));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS109S0101000_1 awS109S0101000_1, Object obj) {
        ((C830403Mg) awS109S0101000_1.l0).e0(awS109S0101000_1.i1, ((Number) obj).longValue(), false);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS109S0101000_1 awS109S0101000_1, Object obj) {
        ViewGroup viewGroup = (ViewGroup) obj;
        TuxIconView tuxIconView = new TuxIconView(viewGroup.getContext(), null, 0, 6, null);
        tuxIconView.setTuxIcon((C419910GdJ) awS109S0101000_1.l0);
        int i = awS109S0101000_1.i1;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 17;
        viewGroup.addView(tuxIconView, layoutParams);
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference failed for: r9v21, types: [X.03Lv, android.view.View] */
    public static final Object invoke$8(AwS109S0101000_1 awS109S0101000_1, Object obj) {
        PaymentMethod paymentMethod;
        long jLongValue;
        PaymentMethod paymentMethod2;
        List<MiniCheckoutPopup> list;
        DialogContent dialogContent;
        String strLJJIIZ;
        IECommerceHostService iECommerceHostService;
        C928103jz c928103jzLIZJ;
        Context context;
        final Activity activityLIZ;
        boolean z;
        PaymentMethod paymentMethod3;
        int i = awS109S0101000_1.i1;
        String name = null;
        String strLJJIIZ2 = "";
        if (i == 1) {
            C829203Lu c829203Lu = (C829203Lu) awS109S0101000_1.l0;
            c829203Lu.LIZJ = 4;
            c829203Lu.LJIIJ();
            C829203Lu c829203Lu2 = (C829203Lu) awS109S0101000_1.l0;
            ((ArrayList) c829203Lu2.LJIIJJI).clear();
            int size = c829203Lu2.LJIIIIZZ().pollNumIntervalList.size();
            int i2 = 0;
            while (true) {
                jLongValue = 0;
                if (i2 >= size) {
                    break;
                }
                Object objLIZ = C7727030b.LIZ(i2, c829203Lu2.LJIIIIZZ().pollTimeIntervalList);
                Long l = (Long) C7727030b.LIZ(i2, c829203Lu2.LJIIIIZZ().pollNumIntervalList);
                if (objLIZ != null && l != null) {
                    long jLongValue2 = l.longValue();
                    while (jLongValue < jLongValue2) {
                        ((ArrayList) c829203Lu2.LJIIJJI).add(objLIZ);
                        jLongValue++;
                    }
                }
                i2++;
            }
            Long l2 = (Long) C7727030b.LIZ(c829203Lu2.LJI, c829203Lu2.LJIIJJI);
            if (l2 != null) {
                jLongValue = l2.longValue();
            }
            c829203Lu2.LJIIIZ = jLongValue;
            C829203Lu c829203Lu3 = (C829203Lu) awS109S0101000_1.l0;
            c829203Lu3.LIZIZ.LIZJ(c829203Lu3.LJIIIZ, c829203Lu3.LJ);
            C829203Lu c829203Lu4 = (C829203Lu) awS109S0101000_1.l0;
            BillInfoData billInfoData = c829203Lu4.LIZ.LLIZ;
            if (billInfoData != null && (list = billInfoData.miniCheckoutPopupList) != null) {
                ArrayList arrayList = new ArrayList();
                for (MiniCheckoutPopup miniCheckoutPopup : list) {
                    Integer num = miniCheckoutPopup.popupType;
                    if (num != null && num.intValue() == 2) {
                        arrayList.add(miniCheckoutPopup);
                    }
                }
                MiniCheckoutPopup miniCheckoutPopup2 = (MiniCheckoutPopup) C7727030b.LIZ(0, arrayList);
                if (miniCheckoutPopup2 != null && (dialogContent = miniCheckoutPopup2.dialogContent) != null) {
                    c829203Lu4.LJII();
                    C03O1 c03o1 = c829203Lu4.LIZ.LLILZLL;
                    String strLJIIIZ = C829203Lu.LJIIIZ(2);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("popup_type", "membership_payment_popup");
                    PaymentInfo paymentInfo = c829203Lu4.LIZ.LLJIJIL;
                    if (paymentInfo == null || (paymentMethod3 = paymentInfo.paymentMethod) == null) {
                        strLJJIIZ = "";
                    } else {
                        strLJJIIZ = paymentMethod3.LJJIIZ();
                    }
                    linkedHashMap.put("payment_method", strLJJIIZ);
                    C03O1.LJIIZILJ(c03o1, strLJIIIZ, null, null, linkedHashMap, "mini_order_submit", false, 38);
                    if (C034S.LIZ()) {
                        C1120604Zw.LIZ.LIZ();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                        if (iECommerceHostService != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        String name2 = IApplicationDependencyService.class.getName();
                        if (iECommerceHostService != null) {
                            name = iECommerceHostService.getClass().getName();
                        }
                        C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
                    } else {
                        C1120604Zw.LIZ.LIZ();
                        iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
                    }
                    InterfaceC911603hK rootPageMonitor = ((IApplicationDependencyService) iECommerceHostService).getRootPageMonitor();
                    if (rootPageMonitor != null && (c928103jzLIZJ = rootPageMonitor.LIZJ()) != null && (context = c928103jzLIZJ.LIZ) != null && (activityLIZ = C1388190mED.LIZ(context)) != null && (activityLIZ instanceof MiniOspActivity) && !activityLIZ.isFinishing()) {
                        C1397580mTM c1397580mTM = new C1397580mTM(activityLIZ);
                        c1397580mTM.LJII = false;
                        String str = dialogContent.title;
                        if (str != null) {
                            ?? r9 = new LinearLayout(activityLIZ) { // from class: X.03Lv
                                public final C01GW LL;

                                private final TuxTextView getLoadingTitle() {
                                    return (TuxTextView) this.LL.getValue();
                                }

                                {
                                    super(activityLIZ, null, 0);
                                    this.LL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1803));
                                    C786410Ut5.Td(C786410Ut5.ne(activityLIZ), R.layout.amh, this, true);
                                }

                                public final void LIZ(String str2) {
                                    getLoadingTitle().setText(str2);
                                }
                            };
                            r9.LIZ(str);
                            C340180DVg.LIZ(c1397580mTM, r9, 0, 6);
                        }
                        c1397580mTM.LIZIZ(dialogContent.message);
                        List<DialogButton> list2 = dialogContent.dialogButtons;
                        if (list2 != null) {
                            C985403tE.LIZ(c1397580mTM, new AwS367S0200000_1((List) list2, (List<DialogButton>) c829203Lu4, (C829203Lu) 326));
                        }
                        C1397510mTF c1397510mTF = new C1397510mTF(c1397580mTM);
                        c829203Lu4.LJIIZILJ = c1397510mTF;
                        c1397510mTF.LIZLLL();
                    }
                }
            }
            C03O1 c03o12 = ((C829203Lu) awS109S0101000_1.l0).LIZ.LLILZLL;
            String strLJIIIZ2 = C829203Lu.LJIIIZ(awS109S0101000_1.i1);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            C829203Lu c829203Lu5 = (C829203Lu) awS109S0101000_1.l0;
            linkedHashMap2.put("popup_type", "membership_payment_popup");
            PaymentInfo paymentInfo2 = c829203Lu5.LIZ.LLJIJIL;
            if (paymentInfo2 != null && (paymentMethod2 = paymentInfo2.paymentMethod) != null) {
                strLJJIIZ2 = paymentMethod2.LJJIIZ();
            }
            linkedHashMap2.put("payment_method", strLJJIIZ2);
            C03O1.LJIILLIIL(c03o12, strLJIIIZ2, "yes", null, null, linkedHashMap2, "mini_order_submit", false, 76);
        } else if (i == 3 || i == 4) {
            MiniOspViewModel miniOspViewModel = ((C829203Lu) awS109S0101000_1.l0).LIZ;
            miniOspViewModel.getClass();
            C23250099c.LIZLLL(C817503Hh.LL, null, null, new C03NF(miniOspViewModel, null), 3);
            C03O1 c03o13 = ((C829203Lu) awS109S0101000_1.l0).LIZ.LLILZLL;
            String strLJIIIZ3 = C829203Lu.LJIIIZ(awS109S0101000_1.i1);
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            C829203Lu c829203Lu6 = (C829203Lu) awS109S0101000_1.l0;
            linkedHashMap3.put("popup_type", "membership_payment_popup");
            PaymentInfo paymentInfo3 = c829203Lu6.LIZ.LLJIJIL;
            if (paymentInfo3 != null && (paymentMethod = paymentInfo3.paymentMethod) != null) {
                strLJJIIZ2 = paymentMethod.LJJIIZ();
            }
            linkedHashMap3.put("payment_method", strLJJIIZ2);
            C03O1.LJIILLIIL(c03o13, strLJIIIZ3, "got_it", null, null, linkedHashMap3, "mini_order_submit", true, 12);
            ((C829203Lu) awS109S0101000_1.l0).LIZ(false, "-111", null, null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS109S0101000_1 awS109S0101000_1, Object obj) {
        String strLJJIIZ;
        PaymentMethod paymentMethod;
        if (awS109S0101000_1.i1 == 1) {
            C829203Lu c829203Lu = (C829203Lu) awS109S0101000_1.l0;
            c829203Lu.LIZJ = 3;
            c829203Lu.LJIIJ();
            C829203Lu c829203Lu2 = (C829203Lu) awS109S0101000_1.l0;
            c829203Lu2.LJI(c829203Lu2.LJIIIIZZ().cancelPollTotalTime, ((C829203Lu) awS109S0101000_1.l0).LJIIIIZZ().cancelPollIntervalTime);
            ((C829203Lu) awS109S0101000_1.l0).LIZ.setState(AFwS228S0000000_1.get$arr$(774));
            C829203Lu c829203Lu3 = (C829203Lu) awS109S0101000_1.l0;
            c829203Lu3.LIZIZ.LIZJ(c829203Lu3.LJIIIZ, c829203Lu3.LJ);
            C829203Lu c829203Lu4 = (C829203Lu) awS109S0101000_1.l0;
            PollOrderManager pollOrderManager = c829203Lu4.LIZIZ;
            long j = c829203Lu4.LJIIIIZZ;
            PollOrderManager.WorkHandler workHandler = pollOrderManager.LIZ;
            if (workHandler != null) {
                workHandler.sendEmptyMessageDelayed(301, j);
            }
            C03O1 c03o1 = ((C829203Lu) awS109S0101000_1.l0).LIZ.LLILZLL;
            String strLJIIIZ = C829203Lu.LJIIIZ(awS109S0101000_1.i1);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C829203Lu c829203Lu5 = (C829203Lu) awS109S0101000_1.l0;
            linkedHashMap.put("popup_type", "membership_payment_popup");
            PaymentInfo paymentInfo = c829203Lu5.LIZ.LLJIJIL;
            if (paymentInfo != null && (paymentMethod = paymentInfo.paymentMethod) != null) {
                strLJJIIZ = paymentMethod.LJJIIZ();
            } else {
                strLJJIIZ = "";
            }
            linkedHashMap.put("payment_method", strLJJIIZ);
            C03O1.LJIILLIIL(c03o1, strLJIIIZ, "no", null, null, linkedHashMap, "mini_order_submit", false, 76);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS109S0101000_1(int i, C829203Lu c829203Lu, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = c829203Lu;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS109S0101000_1(int i, C044L c044l, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = c044l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS109S0101000_1(int i, C044M c044m, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = c044m;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS109S0101000_1(int i, SkuPanelCounterWidget skuPanelCounterWidget, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = skuPanelCounterWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS109S0101000_1(int i, int i2, Map<String, ? extends Object> map) {
        super(1);
        this.$t = map;
        this.i1 = i;
        this.l0 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS109S0101000_1(C830403Mg c830403Mg, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c830403Mg;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS109S0101000_1(C419910GdJ c419910GdJ, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c419910GdJ;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS109S0101000_1(LogisticDTO logisticDTO, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = logisticDTO;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS109S0101000_1(SeaSkuCounterCell seaSkuCounterCell, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = seaSkuCounterCell;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS109S0101000_1(SkuPanelAssemVM skuPanelAssemVM, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = skuPanelAssemVM;
        this.i1 = i;
    }
}
