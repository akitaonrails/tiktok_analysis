package com.ss.android.ugc.aweme.inbox.widget.multi;

import X.C002J;
import X.C01GW;
import X.C1073960e3O;
import X.C1749280vcc;
import X.C452501pT;
import X.C786410Ut5;
import android.view.View;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class UserCardSkeletonLoadingCell extends PowerCell<C002J> {
    public final C01GW LL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 315));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.a_m;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        View view;
        super.onItemViewCreated();
        if (C1073960e3O.LIZIZ() && (view = (View) this.LL.getValue()) != null) {
            ((C1749280vcc) this.itemView.findViewById(R.id.w28)).LIZIZ(view);
        }
        ((C1749280vcc) this.itemView.findViewById(R.id.w28)).LJ();
        C786410Ut5.LLLZLZ((C1749280vcc) this.itemView.findViewById(R.id.w28), 0);
    }
}
