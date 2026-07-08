package com.bytedance.android.livesdk.game.broadcast.tns.api;

import X.C09SO;
import X.C11NZ;
import X.C470590Icr;
import X.EnumC1846380y9E;
import X.InterfaceC1485405rg;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501310pAf;
import webcast.api.game.CreateInfoResponse;
import webcast.api.game.TnsPiracyInfoRequest;
import webcast.api.game.TnsPiracyInfoResponse;

/* JADX INFO: loaded from: classes.dex */
public interface TnsPiracyApi {
    @InterfaceC1501160pAQ("/webcast/game/basic/create_info/")
    @C09SO(EnumC1846380y9E.BROADCAST)
    C11NZ<C470590Icr<CreateInfoResponse.ResponseData>> getPreviewGameCreateInfo();

    @InterfaceC1501170pAR("/webcast/game/tns/piracy_info/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    C11NZ<C470590Icr<TnsPiracyInfoResponse>> reportTnsPiracySignal(@InterfaceC1485405rg TnsPiracyInfoRequest tnsPiracyInfoRequest);
}
