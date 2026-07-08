package com.ss.android.ugc.aweme.ecommerce.base.messagecenter.migration;

import X.C01GW;
import X.C1767240w5a;
import X.C452501pT;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC149400hg;
import X.InterfaceC1501170pAR;
import X.InterfaceC736910SvR;
import kotlin.jvm.internal.AFwS215S0000000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class MovePartialAssetsRepository implements InterfaceC736910SvR<MovePartialAssetsOperator> {
    public static final C01GW<MovePartialAssetsRepository> LLILLJJLI = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(96));
    public final C1767240w5a LL = new C1767240w5a();

    public interface MovePartialAssetsOperator extends InterfaceC149400hg {
        @InterfaceC1501170pAR("/api/v1/reach/ttinbox/get_move_partial_assets")
        Object getMovePartialAssets(@InterfaceC1485405rg MovePartialAssetsRequest movePartialAssetsRequest, InterfaceC1364105Vn<? super MovePartialAssetsResponse> interfaceC1364105Vn);
    }

    @Override // X.InterfaceC736910SvR
    public final void release() {
    }

    @Override // X.InterfaceC736910SvR
    public final /* bridge */ /* synthetic */ InterfaceC149400hg getOperator() {
        return this.LL;
    }
}
