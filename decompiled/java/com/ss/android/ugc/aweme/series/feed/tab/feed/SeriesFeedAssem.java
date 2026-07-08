package com.ss.android.ugc.aweme.series.feed.tab.feed;

import X.C019F;
import X.C098200Yq;
import X.C13LE;
import X.C1559260qg8;
import X.C1567950qu9;
import X.C1567990quD;
import X.C1568070quL;
import X.C1620920sHa;
import X.C1637806bA;
import X.C189200o6;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS390S0200000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS621S0100000_7;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.AwS638S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesFeedAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723590SZx(this, C1568070quL.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SeriesFeedAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/series/feed/tab/feed/SeriesFeedVM;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SeriesFeedAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeriesFeedVM.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 993), AFwS264S0000000_24.get$arr$(308), null, true);
    }

    public final C1568070quL Go() {
        return (C1568070quL) this.LLIZLLLIL.getValue();
    }

    public final SeriesFeedVM Ho() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        return (SeriesFeedVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        Unit unit;
        try {
            SeriesFeedViewHolder seriesFeedViewHolder = Go().LLILLJJLI;
            if (seriesFeedViewHolder != null) {
                seriesFeedViewHolder.onDestroyView();
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        super.onDestroy();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        SeriesFeedViewHolder seriesFeedViewHolder = Go().LLILLJJLI;
        if (seriesFeedViewHolder != null) {
            seriesFeedViewHolder.c0 = new C1567990quD(this);
            seriesFeedViewHolder.LLJJI(new C1620920sHa(this, seriesFeedViewHolder, 0));
        }
        SeriesFeedViewHolder seriesFeedViewHolder2 = Go().LLILLJJLI;
        if (seriesFeedViewHolder2 != null) {
            SeriesFeedVM seriesFeedVMHo = Ho();
            AssemViewModel.asyncSubscribe$default(seriesFeedVMHo, new C2217381BqS() { // from class: X.0qu7
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1567900qu4) obj).getRefreshState();
                }
            }, null, new AwS603S0100000_24(seriesFeedViewHolder2, 8), new AwS568S0100000_24(seriesFeedViewHolder2, 12), new AwS390S0200000_24(this, seriesFeedViewHolder2, 0), 2, null);
            AssemViewModel.asyncSubscribe$default(seriesFeedVMHo, new C2217381BqS() { // from class: X.0qu8
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1567900qu4) obj).getLoadMoreState();
                }
            }, null, new AwS603S0100000_24(seriesFeedViewHolder2, 10), new AwS568S0100000_24(seriesFeedViewHolder2, 13), new AwS390S0200000_24(this, seriesFeedViewHolder2, 1), 2, null);
            C736680Sv4.LJIIIIZZ(this, seriesFeedVMHo, new C2217381BqS() { // from class: X.0qu3
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1567900qu4) obj).LLILZLL;
                }
            }, null, new AwS638S0100000_24(seriesFeedViewHolder2, 8), 6);
            C736680Sv4.LJIIIIZZ(this, seriesFeedVMHo, new C2217381BqS() { // from class: X.0qu6
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1567900qu4) obj).LLIZLLLIL;
                }
            }, null, new AwS621S0100000_7(seriesFeedViewHolder2, 2), 6);
            C736680Sv4.LJIIIIZZ(this, seriesFeedVMHo, new C2217381BqS() { // from class: X.0quB
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1567900qu4) obj).LLIZ;
                }
            }, null, new AwS638S0100000_24(seriesFeedViewHolder2, 4), 6);
            C736680Sv4.LJIIIIZZ(this, seriesFeedVMHo, new C2217381BqS() { // from class: X.0qu1
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1567900qu4) obj).LLILZ;
                }
            }, null, new AwS638S0100000_24(seriesFeedViewHolder2, 5), 6);
            C736680Sv4.LJIIIIZZ(this, seriesFeedVMHo, new C2217381BqS() { // from class: X.0qu2
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1567900qu4) obj).LLILLL;
                }
            }, null, new AwS638S0100000_24(seriesFeedViewHolder2, 6), 6);
            C736680Sv4.LJIIIIZZ(this, seriesFeedVMHo, new C2217381BqS() { // from class: X.0quA
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1567900qu4) obj).LLILZIL;
                }
            }, null, new AwS633S0100000_19(seriesFeedViewHolder2, 1), 6);
            C736680Sv4.LJIIIIZZ(this, seriesFeedVMHo, new C2217381BqS() { // from class: X.0qu5
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1567900qu4) obj).LLJ;
                }
            }, null, new AwS638S0100000_24(this, 7), 6);
            Ho().AQ2(new C1567950qu9(Go(), new AwS568S0100000_24(this, 11)));
        }
    }
}
