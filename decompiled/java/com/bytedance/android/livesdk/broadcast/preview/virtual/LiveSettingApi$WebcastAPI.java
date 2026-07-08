package com.bytedance.android.livesdk.broadcast.preview.virtual;

import X.C09SO;
import X.C11NZ;
import X.C470590Icr;
import X.EnumC1846380y9E;
import X.InterfaceC1501160pAQ;
import webcast.api.room.LivePodcastResponse;

/* JADX INFO: loaded from: classes.dex */
public interface LiveSettingApi$WebcastAPI {
    @InterfaceC1501160pAQ("/webcast/room/live_podcast/")
    @C09SO(EnumC1846380y9E.BROADCAST)
    C11NZ<C470590Icr<LivePodcastResponse.ResponseData>> getLivePodCast();
}
