package com.bytedance.android.livesdk.broadcast.livestudio;

import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501170pAR;
import tikcast.api.anchor.EnterMonitorResponse;
import tikcast.api.anchor.LeaveMonitorResponse;

/* JADX INFO: loaded from: classes13.dex */
public interface LiveStudioMonitorApi {
    @InterfaceC1501170pAR("/webcast/anchor/monitor/enter")
    C11NZ<C470590Icr<EnterMonitorResponse.ResponseData>> enterMonitor(@InterfaceC1501070pAH("monitor_mode") int i);

    @InterfaceC1501170pAR("/webcast/anchor/monitor/leave")
    C11NZ<C470590Icr<LeaveMonitorResponse>> leaveMonitor(@InterfaceC1501070pAH("room_id") Long l);
}
