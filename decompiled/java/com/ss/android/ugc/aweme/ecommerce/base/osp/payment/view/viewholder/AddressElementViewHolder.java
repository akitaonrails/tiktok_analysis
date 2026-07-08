package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder;

import X.C01GW;
import X.C03Z0;
import X.C0H9H;
import X.C13LE;
import X.C19719912Dl;
import X.C21588719eH;
import X.C452501pT;
import X.C862703Yr;
import X.C870703aj;
import X.C924703jR;
import X.C942503mJ;
import X.C958103op;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class AddressElementViewHolder extends ECJediViewHolder<C03Z0> {
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
        C03Z0 c03z0 = (C03Z0) obj;
        if (this.LLJILJIL.LLLIIIIL(this.LLILLL + 1, false) != null) {
            c21588719eH = new C21588719eH(C958103op.LIZJ, 0, 0, 0, false, 0, this.LLJILJIL.LLLIIIIL(this.LLILLL + 1, false) instanceof C862703Yr, 254);
        } else {
            c21588719eH = new C21588719eH(C958103op.LIZJ, 0, 0, 0, false, 0, true, 254);
        }
        C870703aj.LIZ(this.itemView, c21588719eH);
        this.itemView.setPadding(C0H9H.LIZIZ(16), this.itemView.getPaddingTop(), C0H9H.LIZIZ(16), this.itemView.getPaddingBottom());
        C942503mJ c942503mJ = (C942503mJ) this.itemView;
        c942503mJ.setOnValueChange(new AwS367S0200000_1(this, c03z0, 304));
        c942503mJ.setOnUseShippingAddressChange(new AwS580S0100000_1(this, 827));
        c942503mJ.setOnRegionPanelStatus(W5().LLILZIL);
        c942503mJ.setShippingAddress(W5().LLILZLL);
        c942503mJ.setUseShippingAddress(W5().LLJILJILJ);
        c942503mJ.setLogger(W5().LLJI);
        ElementDTO elementDTO = c03z0.LIZ;
        PaymentMethod paymentMethod = c03z0.LIZIZ;
        PaymentViewModel paymentViewModelW5 = W5();
        PaymentMethod paymentMethod2 = c03z0.LIZIZ;
        String str = c03z0.LIZ.id;
        if (str == null) {
            str = "";
        }
        c942503mJ.LIZ(elementDTO, paymentMethod, paymentViewModelW5.pR2(paymentMethod2, str), c03z0.LIZJ);
    }

    public AddressElementViewHolder(ViewGroup viewGroup, C924703jR c924703jR) {
        super(new C942503mJ(viewGroup.getContext()));
        this.LLJILJIL = c924703jR;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PaymentViewModel.class);
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 39));
    }
}
