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
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.innerpush.api.refactor.base.BaseInnerPushAreaSlotAssem;
import com.ss.android.ugc.aweme.innerpush.refactor.vm.InnerPushBottomVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS456S0200000_21;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class BottomSlotAssem extends BaseInnerPushAreaSlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public TuxTextView LLJJIJIIJIL;
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 706));
    public final AssemVMLazy LLJJJ;
    public final int LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BottomSlotAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/innerpush/refactor/vm/InnerPushBottomVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public BottomSlotAssem() {
        C683100Qqq c683100Qqq = C683100Qqq.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(InnerPushBottomVM.class);
        this.LLJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c683100Qqq, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 707), AFwS264S0000000_24.get$arr$(193), null, true);
        this.LLJJJIL = 5;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.ctb;
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.refactor.base.BaseInnerPushSlotAssem
    public final int hp() {
        return this.LLJJJIL;
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.refactor.base.BaseInnerPushAreaSlotAssem
    public final void kp(View view) {
        C19290510dT.LIZLLL("BottomSlotAssem", "[onClickOutPadding]");
        onClick(view);
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.refactor.base.BaseInnerPushAreaSlotAssem, com.ss.android.ugc.aweme.innerpush.api.refactor.base.BaseInnerPushSlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        AssemVMLazy assemVMLazy = this.LLJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217371BqR() { // from class: X.0qfC
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1556670qbx) obj).LL);
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C1556670qbx) obj).LL = ((Number) obj2).intValue();
            }
        }, null, new AwS456S0200000_21(view, this, 5), 6);
    }
}
