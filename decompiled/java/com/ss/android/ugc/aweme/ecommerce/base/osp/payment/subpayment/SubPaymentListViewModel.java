package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.subpayment;

import X.C03Q4;
import X.C03QF;
import X.C03WK;
import X.C13LP;
import X.C259800zU;
import X.C837103Ov;
import X.C926703jl;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS210S0300000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SubPaymentListViewModel extends AssemViewModel<C926703jl> {
    public EnterParams LL;
    public final C837103Ov LLILLJJLI = new C837103Ov();
    public String LLILLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C926703jl(0);
    }

    public final PaymentMethod vQ2(PaymentMethod paymentMethod, String str) {
        EnterParams enterParams;
        PaymentInfo paymentInfo;
        PaymentInfo paymentInfo2;
        if (C03WK.LIZ(this.LL) && (enterParams = this.LL) != null && (paymentInfo = enterParams.paymentInfo) != null && paymentInfo.LIZIZ()) {
            C03Q4 c03q4 = C03Q4.LIZ;
            EnterParams enterParams2 = this.LL;
            if (enterParams2 != null) {
                paymentInfo2 = enterParams2.paymentInfo;
            } else {
                paymentInfo2 = null;
            }
            PaymentMethod paymentMethodLJIIJJI = c03q4.LJIIJJI(paymentMethod, c03q4.LJIIL(paymentInfo2, this.LLILLL), str);
            if (paymentMethodLJIIJJI != null) {
                return paymentMethodLJIIJJI;
            }
        }
        return paymentMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod] */
    public final void wQ2(PaymentMethod paymentMethod, String str, EnterParams enterParams, boolean z, String str2) {
        List listLIZJ;
        T next;
        ?? r2;
        Availability availability;
        this.LL = enterParams;
        this.LLILLL = str2;
        List<PaymentMethod> list = paymentMethod.subPaymentMethods;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (PaymentMethod paymentMethod2 : list) {
                if (paymentMethod2.LIZ()) {
                    arrayList.add(paymentMethod2);
                }
            }
            listLIZJ = C03QF.LIZJ(arrayList);
        } else {
            listLIZJ = null;
        }
        C259800zU c259800zU = new C259800zU();
        if (listLIZJ != null) {
            Iterator it2 = listLIZJ.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(((PaymentMethod) next).id, str)) {
                        break;
                    }
                } else {
                    next = 0;
                    break;
                }
            }
        } else {
            next = 0;
        }
        c259800zU.element = next;
        if (next == 0 && z && listLIZJ != null && (r2 = (PaymentMethod) C13LP.LJJJLL(listLIZJ)) != 0 && (availability = r2.availability) != null && Intrinsics.LJFF(availability.isAvailable(), Boolean.TRUE)) {
            c259800zU.element = r2;
        }
        setState(new AwS210S0300000_1(paymentMethod, (PaymentMethod) listLIZJ, (List<PaymentMethod>) c259800zU, (C259800zU<PaymentMethod>) 35));
    }
}
