package com.bytedance.android.livesdk.performance.memory;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes36.dex */
public final class MemoryOptConfig_OptTypeAdapter extends TypeAdapter<MemoryOptConfig> {
    public final Gson LIZ;

    public MemoryOptConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final MemoryOptConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        MemoryOptConfig memoryOptConfig = new MemoryOptConfig(false, false, 0, 0, 0);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1427373837:
                        if (strLJJJJ.equals("apm_buffer_adjust_size")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                memoryOptConfig.setOptedBufferSize(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -109284052:
                        if (strLJJJJ.equals("is_enabled")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                memoryOptConfig.setEnabled(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 706754657:
                        if (strLJJJJ.equals("low_mem_buffer_threshold")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                memoryOptConfig.setBufferThreshold(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1404747238:
                        if (strLJJJJ.equals("exit_clear_gift_cache")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                memoryOptConfig.setExitClearGiftCache(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2005515628:
                        if (strLJJJJ.equals("opt_event_deliver_size")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                memoryOptConfig.setOptCommonEventDeliverQueueSize(c09cu.LJJIZ());
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
        return memoryOptConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, MemoryOptConfig memoryOptConfig) throws IOException {
        MemoryOptConfig memoryOptConfig2 = memoryOptConfig;
        if (memoryOptConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("is_enabled");
        c09dl.LJJJJJL(memoryOptConfig2.isEnabled());
        c09dl.LJIILLIIL("exit_clear_gift_cache");
        c09dl.LJJJJJL(memoryOptConfig2.getExitClearGiftCache());
        c09dl.LJIILLIIL("apm_buffer_adjust_size");
        c09dl.LJJJJ(Integer.valueOf(memoryOptConfig2.getOptedBufferSize()));
        c09dl.LJIILLIIL("low_mem_buffer_threshold");
        c09dl.LJJJJ(Integer.valueOf(memoryOptConfig2.getBufferThreshold()));
        c09dl.LJIILLIIL("opt_event_deliver_size");
        c09dl.LJJJJ(Integer.valueOf(memoryOptConfig2.getOptCommonEventDeliverQueueSize()));
        c09dl.LJII();
    }
}
