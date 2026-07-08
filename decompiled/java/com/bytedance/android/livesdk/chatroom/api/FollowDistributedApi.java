package com.bytedance.android.livesdk.chatroom.api;

import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes8.dex */
public interface FollowDistributedApi {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/linkmic/online/user_room_info/")
    C11NZ<C470590Icr<Room>> getFollowRoomInfo(@InterfaceC1501050pAF(Scene.SCENE_SERVICE) int i, @InterfaceC1501050pAF("user_id") long j);
}
