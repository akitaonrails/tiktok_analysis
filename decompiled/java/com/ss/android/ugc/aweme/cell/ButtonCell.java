package com.ss.android.ugc.aweme.cell;

import X.C1077060e8O;
import X.C127M;
import X.C20693315yF;
import X.C786410Ut5;
import Y.ACListenerS133S0200000_31;
import Y.ACListenerS165S0100000_31;
import android.content.Context;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes32.dex */
public final class ButtonCell extends TuxCell<C20693315yF, C1077060e8O> {
    @Override // com.ss.android.ugc.aweme.cell.TuxCell
    public final C127M N5(Context context) {
        C1077060e8O c1077060e8O = new C1077060e8O(context, null);
        c1077060e8O.LJIIL(new ACListenerS165S0100000_31(this, 204));
        return c1077060e8O;
    }

    @Override // com.ss.android.ugc.aweme.cell.TuxCell, com.ss.android.ugc.aweme.cell.BaseCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: R5, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C20693315yF c20693315yF) {
        String str;
        super.onBindItemView(c20693315yF);
        C1077060e8O c1077060e8O = (C1077060e8O) this.LL;
        if (c1077060e8O != null) {
            if (c20693315yF.LLJLILLLLZIIL) {
                str = "";
            } else {
                str = c20693315yF.LLJJIJIL;
            }
            c1077060e8O.LJIILIIL(str);
        }
        C1077060e8O c1077060e8O2 = (C1077060e8O) this.LL;
        if (c1077060e8O2 != null) {
            c1077060e8O2.LIZIZ.setButtonVariant(c20693315yF.LLJJJ);
        }
        S s = this.LL;
        if (s != 0) {
            s.LJIIIZ(c20693315yF.LLJZ);
        }
        if (c20693315yF.LLJLLL) {
            C786410Ut5.I7(new ACListenerS133S0200000_31(c20693315yF, this, 11), this.itemView.findViewById(R.id.dlh));
        }
    }
}
