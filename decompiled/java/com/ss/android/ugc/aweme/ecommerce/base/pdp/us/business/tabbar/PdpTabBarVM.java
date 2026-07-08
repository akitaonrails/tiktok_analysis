package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.tabbar;

import X.C1755690vmx;
import X.InterfaceC0148002o;
import X.InterfaceC1752680vi6;
import X.InterfaceC1755770vn5;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.TabBarItemVO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.header.BaseItemViewModel;
import kotlin.jvm.internal.AwS38S0010000_26;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class PdpTabBarVM extends BaseItemViewModel<C1755690vmx> implements InterfaceC1752680vi6 {
    public final InterfaceC1755770vn5 LL;
    public boolean LLILLJJLI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1755690vmx(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1752680vi6
    public final C1755690vmx getCurrentState() {
        return (C1755690vmx) getState();
    }

    public PdpTabBarVM(InterfaceC1755770vn5 interfaceC1755770vn5) {
        this.LL = interfaceC1755770vn5;
    }

    @Override // X.InterfaceC1752680vi6
    public final void sm1(boolean z) {
        setState(new AwS38S0010000_26(z, 4));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.header.BaseItemViewModel
    public final void vQ2(Object obj) {
        TabBarItemVO tabBarItemVO;
        if ((obj instanceof TabBarItemVO) && (tabBarItemVO = (TabBarItemVO) obj) != null) {
            setState(new AwS605S0100000_26(tabBarItemVO, 240));
        }
    }
}
