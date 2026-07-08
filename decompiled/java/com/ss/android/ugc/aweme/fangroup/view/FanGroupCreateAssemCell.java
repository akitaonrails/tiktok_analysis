package com.ss.android.ugc.aweme.fangroup.view;

import X.C1229980i72;
import X.C12828050g;
import X.C1559260qg8;
import X.C384050F3z;
import X.C418440Gaw;
import X.C427690Gpr;
import X.C723580SZw;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.zhiliaoapp.musically.R;
import java.util.List;
import wh6.AbS362S0000000_12;
import wh6.AbS695S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class FanGroupCreateAssemCell extends ReusedUISlotAssem<FanGroupCreateAssemCell> implements InterfaceC712990Rxx<C12828050g> {
    public final C1559260qg8 LLJJLIIIJLLLLLLLZ = new C1559260qg8(new C723580SZw(this, C1229980i72.class, null), checkSupervisorPrepared());

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cit;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        View viewFindViewById;
        View contentView = getContentView();
        if (contentView != null && (viewFindViewById = contentView.findViewById(R.id.f75)) != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(24));
            viewFindViewById.setBackground(c384050F3z.LIZ(viewFindViewById.getContext()));
        }
        View viewFindViewById2 = getContentView().findViewById(R.id.f6q);
        if (viewFindViewById2 != null) {
            C427690Gpr.LJ(viewFindViewById2, 0.0f);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C12828050g c12828050g) {
        int i;
        C12828050g c12828050g2 = c12828050g;
        if (c12828050g2.LL) {
            C786410Ut5.T4(getContentView(), 0.34f);
            C786410Ut5.I7(new AbS362S0000000_12(0), getContentView());
        } else {
            C786410Ut5.T4(getContentView(), 1.0f);
            C786410Ut5.I7(new AbS695S0100000_14(this, 0), getContentView());
        }
        View viewFindViewById = getContentView().findViewById(R.id.f6p);
        if (viewFindViewById != null) {
            if (c12828050g2.LLILLJJLI) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, viewFindViewById);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C12828050g c12828050g) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C12828050g c12828050g) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
