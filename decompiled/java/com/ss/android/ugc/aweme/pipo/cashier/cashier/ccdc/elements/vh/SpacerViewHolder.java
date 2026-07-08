package com.ss.android.ugc.aweme.pipo.cashier.cashier.ccdc.elements.vh;

import X.C00XE;
import X.C1722120uuo;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;

/* JADX INFO: loaded from: classes.dex */
public final class SpacerViewHolder extends PowerCell<C00XE> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C00XE c00xe = (C00XE) interfaceC1891350zJl;
        super.onBindItemView(c00xe);
        C786410Ut5.W5(this.itemView, new ViewGroup.LayoutParams(-1, C1722120uuo.LIZJ(c00xe.LL)));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return new View(viewGroup.getContext());
    }
}
