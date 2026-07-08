package com.bytedance.android.livesdk.live.model;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveScrollConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("min_distance_for_fling")
    public float minDistanceForFling;

    @C09CT("min_fling_velocity")
    public int minFlingVelocity;

    @C09CT("turn_page_value")
    public float turnPageValue;

    static {
        NormalGson.singleton();
        ADAPTER = new LiveScrollConfig_OptTypeAdapter();
    }

    public LiveScrollConfig() {
        this(25.0f, 400, 0.4f);
    }

    public final float getMinDistanceForFling() {
        return this.minDistanceForFling;
    }

    public final int getMinFlingVelocity() {
        return this.minFlingVelocity;
    }

    public final float getTurnPageValue() {
        return this.turnPageValue;
    }

    public final void setMinDistanceForFling(float f) {
        this.minDistanceForFling = f;
    }

    public final void setMinFlingVelocity(int i) {
        this.minFlingVelocity = i;
    }

    public final void setTurnPageValue(float f) {
        this.turnPageValue = f;
    }

    public LiveScrollConfig(float f, int i, float f2) {
        this.minDistanceForFling = f;
        this.minFlingVelocity = i;
        this.turnPageValue = f2;
    }
}
