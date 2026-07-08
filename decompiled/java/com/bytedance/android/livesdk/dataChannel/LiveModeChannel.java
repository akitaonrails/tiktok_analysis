package com.bytedance.android.livesdk.dataChannel;

import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.Channel;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveModeChannel extends Channel<LiveMode> {
    public LiveModeChannel() {
        super(LiveMode.VIDEO);
    }
}
