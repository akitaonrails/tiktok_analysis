package com.bytedance.android.livesdk.game.broadcast.bgbroadcast.internalrecord;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public final class GameInternalRecordDetectConfig_OptTypeAdapter extends TypeAdapter<GameInternalRecordDetectConfig> {
    public final Gson LIZ;

    public GameInternalRecordDetectConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final GameInternalRecordDetectConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        GameInternalRecordDetectConfig gameInternalRecordDetectConfig = new GameInternalRecordDetectConfig(30000L, new long[]{60000, 120000, 180000, 240000, 300000}, new String[]{""});
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -2059657648) {
                    if (iHashCode != -546805945) {
                        if (iHashCode == 382021708 && strLJJJJ.equals("pause_gradient_ms")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameInternalRecordDetectConfig.setPauseGradientMs((long[]) this.LIZ.LJIIJ(long[].class).read(c09cu));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("silent_duration_ms")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            gameInternalRecordDetectConfig.setSilentDurationMs(c09cu.LJJJ());
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("excluded_game_names")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        gameInternalRecordDetectConfig.setExcludedGameNames((String[]) this.LIZ.LJIIJ(String[].class).read(c09cu));
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return gameInternalRecordDetectConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, GameInternalRecordDetectConfig gameInternalRecordDetectConfig) throws IOException {
        GameInternalRecordDetectConfig gameInternalRecordDetectConfig2 = gameInternalRecordDetectConfig;
        if (gameInternalRecordDetectConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("silent_duration_ms");
        c09dl.LJJIZ(gameInternalRecordDetectConfig2.getSilentDurationMs());
        c09dl.LJIILLIIL("pause_gradient_ms");
        this.LIZ.LJIIJ(long[].class).write(c09dl, gameInternalRecordDetectConfig2.getPauseGradientMs());
        c09dl.LJIILLIIL("excluded_game_names");
        this.LIZ.LJIIJ(String[].class).write(c09dl, gameInternalRecordDetectConfig2.getExcludedGameNames());
        c09dl.LJII();
    }
}
