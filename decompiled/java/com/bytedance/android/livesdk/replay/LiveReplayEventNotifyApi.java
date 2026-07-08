package com.bytedance.android.livesdk.replay;

import X.C11NZ;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import kotlin.Unit;

/* JADX INFO: loaded from: classes28.dex */
public interface LiveReplayEventNotifyApi {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/anchor/replay/event_notify/")
    C11NZ<Unit> replayEventNotify(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("event") int i, @InterfaceC1501050pAF("need_in_app") boolean z, @InterfaceC1501050pAF("need_in_box") boolean z2);
}
