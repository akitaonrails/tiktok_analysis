package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class FlyingGiftConfig_OptTypeAdapter extends TypeAdapter<FlyingGiftConfig> {
    public final Gson LIZ;

    public FlyingGiftConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final FlyingGiftConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        FlyingGiftConfig flyingGiftConfig = new FlyingGiftConfig(null, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "gift_id")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    flyingGiftConfig.giftId = Long.valueOf(c09cu.LJJJ());
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "path_configs")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    flyingGiftConfig.configs = C473040Igo.LIZ(this.LIZ, c09cu, FlyingGiftPathConfig.class);
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return flyingGiftConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, FlyingGiftConfig flyingGiftConfig) {
        FlyingGiftConfig flyingGiftConfig2 = flyingGiftConfig;
        if (flyingGiftConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("gift_id");
        c09dl.LJJJJ(flyingGiftConfig2.giftId);
        c09dl.LJIILLIIL("path_configs");
        C473040Igo.LIZLLL(this.LIZ, c09dl, flyingGiftConfig2.configs, FlyingGiftPathConfig.class);
        c09dl.LJII();
    }
}
