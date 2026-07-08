package com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm;

import X.C0PEM;
import X.C1BNE;
import X.C2252321DDq;
import X.C23250099c;
import X.C885630Yoj;
import X.C887820YsG;
import X.C887890YsN;
import X.InterfaceC0148002o;
import X.InterfaceC885250Yo7;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS65S1000000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class MessageRequestRootPageVM extends AssemViewModel<C887820YsG> implements InterfaceC885250Yo7 {
    public final C2252321DDq LL = C1BNE.LIZ(Boolean.FALSE);

    @Override // X.InterfaceC885250Yo7
    public final void An() {
        this.LL.setValue(Boolean.TRUE);
    }

    @Override // X.InterfaceC885250Yo7
    public final void LJ() {
        setState(AFwS248S0000000_14.get$arr$(119));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C887820YsG(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        if (C885630Yoj.LIZJ(false)) {
            C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C887890YsN(this, null), 2);
        }
    }

    @Override // X.InterfaceC885250Yo7
    public final void sq0(String str) {
        setState(new AwS65S1000000_14(str, 1));
    }
}
