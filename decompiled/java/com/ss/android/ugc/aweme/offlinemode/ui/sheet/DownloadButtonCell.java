package com.ss.android.ugc.aweme.offlinemode.ui.sheet;

import X.C1077060e8O;
import X.C127K;
import X.C197039127h;
import X.C20693615yI;
import X.C786410Ut5;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.cell.TuxCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes32.dex */
public final class DownloadButtonCell extends TuxCell<C20693615yI, C1077060e8O> {
    @Override // com.ss.android.ugc.aweme.cell.TuxCell, com.ss.android.ugc.aweme.cell.BaseCell
    public final View I5(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dtx, viewGroup, false);
    }

    @Override // com.ss.android.ugc.aweme.cell.TuxCell, com.ss.android.ugc.aweme.cell.BaseCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: R5, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C20693615yI c20693615yI) {
        ((C127K) this.itemView.findViewById(R.id.pjh)).LJ(c20693615yI.LLJJJIL, c20693615yI.LLJJJ);
        C197039127h c197039127h = (C197039127h) this.itemView.findViewById(R.id.pjg);
        C786410Ut5.U8(c197039127h, c20693615yI.LLJJJJ);
        c197039127h.setText(c20693615yI.LLJJJJJIL);
    }
}
