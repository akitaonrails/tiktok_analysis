package com.bytedance.ies.powerlist;

import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class PowerAdapterWithScrollFix extends PowerAdapter {
    public final Function1<Context, ViewGroup> LLLF;

    @Override // com.bytedance.ies.powerlist.PowerAdapter, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public PowerAdapterWithScrollFix(RecyclerView recyclerView, AwS610S0100000_31 awS610S0100000_31) {
        super(recyclerView);
        this.LLLF = awS610S0100000_31;
    }

    @Override // com.bytedance.ies.powerlist.PowerAdapter
    public final View LLLLIIL(PowerCell<? extends InterfaceC1891350zJl> powerCell, ViewGroup viewGroup, int i) {
        View viewLLLLIIL = super.LLLLIIL(powerCell, viewGroup, i);
        ViewGroup viewGroupInvoke = this.LLLF.invoke(viewGroup.getContext());
        C786410Ut5.X5(new ViewGroup.LayoutParams(-1, -1), viewGroupInvoke);
        viewGroupInvoke.addView(viewLLLLIIL);
        return viewGroupInvoke;
    }
}
