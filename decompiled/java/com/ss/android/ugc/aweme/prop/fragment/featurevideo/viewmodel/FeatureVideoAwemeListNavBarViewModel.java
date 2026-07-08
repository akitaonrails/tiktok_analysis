package com.ss.android.ugc.aweme.prop.fragment.featurevideo.viewmodel;

import X.C01GW;
import X.C11NJ;
import X.C1556870qcH;
import X.C1559260qg8;
import X.C1565750qqb;
import X.C452501pT;
import X.C723600SZy;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class FeatureVideoAwemeListNavBarViewModel extends AssemViewModel<C1556870qcH> {
    public final C01GW LL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(256));
    public final C1559260qg8 LLILLJJLI = new C1559260qg8(new C723600SZy(this, C1565750qqb.class, "hierarchy_data_feature_video"), true);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1556870qcH(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        ((C11NJ) this.LL.getValue()).LJ();
    }
}
