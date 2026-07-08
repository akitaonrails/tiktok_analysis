package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class HotRoomData {

    @C09CT("action")
    public int action;

    @C09CT("business")
    public String business = "";

    @C09CT("hot_room_state")
    public List<HotRoomState> hotRoomState = new ArrayList();

    @C09CT("is_hot")
    public boolean isHot;

    @C09CT("reason")
    public int reason;

    @C09CT("room_id")
    public long roomId;

    @C09CT("timestamp")
    public long timestamp;

    public static final class HotRoomState {

        @C09CT("enter_ts")
        public long enterTs;

        @C09CT("reason")
        public int reason;
    }
}
