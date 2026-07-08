package com.ss.android.ugc.aweme.ecommerce.tts.addressedit.us.vh;

import X.C1308910kAL;
import X.C1745680vWo;
import X.C418440Gaw;
import X.C426750GoL;
import X.C786410Ut5;
import X.C814420VxA;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes2.dex */
public final class USDividerViewHolder extends ECJediViewHolder<C1745680vWo> {
    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        C786410Ut5.W5(this.itemView, new RecyclerView.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))));
        C426750GoL.LJIIIZ(this.itemView, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, null, false, 29);
        Integer numLIZ = C1308910kAL.LIZ(R.attr.zp, this.itemView.getContext());
        if (numLIZ != null) {
            this.itemView.setBackgroundColor(numLIZ.intValue());
        }
    }

    public USDividerViewHolder(ViewGroup viewGroup) {
        super(new FrameLayout(viewGroup.getContext()));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* bridge */ /* synthetic */ void rr(Object obj) {
    }
}
