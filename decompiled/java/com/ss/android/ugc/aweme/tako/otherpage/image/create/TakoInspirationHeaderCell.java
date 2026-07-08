package com.ss.android.ugc.aweme.tako.otherpage.image.create;

import X.C1157200gDe;
import X.C1200930hMB;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import Y.ACListenerS153S0100000_18;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes19.dex */
public final class TakoInspirationHeaderCell extends PowerCell<C1157200gDe> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.fn1;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1157200gDe c1157200gDe = (C1157200gDe) interfaceC1891350zJl;
        super.onBindItemView(c1157200gDe);
        TextView textView = (TextView) this.itemView.findViewById(R.id.x_k);
        String str = c1157200gDe.LL;
        int i = 0;
        if (str == null || str.length() <= 0) {
            str = c1157200gDe.LLILLJJLI;
            if (str.length() <= 0) {
                str = "";
            }
        }
        textView.setText(str);
        View viewFindViewById = this.itemView.findViewById(R.id.x_m);
        if (!c1157200gDe.LLILLL) {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, viewFindViewById);
        ((TextView) this.itemView.findViewById(R.id.x_n)).setText(C1200930hMB.LIZ(this.itemView.getContext(), 2131822441, "Tako_createHub_secondTab_viewMore_btn"));
        C786410Ut5.I7(new ACListenerS153S0100000_18(c1157200gDe, 199), viewFindViewById);
    }
}
