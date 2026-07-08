package com.bytedance.android.livesdk.api;

import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501150pAP;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.bytedance.android.livesdk.chatroom.model.UpdateStatusResponse;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface StatusApi {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/room/ping/anchor/")
    C11NZ<C470590Icr<UpdateStatusResponse>> postStatus(@InterfaceC1501150pAP Map<String, Object> map);

    @InterfaceC1501160pAQ("/webcast/room/ping/anchor/")
    C11NZ<C470590Icr<UpdateStatusResponse>> sendStatus(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS) int i, @InterfaceC1501070pAH("stream_id") long j2, @InterfaceC1501070pAH("reason_no") int i2, @InterfaceC1501070pAH("source") String str, @InterfaceC1501070pAH("frame_rate") long j3, @InterfaceC1501070pAH("bit_rate") long j4);

    @InterfaceC1501160pAQ("/webcast/room/stream_status/")
    C11NZ<C470590Icr<Void>> sendStreamStatus(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS) int i, @InterfaceC1501070pAH("stream_id") long j2, @InterfaceC1501070pAH("timestamp") long j3);
}
