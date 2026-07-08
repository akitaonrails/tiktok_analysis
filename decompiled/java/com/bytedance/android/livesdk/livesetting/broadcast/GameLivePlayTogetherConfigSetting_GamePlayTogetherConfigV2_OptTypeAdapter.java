package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.broadcast.GameLivePlayTogetherConfigSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class GameLivePlayTogetherConfigSetting_GamePlayTogetherConfigV2_OptTypeAdapter extends TypeAdapter<GameLivePlayTogetherConfigSetting.GamePlayTogetherConfigV2> {
    public final Gson LIZ;

    public GameLivePlayTogetherConfigSetting_GamePlayTogetherConfigV2_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final GameLivePlayTogetherConfigSetting.GamePlayTogetherConfigV2 read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        GameLivePlayTogetherConfigSetting.GamePlayTogetherConfigV2 gamePlayTogetherConfigV2 = new GameLivePlayTogetherConfigSetting.GamePlayTogetherConfigV2();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "business_version")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    gamePlayTogetherConfigV2.version = c09cu.LJJIZ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "enable_board")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    gamePlayTogetherConfigV2.enableBoard = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return gamePlayTogetherConfigV2;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, GameLivePlayTogetherConfigSetting.GamePlayTogetherConfigV2 gamePlayTogetherConfigV2) throws IOException {
        GameLivePlayTogetherConfigSetting.GamePlayTogetherConfigV2 gamePlayTogetherConfigV22 = gamePlayTogetherConfigV2;
        if (gamePlayTogetherConfigV22 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("business_version");
        c09dl.LJJJJ(Integer.valueOf(gamePlayTogetherConfigV22.version));
        c09dl.LJIILLIIL("enable_board");
        c09dl.LJJJJJL(gamePlayTogetherConfigV22.enableBoard);
        c09dl.LJII();
    }
}
