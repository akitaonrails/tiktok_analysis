package com.bytedance.android.livesdk.livesetting.level;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LevelRenderEffectConfig_OptTypeAdapter extends TypeAdapter<LevelRenderEffectConfig> {
    public final Gson LIZ;

    public LevelRenderEffectConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LevelRenderEffectConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LevelRenderEffectConfig levelRenderEffectConfig = new LevelRenderEffectConfig(0, 0, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1977570122) {
                    if (iHashCode != -1797086000) {
                        if (iHashCode == -265320256 && strLJJJJ.equals("render_barrage_effect_source_config")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                levelRenderEffectConfig.renderBarrageResConfigList = C473040Igo.LIZ(this.LIZ, c09cu, LevelRenderResourceConfig.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("play_end_exceed_duration")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            levelRenderEffectConfig.playEndExceedDuration = c09cu.LJJIZ();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("first_frame_time_out_duration")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        levelRenderEffectConfig.firstFrameTimeoutDuration = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return levelRenderEffectConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LevelRenderEffectConfig levelRenderEffectConfig) {
        LevelRenderEffectConfig levelRenderEffectConfig2 = levelRenderEffectConfig;
        if (levelRenderEffectConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("first_frame_time_out_duration");
        c09dl.LJJJJ(Integer.valueOf(levelRenderEffectConfig2.firstFrameTimeoutDuration));
        c09dl.LJIILLIIL("play_end_exceed_duration");
        c09dl.LJJJJ(Integer.valueOf(levelRenderEffectConfig2.playEndExceedDuration));
        c09dl.LJIILLIIL("render_barrage_effect_source_config");
        C473040Igo.LIZLLL(this.LIZ, c09dl, levelRenderEffectConfig2.renderBarrageResConfigList, LevelRenderResourceConfig.class);
        c09dl.LJII();
    }
}
