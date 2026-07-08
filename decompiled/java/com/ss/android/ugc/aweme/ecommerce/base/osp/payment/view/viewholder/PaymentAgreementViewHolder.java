package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder;

import X.C01GW;
import X.C03YN;
import X.C1019103yf;
import X.C1077704Jj;
import X.C11EA;
import X.C13LE;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452501pT;
import X.C703302op;
import X.C786410Ut5;
import X.C928903k7;
import X.EnumC1014603xw;
import android.text.method.LinkMovementMethod;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.extrafee.ExtraFeeRichText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.extrafee.ExtraFeeStatement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentState;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS545S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentAgreementViewHolder extends ECJediViewHolder<C03YN> {
    public final C01GW LLJILJIL;
    public final String LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;

    public final void W5() {
        if (this.LLJIJIL) {
            return;
        }
        this.LLJIJIL = true;
        C11EA.LJIIJ(this, (JediViewModel) this.LLJILJIL.getValue(), new C2217381BqS() { // from class: X.03aM
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((PaymentState) obj).getCheckedPaymentMethod();
            }
        }, new C2217381BqS() { // from class: X.03aN
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((PaymentState) obj).getCheckedAnchorPaymentMethod();
            }
        }, new C2217381BqS() { // from class: X.03aL
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((PaymentState) obj).getInstallmentPlanChanged();
            }
        }, new C1077704Jj(this, 2));
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        W5();
    }

    public PaymentAgreementViewHolder(ViewGroup viewGroup) {
        super(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.aq6, viewGroup, false));
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PaymentViewModel.class);
        this.LLJILJIL = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 46));
        this.LLJILJILJ = "these_banks";
        this.LLJILLL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1248));
        this.LLJJ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1247));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /* JADX INFO: renamed from: X5, reason: merged with bridge method [inline-methods] */
    public final void rr(C03YN c03yn) {
        String str;
        LinkedHashMap linkedHashMap;
        String str2;
        W5();
        try {
            ExtraFeeStatement extraFeeStatement = c03yn.LIZ;
            if (extraFeeStatement == null || (str = extraFeeStatement.template) == null) {
                return;
            }
            StringBuilder sb = new StringBuilder(str);
            Map<String, ExtraFeeRichText> map = extraFeeStatement.arguments;
            if (map != null) {
                linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, ExtraFeeRichText> entry : map.entrySet()) {
                    ExtraFeeRichText value = entry.getValue();
                    if (value != null) {
                        str2 = value.text;
                    } else {
                        str2 = null;
                    }
                    if (C703302op.LIZ(str2)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
            } else {
                linkedHashMap = null;
            }
            C928903k7 c928903k7 = new C928903k7(this.LLJILJILJ);
            C928903k7.LIZIZ(linkedHashMap, sb);
            ((TuxTextView) this.LLJJ.getValue()).setText(c928903k7.LIZ(this.itemView, sb, linkedHashMap));
            ((TuxTextView) this.LLJJ.getValue()).setClickable(true);
            ((TuxTextView) this.LLJJ.getValue()).setMovementMethod(LinkMovementMethod.getInstance());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            EnumC1014603xw enumC1014603xw = EnumC1014603xw.ERR16;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PaymentAgreementViewHolder onBind exception: ");
            sbLIZ.append(e);
            C1019103yf.LIZ(enumC1014603xw, new RuntimeException(C2188811AlT.LIZIZ(sbLIZ)), null);
        }
    }
}
