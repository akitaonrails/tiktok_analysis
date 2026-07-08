package com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui.powercell;

import X.C01GW;
import X.C1954807lC;
import X.C452501pT;
import X.C887930YsR;
import X.C888160Yso;
import X.InterfaceC1891350zJl;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class MessageRequestHeaderCell extends PowerCell<C887930YsR> {
    public final C01GW LL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 397));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.cl2;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String string;
        TextView textView = (TextView) this.LL.getValue();
        int i = C888160Yso.LIZ[((C887930YsR) interfaceC1891350zJl).LL.ordinal()];
        if (i != 1) {
            if (i == 2) {
                string = this.itemView.getContext().getString(2131846461);
            } else {
                throw new C1954807lC();
            }
        } else {
            string = this.itemView.getContext().getString(2131846462);
        }
        textView.setText(string);
    }
}
