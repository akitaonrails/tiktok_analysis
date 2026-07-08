package com.ss.android.ugc.aweme.sidebar.components;

import X.AnonymousClass0206;
import X.C01GW;
import X.C1580350rE9;
import X.C1580400rEE;
import X.C1580440rEI;
import X.C1580480rEM;
import X.C2188811AlT;
import X.C452501pT;
import X.InterfaceC0148002o;
import X.InterfaceC1580760rEo;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.sidebar.model.SideBarRootComponentConfig;
import com.ss.android.ugc.aweme.sidebar.model.SideBarSectionComponentConfig;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class SideBarRootVM extends AssemViewModel<C1580350rE9> implements InterfaceC1580760rEo {
    public final C1580480rEM LL = new C1580480rEM();
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(214));
    public volatile String LLILLL;

    @Override // X.InterfaceC1580760rEo
    public final List<String> CQ1() {
        return (List) this.LLILLJJLI.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        List<SideBarSectionComponentConfig> list;
        this.LL.getClass();
        SideBarRootComponentConfig sideBarRootComponentConfigLIZ = C1580440rEI.LIZ.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("defaultState: ");
        sbLIZ.append((sideBarRootComponentConfigLIZ == null || (list = sideBarRootComponentConfigLIZ.sections) == null) ? null : Integer.valueOf(list.size()));
        C2188811AlT.LIZIZ(sbLIZ);
        return sideBarRootComponentConfigLIZ != null ? new C1580350rE9(new C1580400rEE(sideBarRootComponentConfigLIZ)) : new C1580350rE9(0);
    }

    @Override // X.InterfaceC1580760rEo
    public final void km2(String str) {
        this.LLILLL = str;
    }
}
