package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.common.assem.infoheader;

import X.C1822730xX5;
import X.C496700Jds;
import X.C496720Jdu;
import X.C496740Jdw;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;

/* JADX INFO: loaded from: classes8.dex */
public final class PcsServiceInfoHeaderVM extends AssemViewModel<C496720Jdu> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C496720Jdu(0);
    }

    public final void vQ2(C496700Jds c496700Jds) {
        setState(new C496740Jdw(c496700Jds));
        C1822730xX5.LIZ("show", null, c496700Jds, c496700Jds.LIZ());
    }
}
