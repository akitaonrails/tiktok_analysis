package com.bytedance.android.livesdk.game.broadcast.stream.quality.preschedule.api;

import X.C09SO;
import X.C470590Icr;
import X.EnumC1846380y9E;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import webcast.api.creator.PreScheduleStream;

/* JADX INFO: loaded from: classes13.dex */
public interface GamePreScheduleApi {
    @InterfaceC1501160pAQ("/webcast/room/pre_schedule_stream/")
    @C09SO(EnumC1846380y9E.BROADCAST)
    Object preScheduleStream(@InterfaceC1501070pAH("live_room_mode") long j, InterfaceC1364105Vn<? super C470590Icr<PreScheduleStream>> interfaceC1364105Vn);
}
