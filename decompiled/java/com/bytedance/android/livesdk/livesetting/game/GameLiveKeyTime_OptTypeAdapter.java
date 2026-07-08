package com.bytedance.android.livesdk.livesetting.game;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes32.dex */
public final class GameLiveKeyTime_OptTypeAdapter extends TypeAdapter<GameLiveKeyTime> {
    public final Gson LIZ;

    public GameLiveKeyTime_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final GameLiveKeyTime read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        GameLiveKeyTime gameLiveKeyTime = new GameLiveKeyTime();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2088854479:
                        if (strLJJJJ.equals("model_score_enemy_threshold")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameLiveKeyTime.modelScoreEnemyThreshold = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -2010309475:
                        if (strLJJJJ.equals("model_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameLiveKeyTime.modelOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1250798107:
                        if (strLJJJJ.equals("highlight_report_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameLiveKeyTime.highlightReportInterval = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1076765733:
                        if (strLJJJJ.equals("model_score_self_threshold")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameLiveKeyTime.modelScoreSelfThreshold = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1000188165:
                        if (strLJJJJ.equals("model_score_victory_threshold")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameLiveKeyTime.modelScoreVictoryThreshold = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -554815431:
                        if (strLJJJJ.equals("recognition_games")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameLiveKeyTime.recognitionGames = (Long[]) this.LIZ.LJIIJ(Long[].class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -397682323:
                        if (strLJJJJ.equals("model_score_kill_threshold")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameLiveKeyTime.modelScoreKillThreshold = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -302557548:
                        if (strLJJJJ.equals("game_keytime_get_server_result_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameLiveKeyTime.serverInferInterval = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -223783064:
                        if (strLJJJJ.equals("function_switcher")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameLiveKeyTime.functionSwitcher = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -214510991:
                        if (strLJJJJ.equals("model_score_teammate_threshold")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameLiveKeyTime.modelScoreTeammateThreshold = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -101047864:
                        if (strLJJJJ.equals("deployment_id_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameLiveKeyTime.deploymentIdList = C473040Igo.LIZ(this.LIZ, c09cu, Integer.TYPE);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -3302535:
                        if (strLJJJJ.equals("screenshot_max_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameLiveKeyTime.screenshotMaxInterval = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 521603354:
                        if (strLJJJJ.equals("cost_report_switcher")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameLiveKeyTime.costReportSwitcher = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 750448403:
                        if (strLJJJJ.equals("enable_moment_sei_send")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameLiveKeyTime.enableMomentSeiSend = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1018393139:
                        if (strLJJJJ.equals("model_offload_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameLiveKeyTime.modelOffloadOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1085621314:
                        if (strLJJJJ.equals("model_score_defeat_threshold")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameLiveKeyTime.modelScoreDefeatThreshold = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1125853993:
                        if (strLJJJJ.equals("model_fusion_tag_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameLiveKeyTime.modelFusionTagOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1398939979:
                        if (strLJJJJ.equals("model_offload_to_cloud_inference")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameLiveKeyTime.modelOffloadToCloudInference = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1897580373:
                        if (strLJJJJ.equals("max_report_task")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameLiveKeyTime.maxReportTask = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1930083717:
                        if (strLJJJJ.equals("recognition_fusion_ids")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameLiveKeyTime.recognitionFusionIds = (Long[]) this.LIZ.LJIIJ(Long[].class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2145403774:
                        if (strLJJJJ.equals("screenshot_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameLiveKeyTime.screenshotInterval = c09cu.LJJJ();
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
        return gameLiveKeyTime;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, GameLiveKeyTime gameLiveKeyTime) throws IOException {
        GameLiveKeyTime gameLiveKeyTime2 = gameLiveKeyTime;
        if (gameLiveKeyTime2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("model_score_kill_threshold");
        c09dl.LJJJJ(Float.valueOf(gameLiveKeyTime2.modelScoreKillThreshold));
        c09dl.LJIILLIIL("model_score_victory_threshold");
        c09dl.LJJJJ(Float.valueOf(gameLiveKeyTime2.modelScoreVictoryThreshold));
        c09dl.LJIILLIIL("model_score_defeat_threshold");
        c09dl.LJJJJ(Float.valueOf(gameLiveKeyTime2.modelScoreDefeatThreshold));
        c09dl.LJIILLIIL("model_score_self_threshold");
        c09dl.LJJJJ(Float.valueOf(gameLiveKeyTime2.modelScoreSelfThreshold));
        c09dl.LJIILLIIL("model_score_teammate_threshold");
        c09dl.LJJJJ(Float.valueOf(gameLiveKeyTime2.modelScoreTeammateThreshold));
        c09dl.LJIILLIIL("model_score_enemy_threshold");
        c09dl.LJJJJ(Float.valueOf(gameLiveKeyTime2.modelScoreEnemyThreshold));
        c09dl.LJIILLIIL("screenshot_interval");
        c09dl.LJJIZ(gameLiveKeyTime2.screenshotInterval);
        c09dl.LJIILLIIL("function_switcher");
        c09dl.LJJJJJL(gameLiveKeyTime2.functionSwitcher);
        c09dl.LJIILLIIL("max_report_task");
        c09dl.LJJJJ(Integer.valueOf(gameLiveKeyTime2.maxReportTask));
        c09dl.LJIILLIIL("screenshot_max_interval");
        c09dl.LJJIZ(gameLiveKeyTime2.screenshotMaxInterval);
        c09dl.LJIILLIIL("cost_report_switcher");
        c09dl.LJJJJJL(gameLiveKeyTime2.costReportSwitcher);
        c09dl.LJIILLIIL("recognition_games");
        TypeAdapter typeAdapterLJIIJ = this.LIZ.LJIIJ(Long[].class);
        typeAdapterLJIIJ.write(c09dl, gameLiveKeyTime2.recognitionGames);
        c09dl.LJIILLIIL("recognition_fusion_ids");
        typeAdapterLJIIJ.write(c09dl, gameLiveKeyTime2.recognitionFusionIds);
        c09dl.LJIILLIIL("highlight_report_interval");
        c09dl.LJJIZ(gameLiveKeyTime2.highlightReportInterval);
        c09dl.LJIILLIIL("enable_moment_sei_send");
        c09dl.LJJJJJL(gameLiveKeyTime2.enableMomentSeiSend);
        c09dl.LJIILLIIL("model_offload_opt");
        c09dl.LJJJJJL(gameLiveKeyTime2.modelOffloadOpt);
        c09dl.LJIILLIIL("model_offload_to_cloud_inference");
        c09dl.LJJJJJL(gameLiveKeyTime2.modelOffloadToCloudInference);
        c09dl.LJIILLIIL("model_opt");
        c09dl.LJJJJJL(gameLiveKeyTime2.modelOpt);
        c09dl.LJIILLIIL("model_fusion_tag_opt");
        c09dl.LJJJJJL(gameLiveKeyTime2.modelFusionTagOpt);
        c09dl.LJIILLIIL("game_keytime_get_server_result_interval");
        c09dl.LJJIZ(gameLiveKeyTime2.serverInferInterval);
        c09dl.LJIILLIIL("deployment_id_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, gameLiveKeyTime2.deploymentIdList, Integer.TYPE);
        c09dl.LJII();
    }
}
