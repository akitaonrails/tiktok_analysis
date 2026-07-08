package com.ss.android.ugc.aweme.relation.usercard.impl.cell;

import X.C1261760iwI;
import X.C1262090iwp;
import X.C1308910kAL;
import X.C197039127h;
import X.C427690Gpr;
import X.C960203pA;
import android.content.Context;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes20.dex */
public final class RectangleLargeAuthCellImpl extends AbsAuthCell<C1261760iwI> {
    public final int LLJ = R.layout.f_4;

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsAuthCell
    public final boolean X5() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsAuthCell
    public final int W5() {
        return this.LLJ;
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsAuthCell
    public final void U5(C1262090iwp c1262090iwp) {
        Integer num;
        Integer numLIZJ;
        super.U5(c1262090iwp);
        C197039127h c197039127h = this.LLILZLL;
        if (c197039127h != null) {
            c197039127h.LJJLI(true);
        }
        C197039127h c197039127h2 = this.LLIZLLLIL;
        if (c197039127h2 != null) {
            c197039127h2.LJJLI(true);
        }
        if (c1262090iwp.LJJJJZ && (num = c1262090iwp.LJJJJLL) != null && (numLIZJ = C1308910kAL.LIZJ(num.intValue(), S5())) != null) {
            int iIntValue = numLIZJ.intValue();
            this.itemView.setBackgroundColor(iIntValue);
            Context context = getContext();
            if (context != null && C960203pA.LIZIZ(context)) {
                C427690Gpr.LJI(this.itemView, null);
            } else {
                C427690Gpr.LIZLLL(this.itemView, iIntValue);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsAuthCell
    public final void a6(C1261760iwI c1261760iwI) {
        super.a6(c1261760iwI);
        C1262090iwp c1262090iwp = c1261760iwI.LLILLL;
        if (!c1262090iwp.LJIL && !c1262090iwp.LJJJJZ) {
            C427690Gpr.LIZLLL(this.itemView, 0);
        }
    }
}
