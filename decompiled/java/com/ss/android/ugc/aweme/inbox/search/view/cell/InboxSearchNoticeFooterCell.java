package com.ss.android.ugc.aweme.inbox.search.view.cell;

import X.C01BO;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes.dex */
public final class InboxSearchNoticeFooterCell extends PowerCell<C01BO> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C01BO c01bo = (C01BO) interfaceC1891350zJl;
        super.onBindItemView(c01bo);
        ((TextView) this.itemView.findViewById(R.id.kjk)).setText(c01bo.LL);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.a_d, viewGroup, false);
    }
}
