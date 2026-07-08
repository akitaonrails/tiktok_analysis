package com.ss.android.ugc.aweme.groupcreation.vm;

import X.C01GW;
import X.C1228650i4t;
import X.C1527305yR;
import X.C1559260qg8;
import X.C1588006Jq;
import X.C452501pT;
import X.C723600SZy;
import X.EnumC1228990i5R;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class UnifiedGroupCreationVM extends AssemViewModel<C1588006Jq> {
    public final C1559260qg8 LL = new C1559260qg8(new C723600SZy(this, C1527305yR.class, null), true);
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS546S0100000_2(this, 232));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        EnumC1228990i5R enumC1228990i5R;
        C1228650i4t c1228650i4t = (C1228650i4t) this.LLILLJJLI.getValue();
        if (c1228650i4t == null || (enumC1228990i5R = c1228650i4t.LJJIJ) == null) {
            enumC1228990i5R = EnumC1228990i5R.PRIVATE_GROUP;
        }
        return new C1588006Jq(enumC1228990i5R, false);
    }
}
