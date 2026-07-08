package com.ss.android.ugc.aweme.live.mix.game.model;

import X.InterfaceC1186204kW;
import com.ss.android.ugc.aweme.IDetailPageShareVMService;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.live.mix.game.model.GameCommonMixViewModel;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class GameMixFeedOperatorServiceImpl implements IDetailPageShareVMService {
    @Override // com.ss.android.ugc.aweme.IDetailPageShareVMService
    public final HashMap<String, InterfaceC1186204kW> LIZ() {
        HashMap<String, InterfaceC1186204kW> map = new HashMap<>();
        map.put("GAME_COMMON_MIX_FEED_LIST_ENTRANCE", new InterfaceC1186204kW() { // from class: X.04kc
            @Override // X.InterfaceC1186204kW
            public final Pair<String, Class<? extends BaseDetailShareVM<?, ?, ?>>> LIZ(C2189821An6 c2189821An6) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("game_mix_feed_view_model");
                sbLIZ.append(c2189821An6.getVideoType());
                return new Pair<>(C2188811AlT.LIZIZ(sbLIZ), GameCommonMixViewModel.class);
            }
        });
        return map;
    }
}
