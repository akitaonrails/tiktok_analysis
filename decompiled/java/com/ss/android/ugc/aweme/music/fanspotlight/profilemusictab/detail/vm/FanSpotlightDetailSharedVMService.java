package com.ss.android.ugc.aweme.music.fanspotlight.profilemusictab.detail.vm;

import X.InterfaceC1186204kW;
import com.ss.android.ugc.aweme.IDetailPageShareVMService;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.music.fanspotlight.profilemusictab.detail.vm.FanSpotlightProfileDetailShareVM;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class FanSpotlightDetailSharedVMService implements IDetailPageShareVMService {
    @Override // com.ss.android.ugc.aweme.IDetailPageShareVMService
    public final HashMap<String, InterfaceC1186204kW> LIZ() {
        HashMap<String, InterfaceC1186204kW> map = new HashMap<>();
        map.put("fan_spotlighted_page", new InterfaceC1186204kW() { // from class: X.04kg
            @Override // X.InterfaceC1186204kW
            public final Pair<String, Class<? extends BaseDetailShareVM<?, ?, ?>>> LIZ(C2189821An6 c2189821An6) {
                int iIntValue;
                Integer numLJIIJJI;
                String str = c2189821An6.getExtra().get("fan_spotlighted_extra_key");
                if (str != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str)) != null) {
                    iIntValue = numLJIIJJI.intValue();
                } else {
                    iIntValue = 0;
                }
                return new Pair<>(C1187304kh.LIZ(iIntValue), FanSpotlightProfileDetailShareVM.class);
            }
        });
        return map;
    }
}
