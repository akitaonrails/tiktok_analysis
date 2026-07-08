package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftTrayPerformanceOptimisationSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveGiftTrayPerformanceOptimisationSetting_GiftTrayPerformanceOptimisationConfig_OptTypeAdapter extends TypeAdapter<LiveGiftTrayPerformanceOptimisationSetting.GiftTrayPerformanceOptimisationConfig> {
    public final Gson LIZ;

    public LiveGiftTrayPerformanceOptimisationSetting_GiftTrayPerformanceOptimisationConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveGiftTrayPerformanceOptimisationSetting.GiftTrayPerformanceOptimisationConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveGiftTrayPerformanceOptimisationSetting.GiftTrayPerformanceOptimisationConfig giftTrayPerformanceOptimisationConfig = new LiveGiftTrayPerformanceOptimisationSetting.GiftTrayPerformanceOptimisationConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "right_tag_transition_opt_enabled")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    giftTrayPerformanceOptimisationConfig.rightTagTransitionOptEnabled = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "downgrade_right_tag_enabled")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    giftTrayPerformanceOptimisationConfig.downgradeRightTagEnabled = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return giftTrayPerformanceOptimisationConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveGiftTrayPerformanceOptimisationSetting.GiftTrayPerformanceOptimisationConfig giftTrayPerformanceOptimisationConfig) throws IOException {
        LiveGiftTrayPerformanceOptimisationSetting.GiftTrayPerformanceOptimisationConfig giftTrayPerformanceOptimisationConfig2 = giftTrayPerformanceOptimisationConfig;
        if (giftTrayPerformanceOptimisationConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("right_tag_transition_opt_enabled");
        c09dl.LJJJJJL(giftTrayPerformanceOptimisationConfig2.rightTagTransitionOptEnabled);
        c09dl.LJIILLIIL("downgrade_right_tag_enabled");
        c09dl.LJJJJJL(giftTrayPerformanceOptimisationConfig2.downgradeRightTagEnabled);
        c09dl.LJII();
    }
}
