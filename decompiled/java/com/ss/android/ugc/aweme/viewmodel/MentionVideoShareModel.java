package com.ss.android.ugc.aweme.viewmodel;

import X.C1220740hs8;
import X.C2217381BqS;
import X.InterfaceC0148002o;
import X.InterfaceC1747020vYy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class MentionVideoShareModel extends AssemViewModel<C1220740hs8> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1220740hs8(0);
    }

    public final void wQ2(Integer num) {
        setState(new AwS598S0100000_19(num, 280));
    }

    public final void vQ2(C2217381BqS c2217381BqS, Function1 function1) {
        AssemViewModel.selectSubscribe$default(this, c2217381BqS, null, null, null, new AwS597S0100000_18(function1, (Function1<? super InterfaceC1747020vYy, Unit>) 752), 14, null);
    }
}
