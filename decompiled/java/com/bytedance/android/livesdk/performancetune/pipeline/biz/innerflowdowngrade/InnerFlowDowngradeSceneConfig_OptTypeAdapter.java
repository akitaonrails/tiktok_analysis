package com.bytedance.android.livesdk.performancetune.pipeline.biz.innerflowdowngrade;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.bytedance.android.livesdk.performancetune.strategy.model.CommonDecisionConfig;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class InnerFlowDowngradeSceneConfig_OptTypeAdapter extends TypeAdapter<InnerFlowDowngradeSceneConfig> {
    public final Gson LIZ;

    public InnerFlowDowngradeSceneConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final InnerFlowDowngradeSceneConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        InnerFlowDowngradeSceneConfig innerFlowDowngradeSceneConfig = new InnerFlowDowngradeSceneConfig(false, false, 15L, 2L, 2, new ArrayList(), new CommonDecisionConfig(1, "", "", "", "", new ArrayList(), new ArrayList()), new CommonDecisionConfig(1, "", "", "", "", new ArrayList(), new ArrayList()), new ArrayList(), 0L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1882875923:
                        if (strLJJJJ.equals("passive_decision_config")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                innerFlowDowngradeSceneConfig.passiveDecisionConfig = (CommonDecisionConfig) this.LIZ.LJIIJ(CommonDecisionConfig.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                innerFlowDowngradeSceneConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1014220718:
                        if (strLJJJJ.equals("perf_fetch_interval_sec")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                innerFlowDowngradeSceneConfig.perfFetchIntervalSec = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -836266503:
                        if (strLJJJJ.equals("warmup_perf_fetch_delay_sec")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                innerFlowDowngradeSceneConfig.warmupPerfFetchIntervalSec = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -141955619:
                        if (strLJJJJ.equals("ignore_level_changed_biz_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                innerFlowDowngradeSceneConfig.ignoreLevelChangedBizList = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 393515118:
                        if (strLJJJJ.equals("enable_new_strategy")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                innerFlowDowngradeSceneConfig.enableNewStrategy = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 642457883:
                        if (strLJJJJ.equals("delay_clear_downgrade_status_ms")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                innerFlowDowngradeSceneConfig.delayClearDowngradeStatusMs = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 836512852:
                        if (strLJJJJ.equals("active_decision_biz_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                innerFlowDowngradeSceneConfig.activeDecisionBizList = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 941951436:
                        if (strLJJJJ.equals("active_decision_config")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                innerFlowDowngradeSceneConfig.activeDecisionConfig = (CommonDecisionConfig) this.LIZ.LJIIJ(CommonDecisionConfig.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1113714945:
                        if (strLJJJJ.equals("perf_score_cache_size")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                innerFlowDowngradeSceneConfig.perfScoreCacheSize = c09cu.LJJIZ();
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
        return innerFlowDowngradeSceneConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, InnerFlowDowngradeSceneConfig innerFlowDowngradeSceneConfig) throws IOException {
        InnerFlowDowngradeSceneConfig innerFlowDowngradeSceneConfig2 = innerFlowDowngradeSceneConfig;
        if (innerFlowDowngradeSceneConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(innerFlowDowngradeSceneConfig2.enable);
        c09dl.LJIILLIIL("enable_new_strategy");
        c09dl.LJJJJJL(innerFlowDowngradeSceneConfig2.enableNewStrategy);
        c09dl.LJIILLIIL("perf_fetch_interval_sec");
        c09dl.LJJIZ(innerFlowDowngradeSceneConfig2.perfFetchIntervalSec);
        c09dl.LJIILLIIL("warmup_perf_fetch_delay_sec");
        c09dl.LJJIZ(innerFlowDowngradeSceneConfig2.warmupPerfFetchIntervalSec);
        c09dl.LJIILLIIL("perf_score_cache_size");
        c09dl.LJJJJ(Integer.valueOf(innerFlowDowngradeSceneConfig2.perfScoreCacheSize));
        c09dl.LJIILLIIL("active_decision_biz_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, innerFlowDowngradeSceneConfig2.activeDecisionBizList, String.class);
        c09dl.LJIILLIIL("passive_decision_config");
        TypeAdapter typeAdapterLJIIJ = this.LIZ.LJIIJ(CommonDecisionConfig.class);
        typeAdapterLJIIJ.write(c09dl, innerFlowDowngradeSceneConfig2.passiveDecisionConfig);
        c09dl.LJIILLIIL("active_decision_config");
        typeAdapterLJIIJ.write(c09dl, innerFlowDowngradeSceneConfig2.activeDecisionConfig);
        c09dl.LJIILLIIL("ignore_level_changed_biz_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, innerFlowDowngradeSceneConfig2.ignoreLevelChangedBizList, String.class);
        c09dl.LJIILLIIL("delay_clear_downgrade_status_ms");
        c09dl.LJJIZ(innerFlowDowngradeSceneConfig2.delayClearDowngradeStatusMs);
        c09dl.LJII();
    }
}
