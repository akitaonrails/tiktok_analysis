package com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.ability;

import X.C1BNE;
import X.C2252321DDq;
import X.C461100I6i;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AwS25S0000100_6;

/* JADX INFO: loaded from: classes7.dex */
public final class ScrollToMessageViewModel extends AssemViewModel<C461100I6i> {
    public final C2252321DDq LL;
    public final C2252321DDq LLILLJJLI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C461100I6i(null, null);
    }

    public ScrollToMessageViewModel() {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(null);
        this.LL = c2252321DDqLIZ;
        this.LLILLJJLI = c2252321DDqLIZ;
    }

    public final void vQ2(long j) {
        C2252321DDq c2252321DDq = this.LL;
        while (!c2252321DDq.compareAndSet(c2252321DDq.getValue(), Long.valueOf(j))) {
        }
        setState(new AwS25S0000100_6(j, 0));
    }
}
