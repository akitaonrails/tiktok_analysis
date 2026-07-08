package com.ss.android.ugc.aweme.business.story.service;

import X.C1596560reI;
import X.C2097608Jq;
import X.InterfaceC1186204kW;
import com.ss.android.ugc.aweme.IDetailPageShareVMService;
import com.ss.android.ugc.aweme.base.vm.FeedSkylightListViewModel;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class StorySkylightDetailShareVMServiceImpl implements IDetailPageShareVMService {
    @Override // com.ss.android.ugc.aweme.IDetailPageShareVMService
    public final HashMap<String, InterfaceC1186204kW> LIZ() {
        final String strLIZLLL = C1596560reI.LIZLLL(0);
        final String strLIZLLL2 = C1596560reI.LIZLLL(1);
        final String strLIZLLL3 = C1596560reI.LIZLLL(2);
        return C2097608Jq.LJI(new Pair("STORY_ENTRANCE_FRIENDS_TOP_LIST", new InterfaceC1186204kW() { // from class: X.04kz
            @Override // X.InterfaceC1186204kW
            public final Pair<String, Class<? extends BaseDetailShareVM<?, ?, ?>>> LIZ(C2189821An6 c2189821An6) {
                return new Pair<>(strLIZLLL, FeedSkylightListViewModel.class);
            }
        }), new Pair("STORY_ENTRANCE_FYP_TOP_LIST", new InterfaceC1186204kW() { // from class: X.04kz
            @Override // X.InterfaceC1186204kW
            public final Pair<String, Class<? extends BaseDetailShareVM<?, ?, ?>>> LIZ(C2189821An6 c2189821An6) {
                return new Pair<>(strLIZLLL2, FeedSkylightListViewModel.class);
            }
        }), new Pair("STORY_ENTRANCE_FOLLOWING_FEED_TOP_LIST_NEW", new InterfaceC1186204kW() { // from class: X.04kz
            @Override // X.InterfaceC1186204kW
            public final Pair<String, Class<? extends BaseDetailShareVM<?, ?, ?>>> LIZ(C2189821An6 c2189821An6) {
                return new Pair<>(strLIZLLL3, FeedSkylightListViewModel.class);
            }
        }));
    }
}
