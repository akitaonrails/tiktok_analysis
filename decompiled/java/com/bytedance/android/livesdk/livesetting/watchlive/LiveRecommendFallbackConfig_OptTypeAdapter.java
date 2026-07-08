package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveRecommendFallbackConfig_OptTypeAdapter extends TypeAdapter<LiveRecommendFallbackConfig> {
    public final Gson LIZ;

    public LiveRecommendFallbackConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveRecommendFallbackConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveRecommendFallbackConfig liveRecommendFallbackConfig = new LiveRecommendFallbackConfig(false, "tiktok_common_backup", "76", "loadmore_recommend", "live_cell");
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1930808873:
                        if (strLJJJJ.equals("channel_id")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRecommendFallbackConfig.channelId = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRecommendFallbackConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -685906904:
                        if (strLJJJJ.equals("enter_method")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRecommendFallbackConfig.enterMethod = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -413545813:
                        if (strLJJJJ.equals("req_from")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRecommendFallbackConfig.reqFrom = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1337020202:
                        if (strLJJJJ.equals("enter_from_merge")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRecommendFallbackConfig.enterFromMerge = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return liveRecommendFallbackConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveRecommendFallbackConfig liveRecommendFallbackConfig) throws IOException {
        LiveRecommendFallbackConfig liveRecommendFallbackConfig2 = liveRecommendFallbackConfig;
        if (liveRecommendFallbackConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(liveRecommendFallbackConfig2.enable);
        c09dl.LJIILLIIL("req_from");
        c09dl.LJJJJJ(liveRecommendFallbackConfig2.reqFrom);
        c09dl.LJIILLIIL("channel_id");
        c09dl.LJJJJJ(liveRecommendFallbackConfig2.channelId);
        c09dl.LJIILLIIL("enter_from_merge");
        c09dl.LJJJJJ(liveRecommendFallbackConfig2.enterFromMerge);
        c09dl.LJIILLIIL("enter_method");
        c09dl.LJJJJJ(liveRecommendFallbackConfig2.enterMethod);
        c09dl.LJII();
    }
}
