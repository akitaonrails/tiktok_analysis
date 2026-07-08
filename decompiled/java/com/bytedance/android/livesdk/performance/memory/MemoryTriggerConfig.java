package com.bytedance.android.livesdk.performance.memory;

import X.C09CT;
import X.C2097608Jq;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.google.gson.TypeAdapter;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes34.dex */
public final class MemoryTriggerConfig {
    public static final TypeAdapter ADAPTER = new MemoryTriggerConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("device_ram_critical_mb_tiers")
    public Map<String, Integer> deviceRamCriticalMBTiers;

    @C09CT("device_ram_low_mb_tiers")
    public Map<String, Integer> deviceRamLowMBTiers;

    @C09CT("gc_normal_interval_s")
    public int gcNormalIntervalS;

    @C09CT("is_enabled")
    public boolean isEnabled;

    @C09CT("java_heap_critical_mb_tiers")
    public Map<String, Integer> javaHeapCriticalMBTiers;

    @C09CT("java_heap_low_mb_tiers")
    public Map<String, Integer> javaHeapLowMBTiers;

    @C09CT("normal_interval_s")
    public int normalIntervalS;

    @C09CT("start_delay_ms")
    public long startDelayMs;

    public MemoryTriggerConfig() {
        this(false, 0L, null, null, null, null, 0, 0, 255, null);
    }

    public final Map<String, Integer> getDeviceRamCriticalMBTiers() {
        return this.deviceRamCriticalMBTiers;
    }

    public final Map<String, Integer> getDeviceRamLowMBTiers() {
        return this.deviceRamLowMBTiers;
    }

    public final int getGcNormalIntervalS() {
        return this.gcNormalIntervalS;
    }

    public final Map<String, Integer> getJavaHeapCriticalMBTiers() {
        return this.javaHeapCriticalMBTiers;
    }

    public final Map<String, Integer> getJavaHeapLowMBTiers() {
        return this.javaHeapLowMBTiers;
    }

    public final int getNormalIntervalS() {
        return this.normalIntervalS;
    }

    public final long getStartDelayMs() {
        return this.startDelayMs;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final void setDeviceRamCriticalMBTiers(Map<String, Integer> map) {
        this.deviceRamCriticalMBTiers = map;
    }

    public final void setDeviceRamLowMBTiers(Map<String, Integer> map) {
        this.deviceRamLowMBTiers = map;
    }

    public final void setEnabled(boolean z) {
        this.isEnabled = z;
    }

    public final void setGcNormalIntervalS(int i) {
        this.gcNormalIntervalS = i;
    }

    public final void setJavaHeapCriticalMBTiers(Map<String, Integer> map) {
        this.javaHeapCriticalMBTiers = map;
    }

    public final void setJavaHeapLowMBTiers(Map<String, Integer> map) {
        this.javaHeapLowMBTiers = map;
    }

    public final void setNormalIntervalS(int i) {
        this.normalIntervalS = i;
    }

    public final void setStartDelayMs(long j) {
        this.startDelayMs = j;
    }

    public MemoryTriggerConfig(boolean z, long j, Map<String, Integer> map, Map<String, Integer> map2, Map<String, Integer> map3, Map<String, Integer> map4, int i, int i2) {
        this.isEnabled = z;
        this.startDelayMs = j;
        this.javaHeapLowMBTiers = map;
        this.javaHeapCriticalMBTiers = map2;
        this.deviceRamLowMBTiers = map3;
        this.deviceRamCriticalMBTiers = map4;
        this.normalIntervalS = i;
        this.gcNormalIntervalS = i2;
    }

    public MemoryTriggerConfig(boolean z, long j, Map map, Map map2, Map map3, Map map4, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? 3000L : j, (i3 & 4) != 0 ? C2097608Jq.LJIIIIZZ(new Pair("138", 33), new Pair("266", 66), new Pair("522", 200)) : map, (i3 & 8) != 0 ? C2097608Jq.LJIIIIZZ(new Pair("138", 23), new Pair("266", 46), new Pair("522", 150)) : map2, (i3 & 16) != 0 ? C2097608Jq.LJIIIIZZ(new Pair("3.0", 1229), new Pair("4.0", 1515), new Pair("6.0", 2089), new Pair("8.0", 2621), new Pair("12.0", 3686)) : map3, (i3 & 32) != 0 ? C2097608Jq.LJIIIIZZ(new Pair("3.0", 1075), new Pair("4.0", 1352), new Pair("6.0", 1843), new Pair("8.0", 2294), new Pair("12.0", 3195)) : map4, (i3 & 64) != 0 ? DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL : i, (i3 & 128) != 0 ? 60 : i2);
    }
}
