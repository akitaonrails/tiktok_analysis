package com.ss.android.ugc.aweme.poi.search.ui;

import X.C01GW;
import X.C1199380hJg;
import X.C1390410mHn;
import X.C418440Gaw;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.footer.PowerLoadingCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class PoiDetailPublishLoadMoreFooterCell extends PowerLoadingCell {
    public final C01GW LL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 526));

    static {
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void L5() {
        View view = (View) this.LL.getValue();
        ((C1390410mHn) view.findViewById(R.id.gb5)).LIZLLL();
        C786410Ut5.LJLLLLLL(8, view);
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void N5() {
        C1199380hJg.LIZ.LIZLLL();
        View view = (View) this.LL.getValue();
        C786410Ut5.LJLLLLLL(0, view);
        ((C1390410mHn) view.findViewById(R.id.gb5)).LIZJ();
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void LIZJ() {
        L5();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.e0x, viewGroup, false);
    }
}
