package kotlin.jvm.internal;

import X.AbstractC7925037r;
import X.C03DI;
import X.C03FA;
import X.C03JV;
import X.C03O0;
import X.C03O1;
import X.C043B;
import X.C047F;
import X.C047L;
import X.C04GD;
import X.C062P;
import X.C099F;
import X.C09AY;
import X.C1054004Ag;
import X.C1054104Ah;
import X.C1120604Zw;
import X.C1121904a9;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1331750klB;
import X.C1397620mTQ;
import X.C13BV;
import X.C13LE;
import X.C13LP;
import X.C15438062q;
import X.C1741890vQh;
import X.C1748770vbn;
import X.C1748780vbo;
import X.C1755410vmV;
import X.C1755420vmW;
import X.C1756010vnT;
import X.C197039127h;
import X.C19EG;
import X.C2327809Ae;
import X.C2371409Qy;
import X.C259800zU;
import X.C418440Gaw;
import X.C719102rN;
import X.C719302rP;
import X.C723002s0;
import X.C786410Ut5;
import X.C814420VxA;
import X.C888203dY;
import X.C888303dZ;
import X.C890803dy;
import X.C893803eS;
import X.C899903fR;
import X.C926703jl;
import X.C936503lL;
import X.C936903lP;
import X.C937103lR;
import X.C939603lq;
import X.C939703lr;
import X.C948003nC;
import X.EnumC804103Cd;
import X.EnumC880203cG;
import X.InterfaceC2217461Bqa;
import X.InterfaceC746802vq;
import X.InterfaceC975703rf;
import android.os.Parcelable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticArea;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticExpressionArea;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticPanelModule;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticsExpressionAreaExtraInfo;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.OrderSKUDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.SelectionBar;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.bottom.MiniOspBottomWidget;
import com.ss.android.ugc.aweme.ecommerce.base.osp.bottom.OspBottomViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.eu.ageconfirm.AgeConfirmCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.CombinedSkuOrderSubmitFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.OrderSubmitFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.SeaOneStepOrderSubmitFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardHalfFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.cci.AddCCICardFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.subpayment.SubPaymentListViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Announcement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ChangeInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ComboSubSkuExpression;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OrderShopDigest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.QuantityControlInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SkuCardStyleInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.UserVirtualInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.VoucherInfoNew;
import com.ss.android.ugc.aweme.ecommerce.base.osp.starter.OrderSubmitEnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ExposeUserRight;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ExposeUserRightPanel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductDetailReview;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.promotion.SeaPdpPromotionEntranceInfoViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.vm.SkuState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.SeaSkuPanelHeaderWidget;
import com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.SeaSkuSpecViewModel;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.ecommerce.us.logistic.module.logisticselectdescription.USLogisticDiscriptionVH;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes2.dex */
public class AwS115S1100000_1 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
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
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                return invoke$50(this, obj);
            case 51:
                return invoke$51(this, obj);
            case 52:
                return invoke$52(this, obj);
            case 53:
                return invoke$53(this, obj);
            case 54:
                return invoke$54(this, obj);
            case 55:
                return invoke$55(this, obj);
            case 56:
                return invoke$56(this, obj);
            case 57:
                return invoke$57(this, obj);
            case 58:
                return invoke$58(this, obj);
            default:
                return null;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS115S1100000_1(java.util.Map r3, int r4) {
        /*
            r2 = this;
            r2.$t = r4
            switch(r4) {
                case 15: goto L11;
                case 16: goto L11;
                case 26: goto L1a;
                case 27: goto L1a;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l1 = r3
            java.lang.String r0 = "sku"
            r1.s0 = r0
            r0 = 1
        Ld:
            r1.<init>(r0)
            return
        L11:
            r1 = r2
            r1.l1 = r3
            java.lang.String r0 = "review_entrance"
            r1.s0 = r0
            r0 = 1
            goto Ld
        L1a:
            r1 = r2
            java.lang.String r0 = "bottom_voucher_remind"
            r1.s0 = r0
            r1.l1 = r3
            r0 = 1
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS115S1100000_1.<init>(java.util.Map, int):void");
    }

    public static final Object invoke$0(AwS115S1100000_1 awS115S1100000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        ((USLogisticDiscriptionVH) awS115S1100000_1.l1).getClass();
        laneParams.putAll(C03FA.LIZIZ);
        laneParams.plusAssign("page_name", "logistics");
        laneParams.plusAssign("subpage_name", "choose_your_location");
        laneParams.plusAssign("button_name", awS115S1100000_1.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS115S1100000_1 awS115S1100000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        ((USLogisticDiscriptionVH) awS115S1100000_1.l1).getClass();
        laneParams.putAll(C03FA.LIZIZ);
        laneParams.plusAssign("page_name", "logistics");
        laneParams.plusAssign("subpage_name", "choose_your_location");
        laneParams.plusAssign("button_name", awS115S1100000_1.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS115S1100000_1 awS115S1100000_1, Object obj) {
        ((Function0) awS115S1100000_1.l1).invoke();
        C03O0 c03o0 = C03O0.LIZ;
        String str = awS115S1100000_1.s0;
        c03o0.getClass();
        C03O0.LJJIFFI(str, "change_payment_method");
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS115S1100000_1 awS115S1100000_1, Object obj) {
        return C890803dy.LIZ((C890803dy) obj, null, null, null, false, null, null, null, null, null, null, null, false, null, null, EnumC880203cG.SYSTEM_ERROR, awS115S1100000_1.s0, new C948003nC(((C899903fR) awS115S1100000_1.l1).LJJIIJZLJL), null, null, null, null, 3960831);
    }

    public static final Object invoke$12(AwS115S1100000_1 awS115S1100000_1, Object obj) {
        HashMap map = (HashMap) obj;
        map.put("customize_bundle_sku_list", ((ComboSubSkuExpression) awS115S1100000_1.l1).comboSkuInfos);
        map.put("customize_bundle_panel_title", ((ComboSubSkuExpression) awS115S1100000_1.l1).comboPanelTitle);
        map.put("customize_bundle_btm_token", awS115S1100000_1.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS115S1100000_1 awS115S1100000_1, Object obj) {
        C1748780vbo.LIZIZ((C1748770vbn) obj, "lib_track_builtin_lane_business", new AwS115S1100000_1((ComboSubSkuExpression) awS115S1100000_1.l1, awS115S1100000_1.s0, 12));
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS115S1100000_1 awS115S1100000_1, Object obj) {
        Type type;
        C03JV c03jv = (C03JV) obj;
        if (c03jv.c != null) {
            String str = awS115S1100000_1.s0;
            boolean z = true;
            try {
                Gson gsonLJFF = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                    type = C2371409Qy.LIZJ(C13LE.LJII(DeliveryPanelStarter.PackedDeliverySelectResult.class));
                } else {
                    type = new TypeToken<DeliveryPanelStarter.PackedDeliverySelectResult>() { // from class: X.037G
                    }.getType();
                }
                Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, str, type);
                if (!(objFromJson instanceof DeliveryPanelStarter.PackedDeliverySelectResult)) {
                    objFromJson = null;
                }
                DeliveryPanelStarter.PackedDeliverySelectResult packedDeliverySelectResult = (DeliveryPanelStarter.PackedDeliverySelectResult) objFromJson;
                if (packedDeliverySelectResult != null) {
                    OrderSubmitAssemViewModel orderSubmitAssemViewModel = (OrderSubmitAssemViewModel) awS115S1100000_1.l1;
                    C03O0.LIZ.getClass();
                    C03O0.LJZ();
                    orderSubmitAssemViewModel.FT2(c03jv.c.LLJJ, packedDeliverySelectResult);
                    LogisticDTO logisticDTO = packedDeliverySelectResult.selectedLogistic;
                    if (logisticDTO != null) {
                        C723002s0 c723002s0 = c03jv.c;
                        List<C719102rN> list = c723002s0.LLJ;
                        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                        Iterator<C719102rN> it2 = list.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(it2.next().LLILZLL);
                        }
                        List<OrderShopDigest> list2 = orderSubmitAssemViewModel.LLILZIL;
                        if (list2 != null) {
                            ArrayList arrayList2 = new ArrayList();
                            for (OrderShopDigest orderShopDigest : list2) {
                                if (Intrinsics.LJFF(orderShopDigest.sellerId, c723002s0.LL)) {
                                    arrayList2.add(orderShopDigest);
                                }
                            }
                            Iterator it3 = arrayList2.iterator();
                            boolean z2 = false;
                            while (it3.hasNext()) {
                                List<OrderSKUDTO> list3 = ((OrderShopDigest) it3.next()).orderSKUs;
                                if (list3 != null) {
                                    for (OrderSKUDTO orderSKUDTO : list3) {
                                        if (arrayList.contains(orderSKUDTO.skuId) && !Intrinsics.LJFF(orderSKUDTO.logisticsServiceId, logisticDTO.logisticsServiceId)) {
                                            orderSKUDTO.logisticsServiceId = logisticDTO.logisticsServiceId;
                                            z2 = true;
                                        }
                                    }
                                }
                            }
                            if (z2) {
                                orderSubmitAssemViewModel.LLLIIIL = true;
                                ((ArrayList) orderSubmitAssemViewModel.LLLIIL).add("change_logistic");
                                OrderSubmitAssemViewModel.OS2(orderSubmitAssemViewModel, false, false, null, false, false, false, null, null, false, null, null, new ChangeInfo(C03DI.LOGISTICS.getValue(), null, null, null), null, null, null, null, null, null, null, null, null, 8380413);
                            }
                        }
                    } else {
                        z = false;
                    }
                    if (Intrinsics.LJFF(packedDeliverySelectResult.isChangePudo, Boolean.TRUE)) {
                        OrderSubmitAssemViewModel.OS2(orderSubmitAssemViewModel, false, false, null, false, false, false, null, null, false, null, null, new ChangeInfo(C03DI.LOGISTICS.getValue(), null, null, null), null, null, null, null, null, null, null, null, null, 8380413);
                    }
                    if (!z && Intrinsics.LJFF(packedDeliverySelectResult.hasUpdateMapLocation, Boolean.TRUE)) {
                        OrderSubmitAssemViewModel.OS2(orderSubmitAssemViewModel, false, false, null, false, true, false, null, null, false, null, null, new ChangeInfo(C03DI.UPDATE_MAP_LOCATION.getValue(), null, null, null), null, null, null, null, null, null, null, null, null, 8380381);
                    }
                }
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C03O0.LJJJJZI(C03O0.LIZ, "logistics", null, 6);
            ((ArrayList) ((OrderSubmitAssemViewModel) awS115S1100000_1.l1).LLLIIL).add("click_logistic_panel");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS115S1100000_1 awS115S1100000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        Map<String, ? extends Object> map = (Map) awS115S1100000_1.l1;
        if (map != null) {
            laneParams.withNotCheckParams(map);
        }
        laneParams.plusAssign("module_name", "aggregated_fit_insight");
        laneParams.plusAssign("module_zone", awS115S1100000_1.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS115S1100000_1 awS115S1100000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        Map<String, ? extends Object> map = (Map) awS115S1100000_1.l1;
        if (map != null) {
            laneParams.withNotCheckParams(map);
        }
        laneParams.plusAssign("module_name", "aggregated_fit_insight");
        laneParams.plusAssign("module_zone", awS115S1100000_1.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS115S1100000_1 awS115S1100000_1, Object obj) {
        SkuState skuState = (SkuState) obj;
        return skuState.copy(skuState.checkedSkuArray, new C047F(awS115S1100000_1.s0, (Integer) awS115S1100000_1.l1), skuState.currentImage, skuState.buyButton, skuState.buyButtonInterestId, skuState.buttonDynamicData, skuState.preOrderInfo, skuState.currentPriceData, skuState.hidePriceTip, skuState.purchaseNotice, skuState.promotionDealVO, skuState.specifications, skuState.currentQuantityLimit, skuState.currentQuantity, skuState.currentImagePosition, skuState.currentInstallmentPlan, skuState.keyBoardVisibility, skuState.skuFragmentClosed, skuState.skuDataState, skuState.addToCartButton, skuState.paymentModule, skuState.showLoadingView, skuState.skuStockInfo, skuState.forceRefresh, skuState.originalProductPackStruct, skuState.localSizeSalePropList, skuState.isQuantityEditable, skuState.slideToBnpl, skuState.exceptionUX, skuState.counterDescription, skuState.topOutsideWidgetVisibleHeight, skuState.cutPriceSkuPanel, skuState.skuPanelWaistBanner, skuState.skuPanelSellingPoints, skuState.skuHeaderTopLabels);
    }

    public static final Object invoke$18(AwS115S1100000_1 awS115S1100000_1, Object obj) {
        ((SeaSkuPanelHeaderWidget) awS115S1100000_1.l1).LJIIJJI(((SkuState) obj).getCurrentPriceData(), awS115S1100000_1.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS115S1100000_1 awS115S1100000_1, Object obj) {
        com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuState skuState = (com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuState) obj;
        return skuState.copy(skuState.checkedSkuArray, skuState.showToast, skuState.currentImage, skuState.preOrderInfo, skuState.currentPrice, skuState.currentPriceV2, skuState.quantityNoticeInfos, skuState.promotionView, skuState.originalPrice, skuState.priceAfterCoupon, skuState.discountText, skuState.taxDescription, skuState.depositFeeDesc, skuState.unitPriceDescription, skuState.currentQuantityLimit, skuState.currentQuantity, skuState.contentList, skuState.keyBoardVisibility, skuState.skuPanelCloseEvent, skuState.skuDataState, skuState.addToCartButton, skuState.showLoadingView, skuState.showLoadingSpinner, skuState.skuStockInfo, skuState.forceRefresh, skuState.originalProductPackStruct, skuState.protectionProgramText, skuState.productTitle, skuState.promotionLabelVO, skuState.productSellerInfo, skuState.skuPanelReminder, skuState.isPriceHidden, skuState.isQuantityEditable, skuState.scrollOffset, skuState.scrollOrientation, skuState.bottomAreaElem, skuState.bizEnvChange, new C047L(awS115S1100000_1.s0, ((C043B) awS115S1100000_1.l1).Bn()), skuState.allSkuSelected, skuState.totalPrice, skuState.couponEvent, skuState.carouselImages, skuState.carouselNeedToScrollToFirst, skuState.counterDisclaimer, skuState.exceptionUX, skuState.selectedPurchaseMethod, skuState.selectedPeriodText, skuState.pricePrefix, skuState.extraInfoData, skuState.paymentInfo, skuState.summaryInfo, skuState.refreshFlag, skuState.hidePaymentMethodView, skuState.promotionWaist);
    }

    public static final Object invoke$2(AwS115S1100000_1 awS115S1100000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(((Announcement) awS115S1100000_1.l1).daInfo);
        if (mapLJIIJ != null) {
            laneParams.putAll(mapLJIIJ);
        }
        laneParams.plusAssign("button_type", awS115S1100000_1.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$20(AwS115S1100000_1 awS115S1100000_1, Object obj) {
        SkuPanelState skuPanelStateDw = ((C043B) awS115S1100000_1.l1).dw();
        if (skuPanelStateDw != null) {
            skuPanelStateDw.periodText = awS115S1100000_1.s0;
        }
        ((C043B) awS115S1100000_1.l1).LJJJZ(new AwS52S1000000_1(awS115S1100000_1.s0, 19));
        return Unit.LIZ;
    }

    public static final Object invoke$21(AwS115S1100000_1 awS115S1100000_1, Object obj) {
        com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuState skuState = (com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuState) obj;
        return skuState.copy(skuState.checkedSkuArray, new C047F(awS115S1100000_1.s0, (Integer) awS115S1100000_1.l1), skuState.currentImage, skuState.preOrderInfo, skuState.currentPrice, skuState.currentPriceV2, skuState.quantityNoticeInfos, skuState.promotionView, skuState.originalPrice, skuState.priceAfterCoupon, skuState.discountText, skuState.taxDescription, skuState.depositFeeDesc, skuState.unitPriceDescription, skuState.currentQuantityLimit, skuState.currentQuantity, skuState.contentList, skuState.keyBoardVisibility, skuState.skuPanelCloseEvent, skuState.skuDataState, skuState.addToCartButton, skuState.showLoadingView, skuState.showLoadingSpinner, skuState.skuStockInfo, skuState.forceRefresh, skuState.originalProductPackStruct, skuState.protectionProgramText, skuState.productTitle, skuState.promotionLabelVO, skuState.productSellerInfo, skuState.skuPanelReminder, skuState.isPriceHidden, skuState.isQuantityEditable, skuState.scrollOffset, skuState.scrollOrientation, skuState.bottomAreaElem, skuState.bizEnvChange, skuState.focusSpecAction, skuState.allSkuSelected, skuState.totalPrice, skuState.couponEvent, skuState.carouselImages, skuState.carouselNeedToScrollToFirst, skuState.counterDisclaimer, skuState.exceptionUX, skuState.selectedPurchaseMethod, skuState.selectedPeriodText, skuState.pricePrefix, skuState.extraInfoData, skuState.paymentInfo, skuState.summaryInfo, skuState.refreshFlag, skuState.hidePaymentMethodView, skuState.promotionWaist);
    }

    public static final Object invoke$22(AwS115S1100000_1 awS115S1100000_1, Object obj) {
        QuantityControlInfo quantityControlInfo;
        String str;
        HashMap<String, Object> mapLJIIJ;
        String str2;
        HashMap map = (HashMap) obj;
        map.put("method", awS115S1100000_1.s0);
        map.put("quantity_limit", Integer.valueOf(((C939703lr) awS115S1100000_1.l1).LLILZLL.LIZIZ));
        map.put("sku_id", ((C939703lr) awS115S1100000_1.l1).LLIZ);
        C719102rN c719102rN = ((C939703lr) awS115S1100000_1.l1).LLJJI;
        if (c719102rN != null && (str2 = c719102rN.LLLLIL) != null) {
            map.put("product_id", str2);
        }
        C719102rN c719102rN2 = ((C939703lr) awS115S1100000_1.l1).LLJJI;
        if (c719102rN2 != null && (quantityControlInfo = c719102rN2.LLLF) != null && (str = quantityControlInfo.hitMaxDaInfo) != null && (mapLJIIJ = C1741890vQh.LJIIJ(str)) != null) {
            map.putAll(mapLJIIJ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$23(AwS115S1100000_1 awS115S1100000_1, Object obj) {
        QuantityControlInfo quantityControlInfo;
        String str;
        HashMap<String, Object> mapLJIIJ;
        String str2;
        HashMap map = (HashMap) obj;
        map.put("quantity_limit", Integer.valueOf(((C939703lr) awS115S1100000_1.l1).LLILZLL.LIZ));
        map.put("sku_id", ((C939703lr) awS115S1100000_1.l1).LLIZ);
        C719102rN c719102rN = ((C939703lr) awS115S1100000_1.l1).LLJJI;
        if (c719102rN != null && (str2 = c719102rN.LLLLIL) != null) {
            map.put("product_id", str2);
        }
        map.put("method", awS115S1100000_1.s0);
        C719102rN c719102rN2 = ((C939703lr) awS115S1100000_1.l1).LLJJI;
        if (c719102rN2 != null && (quantityControlInfo = c719102rN2.LLLF) != null && (str = quantityControlInfo.hitMinDaInfo) != null && (mapLJIIJ = C1741890vQh.LJIIJ(str)) != null) {
            map.putAll(mapLJIIJ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$24(AwS115S1100000_1 awS115S1100000_1, Object obj) {
        QuantityControlInfo quantityControlInfo;
        String str;
        HashMap<String, Object> mapLJIIJ;
        String str2;
        HashMap map = (HashMap) obj;
        ((C939603lq) awS115S1100000_1.l1).getClass();
        map.put("toast_name", "select_upto_x");
        map.put("method", awS115S1100000_1.s0);
        map.put("quantity_limit", Integer.valueOf(((C939603lq) awS115S1100000_1.l1).LLIZ.LIZIZ));
        map.put("sku_id", ((C939603lq) awS115S1100000_1.l1).LLIZLLLIL);
        C719102rN c719102rN = ((C939603lq) awS115S1100000_1.l1).LLJJIII;
        if (c719102rN != null && (str2 = c719102rN.LLLLIL) != null) {
            map.put("product_id", str2);
        }
        C719102rN c719102rN2 = ((C939603lq) awS115S1100000_1.l1).LLJJIII;
        if (c719102rN2 != null && (quantityControlInfo = c719102rN2.LLLF) != null && (str = quantityControlInfo.hitMaxDaInfo) != null && (mapLJIIJ = C1741890vQh.LJIIJ(str)) != null) {
            map.putAll(mapLJIIJ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$25(AwS115S1100000_1 awS115S1100000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(((Announcement) awS115S1100000_1.l1).daInfo);
        if (mapLJIIJ != null) {
            laneParams.putAll(mapLJIIJ);
        }
        laneParams.plusAssign("button_type", awS115S1100000_1.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$26(AwS115S1100000_1 awS115S1100000_1, Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        HashMap map = (HashMap) obj;
        map.put("module_name", awS115S1100000_1.s0);
        Map map2 = (Map) awS115S1100000_1.l1;
        Object obj5 = null;
        if (map2 != null) {
            obj2 = map2.get("coupon_id");
        } else {
            obj2 = null;
        }
        map.put("coupon_id", obj2);
        Map map3 = (Map) awS115S1100000_1.l1;
        if (map3 != null) {
            obj3 = map3.get("coupon_type_id");
        } else {
            obj3 = null;
        }
        map.put("coupon_type_id", obj3);
        Map map4 = (Map) awS115S1100000_1.l1;
        if (map4 != null) {
            obj4 = map4.get("instance_key");
        } else {
            obj4 = null;
        }
        map.put("instance_key", obj4);
        Map map5 = (Map) awS115S1100000_1.l1;
        if (map5 != null) {
            obj5 = map5.get("coupon_type_info");
        }
        map.put("coupon_type_info", obj5);
        return Unit.LIZ;
    }

    public static final Object invoke$27(AwS115S1100000_1 awS115S1100000_1, Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        HashMap map = (HashMap) obj;
        map.put("module_name", awS115S1100000_1.s0);
        Map map2 = (Map) awS115S1100000_1.l1;
        Object obj5 = null;
        if (map2 != null) {
            obj2 = map2.get("coupon_id");
        } else {
            obj2 = null;
        }
        map.put("coupon_id", obj2);
        Map map3 = (Map) awS115S1100000_1.l1;
        if (map3 != null) {
            obj3 = map3.get("coupon_type_id");
        } else {
            obj3 = null;
        }
        map.put("coupon_type_id", obj3);
        Map map4 = (Map) awS115S1100000_1.l1;
        if (map4 != null) {
            obj4 = map4.get("instance_key");
        } else {
            obj4 = null;
        }
        map.put("instance_key", obj4);
        Map map5 = (Map) awS115S1100000_1.l1;
        if (map5 != null) {
            obj5 = map5.get("coupon_type_info");
        }
        map.put("coupon_type_info", obj5);
        return Unit.LIZ;
    }

    public static final Object invoke$28(AwS115S1100000_1 awS115S1100000_1, Object obj) {
        return C1756010vnT.LIZ((C1756010vnT) obj, null, null, null, null, new C047F(awS115S1100000_1.s0, (Integer) awS115S1100000_1.l1), 95);
    }

    public static final Object invoke$29(AwS115S1100000_1 awS115S1100000_1, Object obj) {
        String str;
        String str2;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("module_name", "sku");
        if (Intrinsics.LJFF(((SaleProp) awS115S1100000_1.l1).hasImage, Boolean.TRUE)) {
            str = "sku_image";
        } else {
            str = "sku_text";
        }
        laneParams.plusAssign("module_show_type", str);
        List<SalePropValue> list = ((SaleProp) awS115S1100000_1.l1).salePropValueList;
        if (list != null && list.size() == 1) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        laneParams.plusAssign("is_single_sku", str2);
        laneParams.plusAssign("rd_pdp_monitor_version", "v4190");
        laneParams.plusAssign("checkout_type", "normal_checkout");
        laneParams.plusAssign("sku_id", awS115S1100000_1.s0);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AwS115S1100000_1 awS115S1100000_1, Object obj) {
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(awS115S1100000_1.s0);
        C1331750klB c1331750klB = new C1331750klB();
        c1331750klB.LIZ = true;
        c1331670kl3LJIIIZ.LJJI = c1331750klB.LIZ();
        c1331670kl3LJIIIZ.LJIJJLI(R.drawable.c5w);
        c1331670kl3LJIIIZ.LJJ((SmartImageView) awS115S1100000_1.l1);
        C786410Ut5.h3(c1331670kl3LJIIIZ);
        SmartImageView smartImageView = (SmartImageView) awS115S1100000_1.l1;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
        layoutParams.gravity = 17;
        ((ViewGroup) obj).addView(smartImageView, layoutParams);
        return Unit.LIZ;
    }

    public static final Object invoke$30(AwS115S1100000_1 awS115S1100000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.put("page_name", awS115S1100000_1.s0);
        laneParams.put("click_type", "popup_click");
        laneParams.withParamsGroup((Map) awS115S1100000_1.l1);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    public static final Object invoke$31(AwS115S1100000_1 awS115S1100000_1, Object obj) {
        LogisticDTO logisticDTO;
        DeliveryPanelStarter.EnterParamForOrderSubmitPage enterParamForOrderSubmitPage;
        List<SelectionBar> list;
        SelectionBar next;
        LogisticArea logisticArea;
        List<LogisticExpressionArea> list2;
        LogisticExpressionArea logisticExpressionArea;
        T next2;
        String str;
        DeliveryPanelState deliveryPanelState = (DeliveryPanelState) obj;
        Parcelable parcelable = ((DeliveryPanelViewModel) awS115S1100000_1.l1).LLILZLL;
        if ((parcelable instanceof DeliveryPanelStarter.EnterParamForOrderSubmitPage) && (enterParamForOrderSubmitPage = (DeliveryPanelStarter.EnterParamForOrderSubmitPage) parcelable) != null) {
            C259800zU c259800zU = new C259800zU();
            LogisticPanelModule logisticPanelModule = enterParamForOrderSubmitPage.logisticsPanelModule;
            if (logisticPanelModule != null && (list = logisticPanelModule.selectionBar) != null) {
                Iterator<SelectionBar> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        Integer num = next.selectionType;
                        int value = EnumC804103Cd.PICKUP.getValue();
                        if (num != null && num.intValue() == value) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                SelectionBar selectionBar = next;
                if (selectionBar != null && (logisticArea = selectionBar.logisticArea) != null && (list2 = logisticArea.logisticExpressionAreas) != null && (logisticExpressionArea = (LogisticExpressionArea) C13LP.LJJJLL(list2)) != null) {
                    Iterator<LogisticDTO> it3 = enterParamForOrderSubmitPage.logisticList.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next2 = it3.next();
                            String str2 = ((LogisticDTO) next2).logisticsServiceId;
                            LogisticsExpressionAreaExtraInfo logisticsExpressionAreaExtraInfo = logisticExpressionArea.extraInfo;
                            if (logisticsExpressionAreaExtraInfo != null) {
                                str = logisticsExpressionAreaExtraInfo.logisticsServiceId;
                            } else {
                                str = null;
                            }
                            if (Intrinsics.LJFF(str2, str)) {
                                break;
                            }
                        } else {
                            next2 = 0;
                            break;
                        }
                    }
                    c259800zU.element = next2;
                }
            }
            logisticDTO = (LogisticDTO) c259800zU.element;
        } else {
            logisticDTO = null;
        }
        return deliveryPanelState.copy(deliveryPanelState.changePage, true, deliveryPanelState.selectedLogistic, deliveryPanelState.selectedShipToInfo, deliveryPanelState.addressRenderData, deliveryPanelState.status, deliveryPanelState.logisticList, deliveryPanelState.claimVoucherExceptionUX, deliveryPanelState.exposedItems, deliveryPanelState.exposedAddOnItems, deliveryPanelState.dispatchInfo, deliveryPanelState.shippingToAddressInfo, deliveryPanelState.logistics, deliveryPanelState.pdpLogisticModule, deliveryPanelState.privacyPolicyStatement, deliveryPanelState.shippingPolicyModule, deliveryPanelState.hasMapLocationChanged, deliveryPanelState.tab, deliveryPanelState.pickupSelectAddress, deliveryPanelState.pickUpList, deliveryPanelState.pickupSelectIdx, deliveryPanelState.savePickUpStatus, deliveryPanelState.savePickUpToast, deliveryPanelState.getPudoAddressStatus, logisticDTO, deliveryPanelState.centerAddress, awS115S1100000_1.s0, deliveryPanelState.changeAddressJumpSchema);
    }

    public static final Object invoke$32(AwS115S1100000_1 awS115S1100000_1, Object obj) {
        PaymentMethod paymentMethod;
        C03JV c03jv = (C03JV) obj;
        OrderSubmitAssemViewModel orderSubmitAssemViewModel = (OrderSubmitAssemViewModel) awS115S1100000_1.l1;
        BillInfoData billInfoData = orderSubmitAssemViewModel.LLJJI;
        boolean z = c03jv.LLILZ;
        PaymentInfo paymentInfo = orderSubmitAssemViewModel.LLJJJ;
        if (paymentInfo != null) {
            paymentMethod = paymentInfo.paymentMethod;
        } else {
            paymentMethod = null;
        }
        return C03JV.LIZ(c03jv, 0, OrderSubmitAssemViewModel.nR2(orderSubmitAssemViewModel, billInfoData, z, paymentMethod, orderSubmitAssemViewModel.LLJL, true, false, false, awS115S1100000_1.s0, null, 864), null, false, null, false, null, null, null, null, null, null, null, null, 0, null, null, 0, null, null, false, 0L, false, false, null, null, false, null, null, null, null, null, false, null, null, false, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, false, 0, false, null, null, false, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, false, null, null, null, null, null, null, null, -3, -1, -1, 1048575);
    }

    public static final Object invoke$33(AwS115S1100000_1 awS115S1100000_1, Object obj) {
        int i;
        ProductDetailReview productDetailReview;
        Integer num;
        ProductDetailReview productDetailReview2;
        Object obj2;
        ProductDetailReview productDetailReview3;
        ProductDetailReview productDetailReview4;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("module_name", "size_fitness");
        ProductPackStruct productPackStruct = ((C1054104Ah) awS115S1100000_1.l1).LJIIL;
        Float f = null;
        if (productPackStruct != null && (productDetailReview4 = productPackStruct.review) != null) {
            f = productDetailReview4.rating;
        }
        int iIntValue = 0;
        if (f == null) {
            i = 0;
        } else {
            i = 1;
        }
        laneParams.plusAssign("has_rate", Integer.valueOf(i));
        ProductPackStruct productPackStruct2 = ((C1054104Ah) awS115S1100000_1.l1).LJIIL;
        if (productPackStruct2 != null && (productDetailReview2 = productPackStruct2.review) != null && productDetailReview2.rating != null) {
            if (productPackStruct2 == null || (productDetailReview3 = productPackStruct2.review) == null || (obj2 = productDetailReview3.rating) == null) {
                obj2 = 0;
            }
            laneParams.plusAssign("rate", obj2);
        }
        ProductPackStruct productPackStruct3 = ((C1054104Ah) awS115S1100000_1.l1).LJIIL;
        if (productPackStruct3 != null && (productDetailReview = productPackStruct3.review) != null && (num = productDetailReview.reviewCount) != null) {
            iIntValue = num.intValue();
        }
        laneParams.plusAssign("review_cnt", Integer.valueOf(iIntValue));
        laneParams.plusAssign("fitness_info", awS115S1100000_1.s0);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$34(AwS115S1100000_1 awS115S1100000_1, Object obj) {
        HashMap map = (HashMap) obj;
        map.putAll(((C04GD) ((SeaPdpPromotionEntranceInfoViewHolder) awS115S1100000_1.l1).LLILLJJLI).LIZLLL);
        map.put("module_name", awS115S1100000_1.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$35(AwS115S1100000_1 awS115S1100000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("entrance_type", "sales_seller_detail");
        String str = awS115S1100000_1.s0;
        if (str == null) {
            str = "";
        }
        laneParams.plusAssign("shop_id", str);
        Map<String, ? extends Object> map = (Map) awS115S1100000_1.l1;
        if (map != null) {
            laneParams.withParamsGroup(map);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$36(AwS115S1100000_1 awS115S1100000_1, Object obj) {
        CCDCAddCardHalfFragment cCDCAddCardHalfFragment = (CCDCAddCardHalfFragment) awS115S1100000_1.l1;
        ((C062P) obj).LIZ = new C888303dZ(cCDCAddCardHalfFragment.LLJJIJIIJIL, cCDCAddCardHalfFragment.LLJJIJIL, cCDCAddCardHalfFragment.LLJJJJ, cCDCAddCardHalfFragment.LLJJJ, awS115S1100000_1.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$37(AwS115S1100000_1 awS115S1100000_1, Object obj) {
        Assembler assembler = (Assembler) obj;
        CCDCAddCardHalfFragment cCDCAddCardHalfFragment = (CCDCAddCardHalfFragment) awS115S1100000_1.l1;
        assembler.DQ2(cCDCAddCardHalfFragment, new AwS115S1100000_1(cCDCAddCardHalfFragment, awS115S1100000_1.s0, 36));
        assembler.QQ2((CCDCAddCardHalfFragment) awS115S1100000_1.l1, AFwS229S0000000_2.get$arr$(723));
        return Unit.LIZ;
    }

    public static final Object invoke$38(AwS115S1100000_1 awS115S1100000_1, Object obj) {
        List arrayList;
        List<PaymentMethod> list;
        C926703jl c926703jl = (C926703jl) obj;
        if (awS115S1100000_1.s0.length() == 0) {
            PaymentMethod paymentMethod = c926703jl.LLILLJJLI;
            if (paymentMethod != null) {
                list = paymentMethod.subPaymentMethods;
            } else {
                list = null;
            }
            ((SubPaymentListViewModel) awS115S1100000_1.l1).setState(new AwS580S0100000_1(list, (List<InterfaceC746802vq>) 616));
        } else {
            List<PaymentMethod> list2 = c926703jl.LLILLL;
            if (list2 != null) {
                String str = awS115S1100000_1.s0;
                ArrayList arrayList2 = new ArrayList();
                for (PaymentMethod paymentMethod2 : list2) {
                    String str2 = paymentMethod2.displayName;
                    if (str2 != null && a0.LJJIIZI(str2, str, true)) {
                        arrayList2.add(paymentMethod2);
                    }
                }
                arrayList = new ArrayList(arrayList2);
            } else {
                arrayList = C13BV.INSTANCE;
            }
            ((SubPaymentListViewModel) awS115S1100000_1.l1).setState(new AwS580S0100000_1(arrayList, (List<InterfaceC746802vq>) 617));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.09AY, kotlin.jvm.functions.Function0] */
    public static final Object invoke$39(AwS115S1100000_1 awS115S1100000_1, Object obj) {
        AddCCICardFragment addCCICardFragment = (AddCCICardFragment) awS115S1100000_1.l1;
        PaymentMethod paymentMethod = addCCICardFragment.LLJ;
        EnterParams enterParams = addCCICardFragment.LLJI;
        ?? r4 = addCCICardFragment.LLJILJILJ;
        String str = addCCICardFragment.LLJIJIL;
        String str2 = awS115S1100000_1.s0;
        ((C062P) obj).LIZ = new C888203dY(paymentMethod, enterParams, r4, str, str2, addCCICardFragment.LLJILLL, str2);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS115S1100000_1 awS115S1100000_1, Object obj) {
        HashMap map = (HashMap) obj;
        map.putAll((HashMap) awS115S1100000_1.l1);
        map.put("is_success", 0);
        String str = awS115S1100000_1.s0;
        if (str != null) {
            map.put("fail_reason", str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$40(AwS115S1100000_1 awS115S1100000_1, Object obj) {
        Assembler assembler = (Assembler) obj;
        AddCCICardFragment addCCICardFragment = (AddCCICardFragment) awS115S1100000_1.l1;
        assembler.DQ2(addCCICardFragment, new AwS115S1100000_1(addCCICardFragment, awS115S1100000_1.s0, 39));
        assembler.QQ2((AddCCICardFragment) awS115S1100000_1.l1, AFwS229S0000000_2.get$arr$(740));
        return Unit.LIZ;
    }

    public static final Object invoke$41(AwS115S1100000_1 awS115S1100000_1, Object obj) {
        ((C1397620mTQ) obj).LIZJ(0, awS115S1100000_1.s0, new AwS580S0100000_1((C19EG) awS115S1100000_1.l1, 775));
        return Unit.LIZ;
    }

    public static final Object invoke$42(AwS115S1100000_1 awS115S1100000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        Map<String, ? extends Object> map = (Map) awS115S1100000_1.l1;
        if (map != null) {
            laneParams.withNotCheckParams(map);
        }
        laneParams.plusAssign("module_name", "aggregated_fit_insight");
        laneParams.plusAssign("module_zone", awS115S1100000_1.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$43(AwS115S1100000_1 awS115S1100000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        Map<String, ? extends Object> map = (Map) awS115S1100000_1.l1;
        if (map != null) {
            laneParams.withNotCheckParams(map);
        }
        laneParams.plusAssign("module_name", "aggregated_fit_insight");
        laneParams.plusAssign("module_zone", awS115S1100000_1.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$44(AwS115S1100000_1 awS115S1100000_1, Object obj) {
        int size;
        List<ExposeUserRight> list;
        HashMap map = (HashMap) obj;
        map.put("module_name", "user_trust");
        map.put("is_clickable", "1");
        map.put("click_area", awS115S1100000_1.s0);
        String rightContent$ecommerce_transaction_release = ((AbstractC7925037r) awS115S1100000_1.l1).getRightContent$ecommerce_transaction_release();
        int i = 0;
        if (rightContent$ecommerce_transaction_release != null) {
            AbstractC7925037r abstractC7925037r = (AbstractC7925037r) awS115S1100000_1.l1;
            map.put("rights_content", rightContent$ecommerce_transaction_release);
            ExposeUserRightPanel exposeUserRightPanel = abstractC7925037r.LL;
            if (exposeUserRightPanel != null && (list = exposeUserRightPanel.exposeUserRights) != null) {
                size = list.size();
            } else {
                size = 0;
            }
            map.put("rights_cnt", Integer.valueOf(size));
        }
        ExposeUserRightPanel exposeUserRightPanel2 = ((AbstractC7925037r) awS115S1100000_1.l1).LL;
        if (exposeUserRightPanel2 != null && exposeUserRightPanel2.icon != null) {
            i = 1;
        }
        map.put("is_plus_effective", Integer.valueOf(i));
        map.put("module_type", "tiktok_shop_protections");
        return Unit.LIZ;
    }

    public static final Object invoke$45(AwS115S1100000_1 awS115S1100000_1, Object obj) {
        Object obj2;
        LaneParams laneParams = (LaneParams) obj;
        HashMap map = (HashMap) awS115S1100000_1.l1;
        Object obj3 = null;
        if (map != null) {
            obj2 = map.get("entrance_info");
        } else {
            obj2 = null;
        }
        laneParams.plusAssign("entrance_info", obj2);
        laneParams.plusAssign("page_name", "shipping_address");
        HashMap map2 = (HashMap) awS115S1100000_1.l1;
        if (map2 != null) {
            obj3 = map2.get("previous_page");
        }
        laneParams.plusAssign("previous_page", obj3);
        laneParams.plusAssign("popup_name", "address_text_paste_remind");
        laneParams.plusAssign("action_type", awS115S1100000_1.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$46(AwS115S1100000_1 awS115S1100000_1, Object obj) {
        C1755410vmV c1755410vmV;
        Object objLLLIIIIL = ((C1755420vmW) awS115S1100000_1.l1).LLLIIIIL(((Number) obj).intValue(), false);
        String str = null;
        if ((objLLLIIIIL instanceof C1755410vmV) && (c1755410vmV = (C1755410vmV) objLLLIIIIL) != null) {
            str = c1755410vmV.LLILLL;
        }
        return Boolean.valueOf(Intrinsics.LJFF(str, awS115S1100000_1.s0));
    }

    public static final Object invoke$47(AwS115S1100000_1 awS115S1100000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("previous_page", "order_submit");
        laneParams.plusAssign("button_name", awS115S1100000_1.s0);
        laneParams.plusAssign("is_next_day_delivery", ((LogisticDTO) awS115S1100000_1.l1).LIZ());
        return Unit.LIZ;
    }

    public static final Object invoke$48(AwS115S1100000_1 awS115S1100000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("previous_page", "order_submit");
        laneParams.plusAssign("button_name", awS115S1100000_1.s0);
        laneParams.plusAssign("is_next_day_delivery", ((LogisticDTO) awS115S1100000_1.l1).LIZ());
        return Unit.LIZ;
    }

    public static final Object invoke$49(AwS115S1100000_1 awS115S1100000_1, Object obj) {
        Float fLJIIIIZZ;
        String priceVal;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("actionsheet_name", awS115S1100000_1.s0);
        Price price = ((LogisticDTO) awS115S1100000_1.l1).shippingFee;
        String currency = null;
        if (price != null && (priceVal = price.getPriceVal()) != null) {
            fLJIIIIZZ = C2327809Ae.LJIIIIZZ(priceVal);
        } else {
            fLJIIIIZZ = null;
        }
        laneParams.plusAssign("shipping_price", fLJIIIIZZ);
        Price price2 = ((LogisticDTO) awS115S1100000_1.l1).shippingFee;
        if (price2 != null) {
            currency = price2.getCurrency();
        }
        laneParams.plusAssign("shipping_currency", currency);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS115S1100000_1 awS115S1100000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("repoId", awS115S1100000_1.s0);
        List<Region> combinedArea = ((OrderSubmitEnterParams) awS115S1100000_1.l1).getCombinedArea();
        if (combinedArea != null) {
            laneParams.plusAssign("combinedArea", combinedArea);
        }
        Integer softIntercept = ((OrderSubmitEnterParams) awS115S1100000_1.l1).getSoftIntercept();
        if (softIntercept != null) {
            laneParams.plusAssign("from_soft_intercept", Integer.valueOf(softIntercept.intValue()));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$50(AwS115S1100000_1 awS115S1100000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.withParamsGroup(((C1054004Ag) awS115S1100000_1.l1).LIZIZ);
        laneParams.plusAssign("page_name", awS115S1100000_1.s0);
        ((C1054004Ag) awS115S1100000_1.l1).LJJJI(laneParams);
        return Unit.LIZ;
    }

    public static final Object invoke$51(AwS115S1100000_1 awS115S1100000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.withParamsGroup(((C1054004Ag) awS115S1100000_1.l1).LIZIZ);
        laneParams.plusAssign("toast_name", awS115S1100000_1.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$52(AwS115S1100000_1 awS115S1100000_1, Object obj) {
        HashMap map = (HashMap) obj;
        String str = awS115S1100000_1.s0;
        List list = (List) awS115S1100000_1.l1;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            VoucherInfoNew voucherInfoNew = (VoucherInfoNew) obj2;
            Integer num = voucherInfoNew.costType;
            if (num != null && num.intValue() == 1 && voucherInfoNew.promotionId != null) {
                arrayList.add(obj2);
            }
        }
        map.put(str, arrayList);
        return Unit.LIZ;
    }

    public static final Object invoke$53(AwS115S1100000_1 awS115S1100000_1, Object obj) {
        ((C1397620mTQ) obj).LIZJ(0, awS115S1100000_1.s0, new AwS580S0100000_1((OrderSubmitFragment) awS115S1100000_1.l1, 1011));
        return Unit.LIZ;
    }

    public static final Object invoke$54(AwS115S1100000_1 awS115S1100000_1, Object obj) {
        ((C1397620mTQ) obj).LIZJ(0, awS115S1100000_1.s0, new AwS580S0100000_1((CombinedSkuOrderSubmitFragment) awS115S1100000_1.l1, 1012));
        return Unit.LIZ;
    }

    public static final Object invoke$55(AwS115S1100000_1 awS115S1100000_1, Object obj) {
        ((C1397620mTQ) obj).LIZJ(0, awS115S1100000_1.s0, new AwS580S0100000_1((SeaOneStepOrderSubmitFragment) awS115S1100000_1.l1, 1053));
        return Unit.LIZ;
    }

    public static final Object invoke$56(AwS115S1100000_1 awS115S1100000_1, Object obj) {
        String str;
        int value;
        ArrayList arrayList;
        UserVirtualInfo userVirtualInfo;
        if (((C03JV) obj).LLLZIIL > 0) {
            if (Intrinsics.LJFF(awS115S1100000_1.s0, "sku_non_exist")) {
                str = null;
            } else {
                str = awS115S1100000_1.s0;
            }
            ArrayList arrayList2 = new ArrayList();
            List<OrderShopDigest> list = ((CombinedSkuOrderSubmitFragment) awS115S1100000_1.l1).VR().LLILZIL;
            if (list != null) {
                CombinedSkuOrderSubmitFragment combinedSkuOrderSubmitFragment = (CombinedSkuOrderSubmitFragment) awS115S1100000_1.l1;
                for (OrderShopDigest orderShopDigest : list) {
                    if (orderShopDigest.orderSKUs == null) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList();
                        for (OrderSKUDTO orderSKUDTO : orderShopDigest.orderSKUs) {
                            if (orderSKUDTO.LIZIZ()) {
                                arrayList.add(orderSKUDTO);
                            } else {
                                if (orderSKUDTO.skuId != null && combinedSkuOrderSubmitFragment.VR().h.LIZ.containsKey(orderSKUDTO.skuId)) {
                                    userVirtualInfo = combinedSkuOrderSubmitFragment.VR().h.LIZ.get(orderSKUDTO.skuId);
                                } else {
                                    userVirtualInfo = orderSKUDTO.userVirtualInfo;
                                }
                                arrayList.add(OrderSKUDTO.LIZ(orderSKUDTO, str, 1, null, null, null, null, null, null, null, userVirtualInfo, 100663289));
                            }
                        }
                    }
                    arrayList2.add(orderShopDigest.copy(orderShopDigest.sellerId, arrayList, orderShopDigest.deliveryOption));
                }
            }
            if (awS115S1100000_1.s0 == null) {
                value = C03DI.UNSELECT_SKU.getValue();
            } else if (((CombinedSkuOrderSubmitFragment) awS115S1100000_1.l1).VR().a == null) {
                value = C03DI.SELECT_SKU.getValue();
            } else {
                value = C03DI.CHANGE_SKU.getValue();
            }
            if (Intrinsics.LJFF(awS115S1100000_1.s0, "sku_non_exist")) {
                value = C03DI.SKU_NON_EXIST.getValue();
            }
            OrderSubmitAssemViewModel.OS2(((CombinedSkuOrderSubmitFragment) awS115S1100000_1.l1).VR(), false, false, arrayList2, false, false, false, null, null, false, null, null, new ChangeInfo(value, null, null, null), null, null, null, null, null, null, null, null, null, 8380407);
            ((CombinedSkuOrderSubmitFragment) awS115S1100000_1.l1).VR().a = awS115S1100000_1.s0;
        } else {
            ((CombinedSkuOrderSubmitFragment) awS115S1100000_1.l1).VR().a = awS115S1100000_1.s0;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public static final Object invoke$57(AwS115S1100000_1 awS115S1100000_1, Object obj) {
        String str;
        int value;
        String str2;
        C936503lL c936503lL;
        ArrayList arrayList;
        Integer num;
        if (((C936903lP) obj).LLIZ > 0) {
            if (Intrinsics.LJFF(awS115S1100000_1.s0, "sku_non_exist")) {
                str = null;
            } else {
                str = awS115S1100000_1.s0;
            }
            ArrayList arrayList2 = new ArrayList();
            List<OrderShopDigest> list = ((SeaOneStepOrderSubmitFragment) awS115S1100000_1.l1).bS().LLILZIL;
            ?? r1 = 1;
            r1 = 1;
            if (list != null) {
                for (OrderShopDigest orderShopDigest : list) {
                    if (orderShopDigest.orderSKUs == null) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList();
                        List<OrderSKUDTO> list2 = orderShopDigest.orderSKUs;
                        ArrayList arrayList3 = new ArrayList();
                        for (OrderSKUDTO orderSKUDTO : list2) {
                            SkuCardStyleInfo skuCardStyleInfo = orderSKUDTO.skuCardStyleInfo;
                            if (skuCardStyleInfo == null || (num = skuCardStyleInfo.skuCardStyleType) == null || num.intValue() != r1) {
                                arrayList3.add(orderSKUDTO);
                            }
                        }
                        Iterator it2 = arrayList3.iterator();
                        r1 = r1;
                        while (it2.hasNext()) {
                            arrayList.add(OrderSKUDTO.LIZ((OrderSKUDTO) it2.next(), str, Integer.valueOf(r1 == true ? 1 : 0), null, null, null, null, null, null, null, null, 134217721));
                            r1 = 1;
                        }
                    }
                    arrayList2.add(orderShopDigest.copy(orderShopDigest.sellerId, arrayList, orderShopDigest.deliveryOption));
                    r1 = r1;
                }
            }
            SeaSkuSpecViewModel seaSkuSpecViewModelAS = ((SeaOneStepOrderSubmitFragment) awS115S1100000_1.l1).aS();
            seaSkuSpecViewModelAS.withState(new C937103lR(r1, seaSkuSpecViewModelAS, false, r1));
            if (awS115S1100000_1.s0 == null) {
                value = C03DI.UNSELECT_SKU.getValue();
            } else if (((SeaOneStepOrderSubmitFragment) awS115S1100000_1.l1).bS().a == null) {
                value = C03DI.SELECT_SKU.getValue();
            } else {
                value = C03DI.CHANGE_SKU.getValue();
            }
            if (awS115S1100000_1.s0 == null && (c936503lL = ((SeaOneStepOrderSubmitFragment) awS115S1100000_1.l1).LLJJLIIIJLLLLLLLZ) != null) {
                c936503lL.e0("other");
            }
            if (Intrinsics.LJFF(awS115S1100000_1.s0, "sku_non_exist")) {
                value = C03DI.SKU_NON_EXIST.getValue();
            }
            SeaOneStepOrderSubmitFragment seaOneStepOrderSubmitFragment = (SeaOneStepOrderSubmitFragment) awS115S1100000_1.l1;
            long j = seaOneStepOrderSubmitFragment.LLLFF + 1;
            seaOneStepOrderSubmitFragment.LLLFF = j;
            BillInfoData billInfoData = seaOneStepOrderSubmitFragment.bS().LLJJI;
            if (billInfoData != null) {
                str2 = billInfoData.requestId;
            } else {
                str2 = null;
            }
            SeaOneStepOrderSubmitFragment seaOneStepOrderSubmitFragment2 = (SeaOneStepOrderSubmitFragment) awS115S1100000_1.l1;
            seaOneStepOrderSubmitFragment2.LLLF = r1;
            seaOneStepOrderSubmitFragment2.LLLIIII = seaOneStepOrderSubmitFragment2.bS().getState().LLJJJIL;
            seaOneStepOrderSubmitFragment2.LLLFFI = Long.valueOf(j);
            seaOneStepOrderSubmitFragment2.LLLFZ = str2;
            if (seaOneStepOrderSubmitFragment2.aS().LLJILJIL) {
                seaOneStepOrderSubmitFragment2.aS().EQ2(false);
            }
            seaOneStepOrderSubmitFragment2.VR();
            if (seaOneStepOrderSubmitFragment2.bS().getState().LLILZLL) {
                seaOneStepOrderSubmitFragment2.bS().jT2();
            }
            AssemVMLazy assemVMLazy = seaOneStepOrderSubmitFragment2.LLIZ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SeaOneStepOrderSubmitFragment.LLLILZJ;
            ((OspBottomViewModel) assemVMLazy.getValue()).AQ2(seaOneStepOrderSubmitFragment2.bS());
            C099F c099fOS2 = OrderSubmitAssemViewModel.OS2(((SeaOneStepOrderSubmitFragment) awS115S1100000_1.l1).bS(), false, false, arrayList2, false, false, false, null, null, false, null, null, new ChangeInfo(value, null, null, null), null, null, null, null, null, null, null, null, null, 8380407);
            ((SeaOneStepOrderSubmitFragment) awS115S1100000_1.l1).bS().a = awS115S1100000_1.s0;
            if (c099fOS2 == null) {
                ((SeaOneStepOrderSubmitFragment) awS115S1100000_1.l1).WR();
            }
        } else {
            ((SeaOneStepOrderSubmitFragment) awS115S1100000_1.l1).bS().a = awS115S1100000_1.s0;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$58(AwS115S1100000_1 awS115S1100000_1, Object obj) {
        Object obj2;
        HashMap<String, Object> mapLJIIJ;
        HashMap map = (HashMap) obj;
        map.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        HashMap<String, Object> map2 = ((AgeConfirmCell) awS115S1100000_1.l1).L5().LLLIL;
        Object obj3 = null;
        if (map2 != null) {
            obj2 = map2.get("enter_from_info");
        } else {
            obj2 = null;
        }
        map.put("enter_from_info", obj2);
        HashMap<String, Object> map3 = ((AgeConfirmCell) awS115S1100000_1.l1).L5().LLLIL;
        if (map3 != null) {
            obj3 = map3.get("entrance_info");
        }
        map.put("entrance_info", obj3);
        map.put("page_name", "order_submit");
        map.put("module_name", "age_confirm_module");
        String str = awS115S1100000_1.s0;
        if (str != null && (mapLJIIJ = C1741890vQh.LJIIJ(str)) != null) {
            map.putAll(mapLJIIJ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS115S1100000_1 awS115S1100000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("glide_type", awS115S1100000_1.s0);
        laneParams.plusAssign("module_name", "order");
        laneParams.plusAssign("rank", String.valueOf(((C719302rP) awS115S1100000_1.l1).LLJJLIIIJLLLLLLLZ + 1));
        Map<String, String> map = ((C719302rP) awS115S1100000_1.l1).LLJJIJIL;
        if (map != null) {
            laneParams.putAll(map);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS115S1100000_1 awS115S1100000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("glide_type", awS115S1100000_1.s0);
        laneParams.plusAssign("module_name", "order");
        laneParams.plusAssign("rank", String.valueOf(((C719302rP) awS115S1100000_1.l1).LLJJLIIIJLLLLLLLZ + 1));
        Map<String, String> map = ((C719302rP) awS115S1100000_1.l1).LLJJIJIL;
        if (map != null) {
            laneParams.putAll(map);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS115S1100000_1 awS115S1100000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("button_name", "add_address");
        String str = awS115S1100000_1.s0;
        if (str != null) {
            laneParams.putAll(((InterfaceC975703rf) awS115S1100000_1.l1).gv().LIZ(str));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS115S1100000_1 awS115S1100000_1, Object obj) {
        String strLJIIJ;
        String strLJJIIZ;
        PaymentMethod paymentMethod;
        PaymentMethod paymentMethod2;
        PaymentInfo paymentInfo = ((C03JV) obj).LLIZ;
        Boolean boolValueOf = null;
        if (paymentInfo != null && (paymentMethod2 = paymentInfo.paymentMethod) != null) {
            strLJIIJ = paymentMethod2.LJIIJ();
        } else {
            strLJIIJ = null;
        }
        Boolean boolValueOf2 = Boolean.valueOf(Intrinsics.LJFF(strLJIIJ, ((MiniOspBottomWidget) awS115S1100000_1.l1).kp().LLJLLIL));
        MiniOspBottomWidget miniOspBottomWidget = (MiniOspBottomWidget) awS115S1100000_1.l1;
        C03O1 c03o1 = miniOspBottomWidget.LLJJJJ;
        if (c03o1 != null) {
            String str = awS115S1100000_1.s0;
            HashMap<String, Object> mapHi1 = miniOspBottomWidget.kp().hi1(false);
            Object obj2 = "";
            if (paymentInfo == null || (paymentMethod = paymentInfo.paymentMethod) == null) {
                strLJJIIZ = "";
            } else {
                strLJJIIZ = paymentMethod.LJJIIZ();
            }
            C197039127h c197039127hIp = ((MiniOspBottomWidget) awS115S1100000_1.l1).ip();
            if (c197039127hIp != null) {
                boolValueOf = Boolean.valueOf(c197039127hIp.isEnabled());
            }
            Boolean boolValueOf3 = Boolean.valueOf(((MiniOspBottomWidget) awS115S1100000_1.l1).kp().DQ2());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(c03o1.LIZ);
            linkedHashMap.put("button_name", str);
            linkedHashMap.put("button_type", "place_order");
            if (boolValueOf2 != null) {
                boolValueOf2.booleanValue();
                linkedHashMap.put("is_recommended", C893803eS.LIZ(boolValueOf2.booleanValue()));
            }
            linkedHashMap.putAll(mapHi1);
            Object obj3 = linkedHashMap.get("enter_from");
            if (obj3 != null || (obj3 = linkedHashMap.get("enter_from_info")) != null) {
                obj2 = obj3;
            }
            linkedHashMap.put("enter_from", obj2);
            linkedHashMap.put("payment_method", strLJJIIZ);
            if (boolValueOf != null) {
                linkedHashMap.put("is_clickable", Integer.valueOf(boolValueOf.booleanValue() ? 1 : 0));
            }
            if (boolValueOf3 != null) {
                linkedHashMap.put("is_membership_check_success", Integer.valueOf(boolValueOf3.booleanValue() ? 1 : 0));
            }
            C03O1.LJJIJIIJIL("tiktokec_button_show", linkedHashMap);
        }
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS115S1100000_1(X.C1054004Ag r3, int r4) {
        /*
            r2 = this;
            r2.$t = r4
            int r4 = 50 - r4
            if (r4 == 0) goto L12
            r1 = r2
            r1.l1 = r3
            java.lang.String r0 = "Global shipping"
            r1.s0 = r0
            r0 = 1
        Le:
            r1.<init>(r0)
            return
        L12:
            r1 = r2
            r1.l1 = r3
            java.lang.String r0 = "logistics"
            r1.s0 = r0
            r0 = 1
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS115S1100000_1.<init>(X.04Ag, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS115S1100000_1(X.C939703lr r3, java.lang.String r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            int r5 = 22 - r5
            if (r5 == 0) goto L10
            r1 = r2
            r1.l1 = r3
            r1.s0 = r4
            r0 = 1
        Lc:
            r1.<init>(r0)
            return
        L10:
            r1 = r2
            r1.s0 = r4
            r1.l1 = r3
            r0 = 1
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS115S1100000_1.<init>(X.03lr, java.lang.String, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS115S1100000_1(com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel r3, java.lang.String r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            int r5 = 14 - r5
            if (r5 == 0) goto L10
            r1 = r2
            r1.l1 = r3
            r1.s0 = r4
            r0 = 1
        Lc:
            r1.<init>(r0)
            return
        L10:
            r1 = r2
            r1.s0 = r4
            r1.l1 = r3
            r0 = 1
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS115S1100000_1.<init>(com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel, java.lang.String, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS115S1100000_1(com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelAssemVM r3, java.lang.String r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            int r5 = 19 - r5
            if (r5 == 0) goto L10
            r1 = r2
            r1.l1 = r3
            r1.s0 = r4
            r0 = 1
        Lc:
            r1.<init>(r0)
            return
        L10:
            r1 = r2
            r1.s0 = r4
            r1.l1 = r3
            r0 = 1
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS115S1100000_1.<init>(com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelAssemVM, java.lang.String, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS115S1100000_1(C899903fR c899903fR, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c899903fR;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS115S1100000_1(C939603lq c939603lq, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c939603lq;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS115S1100000_1(InterfaceC975703rf interfaceC975703rf, String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = interfaceC975703rf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS115S1100000_1(C1054104Ah c1054104Ah, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1054104Ah;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS115S1100000_1(C1755420vmW c1755420vmW, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1755420vmW;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS115S1100000_1(C19EG c19eg, String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c19eg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS115S1100000_1(SmartImageView smartImageView, String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = smartImageView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS115S1100000_1(LogisticDTO logisticDTO, String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = logisticDTO;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS115S1100000_1(DeliveryPanelViewModel deliveryPanelViewModel, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = deliveryPanelViewModel;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS115S1100000_1(MiniOspBottomWidget miniOspBottomWidget, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = miniOspBottomWidget;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS115S1100000_1(AgeConfirmCell ageConfirmCell, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = ageConfirmCell;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS115S1100000_1(CCDCAddCardHalfFragment cCDCAddCardHalfFragment, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = cCDCAddCardHalfFragment;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS115S1100000_1(AddCCICardFragment addCCICardFragment, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = addCCICardFragment;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS115S1100000_1(Announcement announcement, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = announcement;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS115S1100000_1(ComboSubSkuExpression comboSubSkuExpression, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = comboSubSkuExpression;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS115S1100000_1(OrderSubmitEnterParams orderSubmitEnterParams, String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = orderSubmitEnterParams;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS115S1100000_1(SeaPdpPromotionEntranceInfoViewHolder seaPdpPromotionEntranceInfoViewHolder, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = seaPdpPromotionEntranceInfoViewHolder;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS115S1100000_1(SaleProp saleProp, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = saleProp;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS115S1100000_1(SeaSkuPanelHeaderWidget seaSkuPanelHeaderWidget, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = seaSkuPanelHeaderWidget;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS115S1100000_1(USLogisticDiscriptionVH uSLogisticDiscriptionVH, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = uSLogisticDiscriptionVH;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS115S1100000_1(String str, C719302rP c719302rP, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c719302rP;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS115S1100000_1(String str, AbstractC7925037r abstractC7925037r, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = abstractC7925037r;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS115S1100000_1(String str, CombinedSkuOrderSubmitFragment combinedSkuOrderSubmitFragment, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = combinedSkuOrderSubmitFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS115S1100000_1(String str, OrderSubmitFragment orderSubmitFragment, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = orderSubmitFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS115S1100000_1(String str, SeaOneStepOrderSubmitFragment seaOneStepOrderSubmitFragment, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = seaOneStepOrderSubmitFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS115S1100000_1(String str, SubPaymentListViewModel subPaymentListViewModel, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = subPaymentListViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS115S1100000_1(String str, Integer num, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS115S1100000_1(String str, HashMap map, int i) {
        super(1);
        this.$t = i;
        this.l1 = map;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS115S1100000_1(String str, String str2, List<VoucherInfoNew> list) {
        super(1);
        this.$t = list;
        this.s0 = str;
        this.l1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS115S1100000_1(String str, String str2, Map<String, ? extends Object> map) {
        super(1);
        this.$t = map;
        this.s0 = str;
        this.l1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS115S1100000_1(Function0 function0, Function0<Unit> function02, String str) {
        super(1);
        this.$t = str;
        this.l1 = function0;
        this.s0 = function02;
    }
}
