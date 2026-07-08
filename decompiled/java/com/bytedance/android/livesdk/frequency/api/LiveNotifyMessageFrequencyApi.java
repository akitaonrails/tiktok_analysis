package com.bytedance.android.livesdk.frequency.api;

import X.C09SO;
import X.C11NZ;
import X.C470590Icr;
import X.C782810UnH;
import X.EnumC1846380y9E;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import com.bytedance.android.livesdk.chatroom.model.MsgNotifyControlReq;
import com.bytedance.android.livesdk.chatroom.model.MsgNotifyControlResp;

/* JADX INFO: loaded from: classes13.dex */
public interface LiveNotifyMessageFrequencyApi {
    public static final C782810UnH LIZ = C782810UnH.LIZ;

    @C09SO(EnumC1846380y9E.ROOM)
    @InterfaceC1501170pAR("/webcast/room/msg_notify/control/")
    C11NZ<C470590Icr<MsgNotifyControlResp.Data>> reportMsgNotifyRecord(@InterfaceC1485405rg MsgNotifyControlReq msgNotifyControlReq);
}
