package com.ss.android.ugc.aweme.live.notification;

import X.C11JF;
import X.InterfaceC0148002o;
import X.InterfaceC1252130igl;
import X.InterfaceC1891350zJl;
import X.InterfaceC420801kM;
import X.InterfaceC738070SxJ;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final class NotificationLiveAssemViewModel extends AssemViewModel<ResponseState> implements InterfaceC1252130igl, InterfaceC738070SxJ<ResponseState, InterfaceC1891350zJl> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new ResponseState(-1, -1, null, null);
    }

    @Override // X.InterfaceC1252130igl
    public final InterfaceC420801kM Dd(C11JF c11jf) {
        disposeOnClear(c11jf);
        return c11jf;
    }

    @Override // X.InterfaceC1252130igl
    public final void LJJJZ(Function1<? super ResponseState, ResponseState> function1) {
        setState(function1);
    }

    @Override // X.InterfaceC738070SxJ
    public final InterfaceC1891350zJl state2ItemAccept(InterfaceC0148002o interfaceC0148002o, InterfaceC1891350zJl interfaceC1891350zJl) {
        return interfaceC1891350zJl;
    }

    @Override // X.InterfaceC738070SxJ
    public final InterfaceC0148002o itemSync2StateAccept(InterfaceC0148002o interfaceC0148002o, InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        return new ResponseState(-1, -1, null, null);
    }
}
