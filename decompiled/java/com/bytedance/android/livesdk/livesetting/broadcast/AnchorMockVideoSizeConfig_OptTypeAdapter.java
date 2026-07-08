package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class AnchorMockVideoSizeConfig_OptTypeAdapter extends TypeAdapter<AnchorMockVideoSizeConfig> {
    @Override // com.google.gson.TypeAdapter
    public final AnchorMockVideoSizeConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        AnchorMockVideoSizeConfig anchorMockVideoSizeConfig = new AnchorMockVideoSizeConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "width")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    anchorMockVideoSizeConfig.width = c09cu.LJJIZ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "height")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    anchorMockVideoSizeConfig.height = c09cu.LJJIZ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return anchorMockVideoSizeConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, AnchorMockVideoSizeConfig anchorMockVideoSizeConfig) {
        AnchorMockVideoSizeConfig anchorMockVideoSizeConfig2 = anchorMockVideoSizeConfig;
        if (anchorMockVideoSizeConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("width");
        c09dl.LJJJJ(Integer.valueOf(anchorMockVideoSizeConfig2.width));
        c09dl.LJIILLIIL("height");
        c09dl.LJJJJ(Integer.valueOf(anchorMockVideoSizeConfig2.height));
        c09dl.LJII();
    }
}
