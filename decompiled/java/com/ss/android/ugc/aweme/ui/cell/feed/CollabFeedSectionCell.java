package com.ss.android.ugc.aweme.ui.cell.feed;

import X.C0185003z;
import X.C01GW;
import X.C1388190mED;
import X.C20673215v0;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS548S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class CollabFeedSectionCell extends PowerCell<C0185003z> {
    public final C01GW LL = C452501pT.LIZIZ(new AwS548S0100000_4(this, 297));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        ((TextView) this.LL.getValue()).setText(this.itemView.getContext().getString(2131828915));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewLIZJ;
        Activity activityLIZ = C1388190mED.LIZ(viewGroup.getContext());
        if (activityLIZ == null || (viewLIZJ = C20673215v0.LIZJ(R.layout.agd, activityLIZ)) == null) {
            return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.agd, viewGroup, false);
        }
        return viewLIZJ;
    }
}
