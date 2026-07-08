package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.sendmsg;

import X.C01GW;
import X.C08CX;
import X.C09IR;
import X.C1BNE;
import X.C2252321DDq;
import X.C2252331DDr;
import X.C452501pT;
import X.C454070HrJ;
import X.C454120HrO;
import X.C454390Hrp;
import X.C463090IDz;
import X.InterfaceC0148002o;
import X.InterfaceC1700206lE;
import X.InterfaceC454400Hrq;
import X.InterfaceC456460HvA;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class SendMessageVM extends AssemViewModel<InterfaceC0148002o> implements InterfaceC456460HvA, InterfaceC1700206lE {
    public final C2252331DDr LL;
    public final C2252331DDr LLILLJJLI;
    public final C2252331DDr LLILLL;
    public final C2252331DDr LLILZ;
    public final C2252331DDr LLILZIL;
    public final C2252331DDr LLILZLL;
    public final C2252331DDr LLIZ;
    public final C2252331DDr LLIZLLLIL;
    public final C2252331DDr LLJ;
    public final C2252331DDr LLJI;
    public final C2252321DDq LLJIJIL;
    public final C2252321DDq LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C2252321DDq LLJILLL;

    @Override // X.InterfaceC456460HvA
    public final void cy2() {
        this.LL.LIZJ(Boolean.TRUE);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C463090IDz(12);
    }

    public SendMessageVM() {
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 1, null, 5);
        this.LL = c2252331DDrLIZIZ;
        this.LLILLJJLI = c2252331DDrLIZIZ;
        C2252331DDr c2252331DDrLIZIZ2 = C09IR.LIZIZ(0, 1, null, 5);
        this.LLILLL = c2252331DDrLIZIZ2;
        this.LLILZ = c2252331DDrLIZIZ2;
        C2252331DDr c2252331DDrLIZIZ3 = C09IR.LIZIZ(0, 1, null, 5);
        this.LLILZIL = c2252331DDrLIZIZ3;
        this.LLILZLL = c2252331DDrLIZIZ3;
        C2252331DDr c2252331DDrLIZIZ4 = C09IR.LIZIZ(0, 1, null, 5);
        this.LLIZ = c2252331DDrLIZIZ4;
        this.LLIZLLLIL = c2252331DDrLIZIZ4;
        C2252331DDr c2252331DDrLIZIZ5 = C09IR.LIZIZ(0, 1, null, 5);
        this.LLJ = c2252331DDrLIZIZ5;
        this.LLJI = c2252331DDrLIZIZ5;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(null);
        this.LLJIJIL = c2252321DDqLIZ;
        this.LLJILJIL = c2252321DDqLIZ;
        this.LLJILJILJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(87));
        this.LLJILLL = C1BNE.LIZ(C08CX.INSTANCE);
    }

    @Override // X.InterfaceC1700206lE
    public final void Up0(C454070HrJ c454070HrJ) {
        this.LLIZ.LIZJ(c454070HrJ);
    }

    @Override // X.InterfaceC456460HvA
    public final void pP(C454120HrO c454120HrO) {
        this.LLJ.LIZJ(c454120HrO);
    }

    public final void vQ2(CharSequence charSequence) {
        C454390Hrp c454390Hrp;
        InterfaceC454400Hrq interfaceC454400Hrq = (InterfaceC454400Hrq) this.LLJILJILJ.getValue();
        if (interfaceC454400Hrq == null) {
            return;
        }
        boolean zLIZ = interfaceC454400Hrq.LIZ(charSequence);
        String strLIZIZ = interfaceC454400Hrq.LIZIZ(charSequence);
        C2252321DDq c2252321DDq = this.LLJIJIL;
        if (!zLIZ && strLIZIZ == null) {
            c454390Hrp = null;
        } else {
            c454390Hrp = new C454390Hrp(zLIZ, strLIZIZ);
        }
        c2252321DDq.setValue(c454390Hrp);
    }
}
