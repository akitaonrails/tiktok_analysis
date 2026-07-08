package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.gift.GiftStickerComposerPreloadSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class GiftStickerComposerPreloadSetting_ComposerPreloadConfig_OptTypeAdapter extends TypeAdapter<GiftStickerComposerPreloadSetting.ComposerPreloadConfig> {
    public final Gson LIZ;

    public GiftStickerComposerPreloadSetting_ComposerPreloadConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final GiftStickerComposerPreloadSetting.ComposerPreloadConfig read(C09CU c09cu) {
        GiftStickerComposerPreloadSetting.ComposerPreloadConfig composerPreloadConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            composerPreloadConfig = new GiftStickerComposerPreloadSetting.ComposerPreloadConfig(false, 2);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "enable")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        composerPreloadConfig.isEnable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "preload_count")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        composerPreloadConfig.preloadCount = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return composerPreloadConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, GiftStickerComposerPreloadSetting.ComposerPreloadConfig composerPreloadConfig) throws IOException {
        GiftStickerComposerPreloadSetting.ComposerPreloadConfig composerPreloadConfig2 = composerPreloadConfig;
        if (composerPreloadConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(composerPreloadConfig2.isEnable);
        c09dl.LJIILLIIL("preload_count");
        c09dl.LJJJJ(Integer.valueOf(composerPreloadConfig2.preloadCount));
        c09dl.LJII();
    }
}
