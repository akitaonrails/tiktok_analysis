package com.ss.android.ugc.aweme.paidseries.broadcaster.before.viewmodel;

import X.C01GW;
import X.C11S5;
import X.C1235970iGh;
import X.C1701940uOG;
import X.C452501pT;
import X.InterfaceC0148002o;
import X.InterfaceC1236150iGz;
import Y.AfS155S0200000_19;
import Y.AfS188S0100000_19;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.api.IPaidSeriesLiveApiService;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.service.IPaidContentService;
import kotlin.jvm.internal.AFwS207S0000000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class PaidSeriesAddSeriesToLiveViewModel extends AssemViewModel<C1235970iGh> implements InterfaceC1236150iGz {
    public final C01GW LL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(285));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(286));
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(284));

    @Override // X.InterfaceC1236150iGz
    public final void A50(CollectionDetailModel collectionDetailModel) {
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1235970iGh(0);
    }

    public final void vQ2() {
        disposeOnClear(((IPaidContentService) this.LL.getValue()).LJ(6, ((Number) this.LLILLL.getValue()).longValue(), Long.valueOf(getState().LL)).LJJIJIL(new AfS188S0100000_19(this, 29)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS188S0100000_19(this, 30), new AfS188S0100000_19(this, 31)));
    }

    @Override // X.InterfaceC1236150iGz
    public final void XV0(CollectionDetailModel collectionDetailModel) {
        disposeOnClear(((IPaidSeriesLiveApiService) this.LLILLJJLI.getValue()).addSeriesToLive(collectionDetailModel.collectionId, getState().LL).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJIILJJIL(new AfS155S0200000_19(this, collectionDetailModel, 5)).LJJIIZ(new AfS155S0200000_19(this, collectionDetailModel, 6), new AfS188S0100000_19(this, 32)));
    }

    @Override // X.InterfaceC1236150iGz
    public final void ey2(CollectionDetailModel collectionDetailModel) {
        disposeOnClear(((IPaidSeriesLiveApiService) this.LLILLJJLI.getValue()).LIZIZ(collectionDetailModel.collectionId, getState().LL).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJIILJJIL(new AfS155S0200000_19(this, collectionDetailModel, 7)).LJJIIZ(new AfS155S0200000_19(this, collectionDetailModel, 8), new AfS188S0100000_19(this, 33)));
    }
}
