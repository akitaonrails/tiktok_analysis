package com.bytedance.android.livesdk.chatroom.model.interact;

import X.C09CT;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class RivalOptPairLinkmicStatus {

    @C09CT("block_reason")
    public int blockReason;

    @C09CT("opt_pair_info")
    public OptPairInfo optPairInfo;

    @C09CT("play_type")
    public int playType;

    @C09CT("is_in_linkmic")
    public Map<Long, Boolean> isInLinkmic = new LinkedHashMap();

    @C09CT("request_room_list")
    public List<Long> requestRoomList = new ArrayList();
}
