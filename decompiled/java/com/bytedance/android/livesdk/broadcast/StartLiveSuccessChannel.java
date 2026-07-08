package com.bytedance.android.livesdk.broadcast;

import com.bytedance.ies.sdk.datachannel.Channel;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class StartLiveSuccessChannel extends Channel<Pair<? extends Boolean, ? extends Long>> {
    public StartLiveSuccessChannel() {
        super(new Pair(Boolean.FALSE, -1L));
    }
}
