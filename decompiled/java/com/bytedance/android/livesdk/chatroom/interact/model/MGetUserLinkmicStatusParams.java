package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C09CT;

/* JADX INFO: loaded from: classes16.dex */
public final class MGetUserLinkmicStatusParams {

    @C09CT("entrance")
    public int entrance;

    @C09CT("need_async_update")
    public boolean needAsyncUpdate;

    @C09CT("need_new_rivals_room")
    public boolean needNewRivalsRoom;

    @C09CT("room_id")
    public long roomId;

    @C09CT("refresh_session_id")
    public String refreshSessionId = "";

    @C09CT("extra_info_options")
    public String extraInfoOptions = "";

    @C09CT("reservation_list_room_ids")
    public String reservationListRoomIds = "";

    @C09CT("opt_pair_list_room_ids")
    public String optPairListRoomIds = "";

    @C09CT("recommend_list_room_ids")
    public String recommendListRoomIds = "";

    @C09CT("to_user_ids")
    public String toUserIds = "";

    @C09CT("to_room_ids")
    public String toRoomIds = "";

    @C09CT("friend_list_room_ids")
    public String friendListRoomIds = "";
}
