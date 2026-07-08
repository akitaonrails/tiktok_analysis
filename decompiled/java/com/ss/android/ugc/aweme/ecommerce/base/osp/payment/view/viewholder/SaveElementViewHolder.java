package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder;

import X.C01GW;
import X.C03S0;
import X.C03YP;
import X.C13LE;
import X.C1440005kM;
import X.C19719912Dl;
import X.C452501pT;
import X.C7830034a;
import X.C862703Yr;
import X.C926003je;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcomPaymentPromotionMergeModel;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class SaveElementViewHolder extends ECJediViewHolder<C03YP> {
    public final C01GW LLJILJIL;

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final PaymentViewModel W5() {
        return (PaymentViewModel) this.LLJILJIL.getValue();
    }

    public SaveElementViewHolder(ViewGroup viewGroup) {
        super(new C926003je(viewGroup.getContext()));
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PaymentViewModel.class);
        this.LLJILJIL = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 51));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void X5(boolean z) {
        EcomPaymentPromotionMergeModel ecomPaymentPromotionMergeModel = C03S0.LIZ;
        if (C03S0.LIZ(((C862703Yr) this.LLILLJJLI).LIZIZ.id)) {
            ((C862703Yr) this.LLILLJJLI).LIZIZ.LJIIJJI = Boolean.valueOf(z);
            C1440005kM.LIZ(new C7830034a(Boolean.valueOf(z)));
            PaymentViewModel paymentViewModelW5 = W5();
            Boolean boolValueOf = Boolean.valueOf(z);
            paymentViewModelW5.getClass();
            paymentViewModelW5.setState(new AwS580S0100000_1(boolValueOf, 163));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0047  */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void rr(java.lang.Object r13) {
        /*
            r12 = this;
            X.03YP r13 = (X.C03YP) r13
            android.view.View r4 = r12.itemView
            r0 = 60
            int r3 = X.C0H9H.LIZIZ(r0)
            android.view.View r0 = r12.itemView
            int r2 = r0.getPaddingTop()
            r0 = 16
            int r1 = X.C0H9H.LIZIZ(r0)
            android.view.View r0 = r12.itemView
            int r0 = r0.getPaddingBottom()
            r4.setPadding(r3, r2, r1, r0)
            android.view.View r0 = r12.itemView
            int r4 = X.C958103op.LIZJ
            X.19eH r3 = new X.19eH
            r5 = 0
            r2 = 0
            r7 = 80
            r10 = 1
            r11 = 238(0xee, float:3.34E-43)
            r6 = r5
            r8 = r5
            r9 = r5
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            X.C870703aj.LIZ(r0, r3)
            android.view.View r5 = r12.itemView
            X.03je r5 = (X.C926003je) r5
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = r13.LIZIZ
            java.lang.String r1 = r0.id
            if (r1 == 0) goto L8a
            java.lang.String r0 = "pm_pi_ew_paypal_"
            boolean r0 = kotlin.text.u.LJJIIJZLJL(r1, r0, r2)
            if (r0 != r10) goto L8a
        L47:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel r2 = r12.W5()
            kotlin.jvm.internal.AwS210S0300000_1 r1 = new kotlin.jvm.internal.AwS210S0300000_1
            r0 = 97
            r1.<init>(r5, r12, r13, r0)
            r12.withState(r2, r1)
        L55:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel r0 = r12.W5()
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData r0 = r0.LLJJIJIL
            if (r0 == 0) goto L88
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ButtonInfo r0 = r0.cashierButtonInfo
        L5f:
            r5.setButtonInfo(r0)
            kotlin.jvm.internal.AwS210S0300000_1 r1 = new kotlin.jvm.internal.AwS210S0300000_1
            r0 = 98
            r1.<init>(r5, r12, r13, r0)
            r5.setOnValueChange(r1)
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO r4 = r13.LIZ
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r3 = r13.LIZIZ
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel r2 = r12.W5()
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r1 = r13.LIZIZ
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO r0 = r13.LIZ
            java.lang.String r0 = r0.id
            if (r0 != 0) goto L7e
            java.lang.String r0 = ""
        L7e:
            java.util.List r1 = r2.pR2(r1, r0)
            java.lang.String r0 = r13.LIZJ
            r5.LIZ(r4, r3, r1, r0)
            return
        L88:
            r0 = 0
            goto L5f
        L8a:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcomPaymentPromotionMergeModel r0 = X.C03S0.LIZ
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = r13.LIZIZ
            boolean r0 = X.C03S0.LIZJ(r0)
            if (r0 == 0) goto L55
            goto L47
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder.SaveElementViewHolder.rr(java.lang.Object):void");
    }
}
