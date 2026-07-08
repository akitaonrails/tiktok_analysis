package com.ss.lyrax.video;

import X.C09CT;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class TTLHScopeMonitorSettingsConfig {

    @C09CT("enable")
    public boolean enable;

    @C09CT("max_frames")
    public int maxFrames;

    @C09CT("offset_time")
    public long offsetTime;

    @C09CT("record_configs")
    public Map<Integer, Integer> recordConfigs;

    public TTLHScopeMonitorSettingsConfig() {
        this.recordConfigs = new HashMap();
    }

    public TTLHScopeMonitorSettingsConfig(boolean z, int i, long j, Map<Integer, Integer> map) {
        new HashMap();
        this.enable = z;
        this.maxFrames = i;
        this.offsetTime = j;
        this.recordConfigs = map;
    }
}
