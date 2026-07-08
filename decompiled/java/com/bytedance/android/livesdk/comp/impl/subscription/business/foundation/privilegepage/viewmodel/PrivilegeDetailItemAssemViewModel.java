package com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.viewmodel;

import X.C509370JyJ;
import X.C509460JyS;
import X.C509480JyU;
import X.InterfaceC0148002o;
import X.InterfaceC510100JzU;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.google.gson.n;

/* JADX INFO: loaded from: classes8.dex */
public final class PrivilegeDetailItemAssemViewModel extends AssemViewModel<C509480JyU> {
    public C509370JyJ LL;
    public final C509460JyS LLILLJJLI = new InterfaceC510100JzU() { // from class: X.0JyS
        @Override // X.InterfaceC510100JzU
        public final void QP(C470590Icr<n> c470590Icr) {
        }

        @Override // X.InterfaceC510100JzU
        public final void hj(C509160Jxy c509160Jxy) {
            this.LL.setState(new C509470JyT(c509160Jxy));
            C509370JyJ c509370JyJ = this.LL.LL;
            if (c509370JyJ != null) {
                c509370JyJ.invoke(c509160Jxy);
            }
        }

        @Override // X.InterfaceC510100JzU
        public final void yO(C509170Jxz c509170Jxz, boolean z) {
            this.LL.setState(new C509490JyV(c509170Jxz));
            C509370JyJ c509370JyJ = this.LL.LL;
            if (c509370JyJ != null) {
                c509370JyJ.invoke(c509170Jxz);
            }
        }
    };

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C509480JyU(null);
    }
}
