package com.bytedance.android.livesdk.dataChannel;

import com.bytedance.ies.sdk.datachannel.Channel;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class LandscapePinchTimesChannel extends Channel<Pair<? extends Float, ? extends Integer>> {
    public LandscapePinchTimesChannel() {
        super(new Pair(Float.valueOf(1.0f), -1));
    }
}
