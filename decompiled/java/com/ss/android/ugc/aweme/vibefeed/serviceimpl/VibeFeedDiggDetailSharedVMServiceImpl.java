package com.ss.android.ugc.aweme.vibefeed.serviceimpl;

import X.C2097608Jq;
import X.InterfaceC1186204kW;
import com.ss.android.ugc.aweme.IDetailPageShareVMService;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.vibefeed.feed.viewmodel.VibeFeedDiggDetailListVM;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class VibeFeedDiggDetailSharedVMServiceImpl implements IDetailPageShareVMService {
    @Override // com.ss.android.ugc.aweme.IDetailPageShareVMService
    public final HashMap<String, InterfaceC1186204kW> LIZ() {
        return C2097608Jq.LJI(new Pair("VIBE_FEED_LIST_ENTRANCE", new InterfaceC1186204kW() { // from class: X.04kU
            @Override // X.InterfaceC1186204kW
            public final Pair<String, Class<? extends BaseDetailShareVM<?, ?, ?>>> LIZ(C2189821An6 c2189821An6) {
                return new Pair<>("VIBE_FEED_LIST_KEY", VibeFeedDiggDetailListVM.class);
            }
        }));
    }
}
