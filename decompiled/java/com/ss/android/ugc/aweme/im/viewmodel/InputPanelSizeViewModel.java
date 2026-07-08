package com.ss.android.ugc.aweme.im.viewmodel;

import X.C457600Hx0;
import X.C457640Hx4;
import X.InterfaceC0148002o;
import X.InterfaceC1659706eh;
import com.bytedance.assem.arch.viewModel.AssemViewModel;

/* JADX INFO: loaded from: classes7.dex */
public final class InputPanelSizeViewModel extends AssemViewModel<C457640Hx4> implements InterfaceC1659706eh {
    public final /* synthetic */ C457600Hx0 LL = new C457600Hx0();

    @Override // X.InterfaceC1659706eh
    public final void setVisibility(boolean z) {
        this.LL.setVisibility(z);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C457640Hx4(0, 0);
    }
}
