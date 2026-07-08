package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder;

import X.C01GW;
import X.C03Z0;
import X.C0H9H;
import X.C13LE;
import X.C19719912Dl;
import X.C21588719eH;
import X.C452501pT;
import X.C862703Yr;
import X.C869503aX;
import X.C870703aj;
import X.C924703jR;
import X.C941203m6;
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
public final class DateElementViewHolder extends ECJediViewHolder<C869503aX> {
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
        C869503aX c869503aX = (C869503aX) obj;
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
        this.itemView.setPadding(C0H9H.LIZIZ(16), this.itemView.getPaddingTop(), C0H9H.LIZIZ(16), this.itemView.getPaddingBottom());
        C941203m6 c941203m6 = (C941203m6) this.itemView;
        c941203m6.setFocusChange(new AwS367S0200000_1(this, c941203m6, 309));
        c941203m6.setOnValueChange(new AwS210S0300000_1(c941203m6, this, c869503aX, 94));
        c941203m6.setOnVerify(new AwS210S0300000_1(c941203m6, this, c869503aX, 95));
        c941203m6.setOnErrorClear(new AwS545S0100000_1(c869503aX, 1698));
        ElementDTO elementDTO = c869503aX.LIZ;
        PaymentMethod paymentMethod = c869503aX.LIZIZ;
        PaymentViewModel paymentViewModelW5 = W5();
        PaymentMethod paymentMethod2 = c869503aX.LIZIZ;
        String str = c869503aX.LIZ.id;
        if (str == null) {
            str = "";
        }
        c941203m6.LIZ(elementDTO, paymentMethod, paymentViewModelW5.pR2(paymentMethod2, str), c869503aX.LIZJ);
        c941203m6.setPaymentLogger(W5().LLJI);
    }

    public DateElementViewHolder(ViewGroup viewGroup, C924703jR c924703jR) {
        super(new C941203m6(viewGroup.getContext()));
        this.LLJILJIL = c924703jR;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PaymentViewModel.class);
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 42));
    }
}
