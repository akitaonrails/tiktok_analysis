package com.ss.android.ugc.aweme.ecommerce.base.payment.viewholder.cashier;

import X.C01GW;
import X.C03S0;
import X.C03YP;
import X.C0H9H;
import X.C13LE;
import X.C1440005kM;
import X.C19719912Dl;
import X.C452501pT;
import X.C7830034a;
import X.C786410Ut5;
import X.C862703Yr;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcomPaymentPromotionMergeModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;
import g1c.AjS60S0100000_1;
import java.util.Collections;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class USSaveElementViewHolder extends ECJediViewHolder<C03YP> {
    public final C01GW LLJILJIL;

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public USSaveElementViewHolder(ViewGroup viewGroup) {
        super(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.aqq, viewGroup, false));
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PaymentViewModel.class);
        this.LLJILJIL = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 57));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void W5(boolean z) {
        PaymentViewModel paymentViewModel = (PaymentViewModel) this.LLJILJIL.getValue();
        C862703Yr c862703Yr = (C862703Yr) this.LLILLJJLI;
        PaymentMethod paymentMethod = c862703Yr.LIZIZ;
        String str = c862703Yr.LIZ.id;
        if (str == null) {
            str = "";
        }
        paymentViewModel.UR2(paymentMethod, str, Collections.singletonList(new PaymentElement("need_save", null, String.valueOf(z), null, Boolean.FALSE)));
        EcomPaymentPromotionMergeModel ecomPaymentPromotionMergeModel = C03S0.LIZ;
        if (C03S0.LIZ(((C862703Yr) this.LLILLJJLI).LIZIZ.id)) {
            ((C862703Yr) this.LLILLJJLI).LIZIZ.LJIIJJI = Boolean.valueOf(z);
            C1440005kM.LIZ(new C7830034a(Boolean.valueOf(z)));
            JediViewModel jediViewModel = (JediViewModel) this.LLJILJIL.getValue();
            Boolean boolValueOf = Boolean.valueOf(z);
            jediViewModel.getClass();
            jediViewModel.setState(new AwS580S0100000_1(boolValueOf, 163));
        }
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        C03YP c03yp = (C03YP) obj;
        this.itemView.setPadding(C0H9H.LIZIZ(60), this.itemView.getPaddingTop(), C0H9H.LIZIZ(16), this.itemView.getPaddingBottom());
        ((TextView) this.itemView.findViewById(R.id.z6k)).setText(c03yp.LIZ.displayName);
        withState((JediViewModel) this.LLJILJIL.getValue(), new AwS367S0200000_1(c03yp, this, 221));
        C786410Ut5.I7(new AjS60S0100000_1(this, 75), this.itemView.findViewById(R.id.cme));
    }
}
