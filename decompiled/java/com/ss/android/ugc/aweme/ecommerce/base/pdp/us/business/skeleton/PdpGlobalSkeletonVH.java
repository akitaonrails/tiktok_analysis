package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.skeleton;

import X.C01GW;
import X.C747502vx;
import X.C954703oH;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes2.dex */
public final class PdpGlobalSkeletonVH extends AbsFullSpanVH<C747502vx> {
    public final View LLJJIJIL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* bridge */ /* synthetic */ void rr(Object obj) {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PdpGlobalSkeletonVH(View view, ViewGroup viewGroup) {
        View viewLIZ;
        if (view == null) {
            C01GW c01gw = C954703oH.LIZ;
            viewLIZ = C954703oH.LIZ(viewGroup.getContext(), R.layout.ath, viewGroup, false);
        } else {
            viewLIZ = view;
        }
        super(viewLIZ);
        this.LLJJIJIL = view;
    }
}
