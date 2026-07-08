package com.ss.android.ugc.aweme.search.detail.edm;

import X.InterfaceC1186204kW;
import com.ss.android.ugc.aweme.IDetailPageShareVMService;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.search.detail.edm.viewmodel.SearchEDMVideoDetailSharedVM;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class SearchEDMVideoDetailSharedVMService implements IDetailPageShareVMService {
    @Override // com.ss.android.ugc.aweme.IDetailPageShareVMService
    public final HashMap<String, InterfaceC1186204kW> LIZ() {
        HashMap<String, InterfaceC1186204kW> map = new HashMap<>();
        map.put("from_search_video_detail_applink", new InterfaceC1186204kW() { // from class: X.04ki
            @Override // X.InterfaceC1186204kW
            public final Pair<String, Class<? extends BaseDetailShareVM<?, ?, ?>>> LIZ(C2189821An6 c2189821An6) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("search_edm_video_detail_vm");
                sbLIZ.append(c2189821An6.getActivityId());
                sbLIZ.append(c2189821An6.getAid());
                sbLIZ.append(c2189821An6.getSearchKeyword());
                return new Pair<>(C2188811AlT.LIZIZ(sbLIZ), SearchEDMVideoDetailSharedVM.class);
            }
        });
        return map;
    }
}
