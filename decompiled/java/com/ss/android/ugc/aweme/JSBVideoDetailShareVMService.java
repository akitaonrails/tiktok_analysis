package com.ss.android.ugc.aweme;

import X.C2097608Jq;
import X.InterfaceC1186204kW;
import com.ss.android.ugc.aweme.detail.jsb.JSBVideoDetailShareVM;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.param.DetailNavArgModel;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class JSBVideoDetailShareVMService implements IDetailPageShareVMService {
    @Override // com.ss.android.ugc.aweme.IDetailPageShareVMService
    public final HashMap<String, InterfaceC1186204kW> LIZ() {
        return C2097608Jq.LJI(new Pair("jsb_video_detail", new InterfaceC1186204kW() { // from class: X.04kV
            @Override // X.InterfaceC1186204kW
            public final Pair<String, Class<? extends BaseDetailShareVM<?, ?, ?>>> LIZ(C2189821An6 c2189821An6) {
                String jsbVideoDetailKey;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c2189821An6.getFrom());
                sbLIZ.append('_');
                DetailNavArgModel navArgModel = c2189821An6.getNavArgModel();
                if (navArgModel != null) {
                    jsbVideoDetailKey = navArgModel.getJsbVideoDetailKey();
                } else {
                    jsbVideoDetailKey = null;
                }
                sbLIZ.append(jsbVideoDetailKey);
                return new Pair<>(C2188811AlT.LIZIZ(sbLIZ), JSBVideoDetailShareVM.class);
            }
        }));
    }
}
