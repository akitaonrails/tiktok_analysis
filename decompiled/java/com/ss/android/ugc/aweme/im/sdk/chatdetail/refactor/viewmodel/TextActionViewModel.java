package com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.viewmodel;

import X.C2172781A1s;
import X.InterfaceC0148002o;
import X.InterfaceC2172841A1y;
import X.InterfaceC738310Sxh;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS45S0010000_33;
import kotlin.jvm.internal.AwS612S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class TextActionViewModel extends BaseActionViewModel<C2172781A1s> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C2172781A1s(0);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.viewmodel.BaseActionViewModel
    public final void nw(boolean z) {
        setState(new AwS45S0010000_33(z, 4));
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.viewmodel.BaseActionViewModel
    public final void vQ2(Function1<? super InterfaceC2172841A1y, ? extends InterfaceC2172841A1y> function1) {
        setState(new AwS612S0100000_33(function1, (Function1<? super InterfaceC738310Sxh, Unit>) 81));
    }
}
