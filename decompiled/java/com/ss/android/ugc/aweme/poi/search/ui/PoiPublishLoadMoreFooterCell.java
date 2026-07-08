package com.ss.android.ugc.aweme.poi.search.ui;

import X.C1199380hJg;
import X.C1390410mHn;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.footer.PowerLoadingCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes7.dex */
public final class PoiPublishLoadMoreFooterCell extends PowerLoadingCell {
    public static final int LL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void L5() {
        View view = this.itemView;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = 0;
        C786410Ut5.W5(view, layoutParams);
        ((C1390410mHn) view.findViewById(R.id.gb5)).LIZLLL();
        C786410Ut5.LJLLLLLL(8, view);
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void N5() {
        C1199380hJg.LIZ.LIZLLL();
        View view = this.itemView;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = LL;
        C786410Ut5.W5(view, layoutParams);
        C786410Ut5.LJLLLLLL(0, view);
        ((C1390410mHn) view.findViewById(R.id.gb5)).LIZJ();
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void LIZJ() {
        L5();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.i3j, viewGroup, false);
    }
}
