package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.skeleton;

import X.C04F0;
import X.C1755600vmo;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.C958103op;
import X.C960203pA;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes2.dex */
public final class PdpSkeletonVH extends AbsFullSpanVH<C04F0> {
    public static final int LLJJJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
    public static final int LLJJJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
    public static final int LLJJJJ = 10;
    public LinearLayout LLJJIJIL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final LinearLayout c6() {
        View viewFindViewById = this.LLJJIJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.eqx) : null;
            this.LLJJIJIL = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PdpSkeletonVH(ViewGroup viewGroup) {
        C1755600vmo c1755600vmo = C1755600vmo.LIZ;
        Context context = viewGroup.getContext();
        c1755600vmo.getClass();
        super(C1755600vmo.LIZ(R.layout.ax9, context, viewGroup, false, true));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        int i;
        if (c6().getChildCount() > 0) {
            C786410Ut5.LJJJJJL(c6());
        }
        int iLIZLLL = C958103op.LIZLLL() - (LLJJJ * 2);
        int i2 = LLJJJJ;
        int i3 = (iLIZLLL - ((i2 - 1) * LLJJJIL)) / i2;
        for (int i4 = 0; i4 < i2; i4++) {
            LinearLayout linearLayoutC6 = c6();
            View view = new View(this.itemView.getContext());
            view.setBackgroundColor(C960203pA.LIZ(R.attr.bw, view.getContext()));
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(i3, i3);
            if (i4 == LLJJJJ - 1) {
                i = 0;
            } else {
                i = LLJJJIL;
            }
            marginLayoutParams.setMarginEnd(i);
            linearLayoutC6.addView(view, marginLayoutParams);
        }
    }
}
