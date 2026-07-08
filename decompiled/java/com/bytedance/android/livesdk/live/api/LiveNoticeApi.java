package com.bytedance.android.livesdk.live.api;

import X.C11NZ;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import webcast.api.room.NextLiveNoticeRegisterResponse;

/* JADX INFO: loaded from: classes34.dex */
public interface LiveNoticeApi {
    @InterfaceC1501160pAQ("/webcast/room/next_live_notice/register/")
    C11NZ<NextLiveNoticeRegisterResponse> registerNextLiveNotice(@InterfaceC1501070pAH("status_only") boolean z, @InterfaceC1501070pAH("host_id") long j, @InterfaceC1501070pAH("is_cancel") boolean z2);
}
