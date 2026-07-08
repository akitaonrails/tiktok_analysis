package com.ss.android.ugc.aweme.relation.usercard.impl.cell;

import X.C1261650iw7;
import X.C1261860iwS;
import X.C1262090iwp;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C426750GoL;
import X.C428150Gqb;
import X.C447550Hgn;
import X.C814420VxA;
import X.EnumC428940Grs;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes20.dex */
public final class SquareRecUserCell extends BaseSquareRecUserCell<C1261650iw7> {
    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public final void L6(C1261860iwS c1261860iwS, C1262090iwp c1262090iwp) {
        int marginStart;
        int marginEnd;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View viewFindViewById = this.itemView.findViewById(R.id.cb8);
        SmartAvatarImageView smartAvatarImageView = (SmartAvatarImageView) this.itemView.findViewById(R.id.y9d);
        int i = c1262090iwp.LIZ;
        if (i != 100) {
            if (i != 101) {
                if (i != 103) {
                    if (i != 104) {
                        if (i == 503) {
                            AbsRecUserCell.u6(smartAvatarImageView, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(88)));
                            C447550Hgn.LJFF(viewFindViewById, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(124))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32))));
                            C447550Hgn.LJFF(this.itemView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(148))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(196))));
                            TextView textView = (TextView) this.itemView.findViewById(R.id.t4q);
                            if (textView != null) {
                                textView.setEllipsize(TextUtils.TruncateAt.END);
                                textView.setMaxLines(1);
                                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                                int i2 = 0;
                                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                                    marginStart = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
                                } else {
                                    marginStart = 0;
                                }
                                Integer numValueOf = Integer.valueOf(marginStart);
                                ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
                                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                                    marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd();
                                } else {
                                    marginEnd = 0;
                                }
                                Integer numValueOf2 = Integer.valueOf(marginEnd);
                                ViewGroup.LayoutParams layoutParams3 = textView.getLayoutParams();
                                if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                                    i2 = marginLayoutParams.bottomMargin;
                                }
                                C426750GoL.LJIIIZ(textView, numValueOf, 0, numValueOf2, Integer.valueOf(i2), false, 16);
                            }
                        } else {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("not supported current variant: ");
                            sbLIZ.append(c1262090iwp.LIZ);
                            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                        }
                    } else {
                        AbsRecUserCell.u6(smartAvatarImageView, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56)));
                        C447550Hgn.LJFF(viewFindViewById, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(118))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28))));
                        C447550Hgn.LJFF(this.itemView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(150))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(177))));
                    }
                } else {
                    AbsRecUserCell.u6(smartAvatarImageView, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56)));
                    C447550Hgn.LJFF(viewFindViewById, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(90))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28))));
                    C447550Hgn.LJFF(this.itemView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(144))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(169))));
                }
            } else {
                AbsRecUserCell.u6(smartAvatarImageView, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120)));
                C447550Hgn.LJFF(viewFindViewById, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(136))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28))));
            }
        } else {
            AbsRecUserCell.u6(smartAvatarImageView, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(96)));
            C447550Hgn.LJFF(viewFindViewById, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(126))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28))));
            C447550Hgn.LJFF(this.itemView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(150))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(210))));
        }
        C428150Gqb.LIZ(this.itemView, EnumC428940Grs.SCALE, 0.0f);
    }
}
