package com.bytedance.android.livesdk.livesetting.game;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes15.dex */
public final class GameLiveClientInferConfig_OptTypeAdapter extends TypeAdapter<GameLiveClientInferConfig> {
    public final Gson LIZ;

    public GameLiveClientInferConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final GameLiveClientInferConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        GameLiveClientInferConfig gameLiveClientInferConfig = new GameLiveClientInferConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1312617901) {
                    if (iHashCode != -1068784020) {
                        if (iHashCode == 169269046 && strLJJJJ.equals("fusion_id")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameLiveClientInferConfig.fusionId = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("module")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            gameLiveClientInferConfig.module = c09cu.LJJJZ();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("is_open_debug")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        gameLiveClientInferConfig.isOpenDebug = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return gameLiveClientInferConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, GameLiveClientInferConfig gameLiveClientInferConfig) throws IOException {
        GameLiveClientInferConfig gameLiveClientInferConfig2 = gameLiveClientInferConfig;
        if (gameLiveClientInferConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("is_open_debug");
        c09dl.LJJJJJL(gameLiveClientInferConfig2.isOpenDebug);
        c09dl.LJIILLIIL("module");
        c09dl.LJJJJJ(gameLiveClientInferConfig2.module);
        c09dl.LJIILLIIL("fusion_id");
        c09dl.LJJJJJ(gameLiveClientInferConfig2.fusionId);
        c09dl.LJII();
    }
}
