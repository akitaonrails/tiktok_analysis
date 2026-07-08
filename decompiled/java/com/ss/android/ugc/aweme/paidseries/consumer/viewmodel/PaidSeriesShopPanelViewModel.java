package com.ss.android.ugc.aweme.paidseries.consumer.viewmodel;

import X.C01GW;
import X.C1158830gGH;
import X.C11S5;
import X.C1701940uOG;
import X.C452501pT;
import X.InterfaceC0148002o;
import X.InterfaceC1236150iGz;
import Y.AfS181S0100000_12;
import Y.AfS187S0100000_18;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.paidseries.broadcaster.before.service.PaidSeriesLiveApiService;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PaidSeriesShopPanelViewModel extends AssemViewModel<C1158830gGH> implements InterfaceC1236150iGz {
    public final C01GW LL = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(232));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1158830gGH(0);
    }

    @Override // X.InterfaceC1236150iGz
    public final void A50(CollectionDetailModel collectionDetailModel) {
        setState(new AwS597S0100000_18(collectionDetailModel, 212));
    }

    @Override // X.InterfaceC1236150iGz
    public final void XV0(CollectionDetailModel collectionDetailModel) {
        setState(new AwS597S0100000_18(collectionDetailModel, 211));
    }

    @Override // X.InterfaceC1236150iGz
    public final void ey2(CollectionDetailModel collectionDetailModel) {
        setState(new AwS597S0100000_18(collectionDetailModel, 213));
    }

    public final void vQ2(long j) {
        disposeOnClear(((PaidSeriesLiveApiService) this.LL.getValue()).LIZLLL().getLivePaidSeriesList(j).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new AfS187S0100000_18(this, 35), new AfS181S0100000_12(this, 133)));
    }
}
