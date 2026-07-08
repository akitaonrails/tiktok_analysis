package com.bytedance.android.livesdk.game.playtogether;

import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1485405rg;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import webcast.api.game.CreatePlayTogetherRequest;
import webcast.api.game.CreatePlayTogetherResponse;
import webcast.api.game.GetPlayTogetherPickInfoResponse;
import webcast.api.game.GetPlayTogetherTempelateResponse;
import webcast.api.game.StartPlayTogetherV2Request;
import webcast.api.game.StartPlayTogetherV2Response;

/* JADX INFO: loaded from: classes34.dex */
public interface LivePlayTogetherApi {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/game/playtogether/v2/pick/get")
    C11NZ<GetPlayTogetherPickInfoResponse> getPlayTogetherPickedInfo(@InterfaceC1501050pAF("play_together_id") String str);

    @InterfaceC1501160pAQ("/webcast/game/playtogether/template/")
    C11NZ<GetPlayTogetherTempelateResponse> getPlayTogetherTemplate();

    @InterfaceC1501170pAR("/webcast/game/playtogether/create/")
    C11NZ<C470590Icr<CreatePlayTogetherResponse>> startPlayTogether(@InterfaceC1485405rg CreatePlayTogetherRequest createPlayTogetherRequest);

    @InterfaceC1501170pAR("/webcast/game/playtogether/v2/start")
    C11NZ<C470590Icr<StartPlayTogetherV2Response>> startPlayTogetherV2(@InterfaceC1485405rg StartPlayTogetherV2Request startPlayTogetherV2Request);
}
