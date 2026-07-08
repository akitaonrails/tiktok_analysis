package com.ss.android.ugc.aweme.commercialize.live.promote.api;

import X.C11NZ;
import X.InterfaceC1485405rg;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501310pAf;
import X.InterfaceC2174708fZ;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes29.dex */
public interface PromoteApi {
    @InterfaceC1501160pAQ("/aweme/v1/promote/api/eligible/")
    C11NZ<PromoteEligibleCheckModel> checkUserPromoteEligible();

    @InterfaceC1501160pAQ("aweme/v1/promote/api/entry/control")
    C11NZ<GetPromoteEntryControlResp> getPromoteEntryControlStrategy(@InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i, @InterfaceC1501070pAH("videoId") String str);

    @InterfaceC1501170pAR
    @InterfaceC1501310pAf({"Content-Type: application/json"})
    C11NZ<BaseResponse> postPromoteClickToFE(@InterfaceC2174708fZ String str, @InterfaceC1485405rg PromoteEventData promoteEventData);

    @InterfaceC1501170pAR("aweme/v1/promote/api/banner/action/report")
    C11NZ<BaseResponse> reportBannerAction(@InterfaceC1485405rg BannerActionReportRequest bannerActionReportRequest);
}
