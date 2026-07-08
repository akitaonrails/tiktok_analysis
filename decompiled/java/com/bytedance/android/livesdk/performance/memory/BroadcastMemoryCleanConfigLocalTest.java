package com.bytedance.android.livesdk.performance.memory;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class BroadcastMemoryCleanConfigLocalTest {
    public static final TypeAdapter ADAPTER = new BroadcastMemoryCleanConfigLocalTest_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable_critical")
    public boolean enableCritical;

    @C09CT("enable_low")
    public boolean enableLow;

    public BroadcastMemoryCleanConfigLocalTest() {
        this(false, false);
    }

    public final boolean getEnableCritical() {
        return this.enableCritical;
    }

    public final boolean getEnableLow() {
        return this.enableLow;
    }

    public final void setEnableCritical(boolean z) {
        this.enableCritical = z;
    }

    public final void setEnableLow(boolean z) {
        this.enableLow = z;
    }

    public BroadcastMemoryCleanConfigLocalTest(boolean z, boolean z2) {
        this.enableLow = z;
        this.enableCritical = z2;
    }
}
