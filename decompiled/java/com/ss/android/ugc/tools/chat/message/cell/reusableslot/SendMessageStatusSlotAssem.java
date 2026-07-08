package com.ss.android.ugc.tools.chat.message.cell.reusableslot;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C0H94;
import X.C1389890mGx;
import X.C13LE;
import X.C18UC;
import X.C18V2;
import X.C21163117rp;
import X.C452501pT;
import X.C786410Ut5;
import X.C869590Y9l;
import android.view.View;
import com.ss.android.ugc.tools.chat.message.cell.base.BaseSkeletonUISlotAssem;
import com.zhiliaoapp.musically.R;
import irm.AkS69S0200000_32;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: loaded from: classes33.dex */
public final class SendMessageStatusSlotAssem extends BaseSkeletonUISlotAssem<SendMessageStatusSlotAssem, C18V2> {
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.f9i;
    }

    @Override // com.ss.android.ugc.tools.chat.message.cell.base.BaseSkeletonUISlotAssem, X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // com.ss.android.ugc.tools.chat.message.cell.base.BaseSkeletonUISlotAssem
    public final void up(View view) {
    }

    public SendMessageStatusSlotAssem() {
        super(C13LE.LIZ(C18V2.class));
        this.LLJLL = C452501pT.LIZIZ(new AwS576S0100000_32((AbstractC738140SxQ) this, 422));
        this.LLJLLIL = C452501pT.LIZIZ(new AwS576S0100000_32((AbstractC738140SxQ) this, 423));
        this.LLJLLL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 421));
        this.LLJZ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 420));
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 419));
        this.LLL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 418));
    }

    public final void Ap(boolean z) {
        if (z) {
            View view = (View) this.LLL.getValue();
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
            }
            View view2 = (View) this.LLJZIJLIL.getValue();
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(0, view2);
                return;
            }
            return;
        }
        View view3 = (View) this.LLL.getValue();
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(8, view3);
        }
        View view4 = (View) this.LLJZIJLIL.getValue();
        if (view4 == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(8, view4);
    }

    public final void Bp(boolean z) {
        if (z) {
            View view = (View) this.LLJLLL.getValue();
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
            }
            View view2 = (View) this.LLJZ.getValue();
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(0, view2);
                return;
            }
            return;
        }
        View view3 = (View) this.LLJZ.getValue();
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(8, view3);
        }
        View view4 = (View) this.LLJLLL.getValue();
        if (view4 == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(8, view4);
    }

    @Override // com.ss.android.ugc.tools.chat.message.cell.base.BaseSkeletonUISlotAssem
    public final void sp(C0H94 c0h94) {
        C18V2 c18v2 = (C18V2) c0h94;
        int i = c18v2.LLILLJJLI;
        if (i != 3 && i != 1 && i != 0) {
            C786410Ut5.LJLLLLLL(8, LJJIJL());
            return;
        }
        C786410Ut5.LJLLLLLL(0, LJJIJL());
        if (c18v2.LLILLJJLI == 3) {
            Bp(false);
            Ap(true);
            View view = (View) this.LLL.getValue();
            if (view != null) {
                C786410Ut5.I7(new AkS69S0200000_32(this, c18v2, 0), view);
            }
            View view2 = (View) this.LLJZIJLIL.getValue();
            if (view2 == null) {
                return;
            }
            C786410Ut5.I7(new AkS69S0200000_32(this, c18v2, 1), view2);
            return;
        }
        Bp(true);
        Ap(false);
    }

    public final void zp(C869590Y9l c869590Y9l) {
        if (C21163117rp.LIZIZ().LIZJ()) {
            C1389890mGx c1389890mGx = new C1389890mGx(LJJIJL());
            c1389890mGx.LJIIIZ(2131825611);
            c1389890mGx.LJIIJJI();
        } else {
            C18UC c18uc = (C18UC) this.LLJLL.getValue();
            if (c18uc != null) {
                c18uc.du(c869590Y9l);
            }
        }
    }
}
