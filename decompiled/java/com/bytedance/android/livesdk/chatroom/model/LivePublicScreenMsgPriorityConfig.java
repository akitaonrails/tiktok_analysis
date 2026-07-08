package com.bytedance.android.livesdk.chatroom.model;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LivePublicScreenMsgPriorityConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("priority_for_anchor")
    public long priorityForAnchor = 1000;

    @C09CT("priority_for_audience")
    public long priorityForAudience = 10000;

    static {
        NormalGson.singleton();
        ADAPTER = new LivePublicScreenMsgPriorityConfig_OptTypeAdapter();
    }
}
