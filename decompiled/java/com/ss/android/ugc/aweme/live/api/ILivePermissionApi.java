package com.ss.android.ugc.aweme.live.api;

import X.C09SO;
import X.C11NZ;
import X.C470590Icr;
import X.EnumC1846380y9E;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import webcast.api.room.LivePodcastResponse;

/* JADX INFO: loaded from: classes.dex */
public interface ILivePermissionApi {
    @InterfaceC1501160pAQ("/webcast/room/live_podcast/")
    @C09SO(EnumC1846380y9E.BROADCAST)
    C11NZ<C470590Icr<LivePodcastResponse.ResponseData>> getLivePodCast(@InterfaceC1501070pAH("from_page") int i);
}
