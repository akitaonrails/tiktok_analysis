package com.ss.android.ugc.aweme.im.lightinteract.api.assem;

import X.C1603006Pk;
import X.InterfaceC0148002o;
import X.InterfaceC1602806Pi;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS17S0010000_2;
import kotlin.jvm.internal.AwS581S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class ChatRoomAlphaVideoCommonVM extends AssemViewModel<C1603006Pk> implements InterfaceC1602806Pi {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1603006Pk(false);
    }

    @Override // X.InterfaceC1602806Pi
    public final boolean isPlaying() {
        return getState().LL;
    }

    @Override // X.InterfaceC1602806Pi
    public final void bc(boolean z) {
        setState(new AwS17S0010000_2(z, 2));
    }

    @Override // X.InterfaceC1602806Pi
    public final void s30(Function1<? super C1603006Pk, Unit> function1) {
        withState(new AwS581S0100000_2((Function1) function1, (Function1<Object, String>) 214));
    }
}
