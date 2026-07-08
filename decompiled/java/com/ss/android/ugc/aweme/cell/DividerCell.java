package com.ss.android.ugc.aweme.cell;

import X.C19319010i4;
import X.C384050F3z;
import X.C418440Gaw;
import X.C426750GoL;
import X.C786410Ut5;
import X.C814420VxA;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes29.dex */
public final class DividerCell extends BaseCell<C19319010i4> {
    @Override // com.ss.android.ugc.aweme.cell.BaseCell
    public final View I5(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.abx, viewGroup, false);
    }

    @Override // com.ss.android.ugc.aweme.cell.BaseCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: N5, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void onBindItemView(C19319010i4 c19319010i4) {
        int iIntValue;
        int iIntValue2;
        int i;
        int i2;
        super.onBindItemView(c19319010i4);
        boolean z = c19319010i4.LLJ;
        Integer numValueOf = Integer.valueOf(R.attr.zq);
        if (z) {
            View viewFindViewById = this.itemView.findViewById(R.id.c3f);
            if (viewFindViewById != null) {
                C786410Ut5.LJLLLLLL(0, viewFindViewById);
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZIZ = numValueOf;
                c384050F3z.LJIIJ = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(c19319010i4.LLJJIJIL)));
                c384050F3z.LJIIJJI = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(c19319010i4.LLJJIJIL)));
                viewFindViewById.setBackground(c384050F3z.LIZ(viewFindViewById.getContext()));
            }
        } else {
            View viewFindViewById2 = this.itemView.findViewById(R.id.c3f);
            if (viewFindViewById2 != null) {
                C786410Ut5.LJLLLLLL(8, viewFindViewById2);
            }
        }
        Integer num = c19319010i4.LLJJI;
        if (num != null) {
            this.itemView.setBackgroundColor(num.intValue());
        }
        Integer num2 = c19319010i4.LLJJ;
        if (num2 != null) {
            this.itemView.findViewById(R.id.ag3).getLayoutParams().height = num2.intValue();
            C786410Ut5.LJLLLLLL(0, this.itemView.findViewById(R.id.ag3));
        } else {
            C786410Ut5.LJLLLLLL(8, this.itemView.findViewById(R.id.ag3));
        }
        View viewFindViewById3 = this.itemView.findViewById(R.id.k17);
        if (viewFindViewById3 != null) {
            View.OnClickListener onClickListener = c19319010i4.LLJJIII;
            if (onClickListener != null) {
                C786410Ut5.I7(onClickListener, viewFindViewById3);
                C786410Ut5.LJLLLLLL(0, viewFindViewById3);
            } else {
                C786410Ut5.LJLLLLLL(8, viewFindViewById3);
            }
        }
        View viewFindViewById4 = this.itemView.findViewById(R.id.xlh);
        if (viewFindViewById4 != null) {
            if (c19319010i4.LLJJIJI) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            C786410Ut5.LJLLLLLL(i2, viewFindViewById4);
        }
        View viewFindViewById5 = this.itemView.findViewById(R.id.moq);
        if (viewFindViewById5 != null) {
            if (c19319010i4.LLILZLL) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, viewFindViewById5);
        }
        TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.text);
        if (tuxTextView != null) {
            if (c19319010i4.LLILZIL.length() == 0) {
                C786410Ut5.LLLLZLL(tuxTextView, 8);
            } else {
                C786410Ut5.LLLLZLL(tuxTextView, 0);
                Integer num3 = c19319010i4.LLJILJILJ;
                if (num3 != null) {
                    iIntValue2 = num3.intValue();
                } else {
                    iIntValue2 = 62;
                }
                tuxTextView.setTuxFont(iIntValue2);
                tuxTextView.setText(c19319010i4.LLILZIL);
            }
        }
        TuxTextView tuxTextView2 = (TuxTextView) this.itemView.findViewById(R.id.title);
        if (tuxTextView2 != null) {
            CharSequence charSequence = c19319010i4.LLJIJIL;
            if (charSequence != null && charSequence.length() != 0) {
                C786410Ut5.LLLLZLL(tuxTextView2, 0);
                tuxTextView2.setText(c19319010i4.LLJIJIL);
            } else {
                C786410Ut5.LLLLZLL(tuxTextView2, 8);
            }
        }
        TuxTextView tuxTextView3 = (TuxTextView) this.itemView.findViewById(R.id.wgy);
        if (tuxTextView3 != null) {
            tuxTextView3.setMovementMethod(LinkMovementMethod.getInstance());
            CharSequence charSequence2 = c19319010i4.LLJILJIL;
            if (charSequence2 != null && charSequence2.length() != 0) {
                C786410Ut5.LLLLZLL(tuxTextView3, 0);
                Integer num4 = c19319010i4.LLJILLL;
                if (num4 != null) {
                    iIntValue = num4.intValue();
                } else {
                    iIntValue = 52;
                }
                tuxTextView3.setTuxFont(iIntValue);
                tuxTextView3.setText(c19319010i4.LLJILJIL);
            } else {
                C786410Ut5.LLLLZLL(tuxTextView3, 8);
            }
        }
        if (c19319010i4.LLJI) {
            View viewFindViewById6 = this.itemView.findViewById(R.id.c39);
            if (viewFindViewById6 != null) {
                C786410Ut5.LJLLLLLL(0, viewFindViewById6);
                C384050F3z c384050F3z2 = new C384050F3z();
                c384050F3z2.LIZIZ = numValueOf;
                c384050F3z2.LJIIIIZZ = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(c19319010i4.LLJJIJIL)));
                c384050F3z2.LJIIIZ = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(c19319010i4.LLJJIJIL)));
                viewFindViewById6.setBackground(c384050F3z2.LIZ(viewFindViewById6.getContext()));
            }
        } else {
            View viewFindViewById7 = this.itemView.findViewById(R.id.c39);
            if (viewFindViewById7 != null) {
                C786410Ut5.LJLLLLLL(8, viewFindViewById7);
            }
        }
        if (c19319010i4.LLJJIJIIJIL) {
            C426750GoL.LJIIIZ(this.itemView, null, Integer.valueOf(-C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, null, false, 29);
        }
    }
}
