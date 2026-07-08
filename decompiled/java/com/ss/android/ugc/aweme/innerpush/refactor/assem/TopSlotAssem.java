package com.ss.android.ugc.aweme.innerpush.refactor.assem;

import X.C01GW;
import X.C13LE;
import X.C1637806bA;
import X.C19290510dT;
import X.C19719912Dl;
import X.C2217371BqR;
import X.C2217381BqS;
import X.C452501pT;
import X.C683100Qqq;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.innerpush.api.refactor.base.BaseInnerPushAreaSlotAssem;
import com.ss.android.ugc.aweme.innerpush.refactor.vm.InnerPushTopVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS635S0100000_21;
import kotlin.jvm.internal.AwS670S0100000_21;

/* JADX INFO: loaded from: classes25.dex */
public final class TopSlotAssem extends BaseInnerPushAreaSlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public RemoteImageView LLJJIJIIJIL;
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 710));
    public final AssemVMLazy LLJJJ;
    public final int LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TopSlotAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/innerpush/refactor/vm/InnerPushTopVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public TopSlotAssem() {
        C683100Qqq c683100Qqq = C683100Qqq.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(InnerPushTopVM.class);
        this.LLJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c683100Qqq, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 711), AFwS264S0000000_24.get$arr$(194), null, true);
        this.LLJJJIL = 4;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.ctf;
    }

    public final RemoteImageView lp() {
        return (RemoteImageView) this.LLJJIJIL.getValue();
    }

    public final InnerPushTopVM mp() {
        AssemVMLazy assemVMLazy = this.LLJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        return (InnerPushTopVM) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.refactor.base.BaseInnerPushSlotAssem
    public final int hp() {
        return this.LLJJJIL;
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.refactor.base.BaseInnerPushAreaSlotAssem
    public final void kp(View view) {
        C19290510dT.LIZLLL("TopSlotAssem", "[onClickOutPadding]");
        onClick(view);
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.refactor.base.BaseInnerPushAreaSlotAssem, com.ss.android.ugc.aweme.innerpush.api.refactor.base.BaseInnerPushSlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C736680Sv4.LJIIIIZZ(this, mp(), new C2217371BqR() { // from class: X.0qt1
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1567300qt6) obj).LL);
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C1567300qt6) obj).LL = ((Number) obj2).intValue();
            }
        }, null, new AwS635S0100000_21(view, 76), 6);
        C736680Sv4.LJIIIZ(this, mp(), new C2217371BqR() { // from class: X.0qt2
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1567300qt6) obj).LLILZIL);
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C1567300qt6) obj).LLILZIL = ((Number) obj2).intValue();
            }
        }, new C2217371BqR() { // from class: X.0qt3
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1567300qt6) obj).LLILZ);
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C1567300qt6) obj).LLILZ = ((Number) obj2).intValue();
            }
        }, null, new AwS670S0100000_21(this, 15), 12);
        C736680Sv4.LJIIIIZZ(this, mp(), new C2217371BqR() { // from class: X.0qt4
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1567300qt6) obj).LLILZLL);
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C1567300qt6) obj).LLILZLL = ((Number) obj2).intValue();
            }
        }, null, new AwS635S0100000_21(this, 77), 6);
        C736680Sv4.LJIIIZ(this, mp(), new C2217371BqR() { // from class: X.0qt7
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1567300qt6) obj).LLILLJJLI;
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C1567300qt6) obj).LLILLJJLI = (String) obj2;
            }
        }, new C2217371BqR() { // from class: X.0qt5
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1567300qt6) obj).LLILLL);
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C1567300qt6) obj).LLILLL = ((Number) obj2).intValue();
            }
        }, null, new AwS670S0100000_21(this, 14), 12);
    }
}
