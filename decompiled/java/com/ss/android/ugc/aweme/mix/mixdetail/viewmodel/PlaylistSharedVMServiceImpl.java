package com.ss.android.ugc.aweme.mix.mixdetail.viewmodel;

import X.C2097608Jq;
import X.InterfaceC1186204kW;
import com.ss.android.ugc.aweme.IDetailPageShareVMService;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.PlaylistConsumptionViewModel;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes25.dex */
public final class PlaylistSharedVMServiceImpl implements IDetailPageShareVMService {
    @Override // com.ss.android.ugc.aweme.IDetailPageShareVMService
    public final HashMap<String, InterfaceC1186204kW> LIZ() {
        return C2097608Jq.LJI(new Pair("from_mix_detail_item", new InterfaceC1186204kW() { // from class: X.0sCB
            @Override // X.InterfaceC1186204kW
            public final Pair<String, Class<? extends BaseDetailShareVM<?, ?, ?>>> LIZ(C2189821An6 c2189821An6) {
                String playListId = c2189821An6.getPlayListId();
                if (playListId == null) {
                    playListId = "";
                }
                return new Pair<>(playListId, PlaylistConsumptionViewModel.class);
            }
        }), new Pair("from_profile_mix_list", new InterfaceC1186204kW() { // from class: X.0sCC
            @Override // X.InterfaceC1186204kW
            public final Pair<String, Class<? extends BaseDetailShareVM<?, ?, ?>>> LIZ(C2189821An6 c2189821An6) {
                String playListId = c2189821An6.getPlayListId();
                if (playListId == null) {
                    playListId = "";
                }
                return new Pair<>(playListId, PlaylistConsumptionViewModel.class);
            }
        }), new Pair("from_search_playlist", new InterfaceC1186204kW() { // from class: X.0sCD
            @Override // X.InterfaceC1186204kW
            public final Pair<String, Class<? extends BaseDetailShareVM<?, ?, ?>>> LIZ(C2189821An6 c2189821An6) {
                String playListId = c2189821An6.getPlayListId();
                if (playListId == null) {
                    playListId = "";
                }
                return new Pair<>(playListId, PlaylistConsumptionViewModel.class);
            }
        }));
    }
}
