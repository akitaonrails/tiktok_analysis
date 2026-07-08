package com.ss.android.ugc.aweme.inbox.search.vm;

import X.C1592506Lj;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.inbox.search.InboxSearchTabProtocol;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class InboxSearchResultContainerVM extends AssemViewModel<C1592506Lj> {
    public Map<String, ? extends InboxSearchTabProtocol> LL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1592506Lj(0);
    }
}
