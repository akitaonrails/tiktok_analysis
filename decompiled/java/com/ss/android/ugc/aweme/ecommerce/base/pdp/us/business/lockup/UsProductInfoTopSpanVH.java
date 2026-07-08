package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.lockup;

import X.C384050F3z;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes2.dex */
public final class UsProductInfoTopSpanVH extends AbsFullSpanVH<UsProductInfoTopSpanVO> {
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        if (((UsProductInfoTopSpanVO) obj).isCircleBorderRadius()) {
            View view = this.itemView;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
            layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-12));
            C786410Ut5.W5(view, layoutParams);
            View view2 = this.itemView;
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.bx);
            c384050F3z.LJIIIIZZ = Float.valueOf(C418440Gaw.LIZIZ(12));
            c384050F3z.LJIIIZ = Float.valueOf(C418440Gaw.LIZIZ(12));
            view2.setBackground(c384050F3z.LIZ(this.itemView.getContext()));
            return;
        }
        View view3 = this.itemView;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        layoutParams2.topMargin = 0;
        C786410Ut5.W5(view3, layoutParams2);
        this.itemView.setBackground(null);
    }

    public UsProductInfoTopSpanVH(View view, ViewGroup viewGroup) {
        View view2 = view;
        if (view == null) {
            LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
            linearLayout.setOrientation(1);
            C786410Ut5.d6(linearLayout, new ViewGroup.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))));
            view2 = linearLayout;
        }
        super(view2);
    }
}
