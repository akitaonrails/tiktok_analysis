package com.bytedance.android.livesdk.marketing.detect;

import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501150pAP;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.google.gson.n;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface MessageDetectApi {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/im/detect/")
    C11NZ<C470590Icr<n>> imDetect(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("anchor_device_id") long j2, @InterfaceC1501050pAF("anchor_user_id") long j3, @InterfaceC1501050pAF("client_start_ms") long j4, @InterfaceC1501050pAF("msg_body") String str, @InterfaceC1501150pAP Map<String, String> map);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/im/detect/report/")
    C11NZ<C470590Icr<n>> imDetectReport(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("msg_type") int i, @InterfaceC1501050pAF("client_start_ms") long j2, @InterfaceC1501050pAF("api_recv_time_ms") long j3, @InterfaceC1501050pAF("api_send_to_goim_ms") long j4, @InterfaceC1501050pAF("imsdk_recv_time_ms") long j5, @InterfaceC1501050pAF("imsdk_deliver_time_ms") long j6);
}
