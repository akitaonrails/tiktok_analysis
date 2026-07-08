package com.ss.android.ugc.aweme.ecommerce.base.payment.viewholder.cashier;

import X.C01GW;
import X.C0H9H;
import X.C13LE;
import X.C19719912Dl;
import X.C452501pT;
import X.C869603aY;
import X.C941803mC;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import kotlin.jvm.internal.AwS210S0300000_1;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class USCashierNormalElementVH extends ECJediViewHolder<C869603aY> {
    public final C01GW LLJILJIL;

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final PaymentViewModel W5() {
        return (PaymentViewModel) this.LLJILJIL.getValue();
    }

    public USCashierNormalElementVH(ViewGroup viewGroup) {
        super(new C941803mC(viewGroup.getContext()));
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PaymentViewModel.class);
        this.LLJILJIL = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 55));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        C941803mC c941803mC;
        C869603aY c869603aY = (C869603aY) obj;
        this.itemView.setPadding(C0H9H.LIZIZ(60), this.itemView.getPaddingTop(), C0H9H.LIZIZ(16), C0H9H.LIZIZ(12));
        View view = this.itemView;
        if ((view instanceof C941803mC) && (c941803mC = (C941803mC) view) != null) {
            c941803mC.setOnValueChange(new AwS367S0200000_1(this, c869603aY, 219));
            c941803mC.setOnVerify(new AwS210S0300000_1(this, c869603aY, c941803mC, 68));
            c941803mC.setOnErrorClear(new AwS545S0100000_1(c869603aY, 1573));
            c941803mC.setOnFocusChange(new AwS367S0200000_1(this, c941803mC, 220));
            ElementDTO elementDTO = c869603aY.LIZ;
            PaymentMethod paymentMethod = c869603aY.LIZIZ;
            PaymentViewModel paymentViewModelW5 = W5();
            PaymentMethod paymentMethod2 = c869603aY.LIZIZ;
            String str = c869603aY.LIZ.id;
            if (str == null) {
                str = "";
            }
            c941803mC.LIZ(elementDTO, paymentMethod, paymentViewModelW5.pR2(paymentMethod2, str), c869603aY.LIZJ);
            if (Intrinsics.LJFF(c869603aY.LIZ.id, "eg_ccdc_global_cvv")) {
                c941803mC.getInputView().setInputType(2);
                c941803mC.getInputView().setMaxLength(4);
                c941803mC.getInputView().setInputTextEncrypted(true);
            } else {
                c941803mC.getInputView().setInputType(1);
                c941803mC.getInputView().setMaxLength(Integer.MAX_VALUE);
            }
        }
    }
}
