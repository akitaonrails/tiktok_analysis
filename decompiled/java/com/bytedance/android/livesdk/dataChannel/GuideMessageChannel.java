package com.bytedance.android.livesdk.dataChannel;

import com.bytedance.android.livesdk.model.message.GuideMessage;
import com.bytedance.ies.sdk.datachannel.GlobalChannel;
import kotlin.Pair;

/* JADX INFO: loaded from: classes8.dex */
public final class GuideMessageChannel extends GlobalChannel<Pair<? extends GuideMessage, ? extends Long>> {
    public GuideMessageChannel() {
        super(false);
    }
}
