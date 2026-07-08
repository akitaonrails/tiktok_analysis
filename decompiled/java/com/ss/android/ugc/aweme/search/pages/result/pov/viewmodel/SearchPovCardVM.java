package com.ss.android.ugc.aweme.search.pages.result.pov.viewmodel;

import X.C041J;
import X.C684540QtA;
import X.C684560QtC;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AwS25S0010000_10;
import kotlin.jvm.internal.AwS61S1000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchPovCardVM extends AssemViewModel<C684540QtA> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C684540QtA(0);
    }

    public final void wQ2(boolean z) {
        setStateImmediate(new AwS25S0010000_10(z, 6));
    }

    public final void vQ2(int i, String str) {
        boolean z;
        Integer num;
        C684540QtA c684540QtA = (C684540QtA) this.vmDispatcher.getState();
        if (C041J.LIZ(c684540QtA.LLIZLLLIL) && (!Intrinsics.LJFF(c684540QtA.LLIZLLLIL, str) || (num = c684540QtA.LLJI) == null || num.intValue() != i)) {
            z = true;
        } else {
            z = false;
        }
        setStateImmediate(new C684560QtC(str, i));
        if (z) {
            setStateImmediate(new AwS61S1000000_10(str, 13));
        }
    }
}
