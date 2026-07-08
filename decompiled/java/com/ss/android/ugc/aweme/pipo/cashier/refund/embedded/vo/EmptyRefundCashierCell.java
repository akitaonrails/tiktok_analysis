package com.ss.android.ugc.aweme.pipo.cashier.refund.embedded.vo;

import X.C1712750ufh;
import X.C1722120uuo;
import X.C197039127h;
import X.C426750GoL;
import X.C786410Ut5;
import X.EnumC1711310udN;
import X.InterfaceC1891350zJl;
import Y.ACListenerS128S0200000_26;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes27.dex */
public final class EmptyRefundCashierCell extends PowerCell<C1712750ufh> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1712750ufh c1712750ufh = (C1712750ufh) interfaceC1891350zJl;
        super.onBindItemView(c1712750ufh);
        if (c1712750ufh.LL == EnumC1711310udN.MAIN) {
            C426750GoL.LJIIL(this.itemView, null, Integer.valueOf(C1722120uuo.LIZ(20)), null, null, 29);
        }
        ((TextView) this.itemView.findViewById(R.id.qi9)).setText(c1712750ufh.LLILLJJLI);
        ((TextView) this.itemView.findViewById(R.id.qi8)).setText(c1712750ufh.LLILLL);
        ((TextView) this.itemView.findViewById(R.id.qi7)).setText(c1712750ufh.LLILZ);
        C786410Ut5.U8((C197039127h) this.itemView.findViewById(R.id.qi7), new ACListenerS128S0200000_26(this, c1712750ufh, 16));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return PowerCell.inflateItemView$default(this, viewGroup, R.layout.dw0, false, 4, null);
    }
}
