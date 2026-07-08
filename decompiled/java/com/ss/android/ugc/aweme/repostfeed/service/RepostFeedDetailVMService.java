package com.ss.android.ugc.aweme.repostfeed.service;

import X.C2097608Jq;
import X.InterfaceC1186204kW;
import com.ss.android.ugc.aweme.IDetailPageShareVMService;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.repostfeed.viewmodel.RepostFeedDetailViewModel;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class RepostFeedDetailVMService implements IDetailPageShareVMService {
    @Override // com.ss.android.ugc.aweme.IDetailPageShareVMService
    public final HashMap<String, InterfaceC1186204kW> LIZ() {
        return C2097608Jq.LJI(new Pair("from_repost_feed_entrance", new InterfaceC1186204kW() { // from class: X.04kM
            @Override // X.InterfaceC1186204kW
            public final Pair<String, Class<? extends BaseDetailShareVM<?, ?, ?>>> LIZ(C2189821An6 c2189821An6) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("repost_feed_detail_vm_");
                sbLIZ.append(c2189821An6.getFromActivityHashCode());
                return new Pair<>(C2188811AlT.LIZIZ(sbLIZ), RepostFeedDetailViewModel.class);
            }
        }));
    }
}
