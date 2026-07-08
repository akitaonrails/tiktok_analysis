package com.ss.android.ugc.aweme.inbox.bulletin.view.cell;

import X.C1274104yh;
import X.InterfaceC1891350zJl;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes3.dex */
public final class BulletinSelectGroupTitleCell extends PowerCell<C1274104yh> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.a85;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1274104yh c1274104yh = (C1274104yh) interfaceC1891350zJl;
        super.onBindItemView(c1274104yh);
        ((TextView) this.itemView.findViewById(R.id.v4s)).setText(c1274104yh.LL);
    }
}
