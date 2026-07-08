package com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.viewmodel;

import X.C0K7A;
import X.C0K7M;
import X.C512230K6z;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.google.gson.n;
import com.ss.android.ugc.aweme.subscription.pgc.data.network.DataResponse;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class PrivilegeDetailItemAssemViewModel extends AssemViewModel<C512230K6z> {
    public AwS586S0100000_7 LL;
    public final C0K7A LLILLJJLI = new C0K7M() { // from class: X.0K7A
        @Override // X.C0K7M
        public final void Gs(DataResponse<n> dataResponse) {
        }

        @Override // X.C0K7M
        public final void he(C0K7C c0k7c) {
            this.LL.setState(new AwS586S0100000_7(c0k7c, 301));
            AwS586S0100000_7 awS586S0100000_7 = this.LL.LL;
            if (awS586S0100000_7 != null) {
                awS586S0100000_7.invoke(c0k7c);
            }
        }

        @Override // X.C0K7M
        public final void oP(C0K7D c0k7d, boolean z) {
            this.LL.setState(new AwS586S0100000_7(c0k7d, 302));
            AwS586S0100000_7 awS586S0100000_7 = this.LL.LL;
            if (awS586S0100000_7 != null) {
                awS586S0100000_7.invoke(c0k7d);
            }
        }
    };

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C512230K6z(null);
    }
}
