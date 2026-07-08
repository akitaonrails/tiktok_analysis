package com.ss.android.ugc.aweme.live.feedpage;

import X.C11NZ;
import X.C15ZK;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes32.dex */
public interface LiveRoomInfoApi {
    public static final C15ZK LIZ = C15ZK.LIZ;

    @InterfaceC1501160pAQ("/webcast/room/info_by_user/")
    C11NZ<LiveRoomInfoResponse> fetchUserRoom(@InterfaceC1501070pAH("user_id") long j, @InterfaceC1501070pAH("sec_user_id") String str);

    @InterfaceC1501160pAQ("/webcast/room/info_by_user/")
    C11NZ<LiveRoomInfoResponse> fetchUserRoom(@InterfaceC1501070pAH("user_id") long j, @InterfaceC1501070pAH("sec_user_id") String str, @InterfaceC1501070pAH(Scene.SCENE_SERVICE) String str2);
}
