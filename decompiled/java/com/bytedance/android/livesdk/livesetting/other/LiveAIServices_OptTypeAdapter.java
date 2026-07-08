package com.bytedance.android.livesdk.livesetting.other;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes34.dex */
public final class LiveAIServices_OptTypeAdapter extends TypeAdapter<LiveAIServices> {
    public final Gson LIZ;

    public LiveAIServices_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveAIServices read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveAIServices liveAIServices = new LiveAIServices(new LiveRevenueFeatureCollectService("live_revenue_feature_collect", 0), new GiftGuideOpenPredictService("live_gift_guide_client_collect", 0), new LiveHarConfig(false, false, 60000L, 15000L), new LiveOhrConfig(false));
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2122532421:
                        if (strLJJJJ.equals("live_ohr_config")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveAIServices.liveOhrConfig = (LiveOhrConfig) this.LIZ.LJIIJ(LiveOhrConfig.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1947484053:
                        if (strLJJJJ.equals("live_revenue_feature_collect")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveAIServices.liveRevenueFeatureCollectService = (LiveRevenueFeatureCollectService) this.LIZ.LJIIJ(LiveRevenueFeatureCollectService.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -979658533:
                        if (strLJJJJ.equals("live_har_config")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveAIServices.liveHarConfig = (LiveHarConfig) this.LIZ.LJIIJ(LiveHarConfig.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 825338888:
                        if (strLJJJJ.equals("gift_guide_client_collect")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveAIServices.giftGuideOpenPredictService = (GiftGuideOpenPredictService) this.LIZ.LJIIJ(GiftGuideOpenPredictService.class).read(c09cu);
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
        return liveAIServices;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveAIServices liveAIServices) {
        LiveAIServices liveAIServices2 = liveAIServices;
        if (liveAIServices2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("live_revenue_feature_collect");
        this.LIZ.LJIIJ(LiveRevenueFeatureCollectService.class).write(c09dl, liveAIServices2.liveRevenueFeatureCollectService);
        c09dl.LJIILLIIL("gift_guide_client_collect");
        this.LIZ.LJIIJ(GiftGuideOpenPredictService.class).write(c09dl, liveAIServices2.giftGuideOpenPredictService);
        c09dl.LJIILLIIL("live_har_config");
        this.LIZ.LJIIJ(LiveHarConfig.class).write(c09dl, liveAIServices2.liveHarConfig);
        c09dl.LJIILLIIL("live_ohr_config");
        this.LIZ.LJIIJ(LiveOhrConfig.class).write(c09dl, liveAIServices2.liveOhrConfig);
        c09dl.LJII();
    }
}
