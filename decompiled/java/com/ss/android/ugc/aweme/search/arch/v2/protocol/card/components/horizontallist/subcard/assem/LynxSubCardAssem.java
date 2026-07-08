package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.horizontallist.subcard.assem;

import X.C1537720q7O;
import X.C1D3S;
import X.C1D66;
import X.C647630Paj;
import X.C655750Pnp;
import X.C682060QpA;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class LynxSubCardAssem extends ReusedUISlotAssem<LynxSubCardAssem> implements InterfaceC712990Rxx<C655750Pnp> {
    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.eu0;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C655750Pnp c655750Pnp) {
        C1D3S c1d3s;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        C655750Pnp c655750Pnp2 = c655750Pnp;
        String str = c655750Pnp2.LLILZ;
        if (str != null) {
            String str2 = c655750Pnp2.LLILZIL;
            if (str2 == null) {
                str2 = "";
            }
            if (C647630Paj.LJIIIIZZ(str)) {
                c1d3s = C1D3S.PRE_LAYOUT;
            } else {
                c1d3s = C1D3S.NORMAL;
            }
            Context context = getContext();
            if (context != null) {
                C1D66 c1d66 = new C1D66(context, str, c1d3s, C682060QpA.LIZ());
                c1d66.LIZJ(str2, c655750Pnp2.LLILZLL);
                C1537720q7O c1537720q7OLJFF = c1d66.LJFF();
                if (c1537720q7OLJFF != null) {
                    View viewLJJIJL = LJJIJL();
                    if ((viewLJJIJL instanceof ViewGroup) && (viewGroup2 = (ViewGroup) viewLJJIJL) != null) {
                        C786410Ut5.LJJJJI(viewGroup2);
                    }
                    View viewLJJIJL2 = LJJIJL();
                    if ((viewLJJIJL2 instanceof ViewGroup) && (viewGroup = (ViewGroup) viewLJJIJL2) != null) {
                        viewGroup.addView(c1537720q7OLJFF);
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C655750Pnp c655750Pnp) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C655750Pnp c655750Pnp) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
