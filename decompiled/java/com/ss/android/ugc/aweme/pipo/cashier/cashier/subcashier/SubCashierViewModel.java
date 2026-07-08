package com.ss.android.ugc.aweme.pipo.cashier.cashier.subcashier;

import X.C01GW;
import X.C13BV;
import X.C15438062q;
import X.C1709570uaZ;
import X.C1710030ubJ;
import X.C1710230ubd;
import X.C452501pT;
import X.InterfaceC0148002o;
import X.InterfaceC1709390uaH;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class SubCashierViewModel extends AssemViewModel<C1710230ubd> implements InterfaceC1709390uaH {
    public static final /* synthetic */ int LLILZ = 0;
    public SubCashierEnterParams LL;
    public SubCashierFragment LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1095));

    @Override // X.InterfaceC1709390uaH
    public final void c3() {
    }

    @Override // X.InterfaceC1709390uaH
    public final void pP1() {
    }

    @Override // X.InterfaceC1709390uaH
    public final void XX1() {
        SubCashierEnterParams subCashierEnterParams = this.LL;
        if (subCashierEnterParams == null || subCashierEnterParams.paymentData == null) {
            return;
        }
        setStateImmediate(new AwS605S0100000_26(this, 358));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1710230ubd(0);
    }

    public final List<C1710030ubJ> vQ2() {
        C1709570uaZ c1709570uaZ;
        PaymentOption paymentOption;
        List<PaymentOption> list;
        SubCashierEnterParams subCashierEnterParams = this.LL;
        if (subCashierEnterParams == null || (c1709570uaZ = subCashierEnterParams.paymentData) == null || (paymentOption = subCashierEnterParams.parentPaymentOption) == null || (list = paymentOption.LIZLLL) == null) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (PaymentOption paymentOption2 : list) {
            SubCashierEnterParams subCashierEnterParams2 = this.LL;
            Intrinsics.LJFF(subCashierEnterParams2 != null ? subCashierEnterParams2.defaultCheckedSubPaymentOptionKey : null, paymentOption2.LIZ);
            c1709570uaZ.LJJIZ(paymentOption2);
            arrayList.add(new C1710030ubJ(paymentOption2));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x000f A[PHI: r7
      0x000f: PHI (r7v5 java.lang.String) = (r7v2 java.lang.String), (r7v3 java.lang.String), (r7v0 java.lang.String) binds: [B:53:0x0084, B:47:0x0077, B:7:0x000d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void wQ2(java.lang.String r7) {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.pipo.cashier.cashier.subcashier.SubCashierEnterParams r0 = r6.LL
            r5 = 0
            if (r0 == 0) goto L8f
            X.0uaZ r4 = r0.paymentData
        L7:
            if (r7 == 0) goto L4a
            int r0 = r7.length()
            if (r0 <= 0) goto L4a
        Lf:
            com.ss.android.ugc.aweme.pipo.cashier.cashier.subcashier.SubCashierFragment r0 = r6.LLILLJJLI
            if (r0 == 0) goto L1a
            kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r0 = r0.LLJJJIL
            if (r0 == 0) goto L1a
            r0.invoke(r7)
        L1a:
            if (r4 == 0) goto L45
            com.ss.android.ugc.aweme.pipo.cashier.common.model.PIPOPaymentOptionSource r0 = r4.LJIILIIL
            if (r0 == 0) goto L45
            com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption r3 = r0.LJ(r7)
            if (r3 == 0) goto L45
            X.01GW r0 = r6.LLILLL
            java.lang.Object r2 = r0.getValue()
            X.0uae r2 = (X.C1709620uae) r2
            com.ss.android.ugc.aweme.pipo.cashier.cashier.subcashier.SubCashierEnterParams r0 = r6.LL
            if (r0 == 0) goto L3e
            com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption r0 = r0.parentPaymentOption
            if (r0 == 0) goto L3e
            com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PODaInfo r0 = r0.trackInfo
            if (r0 == 0) goto L3e
            java.lang.String r1 = r0.optionName
            if (r1 != 0) goto L40
        L3e:
            java.lang.String r1 = ""
        L40:
            java.lang.String r0 = "continue"
            X.C1709620uae.LIZLLL(r2, r0, r1, r3)
        L45:
            com.ss.android.ugc.aweme.pipo.cashier.cashier.subcashier.SubCashierEnterParams r0 = r6.LL
            if (r0 != 0) goto L92
            return
        L4a:
            com.ss.android.ugc.aweme.pipo.cashier.cashier.subcashier.SubCashierEnterParams r0 = r6.LL
            if (r0 == 0) goto L45
            X.0uaZ r3 = r0.paymentData
            if (r3 == 0) goto L45
            com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption r0 = r0.parentPaymentOption
            if (r0 == 0) goto L7c
            java.util.List<com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption> r0 = r0.LIZLLL
            if (r0 == 0) goto L7c
            java.util.Iterator r2 = r0.iterator()
        L5e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L7a
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption r0 = (com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption) r0
            boolean r0 = r3.LJJIZ(r0)
            if (r0 == 0) goto L5e
        L71:
            com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption r1 = (com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption) r1
            if (r1 == 0) goto L7c
            java.lang.String r7 = r1.LIZ
        L77:
            if (r7 == 0) goto L45
            goto Lf
        L7a:
            r1 = r5
            goto L71
        L7c:
            com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption r0 = r3.LJJIJIIJI()
            if (r0 == 0) goto L86
            java.lang.String r7 = r0.LIZ
            if (r7 != 0) goto Lf
        L86:
            com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption r0 = r3.LJJIJ()
            if (r0 == 0) goto L45
            java.lang.String r7 = r0.LIZ
            goto L77
        L8f:
            r4 = r5
            goto L7
        L92:
            java.lang.Boolean r1 = r0.returnPreviousPage
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto La9
            X.0ubc r2 = X.EnumC1710220ubc.BACK_TO_PREVIOUS
        L9e:
            kotlin.jvm.internal.AwS605S0100000_26 r1 = new kotlin.jvm.internal.AwS605S0100000_26
            r0 = 357(0x165, float:5.0E-43)
            r1.<init>(r2, r0)
            r6.setState(r1)
            return
        La9:
            X.0ubc r2 = X.EnumC1710220ubc.DISMISS
            goto L9e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.pipo.cashier.cashier.subcashier.SubCashierViewModel.wQ2(java.lang.String):void");
    }
}
