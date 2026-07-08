package com.ss.android.ugc.aweme.ecommerce.tts.addressedit.us.vh;

import X.C1745680vWo;
import X.C992303uL;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes27.dex */
public final class USHint2ViewHolder extends ECJediViewHolder<C1745680vWo> {
    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public USHint2ViewHolder(ViewGroup viewGroup) {
        super(C992303uL.LIZ(viewGroup.getContext(), R.layout.aii, viewGroup));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        C1745680vWo c1745680vWo = (C1745680vWo) obj;
        TextView textView = (TextView) this.itemView.findViewById(R.id.fof);
        if (textView != null) {
            textView.setText(c1745680vWo.LIZ.title);
        }
    }
}
