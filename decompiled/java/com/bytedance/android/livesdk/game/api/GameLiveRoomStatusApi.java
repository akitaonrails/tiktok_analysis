package com.bytedance.android.livesdk.game.api;

import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import webcast.api.game.RoomMonitorResponse;

/* JADX INFO: loaded from: classes.dex */
public interface GameLiveRoomStatusApi {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/game/basic/room_monitor/")
    C11NZ<C470590Icr<RoomMonitorResponse>> roomLockMonitor(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("screen_status") int i);
}
