package com.bytedance.android.livesdk.performance.memory;

import X.C01GW;
import X.C13LP;
import X.C2327809Ae;
import X.C452501pT;
import Y.AComparatorS24S0000000_5;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS224S0000000_33;

/* JADX INFO: loaded from: classes34.dex */
@SettingsKey("live_host_memory_trigger_setting")
public final class MemoryTriggerSetting {
    public static Long deviceRamCriticalMBCached;
    public static Long deviceRamLowMBCached;
    public static Long javaHeapCriticalMBCached;
    public static Long javaHeapLowMBCached;
    public static final MemoryTriggerSetting INSTANCE = new MemoryTriggerSetting();
    public static final MemoryTriggerConfig DEFAULT = new MemoryTriggerConfig(false, 0, null, null, null, null, 0, 0, 255, null);
    public static final C01GW normalIntervalMs$delegate = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(49));
    public static final C01GW gcNormalIntervalMs$delegate = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(48));

    public static final long getStartDelayMs() {
        return INSTANCE.getConfig().getStartDelayMs();
    }

    public static final boolean isEnabled() {
        return INSTANCE.getConfig().isEnabled();
    }

    public final MemoryTriggerConfig getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        MemoryTriggerConfig memoryTriggerConfig = DEFAULT;
        MemoryTriggerConfig memoryTriggerConfig2 = (MemoryTriggerConfig) settingsManager.getValueSafely("live_host_memory_trigger_setting", memoryTriggerConfig);
        return memoryTriggerConfig2 != null ? memoryTriggerConfig2 : memoryTriggerConfig;
    }

    public final long getGcNormalIntervalMs() {
        return ((Number) gcNormalIntervalMs$delegate.getValue()).longValue();
    }

    public final long getNormalIntervalMs() {
        return ((Number) normalIntervalMs$delegate.getValue()).longValue();
    }

    public static final long getCacheDeviceRamCriticalMB(long j) {
        Long l = deviceRamCriticalMBCached;
        if (l != null) {
            return l.longValue();
        }
        MemoryTriggerSetting memoryTriggerSetting = INSTANCE;
        long jResolveThreshold = memoryTriggerSetting.resolveThreshold(memoryTriggerSetting.getConfig().getDeviceRamCriticalMBTiers(), j, DEFAULT.getDeviceRamCriticalMBTiers(), 1073741824L);
        deviceRamCriticalMBCached = Long.valueOf(jResolveThreshold);
        return jResolveThreshold;
    }

    public static final long getCacheDeviceRamLowMB(long j) {
        Long l = deviceRamLowMBCached;
        if (l != null) {
            return l.longValue();
        }
        MemoryTriggerSetting memoryTriggerSetting = INSTANCE;
        long jResolveThreshold = memoryTriggerSetting.resolveThreshold(memoryTriggerSetting.getConfig().getDeviceRamLowMBTiers(), j, DEFAULT.getDeviceRamLowMBTiers(), 1073741824L);
        deviceRamLowMBCached = Long.valueOf(jResolveThreshold);
        return jResolveThreshold;
    }

    public static final long getCacheJavaHeapCriticalMB(long j) {
        MemoryTriggerSetting memoryTriggerSetting = INSTANCE;
        return memoryTriggerSetting.resolveThreshold(memoryTriggerSetting.getConfig().getJavaHeapCriticalMBTiers(), j, DEFAULT.getJavaHeapCriticalMBTiers(), 1048576L);
    }

    public static final long getCacheJavaHeapLowMB(long j) {
        MemoryTriggerSetting memoryTriggerSetting = INSTANCE;
        return memoryTriggerSetting.resolveThreshold(memoryTriggerSetting.getConfig().getJavaHeapLowMBTiers(), j, DEFAULT.getJavaHeapLowMBTiers(), 1048576L);
    }

    private final long resolveThreshold(Map<String, Integer> map, long j, Map<String, Integer> map2, long j2) {
        int iIntValue;
        float fFloatValue;
        Object obj = null;
        if (map != null && (!map.isEmpty())) {
            map2 = map;
        }
        List listLJLLLL = C13LP.LJLLLL(new AComparatorS24S0000000_5(9), map2.entrySet());
        Iterator it2 = listLJLLLL.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            Float fLJIIIIZZ = C2327809Ae.LJIIIIZZ((String) ((Map.Entry) next).getKey());
            if (fLJIIIIZZ != null) {
                fFloatValue = fLJIIIIZZ.floatValue();
            } else {
                fFloatValue = 0.0f;
            }
            if (((long) (fFloatValue * j2)) >= j) {
                obj = next;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            iIntValue = ((Number) entry.getValue()).intValue();
        } else {
            iIntValue = ((Number) ((Map.Entry) C13LP.LJJLIIIJJI(listLJLLLL)).getValue()).intValue();
        }
        return iIntValue;
    }
}
