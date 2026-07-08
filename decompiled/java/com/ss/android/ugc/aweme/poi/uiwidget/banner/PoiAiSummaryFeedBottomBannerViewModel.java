package com.ss.android.ugc.aweme.poi.uiwidget.banner;

import X.C1155450gAp;
import X.C1164460gPM;
import X.C13LP;
import X.InterfaceC0148002o;
import X.InterfaceC1605290rsN;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.AiSubSummary;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import java.util.List;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiAiSummaryFeedBottomBannerViewModel extends AssemViewModel<C1155450gAp> implements InterfaceC1605290rsN {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1155450gAp(null);
    }

    @Override // X.InterfaceC1605290rsN
    public final void LLILLL(Aweme aweme) {
        PoiDataStruct poiDataStruct;
        AiSubSummary aiSubSummary;
        String str;
        List<String> urlList;
        if (aweme != null && (poiDataStruct = aweme.getPoiDataStruct()) != null && (aiSubSummary = poiDataStruct.aiSubSummary) != null) {
            String str2 = aiSubSummary.subSummaryText;
            String str3 = aiSubSummary.bottomDesc;
            UrlModel urlModel = aiSubSummary.picUrl;
            if (urlModel != null && (urlList = urlModel.getUrlList()) != null) {
                str = (String) C13LP.LJJJLL(urlList);
            } else {
                str = null;
            }
            setState(new AwS597S0100000_18(new C1164460gPM(str2, str3, str), 707));
        }
    }
}
