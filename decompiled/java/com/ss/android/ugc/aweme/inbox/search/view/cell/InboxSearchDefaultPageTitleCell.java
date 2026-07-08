package com.ss.android.ugc.aweme.inbox.search.view.cell;

import X.C00X8;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes.dex */
public final class InboxSearchDefaultPageTitleCell extends PowerCell<C00X8> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C00X8 c00x8 = (C00X8) interfaceC1891350zJl;
        super.onBindItemView(c00x8);
        ((TextView) this.itemView.findViewById(R.id.kji)).setText(c00x8.LL);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.a_b, viewGroup, false);
    }
}
