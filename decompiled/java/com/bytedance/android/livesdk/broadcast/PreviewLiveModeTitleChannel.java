package com.bytedance.android.livesdk.broadcast;

import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.Channel;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class PreviewLiveModeTitleChannel extends Channel<Map<LiveMode, String>> {
    public PreviewLiveModeTitleChannel() {
        super(new LinkedHashMap());
    }
}
