package com.bytedance.android.livesdk.usermanage;

import X.C11NZ;
import X.C470590Icr;
import X.C752140Teu;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
public interface KickOutApi {
    @InterfaceC1501160pAQ("/webcast/room/kick/list/")
    C11NZ<C752140Teu> getKickedOutList(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("count") int i, @InterfaceC1501070pAH("offset") int i2, @InterfaceC1501070pAH("sec_user_id") String str);

    @InterfaceC1501170pAR("/webcast/room/kick/user/")
    C11NZ<C470590Icr<Unit>> kickOut(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("kick_uid") long j2, @InterfaceC1501070pAH("comment_msg_id") Long l);

    @InterfaceC1501160pAQ("/webcast/room/unkick/user/")
    C11NZ<C470590Icr<Unit>> unKickOut(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("kick_uid") long j2);
}
