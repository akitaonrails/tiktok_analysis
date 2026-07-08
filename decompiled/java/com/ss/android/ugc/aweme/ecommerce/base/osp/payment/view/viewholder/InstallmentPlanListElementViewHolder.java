package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder;

import X.C01GW;
import X.C03WK;
import X.C03YJ;
import X.C03ZD;
import X.C03ZQ;
import X.C13LE;
import X.C19719912Dl;
import X.C452501pT;
import X.C862603Yq;
import X.C862803Ys;
import X.C924703jR;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CciCashierDisplayType;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ButtonStyle;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import kotlin.jvm.internal.AwS245S0300000_1;
import kotlin.jvm.internal.AwS26S0310000_1;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS280S0300000_1;
import kotlin.jvm.internal.AwS402S0200000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS615S0100000_1;
import kotlin.jvm.internal.AwS650S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class InstallmentPlanListElementViewHolder extends ECJediViewHolder<C862603Yq> {
    public final C924703jR LLJILJIL;
    public final LifecycleOwner LLJILJILJ;
    public final C01GW LLJILLL;

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final PaymentViewModel W5() {
        return (PaymentViewModel) this.LLJILLL.getValue();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        C03ZQ c03zq;
        CciCashierDisplayType cciCashierDisplayType;
        boolean z;
        boolean z2;
        C862603Yq c862603Yq = (C862603Yq) obj;
        C03ZD c03zd = (C03ZD) this.itemView;
        boolean z3 = true;
        c03zd.setInPaymentFragmentPage(true);
        boolean zLIZ = C03WK.LIZ(W5().LLJ);
        PaymentMethod paymentMethod = c862603Yq.LIZIZ;
        boolean zLIZ2 = C03WK.LIZ(W5().LLJ);
        if (C03YJ.LIZJ(paymentMethod)) {
            if (paymentMethod.LJJJI() && !C862803Ys.LIZ().disableAnchorDualStyle) {
                z = true;
            } else {
                z = false;
            }
            if (!paymentMethod.LJJJI() && !C862803Ys.LIZ().disableNonAnchorDualStyle) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z && !z2) {
                c03zq = C03ZQ.NORMAL;
            } else {
                c03zq = C03ZQ.DOUBLE_COLUMN;
            }
        } else if (!C03YJ.LIZLLL(paymentMethod) && zLIZ2) {
            c03zq = C03ZQ.COMBINE_PAYMENT;
        } else {
            c03zq = C03ZQ.NORMAL;
        }
        c03zd.setDisplayMode(c03zq);
        if (c03zd.getDisplayMode() == C03ZQ.COMBINE_PAYMENT) {
            z3 = false;
        }
        c03zd.setSelectedFirstPlanByDefault(z3);
        c03zd.setInstallmentBreakdownIcons(W5().LLJJJJJIL);
        PaymentMethodsData paymentMethodsData = W5().LLJJIJIL;
        ButtonStyle buttonStyleLJIIZILJ = null;
        if (paymentMethodsData != null) {
            cciCashierDisplayType = paymentMethodsData.cciCashierDisplayType;
        } else {
            cciCashierDisplayType = null;
        }
        c03zd.setCciCashierDisplayType(cciCashierDisplayType);
        c03zd.setOnInstallmentPlanCheckChanged(new AwS280S0300000_1(c03zd, this, c862603Yq, 12));
        c03zd.setOnViewMoreSeparateInstallmentPlansClickListener(new AwS402S0200000_1(this, c862603Yq, 92));
        c03zd.setOnViewMoreInstallmentPlansClickListener(new AwS245S0300000_1(c03zd, this, c862603Yq, 40));
        c03zd.setPaymentLogger(W5().LLJI);
        c03zd.setPaymentViewModel(W5());
        PaymentMethodsData paymentMethodsData2 = W5().LLJJIJIL;
        if (paymentMethodsData2 != null) {
            buttonStyleLJIIZILJ = paymentMethodsData2.LJIIZILJ(null);
        }
        c03zd.setStyle(buttonStyleLJIIZILJ);
        withState(W5(), new AwS26S0310000_1(c862603Yq, zLIZ, this, c03zd, 7));
        c03zd.setOnPromotionClickListener(new AwS580S0100000_1(this, 830));
        c03zd.setOnInterestingFeePromotionClickListener(new AwS615S0100000_1(this, 205));
        c03zd.setOnInstallmentPromotionClickListener(new AwS650S0100000_1(this, 25));
        ElementDTO elementDTO = c862603Yq.LIZ;
        PaymentMethod paymentMethod2 = c862603Yq.LIZIZ;
        PaymentViewModel paymentViewModelW5 = W5();
        PaymentMethod paymentMethod3 = c862603Yq.LIZIZ;
        String str = c862603Yq.LIZ.id;
        if (str == null) {
            str = "";
        }
        c03zd.LIZ(elementDTO, paymentMethod2, paymentViewModelW5.pR2(paymentMethod3, str), c862603Yq.LIZJ);
    }

    public InstallmentPlanListElementViewHolder(ViewGroup viewGroup, C924703jR c924703jR, LifecycleOwner lifecycleOwner) {
        super(new C03ZD(viewGroup.getContext()));
        this.LLJILJIL = c924703jR;
        this.LLJILJILJ = lifecycleOwner;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PaymentViewModel.class);
        this.LLJILLL = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 44));
    }
}
