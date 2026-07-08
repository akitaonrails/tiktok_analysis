package com.ss.android.ugc.aweme.im.strategy.storage.adapters;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.PreshownStickerConfigResolvingResult;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.PreshownStickerSceneConfig;
import java.io.IOException;

/* JADX INFO: loaded from: classes15.dex */
public final class PreshownStickerConfigResolvingResultTypeAdapter extends TypeAdapter<PreshownStickerConfigResolvingResult> {
    public final Gson LIZ;

    public PreshownStickerConfigResolvingResultTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final PreshownStickerConfigResolvingResult read(C09CU c09cu) throws IOException {
        c09cu.LIZIZ();
        PreshownStickerSceneConfig preshownStickerSceneConfig = null;
        boolean zLJJ = false;
        int iLJJIZ = 0;
        String strLJJJZ = null;
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1354792126:
                        if (strLJJJJ.equals("config")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                preshownStickerSceneConfig = (PreshownStickerSceneConfig) this.LIZ.LJIIJ(PreshownStickerSceneConfig.class).read(c09cu);
                            }
                        }
                        break;
                    case -350327708:
                        if (strLJJJJ.equals("resetted")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                zLJJ = c09cu.LJJ();
                            }
                        }
                        break;
                    case 17328488:
                        if (strLJJJJ.equals("config_name")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                strLJJJZ = c09cu.LJJJZ();
                            }
                        }
                        break;
                    case 271332087:
                        if (strLJJJJ.equals("resetted_score")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                iLJJIZ = c09cu.LJJIZ();
                            }
                        }
                        break;
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        PreshownStickerConfigResolvingResult preshownStickerConfigResolvingResult = new PreshownStickerConfigResolvingResult(zLJJ, iLJJIZ, preshownStickerSceneConfig);
        preshownStickerConfigResolvingResult.setConfigName(strLJJJZ);
        return preshownStickerConfigResolvingResult;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, PreshownStickerConfigResolvingResult preshownStickerConfigResolvingResult) throws IOException {
        PreshownStickerConfigResolvingResult preshownStickerConfigResolvingResult2 = preshownStickerConfigResolvingResult;
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("config_name");
        c09dl.LJJJJJ(preshownStickerConfigResolvingResult2.getConfigName());
        c09dl.LJIILLIIL("resetted");
        c09dl.LJJJJJL(preshownStickerConfigResolvingResult2.getResetted());
        c09dl.LJIILLIIL("resetted_score");
        c09dl.LJJJJ(Integer.valueOf(preshownStickerConfigResolvingResult2.getResettedScore()));
        c09dl.LJIILLIIL("config");
        if (preshownStickerConfigResolvingResult2.getConfig() == null) {
            c09dl.LJIJJ();
        } else {
            this.LIZ.LJIIJ(PreshownStickerSceneConfig.class).write(c09dl, preshownStickerConfigResolvingResult2.getConfig());
        }
        c09dl.LJII();
    }
}
