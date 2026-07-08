package com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common;

import X.C01GW;
import X.C03J8;
import X.C1755030vlt;
import X.C954703oH;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PdpHolder<T> extends AbsFullSpanVH<T> {
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onResume() {
        this.itemView.setTag(R.id.ei0, new C1755030vlt(this.LLILLJJLI));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediViewHolder
    public void onCreate() {
        super.onCreate();
        C03J8.LIZ(this.itemView, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PdpHolder(int i, View view, boolean z) {
        if (!z) {
            C01GW c01gw = C954703oH.LIZ;
            view = C954703oH.LIZ(view.getContext(), i, (ViewGroup) view, false);
        }
        super(view);
    }
}
