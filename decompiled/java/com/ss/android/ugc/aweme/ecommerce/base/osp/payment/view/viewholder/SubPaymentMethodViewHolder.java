package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder;

import X.C01GW;
import X.C0H9H;
import X.C13LE;
import X.C19719912Dl;
import X.C21588719eH;
import X.C452501pT;
import X.C861503Yf;
import X.C870703aj;
import X.C874003bG;
import X.C924703jR;
import X.C958103op;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ButtonStyle;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class SubPaymentMethodViewHolder extends ECJediViewHolder<C861503Yf> {
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
        C861503Yf c861503Yf = (C861503Yf) obj;
        ButtonStyle buttonStyleLJIIZILJ = null;
        if (this.LLJILJIL.LLLIIIIL(this.LLILLL + 1, false) != null) {
            c21588719eH = null;
        } else {
            c21588719eH = new C21588719eH(C958103op.LIZJ, 0, 0, 0, false, 0, true, 254);
        }
        C870703aj.LIZ(this.itemView, c21588719eH);
        this.itemView.setPadding(C0H9H.LIZIZ(16), this.itemView.getPaddingTop(), C0H9H.LIZIZ(16), this.itemView.getPaddingBottom());
        C874003bG c874003bG = (C874003bG) this.itemView;
        c874003bG.setPaymentViewModel(W5());
        c874003bG.setPaymentLogger(W5().LLJI);
        PaymentMethodsData paymentMethodsData = W5().LLJJIJIL;
        if (paymentMethodsData != null) {
            buttonStyleLJIIZILJ = paymentMethodsData.LJIIZILJ(null);
        }
        c874003bG.setStyle(buttonStyleLJIIZILJ);
        c874003bG.setPaymentViewModel(W5());
        c874003bG.setOnSubPaymentCheckChanged(new AwS367S0200000_1(this, c861503Yf, 315));
        c874003bG.setSubPromotionClickListener(new AwS580S0100000_1(this, 840));
        ElementDTO elementDTO = c861503Yf.LIZ;
        PaymentMethod paymentMethod = c861503Yf.LIZIZ;
        PaymentViewModel paymentViewModelW5 = W5();
        PaymentMethod paymentMethod2 = c861503Yf.LIZIZ;
        String str = c861503Yf.LIZ.id;
        if (str == null) {
            str = "";
        }
        c874003bG.LIZ(elementDTO, paymentMethod, paymentViewModelW5.pR2(paymentMethod2, str), c861503Yf.LIZJ);
    }

    public SubPaymentMethodViewHolder(ViewGroup viewGroup, C924703jR c924703jR) {
        super(new C874003bG(viewGroup.getContext()));
        this.LLJILJIL = c924703jR;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PaymentViewModel.class);
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 53));
    }
}
