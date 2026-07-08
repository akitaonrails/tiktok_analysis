package com.bytedance.android.livesdk.api;

import X.AbstractC19484711Kz;
import X.C09SO;
import X.C470590Icr;
import X.EnumC1846380y9E;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501310pAf;
import com.bytedance.android.live.liveinteract.multilive.model.EditLiveInfoParams;
import com.bytedance.android.live.liveinteract.multilive.model.EditLiveInfoResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GetLiveInfoParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetLiveInfoResponse;

/* JADX INFO: loaded from: classes.dex */
public interface LiveTitleApi {
    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/get_live_info/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<GetLiveInfoResponse.ResponseData>> requestGetLiveTitle(@InterfaceC1485405rg GetLiveInfoParams getLiveInfoParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/edit_live_info/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<EditLiveInfoResponse.ResponseData>> requestUpdateLiveTitle(@InterfaceC1485405rg EditLiveInfoParams editLiveInfoParams);
}
