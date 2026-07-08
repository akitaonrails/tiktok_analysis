package kotlin.jvm.internal;

import X.C03PI;
import X.C03Y0;
import X.C09AY;
import X.C1AF0;
import X.C860903Xz;
import X.C921103ir;
import X.InterfaceC1631620sYq;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentHalfFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public class AwS183S0400000_1 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS183S0400000_1 awS183S0400000_1, Object obj, Object obj2, Object obj3) {
        List<PaymentElement> list = (List) obj2;
        String str = (String) obj3;
        if (!((Boolean) obj).booleanValue()) {
            C921103ir c921103ir = C921103ir.LIZ;
            c921103ir.getClass();
            if (C921103ir.LJII()) {
                Context context = ((C03PI) awS183S0400000_1.l0).LIZ;
                c921103ir.getClass();
                C921103ir.LIZLLL(context, "9900501", "order_submit", null, null);
            } else {
                try {
                    String string = ((C03PI) awS183S0400000_1.l0).LIZ.getResources().getString(2131832960);
                    if (string != null) {
                        ((C03PI) awS183S0400000_1.l0).LJIIJ(string);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1AF0.LIZJ("errorMsg null");
                }
            }
        } else {
            PaymentInfo paymentInfo = (PaymentInfo) awS183S0400000_1.l1;
            PaymentMethod paymentMethod = paymentInfo.paymentMethod;
            if (paymentMethod != null) {
                paymentMethod.LJIIIIZZ = str;
            }
            PaymentMethodInfo paymentMethodInfo = paymentInfo.paymentMethodInfo;
            if (paymentMethodInfo != null) {
                paymentMethodInfo.setPaymentElements(list);
            }
            ((C03PI) awS183S0400000_1.l0).LJII((PaymentInfo) awS183S0400000_1.l1, null, (Boolean) awS183S0400000_1.l2, ((PaymentHalfFragment) awS183S0400000_1.l3).getView(), new AwS545S0100000_1((PaymentHalfFragment) awS183S0400000_1.l3, 934));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS183S0400000_1 awS183S0400000_1, Object obj, Object obj2, Object obj3) {
        PaymentMethodInfo paymentMethodInfo;
        PaymentInfo paymentInfo = (PaymentInfo) obj2;
        List<PaymentElement> list = null;
        if (!((Boolean) obj).booleanValue()) {
            C921103ir c921103ir = C921103ir.LIZ;
            c921103ir.getClass();
            if (C921103ir.LJII()) {
                Context context = ((C03PI) awS183S0400000_1.l0).LIZ;
                c921103ir.getClass();
                C921103ir.LIZLLL(context, "9900502", "order_submit", null, null);
            } else {
                try {
                    String string = ((C03PI) awS183S0400000_1.l0).LIZ.getResources().getString(2131832779);
                    if (string != null) {
                        ((C03PI) awS183S0400000_1.l0).LJIIJ(string);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1AF0.LIZJ("errorMsg null");
                }
            }
        } else {
            if (paymentInfo != null && (paymentMethodInfo = ((PaymentInfo) awS183S0400000_1.l1).paymentMethodInfo) != null) {
                PaymentMethodInfo paymentMethodInfo2 = paymentInfo.paymentMethodInfo;
                if (paymentMethodInfo2 != null) {
                    list = paymentMethodInfo2.paymentElements;
                }
                paymentMethodInfo.setPaymentElements(list);
            }
            ((C03PI) awS183S0400000_1.l0).LJII((PaymentInfo) awS183S0400000_1.l1, null, (Boolean) awS183S0400000_1.l2, ((PaymentHalfFragment) awS183S0400000_1.l3).getView(), new AwS545S0100000_1((PaymentHalfFragment) awS183S0400000_1.l3, 1249));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS183S0400000_1 awS183S0400000_1, Object obj, Object obj2, Object obj3) {
        C03Y0 c03y0 = C03Y0.LIZ;
        Context context = (Context) awS183S0400000_1.l0;
        BillInfoData billInfoData = (BillInfoData) awS183S0400000_1.l1;
        AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1((PaymentHalfFragment) awS183S0400000_1.l3, 1537);
        Function1 function1 = (Function1) awS183S0400000_1.l2;
        c03y0.getClass();
        C03Y0.LIZIZ(context, (PaymentInfo) obj, billInfoData, awS545S0100000_1, function1);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS183S0400000_1(C03PI c03pi, PaymentInfo paymentInfo, Boolean bool, PaymentHalfFragment paymentHalfFragment, int i) {
        super(3);
        this.$t = i;
        this.l0 = c03pi;
        this.l1 = paymentInfo;
        this.l2 = bool;
        this.l3 = paymentHalfFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS183S0400000_1(Context context, Context context2, BillInfoData billInfoData, Function1<? super C860903Xz, Unit> function1, PaymentHalfFragment paymentHalfFragment) {
        super(3);
        this.$t = paymentHalfFragment;
        this.l0 = context;
        this.l1 = context2;
        this.l2 = billInfoData;
        this.l3 = function1;
    }
}
