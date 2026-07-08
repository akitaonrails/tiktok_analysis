package com.bytedance.android.livesdk.livesetting;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class PublicScreenBadgeConfig_OptTypeAdapter extends TypeAdapter<PublicScreenBadgeConfig> {
    @Override // com.google.gson.TypeAdapter
    public final PublicScreenBadgeConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        PublicScreenBadgeConfig publicScreenBadgeConfig = new PublicScreenBadgeConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "height")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    publicScreenBadgeConfig.height = c09cu.LJJIZ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "typography_name")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    publicScreenBadgeConfig.typographyName = c09cu.LJJIZ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return publicScreenBadgeConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, PublicScreenBadgeConfig publicScreenBadgeConfig) {
        PublicScreenBadgeConfig publicScreenBadgeConfig2 = publicScreenBadgeConfig;
        if (publicScreenBadgeConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("height");
        c09dl.LJJJJ(Integer.valueOf(publicScreenBadgeConfig2.height));
        c09dl.LJIILLIIL("typography_name");
        c09dl.LJJJJ(Integer.valueOf(publicScreenBadgeConfig2.typographyName));
        c09dl.LJII();
    }
}
