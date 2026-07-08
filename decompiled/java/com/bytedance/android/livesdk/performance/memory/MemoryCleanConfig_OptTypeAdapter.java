package com.bytedance.android.livesdk.performance.memory;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class MemoryCleanConfig_OptTypeAdapter extends TypeAdapter<MemoryCleanConfig> {
    public final Gson LIZ;

    public MemoryCleanConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final MemoryCleanConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        MemoryCleanConfig memoryCleanConfig = new MemoryCleanConfig(false, null, 0L, false, false, 31, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1262297706:
                        if (strLJJJJ.equals("threshold_config")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                memoryCleanConfig.setThresholds(C473040Igo.LIZIZ(this.LIZ, c09cu, Integer.TYPE));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -560883684:
                        if (strLJJJJ.equals("do_exit_clean")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                memoryCleanConfig.setDoExitClear(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -109284052:
                        if (strLJJJJ.equals("is_enabled")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                memoryCleanConfig.setEnabled(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 570418373:
                        if (strLJJJJ.equals("interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                memoryCleanConfig.setInterval(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1320439001:
                        if (strLJJJJ.equals("is_need_yield")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                memoryCleanConfig.setNeedYield(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
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
        return memoryCleanConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, MemoryCleanConfig memoryCleanConfig) throws IOException {
        MemoryCleanConfig memoryCleanConfig2 = memoryCleanConfig;
        if (memoryCleanConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("is_enabled");
        c09dl.LJJJJJL(memoryCleanConfig2.isEnabled());
        c09dl.LJIILLIIL("threshold_config");
        C473040Igo.LJ(this.LIZ, c09dl, memoryCleanConfig2.getThresholds(), Integer.TYPE);
        c09dl.LJIILLIIL("interval");
        c09dl.LJJIZ(memoryCleanConfig2.getInterval());
        c09dl.LJIILLIIL("is_need_yield");
        c09dl.LJJJJJL(memoryCleanConfig2.isNeedYield());
        c09dl.LJIILLIIL("do_exit_clean");
        c09dl.LJJJJJL(memoryCleanConfig2.getDoExitClear());
        c09dl.LJII();
    }
}
