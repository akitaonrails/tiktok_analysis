package com.bytedance.android.livesdk.usermanage;

import X.C11NZ;
import X.C470590Icr;
import X.C752140Teu;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import com.bytedance.android.livesdk.chatroom.model.SilenceResponse;

/* JADX INFO: loaded from: classes13.dex */
public interface MuteApi {
    @InterfaceC1501160pAQ("/webcast/room/silence/list/")
    C11NZ<C752140Teu> getMuteList(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("count") int i, @InterfaceC1501070pAH("offset") int i2, @InterfaceC1501070pAH("sec_user_id") String str);

    @InterfaceC1501170pAR("/webcast/room/silence/")
    C11NZ<C470590Icr<SilenceResponse>> mute(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("user_id") long j2, @InterfaceC1501070pAH("silence_type") long j3, @InterfaceC1501070pAH("sec_user_id") String str, @InterfaceC1501070pAH("duration") long j4, @InterfaceC1501070pAH("comment_msg_id") long j5);

    @InterfaceC1501170pAR("/webcast/room/unsilence/")
    C11NZ<C470590Icr<Object>> unmute(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("user_id") long j2, @InterfaceC1501070pAH("sec_user_id") String str);
}
