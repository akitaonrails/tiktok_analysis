package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder;

import X.C01GW;
import X.C0H9H;
import X.C13LE;
import X.C19719912Dl;
import X.C21588719eH;
import X.C452501pT;
import X.C866803a6;
import X.C870703aj;
import X.C903603g2;
import X.C924703jR;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import java.util.List;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS545S0100000_1;
import ola.g;
import p8b.c;

/* JADX INFO: loaded from: classes2.dex */
public final class BalanceElementViewHolder extends ECJediViewHolder<C866803a6> implements c {
    public final C924703jR LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;

    @Override // p8b.c
    public final String getViewName() {
        return "BalanceElementViewHolder";
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        boolean z;
        g gVar;
        List<InstallmentPlan> list;
        C866803a6 c866803a6 = (C866803a6) obj;
        String str = c866803a6.LIZIZ.balance;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        this.itemView.setPadding(C0H9H.LIZIZ(16), this.itemView.getPaddingTop(), C0H9H.LIZIZ(16), this.itemView.getPaddingBottom());
        InstallmentInfo installmentInfo = c866803a6.LIZIZ.installmentInfo;
        if ((installmentInfo == null || ((list = installmentInfo.installmentPlans) != null && list.isEmpty())) && (((gVar = (g) this.LLJILLL.getValue()) == null || gVar.LJIIL()) && !z)) {
            C870703aj.LIZ(this.itemView, new C21588719eH(0, 0, 0, 0, true, C0H9H.LIZIZ(16), false, 319));
        }
        C903603g2 c903603g2 = (C903603g2) this.itemView;
        c903603g2.setHasCheckedPaymentMethod(c866803a6.LIZLLL);
        c903603g2.setTrackParams(((PaymentViewModel) this.LLJILJILJ.getValue()).LLJJIJIIJIL);
        c903603g2.setPaymentLogger(((PaymentViewModel) this.LLJILJILJ.getValue()).LLJI);
        c903603g2.setPaySource(this.LLJILJIL.LLILZLL.paySource);
        ElementDTO elementDTO = c866803a6.LIZ;
        PaymentMethod paymentMethod = c866803a6.LIZIZ;
        PaymentViewModel paymentViewModel = (PaymentViewModel) this.LLJILJILJ.getValue();
        PaymentMethod paymentMethod2 = c866803a6.LIZIZ;
        String str2 = c866803a6.LIZ.id;
        if (str2 == null) {
            str2 = "";
        }
        c903603g2.LIZ(elementDTO, paymentMethod, paymentViewModel.pR2(paymentMethod2, str2), c866803a6.LIZJ);
    }

    public BalanceElementViewHolder(ViewGroup viewGroup, C924703jR c924703jR) {
        super(new C903603g2(viewGroup.getContext()));
        this.LLJILJIL = c924703jR;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PaymentViewModel.class);
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 40));
        this.LLJILLL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1245));
    }
}
