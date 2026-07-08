package com.ss.android.ugc.aweme.relation.monitor;

import X.AbstractC1585810rMx;
import X.C13LQ;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.relation.usercard.impl.cell.AdapterLoadingCell;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;

/* JADX INFO: loaded from: classes7.dex */
public final class RecUserLoadMoreMonImpl extends AbstractC1585810rMx implements LifecycleEventObserver {
    public static final Class<?>[] LLILLJJLI = {LoadingFooterCell.class, AdapterLoadingCell.class};
    public boolean LL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            lifecycleOwner.getLifecycle().removeObserver(this);
        }
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        if (this.LL) {
            recyclerView.removeOnScrollListener(this);
            return;
        }
        int childCount = recyclerView.getChildCount();
        if (childCount <= 0) {
            return;
        }
        RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(recyclerView.getChildAt(childCount - 1));
        if (C13LQ.LJJIJIIJI(childViewHolder.getClass(), LLILLJJLI) >= 0) {
            this.LL = true;
            throw null;
        }
    }
}
