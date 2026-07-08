package com.ss.android.ugc.aweme.ecommerce.core.view.speclayout;

import X.C01GW;
import X.C0H9H;
import X.C2172591A0z;
import X.C813603Fu;
import X.C954703oH;
import X.C958103op;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ViewMoreVH extends AbsFullSpanVH<C2172591A0z> {
    public TuxTextView LLJJIJIL;
    public FrameLayout LLJJJ;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    static {
        C0H9H.LIZ(8);
        C0H9H.LIZ(78);
        C0H9H.LIZ(76);
        C0H9H.LIZ(93);
        C0H9H.LIZ(36);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewMoreVH(ViewGroup viewGroup) {
        super(C954703oH.LIZ(viewGroup.getContext(), R.layout.aok, viewGroup, false));
        C01GW c01gw = C954703oH.LIZ;
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        View viewFindViewById = this.LLJJIJIL;
        if (viewFindViewById == null) {
            View view = this.itemView;
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.cid);
            } else {
                viewFindViewById = null;
            }
            this.LLJJIJIL = (TuxTextView) viewFindViewById;
        }
        obj.getClass();
        ((TextView) viewFindViewById).setText((CharSequence) null);
        View viewFindViewById2 = this.LLJJJ;
        if (viewFindViewById2 == null) {
            View viewLJJIJL = LJJIJL();
            if (viewLJJIJL != null) {
                viewFindViewById2 = viewLJJIJL.findViewById(R.id.vsz);
            } else {
                viewFindViewById2 = null;
            }
            this.LLJJJ = (FrameLayout) viewFindViewById2;
        }
        viewFindViewById2.setBackgroundResource(R.drawable.b4p);
        C958103op.LIZLLL();
        int i = C813603Fu.LIZ;
        throw null;
    }
}
