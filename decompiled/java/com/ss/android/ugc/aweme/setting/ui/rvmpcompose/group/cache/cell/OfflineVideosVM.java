package com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.cache.cell;

import X.C1669660tYC;
import X.C1EE1;
import X.C2025107wX;
import X.C2174571A8p;
import X.InterfaceC0148002o;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.BaseCellSettingsVM;
import kotlin.jvm.internal.AwS647S0100000_33;

/* JADX INFO: loaded from: classes31.dex */
public final class OfflineVideosVM extends BaseCellSettingsVM<C2025107wX> {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        C2174571A8p c2174571A8p = new C2174571A8p(this);
        C1EE1 c1ee1 = C1EE1.LIZIZ;
        return new C2025107wX(c1ee1.LJJIIZ() > 0 ? C1669660tYC.LJL : C1669660tYC.LJJZZI, c1ee1.LJJIIZ() > 0 ? C1669660tYC.LJJZZIII : C1669660tYC.LJIILJJIL, 2131838562, c2174571A8p, new AwS647S0100000_33(this, 54));
    }
}
