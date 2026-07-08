package com.bytedance.jedi.ext.adapter;

import X.C903160Zbu;
import X.InterfaceC1075600e62;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public abstract class JediSimpleViewHolder<ITEM> extends JediViewHolder implements InterfaceC1075600e62<ViewModelProvider.Factory> {
    public final Factory LLJ;

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public abstract void rr(ITEM item);

    @Override // X.InterfaceC1075600e62
    public final ViewModelProvider.Factory jl() {
        return this.LLJ;
    }

    public JediSimpleViewHolder(View view) {
        super(view);
        this.LLJ = C903160Zbu.LIZ;
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void T5(List<Object> list) {
        V5(list, this.LLILLL, this.LLILLJJLI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void V5(List list, int i, Object obj) {
        rr(obj);
    }
}
