package com.ss.android.ugc.aweme.tako.otherpage.waiting;

import X.C1697810uHb;
import X.C1857750yRZ;
import X.C231600uw;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoWaitingVM extends AssemViewModel<C231600uw> {
    public final boolean[] LL;
    public final List<String> LLILLJJLI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C231600uw(0);
    }

    public TakoWaitingVM() {
        boolean[] zArr = new boolean[6];
        int i = 0;
        do {
            zArr[i] = false;
            i++;
        } while (i < 6);
        this.LL = zArr;
        this.LLILLJJLI = C1697810uHb.LJIIJJI(C1857750yRZ.LJII(2131849862), C1857750yRZ.LJII(2131849863), C1857750yRZ.LJII(2131849864), C1857750yRZ.LJII(2131849865), C1857750yRZ.LJII(2131849866), C1857750yRZ.LJII(2131849867));
    }
}
