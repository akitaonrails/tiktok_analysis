package com.bytedance.touchpoint.api.viewmodel;

import X.C0J3E;
import X.C0ZP4;
import X.C1770850wBP;
import X.C1895060zPk;
import X.C1895080zPm;
import X.C2217381BqS;
import X.C736820SvI;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes29.dex */
public abstract class BaseTouchPointDataVM extends AssemViewModel<C1895080zPm> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1895080zPm(0);
    }

    public final void wQ2() {
        setState(new C1895060zPk());
    }

    public final C0ZP4 vQ2(C2217381BqS c2217381BqS, C1770850wBP c1770850wBP, Function1 function1) {
        C1770850wBP c1770850wBPLIZIZ = c1770850wBP;
        C0J3E c0j3e = C0J3E.LL;
        if (c1770850wBPLIZIZ == null) {
            c1770850wBPLIZIZ = C736820SvI.LIZIZ(false);
        }
        return AssemViewModel.selectSubscribe$default(this, c2217381BqS, c1770850wBPLIZIZ, c0j3e, null, function1, 8, null);
    }
}
