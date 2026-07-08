package com.ss.android.ugc.aweme.notification.aggnotice.cell;

import X.C01GW;
import X.C1272504yR;
import X.C1389340mG4;
import X.C452501pT;
import X.InterfaceC1891350zJl;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class EndListDescriptionCell extends PowerCell<C1272504yR> {
    public final C01GW LL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1359));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.a5q;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        TextView textView = (TextView) this.LL.getValue();
        if (textView != null) {
            textView.setMaxWidth((int) (((double) C1389340mG4.LIZJ(null, null).LIZIZ) * 0.8d));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1272504yR c1272504yR = (C1272504yR) interfaceC1891350zJl;
        super.onBindItemView(c1272504yR);
        TextView textView = (TextView) this.LL.getValue();
        if (textView != null) {
            textView.setText(c1272504yR.LL);
        }
    }
}
