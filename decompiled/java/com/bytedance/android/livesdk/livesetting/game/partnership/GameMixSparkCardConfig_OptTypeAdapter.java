package com.bytedance.android.livesdk.livesetting.game.partnership;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class GameMixSparkCardConfig_OptTypeAdapter extends TypeAdapter<GameMixSparkCardConfig> {
    public final Gson LIZ;

    public GameMixSparkCardConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final GameMixSparkCardConfig read(C09CU c09cu) {
        GameMixSparkCardConfig gameMixSparkCardConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            gameMixSparkCardConfig = new GameMixSparkCardConfig("", false);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "card_scheme")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        gameMixSparkCardConfig.cardScheme = c09cu.LJJJZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "enable")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        gameMixSparkCardConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return gameMixSparkCardConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, GameMixSparkCardConfig gameMixSparkCardConfig) throws IOException {
        GameMixSparkCardConfig gameMixSparkCardConfig2 = gameMixSparkCardConfig;
        if (gameMixSparkCardConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("card_scheme");
        c09dl.LJJJJJ(gameMixSparkCardConfig2.cardScheme);
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(gameMixSparkCardConfig2.enable);
        c09dl.LJII();
    }
}
