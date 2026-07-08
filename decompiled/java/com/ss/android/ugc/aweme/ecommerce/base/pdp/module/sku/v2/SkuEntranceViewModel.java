package com.ss.android.ugc.aweme.ecommerce.base.pdp.module.sku.v2;

import X.C004I;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;

/* JADX INFO: loaded from: classes2.dex */
public final class SkuEntranceViewModel extends JediViewModel<SkuEntranceState> {
    public final PdpViewModel LLILZIL;

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final C004I zQ2() {
        return new SkuEntranceState(null, new Object());
    }

    @Override // com.bytedance.jedi.arch.JediViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
    }

    public SkuEntranceViewModel(PdpViewModel pdpViewModel) {
        this.LLILZIL = pdpViewModel;
    }
}
