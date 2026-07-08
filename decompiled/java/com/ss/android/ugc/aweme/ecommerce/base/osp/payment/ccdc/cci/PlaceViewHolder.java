package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.cci;

import X.C786410Ut5;
import X.C846703Sn;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;

/* JADX INFO: loaded from: classes.dex */
public final class PlaceViewHolder extends PowerCell<C846703Sn> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        super.onBindItemView(interfaceC1891350zJl);
        C786410Ut5.W5(this.itemView, new ViewGroup.LayoutParams(-1, 1));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return new View(viewGroup.getContext());
    }
}
