package com.ss.android.ugc.aweme.music.vm;

import X.C633640OtG;
import X.InterfaceC0148002o;
import X.InterfaceC633510Ot3;
import com.bytedance.assem.arch.viewModel.AssemViewModel;

/* JADX INFO: loaded from: classes10.dex */
public final class LegacyCommunicateViewModel extends AssemViewModel<C633640OtG> {
    public InterfaceC633510Ot3 LL;
    public boolean LLILLJJLI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C633640OtG(null, null);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LL = null;
        this.LLILLJJLI = false;
    }
}
