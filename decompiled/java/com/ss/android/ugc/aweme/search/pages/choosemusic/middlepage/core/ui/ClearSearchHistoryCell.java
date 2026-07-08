package com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.ui;

import X.C681940Qoy;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ClearSearchHistoryCell extends PowerCell<C681940Qoy> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        super.onBindItemView(interfaceC1891350zJl);
        C786410Ut5.h9((TuxTextView) this.itemView.findViewById(R.id.zdt), new View.OnClickListener() { // from class: X.0Qob
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C681730Qod.LJIILIIL().LIZ();
                C1440005kM.LIZ(new C681700Qoa("clear_all", null));
            }
        });
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ey2, viewGroup, false);
    }
}
