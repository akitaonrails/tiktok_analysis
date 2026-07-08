package com.ss.android.ugc.aweme.selector.choosegroup;

import X.C1225070hz7;
import X.C1228430i4X;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.selector.choosegroup.api.IFanGroupInviteListProvider;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes20.dex */
public final class FanGroupChooseGroupEmptyCell extends PowerCell<C1225070hz7> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        View viewLIZIZ;
        super.onBindItemView(interfaceC1891350zJl);
        C786410Ut5.LJJJJIZL((FrameLayout) this.itemView);
        IFanGroupInviteListProvider.LIZ.getClass();
        IFanGroupInviteListProvider value = C1228430i4X.LIZIZ.getValue();
        if (value != null && (viewLIZIZ = value.LIZIZ(this.itemView.getContext(), (ViewGroup) this.itemView)) != null) {
            ((ViewGroup) this.itemView).addView(viewLIZIZ);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return PowerCell.inflateItemView$default(this, viewGroup, R.layout.dcq, false, 4, null);
    }
}
