package com.ss.android.ugc.aweme.music.vm;

import X.C01GW;
import X.C1331660kl2;
import X.C2438609h2;
import X.C2502009rG;
import X.C452501pT;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AwS547S0100000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class MusicHighlightBackgroundViewModel extends AssemViewModel<C2438609h2> {
    public final C01GW LL = C452501pT.LIZIZ(new AwS547S0100000_3(this, 39));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C2438609h2(null);
    }

    public final void vQ2(String str) {
        C1331660kl2.LJIIIZ(str).LJJII((C2502009rG) this.LL.getValue());
    }
}
