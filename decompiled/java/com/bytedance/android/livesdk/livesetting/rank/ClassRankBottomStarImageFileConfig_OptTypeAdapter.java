package com.bytedance.android.livesdk.livesetting.rank;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class ClassRankBottomStarImageFileConfig_OptTypeAdapter extends TypeAdapter<ClassRankBottomStarImageFileConfig> {
    @Override // com.google.gson.TypeAdapter
    public final ClassRankBottomStarImageFileConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        ClassRankBottomStarImageFileConfig classRankBottomStarImageFileConfig = new ClassRankBottomStarImageFileConfig(0, "", "");
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1739409398) {
                    if (iHashCode != 1100735846) {
                        if (iHashCode == 2026828202 && strLJJJJ.equals("dark_star_file_name")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                classRankBottomStarImageFileConfig.darkStarFileName = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("class_rank_type")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            classRankBottomStarImageFileConfig.classRankType = c09cu.LJJIZ();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("light_star_file_name")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        classRankBottomStarImageFileConfig.lightStarFileName = c09cu.LJJJZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return classRankBottomStarImageFileConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, ClassRankBottomStarImageFileConfig classRankBottomStarImageFileConfig) {
        ClassRankBottomStarImageFileConfig classRankBottomStarImageFileConfig2 = classRankBottomStarImageFileConfig;
        if (classRankBottomStarImageFileConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("class_rank_type");
        c09dl.LJJJJ(Integer.valueOf(classRankBottomStarImageFileConfig2.classRankType));
        c09dl.LJIILLIIL("light_star_file_name");
        c09dl.LJJJJJ(classRankBottomStarImageFileConfig2.lightStarFileName);
        c09dl.LJIILLIIL("dark_star_file_name");
        c09dl.LJJJJJ(classRankBottomStarImageFileConfig2.darkStarFileName);
        c09dl.LJII();
    }
}
