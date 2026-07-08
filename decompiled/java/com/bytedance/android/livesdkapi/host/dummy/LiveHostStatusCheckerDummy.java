package com.bytedance.android.livesdkapi.host.dummy;

import com.bytedance.android.livesdk.model.message.FeedUserRoomMonitorMessage;
import com.bytedance.android.livesdkapi.host.ILiveStatusCheckService;
import java.util.Set;

/* JADX INFO: loaded from: classes36.dex */
public final class LiveHostStatusCheckerDummy implements ILiveStatusCheckService {
    @Override // com.bytedance.android.livesdkapi.host.ILiveStatusCheckService
    public final boolean C82(FeedUserRoomMonitorMessage feedUserRoomMonitorMessage) {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.ILiveStatusCheckService
    public final void oj1(int i, Set set, Set set2) {
    }
}
