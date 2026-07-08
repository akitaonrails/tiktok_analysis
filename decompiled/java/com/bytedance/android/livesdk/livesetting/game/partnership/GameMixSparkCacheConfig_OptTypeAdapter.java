package com.bytedance.android.livesdk.livesetting.game.partnership;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class GameMixSparkCacheConfig_OptTypeAdapter extends TypeAdapter<GameMixSparkCacheConfig> {
    public final Gson LIZ;

    public GameMixSparkCacheConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final GameMixSparkCacheConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        GameMixSparkCacheConfig gameMixSparkCacheConfig = new GameMixSparkCacheConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            if (Intrinsics.LJFF(c09cu.LJJJJ(), "card_config")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    gameMixSparkCacheConfig.cardConfig = C473040Igo.LIZ(this.LIZ, c09cu, GameMixSparkCardConfig.class);
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return gameMixSparkCacheConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, GameMixSparkCacheConfig gameMixSparkCacheConfig) {
        GameMixSparkCacheConfig gameMixSparkCacheConfig2 = gameMixSparkCacheConfig;
        if (gameMixSparkCacheConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("card_config");
        C473040Igo.LIZLLL(this.LIZ, c09dl, gameMixSparkCacheConfig2.cardConfig, GameMixSparkCardConfig.class);
        c09dl.LJII();
    }
}
