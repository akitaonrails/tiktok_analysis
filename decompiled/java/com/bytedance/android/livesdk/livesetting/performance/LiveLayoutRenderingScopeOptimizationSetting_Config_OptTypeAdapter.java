package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutRenderingScopeOptimizationSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveLayoutRenderingScopeOptimizationSetting_Config_OptTypeAdapter extends TypeAdapter<LiveLayoutRenderingScopeOptimizationSetting.Config> {
    public final Gson LIZ;

    public LiveLayoutRenderingScopeOptimizationSetting_Config_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveLayoutRenderingScopeOptimizationSetting.Config read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveLayoutRenderingScopeOptimizationSetting.Config config = new LiveLayoutRenderingScopeOptimizationSetting.Config(false, false, false, false, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2027119721:
                        if (strLJJJJ.equals("creator_ranking_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.creatorRankingOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1730448428:
                        if (strLJJJJ.equals("barrage_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.barrageOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -562090053:
                        if (strLJJJJ.equals("announcement_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.announcementOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -63110801:
                        if (strLJJJJ.equals("audience_ranking_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.audienceRankingOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1743053473:
                        if (strLJJJJ.equals("gift_guide_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.giftGuideOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return config;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveLayoutRenderingScopeOptimizationSetting.Config config) throws IOException {
        LiveLayoutRenderingScopeOptimizationSetting.Config config2 = config;
        if (config2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("creator_ranking_opt");
        c09dl.LJJJJJL(config2.creatorRankingOpt);
        c09dl.LJIILLIIL("audience_ranking_opt");
        c09dl.LJJJJJL(config2.audienceRankingOpt);
        c09dl.LJIILLIIL("announcement_opt");
        c09dl.LJJJJJL(config2.announcementOpt);
        c09dl.LJIILLIIL("barrage_opt");
        c09dl.LJJJJJL(config2.barrageOpt);
        c09dl.LJIILLIIL("gift_guide_opt");
        c09dl.LJJJJJL(config2.giftGuideOpt);
        c09dl.LJII();
    }
}
