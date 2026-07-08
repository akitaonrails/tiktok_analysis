package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.model.CpuMemoryOptList;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_cpu_memory_opt")
public final class LiveCpuMemoryOptSetting {
    public static final LiveCpuMemoryOptSetting INSTANCE = new LiveCpuMemoryOptSetting();
    public static final CpuMemoryOptList DEFAULT = new CpuMemoryOptList();

    public final CpuMemoryOptList getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        CpuMemoryOptList cpuMemoryOptList = DEFAULT;
        CpuMemoryOptList cpuMemoryOptList2 = (CpuMemoryOptList) settingsManager.getValueSafely("live_cpu_memory_opt", cpuMemoryOptList);
        return cpuMemoryOptList2 != null ? cpuMemoryOptList2 : cpuMemoryOptList;
    }
}
