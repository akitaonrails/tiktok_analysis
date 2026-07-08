package com.ss.android.ugc.aweme.relation.usercard.impl.cell;

import X.C1261760iwI;
import X.C1262090iwp;
import X.C418440Gaw;
import X.C426750GoL;
import X.C427690Gpr;
import X.C447550Hgn;
import X.C814420VxA;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes20.dex */
public final class RectangleAuthCellImpl extends AbsAuthCell<C1261760iwI> {
    public final int LLJ = R.layout.f_5;

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsAuthCell
    public final boolean X5() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsAuthCell
    public final int W5() {
        return this.LLJ;
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsAuthCell
    public final void U5(C1262090iwp c1262090iwp) {
        super.U5(c1262090iwp);
        int i = c1262090iwp.LIZ;
        if (i != 100) {
            if (i == 101) {
                C447550Hgn.LJFF(V5(), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56))));
            }
        } else {
            V5().setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)));
            V5().setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)));
            C447550Hgn.LJFF(V5(), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48))));
        }
        int i2 = c1262090iwp.LJIILIIL;
        if (i2 > 0) {
            C426750GoL.LJIIL(this.itemView, null, Integer.valueOf(i2), null, Integer.valueOf(c1262090iwp.LJIILIIL), 21);
        }
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsAuthCell
    public final void a6(C1261760iwI c1261760iwI) {
        super.a6(c1261760iwI);
        if (!c1261760iwI.LLILLL.LJIL) {
            C427690Gpr.LIZLLL(this.itemView, 0);
        }
    }
}
