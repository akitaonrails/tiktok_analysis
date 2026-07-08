package com.ss.android.ugc.aweme.ecommerce.base.delivery.vh;

import X.C786410Ut5;
import X.C806603Dc;
import X.C809903Ej;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;

/* JADX INFO: loaded from: classes2.dex */
public final class PreOrderShippingViewHolder extends ECJediViewHolder<C806603Dc> {
    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public PreOrderShippingViewHolder(ViewGroup viewGroup) {
        super(new C809903Ej(viewGroup.getContext(), null, 6));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        C809903Ej c809903Ej;
        String str;
        C806603Dc c806603Dc = (C806603Dc) obj;
        C786410Ut5.W5(this.itemView, new LinearLayout.LayoutParams(-1, -2));
        View view = this.itemView;
        if ((view instanceof C809903Ej) && (c809903Ej = (C809903Ej) view) != null && (str = c806603Dc.LIZ) != null) {
            c809903Ej.setShippingInfo(str);
        }
    }
}
