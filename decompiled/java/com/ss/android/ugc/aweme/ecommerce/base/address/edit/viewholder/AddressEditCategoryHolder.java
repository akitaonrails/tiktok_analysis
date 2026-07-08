package com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder;

import X.C1745680vWo;
import X.C786410Ut5;
import X.C992303uL;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;
import u4.q0;

/* JADX INFO: loaded from: classes27.dex */
public final class AddressEditCategoryHolder extends ECJediViewHolder<C1745680vWo> {
    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public AddressEditCategoryHolder(ViewGroup viewGroup) {
        super(C992303uL.LIZ(viewGroup.getContext(), R.layout.ail, viewGroup));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        C786410Ut5.LJLLLLLL(8, this.itemView.findViewById(R.id.pkg));
        C786410Ut5.LJLLLLLL(0, this.itemView.findViewById(R.id.p76));
        ((TextView) this.itemView.findViewById(R.id.p76).findViewById(R.id.dib)).setText(((C1745680vWo) obj).LIZ.title);
        q0.LJIJI(this.itemView.findViewById(R.id.p76).findViewById(R.id.dib), true);
    }
}
