package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class DowngradeLevel {
    public static final TypeAdapter ADAPTER;

    @C09CT("enter_threshold")
    public float enterThreshold;

    @C09CT("exit_threshold")
    public float exitThreshold;

    @C09CT("level")
    public int level;

    static {
        NormalGson.singleton();
        ADAPTER = new DowngradeLevel_OptTypeAdapter();
    }

    public DowngradeLevel() {
        this(0, 0.0f, 0.0f);
    }

    public DowngradeLevel(int i, float f, float f2) {
        this.level = i;
        this.enterThreshold = f;
        this.exitThreshold = f2;
    }
}
