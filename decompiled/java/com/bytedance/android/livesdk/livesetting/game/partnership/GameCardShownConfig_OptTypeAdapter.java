package com.bytedance.android.livesdk.livesetting.game.partnership;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class GameCardShownConfig_OptTypeAdapter extends TypeAdapter<GameCardShownConfig> {
    public final Gson LIZ;

    public GameCardShownConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final GameCardShownConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        GameCardShownConfig gameCardShownConfig = new GameCardShownConfig(false, 0L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "enable")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    gameCardShownConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "delay_time")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    gameCardShownConfig.delayTime = c09cu.LJJJ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return gameCardShownConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, GameCardShownConfig gameCardShownConfig) throws IOException {
        GameCardShownConfig gameCardShownConfig2 = gameCardShownConfig;
        if (gameCardShownConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(gameCardShownConfig2.enable);
        c09dl.LJIILLIIL("delay_time");
        c09dl.LJJIZ(gameCardShownConfig2.delayTime);
        c09dl.LJII();
    }
}
