package com.ss.android.ugc.aweme.im.sdk.chat.feature.read.ui;

import X.C019F;
import X.C01GW;
import X.C0OH3;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C897520ZIw;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel.ReadUserListViewModel;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class ReadUserListAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723590SZx(this, C0OH3.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLJ;
    public boolean LLJI;
    public final C01GW LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ReadUserListAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/im/sdk/chat/feature/read/viewmodel/ReadUserListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ReadUserListAssem() {
        C019F c019f = C019F.LIZ;
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(this, 173);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ReadUserListViewModel.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 172), AFwS240S0000000_9.get$arr$(118), awS553S0100000_9, true);
        this.LLJIJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 171));
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStart_isOnStartEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final ReadUserListViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (ReadUserListViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C897520ZIw c897520ZIwVQ2 = Go().vQ2();
        if (c897520ZIwVQ2 != null) {
            c897520ZIwVQ2.destroy();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onStart() {
        super.onStart();
        C897520ZIw c897520ZIwVQ2 = Go().vQ2();
        if (c897520ZIwVQ2 != null) {
            c897520ZIwVQ2.LJ();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        super.onStop();
        C897520ZIw c897520ZIwVQ2 = Go().vQ2();
        if (c897520ZIwVQ2 != null) {
            c897520ZIwVQ2.LJII();
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ((ViewOnAttachStateChangeListenerC20604515jv) this.LLJIJIL.getValue()).LJIILJJIL(ReadUserCell.class);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0OH2
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C2008107tn) obj).LL;
            }
        }, null, new AwS623S0100000_9(this, 36), 6);
    }
}
