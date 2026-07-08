package com.bytedance.android.livesdk.livesetting.level;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class BarrageGradeResConfig_OptTypeAdapter extends TypeAdapter<BarrageGradeResConfig> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final BarrageGradeResConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        BarrageGradeResConfig barrageGradeResConfig = new BarrageGradeResConfig(0, "", "", "", "", 1000L, "", "");
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2104692050:
                        if (strLJJJJ.equals("barrage_beam")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                barrageGradeResConfig.beam = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1662941595:
                        if (strLJJJJ.equals("effect_format")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                barrageGradeResConfig.effectFormat = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1321694675:
                        if (strLJJJJ.equals("gecko_channel")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                barrageGradeResConfig.barrageChannel = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -852641555:
                        if (strLJJJJ.equals("barrage_background")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                barrageGradeResConfig.background = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 98615255:
                        if (strLJJJJ.equals("grade")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                barrageGradeResConfig.level = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 782319637:
                        if (strLJJJJ.equals("barrage_ribbon")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                barrageGradeResConfig.ribbon = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1370914818:
                        if (strLJJJJ.equals("anim_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                barrageGradeResConfig.animDuration = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1601523424:
                        if (strLJJJJ.equals("barrage_webp_animation")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                barrageGradeResConfig.barrageWebp = c09cu.LJJJZ();
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
        return barrageGradeResConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, BarrageGradeResConfig barrageGradeResConfig) throws IOException {
        BarrageGradeResConfig barrageGradeResConfig2 = barrageGradeResConfig;
        if (barrageGradeResConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("grade");
        c09dl.LJJJJ(Integer.valueOf(barrageGradeResConfig2.level));
        c09dl.LJIILLIIL("barrage_background");
        c09dl.LJJJJJ(barrageGradeResConfig2.background);
        c09dl.LJIILLIIL("barrage_ribbon");
        c09dl.LJJJJJ(barrageGradeResConfig2.ribbon);
        c09dl.LJIILLIIL("barrage_beam");
        c09dl.LJJJJJ(barrageGradeResConfig2.beam);
        c09dl.LJIILLIIL("barrage_webp_animation");
        c09dl.LJJJJJ(barrageGradeResConfig2.barrageWebp);
        c09dl.LJIILLIIL("anim_duration");
        c09dl.LJJIZ(barrageGradeResConfig2.animDuration);
        c09dl.LJIILLIIL("effect_format");
        c09dl.LJJJJJ(barrageGradeResConfig2.effectFormat);
        c09dl.LJIILLIIL("gecko_channel");
        c09dl.LJJJJJ(barrageGradeResConfig2.barrageChannel);
        c09dl.LJII();
    }
}
