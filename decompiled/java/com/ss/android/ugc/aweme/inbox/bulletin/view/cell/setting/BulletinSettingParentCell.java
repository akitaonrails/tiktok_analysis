package com.ss.android.ugc.aweme.inbox.bulletin.view.cell.setting;

import X.C0OJ0;
import X.C0OSB;
import X.C11G4;
import X.C1220000hqw;
import X.C127K;
import X.C13LE;
import X.C384050F3z;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452070Ho5;
import X.C617270OIz;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import Y.ACListenerS76S0300000_9;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinSettingParentCell extends PowerCell<C617270OIz> {
    public C127K LL;
    public C617270OIz LLILLJJLI;
    public C0OJ0 LLILLL;
    public final C736950SvV LLILZ;

    public final BulletinProfileViewModel I5() {
        return (BulletinProfileViewModel) this.LLILZ.getValue();
    }

    public BulletinSettingParentCell() {
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(this, 803);
        this.LLILZ = new C736950SvV(C13LE.LIZ(BulletinProfileViewModel.class), awS553S0100000_9, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(335), null, null, null);
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
        Float fValueOf;
        Float fValueOf2;
        Float fValueOf3;
        C617270OIz c617270OIz = (C617270OIz) interfaceC1891350zJl;
        super.onBindItemView(c617270OIz);
        this.LLILLJJLI = c617270OIz;
        this.LLILLL = c617270OIz.LLILZLL;
        C127K c127k = this.LL;
        Float fValueOf4 = null;
        if (c127k != null) {
            c127k.setTitle(c617270OIz.LLILZ);
            C11G4 c11g4 = new C11G4(c127k.getContext(), null);
            c11g4.LJIILL(new ACListenerS76S0300000_9(c617270OIz, this, c127k, 2));
            c127k.setAccessory(c11g4);
        }
        View view = this.itemView;
        C0OJ0 c0oj0 = this.LLILLL;
        int i6 = 0;
        if (c0oj0 != null) {
            i = c0oj0.LJ;
        } else {
            i = 0;
        }
        Integer numValueOf = Integer.valueOf(i);
        C0OJ0 c0oj02 = this.LLILLL;
        if (c0oj02 != null) {
            i2 = c0oj02.LJFF;
        } else {
            i2 = 0;
        }
        C426750GoL.LJIIIZ(view, null, numValueOf, null, Integer.valueOf(i2), false, 21);
        C127K c127k2 = this.LL;
        if (c127k2 != null && (viewFindViewById2 = c127k2.findViewById(R.id.dlh)) != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.zo);
            C0OJ0 c0oj03 = this.LLILLL;
            if (c0oj03 != null) {
                fValueOf = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(c0oj03.LIZ)));
            } else {
                fValueOf = null;
            }
            c384050F3z.LJIIIIZZ = fValueOf;
            C0OJ0 c0oj04 = this.LLILLL;
            if (c0oj04 != null) {
                fValueOf2 = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(c0oj04.LIZIZ)));
            } else {
                fValueOf2 = null;
            }
            c384050F3z.LJIIIZ = fValueOf2;
            C0OJ0 c0oj05 = this.LLILLL;
            if (c0oj05 != null) {
                fValueOf3 = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(c0oj05.LIZJ)));
            } else {
                fValueOf3 = null;
            }
            c384050F3z.LJIIJ = fValueOf3;
            C0OJ0 c0oj06 = this.LLILLL;
            if (c0oj06 != null) {
                fValueOf4 = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(c0oj06.LIZLLL)));
            }
            c384050F3z.LJIIJJI = fValueOf4;
            viewFindViewById2.setBackground(c384050F3z.LIZ(viewFindViewById2.getContext()));
        }
        C127K c127k3 = this.LL;
        if (c127k3 != null && (viewFindViewById = c127k3.findViewById(R.id.dlh)) != null) {
            C0OJ0 c0oj07 = this.LLILLL;
            if (c0oj07 != null) {
                i3 = c0oj07.LIZ;
                i4 = c0oj07.LIZIZ;
                i5 = c0oj07.LIZJ;
                i6 = c0oj07.LIZLLL;
            } else {
                i3 = 0;
                i4 = 0;
                i5 = 0;
            }
            C0OSB.LIZLLL(viewFindViewById, i3, i4, i5, i6);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.a7n, viewGroup, false);
        this.LL = (C127K) viewTd.findViewById(R.id.txCell);
        return viewTd;
    }
}
