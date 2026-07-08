package com.bytedance.android.livesdk.livesetting.other;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class FollowLiveBubbleConfig {
    public static final TypeAdapter ADAPTER;
    public static final FollowLiveBubbleConfig LIZ = new FollowLiveBubbleConfig();

    @C09CT("diff_time")
    public int diffTime;

    @C09CT("exp_group")
    public int expGroup;

    static {
        NormalGson.singleton();
        ADAPTER = new FollowLiveBubbleConfig_OptTypeAdapter();
    }
}
