package com.ss.android.ugc.aweme.poi.detail.nearby;

import X.C1158870gGL;
import X.C491101vh;
import X.InterfaceC0148002o;
import X.InterfaceC1181010gq3;
import android.util.LruCache;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiDiscoveryCard;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailNearbyViewModel extends AssemViewModel<C1158870gGL> {
    public String LL;
    public InterfaceC1181010gq3 LLILLJJLI;
    public String LLILLL;
    public final LruCache<String, PoiNearbyModel> LLILZ = new LruCache<>(20);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1158870gGL(C491101vh.LIZ);
    }

    public final void vQ2(PoiNearbyModel poiNearbyModel) {
        String currentTabCode;
        List<PoiDiscoveryCard> poiList;
        if (poiNearbyModel != null && (currentTabCode = poiNearbyModel.getCurrentTabCode()) != null && (poiList = poiNearbyModel.getPoiList()) != null && !poiList.isEmpty()) {
            this.LLILZ.put(currentTabCode, poiNearbyModel);
        }
    }
}
