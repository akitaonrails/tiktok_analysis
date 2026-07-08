package com.ss.android.ugc.aweme.inbox.search.view.cell;

import X.C1157080gDS;
import X.C337180DJs;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import Y.ACListenerS121S0200000_18;
import android.widget.LinearLayout;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes19.dex */
public final class InboxSearchHeaderCell extends PowerCell<C1157080gDS> {
    public TuxTextView LL;
    public LinearLayout LLILLJJLI;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.a_9;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LL = (TuxTextView) this.itemView.findViewById(R.id.kjb);
        this.LLILLJJLI = (LinearLayout) this.itemView.findViewById(R.id.kjs);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1157080gDS c1157080gDS = (C1157080gDS) interfaceC1891350zJl;
        TuxTextView tuxTextView = this.LL;
        LinearLayout linearLayout = null;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        tuxTextView.setText(c1157080gDS.LL);
        if (!c1157080gDS.LLILLL) {
            LinearLayout linearLayout2 = this.LLILLJJLI;
            if (linearLayout2 != null) {
                linearLayout = linearLayout2;
            }
            C337180DJs.LIZ(linearLayout);
            return;
        }
        LinearLayout linearLayout3 = this.LLILLJJLI;
        if (linearLayout3 == null) {
            linearLayout3 = null;
        }
        C337180DJs.LIZJ(linearLayout3);
        LinearLayout linearLayout4 = this.LLILLJJLI;
        if (linearLayout4 != null) {
            linearLayout = linearLayout4;
        }
        C786410Ut5.R7(linearLayout, new ACListenerS121S0200000_18(this, c1157080gDS, 36));
    }
}
