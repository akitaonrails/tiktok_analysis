package com.ss.android.ugc.aweme.ecommerce.base.address.edit.delivery;

import X.C03J8;
import X.C1308910kAL;
import X.C1744990vVh;
import X.C786410Ut5;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class DeliveryInstructionInfoItemViewHolder extends ECJediViewHolder<C1744990vVh> {
    public TuxTextView LLJILJIL;
    public TuxTextView LLJILJILJ;

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public DeliveryInstructionInfoItemViewHolder(ViewGroup viewGroup) {
        super(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ai6, viewGroup, false));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        Integer numLIZJ;
        C1744990vVh c1744990vVh = (C1744990vVh) obj;
        C03J8.LIZ(this.itemView, false);
        View viewFindViewById = this.LLJILJIL;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View view = this.itemView;
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.z7j);
            } else {
                viewFindViewById = null;
            }
            this.LLJILJIL = (TuxTextView) viewFindViewById;
        }
        ((TextView) viewFindViewById).setText(c1744990vVh.LIZ);
        View view2 = this.LLJILJILJ;
        if (view2 == null) {
            View view3 = this.itemView;
            if (view3 != null) {
                viewFindViewById2 = view3.findViewById(R.id.z3f);
            }
            this.LLJILJILJ = (TuxTextView) viewFindViewById2;
            view2 = viewFindViewById2;
        }
        ((TextView) view2).setText(c1744990vVh.LIZIZ);
        if (Intrinsics.LJFF(c1744990vVh.LIZJ, "2") && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1c, this.itemView.getContext())) != null) {
            this.itemView.setBackgroundColor(numLIZJ.intValue());
        }
    }
}
