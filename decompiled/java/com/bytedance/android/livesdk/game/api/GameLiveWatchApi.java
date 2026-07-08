package com.bytedance.android.livesdk.game.api;

import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1485405rg;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import webcast.api.game.GetCategoryListResponse;
import webcast.api.game.GetRelatedEntranceRequest;
import webcast.api.game.GetRelatedEntranceResponse;

/* JADX INFO: loaded from: classes29.dex */
public interface GameLiveWatchApi {
    @InterfaceC1501160pAQ("/webcast/game/categories/")
    C11NZ<GetCategoryListResponse> getGameCategory();

    @InterfaceC1501170pAR("/webcast/game_feed/get_related_entrance/")
    C11NZ<C470590Icr<GetRelatedEntranceResponse>> getRelatedEntrance(@InterfaceC1485405rg GetRelatedEntranceRequest getRelatedEntranceRequest);
}
