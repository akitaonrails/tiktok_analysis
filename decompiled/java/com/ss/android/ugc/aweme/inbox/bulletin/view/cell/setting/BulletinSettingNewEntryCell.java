package com.ss.android.ugc.aweme.inbox.bulletin.view.cell.setting;

import X.C0OJ0;
import X.C0OSB;
import X.C2211631BhB;
import X.C384050F3z;
import X.C418440Gaw;
import X.C426750GoL;
import X.C617260OIy;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import Y.ACListenerS113S0200000_9;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.tag.TuxTag;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinSettingNewEntryCell extends PowerCell<C617260OIy> {
    public ConstraintLayout LL;
    public TuxTextView LLILLJJLI;
    public TuxTag LLILLL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C2211631BhB.LJ(this.itemView, new AwS588S0100000_9(this, 199));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Float fValueOf;
        Float fValueOf2;
        Float fValueOf3;
        int i7;
        C617260OIy c617260OIy = (C617260OIy) interfaceC1891350zJl;
        super.onBindItemView(c617260OIy);
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            tuxTextView.setText(c617260OIy.LLILLJJLI);
        }
        TuxTag tuxTag = this.LLILLL;
        if (tuxTag != null) {
            if (c617260OIy.LLILZ) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            C786410Ut5.LLZLLIL(tuxTag, i7);
        }
        View view = this.itemView;
        C0OJ0 c0oj0 = c617260OIy.LLIZLLLIL;
        if (c0oj0 != null) {
            i = c0oj0.LJ;
        } else {
            i = 0;
        }
        Integer numValueOf = Integer.valueOf(i);
        Float fValueOf4 = null;
        C0OJ0 c0oj02 = c617260OIy.LLIZLLLIL;
        if (c0oj02 != null) {
            i2 = c0oj02.LJFF;
        } else {
            i2 = 0;
        }
        C426750GoL.LJIIIZ(view, null, numValueOf, null, Integer.valueOf(i2), false, 21);
        ConstraintLayout constraintLayout = this.LL;
        if (constraintLayout != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.zo);
            C0OJ0 c0oj03 = c617260OIy.LLIZLLLIL;
            if (c0oj03 != null) {
                fValueOf = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(c0oj03.LIZ)));
            } else {
                fValueOf = null;
            }
            c384050F3z.LJIIIIZZ = fValueOf;
            C0OJ0 c0oj04 = c617260OIy.LLIZLLLIL;
            if (c0oj04 != null) {
                fValueOf2 = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(c0oj04.LIZIZ)));
            } else {
                fValueOf2 = null;
            }
            c384050F3z.LJIIIZ = fValueOf2;
            C0OJ0 c0oj05 = c617260OIy.LLIZLLLIL;
            if (c0oj05 != null) {
                fValueOf3 = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(c0oj05.LIZJ)));
            } else {
                fValueOf3 = null;
            }
            c384050F3z.LJIIJ = fValueOf3;
            C0OJ0 c0oj06 = c617260OIy.LLIZLLLIL;
            if (c0oj06 != null) {
                fValueOf4 = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(c0oj06.LIZLLL)));
            }
            c384050F3z.LJIIJJI = fValueOf4;
            constraintLayout.setBackground(c384050F3z.LIZ(constraintLayout.getContext()));
        }
        ConstraintLayout constraintLayout2 = this.LL;
        if (constraintLayout2 != null) {
            C0OJ0 c0oj07 = c617260OIy.LLIZLLLIL;
            if (c0oj07 != null) {
                i3 = c0oj07.LIZ;
                i4 = c0oj07.LIZIZ;
                i5 = c0oj07.LIZJ;
                i6 = c0oj07.LIZLLL;
            } else {
                i3 = 0;
                i4 = 0;
                i5 = 0;
                i6 = 0;
            }
            C0OSB.LIZLLL(constraintLayout2, i3, i4, i5, i6);
        }
        if (c617260OIy.LLILZLL) {
            C786410Ut5.I7(new ACListenerS113S0200000_9(c617260OIy, this, 5), this.itemView);
        } else {
            C786410Ut5.I7(null, this.itemView);
            this.itemView.setClickable(false);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.a8a, viewGroup, false);
        this.LL = (ConstraintLayout) viewTd.findViewById(R.id.dlh);
        this.LLILLJJLI = (TuxTextView) viewTd.findViewById(R.id.tv_title);
        this.LLILLL = (TuxTag) viewTd.findViewById(R.id.x1x);
        return viewTd;
    }
}
