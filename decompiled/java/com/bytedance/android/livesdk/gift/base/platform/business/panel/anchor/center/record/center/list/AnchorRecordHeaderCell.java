package com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.record.center.list;

import X.C050H;
import X.C0IJT;
import X.C1133640fbe;
import X.C16F5;
import X.C474500IjA;
import X.C500260Jjc;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import Y.ACListenerS152S0100000_17;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes18.dex */
public final class AnchorRecordHeaderCell extends PowerCell<C050H> {
    public C16F5 LL;
    public View LLILLJJLI;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LL = (C16F5) this.itemView.findViewById(R.id.jkv);
        this.LLILLJJLI = this.itemView.findViewById(R.id.ol6);
        this.itemView.findViewById(R.id.ol4);
        View view = this.LLILLJJLI;
        if (view != null) {
            C786410Ut5.I7(new ACListenerS152S0100000_17(this, 40), view);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C050H c050h = (C050H) interfaceC1891350zJl;
        super.onBindItemView(c050h);
        C16F5 c16f5 = this.LL;
        if (c16f5 != null) {
            c16f5.setText(c050h.LLILLJJLI);
        }
        if (c050h.LL) {
            View view = this.LLILLJJLI;
            if (view != null) {
                C500260Jjc.LLFFF(view);
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_wallet_limit_banner_show");
            C1133640fbe.LIZ(c474500IjALIZ);
            c474500IjALIZ.LJJII("live_gift_panel", "page");
            c474500IjALIZ.LJJII("diamonds_countribute_intro", "notice_id");
            c474500IjALIZ.LIZ();
            return;
        }
        View view2 = this.LLILLJJLI;
        if (view2 == null) {
            return;
        }
        C500260Jjc.LJIILIIL(view2);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gpf, viewGroup, false);
    }
}
