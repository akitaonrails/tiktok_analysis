package com.ss.android.ugc.aweme.series.feed.tab.v2;

import X.C019F;
import X.C098200Yq;
import X.C1155330gAd;
import X.C13LE;
import X.C1559260qg8;
import X.C1620920sHa;
import X.C1637806bA;
import X.C189200o6;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C622680Oba;
import X.C723580SZw;
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
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class DramaPicksAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723580SZw(this, C1155330gAd.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(DramaPicksAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/series/feed/tab/v2/DramaPicksVM;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public DramaPicksAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(DramaPicksVM.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 2214), AFwS264S0000000_24.get$arr$(313), null, true);
    }

    public final DramaPicksVM Go() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        return (DramaPicksVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        Unit unit;
        DramaPicksPanel dramaPicksPanel;
        try {
            C1155330gAd c1155330gAd = (C1155330gAd) this.LLIZLLLIL.getValue();
            if (c1155330gAd == null || (dramaPicksPanel = c1155330gAd.LL) == null) {
                unit = null;
            } else {
                dramaPicksPanel.onDestroyView();
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        super.onDestroy();
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0qtz, java.lang.Object] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        DramaPicksPanel dramaPicksPanel;
        DramaPicksPanel dramaPicksPanel2;
        super.onViewCreated(view);
        C1155330gAd c1155330gAd = (C1155330gAd) this.LLIZLLLIL.getValue();
        if (c1155330gAd != null && (dramaPicksPanel2 = c1155330gAd.LL) != null) {
            dramaPicksPanel2.LLJJI(new C1620920sHa(this, dramaPicksPanel2, 2));
        }
        C1155330gAd c1155330gAd2 = (C1155330gAd) this.LLIZLLLIL.getValue();
        if (c1155330gAd2 != null && (dramaPicksPanel = c1155330gAd2.LL) != null) {
            DramaPicksVM dramaPicksVMGo = Go();
            AssemViewModel.asyncSubscribe$default(dramaPicksVMGo, new C2217381BqS() { // from class: X.0qtR
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1567810qtv) obj).getRefreshState();
                }
            }, dramaPicksVMGo, null, new AwS603S0100000_24(dramaPicksPanel, 442), new AwS568S0100000_24(dramaPicksPanel, 1638), new AwS390S0200000_24(this, dramaPicksPanel, 63), 4, null);
            AssemViewModel.asyncSubscribe$default(dramaPicksVMGo, new C2217381BqS() { // from class: X.0qtS
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1567810qtv) obj).getLoadMoreState();
                }
            }, dramaPicksVMGo, null, new AwS603S0100000_24(dramaPicksPanel, 445), new AwS568S0100000_24(dramaPicksPanel, 1639), new AwS390S0200000_24(this, dramaPicksPanel, 64), 4, null);
            C736680Sv4.LJIIIIZZ(this, dramaPicksVMGo, new C2217381BqS() { // from class: X.0qtx
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1567810qtv) obj).LLILZIL;
                }
            }, null, new AwS638S0100000_24(dramaPicksPanel, 129), 6);
            C736680Sv4.LJIIIIZZ(this, dramaPicksVMGo, new C2217381BqS() { // from class: X.0qtt
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1567810qtv) obj).LLILZ;
                }
            }, null, new AwS638S0100000_24(dramaPicksPanel, 130), 6);
            C736680Sv4.LJIIIIZZ(this, dramaPicksVMGo, new C2217381BqS() { // from class: X.0qtu
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1567810qtv) obj).LLILLL;
                }
            }, null, new AwS638S0100000_24(dramaPicksPanel, 131), 6);
            final DramaPicksVM dramaPicksVMGo2 = Go();
            dramaPicksVMGo2.LLJ = new AwS562S0100000_18(this, 2450);
            ?? r0 = new Object() { // from class: X.0qtz
                /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
                @X.C14EU(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onClearModeRequest(X.C1567860qu0 r5) {
                    /*
                        r4 = this;
                        X.0r8K r0 = X.C690440R6k.LIZ()
                        if (r0 == 0) goto L18
                        boolean r0 = r0.LJI
                        r3 = 1
                        if (r0 != r3) goto L18
                    Lb:
                        com.ss.android.ugc.aweme.series.feed.tab.v2.DramaPicksVM r2 = r1
                        kotlin.jvm.internal.AwS36S0010000_24 r1 = new kotlin.jvm.internal.AwS36S0010000_24
                        r0 = 18
                        r1.<init>(r3, r0)
                        r2.setState(r1)
                        return
                    L18:
                        r3 = 0
                        goto Lb
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1567850qtz.onClearModeRequest(X.0qu0):void");
                }
            };
            dramaPicksVMGo2.LLILZ = r0;
            C622680Oba.LIZJ(r0);
            dramaPicksVMGo2.xQ2(null);
        }
    }
}
