package kotlin.jvm.internal;

import X.AnonymousClass0317;
import X.C034S;
import X.C036E;
import X.C037J;
import X.C037T;
import X.C03CY;
import X.C03DI;
import X.C03JV;
import X.C03OE;
import X.C03OF;
import X.C03PI;
import X.C03QL;
import X.C03QZ;
import X.C03R6;
import X.C03RW;
import X.C03SE;
import X.C03W9;
import X.C03XG;
import X.C03Z4;
import X.C043B;
import X.C04DV;
import X.C04DW;
import X.C04FN;
import X.C04GD;
import X.C04GW;
import X.C09AY;
import X.C0PEM;
import X.C1010603xI;
import X.C10472047q;
import X.C1054004Ag;
import X.C1054104Ah;
import X.C1070604Gq;
import X.C1073604Hu;
import X.C1120604Zw;
import X.C1397630mTR;
import X.C13LP;
import X.C1440005kM;
import X.C1741890vQh;
import X.C1748770vbn;
import X.C1748780vbo;
import X.C1AQS;
import X.C1DFH;
import X.C2097608Jq;
import X.C2107308Nj;
import X.C23271099x;
import X.C259800zU;
import X.C443120HZe;
import X.C703302op;
import X.C719102rN;
import X.C719202rO;
import X.C719302rP;
import X.C722002rq;
import X.C722302rt;
import X.C765302yp;
import X.C765402yq;
import X.C770702zh;
import X.C7969039j;
import X.C878803c2;
import X.C879403c8;
import X.C890103dr;
import X.C939603lq;
import X.C948003nC;
import X.C948503nH;
import X.C957403oi;
import X.C991103u9;
import X.EnumC884003cs;
import X.InterfaceC1891350zJl;
import X.InterfaceC497601wk;
import X.InterfaceC746802vq;
import X.InterfaceC877803bs;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputDataOptions;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail.AddressEditDetailState;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail.AddressEditDetailViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticExpressionArea;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticsExpressionAreaExtraInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.aggregation.USAggregationOrderCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.aggregation.USCombineAggregationOrderCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentBindHelper;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentCacheHelper;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.card.ATMCardViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteType;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoSetting;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillItem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ChangeInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OspPlaceOrderButton;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.QuantityControlInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.USPackedSku;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.VoucherInfoNew;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrandInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BuyButton;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FlashSale;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductDetailReview;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionEntrance;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.lockup.SeaPdpInfoViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.promotion.SeaPdpPromotionEntranceInfoViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.subpage.SeaPdpPaymentPanelFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.SizeGuideFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.userright.UserRightFragment;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem.SkuPurchaseMethodReusedAssem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.vm.SkuState;
import com.ss.android.ugc.aweme.ecommerce.core.engine.BizParserInfo;
import com.ss.android.ugc.aweme.ecommerce.dependency.location.LocationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS52S1000000_1;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes2.dex */
public class AwS86S1200000_1 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
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
            default:
                return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x002c, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS86S1200000_1 r6, java.lang.Object r7) {
        /*
            com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams r7 = (com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams) r7
            java.lang.String r1 = "module_name"
            java.lang.String r0 = "order"
            r7.plusAssign(r1, r0)
            java.lang.String r1 = "click_area"
            java.lang.String r0 = r6.s0
            r7.plusAssign(r1, r0)
            java.lang.Object r0 = r6.l1
            X.02rP r0 = (X.C719302rP) r0
            int r0 = r0.LLJJLIIIJLLLLLLLZ
            r5 = 1
            int r0 = r0 + 1
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "rank"
            r7.plusAssign(r0, r1)
            java.lang.Object r0 = r6.l1
            X.02rP r0 = (X.C719302rP) r0
            java.util.List<X.02rO> r0 = r0.LLIZLLLIL
            java.util.Iterator r4 = r0.iterator()
        L2c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto Lb1
            java.lang.Object r3 = r4.next()
            r0 = r3
            X.02rO r0 = (X.C719202rO) r0
            java.util.List<X.02rN> r0 = r0.LLJL
            if (r0 == 0) goto L2c
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r2 = r0.iterator()
        L43:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2c
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.02rN r0 = (X.C719102rN) r0
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ComboSubSkuExpression r0 = r0.LLLIL
            if (r0 == 0) goto L43
            if (r1 == 0) goto L2c
            if (r3 == 0) goto Lb1
        L58:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            java.lang.String r0 = "is_bundle"
            r7.plusAssign(r0, r1)
            java.lang.Object r0 = r6.l2
            com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.aggregation.USCombineAggregationOrderCell r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.aggregation.USCombineAggregationOrderCell) r0
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel r0 = r0.L5()
            X.03Lo r0 = r0.h
            boolean r0 = r0.LIZLLL()
            java.lang.String r2 = "1"
            if (r0 == 0) goto Lae
            r1 = r2
        L74:
            java.lang.String r0 = "contain_virtual_product"
            r7.plusAssign(r0, r1)
            java.lang.String r0 = "is_clickable"
            r7.plusAssign(r0, r2)
            java.lang.Object r0 = r6.l1
            X.02rP r0 = (X.C719302rP) r0
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.LLJJIJIL
            if (r0 == 0) goto L89
            r7.putAll(r0)
        L89:
            java.lang.Object r0 = r6.l2
            com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.aggregation.USCombineAggregationOrderCell r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.aggregation.USCombineAggregationOrderCell) r0
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel r0 = r0.L5()
            X.03Hi r3 = r0.LLLZLZ
            X.03Hk r2 = new X.03Hk
            java.lang.Object r0 = r6.l1
            X.02rP r0 = (X.C719302rP) r0
            int r0 = r0.LLJJLIIIJLLLLLLLZ
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "c3646.d44078"
            r2.<init>(r0, r1)
            java.util.Map r0 = r3.LIZIZ(r2)
            r7.putAll(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        Lae:
            java.lang.String r1 = "0"
            goto L74
        Lb1:
            r5 = 0
            goto L58
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS86S1200000_1.invoke$0(kotlin.jvm.internal.AwS86S1200000_1, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x002c, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS86S1200000_1 r6, java.lang.Object r7) {
        /*
            com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams r7 = (com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams) r7
            java.lang.String r1 = "module_name"
            java.lang.String r0 = "order"
            r7.plusAssign(r1, r0)
            java.lang.String r1 = "click_area"
            java.lang.String r0 = r6.s0
            r7.plusAssign(r1, r0)
            java.lang.Object r0 = r6.l1
            X.02rP r0 = (X.C719302rP) r0
            int r0 = r0.LLJJLIIIJLLLLLLLZ
            r5 = 1
            int r0 = r0 + 1
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "rank"
            r7.plusAssign(r0, r1)
            java.lang.Object r0 = r6.l1
            X.02rP r0 = (X.C719302rP) r0
            java.util.List<X.02rO> r0 = r0.LLIZLLLIL
            java.util.Iterator r4 = r0.iterator()
        L2c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto Lbb
            java.lang.Object r3 = r4.next()
            r0 = r3
            X.02rO r0 = (X.C719202rO) r0
            java.util.List<X.02rN> r0 = r0.LLJL
            if (r0 == 0) goto L2c
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r2 = r0.iterator()
        L43:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2c
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.02rN r0 = (X.C719102rN) r0
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ComboSubSkuExpression r0 = r0.LLLIL
            if (r0 == 0) goto L43
            if (r1 == 0) goto L2c
            if (r3 == 0) goto Lbb
        L58:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            java.lang.String r0 = "is_bundle"
            r7.plusAssign(r0, r1)
            java.lang.Object r0 = r6.l2
            com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.aggregation.USAggregationOrderCell r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.aggregation.USAggregationOrderCell) r0
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel r0 = r0.L5()
            X.03Lo r0 = r0.h
            boolean r0 = r0.LIZLLL()
            java.lang.String r3 = "1"
            java.lang.String r2 = "0"
            if (r0 == 0) goto Lb9
            r1 = r3
        L76:
            java.lang.String r0 = "contain_virtual_product"
            r7.plusAssign(r0, r1)
            java.lang.Object r0 = r6.l2
            com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.aggregation.USAggregationOrderCell r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.aggregation.USAggregationOrderCell) r0
            boolean r0 = r0.LLJILJILJ
            if (r0 != 0) goto L84
            r3 = r2
        L84:
            java.lang.String r0 = "virtual_email_configured"
            r7.plusAssign(r0, r3)
            java.lang.Object r0 = r6.l1
            X.02rP r0 = (X.C719302rP) r0
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.LLJJIJIL
            if (r0 == 0) goto L94
            r7.putAll(r0)
        L94:
            java.lang.Object r0 = r6.l2
            com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.aggregation.USAggregationOrderCell r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.aggregation.USAggregationOrderCell) r0
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel r0 = r0.L5()
            X.03Hi r3 = r0.LLLZLZ
            X.03Hk r2 = new X.03Hk
            java.lang.Object r0 = r6.l1
            X.02rP r0 = (X.C719302rP) r0
            int r0 = r0.LLJJLIIIJLLLLLLLZ
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "c3646.d44078"
            r2.<init>(r0, r1)
            java.util.Map r0 = r3.LIZIZ(r2)
            r7.putAll(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        Lb9:
            r1 = r2
            goto L76
        Lbb:
            r5 = 0
            goto L58
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS86S1200000_1.invoke$1(kotlin.jvm.internal.AwS86S1200000_1, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$10(AwS86S1200000_1 awS86S1200000_1, Object obj) {
        SkuState skuState = (SkuState) obj;
        return skuState.copy(skuState.checkedSkuArray, skuState.showToast, skuState.currentImage, (BuyButton) awS86S1200000_1.l1, awS86S1200000_1.s0, (Map) awS86S1200000_1.l2, skuState.preOrderInfo, skuState.currentPriceData, skuState.hidePriceTip, skuState.purchaseNotice, skuState.promotionDealVO, skuState.specifications, skuState.currentQuantityLimit, skuState.currentQuantity, skuState.currentImagePosition, skuState.currentInstallmentPlan, skuState.keyBoardVisibility, skuState.skuFragmentClosed, skuState.skuDataState, skuState.addToCartButton, skuState.paymentModule, skuState.showLoadingView, skuState.skuStockInfo, skuState.forceRefresh, skuState.originalProductPackStruct, skuState.localSizeSalePropList, skuState.isQuantityEditable, skuState.slideToBnpl, skuState.exceptionUX, skuState.counterDescription, skuState.topOutsideWidgetVisibleHeight, skuState.cutPriceSkuPanel, skuState.skuPanelWaistBanner, skuState.skuPanelSellingPoints, skuState.skuHeaderTopLabels);
    }

    public static final Object invoke$11(AwS86S1200000_1 awS86S1200000_1, Object obj) {
        QuantityControlInfo quantityControlInfo;
        String str;
        HashMap<String, Object> mapLJIIJ;
        String str2;
        HashMap map = (HashMap) obj;
        map.put("toast_name", ((C259800zU) awS86S1200000_1.l1).element);
        map.put("quantity_limit", Integer.valueOf(((C939603lq) awS86S1200000_1.l2).LLIZ.LIZ));
        map.put("sku_id", ((C939603lq) awS86S1200000_1.l2).LLIZLLLIL);
        C719102rN c719102rN = ((C939603lq) awS86S1200000_1.l2).LLJJIII;
        if (c719102rN != null && (str2 = c719102rN.LLLLIL) != null) {
            map.put("product_id", str2);
        }
        map.put("method", awS86S1200000_1.s0);
        C719102rN c719102rN2 = ((C939603lq) awS86S1200000_1.l2).LLJJIII;
        if (c719102rN2 != null && (quantityControlInfo = c719102rN2.LLLF) != null && (str = quantityControlInfo.hitMinDaInfo) != null && (mapLJIIJ = C1741890vQh.LJIIJ(str)) != null) {
            map.putAll(mapLJIIJ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS86S1200000_1 awS86S1200000_1, Object obj) {
        PaymentMethodsData paymentMethodsData;
        boolean z;
        OspPlaceOrderButton ospPlaceOrderButton;
        C03JV c03jv = (C03JV) obj;
        C03SE c03se = C03PI.LJIJI;
        MiniOspViewModel miniOspViewModel = (MiniOspViewModel) awS86S1200000_1.l1;
        PaymentInfo paymentInfo = miniOspViewModel.LLJIJIL;
        BillInfoData billInfoData = miniOspViewModel.LLIZ;
        Integer num = null;
        if (billInfoData != null) {
            paymentMethodsData = billInfoData.paymentMethods;
        } else {
            paymentMethodsData = null;
        }
        c03se.getClass();
        C443120HZe c443120HZeLJJJIL = C03SE.LJJJIL(paymentInfo, paymentMethodsData, true, true);
        boolean zBooleanValue = ((Boolean) c443120HZeLJJJIL.getFirst()).booleanValue();
        String str = (String) c443120HZeLJJJIL.getSecond();
        List list = (List) c443120HZeLJJJIL.getThird();
        if (str == null) {
            str = awS86S1200000_1.s0;
        }
        String strLJII = ((BillInfoData) awS86S1200000_1.l2).LJII(str, null, list, zBooleanValue);
        String strLJIIIIZZ = BillInfoData.LJIIIIZZ((BillInfoData) awS86S1200000_1.l2, str, zBooleanValue, list, 8);
        C948003nC c948003nC = new C948003nC(Integer.valueOf(((BillInfoData) awS86S1200000_1.l2).LJIIJ()));
        BillInfoData billInfoData2 = (BillInfoData) awS86S1200000_1.l2;
        Summary summary = billInfoData2.summary;
        if (summary != null) {
            num = summary.skuTotalQuantity;
        }
        MiniOspViewModel miniOspViewModel2 = (MiniOspViewModel) awS86S1200000_1.l1;
        CopyOnWriteArrayList<PaymentMethod> copyOnWriteArrayList = miniOspViewModel2.LLJILLL;
        boolean zLJFF = false;
        if (miniOspViewModel2.LLJIJIL != null) {
            z = true;
        } else {
            z = false;
        }
        List<InterfaceC1891350zJl> listIQ2 = miniOspViewModel2.IQ2(billInfoData2, copyOnWriteArrayList, z);
        C722302rt c722302rtLJFF = C722002rq.LJFF((BillInfoData) awS86S1200000_1.l2, str, zBooleanValue, 0, list, null, null, 52);
        BillInfoData billInfoData3 = ((MiniOspViewModel) awS86S1200000_1.l1).LLIZ;
        if (billInfoData3 != null && (ospPlaceOrderButton = billInfoData3.ospPlaceOrderButton) != null) {
            zLJFF = Intrinsics.LJFF(ospPlaceOrderButton.disable, Boolean.TRUE);
        }
        return C03JV.LIZ(c03jv, 0, listIQ2, c722302rtLJFF, false, null, false, null, null, null, strLJII, strLJIIIIZZ, null, c948003nC, num, 0, null, null, 0, null, null, false, 0L, false, false, null, null, false, null, null, null, null, null, false, null, null, false, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, false, 0, false, null, null, false, null, null, Boolean.valueOf(!zLJFF), false, null, null, false, null, null, null, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, false, null, null, null, null, null, null, null, -13831, -1, -4097, 1048575);
    }

    public static final Object invoke$13(AwS86S1200000_1 awS86S1200000_1, Object obj) {
        return C03JV.LIZ((C03JV) obj, 0, null, null, false, null, false, null, null, null, null, null, null, null, null, 0, null, null, 0, null, null, false, 0L, false, false, null, null, false, null, null, null, null, null, false, null, null, false, null, null, null, null, false, false, null, null, null, null, new C037T(awS86S1200000_1.s0, (Integer) awS86S1200000_1.l1, (Integer) awS86S1200000_1.l2), null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, false, 0, false, null, null, false, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, false, null, null, null, null, null, null, null, -1, -262145, -1, 1048575);
    }

    public static final Object invoke$14(AwS86S1200000_1 awS86S1200000_1, Object obj) {
        List listLLIIII;
        C03JV c03jv = (C03JV) obj;
        Image image = (Image) C13LP.LJJJLZIJ(0, (List) awS86S1200000_1.l1);
        List<String> list = c03jv.LLLZIL;
        if (list != null) {
            listLLIIII = C13LP.LLIIII(list);
        } else {
            listLLIIII = null;
        }
        return C03JV.LIZ(c03jv, 0, null, null, false, null, false, null, null, null, null, null, null, null, null, 0, null, null, 0, null, null, false, 0L, false, false, null, null, false, null, null, null, null, null, false, null, null, false, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, false, 0, false, null, null, false, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, 0, listLLIIII, awS86S1200000_1.s0, (SkuItem) awS86S1200000_1.l2, image, (List) awS86S1200000_1.l1, null, null, null, null, null, false, null, null, false, null, null, false, null, null, null, null, null, null, null, -1, -1, 67108863, 1048575);
    }

    public static final Object invoke$15(AwS86S1200000_1 awS86S1200000_1, Object obj) {
        String str;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("module_name", "promotions");
        SkuPanelState skuPanelState = ((SeaPdpInfoViewHolder) awS86S1200000_1.l1).d6().LLJILJIL;
        if (skuPanelState != null) {
            str = skuPanelState.skuId;
        } else {
            str = null;
        }
        laneParams.plusAssign("sku_id", str);
        String str2 = awS86S1200000_1.s0;
        if (str2 != null) {
            C1010603xI.LIZJ(laneParams, str2);
        }
        laneParams.withParamsGroup(((C1070604Gq) awS86S1200000_1.l2).LIZIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS86S1200000_1 awS86S1200000_1, Object obj) {
        String str;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("module_name", "promotions");
        SkuPanelState skuPanelState = ((SeaPdpInfoViewHolder) awS86S1200000_1.l1).d6().LLJILJIL;
        if (skuPanelState != null) {
            str = skuPanelState.skuId;
        } else {
            str = null;
        }
        laneParams.plusAssign("sku_id", str);
        String str2 = awS86S1200000_1.s0;
        if (str2 != null) {
            C1010603xI.LIZJ(laneParams, str2);
        }
        laneParams.withParamsGroup(((C1070604Gq) awS86S1200000_1.l2).LIZIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS86S1200000_1 awS86S1200000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("is_load_data", 1);
        laneParams.plusAssign("quit_type", awS86S1200000_1.s0);
        laneParams.plusAssign("stay_time", Long.valueOf(((SizeGuideFragment) awS86S1200000_1.l1).SR()));
        laneParams.compareTo(laneParams, (LaneParams) awS86S1200000_1.l2);
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    public static final Object invoke$18(AwS86S1200000_1 awS86S1200000_1, Object obj) {
        ?? r1;
        PaymentMethodInfo paymentMethodInfoCopy;
        boolean z = false;
        if (C878803c2.LIZ[((EnumC884003cs) obj).ordinal()] == 1) {
            r1 = 1;
        } else {
            r1 = 0;
        }
        ((ATMCardViewModel) awS86S1200000_1.l1).LLILZ = r1;
        PaymentInfo paymentInfo = (PaymentInfo) awS86S1200000_1.l2;
        PaymentMethodInfo paymentMethodInfo = paymentInfo.paymentMethodInfo;
        if (paymentMethodInfo != null) {
            paymentMethodInfoCopy = paymentMethodInfo.copy(paymentMethodInfo.id, paymentMethodInfo.token, paymentMethodInfo.paymentElements, Boolean.valueOf((boolean) r1), paymentMethodInfo.tenure, paymentMethodInfo.installmentPlanId, paymentMethodInfo.installmentOptionId, paymentMethodInfo.consultationId, paymentMethodInfo.isOneClickPay, paymentMethodInfo.isOneClickPayReselect, paymentMethodInfo.bankCode, paymentMethodInfo.bankName, paymentMethodInfo.installmentPlan, paymentMethodInfo.hideMarketingAmount, paymentMethodInfo.tenureCycle, paymentMethodInfo.paymentPriceParam, paymentMethodInfo.isAnchored);
        } else {
            paymentMethodInfoCopy = null;
        }
        PaymentInfo paymentInfoLIZ = PaymentInfo.LIZ(paymentInfo, paymentMethodInfoCopy, null, null, null, null, null, null, 2046);
        ATMCardViewModel aTMCardViewModel = (ATMCardViewModel) awS86S1200000_1.l1;
        EnterParams enterParams = aTMCardViewModel.LL;
        if (enterParams != null && enterParams.LJJIIJ) {
            C879403c8 c879403c8 = C879403c8.LIZ;
            C879403c8.LJ(aTMCardViewModel.LLILZIL);
            C879403c8.LIZ(paymentInfoLIZ);
            ATMCardViewModel aTMCardViewModel2 = (ATMCardViewModel) awS86S1200000_1.l1;
            C1440005kM.LIZ(new C03OF(paymentInfoLIZ, aTMCardViewModel2.LLILLJJLI, aTMCardViewModel2.LLILZIL, z, 24));
        } else {
            PaymentCacheHelper paymentCacheHelper = PaymentCacheHelper.LIZ;
            String str = aTMCardViewModel.LLILZIL;
            paymentCacheHelper.getClass();
            PaymentCacheHelper.LJIIJJI(str);
            PaymentCacheHelper.LIZIZ(paymentInfoLIZ);
            ATMCardViewModel aTMCardViewModel3 = (ATMCardViewModel) awS86S1200000_1.l1;
            C1440005kM.LIZ(new C03OE(paymentInfoLIZ, aTMCardViewModel3.LLILLJJLI, aTMCardViewModel3.LLILZIL, z, 24));
        }
        C890103dr c890103dr = C890103dr.LIZ;
        c890103dr.getClass();
        C890103dr.LJII = "next";
        C890103dr.LJFF(c890103dr, awS86S1200000_1.s0, C2097608Jq.LJIIIIZZ(new Pair("is_card_save", Integer.valueOf((int) r1)), new Pair("payment_info_finish", "1")), Boolean.valueOf(((ATMCardViewModel) awS86S1200000_1.l1).yQ2().LJI), ((ATMCardViewModel) awS86S1200000_1.l1).yQ2().LJII.toString(), ((ATMCardViewModel) awS86S1200000_1.l1).yQ2().LJIIIIZZ, null, null, 96);
        ((ATMCardViewModel) awS86S1200000_1.l1).setState(AFwS228S0000000_1.get$arr$(531));
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS86S1200000_1 awS86S1200000_1, Object obj) {
        String str;
        ProductDetailReview productDetailReview;
        String str2;
        int length;
        int i;
        ProductDetailReview productDetailReview2;
        List<ReviewItemStruct> list;
        String str3;
        String str4;
        String str5;
        ProductDetailReview productDetailReview3;
        LaneParams laneParams = (LaneParams) obj;
        ProductPackStruct productPackStruct = ((C1054104Ah) awS86S1200000_1.l1).LJIIL;
        if (productPackStruct != null && (productDetailReview3 = productPackStruct.review) != null) {
            str = productDetailReview3.daInfo;
        } else {
            str = null;
        }
        C1010603xI.LIZJ(laneParams, str);
        laneParams.withParamsGroup(((C1054104Ah) awS86S1200000_1.l1).LIZIZ);
        ProductPackStruct productPackStruct2 = ((C1054104Ah) awS86S1200000_1.l1).LJIIL;
        if (productPackStruct2 != null) {
            productDetailReview = productPackStruct2.review;
        } else {
            productDetailReview = null;
        }
        C1054104Ah.LJII(laneParams, productDetailReview);
        ReviewItemStruct reviewItemStruct = (ReviewItemStruct) awS86S1200000_1.l2;
        if (reviewItemStruct != null) {
            str2 = reviewItemStruct.daInfo;
        } else {
            str2 = null;
        }
        C1010603xI.LIZJ(laneParams, str2);
        LaneParams laneParams2 = new LaneParams();
        C1073604Hu.LIZJ(laneParams2, (ReviewItemStruct) awS86S1200000_1.l2);
        for (Map.Entry<String, Object> entry : laneParams2.entrySet()) {
            Object value = entry.getValue();
            if (value != null) {
                laneParams.put(entry.getKey(), value);
            }
        }
        ReviewItemStruct.MainReview mainReview = ((ReviewItemStruct) awS86S1200000_1.l2).review;
        int iIntValue = 0;
        if (mainReview != null && (str5 = mainReview.reviewTitle) != null) {
            length = str5.length();
        } else {
            length = 0;
        }
        laneParams.plusAssign("title_len", Integer.valueOf(length));
        ProductPackStruct productPackStruct3 = ((C1054104Ah) awS86S1200000_1.l1).LJIIL;
        if (productPackStruct3 != null && (productDetailReview2 = productPackStruct3.review) != null && (list = productDetailReview2.reviewItems) != null) {
            ReviewItemStruct reviewItemStruct2 = (ReviewItemStruct) awS86S1200000_1.l2;
            Iterator<ReviewItemStruct> it2 = list.iterator();
            i = 0;
            while (true) {
                if (it2.hasNext()) {
                    ReviewItemStruct.MainReview mainReview2 = it2.next().review;
                    if (mainReview2 != null) {
                        str3 = mainReview2.reviewId;
                    } else {
                        str3 = null;
                    }
                    ReviewItemStruct.MainReview mainReview3 = reviewItemStruct2.review;
                    if (mainReview3 != null) {
                        str4 = mainReview3.reviewId;
                    } else {
                        str4 = null;
                    }
                    if (Intrinsics.LJFF(str3, str4)) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
        } else {
            i = 0;
        }
        laneParams.plusAssign("rank", Integer.valueOf(i));
        ((C1054104Ah) awS86S1200000_1.l1).getClass();
        laneParams.plusAssign("review_show_type", "has_photo");
        laneParams.plusAssign("click_area", awS86S1200000_1.s0);
        Integer num = ((ReviewItemStruct) awS86S1200000_1.l2).reviewSourceType;
        if (num != null) {
            iIntValue = num.intValue();
        }
        laneParams.plusAssign("is_third_party", Integer.valueOf(iIntValue));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS86S1200000_1 awS86S1200000_1, Object obj) {
        HashMap map = (HashMap) obj;
        map.put("unavailable_main_order", (Map) awS86S1200000_1.l1);
        String str = awS86S1200000_1.s0;
        if (str == null) {
            str = "";
        }
        map.put("unavailable_order_title", str);
        map.put("track_message", (Map) awS86S1200000_1.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$20(AwS86S1200000_1 awS86S1200000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.withParamsGroup(((C1054104Ah) awS86S1200000_1.l1).LIZIZ);
        Map map = (Map) awS86S1200000_1.l2;
        if (map != null) {
            laneParams.putAll(map);
        }
        laneParams.plusAssign("visible_module", awS86S1200000_1.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$21(AwS86S1200000_1 awS86S1200000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        if (C770702zh.LIZIZ(awS86S1200000_1.s0)) {
            C1010603xI.LIZJ(laneParams, awS86S1200000_1.s0);
        }
        laneParams.withParamsGroup(((C1054104Ah) awS86S1200000_1.l1).LIZIZ);
        laneParams.compareTo(laneParams, (Map) awS86S1200000_1.l2);
        laneParams.plusAssign("module_name", "user_rights");
        return Unit.LIZ;
    }

    public static final Object invoke$22(AwS86S1200000_1 awS86S1200000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        if (C770702zh.LIZIZ(awS86S1200000_1.s0)) {
            C1010603xI.LIZJ(laneParams, awS86S1200000_1.s0);
        }
        laneParams.withParamsGroup(((C1054104Ah) awS86S1200000_1.l1).LIZIZ);
        laneParams.compareTo(laneParams, (Map) awS86S1200000_1.l2);
        laneParams.plusAssign("module_name", "user_rights");
        return Unit.LIZ;
    }

    public static final Object invoke$23(AwS86S1200000_1 awS86S1200000_1, Object obj) {
        HashMap<String, Object> mapLJIIJ;
        LaneParams laneParams = (LaneParams) obj;
        String str = awS86S1200000_1.s0;
        if (str != null && (mapLJIIJ = C1741890vQh.LJIIJ(str)) != null) {
            laneParams.withNotCheckParams(mapLJIIJ);
        }
        laneParams.plusAssign("page_name", "product_detail");
        laneParams.plusAssign("init_remain_time", ((C1054104Ah) awS86S1200000_1.l1).LJIILLIIL);
        laneParams.withNotCheckParams((Map) awS86S1200000_1.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$24(AwS86S1200000_1 awS86S1200000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.withParamsGroup(((C1054104Ah) awS86S1200000_1.l1).LIZIZ);
        laneParams.plusAssign("click_area", awS86S1200000_1.s0);
        C1054104Ah c1054104Ah = (C1054104Ah) awS86S1200000_1.l1;
        PromotionEntrance promotionEntrance = ((C04GW) awS86S1200000_1.l2).LL;
        c1054104Ah.getClass();
        C1054104Ah.LJ(laneParams, promotionEntrance);
        C1054104Ah c1054104Ah2 = (C1054104Ah) awS86S1200000_1.l1;
        PromotionEntrance promotionEntrance2 = ((C04GW) awS86S1200000_1.l2).LL;
        c1054104Ah2.getClass();
        laneParams.compareTo(laneParams, C1054104Ah.LJIIIIZZ(promotionEntrance2));
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$25(AwS86S1200000_1 awS86S1200000_1, Object obj) {
        HashMap map = (HashMap) obj;
        map.putAll(((C04GD) ((SeaPdpPromotionEntranceInfoViewHolder) awS86S1200000_1.l1).LLILLJJLI).LIZLLL);
        map.put("previous_page", "product_detail");
        map.put("click_area", ((View) awS86S1200000_1.l2).getTag());
        map.put("module_name", awS86S1200000_1.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$26(AwS86S1200000_1 awS86S1200000_1, Object obj) {
        HashMap<String, Object> mapLJIIJ;
        String str;
        HashMap<String, Object> mapLJIIJ2;
        HashMap map = (HashMap) obj;
        LogisticsExpressionAreaExtraInfo logisticsExpressionAreaExtraInfo = ((LogisticExpressionArea) awS86S1200000_1.l1).extraInfo;
        if (logisticsExpressionAreaExtraInfo != null && (str = logisticsExpressionAreaExtraInfo.daInfo) != null && (mapLJIIJ2 = C1741890vQh.LJIIJ(str)) != null) {
            map.putAll(mapLJIIJ2);
        }
        String str2 = awS86S1200000_1.s0;
        if (str2 != null && (mapLJIIJ = C1741890vQh.LJIIJ(str2)) != null) {
            map.putAll(mapLJIIJ);
        }
        map.putAll((Map) awS86S1200000_1.l2);
        map.put("page_name", "order_submit");
        map.put("module_name", "logistics");
        map.put("page_show_type", "full_screen");
        map.put("click_area", C03CY.RECOMMEND_LOGISTICS.getValue());
        return Unit.LIZ;
    }

    public static final Object invoke$27(AwS86S1200000_1 awS86S1200000_1, Object obj) {
        String str;
        String str2;
        InterfaceC497601wk viewModelScope;
        PaymentMethodsData paymentMethodsData;
        EnterParams enterParams;
        String str3;
        String str4 = (String) obj;
        if (str4 != null && C703302op.LIZ(str4)) {
            PaymentBindHelper paymentBindHelper = PaymentBindHelper.LIZ;
            Context context = ((C03Z4) awS86S1200000_1.l1).getContext();
            PaymentMethod paymentMethod = ((C03Z4) awS86S1200000_1.l1).getPaymentMethod();
            if (paymentMethod != null) {
                str = paymentMethod.LJIILLIIL;
            } else {
                str = null;
            }
            String str5 = awS86S1200000_1.s0;
            CommuteType commuteType = (CommuteType) awS86S1200000_1.l2;
            String paySource = ((C03Z4) awS86S1200000_1.l1).getPaySource();
            PaymentMethod paymentMethod2 = ((C03Z4) awS86S1200000_1.l1).getPaymentMethod();
            if (paymentMethod2 != null) {
                str2 = paymentMethod2.id;
            } else {
                str2 = null;
            }
            String saleRegion = ((C03Z4) awS86S1200000_1.l1).getSaleRegion();
            PaymentMethod paymentMethod3 = ((C03Z4) awS86S1200000_1.l1).getPaymentMethod();
            PaymentViewModel paymentViewModel = ((C03Z4) awS86S1200000_1.l1).getPaymentViewModel();
            if (paymentViewModel != null) {
                viewModelScope = ViewModelKt.getViewModelScope(paymentViewModel);
            } else {
                viewModelScope = null;
            }
            PaymentViewModel paymentViewModel2 = ((C03Z4) awS86S1200000_1.l1).getPaymentViewModel();
            if (paymentViewModel2 != null) {
                paymentMethodsData = paymentViewModel2.LLJJIJIL;
            } else {
                paymentMethodsData = null;
            }
            PaymentViewModel paymentViewModel3 = ((C03Z4) awS86S1200000_1.l1).getPaymentViewModel();
            if (paymentViewModel3 != null) {
                enterParams = paymentViewModel3.LLJ;
            } else {
                enterParams = null;
            }
            final C03Z4 c03z4 = (C03Z4) awS86S1200000_1.l1;
            InterfaceC877803bs interfaceC877803bs = new InterfaceC877803bs() { // from class: X.03Zi
                @Override // X.InterfaceC877803bs
                public final void onDismiss() {
                    PaymentViewModel paymentViewModel4 = c03z4.getPaymentViewModel();
                    if (paymentViewModel4 != null) {
                        paymentViewModel4.setState(AFwS228S0000000_1.get$arr$(216));
                    }
                }

                @Override // X.InterfaceC877803bs
                public final void onShow() {
                    PaymentViewModel paymentViewModel4 = c03z4.getPaymentViewModel();
                    if (paymentViewModel4 != null) {
                        paymentViewModel4.setState(AFwS228S0000000_1.get$arr$(241));
                    }
                }

                @Override // X.InterfaceC877803bs
                public final void onFailed(String str6) {
                    PaymentViewModel paymentViewModel4;
                    if (str6 != null && (paymentViewModel4 = c03z4.getPaymentViewModel()) != null) {
                        paymentViewModel4.setState(new AwS52S1000000_1(str6, 14));
                    }
                }
            };
            PaymentMethod paymentMethod4 = c03z4.getPaymentMethod();
            if (paymentMethod4 != null) {
                str3 = paymentMethod4.displayName;
            } else {
                str3 = null;
            }
            PaymentBindHelper.LJI(paymentBindHelper, context, str, str5, str4, commuteType, paySource, str2, saleRegion, paymentMethod3, viewModelScope, paymentMethodsData, false, enterParams, interfaceC877803bs, str3, SpeechEngineDefines.ASR_WORK_MODE_OFFLINE);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$28(AwS86S1200000_1 awS86S1200000_1, Object obj) {
        C957403oi c957403oi = (C957403oi) obj;
        Map map = (Map) awS86S1200000_1.l1;
        c957403oi.getClass();
        ((HashMap) c957403oi.LIZ).putAll(map);
        c957403oi.LIZJ("button_name", awS86S1200000_1.s0);
        ((UserRightFragment) awS86S1200000_1.l2).VR(c957403oi, false);
        return Unit.LIZ;
    }

    public static final Object invoke$29(AwS86S1200000_1 awS86S1200000_1, Object obj) {
        C957403oi c957403oi = (C957403oi) obj;
        ConcurrentHashMap<String, Object> concurrentHashMap = ((C1054004Ag) awS86S1200000_1.l1).LIZIZ;
        c957403oi.getClass();
        ((HashMap) c957403oi.LIZ).putAll(concurrentHashMap);
        c957403oi.LIZJ("previous_page", "product_detail");
        ((UserRightFragment) awS86S1200000_1.l2).getClass();
        c957403oi.LIZJ("page_name", "rights_service");
        c957403oi.LIZJ("button_name", awS86S1200000_1.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS86S1200000_1 awS86S1200000_1, Object obj) {
        C1748780vbo.LIZIZ((C1748770vbn) obj, "lib_track_builtin_lane_business", new AwS86S1200000_1(awS86S1200000_1.s0, (Map) awS86S1200000_1.l1, (Map) awS86S1200000_1.l2, 2));
        return Unit.LIZ;
    }

    public static final Object invoke$30(AwS86S1200000_1 awS86S1200000_1, Object obj) {
        C957403oi c957403oi = (C957403oi) obj;
        ((UserRightFragment) awS86S1200000_1.l1).VR(c957403oi, false);
        ((HashMap) c957403oi.LIZ).putAll((Map) awS86S1200000_1.l2);
        c957403oi.LIZJ("stay_time", Long.valueOf(((UserRightFragment) awS86S1200000_1.l1).SR()));
        c957403oi.LIZJ("quit_type", awS86S1200000_1.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$31(AwS86S1200000_1 awS86S1200000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("module_name", "subscribe_and_save");
        String str = awS86S1200000_1.s0;
        if (str != null) {
            laneParams.plusAssign("subscription_unit", str);
        }
        Integer num = (Integer) awS86S1200000_1.l1;
        if (num != null) {
            laneParams.plusAssign("subscription_time", Integer.valueOf(num.intValue()));
        }
        Float f = (Float) awS86S1200000_1.l2;
        if (f != null) {
            laneParams.plusAssign("discounted_percentage", Float.valueOf(f.floatValue()));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$32(AwS86S1200000_1 awS86S1200000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("module_name", "subscribe_and_save");
        laneParams.plusAssign("button_name", "info");
        String str = awS86S1200000_1.s0;
        if (str != null) {
            laneParams.plusAssign("subscription_unit", str);
        }
        Integer num = (Integer) awS86S1200000_1.l1;
        if (num != null) {
            laneParams.plusAssign("subscription_time", Integer.valueOf(num.intValue()));
        }
        Float f = (Float) awS86S1200000_1.l2;
        if (f != null) {
            laneParams.plusAssign("discounted_percentage", Float.valueOf(f.floatValue()));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$33(AwS86S1200000_1 awS86S1200000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("module_name", "subscribe_and_save");
        String str = awS86S1200000_1.s0;
        if (str != null) {
            laneParams.plusAssign("subscription_unit", str);
        }
        Integer num = (Integer) awS86S1200000_1.l1;
        if (num != null) {
            laneParams.plusAssign("subscription_time", Integer.valueOf(num.intValue()));
        }
        Float f = (Float) awS86S1200000_1.l2;
        if (f != null) {
            laneParams.plusAssign("discounted_percentage", Float.valueOf(f.floatValue()));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$34(AwS86S1200000_1 awS86S1200000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("module_name", "subscribe_and_save");
        laneParams.plusAssign("button_name", "info");
        String str = awS86S1200000_1.s0;
        if (str != null) {
            laneParams.plusAssign("subscription_unit", str);
        }
        Integer num = (Integer) awS86S1200000_1.l1;
        if (num != null) {
            laneParams.plusAssign("subscription_time", Integer.valueOf(num.intValue()));
        }
        Float f = (Float) awS86S1200000_1.l2;
        if (f != null) {
            laneParams.plusAssign("discounted_percentage", Float.valueOf(f.floatValue()));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$35(AwS86S1200000_1 awS86S1200000_1, Object obj) {
        C957403oi c957403oi = (C957403oi) obj;
        Map map = (Map) awS86S1200000_1.l1;
        c957403oi.getClass();
        ((HashMap) c957403oi.LIZ).putAll(map);
        c957403oi.LIZJ("previous_page", "product_detail");
        c957403oi.LIZJ("page_name", ((SeaPdpPaymentPanelFragment) awS86S1200000_1.l2).getPageName());
        c957403oi.LIZJ("EVENT_ORIGIN_FEATURE", "TEMAI");
        c957403oi.LIZJ("stay_time", Long.valueOf(((SeaPdpPaymentPanelFragment) awS86S1200000_1.l2).SR()));
        c957403oi.LIZJ("quit_type", awS86S1200000_1.s0);
        c957403oi.LJ(((SeaPdpPaymentPanelFragment) awS86S1200000_1.l2).VR());
        Map<String, ? extends Object> map2 = ((SeaPdpPaymentPanelFragment) awS86S1200000_1.l2).LLILZIL;
        if (map2 != null) {
            c957403oi.LJ(map2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$36(AwS86S1200000_1 awS86S1200000_1, Object obj) {
        List<InterfaceC746802vq> list = (List) obj;
        for (InterfaceC746802vq interfaceC746802vq : list) {
            if (interfaceC746802vq instanceof C04DW) {
                C04DW c04dw = (C04DW) interfaceC746802vq;
                c04dw.setGodaNodeId(((C04FN) awS86S1200000_1.l1).LJIIIZ);
                c04dw.setGodaGroupId(awS86S1200000_1.s0);
            }
            if (interfaceC746802vq instanceof C04DV) {
                ((C04DV) interfaceC746802vq).LIZIZ((C04FN) awS86S1200000_1.l1);
            }
        }
        ((List) awS86S1200000_1.l2).addAll(list);
        return Unit.LIZ;
    }

    public static final Object invoke$37(AwS86S1200000_1 awS86S1200000_1, Object obj) {
        ((C03W9) obj).LJ(new C03XG(awS86S1200000_1.s0, (C03RW) awS86S1200000_1.l1, (C03R6) awS86S1200000_1.l2, 0, 4), null);
        return Unit.LIZ;
    }

    public static final Object invoke$38(AwS86S1200000_1 awS86S1200000_1, Object obj) {
        Map mapLJIILIIL = C2097608Jq.LJIILIIL(((C765402yq) awS86S1200000_1.l1).LJJZZI().LIZ, new Pair(awS86S1200000_1.s0, (List) awS86S1200000_1.l2));
        obj.getClass();
        return new C765302yp((Map<String, ? extends List<USPackedSku>>) mapLJIILIIL);
    }

    public static final Object invoke$39(AwS86S1200000_1 awS86S1200000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.withParamsGroup(((C1054004Ag) awS86S1200000_1.l1).LIZIZ);
        Map map = (Map) awS86S1200000_1.l2;
        if (map != null) {
            laneParams.putAll(map);
        }
        laneParams.plusAssign("visible_module", awS86S1200000_1.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS86S1200000_1 awS86S1200000_1, Object obj) {
        HashMap map = (HashMap) obj;
        map.put("shop_info", (C719202rO) awS86S1200000_1.l1);
        String str = awS86S1200000_1.s0;
        if (str == null) {
            str = "";
        }
        map.put("item_and_free_gift", str);
        map.put("track_message", (Map) awS86S1200000_1.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$40(AwS86S1200000_1 awS86S1200000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.withParamsGroup(((C1054004Ag) awS86S1200000_1.l1).LIZIZ);
        laneParams.plusAssign("entrance_type", awS86S1200000_1.s0);
        laneParams.plusAssign("source_previous_page", "product_detail");
        laneParams.withParamsGroup((Map) awS86S1200000_1.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$41(AwS86S1200000_1 awS86S1200000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.withParamsGroup(((C1054004Ag) awS86S1200000_1.l1).LIZIZ);
        laneParams.plusAssign("entrance_type", awS86S1200000_1.s0);
        laneParams.plusAssign("source_previous_page", "product_detail");
        laneParams.withParamsGroup((Map) awS86S1200000_1.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$42(AwS86S1200000_1 awS86S1200000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        laneParams.withParamsGroup(((C1054004Ag) awS86S1200000_1.l1).LIZIZ);
        linkedHashMap.put("entrance_zone", "add_on_layer");
        String str = awS86S1200000_1.s0;
        if (str != null) {
            linkedHashMap.put("coupon_zone", str);
        }
        Map<String, ? extends Object> map = (Map) awS86S1200000_1.l2;
        if (map != null) {
            laneParams.withParamsGroup(map);
        }
        laneParams.withParamsGroup(linkedHashMap);
        return Unit.LIZ;
    }

    public static final Object invoke$43(AwS86S1200000_1 awS86S1200000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.withParamsGroup(((C1054004Ag) awS86S1200000_1.l1).LIZIZ);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("entrance_zone", "add_on_layer");
        String str = awS86S1200000_1.s0;
        if (str != null) {
            linkedHashMap.put("coupon_zone", str);
        }
        Map<String, ? extends Object> map = (Map) awS86S1200000_1.l2;
        if (map != null) {
            laneParams.withParamsGroup(map);
        }
        laneParams.withParamsGroup(linkedHashMap);
        return Unit.LIZ;
    }

    public static final Object invoke$44(AwS86S1200000_1 awS86S1200000_1, Object obj) {
        ProductDetailReview productDetailReview;
        BrandInfo brandInfo;
        C957403oi c957403oi = (C957403oi) obj;
        ConcurrentHashMap<String, Object> concurrentHashMap = ((C1054004Ag) awS86S1200000_1.l1).LIZIZ;
        c957403oi.getClass();
        ((HashMap) c957403oi.LIZ).putAll(concurrentHashMap);
        c957403oi.LIZJ("module_name", "logistics");
        ProductPackStruct productPackStruct = ((C1054004Ag) awS86S1200000_1.l1).LJIIZILJ;
        String strLIZIZ = null;
        if (productPackStruct != null) {
            productDetailReview = productPackStruct.review;
        } else {
            productDetailReview = null;
        }
        C1054004Ag.LJII(c957403oi, productDetailReview);
        ProductPackStruct productPackStruct2 = ((C1054004Ag) awS86S1200000_1.l1).LJIIZILJ;
        if (productPackStruct2 != null && (brandInfo = productPackStruct2.brandInfo) != null) {
            strLIZIZ = C10472047q.LIZIZ(brandInfo);
        }
        c957403oi.LIZJ("seller_logo_type", strLIZIZ);
        String str = awS86S1200000_1.s0;
        if (str != null && !a0.LJJJIL(str)) {
            c957403oi.LIZJ("click_area", str);
        }
        ((HashMap) c957403oi.LIZ).putAll((Map) awS86S1200000_1.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$45(AwS86S1200000_1 awS86S1200000_1, Object obj) {
        FlashSale flashSale;
        String str;
        HashMap<String, Object> mapLJIIJ;
        Object obj2;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.withParamsGroup(((C1054004Ag) awS86S1200000_1.l1).LIZIZ);
        ((C1054004Ag) awS86S1200000_1.l1).LIZIZ(laneParams);
        laneParams.plusAssign("button_name", awS86S1200000_1.s0);
        HashMap map = (HashMap) awS86S1200000_1.l2;
        if (map != null) {
            laneParams.compareTo(laneParams, map);
        }
        ProductPackStruct productPackStruct = ((C1054004Ag) awS86S1200000_1.l1).LJIIZILJ;
        if (productPackStruct != null && (flashSale = productPackStruct.flashSale) != null && (str = flashSale.logExtra) != null && (mapLJIIJ = C1741890vQh.LJIIJ(str)) != null && (obj2 = mapLJIIJ.get("campaign_cost_role")) != null) {
            laneParams.plusAssign("campaign_cost_role", obj2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$46(AwS86S1200000_1 awS86S1200000_1, Object obj) {
        ((HashMap) obj).put(awS86S1200000_1.s0, (List) awS86S1200000_1.l1);
        OrderSubmitAssemViewModel.OS2(((C037J) awS86S1200000_1.l2).LIZ, false, false, null, false, false, false, null, null, false, null, null, new ChangeInfo(C03DI.SELECT_VOUCHER.getValue(), null, null, null), null, null, null, null, null, null, null, null, null, 8380415);
        return Unit.LIZ;
    }

    public static final Object invoke$47(AwS86S1200000_1 awS86S1200000_1, Object obj) {
        HashMap map = (HashMap) obj;
        Map map2 = (Map) awS86S1200000_1.l1;
        if (map2 != null) {
            map.putAll(map2);
        }
        C7969039j c7969039j = C7969039j.LIZ;
        Integer num = ((BillItem) awS86S1200000_1.l2).itemType;
        c7969039j.getClass();
        map.put("actionsheet_name", C7969039j.LIZ(num));
        String str = awS86S1200000_1.s0;
        if (str != null) {
            map.put("summary_info", str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$48(AwS86S1200000_1 awS86S1200000_1, Object obj) {
        HashMap map = (HashMap) obj;
        Map map2 = (Map) awS86S1200000_1.l1;
        if (map2 != null) {
            map.putAll(map2);
        }
        C7969039j c7969039j = C7969039j.LIZ;
        Integer num = ((BillItem) awS86S1200000_1.l2).itemType;
        c7969039j.getClass();
        map.putAll(C7969039j.LIZLLL(num));
        String str = awS86S1200000_1.s0;
        if (str != null) {
            map.put("summary_info", str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$49(AwS86S1200000_1 awS86S1200000_1, Object obj) {
        C043B c043b = (C043B) awS86S1200000_1.l1;
        C1DFH c1dfh = C0PEM.LIZ;
        c043b.W6(C2107308Nj.LIZ, new C03QZ(c043b, (C03QL) awS86S1200000_1.l2, awS86S1200000_1.s0, null));
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS86S1200000_1 awS86S1200000_1, Object obj) {
        C1748780vbo.LIZIZ((C1748770vbn) obj, "lib_track_builtin_lane_business", new AwS86S1200000_1((C719202rO) awS86S1200000_1.l1, (C719202rO) awS86S1200000_1.s0, (String) awS86S1200000_1.l2, (Map<String, String>) 4));
        return Unit.LIZ;
    }

    public static final Object invoke$50(AwS86S1200000_1 awS86S1200000_1, Object obj) {
        ((C1397630mTR) obj).LIZJ(0, ((C03QL) awS86S1200000_1.l1).LL.getString(2131832893), new AwS86S1200000_1((C03QL) awS86S1200000_1.l1, (C043B) awS86S1200000_1.l2, awS86S1200000_1.s0, 49));
        return Unit.LIZ;
    }

    public static final Object invoke$51(AwS86S1200000_1 awS86S1200000_1, Object obj) {
        IECommerceHostService iECommerceHostService;
        boolean z;
        String name;
        AddressEditDetailViewModel addressEditDetailViewModel = (AddressEditDetailViewModel) awS86S1200000_1.l1;
        String str = awS86S1200000_1.s0;
        Address addressIR2 = addressEditDetailViewModel.iR2(((AddressEditDetailState) obj).getInputItemVOList());
        Function1 function1 = (Function1) awS86S1200000_1.l2;
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
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        ((IApplicationDependencyService) iECommerceHostService).getApplication();
        try {
            if (C036E.LIZ.LIZIZ() && str != null && str.length() != 0 && addressIR2 != null) {
                C948503nH.LJFF(addressEditDetailViewModel, C23271099x.INSTANCE, new C991103u9(str, addressIR2, addressEditDetailViewModel, function1, null));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS86S1200000_1 awS86S1200000_1, Object obj) {
        AnonymousClass0317 anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin;
        List<BizParserInfo> list;
        String name;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("page_name", "order_submit");
        String strLJIIIIZZ = null;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            boolean z = false;
            anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin = LocationDependencyService.createILocationDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin != null) {
                z = true;
            }
            String name2 = ILocationDependencyService.class.getName();
            if (anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILocationDependencyService.class);
        }
        laneParams.plusAssign("region", ((ILocationDependencyService) anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin).getCurrentRegionCode().toUpperCase(Locale.ROOT));
        laneParams.plusAssign("cache_template", awS86S1200000_1.s0);
        laneParams.plusAssign("server_template", ((OrderSubmitAssemViewModel) awS86S1200000_1.l1).o.LIZJ);
        BillInfoSetting billInfoSetting = ((BillInfoData) awS86S1200000_1.l2).settings;
        if (billInfoSetting != null && (list = billInfoSetting.pageBizList) != null) {
            strLJIIIIZZ = C1741890vQh.LJIIIIZZ(list);
        }
        laneParams.plusAssign("page_biz_list", strLJIIIIZZ);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS86S1200000_1 awS86S1200000_1, Object obj) {
        C957403oi c957403oi = (C957403oi) obj;
        Map map = (Map) awS86S1200000_1.l1;
        c957403oi.getClass();
        ((HashMap) c957403oi.LIZ).putAll(map);
        c957403oi.LIZJ("button_name", awS86S1200000_1.s0);
        ((UserRightFragment) awS86S1200000_1.l2).VR(c957403oi, false);
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS86S1200000_1 awS86S1200000_1, Object obj) {
        C957403oi c957403oi = (C957403oi) obj;
        ConcurrentHashMap<String, Object> concurrentHashMap = ((C1054004Ag) awS86S1200000_1.l1).LIZIZ;
        c957403oi.getClass();
        ((HashMap) c957403oi.LIZ).putAll(concurrentHashMap);
        c957403oi.LIZJ("previous_page", "product_detail");
        c957403oi.LIZJ("button_name", awS86S1200000_1.s0);
        ((UserRightFragment) awS86S1200000_1.l2).VR(c957403oi, false);
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS86S1200000_1 awS86S1200000_1, Object obj) {
        String str;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("module_name", "purchase_frequency");
        SkuPurchaseMethodReusedAssem skuPurchaseMethodReusedAssem = (SkuPurchaseMethodReusedAssem) awS86S1200000_1.l1;
        Integer num = (Integer) awS86S1200000_1.l2;
        skuPurchaseMethodReusedAssem.getClass();
        if (num != null && num.intValue() != 0 && num.intValue() == 1) {
            str = "subscribe";
        } else {
            str = "one-time purchase";
        }
        laneParams.plusAssign("purchase_method", str);
        laneParams.plusAssign("button_name", awS86S1200000_1.s0);
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS86S1200000_1(X.C1054004Ag r3, java.util.Map r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            switch(r5) {
                case 40: goto L13;
                case 41: goto L13;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l1 = r3
            java.lang.String r0 = "discounts_module"
            r1.s0 = r0
            r1.l2 = r4
            r0 = 1
        Lf:
            r1.<init>(r0)
            return
        L13:
            r1 = r2
            r1.l1 = r3
            java.lang.String r0 = "add_to_cart_button"
            r1.s0 = r0
            r1.l2 = r4
            r0 = 1
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS86S1200000_1.<init>(X.04Ag, java.util.Map, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS86S1200000_1(C719302rP c719302rP, USCombineAggregationOrderCell uSCombineAggregationOrderCell, int i) {
        super(1);
        this.$t = i;
        this.s0 = "product_card";
        this.l1 = c719302rP;
        this.l2 = uSCombineAggregationOrderCell;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS86S1200000_1(C1054004Ag c1054004Ag, HashMap map, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1054004Ag;
        this.s0 = "remind";
        this.l2 = map;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS86S1200000_1(com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.userright.UserRightFragment r3, java.lang.String r4, java.util.Map r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            switch(r6) {
                case 7: goto L11;
                case 28: goto L11;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l1 = r3
            r1.l2 = r5
            r1.s0 = r4
            r0 = 1
        Ld:
            r1.<init>(r0)
            return
        L11:
            r1 = r2
            r1.l1 = r5
            r1.s0 = r4
            r1.l2 = r3
            r0 = 1
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS86S1200000_1.<init>(com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.userright.UserRightFragment, java.lang.String, java.util.Map, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS86S1200000_1(X.C03QL r3, X.C043B r4, java.lang.String r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            int r6 = 49 - r6
            if (r6 == 0) goto L12
            r1 = r2
            r1.l1 = r3
            r1.l2 = r4
            r1.s0 = r5
            r0 = 1
        Le:
            r1.<init>(r0)
            return
        L12:
            r1 = r2
            r1.l1 = r4
            r1.l2 = r3
            r1.s0 = r5
            r0 = 1
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS86S1200000_1.<init>(X.03QL, X.043B, java.lang.String, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS86S1200000_1(X.C1054004Ag r3, java.lang.String r4, java.util.Map r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            int r6 = 39 - r6
            if (r6 == 0) goto L12
            r1 = r2
            r1.l1 = r3
            r1.s0 = r4
            r1.l2 = r5
            r0 = 1
        Le:
            r1.<init>(r0)
            return
        L12:
            r1 = r2
            r1.l1 = r3
            r1.l2 = r5
            r1.s0 = r4
            r0 = 1
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS86S1200000_1.<init>(X.04Ag, java.lang.String, java.util.Map, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS86S1200000_1(X.C1054104Ah r3, java.lang.String r4, java.util.Map r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            int r6 = 20 - r6
            if (r6 == 0) goto L12
            r1 = r2
            r1.s0 = r4
            r1.l1 = r3
            r1.l2 = r5
            r0 = 1
        Le:
            r1.<init>(r0)
            return
        L12:
            r1 = r2
            r1.l1 = r3
            r1.l2 = r5
            r1.s0 = r4
            r0 = 1
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS86S1200000_1.<init>(X.04Ah, java.lang.String, java.util.Map, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS86S1200000_1(com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.userright.UserRightFragment r3, X.C1054004Ag r4, java.lang.String r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            int r6 = 8 - r6
            if (r6 == 0) goto L12
            r1 = r2
            r1.l1 = r4
            r1.l2 = r3
            r1.s0 = r5
            r0 = 1
        Le:
            r1.<init>(r0)
            return
        L12:
            r1 = r2
            r1.l1 = r4
            r1.s0 = r5
            r1.l2 = r3
            r0 = 1
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS86S1200000_1.<init>(com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.userright.UserRightFragment, X.04Ag, java.lang.String, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS86S1200000_1(C259800zU c259800zU, C259800zU<String> c259800zU2, C939603lq c939603lq, String str) {
        super(1);
        this.$t = str;
        this.l1 = c259800zU;
        this.l2 = c259800zU2;
        this.s0 = c939603lq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS86S1200000_1(C719202rO c719202rO, C719202rO c719202rO2, String str, Map<String, String> map) {
        super(1);
        this.$t = map;
        this.l1 = c719202rO;
        this.s0 = c719202rO2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS86S1200000_1(C765402yq c765402yq, C765402yq c765402yq2, String str, List<USPackedSku> list) {
        super(1);
        this.$t = list;
        this.l1 = c765402yq;
        this.s0 = c765402yq2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS86S1200000_1(C03Z4 c03z4, String str, CommuteType commuteType, int i) {
        super(1);
        this.$t = i;
        this.l1 = c03z4;
        this.s0 = str;
        this.l2 = commuteType;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS86S1200000_1(C1054104Ah c1054104Ah, ReviewItemStruct reviewItemStruct, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1054104Ah;
        this.l2 = reviewItemStruct;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS86S1200000_1(C1054104Ah c1054104Ah, String str, C04GW c04gw, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1054104Ah;
        this.s0 = str;
        this.l2 = c04gw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS86S1200000_1(C04FN c04fn, C04FN c04fn2, String str, List<Object> list) {
        super(1);
        this.$t = list;
        this.l1 = c04fn;
        this.s0 = c04fn2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS86S1200000_1(AddressEditDetailViewModel addressEditDetailViewModel, AddressEditDetailViewModel addressEditDetailViewModel2, String str, Function1<? super CandInputDataOptions, Unit> function1) {
        super(1);
        this.$t = function1;
        this.l1 = addressEditDetailViewModel;
        this.s0 = addressEditDetailViewModel2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS86S1200000_1(LogisticExpressionArea logisticExpressionArea, LogisticExpressionArea logisticExpressionArea2, String str, Map<String, ? extends Object> map) {
        super(1);
        this.$t = map;
        this.l1 = logisticExpressionArea;
        this.s0 = logisticExpressionArea2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS86S1200000_1(ATMCardViewModel aTMCardViewModel, PaymentInfo paymentInfo, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = aTMCardViewModel;
        this.l2 = paymentInfo;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS86S1200000_1(MiniOspViewModel miniOspViewModel, String str, BillInfoData billInfoData, int i) {
        super(1);
        this.$t = i;
        this.l1 = miniOspViewModel;
        this.s0 = str;
        this.l2 = billInfoData;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS86S1200000_1(BuyButton buyButton, BuyButton buyButton2, String str, Map<String, String> map) {
        super(1);
        this.$t = map;
        this.l1 = buyButton;
        this.s0 = buyButton2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS86S1200000_1(SeaPdpInfoViewHolder seaPdpInfoViewHolder, String str, C1070604Gq c1070604Gq, int i) {
        super(1);
        this.$t = i;
        this.l1 = seaPdpInfoViewHolder;
        this.s0 = str;
        this.l2 = c1070604Gq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS86S1200000_1(SeaPdpPromotionEntranceInfoViewHolder seaPdpPromotionEntranceInfoViewHolder, View view, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = seaPdpPromotionEntranceInfoViewHolder;
        this.l2 = view;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS86S1200000_1(SkuPurchaseMethodReusedAssem skuPurchaseMethodReusedAssem, Integer num, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = skuPurchaseMethodReusedAssem;
        this.l2 = num;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS86S1200000_1(String str, C719302rP c719302rP, USAggregationOrderCell uSAggregationOrderCell, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c719302rP;
        this.l2 = uSAggregationOrderCell;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS86S1200000_1(String str, C03RW c03rw, C03R6 c03r6, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c03rw;
        this.l2 = c03r6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS86S1200000_1(String str, OrderSubmitAssemViewModel orderSubmitAssemViewModel, BillInfoData billInfoData, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = orderSubmitAssemViewModel;
        this.l2 = billInfoData;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS86S1200000_1(String str, SizeGuideFragment sizeGuideFragment, LaneParams laneParams, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = sizeGuideFragment;
        this.l2 = laneParams;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS86S1200000_1(String str, Integer num, Float f, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = num;
        this.l2 = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS86S1200000_1(String str, Integer num, Integer num2, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = num;
        this.l2 = num2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS86S1200000_1(String str, String str2, List<VoucherInfoNew> list, C037J c037j) {
        super(1);
        this.$t = c037j;
        this.s0 = str;
        this.l1 = str2;
        this.l2 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS86S1200000_1(String str, Map map, Map map2, int i) {
        super(1);
        this.$t = i;
        this.l1 = map;
        this.s0 = str;
        this.l2 = map2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS86S1200000_1(List list, List<Image> list2, String str, SkuItem skuItem) {
        super(1);
        this.$t = skuItem;
        this.l1 = list;
        this.s0 = list2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS86S1200000_1(Map map, Map<String, Object> map2, BillItem billItem, String str) {
        super(1);
        this.$t = str;
        this.l1 = map;
        this.l2 = map2;
        this.s0 = billItem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS86S1200000_1(Map map, Map<String, ? extends Object> map2, SeaPdpPaymentPanelFragment seaPdpPaymentPanelFragment, String str) {
        super(1);
        this.$t = str;
        this.l1 = map;
        this.l2 = map2;
        this.s0 = seaPdpPaymentPanelFragment;
    }
}
