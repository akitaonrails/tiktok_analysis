package com.ss.android.ugc.aweme.topic.movie.detail.videos;

import X.C2097608Jq;
import X.InterfaceC1186204kW;
import com.ss.android.ugc.aweme.IDetailPageShareVMService;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.topic.movie.detail.vm.MovieVideoListVM;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieDetailSharedVMServiceImpl implements IDetailPageShareVMService {
    @Override // com.ss.android.ugc.aweme.IDetailPageShareVMService
    public final HashMap<String, InterfaceC1186204kW> LIZ() {
        return C2097608Jq.LJI(new Pair("MOVIE_VIDEO_LIST_ENTRANCE", new InterfaceC1186204kW() { // from class: X.04kK
            @Override // X.InterfaceC1186204kW
            public final Pair<String, Class<? extends BaseDetailShareVM<?, ?, ?>>> LIZ(C2189821An6 c2189821An6) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("MOVIE_VIDEO_LIST_VM_KEY");
                sbLIZ.append(c2189821An6.getExtra().get("movie_id"));
                sbLIZ.append(c2189821An6.getExtra().get("page_id"));
                return new Pair<>(C2188811AlT.LIZIZ(sbLIZ), MovieVideoListVM.class);
            }
        }));
    }
}
