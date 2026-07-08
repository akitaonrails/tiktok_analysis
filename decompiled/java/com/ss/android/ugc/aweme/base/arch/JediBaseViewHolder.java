package com.ss.android.ugc.aweme.base.arch;

import X.AnonymousClass0412;
import X.InterfaceC1075600e62;
import X.InterfaceC874803bO;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.jedi.ext.adapter.JediViewHolder;

/* JADX INFO: loaded from: classes29.dex */
public abstract class JediBaseViewHolder<R extends InterfaceC874803bO, ITEM> extends JediViewHolder implements InterfaceC1075600e62<AnonymousClass0412> {
    public final AnonymousClass0412 LLJ;

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC1075600e62
    public final /* bridge */ /* synthetic */ ViewModelProvider.Factory jl() {
        return this.LLJ;
    }

    public JediBaseViewHolder(View view) {
        super(view);
        this.LLJ = new AnonymousClass0412();
    }
}
