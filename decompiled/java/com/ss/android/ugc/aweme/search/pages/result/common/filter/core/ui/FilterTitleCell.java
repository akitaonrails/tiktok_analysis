package com.ss.android.ugc.aweme.search.pages.result.common.filter.core.ui;

import X.C01BM;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes.dex */
public final class FilterTitleCell extends PowerCell<C01BM> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C01BM c01bm = (C01BM) interfaceC1891350zJl;
        TextView textView = (TextView) this.itemView.findViewById(R.id.title);
        super.onBindItemView(c01bm);
        textView.setText(c01bm.LL);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.f4f, viewGroup, false);
    }
}
