package com.ss.android.ugc.aweme.mix.mixdetail.viewmodel;

import X.C1165050gQJ;
import X.C1205840hU6;
import X.C13LE;
import X.C593430NPh;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;

/* JADX INFO: loaded from: classes19.dex */
public final class PlaylistManagementViewModel extends AssemViewModel<C593430NPh> {
    public C1165050gQJ LL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C593430NPh(null);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        this.LL = (C1165050gQJ) C1205840hU6.LIZIZ(getLifecycle(), C13LE.LIZ(C1165050gQJ.class));
    }
}
