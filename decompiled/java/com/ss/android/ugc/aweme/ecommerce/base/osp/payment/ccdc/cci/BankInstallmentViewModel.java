package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.cci;

import X.C847703Sx;
import X.C872803b4;
import X.C873003b6;
import X.InterfaceC0148002o;
import X.InterfaceC1891350zJl;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ButtonStyle;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class BankInstallmentViewModel extends AssemViewModel<C872803b4> {
    public ButtonStyle LL;
    public EnterParams LLILLJJLI;
    public PaymentMethod LLILLL;
    public PaymentInfo LLILZ;
    public PaymentInfo LLILZIL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C872803b4(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan xQ2() {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r1 = r5.LLILLL
            r4 = 0
            if (r1 != 0) goto L6
            return r4
        L6:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r0 = r5.LLILZ
            if (r0 != 0) goto Lb
            return r4
        Lb:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentInfo r0 = r1.installmentInfo
            if (r0 == 0) goto L13
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan> r2 = r0.installmentPlans
            if (r2 != 0) goto L21
        L13:
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentInfo> r0 = r1.installmentInfoList
            if (r0 == 0) goto L62
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentInfo r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentInfo) r0
            if (r0 == 0) goto L62
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan> r2 = r0.installmentPlans
        L21:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r0 = r5.LLILZ
            if (r0 == 0) goto L55
            boolean r1 = r0.LIZIZ()
            r0 = 1
            if (r1 != r0) goto L55
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r0 = r5.LLILZ
            if (r0 == 0) goto L60
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo r0 = r0.LIZJ
            if (r0 == 0) goto L60
            java.lang.String r3 = r0.tenure
        L36:
            if (r2 == 0) goto L54
            java.util.Iterator r2 = r2.iterator()
        L3c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L52
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan) r0
            java.lang.String r0 = r0.tenure
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r3)
            if (r0 == 0) goto L3c
            r4 = r1
        L52:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan r4 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan) r4
        L54:
            return r4
        L55:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r0 = r5.LLILZ
            if (r0 == 0) goto L60
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo r0 = r0.paymentMethodInfo
            if (r0 == 0) goto L60
            java.lang.String r3 = r0.tenure
            goto L36
        L60:
            r3 = r4
            goto L36
        L62:
            r2 = r4
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.cci.BankInstallmentViewModel.xQ2():com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan");
    }

    public final int vQ2(C873003b6 c873003b6) {
        InterfaceC1891350zJl next;
        C847703Sx c847703Sx;
        Iterator<InterfaceC1891350zJl> it2 = getState().LLILLJJLI.iterator();
        while (true) {
            String str = null;
            if (it2.hasNext()) {
                next = it2.next();
                InterfaceC1891350zJl interfaceC1891350zJl = next;
                if (interfaceC1891350zJl instanceof C847703Sx) {
                    String str2 = ((C847703Sx) interfaceC1891350zJl).LL.LIZJ;
                    if (c873003b6 != null) {
                        str = c873003b6.LIZJ;
                    }
                    if (Intrinsics.LJFF(str2, str)) {
                        break;
                    }
                }
            } else {
                next = null;
                break;
            }
        }
        if (!(next instanceof C847703Sx) || (c847703Sx = (C847703Sx) next) == null) {
            return 0;
        }
        return c847703Sx.LLILLJJLI;
    }

    public static int wQ2(C873003b6 c873003b6, InstallmentPlan installmentPlan) {
        String str;
        List<InstallmentPlan> list = c873003b6.LJ.installmentPlans;
        int i = 0;
        if (list == null) {
            return 0;
        }
        Iterator<InstallmentPlan> it2 = list.iterator();
        while (it2.hasNext()) {
            String str2 = it2.next().tenure;
            if (installmentPlan != null) {
                str = installmentPlan.tenure;
            } else {
                str = null;
            }
            if (!Intrinsics.LJFF(str2, str)) {
                i++;
            } else {
                return i;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x01c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void yQ2(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.cci.BankInstallmentViewModel r23, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r24, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InterestFeePromotion r25, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan r26, boolean r27, kotlin.jvm.functions.Function1 r28, int r29) {
        /*
            Method dump skipped, instruction units count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.cci.BankInstallmentViewModel.yQ2(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.cci.BankInstallmentViewModel, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InterestFeePromotion, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan, boolean, kotlin.jvm.functions.Function1, int):void");
    }
}
