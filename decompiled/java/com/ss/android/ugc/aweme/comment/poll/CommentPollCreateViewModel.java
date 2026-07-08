package com.ss.android.ugc.aweme.comment.poll;

import X.C1347410lAR;
import X.C1347420lAS;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS387S0200000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentPollCreateViewModel extends AssemViewModel<C1347420lAS> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1347420lAS(null);
    }

    public final C1347410lAR vQ2() {
        C1347410lAR c1347410lAR = getState().LL;
        return c1347410lAR == null ? new C1347410lAR(0) : c1347410lAR;
    }

    public final void wQ2(Function1<? super C1347410lAR, C1347410lAR> function1) {
        C1347410lAR c1347410lAR = getState().LL;
        if (c1347410lAR == null) {
            c1347410lAR = new C1347410lAR(0);
        }
        setStateImmediate(new AwS387S0200000_21((Function1) function1, (Function1<? super C1347410lAR, C1347410lAR>) c1347410lAR, (C1347410lAR) 19));
    }
}
