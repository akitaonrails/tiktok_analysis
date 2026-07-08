package com.bytedance.android.livesdk.livesetting.starcomment;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.starcomment.LiveStarCommentPurchaseConfig;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveStarCommentPurchaseConfig_Config_OptTypeAdapter extends TypeAdapter<LiveStarCommentPurchaseConfig.Config> {
    @Override // com.google.gson.TypeAdapter
    public final LiveStarCommentPurchaseConfig.Config read(C09CU c09cu) {
        LiveStarCommentPurchaseConfig.Config config = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            config = new LiveStarCommentPurchaseConfig.Config(2);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                if (Intrinsics.LJFF(c09cu.LJJJJ(), "purchase_page_refresh_time")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        config.refreshTime = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return config;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveStarCommentPurchaseConfig.Config config) {
        LiveStarCommentPurchaseConfig.Config config2 = config;
        if (config2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("purchase_page_refresh_time");
        c09dl.LJJJJ(Integer.valueOf(config2.refreshTime));
        c09dl.LJII();
    }
}
