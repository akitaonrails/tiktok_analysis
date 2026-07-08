package com.ss.android.ugc.aweme.search.pages.result.common.anchor.ui;

import X.C01GW;
import X.C1164904h5;
import X.C1165004h6;
import X.C1169304hn;
import X.C1954807lC;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C452501pT;
import X.C660780Pvw;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1165104h7;
import X.InterfaceC660770Pvv;
import Y.ACListenerS114S0200000_10;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchAnchorAssem extends BaseSearchAnchorAssem<SearchAnchorAssem> {
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 420));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 422));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 421));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.evq;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
    }

    public final TuxIconView op() {
        return (TuxIconView) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final TuxTextView sp() {
        return (TuxTextView) this.LLJL.getValue();
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC660770Pvv interfaceC660770Pvv) {
        InterfaceC660770Pvv interfaceC660770Pvv2 = interfaceC660770Pvv;
        C786410Ut5.I7(new ACListenerS114S0200000_10(this, interfaceC660770Pvv2, 19), getContentView());
        C660780Pvw c660780PvwLIZ = interfaceC660770Pvv2.LIZ();
        if (c660780PvwLIZ != null) {
            C786410Ut5.LJLLLLLL(0, getContentView());
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_map_thumbtack_fill;
            c419910GdJ.LJ = Integer.valueOf(R.attr.zi);
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
            InterfaceC1165104h7 interfaceC1165104h7 = c660780PvwLIZ.LIZ;
            if (interfaceC1165104h7 instanceof C1165004h6) {
                C786410Ut5.LLLLLLZZ(op(), 0);
                op().setTuxIcon(c419910GdJ);
                sp().setMaxLines(1);
                C786410Ut5.LLLLZLL((TuxTextView) this.LLJLIL.getValue(), 8);
                sp().setText(((C1165004h6) c660780PvwLIZ.LIZ).LIZ);
                return;
            }
            if (interfaceC1165104h7 instanceof C1164904h5) {
                interfaceC1165104h7.getClass();
                C786410Ut5.LLLLLLZZ(op(), 0);
                op().setTuxIcon(c419910GdJ);
                sp().setMaxLines(2);
                C786410Ut5.LLLLZLL((TuxTextView) this.LLJLIL.getValue(), 8);
                TuxTextView tuxTextViewSp = sp();
                c660780PvwLIZ.LIZ.getClass();
                tuxTextViewSp.setText((CharSequence) null);
                return;
            }
            if (interfaceC1165104h7 instanceof C1169304hn) {
                C786410Ut5.LLLLLLZZ(op(), 0);
                op().setTuxIcon(c419910GdJ);
                sp().setMaxLines(1);
                C786410Ut5.LLLLZLL((TuxTextView) this.LLJLIL.getValue(), 0);
                sp().setText(((C1169304hn) c660780PvwLIZ.LIZ).LIZ);
                ((TextView) this.LLJLIL.getValue()).setText(((C1169304hn) c660780PvwLIZ.LIZ).LIZIZ);
                return;
            }
            throw new C1954807lC();
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final boolean ur(InterfaceC660770Pvv interfaceC660770Pvv) {
        if (interfaceC660770Pvv.LIZ() != null) {
            return true;
        }
        return false;
    }
}
