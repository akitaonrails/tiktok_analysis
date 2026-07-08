package com.ss.android.ugc.aweme.story.feed.guidecard.filter;

import X.C01GW;
import X.C452501pT;
import X.C712920Rxq;
import X.C712930Rxr;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes12.dex */
public final class GuideCardFilterVM extends AssemViewModel<C712920Rxq> {
    public final C01GW LL = C452501pT.LIZIZ(new C712930Rxr());

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C712920Rxq(null, "", new Pair(Boolean.FALSE, ""));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        ((LinkedHashMap) this.LL.getValue()).clear();
    }
}
