package com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.util;

import X.InterfaceC1186204kW;
import com.ss.android.ugc.aweme.IDetailPageShareVMService;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.vm.SearchReviewAggregationDetailVideoVM;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class SearchReviewAggregationDetailSharedVMService implements IDetailPageShareVMService {
    @Override // com.ss.android.ugc.aweme.IDetailPageShareVMService
    public final HashMap<String, InterfaceC1186204kW> LIZ() {
        HashMap<String, InterfaceC1186204kW> map = new HashMap<>();
        map.put("from_search_review_aggregation", new InterfaceC1186204kW() { // from class: X.04kf
            @Override // X.InterfaceC1186204kW
            public final Pair<String, Class<? extends BaseDetailShareVM<?, ?, ?>>> LIZ(C2189821An6 c2189821An6) {
                C639570P6t c639570P6t = C639570P6t.LIZ;
                String strValueOf = String.valueOf(c2189821An6.getActivityId());
                C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchReviewAggregationDetailVideoVM.class);
                c639570P6t.getClass();
                return new Pair<>(C639570P6t.LIZ(strValueOf, c19719912DlLIZ), SearchReviewAggregationDetailVideoVM.class);
            }
        });
        return map;
    }
}
