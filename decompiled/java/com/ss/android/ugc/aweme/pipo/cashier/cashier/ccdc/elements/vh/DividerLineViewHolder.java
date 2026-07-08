package com.ss.android.ugc.aweme.pipo.cashier.cashier.ccdc.elements.vh;

import X.C1710750ucT;
import X.C1712770ufj;
import X.C1722120uuo;
import X.C786410Ut5;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes27.dex */
public final class DividerLineViewHolder extends PowerCell<C1710750ucT> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View view = new View(viewGroup.getContext());
        C786410Ut5.W5(view, new ViewGroup.LayoutParams(-1, C1722120uuo.LIZJ(1)));
        view.setBackgroundColor(C1712770ufj.LIZ(R.attr.a02, viewGroup.getContext()));
        return view;
    }
}
