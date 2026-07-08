package com.ss.android.ugc.nearby.feedcard.vm;

import X.C2097608Jq;
import X.InterfaceC1186204kW;
import com.ss.android.ugc.aweme.IDetailPageShareVMService;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.nearby.feedcard.vm.NearbyFeedInnerSharedViewModel;
import com.ss.android.ugc.nearby.feedcard.vm.NearbyFeedSharedViewModel;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class NearbyFeedSharedVMServiceImpl implements IDetailPageShareVMService {
    @Override // com.ss.android.ugc.aweme.IDetailPageShareVMService
    public final HashMap<String, InterfaceC1186204kW> LIZ() {
        return C2097608Jq.LJI(new Pair("NEARBY_FEED_DOUBLE_COLUMN", new InterfaceC1186204kW() { // from class: X.04kX
            @Override // X.InterfaceC1186204kW
            public final Pair<String, Class<? extends BaseDetailShareVM<?, ?, ?>>> LIZ(C2189821An6 c2189821An6) {
                return new Pair<>("NEARBY_FEED_DOUBLE_COLUMN", NearbyFeedSharedViewModel.class);
            }
        }), new Pair("NEARBY_FEED_INNER", new InterfaceC1186204kW() { // from class: X.04kY
            @Override // X.InterfaceC1186204kW
            public final Pair<String, Class<? extends BaseDetailShareVM<?, ?, ?>>> LIZ(C2189821An6 c2189821An6) {
                return new Pair<>("NEARBY_FEED_INNER", NearbyFeedInnerSharedViewModel.class);
            }
        }));
    }
}
