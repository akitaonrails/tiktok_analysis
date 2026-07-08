package com.ss.android.ugc.aweme.inbox.bulletin.view.cell.setting;

import X.C0OJ0;
import X.C0OJ7;
import X.C0OSB;
import X.C11G4;
import X.C127K;
import X.C127M;
import X.C384050F3z;
import X.C418440Gaw;
import X.C426750GoL;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import Y.ACListenerS113S0200000_9;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinSettingDisclosureCell extends PowerCell<C0OJ7> {
    public C127K LL;
    public C11G4 LLILLJJLI;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        int i;
        int i2;
        View viewFindViewById;
        int i3;
        int i4;
        int i5;
        View viewFindViewById2;
        int i6;
        Float fValueOf;
        Float fValueOf2;
        Float fValueOf3;
        C0OJ7 c0oj7 = (C0OJ7) interfaceC1891350zJl;
        super.onBindItemView(c0oj7);
        C127K c127k = this.LL;
        if (c127k != null) {
            c127k.setTitle(c0oj7.LL);
        }
        C127K c127k2 = this.LL;
        if (c127k2 != null) {
            c127k2.setSubtitle(c0oj7.LLILLJJLI);
        }
        C11G4 c11g4 = this.LLILLJJLI;
        if (c11g4 != null) {
            c11g4.LJIILJJIL(c0oj7.LLILLL);
        }
        C11G4 c11g42 = this.LLILLJJLI;
        if (c11g42 != null) {
            c11g42.LJIILL(new ACListenerS113S0200000_9(c0oj7, this, 4));
        }
        View view = this.itemView;
        C0OJ0 c0oj0 = c0oj7.LLJI;
        int i7 = 0;
        if (c0oj0 != null) {
            i = c0oj0.LJ;
        } else {
            i = 0;
        }
        Integer numValueOf = Integer.valueOf(i);
        C0OJ0 c0oj02 = c0oj7.LLJI;
        if (c0oj02 != null) {
            i2 = c0oj02.LJFF;
        } else {
            i2 = 0;
        }
        C426750GoL.LJIIIZ(view, null, numValueOf, null, Integer.valueOf(i2), false, 21);
        C127K c127k3 = this.LL;
        if (c127k3 != null && (viewFindViewById2 = c127k3.findViewById(R.id.dlh)) != null) {
            C384050F3z c384050F3z = new C384050F3z();
            C0OJ7 item = getItem();
            if (item != null && item.LLJIJIL) {
                i6 = R.attr.a0b;
            } else {
                i6 = R.attr.zo;
            }
            c384050F3z.LIZIZ = Integer.valueOf(i6);
            C0OJ0 c0oj03 = c0oj7.LLJI;
            Float fValueOf4 = null;
            if (c0oj03 != null) {
                fValueOf = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(c0oj03.LIZ)));
            } else {
                fValueOf = null;
            }
            c384050F3z.LJIIIIZZ = fValueOf;
            C0OJ0 c0oj04 = c0oj7.LLJI;
            if (c0oj04 != null) {
                fValueOf2 = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(c0oj04.LIZIZ)));
            } else {
                fValueOf2 = null;
            }
            c384050F3z.LJIIIZ = fValueOf2;
            C0OJ0 c0oj05 = c0oj7.LLJI;
            if (c0oj05 != null) {
                fValueOf3 = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(c0oj05.LIZJ)));
            } else {
                fValueOf3 = null;
            }
            c384050F3z.LJIIJ = fValueOf3;
            C0OJ0 c0oj06 = c0oj7.LLJI;
            if (c0oj06 != null) {
                fValueOf4 = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(c0oj06.LIZLLL)));
            }
            c384050F3z.LJIIJJI = fValueOf4;
            viewFindViewById2.setBackground(c384050F3z.LIZ(viewFindViewById2.getContext()));
        }
        C127K c127k4 = this.LL;
        if (c127k4 != null && (viewFindViewById = c127k4.findViewById(R.id.dlh)) != null) {
            C0OJ0 c0oj07 = c0oj7.LLJI;
            if (c0oj07 != null) {
                i3 = c0oj07.LIZ;
                i4 = c0oj07.LIZIZ;
                i5 = c0oj07.LIZJ;
                i7 = c0oj07.LIZLLL;
            } else {
                i3 = 0;
                i4 = 0;
                i5 = 0;
            }
            C0OSB.LIZLLL(viewFindViewById, i3, i4, i5, i7);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C127M accessory;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.a89, viewGroup, false);
        C127K c127k = (C127K) viewTd.findViewById(R.id.txCell);
        this.LL = c127k;
        C11G4 c11g4 = null;
        if (c127k != null) {
            accessory = c127k.getAccessory();
        } else {
            accessory = null;
        }
        if (accessory instanceof C11G4) {
            c11g4 = (C11G4) accessory;
        }
        this.LLILLJJLI = c11g4;
        return viewTd;
    }
}
