package com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.viewmodel;

import X.C1653306df;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;

/* JADX INFO: loaded from: classes3.dex */
public final class QuickChatViewModel extends AssemViewModel<C1653306df> {
    public final boolean LL;

    public QuickChatViewModel() {
        this(false);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1653306df(6, this.LL);
    }

    public QuickChatViewModel(boolean z) {
        this.LL = z;
    }
}
