package com.bytedance.android.livesdk.live.api;

import X.C09SO;
import X.C11NZ;
import X.C472830IgT;
import X.EnumC1846380y9E;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501150pAP;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.bytedance.android.livesdk.live.model.RoomStatsModel;
import java.util.HashMap;

/* JADX INFO: loaded from: classes8.dex */
public interface RoomStatApi {
    @InterfaceC1501300pAe
    @C09SO(EnumC1846380y9E.ROOM)
    @InterfaceC1501170pAR("/webcast/room/check_alive/")
    C11NZ<C472830IgT<RoomStatsModel>> checkRoom(@InterfaceC1501050pAF("room_ids") String str, @InterfaceC1501050pAF("enter_from") String str2);

    @InterfaceC1501300pAe
    @C09SO(EnumC1846380y9E.ROOM)
    @InterfaceC1501170pAR("/webcast/room/check_alive/")
    C11NZ<C472830IgT<RoomStatsModel>> checkRoom(@InterfaceC1501150pAP HashMap<String, String> map);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/room/check_room_id/")
    C11NZ<C472830IgT<RoomStatsModel>> checkRoomStatus(@InterfaceC1501150pAP HashMap<String, String> map);
}
