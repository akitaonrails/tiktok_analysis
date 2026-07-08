package com.ss.android.ugc.aweme.paidseries.broadcaster.before.viewmodel;

import X.C01GW;
import X.C09JN;
import X.C1158770gGB;
import X.C1158800gGE;
import X.C11S5;
import X.C1701940uOG;
import X.C452501pT;
import X.InterfaceC0148002o;
import X.InterfaceC1236380iHM;
import Y.AfS187S0100000_18;
import Y.AfS7S0100100_18;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.api.PaidSeriesLiveApi;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.paidseries.broadcaster.before.service.PaidSeriesLiveApiService;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PaidSeriesAddedSeriesViewModel extends AssemViewModel<C1158800gGE> implements InterfaceC1236380iHM {
    public final C01GW LL = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(230));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1158800gGE(0);
    }

    @Override // X.InterfaceC1236380iHM
    public final void JJ2(long j, long j2) {
        PaidSeriesLiveApi paidSeriesLiveApiLIZLLL = ((PaidSeriesLiveApiService) this.LL.getValue()).LIZLLL();
        System.currentTimeMillis();
        disposeOnClear(paidSeriesLiveApiLIZLLL.introduceSeries(j, j2, false, new C1158770gGB()).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJIILJJIL(new AfS187S0100000_18(this, 27)).LJJIIZ(new AfS7S0100100_18(j, this, 0), new AfS187S0100000_18(this, 28)));
    }

    @Override // X.InterfaceC1236380iHM
    public final void L30(long j, long j2) {
        PaidSeriesLiveApi paidSeriesLiveApiLIZLLL = ((PaidSeriesLiveApiService) this.LL.getValue()).LIZLLL();
        System.currentTimeMillis();
        disposeOnClear(paidSeriesLiveApiLIZLLL.introduceSeries(j, j2, true, new C1158770gGB()).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJIILJJIL(new AfS187S0100000_18(this, 33)).LJJIIZ(new AfS7S0100100_18(j, this, 2), new AfS187S0100000_18(this, 34)));
    }

    @Override // X.InterfaceC1236380iHM
    public final void Ut0(long j, long j2) {
        disposeOnClear(((PaidSeriesLiveApiService) this.LL.getValue()).LIZLLL().moveSeriesToTop(j, j2).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJIILJJIL(new AfS187S0100000_18(this, 31)).LJJIIZ(new AfS7S0100100_18(j, this, 1), new AfS187S0100000_18(this, 32)));
    }

    @Override // X.InterfaceC1236380iHM
    public final void ek0(final long j, long j2, final boolean z) {
        disposeOnClear(((PaidSeriesLiveApiService) this.LL.getValue()).LIZLLL().deleteSeries(j, j2, 0).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJIILJJIL(new AfS187S0100000_18(this, 29)).LJJIIZ(new C09JN() { // from class: X.0gGA
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("PaidSeriesAddedSeriesViewModel@10d0.onRemoveClick$2");
                if (((BaseResponse) obj).status_code == 0) {
                    this.LL.setState(new C1158790gGD(j, z));
                }
                C1C7U.LIZIZ("PaidSeriesAddedSeriesViewModel@10d0.onRemoveClick$2");
            }
        }, new AfS187S0100000_18(this, 30)));
    }
}
