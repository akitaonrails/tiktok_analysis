package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
public final class GameModeHostRange {
    public static final TypeAdapter ADAPTER;

    @C09CT("lower_limit")
    public int lowerLimit;

    @C09CT("upper_limit")
    public int upperLimit;

    static {
        NormalGson.singleton();
        ADAPTER = new GameModeHostRange_OptTypeAdapter();
    }

    public GameModeHostRange() {
        this(0, 0);
    }

    public GameModeHostRange(int i, int i2) {
        this.lowerLimit = i;
        this.upperLimit = i2;
    }
}
