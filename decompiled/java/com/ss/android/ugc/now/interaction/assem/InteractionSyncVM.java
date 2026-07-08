package com.ss.android.ugc.now.interaction.assem;

import X.C1353770lKh;
import X.InterfaceC0148002o;
import X.InterfaceC1352360lIQ;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.now.interaction.api.InteractionSyncViewModelState;
import kotlin.jvm.internal.AwS7S1000100_21;

/* JADX INFO: loaded from: classes22.dex */
public final class InteractionSyncVM extends AssemViewModel<InteractionSyncViewModelState> implements InterfaceC1352360lIQ {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new InteractionSyncViewModelState(null, null, null, null, null, null, new User(), null);
    }

    @Override // X.InterfaceC1352360lIQ
    public final void sr(long j, String str) {
        setState(new AwS7S1000100_21(j, str, 0));
    }

    @Override // X.InterfaceC1352360lIQ
    public final void bD(long j, String str, boolean z, boolean z2) {
        setState(new C1353770lKh(j, z, z2, str));
    }
}
