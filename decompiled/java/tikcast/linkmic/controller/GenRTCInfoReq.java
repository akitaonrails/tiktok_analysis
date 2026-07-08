package tikcast.linkmic.controller;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.linkcore.LinkCommon;
import com.bytedance.android.livesdk.model.message.linkcore.Player;

/* JADX INFO: loaded from: classes13.dex */
public final class GenRTCInfoReq {

    @C09CT("common")
    public LinkCommon common;

    @C09CT("myself")
    public Player myself;

    @C09CT("net_mode")
    public long netMode;

    @C09CT("rtc_room_id")
    public long rtcRoomId;
}
