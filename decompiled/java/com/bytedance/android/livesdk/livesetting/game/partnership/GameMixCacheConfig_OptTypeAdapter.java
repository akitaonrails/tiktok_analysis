package com.bytedance.android.livesdk.livesetting.game.partnership;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class GameMixCacheConfig_OptTypeAdapter extends TypeAdapter<GameMixCacheConfig> {
    public final Gson LIZ;

    public GameMixCacheConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final GameMixCacheConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        GameMixCacheConfig gameMixCacheConfig = new GameMixCacheConfig(null, null, 3, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "enable_scene")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    gameMixCacheConfig.enable = C473040Igo.LIZ(this.LIZ, c09cu, Integer.TYPE);
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "card_config")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    gameMixCacheConfig.cardConfig = C473040Igo.LIZ(this.LIZ, c09cu, GameMixCacheCardConfig.class);
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return gameMixCacheConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, GameMixCacheConfig gameMixCacheConfig) {
        GameMixCacheConfig gameMixCacheConfig2 = gameMixCacheConfig;
        if (gameMixCacheConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_scene");
        C473040Igo.LIZLLL(this.LIZ, c09dl, gameMixCacheConfig2.enable, Integer.TYPE);
        c09dl.LJIILLIIL("card_config");
        C473040Igo.LIZLLL(this.LIZ, c09dl, gameMixCacheConfig2.cardConfig, GameMixCacheCardConfig.class);
        c09dl.LJII();
    }
}
