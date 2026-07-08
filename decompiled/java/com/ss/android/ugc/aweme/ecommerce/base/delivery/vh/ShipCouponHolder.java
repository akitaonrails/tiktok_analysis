package com.ss.android.ugc.aweme.ecommerce.base.delivery.vh;

import X.C03CH;
import X.C03CJ;
import X.C03CK;
import X.C03FA;
import X.C03IN;
import X.C03J8;
import X.C1018703yb;
import X.C1697810uHb;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C812103Ff;
import X.C814420VxA;
import X.C960203pA;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;
import java.util.Set;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS52S1000000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class ShipCouponHolder extends ECJediViewHolder<C03CJ> {
    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        C03J8.LIZ(this.itemView, true);
        C03IN c03in = (C03IN) this.itemView.findViewById(R.id.x2j);
        AFwS228S0000000_1 aFwS228S0000000_1 = AFwS228S0000000_1.get$arr$(3);
        c03in.getClass();
        aFwS228S0000000_1.invoke(c03in);
        c03in.setTagUi(new C03CH(new C812103Ff(0, null, null, new C03CK(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), Integer.valueOf(R.drawable.c6b)), 6), new C812103Ff(4, null, null, null, 14), new C812103Ff(2, c03in.getContext().getString(2131832593), null, null, 12)));
    }

    public ShipCouponHolder(ViewGroup viewGroup) {
        super(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.alv, viewGroup, false));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        C03CJ c03cj = (C03CJ) obj;
        Set<String> set = C03FA.LIZ;
        String str = c03cj.LIZIZ;
        if (str != null) {
            C1018703yb.LIZJ("tiktokec_coupon_show", C03FA.LIZIZ, new AwS52S1000000_1(str, 44));
        }
        LinearLayout linearLayout = (LinearLayout) this.itemView.findViewById(R.id.m_o);
        if (linearLayout.getChildCount() > 0) {
            C786410Ut5.LJJJJJL(linearLayout);
        }
        int i = 0;
        for (String str2 : c03cj.LIZ) {
            int i2 = i + 1;
            if (i >= 0) {
                String str3 = str2;
                TuxTextView tuxTextView = new TuxTextView(this.itemView.getContext(), null, 6, 0);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                if (i != 0) {
                    layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
                }
                C786410Ut5.R6(tuxTextView, layoutParams);
                tuxTextView.setTextColor(C960203pA.LIZ(R.attr.a1j, this.itemView.getContext()));
                tuxTextView.setTuxFont(61);
                tuxTextView.setText(str3);
                linearLayout.addView(tuxTextView);
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }
}
