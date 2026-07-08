package com.bytedance.android.livesdk.game.api;

import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import webcast.api.game.GetAllGameFeaturesResponse;

/* JADX INFO: loaded from: classes3.dex */
public interface GameLiveServerFeatureApi {
    @InterfaceC1501160pAQ("/webcast/game/feature/get/")
    C11NZ<C470590Icr<GetAllGameFeaturesResponse.ResponseData>> getAllGameFeatures(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("feature_id_list") String str);
}
