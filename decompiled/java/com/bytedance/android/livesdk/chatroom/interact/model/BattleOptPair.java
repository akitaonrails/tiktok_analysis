package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.model.interact.OptPairInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class BattleOptPair {

    @C09CT("invite_block_reason")
    public int inviteBlockReason;

    @C09CT("opt_pair_info")
    public OptPairInfo optPairInfo;

    @C09CT("play_type")
    public int playType;

    @C09CT("show_view_button")
    public boolean showViewButton;

    @C09CT("self_team_room_list")
    public List<Room> selfTeamRoomList = new ArrayList();

    @C09CT("rival_team_room_list")
    public List<Room> rivalTeamRoomList = new ArrayList();

    @C09CT("is_in_linkmic")
    public Map<Long, Boolean> isInLinkmic = new LinkedHashMap();

    @C09CT("request_room_list")
    public List<Long> requestRoomList = new ArrayList();

    @C09CT("request_room_list_str")
    public List<String> requestRoomListStr = new ArrayList();
}
