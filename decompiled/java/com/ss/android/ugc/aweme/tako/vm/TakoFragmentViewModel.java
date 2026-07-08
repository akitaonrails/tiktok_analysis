package com.ss.android.ugc.aweme.tako.vm;

import X.C1575790r6n;
import X.C1853920yLO;
import X.C2217381BqS;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS36S0001000_24;
import kotlin.jvm.internal.AwS36S0010000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class TakoFragmentViewModel extends AssemViewModel<C1853920yLO> {
    public static final /* synthetic */ int LL = 0;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1853920yLO(0);
    }

    public final void AE1(int i) {
        setState(new AwS36S0001000_24(i, 5));
    }

    public final void Sx2(boolean z) {
        if (Intrinsics.LJFF(getState().LLILZIL.LIZ, Boolean.TRUE) && !z) {
            setState(new AwS36S0010000_24(false, 39));
        }
        setState(new AwS36S0010000_24(z, 16));
    }

    public final void vQ2(boolean z) {
        if (Intrinsics.LJFF(getState().LLILZIL.LIZ, Boolean.TRUE) && !z) {
            setState(new AwS36S0010000_24(false, 39));
        }
        setState(new AwS36S0010000_24(z, 17));
    }

    public final void wQ2(Function1<? super Boolean, Unit> function1) {
        AssemViewModel.selectSubscribe$default(this, new C2217381BqS() { // from class: X.0r0E
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1853920yLO) obj).LLILLJJLI;
            }
        }, null, null, null, new AwS603S0100000_24(function1, (Function1<? super C1575790r6n, Unit>) 330), 14, null);
    }
}
