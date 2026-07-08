package com.bytedance.android.livesdk.chatroom.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class RoomStatShow {

    @C09CT("postition_list")
    public List<PositionData> postitionList = new ArrayList();

    public static final class PositionData {

        @C09CT("position")
        public int position;

        @C09CT("room_stat")
        public RoomStat roomStat;
    }
}
