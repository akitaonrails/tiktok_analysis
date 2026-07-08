package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveGiftPreloadInteractiveAssetConfig_OptTypeAdapter extends TypeAdapter<LiveGiftPreloadInteractiveAssetConfig> {
    public final Gson LIZ;

    public LiveGiftPreloadInteractiveAssetConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveGiftPreloadInteractiveAssetConfig read(C09CU c09cu) {
        LiveGiftPreloadInteractiveAssetConfig liveGiftPreloadInteractiveAssetConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            liveGiftPreloadInteractiveAssetConfig = new LiveGiftPreloadInteractiveAssetConfig(true, 10);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "live_gift_predownload_interactive_gift_phase2_enabled")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveGiftPreloadInteractiveAssetConfig.isEnable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "live_gift_predownload_interactive_gift_count")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveGiftPreloadInteractiveAssetConfig.preloadCount = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return liveGiftPreloadInteractiveAssetConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveGiftPreloadInteractiveAssetConfig liveGiftPreloadInteractiveAssetConfig) throws IOException {
        LiveGiftPreloadInteractiveAssetConfig liveGiftPreloadInteractiveAssetConfig2 = liveGiftPreloadInteractiveAssetConfig;
        if (liveGiftPreloadInteractiveAssetConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("live_gift_predownload_interactive_gift_phase2_enabled");
        c09dl.LJJJJJL(liveGiftPreloadInteractiveAssetConfig2.isEnable);
        c09dl.LJIILLIIL("live_gift_predownload_interactive_gift_count");
        c09dl.LJJJJ(Integer.valueOf(liveGiftPreloadInteractiveAssetConfig2.preloadCount));
        c09dl.LJII();
    }
}
