package com.ss.lyrax.video;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes21.dex */
public class EffectSequenceCacheConfig implements Serializable {

    @C09CT("cache_memory_max")
    public int cacheMaxSize;

    @C09CT("cache_memory_min")
    public int cacheMinSize;

    @C09CT("cache_memory_normal")
    public int cacheNormalSize;

    @C09CT("device_memory_critical")
    public int deviceCriticalMemorySize;

    @C09CT("device_memory_low")
    public int deviceLowMemorySize;

    @C09CT("device_memory_normal")
    public int deviceNormalMemorySize;

    @C09CT("enable")
    public boolean enable;

    public EffectSequenceCacheConfig() {
        this.enable = true;
        this.deviceCriticalMemorySize = 134217728;
        this.deviceLowMemorySize = 268435456;
        this.deviceNormalMemorySize = 536870912;
        this.cacheMinSize = 31457280;
        this.cacheNormalSize = 52428800;
        this.cacheMaxSize = 104857600;
    }

    public boolean getEnable() {
        return this.enable;
    }

    public EffectSequenceCacheConfig(boolean z, int i, int i2, int i3, int i4, int i5, int i6) {
        this.enable = z;
        this.deviceCriticalMemorySize = i;
        this.deviceLowMemorySize = i2;
        this.deviceNormalMemorySize = i3;
        this.cacheMinSize = i4;
        this.cacheNormalSize = i5;
        this.cacheMaxSize = i6;
    }
}
