package com.ss.android.ugc.aweme.feed.interest.card;

import X.C1155490gAt;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.service.interest.IInterestReselectionService;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes30.dex */
public final class InterestCardViewModel extends AssemViewModel<C1155490gAt> {
    public final IInterestReselectionService LL;
    public final Set<String> LLILLJJLI;
    public final LinkedHashSet<Integer> LLILLL;
    public final Map<String, Integer> LLILZ;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return this.LL == null ? new C1155490gAt(false, 0) : new C1155490gAt(!this.LLILLJJLI.isEmpty(), this.LLILLJJLI.size());
    }

    public InterestCardViewModel() {
        Set<String> setLJIL;
        IInterestReselectionService iInterestReselectionService = (IInterestReselectionService) PluggableExtentionKt.pluggableSpi$default(IInterestReselectionService.class, false, false, false, 14, null);
        this.LL = iInterestReselectionService;
        this.LLILLJJLI = (iInterestReselectionService == null || (setLJIL = iInterestReselectionService.LJIL()) == null) ? new LinkedHashSet<>() : setLJIL;
        this.LLILLL = new LinkedHashSet<>();
        this.LLILZ = new LinkedHashMap();
        new LinkedHashSet();
    }
}
