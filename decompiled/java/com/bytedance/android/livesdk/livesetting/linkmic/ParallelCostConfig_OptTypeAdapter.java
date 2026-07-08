package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes34.dex */
public final class ParallelCostConfig_OptTypeAdapter extends TypeAdapter<ParallelCostConfig> {
    public final Gson LIZ;

    public ParallelCostConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final ParallelCostConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        ParallelCostConfig parallelCostConfig = new ParallelCostConfig(0, -1, null, null, null, null, null, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1995057119:
                        if (strLJJJJ.equals("p95_low")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                parallelCostConfig.setP95Low((PullSceneConfig) this.LIZ.LJIIJ(PullSceneConfig.class).read(c09cu));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1717353867:
                        if (strLJJJJ.equals("p95_high")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                parallelCostConfig.setP95High((PullSceneConfig) this.LIZ.LJIIJ(PullSceneConfig.class).read(c09cu));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                parallelCostConfig.setEnable(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 717530805:
                        if (strLJJJJ.equals("not_p95_low")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                parallelCostConfig.setNotP95Low((PullSceneConfig) this.LIZ.LJIIJ(PullSceneConfig.class).read(c09cu));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 768493153:
                        if (strLJJJJ.equals("not_p95_high")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                parallelCostConfig.setNotP95High((PullSceneConfig) this.LIZ.LJIIJ(PullSceneConfig.class).read(c09cu));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1347944299:
                        if (strLJJJJ.equals("p95_strategy_fail_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                parallelCostConfig.setP95StrategyFailOpt(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1425492987:
                        if (strLJJJJ.equals("p95_high_possible")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                parallelCostConfig.setP95HighPossible((PullSceneConfig) this.LIZ.LJIIJ(PullSceneConfig.class).read(c09cu));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1544803905:
                        if (strLJJJJ.equals("default")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                parallelCostConfig.setDefault((PullSceneConfig) this.LIZ.LJIIJ(PullSceneConfig.class).read(c09cu));
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
        return parallelCostConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, ParallelCostConfig parallelCostConfig) {
        ParallelCostConfig parallelCostConfig2 = parallelCostConfig;
        if (parallelCostConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJ(Integer.valueOf(parallelCostConfig2.getEnable()));
        c09dl.LJIILLIIL("p95_strategy_fail_opt");
        c09dl.LJJJJ(Integer.valueOf(parallelCostConfig2.getP95StrategyFailOpt()));
        c09dl.LJIILLIIL("p95_low");
        TypeAdapter typeAdapterLJIIJ = this.LIZ.LJIIJ(PullSceneConfig.class);
        typeAdapterLJIIJ.write(c09dl, parallelCostConfig2.getP95Low());
        c09dl.LJIILLIIL("p95_high_possible");
        typeAdapterLJIIJ.write(c09dl, parallelCostConfig2.getP95HighPossible());
        c09dl.LJIILLIIL("p95_high");
        typeAdapterLJIIJ.write(c09dl, parallelCostConfig2.getP95High());
        c09dl.LJIILLIIL("not_p95_high");
        typeAdapterLJIIJ.write(c09dl, parallelCostConfig2.getNotP95High());
        c09dl.LJIILLIIL("not_p95_low");
        typeAdapterLJIIJ.write(c09dl, parallelCostConfig2.getNotP95Low());
        c09dl.LJIILLIIL("default");
        typeAdapterLJIIJ.write(c09dl, parallelCostConfig2.getDefault());
        c09dl.LJII();
    }
}
