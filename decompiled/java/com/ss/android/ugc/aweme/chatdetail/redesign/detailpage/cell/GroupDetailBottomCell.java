package com.ss.android.ugc.aweme.chatdetail.redesign.detailpage.cell;

import X.C1383370m6R;
import X.C337180DJs;
import X.C343040Dcc;
import X.InterfaceC1891350zJl;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes5.dex */
public final class GroupDetailBottomCell extends PowerCell<C343040Dcc> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.cmf;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        this.itemView.setBackgroundColor(C1383370m6R.LJFF(R.attr.zm));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C343040Dcc c343040Dcc = (C343040Dcc) interfaceC1891350zJl;
        super.onBindItemView(c343040Dcc);
        TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.fr5);
        if (c343040Dcc.LL) {
            C337180DJs.LIZJ(tuxTextView);
            tuxTextView.setTuxFont(71);
            tuxTextView.setTextColorRes(R.attr.a1k);
            tuxTextView.setText(c343040Dcc.LLILLJJLI);
            return;
        }
        C337180DJs.LIZ(tuxTextView);
    }
}
