package com.ss.android.ugc.aweme.publicgroup.view;

import X.C01GW;
import X.C1157220gDg;
import X.C452501pT;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class GroupEmptyCell extends PowerCell<C1157220gDg> {
    public final C01GW LL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2179));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2178));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1157220gDg c1157220gDg = (C1157220gDg) interfaceC1891350zJl;
        super.onBindItemView(c1157220gDg);
        ((TextView) this.LL.getValue()).setText(c1157220gDg.LL);
        ((TextView) this.LLILLJJLI.getValue()).setText(c1157220gDg.LLILLJJLI);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return PowerCell.inflateItemView$default(this, viewGroup, R.layout.cig, false, 4, null);
    }
}
