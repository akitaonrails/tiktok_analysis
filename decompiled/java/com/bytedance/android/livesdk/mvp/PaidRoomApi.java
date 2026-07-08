package com.bytedance.android.livesdk.mvp;

import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.bytedance.android.live.network.response.BaseResponse;

/* JADX INFO: loaded from: classes.dex */
public interface PaidRoomApi {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/room/gated/check_ticket/")
    C11NZ<BaseResponse<Void, CheckCodeExtra>> checkCode(@InterfaceC1501050pAF("ticket_code") String str, @InterfaceC1501050pAF("room_id") Long l);

    @InterfaceC1501160pAQ("/webcast/room/gated/event_info/")
    C11NZ<C470590Icr<GatedRoomData>> queryRoomData(@InterfaceC1501070pAH("room_id") Long l);
}
