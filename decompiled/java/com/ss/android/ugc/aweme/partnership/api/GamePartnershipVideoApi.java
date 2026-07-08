package com.ss.android.ugc.aweme.partnership.api;

import X.C11NZ;
import X.C1886830zCT;
import X.C470590Icr;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501160pAQ;
import java.util.Map;
import webcast.api.game_station.GameDetailVideosResponse;

/* JADX INFO: loaded from: classes29.dex */
public interface GamePartnershipVideoApi {
    public static final C1886830zCT LIZ = C1886830zCT.LIZ;

    @InterfaceC1501160pAQ("/game_station/game_detail_videos/")
    C11NZ<C470590Icr<GameDetailVideosResponse.ResponseData>> requestAnchorGameDetailVideos(@InterfaceC1501130pAN Map<String, String> map);
}
