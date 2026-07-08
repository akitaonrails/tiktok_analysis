package com.ss.android.ugc.aweme.ws;

import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;

/* JADX INFO: loaded from: classes24.dex */
public interface LiveWebSocketApi {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/room/uplink/")
    C11NZ<C470590Icr<String>> fallbackSendMessage(@InterfaceC1501050pAF("seq_id") long j, @InterfaceC1501050pAF("service") int i, @InterfaceC1501050pAF("method") int i2, @InterfaceC1501050pAF("payload_encoding") String str, @InterfaceC1501050pAF("payload") String str2, @InterfaceC1501050pAF("header_msg_id") String str3, @InterfaceC1501050pAF("request_time_ms") long j2, @InterfaceC1501050pAF("trace_enable") String str4);
}
