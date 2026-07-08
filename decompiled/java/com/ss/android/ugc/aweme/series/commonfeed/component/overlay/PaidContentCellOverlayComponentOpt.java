package com.ss.android.ugc.aweme.series.commonfeed.component.overlay;

import X.C01GW;
import X.C11NJ;
import X.C13LE;
import X.C2217381BqS;
import X.C339190DRl;
import X.C452501pT;
import X.C736680Sv4;
import X.C737910Sx3;
import X.InterfaceC1615720s9C;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AFwS310S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class PaidContentCellOverlayComponentOpt extends BaseCellSlotComponent<PaidContentCellOverlayComponentOpt> {
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 903));
    public final C01GW LLJLLL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS264S0000000_24.get$arr$(276));
    public final C11NJ LLJZ = new C11NJ();
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 902));
    public boolean LLL;

    public final InterfaceC1615720s9C Bp() {
        return (InterfaceC1615720s9C) this.LLJZIJLIL.getValue();
    }

    public final void Ep() {
        if (getContentView().getVisibility() == 0) {
            C339190DRl.LIZIZ(getContentView());
            Bp().LJFF();
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return Bp().LIZLLL();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        Bp().LJJIIJ();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        Bp().onViewCreated(view);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLL.getValue(), new C2217381BqS() { // from class: X.0zq2
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLL;
            }
        }, null, AFwS310S0000000_24.get$arr$(55), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLL.getValue(), new C2217381BqS() { // from class: X.0zq3
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILZ;
            }
        }, null, AFwS310S0000000_24.get$arr$(56), 6);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
    }
}
