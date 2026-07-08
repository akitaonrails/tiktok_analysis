package com.bytedance.android.livesdk.comp.api.pcs.infra.preloadengine.config;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class PreloadStrategyConfig_OptTypeAdapter extends TypeAdapter<PreloadStrategyConfig> {
    public final Gson LIZ;

    public PreloadStrategyConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final PreloadStrategyConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        PreloadStrategyConfig preloadStrategyConfig = new PreloadStrategyConfig("", "", Boolean.FALSE, Boolean.FALSE, "", Boolean.FALSE, null, 100);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1970831469:
                        if (strLJJJJ.equals("strategy_key")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                preloadStrategyConfig.strategyKey = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1107317197:
                        if (strLJJJJ.equals("skip_strategy")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                preloadStrategyConfig.skipStrategy = (Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1057380978:
                        if (strLJJJJ.equals("strategy_config")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                preloadStrategyConfig.strategyConfig = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -615653076:
                        if (strLJJJJ.equals("preload_action")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                preloadStrategyConfig.preloadAction = (PreloadActionConfig) this.LIZ.LJIIJ(PreloadActionConfig.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 270940796:
                        if (strLJJJJ.equals("disabled")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                preloadStrategyConfig.disable = (Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 609256293:
                        if (strLJJJJ.equals("precheck_key")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                preloadStrategyConfig.preCheckKey = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 746261101:
                        if (strLJJJJ.equals("report_sampling_rate")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                preloadStrategyConfig.reportSamplingRate = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2082238608:
                        if (strLJJJJ.equals("is_sync")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                preloadStrategyConfig.isSync = (Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu);
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
        return preloadStrategyConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, PreloadStrategyConfig preloadStrategyConfig) {
        PreloadStrategyConfig preloadStrategyConfig2 = preloadStrategyConfig;
        if (preloadStrategyConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("strategy_key");
        c09dl.LJJJJJ(preloadStrategyConfig2.strategyKey);
        c09dl.LJIILLIIL("strategy_config");
        c09dl.LJJJJJ(preloadStrategyConfig2.strategyConfig);
        c09dl.LJIILLIIL("is_sync");
        c09dl.LJJJ(preloadStrategyConfig2.isSync);
        c09dl.LJIILLIIL("disabled");
        c09dl.LJJJ(preloadStrategyConfig2.disable);
        c09dl.LJIILLIIL("precheck_key");
        c09dl.LJJJJJ(preloadStrategyConfig2.preCheckKey);
        c09dl.LJIILLIIL("skip_strategy");
        c09dl.LJJJ(preloadStrategyConfig2.skipStrategy);
        c09dl.LJIILLIIL("preload_action");
        this.LIZ.LJIIJ(PreloadActionConfig.class).write(c09dl, preloadStrategyConfig2.preloadAction);
        c09dl.LJIILLIIL("report_sampling_rate");
        c09dl.LJJJJ(Integer.valueOf(preloadStrategyConfig2.reportSamplingRate));
        c09dl.LJII();
    }
}
