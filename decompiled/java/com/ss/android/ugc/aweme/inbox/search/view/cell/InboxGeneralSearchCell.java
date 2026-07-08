package com.ss.android.ugc.aweme.inbox.search.view.cell;

import X.C1275904yz;
import X.C384050F3z;
import X.C418440Gaw;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import Y.ACListenerS106S0200000_2;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes3.dex */
public final class InboxGeneralSearchCell extends PowerCell<C1275904yz> {
    public TuxIconView LL;
    public TuxTextView LLILLJJLI;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.a_8;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LL = (TuxIconView) this.itemView.findViewById(R.id.ub_);
        this.LLILLJJLI = (TuxTextView) this.itemView.findViewById(R.id.m38);
        TuxIconView tuxIconView = this.LL;
        if (tuxIconView != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.br);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(35));
            tuxIconView.setBackground(c384050F3z.LIZ(this.itemView.getContext()));
        }
        TuxIconView tuxIconView2 = this.LL;
        if (tuxIconView2 != null) {
            tuxIconView2.setIconRes(R.raw.icon_magnifying_glass);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1275904yz c1275904yz = (C1275904yz) interfaceC1891350zJl;
        C786410Ut5.I7(new ACListenerS106S0200000_2(this, c1275904yz, 10), this.itemView);
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            tuxTextView.setText(c1275904yz.LL);
        }
    }
}
