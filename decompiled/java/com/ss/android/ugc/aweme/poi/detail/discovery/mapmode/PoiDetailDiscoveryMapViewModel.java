package com.ss.android.ugc.aweme.poi.detail.discovery.mapmode;

import X.C1158900gGO;
import X.C491101vh;
import X.InterfaceC0148002o;
import X.InterfaceC1181010gq3;
import android.util.LruCache;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.poi.detail.discovery.PoiDiscoveryApi$PoiDiscoveryCardListResponse;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiDiscoveryCard;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailDiscoveryMapViewModel extends AssemViewModel<C1158900gGO> {
    public String LL;
    public InterfaceC1181010gq3 LLILLJJLI;
    public String LLILLL;
    public final LruCache<String, PoiDiscoveryApi$PoiDiscoveryCardListResponse> LLILZ = new LruCache<>(20);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1158900gGO(C491101vh.LIZ);
    }

    public final void vQ2(PoiDiscoveryApi$PoiDiscoveryCardListResponse poiDiscoveryApi$PoiDiscoveryCardListResponse) {
        String currentTabCode;
        List<PoiDiscoveryCard> poiList;
        if (poiDiscoveryApi$PoiDiscoveryCardListResponse != null && (currentTabCode = poiDiscoveryApi$PoiDiscoveryCardListResponse.getCurrentTabCode()) != null && (poiList = poiDiscoveryApi$PoiDiscoveryCardListResponse.getPoiList()) != null && !poiList.isEmpty()) {
            this.LLILZ.put(currentTabCode, poiDiscoveryApi$PoiDiscoveryCardListResponse);
        }
    }
}
