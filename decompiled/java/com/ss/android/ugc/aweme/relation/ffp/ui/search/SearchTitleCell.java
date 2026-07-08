package com.ss.android.ugc.aweme.relation.ffp.ui.search;

import X.C07Z7;
import X.InterfaceC1891350zJl;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes17.dex */
public final class SearchTitleCell extends PowerCell<C07Z7> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.ca1;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C07Z7 c07z7 = (C07Z7) interfaceC1891350zJl;
        super.onBindItemView(c07z7);
        ((TextView) this.itemView.findViewById(R.id.xzt)).setText(c07z7.LL.getTextRes());
    }
}
