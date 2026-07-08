package com.bytedance.android.livesdk.chatroom.network;

import X.C470590Icr;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import webcast.api.room.RoomGoalsResponse;

/* JADX INFO: loaded from: classes.dex */
public interface LiveGoalApi {
    @InterfaceC1501160pAQ("/webcast/room/janus_multi/goals/")
    Object getCurrentRoomGoals(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("sec_owner_id") String str, @InterfaceC1501070pAH("type") int i, @InterfaceC1501070pAH("goal_scene") int i2, @InterfaceC1501070pAH("goal_id") long j2, @InterfaceC1501070pAH("source") int i3, @InterfaceC1501070pAH("recommend_extra") String str2, InterfaceC1364105Vn<? super C470590Icr<RoomGoalsResponse>> interfaceC1364105Vn);
}
