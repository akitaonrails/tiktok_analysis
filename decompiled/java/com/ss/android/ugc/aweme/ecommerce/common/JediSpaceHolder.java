package com.ss.android.ugc.aweme.ecommerce.common;

import X.C786410Ut5;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;

/* JADX INFO: loaded from: classes22.dex */
public final class JediSpaceHolder extends JediSimpleViewHolder<Integer> {
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public JediSpaceHolder(ViewGroup viewGroup) {
        super(new Space(viewGroup.getContext()));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Integer num) {
        C786410Ut5.W5(this.itemView, new RecyclerView.LayoutParams(1, num.intValue()));
    }
}
