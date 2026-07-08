package com.ss.android.ugc.aweme.explore.vm;

import X.AbstractC316870CbV;
import X.C1263204ww;
import X.C15TH;
import X.C317290CcB;
import X.InterfaceC1364105Vn;

/* JADX INFO: loaded from: classes32.dex */
public final class ExploreRecommendTopicListViewModel extends ExploreTopicGeneralFeedListViewModel {
    public final C15TH LLLFF;
    public final C15TH LLLFFI;

    @Override // com.ss.android.ugc.aweme.explore.vm.ExploreTopicGeneralFeedListViewModel
    public final boolean zQ2() {
        return false;
    }

    public ExploreRecommendTopicListViewModel() {
        C15TH c15th = C15TH.INSERT_CARD;
        this.LLLFF = c15th;
        this.LLLFFI = c15th;
    }

    @Override // com.ss.android.ugc.aweme.explore.vm.ExploreTopicGeneralFeedListViewModel
    public final C15TH BQ2() {
        return this.LLLFF;
    }

    @Override // com.ss.android.ugc.aweme.explore.vm.ExploreTopicGeneralFeedListViewModel
    public final C15TH CQ2() {
        return this.LLLFFI;
    }

    @Override // com.ss.android.ugc.aweme.explore.vm.ExploreTopicGeneralFeedListViewModel
    /* JADX INFO: renamed from: EQ2 */
    public final Object onLoadMore(C1263204ww c1263204ww, InterfaceC1364105Vn<? super AbstractC316870CbV<C1263204ww>> interfaceC1364105Vn) {
        return C317290CcB.LIZIZ(AbstractC316870CbV.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.explore.vm.ExploreTopicGeneralFeedListViewModel, com.bytedance.ext_power_list.AssemListViewModel
    public final /* bridge */ /* synthetic */ Object onLoadMore(C1263204ww c1263204ww, InterfaceC1364105Vn<? super AbstractC316870CbV<C1263204ww>> interfaceC1364105Vn) {
        return onLoadMore(c1263204ww, interfaceC1364105Vn);
    }
}
