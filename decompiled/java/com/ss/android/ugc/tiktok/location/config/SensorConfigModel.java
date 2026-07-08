package com.ss.android.ugc.tiktok.location.config;

import X.C08CX;
import X.C09CT;
import X.C2097608Jq;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes28.dex */
public final class SensorConfigModel {

    @C09CT("batch_size")
    public final int batchSize;

    @C09CT("batch_timeout")
    public final long batchTimeout;

    @C09CT("enabled")
    public final boolean enabled;

    @C09CT("enabled_regions")
    public final Set<String> enabledRegions;

    @C09CT("enabled_sensors")
    public final Map<String, String> enabledSensors;

    @C09CT("required_permission_level")
    public final int requiredPermissionLevel;

    @C09CT("sample_rate")
    public final int sampleRate;

    @C09CT("with_gps")
    public final boolean withGps;

    public SensorConfigModel() {
        this(false, false, 0, null, null, 0, 0L, 0, 255, null);
    }

    public SensorConfigModel(boolean z, boolean z2, int i, Set<String> set, Map<String, String> map, int i2, long j, int i3) {
        this.withGps = z;
        this.enabled = z2;
        this.requiredPermissionLevel = i;
        this.enabledRegions = set;
        this.enabledSensors = map;
        this.batchSize = i2;
        this.batchTimeout = j;
        this.sampleRate = i3;
    }

    public SensorConfigModel(boolean z, boolean z2, int i, Set set, Map map, int i2, long j, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? false : z, (i4 & 2) == 0 ? z2 : false, (i4 & 4) != 0 ? 2 : i, (i4 & 8) != 0 ? C08CX.INSTANCE : set, (i4 & 16) != 0 ? C2097608Jq.LJ() : map, (i4 & 32) != 0 ? 5 : i2, (i4 & 64) != 0 ? 500L : j, (i4 & 128) == 0 ? i3 : 2);
    }
}
