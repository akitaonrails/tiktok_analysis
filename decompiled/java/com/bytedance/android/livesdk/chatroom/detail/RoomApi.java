package com.bytedance.android.livesdk.chatroom.detail;

import X.C09SO;
import X.C11NZ;
import X.C470590Icr;
import X.EnumC1846380y9E;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* JADX INFO: loaded from: classes8.dex */
public interface RoomApi {
    @InterfaceC1501160pAQ("/webcast/room/collect_unread/")
    C11NZ<C470590Icr<Object>> collectUnreadRequest(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("anchor_id") long j2, @InterfaceC1501070pAH("unread_extra") String str, @InterfaceC1501070pAH("room_ids") String str2);

    @InterfaceC1501160pAQ("/webcast/room/info_by_user/")
    @C09SO(EnumC1846380y9E.ROOM)
    C11NZ<C470590Icr<Room>> fetchUserRoom(@InterfaceC1501070pAH("user_id") long j, @InterfaceC1501070pAH("sec_user_id") String str);
}
