package com.ss.android.ugc.aweme.partnership;

import X.InterfaceC1186204kW;
import com.ss.android.ugc.aweme.IDetailPageShareVMService;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.partnership.model.GameMixHomeViewModel;
import com.ss.android.ugc.aweme.partnership.model.GameMixVideosViewModel;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class GameMixVideosOperatorServiceImpl implements IDetailPageShareVMService {
    @Override // com.ss.android.ugc.aweme.IDetailPageShareVMService
    public final HashMap<String, InterfaceC1186204kW> LIZ() {
        HashMap<String, InterfaceC1186204kW> map = new HashMap<>();
        map.put("GAME_MIX_PAGE_VIDEOS_LIST_ENTRANCE", new InterfaceC1186204kW() { // from class: X.04ks
            @Override // X.InterfaceC1186204kW
            public final Pair<String, Class<? extends BaseDetailShareVM<?, ?, ?>>> LIZ(C2189821An6 c2189821An6) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("game_partnership_mix_page_video");
                sbLIZ.append(c2189821An6.getActivityId());
                return new Pair<>(C2188811AlT.LIZIZ(sbLIZ), GameMixVideosViewModel.class);
            }
        });
        map.put("GAME_MIX_PAGE_HOME_LIST_ENTRANCE", new InterfaceC1186204kW() { // from class: X.04kt
            @Override // X.InterfaceC1186204kW
            public final Pair<String, Class<? extends BaseDetailShareVM<?, ?, ?>>> LIZ(C2189821An6 c2189821An6) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("game_partnership_mix_page_home");
                sbLIZ.append(c2189821An6.getActivityId());
                return new Pair<>(C2188811AlT.LIZIZ(sbLIZ), GameMixHomeViewModel.class);
            }
        });
        return map;
    }
}
