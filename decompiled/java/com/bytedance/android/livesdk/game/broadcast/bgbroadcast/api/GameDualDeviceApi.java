package com.bytedance.android.livesdk.game.broadcast.bgbroadcast.api;

import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1485405rg;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import X.InterfaceC1501310pAf;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import tikcast.linkmic.controller.GenRTCInfoReq;
import tikcast.linkmic.controller.GenRTCInfoResp;

/* JADX INFO: loaded from: classes13.dex */
public interface GameDualDeviceApi {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/game/basic/dual_device_update/")
    C11NZ<C470590Icr<Object>> dualDeviceUpdate(@InterfaceC1501050pAF(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS) int i, @InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("update_reason") String str);

    @InterfaceC1501170pAR("/tikcast/linkmic/gen_rtc_info/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    C11NZ<C470590Icr<GenRTCInfoResp>> genRtcInfo(@InterfaceC1485405rg GenRTCInfoReq genRTCInfoReq);
}
