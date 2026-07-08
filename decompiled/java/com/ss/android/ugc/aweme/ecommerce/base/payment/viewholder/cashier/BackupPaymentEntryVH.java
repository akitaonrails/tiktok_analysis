package com.ss.android.ugc.aweme.ecommerce.base.payment.viewholder.cashier;

import X.C01GW;
import X.C03SP;
import X.C03YY;
import X.C1388190mED;
import X.C13LE;
import X.C19719912Dl;
import X.C19EG;
import X.C2097608Jq;
import X.C418440Gaw;
import X.C452501pT;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C814420VxA;
import X.C861903Yj;
import X.C867003a8;
import X.C875603bW;
import X.C877303bn;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS130S0400000_1;
import kotlin.jvm.internal.AwS162S0400000_1;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS402S0200000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class BackupPaymentEntryVH extends ECJediViewHolder<C861903Yj> {
    public final LifecycleOwner LLJILJIL;
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
        Fragment fragmentLJI;
        FragmentManager childFragmentManager;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Object obj2;
        String str;
        Boolean bool;
        C875603bW c875603bW;
        C861903Yj c861903Yj = (C861903Yj) obj;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.itemView.getContext());
        Boolean bool2 = null;
        if ((c19egLIZIZ == null || (childFragmentManager = c19egLIZIZ.getSupportFragmentManager()) == null) && ((fragmentLJI = C724240Sb0.LJI(this.LLJILJIL)) == null || (childFragmentManager = fragmentLJI.getChildFragmentManager()) == null)) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            marginLayoutParams.width = -1;
            marginLayoutParams.height = -2;
            marginLayoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
            marginLayoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
            marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        } else {
            View view = this.itemView;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, -2);
            marginLayoutParams2.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
            marginLayoutParams2.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
            marginLayoutParams2.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            C786410Ut5.W5(view, marginLayoutParams2);
        }
        HashMap<String, Object> map = W5().LLJJIJIIJIL;
        if (map != null) {
            obj2 = map.get("entrance_info");
        } else {
            obj2 = null;
        }
        if (obj2 instanceof String) {
            str = (String) obj2;
        } else {
            str = null;
        }
        Map mapLJ = W5().LLJJIJIIJIL;
        if (mapLJ == null) {
            mapLJ = C2097608Jq.LJ();
        }
        C03SP c03sp = W5().LLJJL;
        if (c03sp != null) {
            bool = c03sp.LIZ;
        } else {
            bool = null;
        }
        C877303bn c877303bn = new C877303bn("payment_method", str, mapLJ, 0, bool, 4);
        PaymentMethodsData paymentMethodsData = W5().LLJJIJIL;
        C03SP c03sp2 = W5().LLJJL;
        if (c03sp2 != null) {
            bool2 = c03sp2.LIZ;
        }
        C867003a8 c867003a8LIZ = C03YY.LIZ(paymentMethodsData, bool2);
        if (c867003a8LIZ == null) {
            c867003a8LIZ = c861903Yj.LIZ;
        }
        View view2 = this.itemView;
        if (!(view2 instanceof C875603bW) || (c875603bW = (C875603bW) view2) == null) {
            return;
        }
        c875603bW.LIZ(c867003a8LIZ, c877303bn.LIZ + ':' + c867003a8LIZ.LJ + ':' + c867003a8LIZ.LIZLLL + ':' + c867003a8LIZ.LIZ, new AwS402S0200000_1(c867003a8LIZ, c877303bn, 60), new AwS130S0400000_1(c867003a8LIZ, c877303bn, this, childFragmentManager, 13), new AwS162S0400000_1(c867003a8LIZ, c877303bn, this, childFragmentManager, 5));
    }

    public BackupPaymentEntryVH(ViewGroup viewGroup, LifecycleOwner lifecycleOwner) {
        super(new C875603bW(viewGroup.getContext(), null, 6));
        this.LLJILJIL = lifecycleOwner;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PaymentViewModel.class);
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 54));
    }
}
