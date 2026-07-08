package com.ss.android.ugc.aweme.tako.botpage.components.product;

import X.C1271304yF;
import X.C384050F3z;
import X.C418440Gaw;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import Y.ACListenerS114S0200000_10;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes3.dex */
public final class TakoProductMoreItemCell extends PowerCell<C1271304yF> {
    public C1271304yF LL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        View viewFindViewById = this.itemView.findViewById(R.id.uj_);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(20));
        viewFindViewById.setBackground(c384050F3z.LIZ(viewFindViewById.getContext()));
        View view = this.itemView;
        C786410Ut5.I7(new ACListenerS114S0200000_10(view, this, 35), view);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        this.LL = (C1271304yF) interfaceC1891350zJl;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.flg, viewGroup, false);
    }
}
