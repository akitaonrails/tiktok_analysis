package com.ss.android.ugc.aweme.poi.claim.vm;

import X.C1155690gBD;
import X.C1200750hLt;
import X.C1200780hLw;
import X.C2188811AlT;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiClaimViewModel extends AssemViewModel<C1155690gBD> {
    public C1200780hLw LL;
    public final C1200750hLt LLILLJJLI = new C1200750hLt(this);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1155690gBD(null);
    }

    public final void vQ2() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("notifyPageChange currentPageState:");
        sbLIZ.append(this.LLILLJJLI.LIZIZ);
        sbLIZ.append(", newPageState:");
        sbLIZ.append(this.LLILLJJLI.LIZJ);
        C2188811AlT.LIZIZ(sbLIZ);
        setState(new AwS597S0100000_18(this, 243));
    }
}
