package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveFeedFeaturesAddExp;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveFeedFeaturesAddExp_LiveFeedFeaturesAddConfig_OptTypeAdapter extends TypeAdapter<LiveFeedFeaturesAddExp.LiveFeedFeaturesAddConfig> {
    public final Gson LIZ;

    public LiveFeedFeaturesAddExp_LiveFeedFeaturesAddConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveFeedFeaturesAddExp.LiveFeedFeaturesAddConfig read(C09CU c09cu) {
        LiveFeedFeaturesAddExp.LiveFeedFeaturesAddConfig liveFeedFeaturesAddConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            liveFeedFeaturesAddConfig = new LiveFeedFeaturesAddExp.LiveFeedFeaturesAddConfig(false, new ArrayList());
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "enable")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveFeedFeaturesAddConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "app_session_list")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveFeedFeaturesAddConfig.appSessionList = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return liveFeedFeaturesAddConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveFeedFeaturesAddExp.LiveFeedFeaturesAddConfig liveFeedFeaturesAddConfig) throws IOException {
        LiveFeedFeaturesAddExp.LiveFeedFeaturesAddConfig liveFeedFeaturesAddConfig2 = liveFeedFeaturesAddConfig;
        if (liveFeedFeaturesAddConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(liveFeedFeaturesAddConfig2.enable);
        c09dl.LJIILLIIL("app_session_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, liveFeedFeaturesAddConfig2.appSessionList, String.class);
        c09dl.LJII();
    }
}
