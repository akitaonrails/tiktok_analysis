package com.ss.android.ugc.aweme.live.api;

import X.C0J6F;
import X.C0J6G;
import X.C0X9S;
import X.C11NZ;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes8.dex */
public interface LiveRoomPreloadApi {
    @InterfaceC1501160pAQ("/webcast/room/preload_room/")
    C11NZ<C0J6G> preloadRoom(@InterfaceC1501070pAH("owner_user_id") long j, @InterfaceC1501070pAH("room_id") long j2, @InterfaceC1501070pAH(Scene.SCENE_SERVICE) String str);

    @InterfaceC1501160pAQ("/webcast/room/preload_room/")
    C0X9S<C0J6G> preloadRoomSync(@InterfaceC1501070pAH("owner_user_id") long j, @InterfaceC1501070pAH("room_id") long j2, @InterfaceC1501070pAH(Scene.SCENE_SERVICE) String str);

    @InterfaceC1501160pAQ("/webcast/room/preload_room/")
    C11NZ<C0J6F> preloadSlimRoom(@InterfaceC1501070pAH("owner_user_id") long j, @InterfaceC1501070pAH("room_id") long j2, @InterfaceC1501070pAH(Scene.SCENE_SERVICE) String str);
}
