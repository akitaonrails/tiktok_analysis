package com.ss.android.ugc.aweme.explore.vm;

import X.C15SI;
import X.C2217381BqS;
import X.C291001Au;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS43S0010000_31;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class ExploreFeedStateSharedVM extends AssemViewModel<C15SI> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C15SI(null, null, null, null);
    }

    public final void vQ2(Function1<? super C291001Au<Long>, Unit> function1) {
        AssemViewModel.selectSubscribe$default(this, new C2217381BqS() { // from class: X.15SG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C15SI) obj).LLILLJJLI;
            }
        }, null, null, null, new AwS610S0100000_31(function1, (Function1<? super C291001Au<Long>, Unit>) 187), 14, null);
    }

    public final void wQ2(boolean z) {
        setState(new AwS43S0010000_31(z, 3));
    }
}
