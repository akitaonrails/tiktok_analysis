package com.ss.android.ugc.aweme.relation.usercard.impl.cell;

import X.C1261760iwI;
import X.C1262090iwp;
import X.C197039127h;
import X.C384050F3z;
import X.C418440Gaw;
import X.C426750GoL;
import X.C428150Gqb;
import X.C447550Hgn;
import X.C814420VxA;
import X.EnumC428940Grs;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes20.dex */
public final class SquareAuthCellImpl extends AbsAuthCell<C1261760iwI> {
    public final int LLJ = R.layout.f_6;

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
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        super.U5(c1262090iwp);
        int i2 = c1262090iwp.LIZ;
        if (i2 != 100) {
            if (i2 != 503) {
                if (i2 == 103 || i2 == 104) {
                    C447550Hgn.LJFF(V5(), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56))), null);
                    V5().setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56)));
                    V5().setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56)));
                    C197039127h c197039127h = this.LLILZLL;
                    if (c197039127h != null) {
                        C447550Hgn.LJFF(c197039127h, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(90))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28))));
                    }
                    C447550Hgn.LJFF(this.itemView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(144))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(169))));
                }
            } else {
                C447550Hgn.LJFF(V5(), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(88))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(88))));
                V5().setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(88)));
                V5().setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(88)));
                C197039127h c197039127h2 = this.LLILZLL;
                if (c197039127h2 != null) {
                    C447550Hgn.LJFF(c197039127h2, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(124))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32))));
                }
                C447550Hgn.LJFF(this.itemView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(148))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(196))));
                TuxTextView tuxTextView = this.LLILZIL;
                if (tuxTextView == null) {
                    tuxTextView = null;
                }
                tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
                tuxTextView.setMaxLines(1);
                Integer numValueOf = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
                Integer numValueOf2 = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
                Integer numValueOf3 = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
                ViewGroup.LayoutParams layoutParams = tuxTextView.getLayoutParams();
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    i = marginLayoutParams.bottomMargin;
                } else {
                    i = 0;
                }
                C426750GoL.LJIIIZ(tuxTextView, numValueOf, numValueOf2, numValueOf3, Integer.valueOf(i), false, 16);
            }
        } else {
            C447550Hgn.LJFF(this.itemView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(150))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(210))));
            C447550Hgn.LJFF(V5(), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(96))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(96))));
            V5().setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(96)));
            V5().setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(96)));
            C197039127h c197039127h3 = this.LLILZLL;
            if (c197039127h3 != null) {
                C447550Hgn.LJFF(c197039127h3, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(126))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28))));
            }
        }
        View view = this.itemView;
        C384050F3z c384050F3z = new C384050F3z();
        Integer numValueOf4 = c1262090iwp.LJJJLL;
        if (numValueOf4 == null) {
            numValueOf4 = Integer.valueOf(R.attr.c7);
        }
        c384050F3z.LIZIZ = numValueOf4;
        c384050F3z.LIZJ = Float.valueOf(P5());
        view.setBackground(c384050F3z.LIZ(this.itemView.getContext()));
        if (c1262090iwp.LJIILIIL > 0) {
            C426750GoL.LJIIIZ(this.itemView, 0, null, Integer.valueOf(c1262090iwp.LJIILIIL), null, false, 26);
        }
        C428150Gqb.LIZ(this.itemView, EnumC428940Grs.SCALE, 0.0f);
    }
}
