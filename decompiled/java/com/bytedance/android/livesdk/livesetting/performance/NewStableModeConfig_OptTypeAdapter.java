package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes15.dex */
public final class NewStableModeConfig_OptTypeAdapter extends TypeAdapter<NewStableModeConfig> {
    public final Gson LIZ;

    public NewStableModeConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final NewStableModeConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        NewStableModeConfig newStableModeConfig = new NewStableModeConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1651746327:
                        if (strLJJJJ.equals("function_available_mask")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                newStableModeConfig.functionAvailableMask = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1449303943:
                        if (strLJJJJ.equals("delay_init_ms")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                newStableModeConfig.delayInitMs = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                newStableModeConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -966148137:
                        if (strLJJJJ.equals("strategy_name")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                newStableModeConfig.strategyName = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -650393208:
                        if (strLJJJJ.equals("default_open")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                newStableModeConfig.defaultOpen = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 879149811:
                        if (strLJJJJ.equals("heavy_threshold")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                newStableModeConfig.heavyThreshold = c09cu.LJJIZ();
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
        return newStableModeConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, NewStableModeConfig newStableModeConfig) throws IOException {
        NewStableModeConfig newStableModeConfig2 = newStableModeConfig;
        if (newStableModeConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(newStableModeConfig2.enable);
        c09dl.LJIILLIIL("default_open");
        c09dl.LJJJJJL(newStableModeConfig2.defaultOpen);
        c09dl.LJIILLIIL("heavy_threshold");
        c09dl.LJJJJ(Integer.valueOf(newStableModeConfig2.heavyThreshold));
        c09dl.LJIILLIIL("function_available_mask");
        c09dl.LJJJJ(Integer.valueOf(newStableModeConfig2.functionAvailableMask));
        c09dl.LJIILLIIL("strategy_name");
        c09dl.LJJJJJ(newStableModeConfig2.strategyName);
        c09dl.LJIILLIIL("delay_init_ms");
        c09dl.LJJIZ(newStableModeConfig2.delayInitMs);
        c09dl.LJII();
    }
}
