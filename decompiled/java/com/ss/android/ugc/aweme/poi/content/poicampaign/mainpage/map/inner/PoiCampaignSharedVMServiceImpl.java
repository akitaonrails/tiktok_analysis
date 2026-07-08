package com.ss.android.ugc.aweme.poi.content.poicampaign.mainpage.map.inner;

import X.C2097608Jq;
import X.InterfaceC1186204kW;
import com.ss.android.ugc.aweme.IDetailPageShareVMService;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.poi.content.poicampaign.mainpage.map.inner.PoiCampaignSharedViewModel;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class PoiCampaignSharedVMServiceImpl implements IDetailPageShareVMService {
    @Override // com.ss.android.ugc.aweme.IDetailPageShareVMService
    public final HashMap<String, InterfaceC1186204kW> LIZ() {
        return C2097608Jq.LJI(new Pair("POI_CAMPAIGN_BUBBLE", new InterfaceC1186204kW() { // from class: X.04kH
            @Override // X.InterfaceC1186204kW
            public final Pair<String, Class<? extends BaseDetailShareVM<?, ?, ?>>> LIZ(C2189821An6 c2189821An6) {
                return new Pair<>("POI_CAMPAIGN_BUBBLE", PoiCampaignSharedViewModel.class);
            }
        }));
    }
}
