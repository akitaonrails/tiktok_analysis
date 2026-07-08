package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class SkinGiftBubbleConfig_OptTypeAdapter extends TypeAdapter<SkinGiftBubbleConfig> {
    public final Gson LIZ;

    public SkinGiftBubbleConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final SkinGiftBubbleConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        SkinGiftBubbleConfig skinGiftBubbleConfig = new SkinGiftBubbleConfig(false, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "enable")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    skinGiftBubbleConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "gifts")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    skinGiftBubbleConfig.gifts = C473040Igo.LIZ(this.LIZ, c09cu, SkinGiftConfig.class);
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return skinGiftBubbleConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, SkinGiftBubbleConfig skinGiftBubbleConfig) throws IOException {
        SkinGiftBubbleConfig skinGiftBubbleConfig2 = skinGiftBubbleConfig;
        if (skinGiftBubbleConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(skinGiftBubbleConfig2.enable);
        c09dl.LJIILLIIL("gifts");
        C473040Igo.LIZLLL(this.LIZ, c09dl, skinGiftBubbleConfig2.gifts, SkinGiftConfig.class);
        c09dl.LJII();
    }
}
