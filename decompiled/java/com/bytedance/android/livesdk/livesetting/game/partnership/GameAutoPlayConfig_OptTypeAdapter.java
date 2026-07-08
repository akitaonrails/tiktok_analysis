package com.bytedance.android.livesdk.livesetting.game.partnership;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class GameAutoPlayConfig_OptTypeAdapter extends TypeAdapter<GameAutoPlayConfig> {
    public final Gson LIZ;

    public GameAutoPlayConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final GameAutoPlayConfig read(C09CU c09cu) {
        GameAutoPlayConfig gameAutoPlayConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            gameAutoPlayConfig = new GameAutoPlayConfig(false, false);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "enable_live")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        gameAutoPlayConfig.enableLive = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "enable_video")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        gameAutoPlayConfig.enableVideo = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return gameAutoPlayConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, GameAutoPlayConfig gameAutoPlayConfig) throws IOException {
        GameAutoPlayConfig gameAutoPlayConfig2 = gameAutoPlayConfig;
        if (gameAutoPlayConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_live");
        c09dl.LJJJJJL(gameAutoPlayConfig2.enableLive);
        c09dl.LJIILLIIL("enable_video");
        c09dl.LJJJJJL(gameAutoPlayConfig2.enableVideo);
        c09dl.LJII();
    }
}
