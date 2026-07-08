package com.bytedance.android.livesdk.chatroom.api;

import X.C09SO;
import X.C11NZ;
import X.C470590Icr;
import X.EnumC1846380y9E;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501170pAR;
import webcast.api.room.CrowdSelectionResponse;

/* JADX INFO: loaded from: classes.dex */
public interface LiveAceAccountApi {
    @C09SO(EnumC1846380y9E.ROOM)
    @InterfaceC1501170pAR("/webcast/room/crowd_selection/")
    C11NZ<C470590Icr<CrowdSelectionResponse.Data>> fetchAceAccountInfo(@InterfaceC1501070pAH("crowd_strategy") long j);
}
