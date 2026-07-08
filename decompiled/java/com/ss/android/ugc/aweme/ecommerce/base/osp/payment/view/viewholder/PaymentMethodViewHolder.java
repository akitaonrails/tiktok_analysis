package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder;

import X.C01GW;
import X.C03Q4;
import X.C03SM;
import X.C03WK;
import X.C03XU;
import X.C03YJ;
import X.C03Z1;
import X.C03ZA;
import X.C0H9H;
import X.C0PEM;
import X.C13LE;
import X.C19719912Dl;
import X.C1DFH;
import X.C2107308Nj;
import X.C23250099c;
import X.C452501pT;
import X.C703302op;
import X.C817503Hh;
import X.C834903Nz;
import X.C924703jR;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentTip;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ButtonStyle;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import kotlin.jvm.internal.AwS100S0400000_1;
import kotlin.jvm.internal.AwS130S0400000_1;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS437S0200000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS615S0100000_1;
import kotlin.jvm.internal.Intrinsics;
import ola.j;
import oqa.h;
import p8b.c;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentMethodViewHolder extends ECJediViewHolder<C03ZA> implements c {
    public final C924703jR LLJILJIL;
    public final LifecycleOwner LLJILJILJ;
    public final C01GW LLJILLL;

    @Override // p8b.c
    public final String getViewName() {
        return "PaymentMethodViewHolder";
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final PaymentViewModel W5() {
        return (PaymentViewModel) this.LLJILLL.getValue();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        boolean z;
        ButtonStyle buttonStyleLJIIZILJ;
        boolean z2;
        String str;
        String str2;
        BindInfo bindInfo;
        BindInfo bindInfo2;
        String str3;
        PaymentTip paymentTip;
        C03ZA c03za = (C03ZA) obj;
        j jVar = (j) C834903Nz.LIZ(this, "payment_method", null, null, 14);
        this.itemView.setPadding(C0H9H.LIZIZ(16), this.itemView.getPaddingTop(), C0H9H.LIZIZ(16), this.itemView.getPaddingBottom());
        h hVar = (h) this.itemView;
        hVar.setItemVO(c03za);
        hVar.setUseCcdcRadio(W5().WR2());
        PaymentMethod paymentMethod = c03za.LIZ;
        if (paymentMethod.LJFF == null && (((paymentTip = paymentMethod.paymentTip) == null || !Intrinsics.LJFF(paymentTip.showDescriptionDefault, Boolean.TRUE)) && !C03Q4.LIZ.LIZ(c03za.LIZ))) {
            z = false;
        } else {
            z = true;
        }
        hVar.setAlwaysShowPaymentTips(z);
        hVar.setPaymentLogger(W5().LLJI);
        EnterParams enterParams = this.LLJILJIL.LLILZLL;
        PaymentMethodsData paymentMethodsData = enterParams.paymentData;
        if (paymentMethodsData != null) {
            buttonStyleLJIIZILJ = paymentMethodsData.LJIIZILJ(enterParams.LJJIJIIJI);
        } else {
            buttonStyleLJIIZILJ = null;
        }
        hVar.setStyle(buttonStyleLJIIZILJ);
        if (c03za.LIZ.LJJJI()) {
            PaymentMethod paymentMethod2 = c03za.LIZ;
            if (paymentMethod2.installmentInfo != null && C03YJ.LIZLLL(paymentMethod2) && C03WK.LIZ(W5().LLJ) && C03XU.LIZIZ().hidePaymentMethodPromotionTag) {
                hVar.setShouldHidePromotion(true);
            }
        }
        EnterParams enterParams2 = W5().LLJ;
        if (enterParams2 != null && enterParams2.LJJIJ) {
            z2 = true;
        } else {
            z2 = false;
        }
        hVar.setRecommendPaymentConfirm(z2);
        hVar.setPaymentMethod(c03za.LIZ);
        hVar.setHideRadio(c03za.LJIIIIZZ);
        hVar.setUseDefaultRadio(c03za.LIZLLL);
        hVar.setGetBindUrl(new AwS615S0100000_1(this, 207));
        hVar.setRemoveBindMethod(new C03Z1(W5()));
        hVar.setTrackParams(W5().LLJJIJIIJIL);
        hVar.setPaySource(this.LLJILJIL.LLILZLL.paySource);
        PaymentMethodsData paymentMethodsData2 = this.LLJILJIL.LLILZLL.paymentData;
        if (paymentMethodsData2 != null) {
            str = paymentMethodsData2.saleRegion;
        } else {
            str = null;
        }
        hVar.setSaleRegion(str);
        hVar.setPaymentViewModel(W5());
        hVar.setOnCheckedListener(new AwS100S0400000_1(this, hVar, c03za, new AwS130S0400000_1(c03za, hVar, this, jVar, 15), 30));
        hVar.setOnPromotionClickListener(new AwS580S0100000_1(this, 842));
        hVar.setOnServiceFeePromotionClickListener(new AwS580S0100000_1(this, 826));
        hVar.setOnBonusPromotionClickListener(new AwS580S0100000_1(this, 831));
        hVar.setOnInterestingFeePromotionClickListener(new AwS437S0200000_1(hVar, this, 33));
        withState(W5(), new AwS100S0400000_1(c03za, hVar, this, jVar, 29));
        BindInfo bindInfo3 = c03za.LIZ.bindInfo;
        if (bindInfo3 != null) {
            str2 = bindInfo3.buttonText;
        } else {
            str2 = null;
        }
        if (C703302op.LIZ(str2) && (((bindInfo = c03za.LIZ.bindInfo) == null || (str3 = bindInfo.schema) == null || str3.length() == 0) && (bindInfo2 = c03za.LIZ.bindInfo) != null && Intrinsics.LJFF(bindInfo2.needPrefetchActivateUrl, Boolean.TRUE))) {
            PaymentViewModel paymentViewModelW5 = W5();
            PaymentMethod paymentMethod3 = c03za.LIZ;
            paymentViewModelW5.getClass();
            if (paymentMethod3 != null) {
                C817503Hh c817503Hh = C817503Hh.LL;
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C03SM(paymentMethod3, paymentViewModelW5, true, null, null), 2);
            }
        }
        if (c03za.LJ) {
            hVar.getPaymentViewContainerFromXml().setPadding(0, C0H9H.LIZIZ(12), 0, C0H9H.LIZIZ(12));
        }
    }

    public PaymentMethodViewHolder(ViewGroup viewGroup, C924703jR c924703jR, LifecycleOwner lifecycleOwner) {
        super(new h(viewGroup.getContext()));
        this.LLJILJIL = c924703jR;
        this.LLJILJILJ = lifecycleOwner;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PaymentViewModel.class);
        this.LLJILLL = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 48));
    }
}
