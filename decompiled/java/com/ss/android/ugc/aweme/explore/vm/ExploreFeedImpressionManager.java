package com.ss.android.ugc.aweme.explore.vm;

import X.C0152002s;
import X.C150B;
import X.C150C;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AwS82S0210000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class ExploreFeedImpressionManager extends AssemViewModel<C0152002s> {
    public static final /* synthetic */ int LLILLL = 0;
    public final C150C LL = new C150B() { // from class: X.150C
        @Override // X.C150B
        public final void LIZ(String str, AwS82S0210000_31 awS82S0210000_31) {
            if (!C13LP.LJJJJ(str, this.LIZ)) {
                return;
            }
            super.LIZ(str, awS82S0210000_31);
        }
    };
    public final C150B LLILLJJLI = new C150B();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0152002s(0);
    }
}
