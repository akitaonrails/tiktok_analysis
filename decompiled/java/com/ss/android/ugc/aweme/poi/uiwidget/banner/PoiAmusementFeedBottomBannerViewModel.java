package com.ss.android.ugc.aweme.poi.uiwidget.banner;

import X.C1155460gAq;
import X.C1164470gPN;
import X.C13LP;
import X.InterfaceC0148002o;
import X.InterfaceC1605290rsN;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.PoiAmusementModel;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import java.util.List;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiAmusementFeedBottomBannerViewModel extends AssemViewModel<C1155460gAq> implements InterfaceC1605290rsN {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1155460gAq(null);
    }

    @Override // X.InterfaceC1605290rsN
    public final void LLILLL(Aweme aweme) {
        PoiDataStruct poiDataStruct;
        PoiAmusementModel poiAmusementModel;
        String str;
        if (aweme != null && (poiDataStruct = aweme.getPoiDataStruct()) != null && (poiAmusementModel = poiDataStruct.poiAmusement) != null) {
            String str2 = poiAmusementModel.name;
            String str3 = poiAmusementModel.childLocationArea;
            List<String> list = poiAmusementModel.picUrls;
            if (list != null) {
                str = (String) C13LP.LJJJLL(list);
            } else {
                str = null;
            }
            setState(new AwS597S0100000_18(new C1164470gPN(str2, str3, str), 708));
        }
    }
}
