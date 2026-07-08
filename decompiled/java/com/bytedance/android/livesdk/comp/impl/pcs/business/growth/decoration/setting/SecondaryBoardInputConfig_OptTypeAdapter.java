package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.setting;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class SecondaryBoardInputConfig_OptTypeAdapter extends TypeAdapter<SecondaryBoardInputConfig> {
    @Override // com.google.gson.TypeAdapter
    public final SecondaryBoardInputConfig read(C09CU c09cu) {
        SecondaryBoardInputConfig secondaryBoardInputConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            secondaryBoardInputConfig = new SecondaryBoardInputConfig(120, 12);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "word_limit")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        secondaryBoardInputConfig.wordLimit = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "desc_line_limit")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        secondaryBoardInputConfig.descLineLimit = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return secondaryBoardInputConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, SecondaryBoardInputConfig secondaryBoardInputConfig) {
        SecondaryBoardInputConfig secondaryBoardInputConfig2 = secondaryBoardInputConfig;
        if (secondaryBoardInputConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("word_limit");
        c09dl.LJJJJ(Integer.valueOf(secondaryBoardInputConfig2.wordLimit));
        c09dl.LJIILLIIL("desc_line_limit");
        c09dl.LJJJJ(Integer.valueOf(secondaryBoardInputConfig2.descLineLimit));
        c09dl.LJII();
    }
}
