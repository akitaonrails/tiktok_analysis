package com.ss.android.ugc.aweme.tako.otherpage.sheet;

import X.C1159050gGd;
import X.C2217381BqS;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class TakoSheetVM extends AssemViewModel<C1159050gGd> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1159050gGd(0);
    }

    public final void vQ2(Function0<Unit> function0) {
        AssemViewModel.selectSubscribe$default(this, new C2217381BqS() { // from class: X.0gM2
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1159050gGd) obj).LL;
            }
        }, null, null, null, new AwS597S0100000_18(function0, (Function0<Unit>) 592), 14, null);
    }

    public final void wQ2(Function0<Unit> function0) {
        AssemViewModel.selectSubscribe$default(this, new C2217381BqS() { // from class: X.0gMZ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1159050gGd) obj).LLILLJJLI;
            }
        }, null, null, null, new AwS597S0100000_18(function0, (Function0<Unit>) 593), 14, null);
    }
}
