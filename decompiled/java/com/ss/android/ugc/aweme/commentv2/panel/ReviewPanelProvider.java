package com.ss.android.ugc.aweme.commentv2.panel;

import X.C1349800lEI;
import X.C1367960lha;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;

/* JADX INFO: loaded from: classes22.dex */
public final class ReviewPanelProvider implements IPanelProviderProtocol {
    @Override // com.ss.android.ugc.aweme.commentv2.panel.IPanelProviderProtocol
    public final int Kj1() {
        return 10;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.panel.IPanelProviderProtocol
    public final String PU0() {
        return "review_tab";
    }

    @Override // com.ss.android.ugc.aweme.commentv2.panel.IPanelProviderProtocol
    public final Fragment ER0(C1349800lEI c1349800lEI, Aweme aweme) {
        C1367960lha.LIZ.getClass();
        return C1367960lha.LIZ().LJLLLL(aweme);
    }

    @Override // com.ss.android.ugc.aweme.commentv2.panel.IPanelProviderProtocol
    public final boolean vJ0(C1349800lEI c1349800lEI, Aweme aweme) {
        PoiDataStruct poiDataStruct;
        String str;
        if (aweme == null || (poiDataStruct = aweme.getPoiDataStruct()) == null || (str = poiDataStruct.poiId) == null || str.length() <= 0) {
            return false;
        }
        return true;
    }
}
