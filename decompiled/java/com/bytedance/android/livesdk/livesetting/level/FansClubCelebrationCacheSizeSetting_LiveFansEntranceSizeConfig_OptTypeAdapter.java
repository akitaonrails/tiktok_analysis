package com.bytedance.android.livesdk.livesetting.level;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.level.FansClubCelebrationCacheSizeSetting;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class FansClubCelebrationCacheSizeSetting_LiveFansEntranceSizeConfig_OptTypeAdapter extends TypeAdapter<FansClubCelebrationCacheSizeSetting.LiveFansEntranceSizeConfig> {
    @Override // com.google.gson.TypeAdapter
    public final FansClubCelebrationCacheSizeSetting.LiveFansEntranceSizeConfig read(C09CU c09cu) {
        FansClubCelebrationCacheSizeSetting.LiveFansEntranceSizeConfig liveFansEntranceSizeConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            liveFansEntranceSizeConfig = new FansClubCelebrationCacheSizeSetting.LiveFansEntranceSizeConfig(0, 0);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "save_max_size")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveFansEntranceSizeConfig.saveMaxSize = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "save_recently_max_size")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveFansEntranceSizeConfig.recentlyMaxSize = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return liveFansEntranceSizeConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, FansClubCelebrationCacheSizeSetting.LiveFansEntranceSizeConfig liveFansEntranceSizeConfig) {
        FansClubCelebrationCacheSizeSetting.LiveFansEntranceSizeConfig liveFansEntranceSizeConfig2 = liveFansEntranceSizeConfig;
        if (liveFansEntranceSizeConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("save_max_size");
        c09dl.LJJJJ(Integer.valueOf(liveFansEntranceSizeConfig2.saveMaxSize));
        c09dl.LJIILLIIL("save_recently_max_size");
        c09dl.LJJJJ(Integer.valueOf(liveFansEntranceSizeConfig2.recentlyMaxSize));
        c09dl.LJII();
    }
}
