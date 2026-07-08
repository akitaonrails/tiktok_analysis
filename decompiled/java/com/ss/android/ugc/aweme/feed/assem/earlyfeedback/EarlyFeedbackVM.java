package com.ss.android.ugc.aweme.feed.assem.earlyfeedback;

import X.C01GW;
import X.C231100ur;
import X.C452501pT;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AFwS221S0000000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class EarlyFeedbackVM extends AssemViewModel<C231100ur> {
    public long LLILLJJLI;
    public final C01GW LL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(180));
    public long LLILLL = System.currentTimeMillis();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C231100ur(null);
    }

    public final void vQ2() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LLILLJJLI += jCurrentTimeMillis - this.LLILLL;
        this.LLILLL = jCurrentTimeMillis;
    }
}
