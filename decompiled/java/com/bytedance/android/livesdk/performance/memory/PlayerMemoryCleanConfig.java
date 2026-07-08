package com.bytedance.android.livesdk.performance.memory;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class PlayerMemoryCleanConfig {
    public static final TypeAdapter ADAPTER = new PlayerMemoryCleanConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("delayTime")
    public long delayTimeMs;

    @C09CT("is_enabled")
    public boolean isEnabled;

    @C09CT("lowMemoryRestrict")
    public boolean lowMemoryRestrict;

    @C09CT("optSlowMethod")
    public boolean optSlowMethod;

    @C09CT("policyInt")
    public int releaseType;

    public PlayerMemoryCleanConfig() {
        this(false, 30000L, false, false, 0);
    }

    public final long getDelayTimeMs() {
        return this.delayTimeMs;
    }

    public final boolean getLowMemoryRestrict() {
        return this.lowMemoryRestrict;
    }

    public final boolean getOptSlowMethod() {
        return this.optSlowMethod;
    }

    public final int getReleaseType() {
        return this.releaseType;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final void setDelayTimeMs(long j) {
        this.delayTimeMs = j;
    }

    public final void setEnabled(boolean z) {
        this.isEnabled = z;
    }

    public final void setLowMemoryRestrict(boolean z) {
        this.lowMemoryRestrict = z;
    }

    public final void setOptSlowMethod(boolean z) {
        this.optSlowMethod = z;
    }

    public final void setReleaseType(int i) {
        this.releaseType = i;
    }

    public PlayerMemoryCleanConfig(boolean z, long j, boolean z2, boolean z3, int i) {
        this.isEnabled = z;
        this.delayTimeMs = j;
        this.lowMemoryRestrict = z2;
        this.optSlowMethod = z3;
        this.releaseType = i;
    }
}
