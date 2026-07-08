package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.lazyload;

import X.AnonymousClass0956;
import X.C1755400vmU;
import X.C1755560vmk;
import X.InterfaceC0148002o;
import X.InterfaceC1755040vlu;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBodyListBaseCardViewModel;

/* JADX INFO: loaded from: classes27.dex */
public final class PdpLynxItemVM extends PdpBodyListBaseCardViewModel<C1755560vmk, C1755400vmU> {
    public final InterfaceC1755040vlu LL;
    public AnonymousClass0956 LLILLJJLI;
    public volatile String LLILLL = "undefined";

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1755560vmk(null);
    }

    public PdpLynxItemVM(InterfaceC1755040vlu interfaceC1755040vlu) {
        this.LL = interfaceC1755040vlu;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBodyListBaseCardViewModel
    public final InterfaceC0148002o vQ2(InterfaceC0148002o interfaceC0148002o, C1755400vmU c1755400vmU) {
        interfaceC0148002o.getClass();
        return new C1755560vmk(c1755400vmU);
    }
}
