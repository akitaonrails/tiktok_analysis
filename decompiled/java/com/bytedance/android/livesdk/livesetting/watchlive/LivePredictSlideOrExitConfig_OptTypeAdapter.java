package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.io.IOException;

/* JADX INFO: loaded from: classes36.dex */
public final class LivePredictSlideOrExitConfig_OptTypeAdapter extends TypeAdapter<LivePredictSlideOrExitConfig> {
    public final Gson LIZ;

    public LivePredictSlideOrExitConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LivePredictSlideOrExitConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LivePredictSlideOrExitConfig livePredictSlideOrExitConfig = livePredictSlideOrExitConfig;
        LivePredictSlideOrExitConfig livePredictSlideOrExitConfig2 = new LivePredictSlideOrExitConfig(false, false, Mp4ScreenVideoLoadTimeout.CONTROL, 0.5f, 0.7f, Mp4ScreenVideoLoadTimeout.CONTROL, 3000L, 0.5f);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1797082814:
                        if (strLJJJJ.equals("exit_prob_threshold")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                livePredictSlideOrExitConfig2.exitProbThreshold = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        livePredictSlideOrExitConfig = livePredictSlideOrExitConfig2;
                        break;
                    case -796026625:
                        if (strLJJJJ.equals("enable_pre_io_scene_gate")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                livePredictSlideOrExitConfig2.enablePreIoSceneGate = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        livePredictSlideOrExitConfig = livePredictSlideOrExitConfig2;
                        break;
                    case -90382674:
                        if (strLJJJJ.equals("scroll_prob_threshold_high")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                livePredictSlideOrExitConfig2.scrollProbThresholdHigh = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        livePredictSlideOrExitConfig = livePredictSlideOrExitConfig2;
                        break;
                    case 456860943:
                        if (strLJJJJ.equals("enable_predict_slide")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                livePredictSlideOrExitConfig2.enablePredictSlide = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        livePredictSlideOrExitConfig = livePredictSlideOrExitConfig2;
                        break;
                    case 879332085:
                        if (strLJJJJ.equals("keep_time_mid_ms")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                livePredictSlideOrExitConfig.keepTimeMidMs = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1059295155:
                        if (strLJJJJ.equals("scroll_prob_threshold")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                livePredictSlideOrExitConfig.scrollProbThreshold = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1349964907:
                        if (strLJJJJ.equals("keep_time_high_ms")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                livePredictSlideOrExitConfig.keepTimeHighMs = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1923321246:
                        if (strLJJJJ.equals("keep_time_ms")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                livePredictSlideOrExitConfig.keepTimeMs = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                }
            }
            c09cu.LJJZ();
            livePredictSlideOrExitConfig = livePredictSlideOrExitConfig2;
        }
        c09cu.LJII();
        return livePredictSlideOrExitConfig2;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LivePredictSlideOrExitConfig livePredictSlideOrExitConfig) throws IOException {
        LivePredictSlideOrExitConfig livePredictSlideOrExitConfig2 = livePredictSlideOrExitConfig;
        if (livePredictSlideOrExitConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_predict_slide");
        c09dl.LJJJJJL(livePredictSlideOrExitConfig2.enablePredictSlide);
        c09dl.LJIILLIIL("enable_pre_io_scene_gate");
        c09dl.LJJJJJL(livePredictSlideOrExitConfig2.enablePreIoSceneGate);
        c09dl.LJIILLIIL("keep_time_ms");
        c09dl.LJJIZ(livePredictSlideOrExitConfig2.keepTimeMs);
        c09dl.LJIILLIIL("scroll_prob_threshold");
        c09dl.LJJJJ(Float.valueOf(livePredictSlideOrExitConfig2.scrollProbThreshold));
        c09dl.LJIILLIIL("scroll_prob_threshold_high");
        c09dl.LJJJJ(Float.valueOf(livePredictSlideOrExitConfig2.scrollProbThresholdHigh));
        c09dl.LJIILLIIL("keep_time_high_ms");
        c09dl.LJJIZ(livePredictSlideOrExitConfig2.keepTimeHighMs);
        c09dl.LJIILLIIL("keep_time_mid_ms");
        c09dl.LJJIZ(livePredictSlideOrExitConfig2.keepTimeMidMs);
        c09dl.LJIILLIIL("exit_prob_threshold");
        c09dl.LJJJJ(Float.valueOf(livePredictSlideOrExitConfig2.exitProbThreshold));
        c09dl.LJII();
    }
}
