package com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.ui;

import X.C681950Qoz;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import Y.ACListenerS145S0100000_10;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ClearSearchHistoryCellNew extends PowerCell<C681950Qoz> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        super.onBindItemView(interfaceC1891350zJl);
        C786410Ut5.h9((TuxTextView) this.itemView.findViewById(R.id.zdt), new ACListenerS145S0100000_10(this, 51));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ey3, viewGroup, false);
    }
}
