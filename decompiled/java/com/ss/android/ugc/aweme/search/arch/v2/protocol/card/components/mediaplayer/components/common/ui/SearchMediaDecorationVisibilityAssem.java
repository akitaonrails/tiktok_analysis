package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.components.common.ui;

import X.C0HHT;
import X.C13IQ;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C337180DJs;
import X.C654550Plt;
import X.C723580SZw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C737910Sx3;
import X.InterfaceC1587906Jp;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC657240PqE;
import X.InterfaceC712990Rxx;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.ui.SearchMediaAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.viewmodel.SearchMediaPlayStateVM;
import java.util.List;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AFwS293S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchMediaDecorationVisibilityAssem extends ReusedUIContentAssem<SearchMediaDecorationVisibilityAssem> implements InterfaceC712990Rxx<InterfaceC657240PqE> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJL;
    public final InterfaceC1731706qJ LLJJJJ;
    public View LLJJJJJIL;
    public View LLJJJJLIIL;
    public boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchMediaDecorationVisibilityAssem.class, "playStateVM", "getPlayStateVM()Lcom/ss/android/ugc/aweme/search/arch/v2/protocol/card/components/mediaplayer/viewmodel/SearchMediaPlayStateVM;", 0);
        C13LE.LIZ.getClass();
        LLJL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SearchMediaDecorationVisibilityAssem() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchMediaPlayStateVM.class);
        this.LLJJJJ = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 244), null, AFwS241S0000000_10.get$arr$(149));
        checkSupervisorPrepared();
        new C723580SZw(this, C654550Plt.class, null);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Eo(View view) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        SearchMediaAssem.LLLFFI.getClass();
        this.LLJJJJJIL = view.findViewById(SearchMediaAssem.LLLII);
        this.LLJJJJLIIL = view.findViewById(SearchMediaAssem.LLLIIII);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJJJ.getValue(this, LLJL[0]), new C2217381BqS() { // from class: X.0Pst
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C658860Psq) obj).LL;
            }
        }, null, AFwS293S0000000_10.get$arr$(66), 6);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC657240PqE interfaceC657240PqE) {
        InterfaceC657240PqE interfaceC657240PqE2 = interfaceC657240PqE;
        this.LLJJL = interfaceC657240PqE2.LJJJJZ();
        this.LLJJLIIIJLLLLLLLZ = interfaceC657240PqE2.LLFZ();
        C337180DJs.LIZJ(this.LLJJJJJIL);
        C337180DJs.LIZJ(this.LLJJJJLIIL);
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
