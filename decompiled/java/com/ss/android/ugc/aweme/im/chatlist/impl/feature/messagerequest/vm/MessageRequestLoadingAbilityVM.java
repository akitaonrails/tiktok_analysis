package com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm;

import X.C0OLM;
import X.InterfaceC0148002o;
import X.InterfaceC885460YoS;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS60S1000000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class MessageRequestLoadingAbilityVM extends AssemViewModel<C0OLM> implements InterfaceC885460YoS {
    @Override // X.InterfaceC885460YoS
    public final void LJ() {
        setState(AFwS240S0000000_9.get$arr$(114));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0OLM(0);
    }

    @Override // X.InterfaceC885460YoS
    public final void z4() {
        setState(AFwS240S0000000_9.get$arr$(113));
    }

    @Override // X.InterfaceC885460YoS
    public final void Ka(String str) {
        setState(new AwS60S1000000_9(str, 2));
    }
}
