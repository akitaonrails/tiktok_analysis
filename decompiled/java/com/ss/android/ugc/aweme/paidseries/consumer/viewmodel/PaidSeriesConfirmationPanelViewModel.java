package com.ss.android.ugc.aweme.paidseries.consumer.viewmodel;

import X.C01GW;
import X.C1158820gGG;
import X.C11S5;
import X.C1701940uOG;
import X.C452501pT;
import X.InterfaceC0148002o;
import X.InterfaceC1236150iGz;
import Y.AfS187S0100000_18;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.service.IPaidContentService;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PaidSeriesConfirmationPanelViewModel extends AssemViewModel<C1158820gGG> implements InterfaceC1236150iGz {
    public final C01GW LL = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(231));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1158820gGG(0);
    }

    @Override // X.InterfaceC1236150iGz
    public final void A50(CollectionDetailModel collectionDetailModel) {
        setState(new AwS597S0100000_18(collectionDetailModel, 209));
    }

    @Override // X.InterfaceC1236150iGz
    public final void XV0(CollectionDetailModel collectionDetailModel) {
        setState(new AwS597S0100000_18(collectionDetailModel, 208));
    }

    @Override // X.InterfaceC1236150iGz
    public final void ey2(CollectionDetailModel collectionDetailModel) {
        setState(new AwS597S0100000_18(collectionDetailModel, 210));
    }

    public final void vQ2(long j, long j2) {
        disposeOnClear(((IPaidContentService) this.LL.getValue()).LJ(2, j, Long.valueOf(j2)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS187S0100000_18(this, 2), new AfS187S0100000_18(this, 3)));
    }
}
