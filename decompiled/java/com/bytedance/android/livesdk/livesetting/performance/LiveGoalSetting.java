package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveGoalSetting {
    public static final TypeAdapter ADAPTER;

    @C09CT("goal_position")
    public int goalPosition = 5;

    static {
        NormalGson.singleton();
        ADAPTER = new LiveGoalSetting_OptTypeAdapter();
    }
}
