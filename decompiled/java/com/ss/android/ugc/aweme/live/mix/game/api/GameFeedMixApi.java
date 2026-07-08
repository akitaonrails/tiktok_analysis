package com.ss.android.ugc.aweme.live.mix.game.api;

import X.C11NZ;
import X.C331180Cya;
import X.C470590Icr;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import webcast.api.game.FeedRequestParams;
import webcast.api.game.FeedResponse;

/* JADX INFO: loaded from: classes5.dex */
public interface GameFeedMixApi {
    public static final C331180Cya LIZ = C331180Cya.LIZ;

    @InterfaceC1501170pAR("/webcast/game_feed/api/bottom_bar/feed/")
    C11NZ<C470590Icr<FeedResponse>> requestBottomBarFeed(@InterfaceC1485405rg FeedRequestParams feedRequestParams);
}
