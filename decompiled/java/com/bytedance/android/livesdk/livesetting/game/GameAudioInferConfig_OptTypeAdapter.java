package com.bytedance.android.livesdk.livesetting.game;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class GameAudioInferConfig_OptTypeAdapter extends TypeAdapter<GameAudioInferConfig> {
    @Override // com.google.gson.TypeAdapter
    public final GameAudioInferConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        GameAudioInferConfig gameAudioInferConfig = new GameAudioInferConfig(120000L, 3, 5L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1165918927) {
                    if (iHashCode != -1141367544) {
                        if (iHashCode == 2036423482 && strLJJJJ.equals("live_game_sound_effect_ring_buffer_max_cache_num")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameAudioInferConfig.ringBufferMaxCacheNum = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("live_game_sound_effect_model_download_timer")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            gameAudioInferConfig.modelDownLoadTimer = c09cu.LJJJ();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("live_game_sound_effect_interval_ignore_result_ms")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        gameAudioInferConfig.intervalIgnoreResultMs = c09cu.LJJJ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return gameAudioInferConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, GameAudioInferConfig gameAudioInferConfig) throws IOException {
        GameAudioInferConfig gameAudioInferConfig2 = gameAudioInferConfig;
        if (gameAudioInferConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("live_game_sound_effect_interval_ignore_result_ms");
        c09dl.LJJIZ(gameAudioInferConfig2.intervalIgnoreResultMs);
        c09dl.LJIILLIIL("live_game_sound_effect_ring_buffer_max_cache_num");
        c09dl.LJJJJ(Integer.valueOf(gameAudioInferConfig2.ringBufferMaxCacheNum));
        c09dl.LJIILLIIL("live_game_sound_effect_model_download_timer");
        c09dl.LJJIZ(gameAudioInferConfig2.modelDownLoadTimer);
        c09dl.LJII();
    }
}
