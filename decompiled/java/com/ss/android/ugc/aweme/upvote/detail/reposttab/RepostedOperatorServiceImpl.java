package com.ss.android.ugc.aweme.upvote.detail.reposttab;

import X.InterfaceC1186204kW;
import com.ss.android.ugc.aweme.IDetailPageShareVMService;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.upvote.detail.reposttab.RepostListViewModel;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class RepostedOperatorServiceImpl implements IDetailPageShareVMService {
    @Override // com.ss.android.ugc.aweme.IDetailPageShareVMService
    public final HashMap<String, InterfaceC1186204kW> LIZ() {
        HashMap<String, InterfaceC1186204kW> map = new HashMap<>();
        map.put("REPOSTED_LIST_ENTRANCE", new InterfaceC1186204kW() { // from class: X.04kr
            @Override // X.InterfaceC1186204kW
            public final Pair<String, Class<? extends BaseDetailShareVM<?, ?, ?>>> LIZ(C2189821An6 c2189821An6) {
                return new Pair<>(C1360460lVU.LIZIZ.LIZIZ(c2189821An6.getEventType(), c2189821An6.getFromActivityHashCode()), RepostListViewModel.class);
            }
        });
        return map;
    }
}
