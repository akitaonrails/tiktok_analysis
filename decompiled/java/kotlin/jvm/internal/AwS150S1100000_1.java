package kotlin.jvm.internal;

import X.AbstractC756202xM;
import X.C038N;
import X.C042Y;
import X.C09AY;
import X.C1741890vQh;
import X.C2188811AlT;
import X.C879403c8;
import X.C908703gr;
import X.C928203k0;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentCacheHelper;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteType;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.starter.OrderSubmitRequestParam;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellingPointLabel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.page.sellingpoints.model.SeaPdpSellingPointsItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.counter.SeaSkuCounterCell;
import com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.spec.SeaSkuBaseCell;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public class AwS150S1100000_1 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS150S1100000_1 awS150S1100000_1) {
        HashMap<String, Object> mapLJIIJ;
        Map<String, Object> mapLIZIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SeaSkuCounterCell seaSkuCounterCell = (SeaSkuCounterCell) awS150S1100000_1.l1;
        String str = awS150S1100000_1.s0;
        C908703gr c908703gr = seaSkuCounterCell.N5().LLJILJILJ;
        if (c908703gr != null && (mapLIZIZ = c908703gr.LIZIZ()) != null) {
            linkedHashMap.putAll(mapLIZIZ);
        }
        linkedHashMap.put("page_name", "order_submit");
        linkedHashMap.put("module_name", "notice_banner");
        linkedHashMap.put("product_id", seaSkuCounterCell.N5().getProductId());
        if (str != null && (mapLJIIJ = C1741890vQh.LJIIJ(str)) != null) {
            linkedHashMap.putAll(mapLJIIJ);
        }
        return linkedHashMap;
    }

    public static final Object invoke$1(AwS150S1100000_1 awS150S1100000_1) {
        C928203k0 c928203k0 = C928203k0.LIZ;
        String str = awS150S1100000_1.s0;
        OrderSubmitRequestParam orderSubmitRequestParam = (OrderSubmitRequestParam) awS150S1100000_1.l1;
        c928203k0.getClass();
        return Boolean.valueOf(C928203k0.LIZIZ(str, orderSubmitRequestParam, null));
    }

    public static final Object invoke$10(AwS150S1100000_1 awS150S1100000_1) {
        Map<String, Object> mapLIZ;
        Map<String, Object> mapLIZIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SeaSkuBaseCell seaSkuBaseCell = (SeaSkuBaseCell) awS150S1100000_1.l1;
        String str = awS150S1100000_1.s0;
        C908703gr c908703gr = seaSkuBaseCell.R5().LLJILJILJ;
        if (c908703gr != null && (mapLIZIZ = c908703gr.LIZIZ()) != null) {
            linkedHashMap.putAll(mapLIZIZ);
        }
        linkedHashMap.put("page_name", "order_submit");
        linkedHashMap.put("module_name", "sku");
        linkedHashMap.put("select_type", str);
        linkedHashMap.put("product_id", seaSkuBaseCell.R5().getProductId());
        C908703gr c908703gr2 = seaSkuBaseCell.R5().LLJILJILJ;
        if (c908703gr2 != null) {
            mapLIZ = c908703gr2.LIZ("c14181.d0");
        } else {
            mapLIZ = null;
        }
        C038N.LIZ(linkedHashMap, mapLIZ);
        return linkedHashMap;
    }

    public static final Object invoke$11(AwS150S1100000_1 awS150S1100000_1) {
        boolean z;
        PaymentMethod paymentMethod;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("set user payment info at assem vm, ");
        PaymentInfo paymentInfo = (PaymentInfo) awS150S1100000_1.l1;
        String strLJJI = null;
        if (paymentInfo != null && (paymentMethod = paymentInfo.paymentMethod) != null) {
            strLJJI = paymentMethod.LJJI();
        }
        sbLIZ.append(strLJJI);
        sbLIZ.append(", pm_info is null: ");
        boolean z2 = true;
        if (((PaymentInfo) awS150S1100000_1.l1) != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(", pm is null: ");
        PaymentInfo paymentInfo2 = (PaymentInfo) awS150S1100000_1.l1;
        if (paymentInfo2 == null || paymentInfo2.paymentMethod == null) {
            z2 = false;
        }
        sbLIZ.append(z2);
        sbLIZ.append(", at scene ");
        sbLIZ.append(awS150S1100000_1.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$12(AwS150S1100000_1 awS150S1100000_1) {
        if (Intrinsics.LJFF(awS150S1100000_1.s0, "place_order")) {
            OrderSubmitAssemViewModel orderSubmitAssemViewModel = (OrderSubmitAssemViewModel) awS150S1100000_1.l1;
            orderSubmitAssemViewModel.withState(new AwS580S0100000_1(orderSubmitAssemViewModel, 422));
        }
        ((OrderSubmitAssemViewModel) awS150S1100000_1.l1).setState(AFwS228S0000000_1.get$arr$(487));
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS150S1100000_1 awS150S1100000_1) {
        if (Intrinsics.LJFF(awS150S1100000_1.s0, "place_order")) {
            OrderSubmitAssemViewModel orderSubmitAssemViewModel = (OrderSubmitAssemViewModel) awS150S1100000_1.l1;
            orderSubmitAssemViewModel.withState(new AwS580S0100000_1(orderSubmitAssemViewModel, 428));
        }
        ((OrderSubmitAssemViewModel) awS150S1100000_1.l1).setState(AFwS228S0000000_1.get$arr$(506));
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS150S1100000_1 awS150S1100000_1) {
        String str = awS150S1100000_1.s0;
        if (str == null) {
            return ((C042Y) awS150S1100000_1.l1).LL;
        }
        return str;
    }

    public static final Object invoke$15(AwS150S1100000_1 awS150S1100000_1) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(awS150S1100000_1.s0);
        sbLIZ.append('_');
        sbLIZ.append(((SellingPointLabel) awS150S1100000_1.l1).daInfo);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS150S1100000_1 awS150S1100000_1) {
        C928203k0 c928203k0 = C928203k0.LIZ;
        String str = awS150S1100000_1.s0;
        OrderSubmitRequestParam orderSubmitRequestParam = (OrderSubmitRequestParam) awS150S1100000_1.l1;
        c928203k0.getClass();
        return Boolean.valueOf(C928203k0.LIZIZ(str, orderSubmitRequestParam, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(kotlin.jvm.internal.AwS150S1100000_1 r6) {
        /*
            java.lang.Object r0 = r6.l1
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r2 = r0.iterator()
        L8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L21
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement) r0
            java.lang.String r0 = r0.paramValue
            if (r0 == 0) goto L1f
            int r0 = r0.length()
            if (r0 != 0) goto L8
        L1f:
            if (r1 != 0) goto L4e
        L21:
            java.util.HashMap<java.lang.String, java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement>> r5 = com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentCacheHelper.LIZJ
            java.lang.String r4 = r6.s0
            java.lang.Object r0 = r6.l1
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        L32:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L4b
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement) r0
            java.lang.String r0 = r0.element
            boolean r0 = X.C03S8.LJIILL(r0)
            if (r0 == 0) goto L32
            r3.add(r1)
            goto L32
        L4b:
            r5.put(r4, r3)
        L4e:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS150S1100000_1.invoke$3(kotlin.jvm.internal.AwS150S1100000_1):java.lang.Object");
    }

    public static final Object invoke$4(AwS150S1100000_1 awS150S1100000_1) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAppBackground for ");
        sbLIZ.append(awS150S1100000_1.s0);
        sbLIZ.append(" binding with commute_type: ");
        sbLIZ.append((CommuteType) awS150S1100000_1.l1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$5(AwS150S1100000_1 awS150S1100000_1) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAppForeground for ");
        sbLIZ.append(awS150S1100000_1.s0);
        sbLIZ.append(" binding with commute_type: ");
        sbLIZ.append((CommuteType) awS150S1100000_1.l1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$6(AwS150S1100000_1 awS150S1100000_1) {
        C879403c8.LJFF.put(awS150S1100000_1.s0, (Boolean) awS150S1100000_1.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS150S1100000_1 awS150S1100000_1) {
        PaymentCacheHelper.LJI.put(awS150S1100000_1.s0, (Boolean) awS150S1100000_1.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS150S1100000_1 awS150S1100000_1) {
        String strLJJI;
        boolean z;
        String str;
        PaymentMethodInfo paymentMethodInfo;
        PaymentMethodInfo paymentMethodInfo2;
        PaymentMethod paymentMethod;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("set user payment info at assem vm, ");
        PaymentInfo paymentInfo = (PaymentInfo) awS150S1100000_1.l1;
        PaymentInstallmentPlan paymentInstallmentPlan = null;
        if (paymentInfo != null && (paymentMethod = paymentInfo.paymentMethod) != null) {
            strLJJI = paymentMethod.LJJI();
        } else {
            strLJJI = null;
        }
        sbLIZ.append(strLJJI);
        sbLIZ.append(", pm_info is null: ");
        boolean z2 = true;
        if (((PaymentInfo) awS150S1100000_1.l1) != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(", pm is null: ");
        PaymentInfo paymentInfo2 = (PaymentInfo) awS150S1100000_1.l1;
        if (paymentInfo2 == null || paymentInfo2.paymentMethod == null) {
            z2 = false;
        }
        sbLIZ.append(z2);
        sbLIZ.append(", at scene ");
        sbLIZ.append(awS150S1100000_1.s0);
        sbLIZ.append(", tenure: ");
        PaymentInfo paymentInfo3 = (PaymentInfo) awS150S1100000_1.l1;
        if (paymentInfo3 != null && (paymentMethodInfo2 = paymentInfo3.paymentMethodInfo) != null) {
            str = paymentMethodInfo2.tenure;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(", installment_plan: ");
        PaymentInfo paymentInfo4 = (PaymentInfo) awS150S1100000_1.l1;
        if (paymentInfo4 != null && (paymentMethodInfo = paymentInfo4.paymentMethodInfo) != null) {
            paymentInstallmentPlan = paymentMethodInfo.installmentPlan;
        }
        sbLIZ.append(paymentInstallmentPlan);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$9(AwS150S1100000_1 awS150S1100000_1) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(awS150S1100000_1.s0);
        sbLIZ.append('_');
        sbLIZ.append(System.identityHashCode((SeaPdpSellingPointsItem) awS150S1100000_1.l1));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS150S1100000_1(CommuteType commuteType, String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = commuteType;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS150S1100000_1(PaymentInfo paymentInfo, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = paymentInfo;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS150S1100000_1(OrderSubmitAssemViewModel orderSubmitAssemViewModel, String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = orderSubmitAssemViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS150S1100000_1(SeaSkuCounterCell seaSkuCounterCell, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = seaSkuCounterCell;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS150S1100000_1(SeaSkuBaseCell seaSkuBaseCell, SeaSkuBaseCell<AbstractC756202xM> seaSkuBaseCell2, String str) {
        super(0);
        this.$t = str;
        this.l1 = seaSkuBaseCell;
        this.s0 = seaSkuBaseCell2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS150S1100000_1(String str, C042Y c042y, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c042y;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS150S1100000_1(String str, OrderSubmitRequestParam orderSubmitRequestParam, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = orderSubmitRequestParam;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS150S1100000_1(String str, SellingPointLabel sellingPointLabel, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = sellingPointLabel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS150S1100000_1(String str, SeaPdpSellingPointsItem seaPdpSellingPointsItem, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = seaPdpSellingPointsItem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS150S1100000_1(String str, Boolean bool, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = bool;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS150S1100000_1(List list, List<PaymentElement> list2, String str) {
        super(0);
        this.$t = str;
        this.l1 = list;
        this.s0 = list2;
    }
}
