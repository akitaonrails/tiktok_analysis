package kotlin.jvm.internal;

import X.C013C;
import X.C03F3;
import X.C03MQ;
import X.C03MY;
import X.C03MZ;
import X.C03PI;
import X.C09AY;
import X.C10518049k;
import X.C13LP;
import X.C1748720vbi;
import X.C2188811AlT;
import X.C2262851Dhb;
import X.C830003Mc;
import X.C830103Md;
import X.C833003Ng;
import X.InterfaceC838503Pj;
import android.view.View;
import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.PudoAddress;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionLabelVO;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.vm.SkuState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.SkuPanelBaseWidget;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public class AwS12S0401000_1 extends C09AY implements Function1 {
    public final int $t;
    public int i4;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS12S0401000_1 awS12S0401000_1, Object obj) {
        ((C03PI) awS12S0401000_1.l0).LJIIIIZZ((List) awS12S0401000_1.l1, awS12S0401000_1.i4 + 1, (PaymentInfo) obj, (PaymentMethodsData) awS12S0401000_1.l2, (Function1) awS12S0401000_1.l3);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS12S0401000_1 awS12S0401000_1, Object obj) {
        PromotionLabel promotionLabel;
        String str;
        Integer numValueOf;
        List<PromotionLabel> list;
        SkuState skuState = (SkuState) obj;
        PromotionLabelVO promotionDealVO = skuState.getPromotionDealVO();
        String str2 = null;
        if (promotionDealVO != null && (list = promotionDealVO.promotionLabels) != null) {
            promotionLabel = (PromotionLabel) C13LP.LJJJLZIJ(awS12S0401000_1.i4, list);
        } else {
            promotionLabel = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        if (promotionLabel != null) {
            str = promotionLabel.idStr;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append('_');
        if (promotionLabel != null) {
            numValueOf = Integer.valueOf(promotionLabel.type);
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append('_');
        if (promotionLabel != null) {
            str2 = promotionLabel.instanceKey;
        }
        sbLIZ.append(str2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (!((List) awS12S0401000_1.l0).contains(strLIZIZ)) {
            ((List) awS12S0401000_1.l0).add(strLIZIZ);
            View view = (View) awS12S0401000_1.l1;
            C10518049k c10518049k = new C10518049k();
            AwS86S1000000_1 awS86S1000000_1 = new AwS86S1000000_1(strLIZIZ, 14);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("c5400.d12047_i");
            sbLIZ2.append(awS12S0401000_1.i4);
            C1748720vbi.LJI(view, c10518049k, awS86S1000000_1, C2188811AlT.LIZIZ(sbLIZ2), (PageFinder) awS12S0401000_1.l2, new AwS36S0301000_1(awS12S0401000_1.i4, (SkuPanelBaseWidget) awS12S0401000_1.l3, skuState, promotionLabel, 4));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS12S0401000_1 awS12S0401000_1, Object obj) {
        Integer numValueOf;
        DeliveryPanelState deliveryPanelState = (DeliveryPanelState) obj;
        C03F3 c03f3 = (C03F3) awS12S0401000_1.l0;
        PudoAddress pudoAddress = null;
        if (c03f3 != null) {
            numValueOf = Integer.valueOf(c03f3.LIZIZ);
        } else {
            numValueOf = null;
        }
        C03F3 c03f32 = (C03F3) awS12S0401000_1.l0;
        if (c03f32 != null) {
            pudoAddress = c03f32.LIZ;
        }
        return deliveryPanelState.copy(deliveryPanelState.changePage, deliveryPanelState.apply, (LogisticDTO) awS12S0401000_1.l1, deliveryPanelState.selectedShipToInfo, deliveryPanelState.addressRenderData, awS12S0401000_1.i4, (List) awS12S0401000_1.l2, deliveryPanelState.claimVoucherExceptionUX, deliveryPanelState.exposedItems, deliveryPanelState.exposedAddOnItems, deliveryPanelState.dispatchInfo, deliveryPanelState.shippingToAddressInfo, deliveryPanelState.logistics, deliveryPanelState.pdpLogisticModule, deliveryPanelState.privacyPolicyStatement, deliveryPanelState.shippingPolicyModule, deliveryPanelState.hasMapLocationChanged, deliveryPanelState.tab, pudoAddress, (List) awS12S0401000_1.l3, numValueOf, deliveryPanelState.savePickUpStatus, deliveryPanelState.savePickUpToast, deliveryPanelState.getPudoAddressStatus, deliveryPanelState.pudoSelectedLogistic, deliveryPanelState.centerAddress, deliveryPanelState.pudoSource, deliveryPanelState.changeAddressJumpSchema);
    }

    public static final Object invoke$3(AwS12S0401000_1 awS12S0401000_1, Object obj) {
        return C2262851Dhb.LIZ((C2262851Dhb) obj, null, null, null, null, null, null, null, null, null, null, new C03MY(new C833003Ng(((C013C) awS12S0401000_1.l0).element, 2), new C830003Mc(3, Integer.valueOf(awS12S0401000_1.i4), null, null, null, null, 122), (C03MQ) awS12S0401000_1.l2, ((C013C) awS12S0401000_1.l1).element, (C830103Md) awS12S0401000_1.l3, false, C03MZ.SINGLE, null, 352), 1023);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS12S0401000_1(int i, int i2, List<String> list, View view, PageFinder pageFinder, SkuPanelBaseWidget skuPanelBaseWidget) {
        super(1);
        this.$t = skuPanelBaseWidget;
        this.i4 = i;
        this.l0 = i2;
        this.l1 = list;
        this.l2 = view;
        this.l3 = pageFinder;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS12S0401000_1(C013C c013c, int i, C013C c013c2, C03MQ c03mq, C830103Md c830103Md, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c013c;
        this.i4 = i;
        this.l1 = c013c2;
        this.l2 = c03mq;
        this.l3 = c830103Md;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS12S0401000_1(C03F3 c03f3, C03F3 c03f32, LogisticDTO logisticDTO, int i, List<Object> list, List<Object> list2) {
        super(1);
        this.$t = list2;
        this.l0 = c03f3;
        this.l1 = c03f32;
        this.i4 = logisticDTO;
        this.l2 = i;
        this.l3 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS12S0401000_1(C03PI c03pi, C03PI c03pi2, List<? extends InterfaceC838503Pj> list, int i, PaymentMethodsData paymentMethodsData, Function1<? super PaymentInfo, Unit> function1) {
        super(1);
        this.$t = function1;
        this.l0 = c03pi;
        this.l1 = c03pi2;
        this.i4 = list;
        this.l2 = i;
        this.l3 = paymentMethodsData;
    }
}
