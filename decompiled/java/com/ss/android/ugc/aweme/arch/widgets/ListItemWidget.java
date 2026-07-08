package com.ss.android.ugc.aweme.arch.widgets;

import X.C15H8;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.arch.widgets.base.Widget;

/* JADX INFO: loaded from: classes32.dex */
public abstract class ListItemWidget<P extends C15H8> extends Widget {
    public C15H8 LLIZLLLIL;

    public boolean LJIILLIIL(RecyclerView.ViewHolder viewHolder) {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public void LJIILL(C15H8 c15h8) {
        this.LLIZLLLIL = c15h8;
    }
}
