package com.ss.android.ugc.aweme.notification.v2.cell;

import X.C2211631BhB;
import X.C786410Ut5;
import X.C895500ZBc;
import X.InterfaceC1891350zJl;
import Y.ACListenerS149S0100000_14;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes15.dex */
public final class NotificationCollapseCell extends PowerCell<C895500ZBc> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.a_u;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C2211631BhB.LJ(this.itemView, new AwS597S0100000_18(this, 197));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C895500ZBc c895500ZBc = (C895500ZBc) interfaceC1891350zJl;
        super.onBindItemView(c895500ZBc);
        ((TextView) this.itemView.findViewById(R.id.tv_see_all)).setText(c895500ZBc.LL);
        C786410Ut5.I7(new ACListenerS149S0100000_14(this, 68), this.itemView);
    }
}
