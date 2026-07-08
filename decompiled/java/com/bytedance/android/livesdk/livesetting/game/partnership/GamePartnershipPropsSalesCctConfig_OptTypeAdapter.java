package com.bytedance.android.livesdk.livesetting.game.partnership;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class GamePartnershipPropsSalesCctConfig_OptTypeAdapter extends TypeAdapter<GamePartnershipPropsSalesCctConfig> {
    public final Gson LIZ;

    public GamePartnershipPropsSalesCctConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final GamePartnershipPropsSalesCctConfig read(C09CU c09cu) {
        GamePartnershipPropsSalesCctConfig gamePartnershipPropsSalesCctConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            gamePartnershipPropsSalesCctConfig = new GamePartnershipPropsSalesCctConfig(false);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                if (Intrinsics.LJFF(c09cu.LJJJJ(), "enable")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        gamePartnershipPropsSalesCctConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return gamePartnershipPropsSalesCctConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, GamePartnershipPropsSalesCctConfig gamePartnershipPropsSalesCctConfig) throws IOException {
        GamePartnershipPropsSalesCctConfig gamePartnershipPropsSalesCctConfig2 = gamePartnershipPropsSalesCctConfig;
        if (gamePartnershipPropsSalesCctConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(gamePartnershipPropsSalesCctConfig2.enable);
        c09dl.LJII();
    }
}
