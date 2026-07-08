package com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.divider;

import X.C03J8;
import X.C12ES;
import X.C1308910kAL;
import X.C7811033h;
import X.C786410Ut5;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;

/* JADX INFO: loaded from: classes2.dex */
public final class SpanVH extends AbsFullSpanVH<C7811033h> {
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        C7811033h c7811033h = (C7811033h) obj;
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, (int) C12ES.LIZJ(c7811033h.LLILZLL, this.itemView.getContext()));
        int i = c7811033h.LLIZLLLIL;
        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i;
        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = i;
        C786410Ut5.W5(this.itemView, layoutParams);
        View view = this.itemView;
        int i2 = c7811033h.LLIZLLLIL;
        int iIntValue = 0;
        view.setPadding(i2, 0, i2, 0);
        View view2 = this.itemView;
        Integer numLIZJ = C1308910kAL.LIZJ(c7811033h.LLJ, view2.getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        }
        view2.setBackgroundColor(iIntValue);
        C03J8.LIZ(this.itemView, c7811033h.LLIZ);
    }

    public SpanVH(View view, ViewGroup viewGroup) {
        super(view == null ? new View(viewGroup.getContext()) : view);
    }
}
