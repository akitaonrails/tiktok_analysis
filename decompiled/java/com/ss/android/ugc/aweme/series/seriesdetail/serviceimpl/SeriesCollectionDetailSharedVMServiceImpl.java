package com.ss.android.ugc.aweme.series.seriesdetail.serviceimpl;

import X.C2097608Jq;
import X.InterfaceC1186204kW;
import com.ss.android.ugc.aweme.IDetailPageShareVMService;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.series.innerfeed.viewmodel.SeriesInnerFeedViewModel;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class SeriesCollectionDetailSharedVMServiceImpl implements IDetailPageShareVMService {
    @Override // com.ss.android.ugc.aweme.IDetailPageShareVMService
    public final HashMap<String, InterfaceC1186204kW> LIZ() {
        return C2097608Jq.LJI(new Pair("from_paid_content_detail_video_list_entrance", new InterfaceC1186204kW() { // from class: X.04kI
            @Override // X.InterfaceC1186204kW
            public final Pair<String, Class<? extends BaseDetailShareVM<?, ?, ?>>> LIZ(C2189821An6 c2189821An6) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("series_innerfeed_video_list_feed_vm_key");
                sbLIZ.append(c2189821An6.getExtra().get("paid_content_session_id"));
                return new Pair<>(C2188811AlT.LIZIZ(sbLIZ), SeriesInnerFeedViewModel.class);
            }
        }));
    }
}
