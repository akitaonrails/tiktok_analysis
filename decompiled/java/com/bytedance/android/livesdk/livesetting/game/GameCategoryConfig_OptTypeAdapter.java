package com.bytedance.android.livesdk.livesetting.game;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes36.dex */
public final class GameCategoryConfig_OptTypeAdapter extends TypeAdapter<GameCategoryConfig> {
    public final Gson LIZ;

    public GameCategoryConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final GameCategoryConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        GameCategoryConfig gameCategoryConfig = new GameCategoryConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1281102013:
                        if (strLJJJJ.equals("complexity_high")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameCategoryConfig.setComplexityHigh((long[]) this.LIZ.LJIIJ(long[].class).read(c09cu));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -672419243:
                        if (strLJJJJ.equals("business_low")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameCategoryConfig.setBusinessLow((long[]) this.LIZ.LJIIJ(long[].class).read(c09cu));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -318416493:
                        if (strLJJJJ.equals("complexity_low")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameCategoryConfig.setComplexityLow((long[]) this.LIZ.LJIIJ(long[].class).read(c09cu));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 40664258:
                        if (strLJJJJ.equals("business_default")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameCategoryConfig.setBusinessDefault((long[]) this.LIZ.LJIIJ(long[].class).read(c09cu));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 398742784:
                        if (strLJJJJ.equals("complexity_default")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameCategoryConfig.setComplexityDefault((long[]) this.LIZ.LJIIJ(long[].class).read(c09cu));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 629714625:
                        if (strLJJJJ.equals("business_high")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameCategoryConfig.setBusinessHigh((long[]) this.LIZ.LJIIJ(long[].class).read(c09cu));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return gameCategoryConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, GameCategoryConfig gameCategoryConfig) {
        GameCategoryConfig gameCategoryConfig2 = gameCategoryConfig;
        if (gameCategoryConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("complexity_low");
        TypeAdapter typeAdapterLJIIJ = this.LIZ.LJIIJ(long[].class);
        typeAdapterLJIIJ.write(c09dl, gameCategoryConfig2.getComplexityLow());
        c09dl.LJIILLIIL("complexity_default");
        typeAdapterLJIIJ.write(c09dl, gameCategoryConfig2.getComplexityDefault());
        c09dl.LJIILLIIL("complexity_high");
        typeAdapterLJIIJ.write(c09dl, gameCategoryConfig2.getComplexityHigh());
        c09dl.LJIILLIIL("business_low");
        typeAdapterLJIIJ.write(c09dl, gameCategoryConfig2.getBusinessLow());
        c09dl.LJIILLIIL("business_default");
        typeAdapterLJIIJ.write(c09dl, gameCategoryConfig2.getBusinessDefault());
        c09dl.LJIILLIIL("business_high");
        typeAdapterLJIIJ.write(c09dl, gameCategoryConfig2.getBusinessHigh());
        c09dl.LJII();
    }
}
