package com.bytedance.android.livesdk.api;

import X.C11NZ;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;

/* JADX INFO: loaded from: classes13.dex */
public interface LiveEventDescCardMApi {
    @InterfaceC1501160pAQ("https://api-va.tiktokv.com/tiktok/event/list/v1")
    C11NZ<LiveEventResponse> getAnchorSelectionResponse(@InterfaceC1501070pAH("host_user_id") String str, @InterfaceC1501070pAH("query_type") int i, @InterfaceC1501070pAH("offset") int i2, @InterfaceC1501070pAH("count") int i3, @InterfaceC1501070pAH("room_start_time") int i4, @InterfaceC1501070pAH("room_id") String str2);
}
