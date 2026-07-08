package com.ss.android.ugc.profile.business.ur.following.ui.viewholder.jedi;

import X.C1749280vcc;
import X.C1782830wUj;
import X.C1808120x9W;
import X.C786410Ut5;
import X.InterfaceC1808130x9X;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes30.dex */
public final class RelationStatusViewHolder extends JediSimpleViewHolder<C1782830wUj> implements InterfaceC1808130x9X {
    public final Context LLJI;
    public final C1749280vcc LLJIJIL;
    public final TuxTextView LLJILJIL;
    public boolean LLJILJILJ;

    @Override // X.InterfaceC1808130x9X
    public final void LJII() {
        this.LLJILJILJ = false;
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC1808130x9X
    public final boolean LJJI() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC1808130x9X
    public final Context LLIL() {
        return this.LLJI;
    }

    @Override // X.InterfaceC1808130x9X
    public final C1749280vcc getStatusView() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC1808130x9X
    public final TuxTextView o3() {
        return this.LLJILJIL;
    }

    public RelationStatusViewHolder(ViewGroup viewGroup) {
        super(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.eez, viewGroup, false));
        this.LLJI = viewGroup.getContext();
        this.LLJIJIL = (C1749280vcc) this.itemView.findViewById(R.id.w28);
        this.LLJILJIL = (TuxTextView) this.itemView.findViewById(R.id.jj3);
        this.LLJILJILJ = true;
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(C1782830wUj c1782830wUj) {
        C1808120x9W.LIZ(this, c1782830wUj);
    }
}
