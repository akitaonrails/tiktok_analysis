package com.bytedance.android.livesdk.livesetting.other;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C2097608Jq;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes34.dex */
public final class LivePitayaSettingsParams_OptTypeAdapter extends TypeAdapter<LivePitayaSettingsParams> {
    public final Gson LIZ;

    public LivePitayaSettingsParams_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LivePitayaSettingsParams read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LivePitayaSettingsParams livePitayaSettingsParams = new LivePitayaSettingsParams(0, new LivePitayaTaskSettingsParams(500L), C2097608Jq.LJ(), new LiveAIServices(new LiveRevenueFeatureCollectService("live_revenue_feature_collect", 0), new GiftGuideOpenPredictService("live_gift_guide_client_collect", 0), new LiveHarConfig(false, false, 60000L, 15000L), new LiveOhrConfig(false)), 1, 30000L, 0, new LivePitayaTaskFrequentControlManager(false, null, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 1023, null));
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                livePitayaSettingsParams.enable = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1077048117:
                        if (strLJJJJ.equals("request_all_pkgs_once")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                livePitayaSettingsParams.requestAllPkgsOnce = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -865551118:
                        if (strLJJJJ.equals("init_after_app_start")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                livePitayaSettingsParams.initAfterAppStart = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -830053772:
                        if (strLJJJJ.equals("frequent_settings")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                livePitayaSettingsParams.fequentSettings = (LivePitayaTaskFrequentControlManager) this.LIZ.LJIIJ(LivePitayaTaskFrequentControlManager.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 163737538:
                        if (strLJJJJ.equals("live_ai_services")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                livePitayaSettingsParams.aiServices = (LiveAIServices) this.LIZ.LJIIJ(LiveAIServices.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 960828537:
                        if (strLJJJJ.equals("request_all_pkgs_delay")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                livePitayaSettingsParams.requestAllPkgsDelay = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1443175837:
                        if (strLJJJJ.equals("task_settings")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                livePitayaSettingsParams.taskSettingsParams = (LivePitayaTaskSettingsParams) this.LIZ.LJIIJ(LivePitayaTaskSettingsParams.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1480340324:
                        if (strLJJJJ.equals("ab_params")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                livePitayaSettingsParams.abParams = C473040Igo.LIZIZ(this.LIZ, c09cu, Object.class);
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
        return livePitayaSettingsParams;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LivePitayaSettingsParams livePitayaSettingsParams) throws IOException {
        LivePitayaSettingsParams livePitayaSettingsParams2 = livePitayaSettingsParams;
        if (livePitayaSettingsParams2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJ(Integer.valueOf(livePitayaSettingsParams2.enable));
        c09dl.LJIILLIIL("task_settings");
        this.LIZ.LJIIJ(LivePitayaTaskSettingsParams.class).write(c09dl, livePitayaSettingsParams2.taskSettingsParams);
        c09dl.LJIILLIIL("ab_params");
        C473040Igo.LJ(this.LIZ, c09dl, livePitayaSettingsParams2.abParams, Object.class);
        c09dl.LJIILLIIL("live_ai_services");
        this.LIZ.LJIIJ(LiveAIServices.class).write(c09dl, livePitayaSettingsParams2.aiServices);
        c09dl.LJIILLIIL("request_all_pkgs_once");
        c09dl.LJJJJ(Integer.valueOf(livePitayaSettingsParams2.requestAllPkgsOnce));
        c09dl.LJIILLIIL("request_all_pkgs_delay");
        c09dl.LJJIZ(livePitayaSettingsParams2.requestAllPkgsDelay);
        c09dl.LJIILLIIL("init_after_app_start");
        c09dl.LJJJJ(Integer.valueOf(livePitayaSettingsParams2.initAfterAppStart));
        c09dl.LJIILLIIL("frequent_settings");
        this.LIZ.LJIIJ(LivePitayaTaskFrequentControlManager.class).write(c09dl, livePitayaSettingsParams2.fequentSettings);
        c09dl.LJII();
    }
}
