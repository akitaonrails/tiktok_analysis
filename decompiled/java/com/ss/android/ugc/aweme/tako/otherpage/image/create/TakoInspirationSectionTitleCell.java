package com.ss.android.ugc.aweme.tako.otherpage.image.create;

import X.C1271604yI;
import X.InterfaceC1891350zJl;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes3.dex */
public final class TakoInspirationSectionTitleCell extends PowerCell<C1271604yI> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.fn2;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1271604yI c1271604yI = (C1271604yI) interfaceC1891350zJl;
        super.onBindItemView(c1271604yI);
        ((TextView) this.itemView.findViewById(R.id.x_o)).setText(c1271604yI.LL);
    }
}
