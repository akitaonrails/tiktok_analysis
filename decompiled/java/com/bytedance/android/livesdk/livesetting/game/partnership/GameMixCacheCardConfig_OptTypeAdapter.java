package com.bytedance.android.livesdk.livesetting.game.partnership;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class GameMixCacheCardConfig_OptTypeAdapter extends TypeAdapter<GameMixCacheCardConfig> {
    public final Gson LIZ;

    public GameMixCacheCardConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final GameMixCacheCardConfig read(C09CU c09cu) {
        GameMixCacheCardConfig gameMixCacheCardConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            gameMixCacheCardConfig = new GameMixCacheCardConfig("", false);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "card_class")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        gameMixCacheCardConfig.cardClass = c09cu.LJJJZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "enable")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        gameMixCacheCardConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return gameMixCacheCardConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, GameMixCacheCardConfig gameMixCacheCardConfig) throws IOException {
        GameMixCacheCardConfig gameMixCacheCardConfig2 = gameMixCacheCardConfig;
        if (gameMixCacheCardConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("card_class");
        c09dl.LJJJJJ(gameMixCacheCardConfig2.cardClass);
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(gameMixCacheCardConfig2.enable);
        c09dl.LJII();
    }
}
