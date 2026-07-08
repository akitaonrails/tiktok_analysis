package com.ss.android.ugc.aweme.component.phone.change.consult;

import X.C0JD3;
import X.C0PEM;
import X.C1717760unm;
import X.C23250099c;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class ConsultPhoneChangeViewModel extends AssemViewModel<C0JD3> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0JD3(null, null, null);
    }

    public final void vQ2(String str, String str2, String str3) {
        withState(new AwS586S0100000_7(this, 198));
        C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C1717760unm(str, str2, str3, this, null), 2);
    }
}
