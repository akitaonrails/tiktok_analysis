package com.ss.android.ugc.aweme.minidrama.tab.v2;

import X.AbstractC19484711Kz;
import X.C1156010gBj;
import X.C11S5;
import X.InterfaceC0148002o;
import X.InterfaceC1158780gGC;
import Y.ACallableS423S0100000_18;
import Y.AfS187S0100000_18;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AFwS256S0000000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class DramaTopTabMainViewModel extends AssemViewModel<C1156010gBj> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1156010gBj(0);
    }

    public final void vQ2(InterfaceC1158780gGC interfaceC1158780gGC) {
        setState(AFwS256S0000000_18.get$arr$(128));
        disposeOnClear(AbstractC19484711Kz.LJIJI(new ACallableS423S0100000_18(interfaceC1158780gGC, 0)).LJJIJIIJI(C11S5.LIZ()).LJJIIZ(new AfS187S0100000_18(this, 16), new AfS187S0100000_18(this, 17)));
    }
}
