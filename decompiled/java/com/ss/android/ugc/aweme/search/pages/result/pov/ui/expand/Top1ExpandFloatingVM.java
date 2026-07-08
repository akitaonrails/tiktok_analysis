package com.ss.android.ugc.aweme.search.pages.result.pov.ui.expand;

import X.C0P5T;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AwS25S0010000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class Top1ExpandFloatingVM extends AssemViewModel<C0P5T> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0P5T(0);
    }

    public final void vQ2(boolean z) {
        setState(new AwS25S0010000_10(z, 5));
    }
}
