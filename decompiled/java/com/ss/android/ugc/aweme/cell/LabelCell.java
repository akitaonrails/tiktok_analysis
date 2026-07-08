package com.ss.android.ugc.aweme.cell;

import X.C127K;
import X.C127M;
import X.C19319710iB;
import X.C19320210iG;
import X.C419910GdJ;
import X.C786410Ut5;
import Y.ACListenerS162S0100000_28;
import android.content.Context;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.AwS78S1000000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class LabelCell extends TuxCell<C19319710iB, C19320210iG> {
    @Override // com.ss.android.ugc.aweme.cell.TuxCell
    public final C127M N5(Context context) {
        C19320210iG c19320210iG = new C19320210iG(context, null);
        C786410Ut5.h9(c19320210iG.LIZIZ, new ACListenerS162S0100000_28(this, 167));
        return c19320210iG;
    }

    @Override // com.ss.android.ugc.aweme.cell.TuxCell, com.ss.android.ugc.aweme.cell.BaseCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: R5, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C19319710iB c19319710iB) {
        super.onBindItemView(c19319710iB);
        C19320210iG c19320210iG = (C19320210iG) this.LL;
        if (c19320210iG != null) {
            c19320210iG.LIZIZ.setText(c19319710iB.LLJJIJIL);
        }
        String str = c19319710iB.LLJJJIL;
        if (str != null) {
            ((C127K) this.itemView.findViewById(R.id.dle)).setIcon(new AwS78S1000000_28(str, 1));
        }
        C419910GdJ c419910GdJ = c19319710iB.LLJJJJ;
        if (c419910GdJ != null) {
            ((C127K) this.itemView.findViewById(R.id.dle)).setIcon(new AwS607S0100000_28(c419910GdJ, 54));
        }
        ((C127K) this.itemView.findViewById(R.id.dle)).setShowAlertBadge(c19319710iB.LLJJJ);
    }
}
