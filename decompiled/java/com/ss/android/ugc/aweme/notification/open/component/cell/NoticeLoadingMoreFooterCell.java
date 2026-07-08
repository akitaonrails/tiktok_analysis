package com.ss.android.ugc.aweme.notification.open.component.cell;

import X.C1390410mHn;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.footer.PowerLoadingCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes3.dex */
public final class NoticeLoadingMoreFooterCell extends PowerLoadingCell {
    public final int LL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void L5() {
        View view = this.itemView;
        view.getLayoutParams().height = 0;
        ((C1390410mHn) view.findViewById(R.id.nnp)).LIZLLL();
        C786410Ut5.LJLLLLLL(8, view);
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void N5() {
        View view = this.itemView;
        view.getLayoutParams().height = this.LL;
        C786410Ut5.LJLLLLLL(0, view);
        ((C1390410mHn) view.findViewById(R.id.nnp)).LIZJ();
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void LIZJ() {
        L5();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.a8s, viewGroup, false);
    }
}
