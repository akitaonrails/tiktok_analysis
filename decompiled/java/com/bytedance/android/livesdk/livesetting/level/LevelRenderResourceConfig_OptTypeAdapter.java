package com.bytedance.android.livesdk.livesetting.level;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LevelRenderResourceConfig_OptTypeAdapter extends TypeAdapter<LevelRenderResourceConfig> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LevelRenderResourceConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LevelRenderResourceConfig levelRenderResourceConfig = new LevelRenderResourceConfig(0L, 0L, "", "");
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1321694675:
                        if (strLJJJJ.equals("gecko_channel")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                levelRenderResourceConfig.geckoChannel = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -245486276:
                        if (strLJJJJ.equals("max_grade")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                levelRenderResourceConfig.maxGrade = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 526992298:
                        if (strLJJJJ.equals("min_grade")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                levelRenderResourceConfig.minGrade = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1358451596:
                        if (strLJJJJ.equals("render_effect_lynx_url")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                levelRenderResourceConfig.renderEffectLynxUrl = c09cu.LJJJZ();
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
        return levelRenderResourceConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LevelRenderResourceConfig levelRenderResourceConfig) throws IOException {
        LevelRenderResourceConfig levelRenderResourceConfig2 = levelRenderResourceConfig;
        if (levelRenderResourceConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("min_grade");
        c09dl.LJJIZ(levelRenderResourceConfig2.minGrade);
        c09dl.LJIILLIIL("max_grade");
        c09dl.LJJIZ(levelRenderResourceConfig2.maxGrade);
        c09dl.LJIILLIIL("render_effect_lynx_url");
        c09dl.LJJJJJ(levelRenderResourceConfig2.renderEffectLynxUrl);
        c09dl.LJIILLIIL("gecko_channel");
        c09dl.LJJJJJ(levelRenderResourceConfig2.geckoChannel);
        c09dl.LJII();
    }
}
