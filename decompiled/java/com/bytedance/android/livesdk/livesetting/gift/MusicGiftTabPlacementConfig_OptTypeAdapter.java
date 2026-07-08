package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class MusicGiftTabPlacementConfig_OptTypeAdapter extends TypeAdapter<MusicGiftTabPlacementConfig> {
    @Override // com.google.gson.TypeAdapter
    public final MusicGiftTabPlacementConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        MusicGiftTabPlacementConfig musicGiftTabPlacementConfig = new MusicGiftTabPlacementConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "first_exposure_threshold")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    musicGiftTabPlacementConfig.firstExposureThreshold = c09cu.LJJIZ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "second_exposure_threshold")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    musicGiftTabPlacementConfig.secondExposureThreshold = c09cu.LJJIZ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return musicGiftTabPlacementConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, MusicGiftTabPlacementConfig musicGiftTabPlacementConfig) {
        MusicGiftTabPlacementConfig musicGiftTabPlacementConfig2 = musicGiftTabPlacementConfig;
        if (musicGiftTabPlacementConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("first_exposure_threshold");
        c09dl.LJJJJ(Integer.valueOf(musicGiftTabPlacementConfig2.firstExposureThreshold));
        c09dl.LJIILLIIL("second_exposure_threshold");
        c09dl.LJJJJ(Integer.valueOf(musicGiftTabPlacementConfig2.secondExposureThreshold));
        c09dl.LJII();
    }
}
