package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder;

import X.AnonymousClass0481;
import X.C01GW;
import X.C098200Yq;
import X.C1308910kAL;
import X.C13LE;
import X.C1748720vbi;
import X.C189200o6;
import X.C19719912Dl;
import X.C452501pT;
import X.C770702zh;
import X.C786410Ut5;
import X.C924703jR;
import X.C960203pA;
import Y.ACListenerS105S0200000_1;
import android.graphics.Color;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentBanner;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentBannerViewHolder extends ECJediViewHolder<PaymentBanner> {
    public final ViewGroup LLJILJIL;
    public final C924703jR LLJILJILJ;
    public final C01GW LLJILLL;

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        Object c098200Yq;
        Integer numLIZJ;
        Object c098200Yq2;
        Integer numLIZJ2;
        Object c098200Yq3;
        Object c098200Yq4;
        PaymentBanner paymentBanner = (PaymentBanner) obj;
        TextView textView = (TextView) this.itemView.findViewById(R.id.tv_payment_banner_content);
        TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.tv_payment_banner_link);
        Object obj2 = null;
        if (C960203pA.LIZIZ(this.LLJILJIL.getContext())) {
            try {
                String str = paymentBanner.darkBackgroundColor;
                if (str != null) {
                    c098200Yq = Integer.valueOf(Color.parseColor(str));
                } else {
                    c098200Yq = null;
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            numLIZJ = (Integer) c098200Yq;
            try {
                String str2 = paymentBanner.darkFontColor;
                if (str2 != null) {
                    c098200Yq2 = Integer.valueOf(Color.parseColor(str2));
                } else {
                    c098200Yq2 = null;
                }
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq2 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq2)) {
                obj2 = c098200Yq2;
            }
            numLIZJ2 = (Integer) obj2;
        } else {
            try {
                String str3 = paymentBanner.backgroundColor;
                if (str3 != null) {
                    c098200Yq3 = Integer.valueOf(Color.parseColor(str3));
                } else {
                    c098200Yq3 = null;
                }
                C189200o6.m2constructorimpl(c098200Yq3);
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                c098200Yq3 = new C098200Yq(th3);
                C189200o6.m2constructorimpl(c098200Yq3);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq3)) {
                c098200Yq3 = null;
            }
            numLIZJ = (Integer) c098200Yq3;
            try {
                String str4 = paymentBanner.fontColor;
                if (str4 != null) {
                    c098200Yq4 = Integer.valueOf(Color.parseColor(str4));
                } else {
                    c098200Yq4 = null;
                }
                C189200o6.m2constructorimpl(c098200Yq4);
            } catch (Throwable th4) {
                TryCatchGuardChecker.doCheck(th4);
                c098200Yq4 = new C098200Yq(th4);
                C189200o6.m2constructorimpl(c098200Yq4);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq4)) {
                obj2 = c098200Yq4;
            }
            numLIZJ2 = (Integer) obj2;
        }
        if (numLIZJ == null && (numLIZJ = C1308910kAL.LIZJ(R.attr.zp, this.LLJILJIL.getContext())) == null) {
            numLIZJ = -1;
        }
        if (numLIZJ2 == null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1j, this.LLJILJIL.getContext())) == null) {
            numLIZJ2 = -16777216;
        }
        this.itemView.setBackgroundColor(numLIZJ.intValue());
        textView.setText(paymentBanner.labelName);
        textView.setTextColor(numLIZJ2.intValue());
        PaymentBanner.RedirectInfo redirectInfo = paymentBanner.redirectInfo;
        if (redirectInfo != null && C770702zh.LIZIZ(redirectInfo.displayName) && C770702zh.LIZIZ(redirectInfo.redirectLink)) {
            C786410Ut5.LLLLZLL(tuxTextView, 0);
            tuxTextView.setText(paymentBanner.redirectInfo.displayName);
            tuxTextView.setClickable(true);
            C786410Ut5.h9(tuxTextView, new ACListenerS105S0200000_1(paymentBanner, this, 19));
        } else {
            C786410Ut5.LLLLZLL(tuxTextView, 8);
        }
        C1748720vbi.LIZLLL(this.itemView, new AnonymousClass0481(), new AwS580S0100000_1(this, 837));
    }

    public PaymentBannerViewHolder(ViewGroup viewGroup, C924703jR c924703jR) {
        super(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.aq_, viewGroup, false));
        this.LLJILJIL = viewGroup;
        this.LLJILJILJ = c924703jR;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PaymentViewModel.class);
        this.LLJILLL = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 47));
    }
}
