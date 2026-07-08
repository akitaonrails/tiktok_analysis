package com.bytedance.android.livesdk.livesetting.game;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes32.dex */
public final class GameRestConfig_OptTypeAdapter extends TypeAdapter<GameRestConfig> {
    public final Gson LIZ;

    public GameRestConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final GameRestConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        GameRestConfig gameRestConfig = new GameRestConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -722641605:
                        if (strLJJJJ.equals("game_rest_screenshot_max_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameRestConfig.screenshotMaxInterval = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -554815431:
                        if (strLJJJJ.equals("recognition_games")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameRestConfig.recognitionGames = (Long[]) this.LIZ.LJIIJ(Long[].class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -248215539:
                        if (strLJJJJ.equals("game_rest_screenshot_min_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameRestConfig.screenshotMinInterval = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 69604010:
                        if (strLJJJJ.equals("game_rest_function_switcher")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameRestConfig.enableFunction = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 318045106:
                        if (strLJJJJ.equals("game_rest_get_server_result_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameRestConfig.serverInferInterval = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1192998954:
                        if (strLJJJJ.equals("game_rest_model_score_threshold")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameRestConfig.scoreThreshold = (Float[]) this.LIZ.LJIIJ(Float[].class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1586874814:
                        if (strLJJJJ.equals("recognition_game_tags")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameRestConfig.recognitionGameTags = (Long[]) this.LIZ.LJIIJ(Long[].class).read(c09cu);
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
        return gameRestConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, GameRestConfig gameRestConfig) throws IOException {
        GameRestConfig gameRestConfig2 = gameRestConfig;
        if (gameRestConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("game_rest_screenshot_max_interval");
        c09dl.LJJIZ(gameRestConfig2.screenshotMaxInterval);
        c09dl.LJIILLIIL("game_rest_screenshot_min_interval");
        c09dl.LJJIZ(gameRestConfig2.screenshotMinInterval);
        c09dl.LJIILLIIL("game_rest_get_server_result_interval");
        c09dl.LJJIZ(gameRestConfig2.serverInferInterval);
        c09dl.LJIILLIIL("game_rest_model_score_threshold");
        this.LIZ.LJIIJ(Float[].class).write(c09dl, gameRestConfig2.scoreThreshold);
        c09dl.LJIILLIIL("game_rest_function_switcher");
        c09dl.LJJJJJL(gameRestConfig2.enableFunction);
        c09dl.LJIILLIIL("recognition_games");
        TypeAdapter typeAdapterLJIIJ = this.LIZ.LJIIJ(Long[].class);
        typeAdapterLJIIJ.write(c09dl, gameRestConfig2.recognitionGames);
        c09dl.LJIILLIIL("recognition_game_tags");
        typeAdapterLJIIJ.write(c09dl, gameRestConfig2.recognitionGameTags);
        c09dl.LJII();
    }
}
