package com.bytedance.android.livesdk.livesetting.rank;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes15.dex */
public final class ClassRankStarResConfig_OptTypeAdapter extends TypeAdapter<ClassRankStarResConfig> {
    public final Gson LIZ;

    public ClassRankStarResConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final ClassRankStarResConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        ClassRankStarResConfig classRankStarResConfig = new ClassRankStarResConfig(null, Boolean.FALSE, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != 672757583) {
                    if (iHashCode != 1641943670) {
                        if (iHashCode == 1677356300 && strLJJJJ.equals("live_class_rank_bottom_bar_star_image_config")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                classRankStarResConfig.classRankStarFileConfigList = C473040Igo.LIZ(this.LIZ, c09cu, ClassRankBottomStarImageFileConfig.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("live_class_rank_gecko_channel_name")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            classRankStarResConfig.classRankChannel = c09cu.LJJJZ();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("live_class_rank_download_gecko_channel")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        classRankStarResConfig.downloadClassRankGecko = (Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu);
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return classRankStarResConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, ClassRankStarResConfig classRankStarResConfig) {
        ClassRankStarResConfig classRankStarResConfig2 = classRankStarResConfig;
        if (classRankStarResConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("live_class_rank_gecko_channel_name");
        c09dl.LJJJJJ(classRankStarResConfig2.classRankChannel);
        c09dl.LJIILLIIL("live_class_rank_download_gecko_channel");
        c09dl.LJJJ(classRankStarResConfig2.downloadClassRankGecko);
        c09dl.LJIILLIIL("live_class_rank_bottom_bar_star_image_config");
        C473040Igo.LIZLLL(this.LIZ, c09dl, classRankStarResConfig2.classRankStarFileConfigList, ClassRankBottomStarImageFileConfig.class);
        c09dl.LJII();
    }
}
