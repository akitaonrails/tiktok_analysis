package com.ss.android.ugc.aweme.inbox.bulletin.viewmodel;

import X.AbstractC1623806Xk;
import X.C0OPX;
import X.C2188811AlT;
import X.C618190OMn;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.Unit;
import kotlin.jvm.internal.AwS375S0200000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinListPageStatusViewModel extends AssemViewModel<C618190OMn> {
    public static final /* synthetic */ int LL = 0;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C618190OMn(0);
    }

    public final void vQ2(AbstractC1623806Xk<Unit> abstractC1623806Xk) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BBArch [PageStatusVM] notify infoState == ");
        sbLIZ.append(abstractC1623806Xk);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        withState(new AwS375S0200000_9(this, (BulletinListPageStatusViewModel) abstractC1623806Xk, (AbstractC1623806Xk<Unit>) 50));
    }

    public final void wQ2(AbstractC1623806Xk<Unit> abstractC1623806Xk) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BBArch [PageStatusVM] notify listState == ");
        sbLIZ.append(abstractC1623806Xk);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        withState(new AwS375S0200000_9(this, (BulletinListPageStatusViewModel) abstractC1623806Xk, (AbstractC1623806Xk<Unit>) 51));
    }
}
