package com.bytedance.android.livesdk.livesetting.feed;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRecInfoPtySetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveFeedRecInfoPtySetting_LiveFeedRecInfoPtyConfig_OptTypeAdapter extends TypeAdapter<LiveFeedRecInfoPtySetting.LiveFeedRecInfoPtyConfig> {
    public final Gson LIZ;

    public LiveFeedRecInfoPtySetting_LiveFeedRecInfoPtyConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveFeedRecInfoPtySetting.LiveFeedRecInfoPtyConfig read(C09CU c09cu) {
        LiveFeedRecInfoPtySetting.LiveFeedRecInfoPtyConfig liveFeedRecInfoPtyConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            liveFeedRecInfoPtyConfig = new LiveFeedRecInfoPtySetting.LiveFeedRecInfoPtyConfig(false, "");
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "enable")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveFeedRecInfoPtyConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "reco_info_key")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveFeedRecInfoPtyConfig.recoInfoKey = c09cu.LJJJZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return liveFeedRecInfoPtyConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveFeedRecInfoPtySetting.LiveFeedRecInfoPtyConfig liveFeedRecInfoPtyConfig) throws IOException {
        LiveFeedRecInfoPtySetting.LiveFeedRecInfoPtyConfig liveFeedRecInfoPtyConfig2 = liveFeedRecInfoPtyConfig;
        if (liveFeedRecInfoPtyConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(liveFeedRecInfoPtyConfig2.enable);
        c09dl.LJIILLIIL("reco_info_key");
        c09dl.LJJJJJ(liveFeedRecInfoPtyConfig2.recoInfoKey);
        c09dl.LJII();
    }
}
