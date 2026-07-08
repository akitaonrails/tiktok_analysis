package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.components.common.ui;

import X.AnonymousClass0207;
import X.C020M;
import X.C1559260qg8;
import X.C418440Gaw;
import X.C657190Pq9;
import X.C657280PqI;
import X.C657990PrR;
import X.C723590SZx;
import X.EnumC657200PqA;
import X.EnumC657300PqK;
import X.InterfaceC1587906Jp;
import X.InterfaceC657240PqE;
import X.InterfaceC712990Rxx;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.ss.android.ugc.aweme.base.widget.FixedRatioFrameLayout;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchMediaResizeAssem extends ReusedUIContentAssem<SearchMediaResizeAssem> implements InterfaceC712990Rxx<InterfaceC657240PqE> {
    public final C1559260qg8 LLJJJJ = new C1559260qg8(new C723590SZx(this, C657280PqI.class, null), checkSupervisorPrepared());

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
    public final void up(InterfaceC657240PqE interfaceC657240PqE) {
        FixedRatioFrameLayout fixedRatioFrameLayout;
        EnumC657200PqA ratio;
        int iLIZLLL;
        InterfaceC657240PqE interfaceC657240PqE2 = interfaceC657240PqE;
        if (((C657280PqI) this.LLJJJJ.getValue()).LL == EnumC657300PqK.SINGLE) {
            View viewLJJIJL = LJJIJL();
            if ((viewLJJIJL instanceof FixedRatioFrameLayout) && (fixedRatioFrameLayout = (FixedRatioFrameLayout) viewLJJIJL) != null) {
                if (interfaceC657240PqE2.getRatio() == EnumC657200PqA.AUTO) {
                    ratio = EnumC657200PqA.WIDE;
                } else {
                    ratio = interfaceC657240PqE2.getRatio();
                }
                float width = ratio.getValue().getWidth() / ratio.getValue().getHeight();
                int i = C657190Pq9.LIZ[ratio.ordinal()];
                if (i != 1 && i != 2) {
                    Context context = getContext();
                    if (context != null) {
                        iLIZLLL = C418440Gaw.LIZLLL(context);
                    } else {
                        iLIZLLL = 0;
                    }
                    C657990PrR.LIZJ(fixedRatioFrameLayout, new C020M(iLIZLLL, 10));
                    fixedRatioFrameLayout.setWhRatio(width);
                    fixedRatioFrameLayout.setMode(1);
                    return;
                }
                C657990PrR.LIZJ(fixedRatioFrameLayout, AnonymousClass0207.get$arr$(201));
                fixedRatioFrameLayout.setWhRatio(width);
                fixedRatioFrameLayout.setMode(1);
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC657240PqE interfaceC657240PqE) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC657240PqE interfaceC657240PqE) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
