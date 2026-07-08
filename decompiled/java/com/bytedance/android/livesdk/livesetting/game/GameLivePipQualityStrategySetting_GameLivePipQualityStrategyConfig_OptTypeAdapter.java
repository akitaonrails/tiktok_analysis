package com.bytedance.android.livesdk.livesetting.game;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.game.GameLivePipQualityStrategySetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class GameLivePipQualityStrategySetting_GameLivePipQualityStrategyConfig_OptTypeAdapter extends TypeAdapter<GameLivePipQualityStrategySetting.GameLivePipQualityStrategyConfig> {
    public final Gson LIZ;

    public GameLivePipQualityStrategySetting_GameLivePipQualityStrategyConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final GameLivePipQualityStrategySetting.GameLivePipQualityStrategyConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        GameLivePipQualityStrategySetting.GameLivePipQualityStrategyConfig gameLivePipQualityStrategyConfig = new GameLivePipQualityStrategySetting.GameLivePipQualityStrategyConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -889473228:
                        if (strLJJJJ.equals("switch")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameLivePipQualityStrategyConfig.f28switch = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -50205978:
                        if (strLJJJJ.equals("include_auto")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameLivePipQualityStrategyConfig.includeAuto = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 95467907:
                        if (strLJJJJ.equals("delay")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameLivePipQualityStrategyConfig.delay = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 570418373:
                        if (strLJJJJ.equals("interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameLivePipQualityStrategyConfig.interval = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1787798387:
                        if (strLJJJJ.equals("strategy")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameLivePipQualityStrategyConfig.strategy = c09cu.LJJJZ();
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
        return gameLivePipQualityStrategyConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, GameLivePipQualityStrategySetting.GameLivePipQualityStrategyConfig gameLivePipQualityStrategyConfig) throws IOException {
        GameLivePipQualityStrategySetting.GameLivePipQualityStrategyConfig gameLivePipQualityStrategyConfig2 = gameLivePipQualityStrategyConfig;
        if (gameLivePipQualityStrategyConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("switch");
        c09dl.LJJJJJL(gameLivePipQualityStrategyConfig2.f28switch);
        c09dl.LJIILLIIL("include_auto");
        c09dl.LJJJJJL(gameLivePipQualityStrategyConfig2.includeAuto);
        c09dl.LJIILLIIL("strategy");
        c09dl.LJJJJJ(gameLivePipQualityStrategyConfig2.strategy);
        c09dl.LJIILLIIL("delay");
        c09dl.LJJIZ(gameLivePipQualityStrategyConfig2.delay);
        c09dl.LJIILLIIL("interval");
        c09dl.LJJIZ(gameLivePipQualityStrategyConfig2.interval);
        c09dl.LJII();
    }
}
