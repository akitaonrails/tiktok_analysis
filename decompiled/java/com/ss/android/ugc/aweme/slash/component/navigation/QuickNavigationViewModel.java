package com.ss.android.ugc.aweme.slash.component.navigation;

import X.C1164180gOu;
import X.C1180620gpQ;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class QuickNavigationViewModel extends AssemViewModel<C1164180gOu> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1164180gOu(null, null);
    }

    public static void vQ2(QuickNavigationViewModel quickNavigationViewModel, QuickNavBarModule quickNavBarModule, C1180620gpQ c1180620gpQ, int i) {
        if ((i & 1) != 0) {
            quickNavBarModule = null;
        }
        if ((i & 2) != 0) {
            c1180620gpQ = null;
        }
        if (quickNavBarModule != null) {
            quickNavigationViewModel.setState(new AwS597S0100000_18(quickNavBarModule, 955));
        }
        if (c1180620gpQ != null) {
            quickNavigationViewModel.setState(new AwS597S0100000_18(c1180620gpQ, 956));
        }
    }
}
