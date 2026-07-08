package tikcast.linkmic.controller;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizCreateChannelParams;
import com.bytedance.android.livesdk.model.message.linkcore.LinkCommon;
import com.bytedance.android.livesdk.model.message.linkcore.Player;

/* JADX INFO: loaded from: classes.dex */
public final class CreateChannelReq {

    @C09CT("common")
    public LinkCommon common;

    @C09CT("config")
    public InitConfig config;

    @C09CT("live_room_mode")
    public long liveRoomMode;

    @C09CT("multi_guest_req_extra")
    public BizCreateChannelParams multiGuestReqExtra;

    @C09CT("myself")
    public Player myself;

    @C09CT("net_mode")
    public long netMode;

    @C09CT("layout_id")
    public String layoutId = "";

    @C09CT("extend_extra")
    public String extendExtra = "";
}
