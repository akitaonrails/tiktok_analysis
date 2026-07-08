package com.bytedance.android.livesdk.feed.tab.api;

import X.C11NZ;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.livesdk.feed.feed.ItemTabExtra;
import com.bytedance.android.livesdk.model.ItemTab;

/* JADX INFO: loaded from: classes8.dex */
public interface FeedTabApi {
    @InterfaceC1501160pAQ("/webcast/tab/")
    C11NZ<BaseListResponse<ItemTab, ItemTabExtra>> queryTab(@InterfaceC1501070pAH("live_entrance") int i);
}
