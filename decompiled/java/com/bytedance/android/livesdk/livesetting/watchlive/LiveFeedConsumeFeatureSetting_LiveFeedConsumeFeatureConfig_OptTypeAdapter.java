package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveFeedConsumeFeatureSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveFeedConsumeFeatureSetting_LiveFeedConsumeFeatureConfig_OptTypeAdapter extends TypeAdapter<LiveFeedConsumeFeatureSetting.LiveFeedConsumeFeatureConfig> {
    public final Gson LIZ;

    public LiveFeedConsumeFeatureSetting_LiveFeedConsumeFeatureConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveFeedConsumeFeatureSetting.LiveFeedConsumeFeatureConfig read(C09CU c09cu) {
        LiveFeedConsumeFeatureSetting.LiveFeedConsumeFeatureConfig liveFeedConsumeFeatureConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            liveFeedConsumeFeatureConfig = new LiveFeedConsumeFeatureSetting.LiveFeedConsumeFeatureConfig(false, 2);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "enable")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveFeedConsumeFeatureConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "consume_id_type")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveFeedConsumeFeatureConfig.consumeIdType = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return liveFeedConsumeFeatureConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveFeedConsumeFeatureSetting.LiveFeedConsumeFeatureConfig liveFeedConsumeFeatureConfig) throws IOException {
        LiveFeedConsumeFeatureSetting.LiveFeedConsumeFeatureConfig liveFeedConsumeFeatureConfig2 = liveFeedConsumeFeatureConfig;
        if (liveFeedConsumeFeatureConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(liveFeedConsumeFeatureConfig2.enable);
        c09dl.LJIILLIIL("consume_id_type");
        c09dl.LJJJJ(Integer.valueOf(liveFeedConsumeFeatureConfig2.consumeIdType));
        c09dl.LJII();
    }
}
