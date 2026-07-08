package com.bytedance.android.livesdk.api;

import X.C470590Icr;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.bytedance.android.livesdk.chatroom.model.UpdateStatusResponse;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public interface StatusKtApi {
    @InterfaceC1501160pAQ("/webcast/room/ping/anchor/")
    Object sendStatusCoroutine(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS) int i, @InterfaceC1501070pAH("stream_id") long j2, @InterfaceC1501070pAH("reason_no") int i2, @InterfaceC1501070pAH("source") String str, @InterfaceC1501070pAH("frame_rate") long j3, @InterfaceC1501070pAH("bit_rate") long j4, InterfaceC1364105Vn<? super C470590Icr<UpdateStatusResponse>> interfaceC1364105Vn);
}
