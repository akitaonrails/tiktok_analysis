package com.ss.android.ugc.aweme.setting.ui.cell;

import X.C1244240iU2;
import X.C786410Ut5;
import Y.ACListenerS162S0100000_28;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.cell.BaseCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes29.dex */
public final class SettingUnLoginCell extends BaseCell<C1244240iU2> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C786410Ut5.I7(new ACListenerS162S0100000_28(this, 74), this.itemView);
    }

    @Override // com.ss.android.ugc.aweme.cell.BaseCell
    public final View I5(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.f77, viewGroup, false);
    }
}
