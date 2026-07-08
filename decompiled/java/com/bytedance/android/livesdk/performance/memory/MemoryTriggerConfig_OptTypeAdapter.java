package com.bytedance.android.livesdk.performance.memory;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public final class MemoryTriggerConfig_OptTypeAdapter extends TypeAdapter<MemoryTriggerConfig> {
    public final Gson LIZ;

    public MemoryTriggerConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final MemoryTriggerConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        MemoryTriggerConfig memoryTriggerConfig = new MemoryTriggerConfig(false, 0L, null, null, null, null, 0, 0, 255, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1831312067:
                        if (strLJJJJ.equals("device_ram_critical_mb_tiers")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                memoryTriggerConfig.setDeviceRamCriticalMBTiers(C473040Igo.LIZIZ(this.LIZ, c09cu, Integer.TYPE));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1778552452:
                        if (strLJJJJ.equals("device_ram_low_mb_tiers")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                memoryTriggerConfig.setDeviceRamLowMBTiers(C473040Igo.LIZIZ(this.LIZ, c09cu, Integer.TYPE));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1451630305:
                        if (strLJJJJ.equals("start_delay_ms")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                memoryTriggerConfig.setStartDelayMs(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -967848248:
                        if (strLJJJJ.equals("java_heap_low_mb_tiers")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                memoryTriggerConfig.setJavaHeapLowMBTiers(C473040Igo.LIZIZ(this.LIZ, c09cu, Integer.TYPE));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -728490706:
                        if (strLJJJJ.equals("gc_normal_interval_s")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                memoryTriggerConfig.setGcNormalIntervalS(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -109284052:
                        if (strLJJJJ.equals("is_enabled")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                memoryTriggerConfig.setEnabled(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -98011279:
                        if (strLJJJJ.equals("java_heap_critical_mb_tiers")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                memoryTriggerConfig.setJavaHeapCriticalMBTiers(C473040Igo.LIZIZ(this.LIZ, c09cu, Integer.TYPE));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 661661137:
                        if (strLJJJJ.equals("normal_interval_s")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                memoryTriggerConfig.setNormalIntervalS(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return memoryTriggerConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, MemoryTriggerConfig memoryTriggerConfig) throws IOException {
        MemoryTriggerConfig memoryTriggerConfig2 = memoryTriggerConfig;
        if (memoryTriggerConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("is_enabled");
        c09dl.LJJJJJL(memoryTriggerConfig2.isEnabled());
        c09dl.LJIILLIIL("start_delay_ms");
        c09dl.LJJIZ(memoryTriggerConfig2.getStartDelayMs());
        c09dl.LJIILLIIL("java_heap_low_mb_tiers");
        Gson gson = this.LIZ;
        Map<String, Integer> javaHeapLowMBTiers = memoryTriggerConfig2.getJavaHeapLowMBTiers();
        Class cls = Integer.TYPE;
        C473040Igo.LJ(gson, c09dl, javaHeapLowMBTiers, cls);
        c09dl.LJIILLIIL("java_heap_critical_mb_tiers");
        C473040Igo.LJ(this.LIZ, c09dl, memoryTriggerConfig2.getJavaHeapCriticalMBTiers(), cls);
        c09dl.LJIILLIIL("device_ram_low_mb_tiers");
        C473040Igo.LJ(this.LIZ, c09dl, memoryTriggerConfig2.getDeviceRamLowMBTiers(), cls);
        c09dl.LJIILLIIL("device_ram_critical_mb_tiers");
        C473040Igo.LJ(this.LIZ, c09dl, memoryTriggerConfig2.getDeviceRamCriticalMBTiers(), cls);
        c09dl.LJIILLIIL("normal_interval_s");
        c09dl.LJJJJ(Integer.valueOf(memoryTriggerConfig2.getNormalIntervalS()));
        c09dl.LJIILLIIL("gc_normal_interval_s");
        c09dl.LJJJJ(Integer.valueOf(memoryTriggerConfig2.getGcNormalIntervalS()));
        c09dl.LJII();
    }
}
