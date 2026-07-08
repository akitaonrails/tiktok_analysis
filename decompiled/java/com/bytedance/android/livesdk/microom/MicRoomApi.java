package com.bytedance.android.livesdk.microom;

import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.bytedance.android.livesdk.microom.model.MicRoomDialogOfficialInfo;
import com.bytedance.android.livesdk.microom.model.NextRoomData;

/* JADX INFO: loaded from: classes.dex */
public interface MicRoomApi {
    @InterfaceC1501160pAQ("/webcast/room/official/info")
    C11NZ<C470590Icr<MicRoomDialogOfficialInfo>> getMicOfficeInfo(@InterfaceC1501070pAH("channel_uid") long j, @InterfaceC1501070pAH("anchor_id") long j2);

    @InterfaceC1501160pAQ("/webcast/room/next_event_show/")
    C11NZ<C470590Icr<NextRoomData>> getNextRoomData(@InterfaceC1501070pAH("channel_uid") long j, @InterfaceC1501070pAH("now_anchor_id") long j2);
}
