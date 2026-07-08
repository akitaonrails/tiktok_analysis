package com.bytedance.android.livesdk.livesetting.rank;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.rank.LiveCreatorRankingEntranceIntegrationSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public final class LiveCreatorRankingEntranceIntegrationSetting_Config_OptTypeAdapter extends TypeAdapter<LiveCreatorRankingEntranceIntegrationSetting.Config> {
    public final Gson LIZ;

    public LiveCreatorRankingEntranceIntegrationSetting_Config_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveCreatorRankingEntranceIntegrationSetting.Config read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveCreatorRankingEntranceIntegrationSetting.Config config = new LiveCreatorRankingEntranceIntegrationSetting.Config();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -844403371:
                        if (strLJJJJ.equals("game_ranking_loop_rule_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.gameRankingLoopRuleOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -726209979:
                        if (strLJJJJ.equals("loop_interval_ms")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.loopIntervalMs = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -208971850:
                        if (strLJJJJ.equals("text_size_adapt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.textAdapt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 430683229:
                        if (strLJJJJ.equals("perf_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.perfOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 912220983:
                        if (strLJJJJ.equals("unified_entrance_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.unifiedEntranceOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1768821751:
                        if (strLJJJJ.equals("cache_icon_res")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.perfIconCacheOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return config;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveCreatorRankingEntranceIntegrationSetting.Config config) throws IOException {
        LiveCreatorRankingEntranceIntegrationSetting.Config config2 = config;
        if (config2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("text_size_adapt");
        c09dl.LJJJJJL(config2.textAdapt);
        c09dl.LJIILLIIL("unified_entrance_opt");
        c09dl.LJJJJJL(true);
        c09dl.LJIILLIIL("game_ranking_loop_rule_opt");
        c09dl.LJJJJJL(config2.gameRankingLoopRuleOpt);
        c09dl.LJIILLIIL("loop_interval_ms");
        c09dl.LJJIZ(config2.loopIntervalMs);
        c09dl.LJIILLIIL("perf_opt");
        c09dl.LJJJJJL(config2.perfOpt);
        c09dl.LJIILLIIL("cache_icon_res");
        c09dl.LJJJJJL(config2.perfIconCacheOpt);
        c09dl.LJII();
    }
}
