package com.ss.android.ugc.aweme.search.pages.result.topsearch.visualinspiration.utils;

import X.InterfaceC1186204kW;
import com.ss.android.ugc.aweme.IDetailPageShareVMService;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.visualinspiration.vm.SearchVisualInspirationSharedVM;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class SearchVisualInspirationSharedVMService implements IDetailPageShareVMService {
    @Override // com.ss.android.ugc.aweme.IDetailPageShareVMService
    public final HashMap<String, InterfaceC1186204kW> LIZ() {
        HashMap<String, InterfaceC1186204kW> map = new HashMap<>();
        map.put("from_lynx_visual_inspiration", new InterfaceC1186204kW() { // from class: X.04ke
            @Override // X.InterfaceC1186204kW
            public final Pair<String, Class<? extends BaseDetailShareVM<?, ?, ?>>> LIZ(C2189821An6 c2189821An6) {
                return new Pair<>(String.valueOf(c2189821An6.getActivityId()), SearchVisualInspirationSharedVM.class);
            }
        });
        return map;
    }
}
