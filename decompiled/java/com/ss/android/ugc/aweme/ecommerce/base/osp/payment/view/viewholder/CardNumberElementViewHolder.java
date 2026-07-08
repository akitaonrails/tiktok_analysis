package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder;

import X.C01GW;
import X.C03Z0;
import X.C0H9H;
import X.C13LE;
import X.C19719912Dl;
import X.C21588719eH;
import X.C452501pT;
import X.C862703Yr;
import X.C866903a7;
import X.C870703aj;
import X.C924703jR;
import X.C941003m4;
import X.C958103op;
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

/* JADX INFO: loaded from: classes2.dex */
public final class CardNumberElementViewHolder extends ECJediViewHolder<C866903a7> {
    public final C924703jR LLJILJIL;
    public final C01GW LLJILJILJ;

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final PaymentViewModel W5() {
        return (PaymentViewModel) this.LLJILJILJ.getValue();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        C21588719eH c21588719eH;
        int i;
        C866903a7 c866903a7 = (C866903a7) obj;
        this.itemView.setPadding(C0H9H.LIZIZ(16), this.itemView.getPaddingTop(), C0H9H.LIZIZ(16), this.itemView.getPaddingBottom());
        if (this.LLJILJIL.LLLIIIIL(this.LLILLL + 1, false) != null) {
            boolean z = this.LLJILJIL.LLLIIIIL(this.LLILLL + 1, false) instanceof C862703Yr;
            if (this.LLJILJIL.LLLIIIIL(this.LLILLL + 1, false) instanceof C03Z0) {
                i = C958103op.LIZLLL;
            } else {
                i = C958103op.LIZJ;
            }
            c21588719eH = new C21588719eH(i, 0, 0, 0, false, 0, z, 254);
        } else {
            c21588719eH = new C21588719eH(C958103op.LIZJ, 0, 0, 0, false, 0, true, 254);
        }
        C870703aj.LIZ(this.itemView, c21588719eH);
        C941003m4 c941003m4 = (C941003m4) this.itemView;
        c941003m4.setFocusChange(new AwS210S0300000_1(c941003m4, this, c866903a7, 90));
        c941003m4.setOnPaymentMethodIdentify(new AwS367S0200000_1(this, c866903a7, 305));
        c941003m4.setOnValueChange(new AwS210S0300000_1(c941003m4, this, c866903a7, 91));
        c941003m4.setOnVerify(new AwS210S0300000_1(c941003m4, this, c866903a7, 92));
        c941003m4.setOnErrorClear(new AwS545S0100000_1(c866903a7, 1694));
        c941003m4.setRequestOcr(new AwS545S0100000_1(this, 1696));
        c941003m4.setPaymentLogger(W5().LLJI);
        ElementDTO elementDTO = c866903a7.LIZ;
        PaymentMethod paymentMethod = c866903a7.LIZIZ;
        PaymentViewModel paymentViewModelW5 = W5();
        PaymentMethod paymentMethod2 = c866903a7.LIZIZ;
        String str = c866903a7.LIZ.id;
        if (str == null) {
            str = "";
        }
        c941003m4.LIZ(elementDTO, paymentMethod, paymentViewModelW5.pR2(paymentMethod2, str), c866903a7.LIZJ);
    }

    public CardNumberElementViewHolder(ViewGroup viewGroup, C924703jR c924703jR) {
        super(new C941003m4(viewGroup.getContext()));
        this.LLJILJIL = c924703jR;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PaymentViewModel.class);
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 41));
    }
}
