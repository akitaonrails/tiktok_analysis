package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
public final class LiveMatchAICommentaryVoiceVisualisationConfig_OptTypeAdapter extends TypeAdapter<LiveMatchAICommentaryVoiceVisualisationConfig> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveMatchAICommentaryVoiceVisualisationConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveMatchAICommentaryVoiceVisualisationConfig liveMatchAICommentaryVoiceVisualisationConfig = new LiveMatchAICommentaryVoiceVisualisationConfig(1.0f, 1.2f, 450, 450, 750, 500);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1273796078:
                        if (strLJJJJ.equals("entrance_scale_down_duration_ms")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchAICommentaryVoiceVisualisationConfig.entranceScaleDownDurationMs = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -525410286:
                        if (strLJJJJ.equals("small_scale")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchAICommentaryVoiceVisualisationConfig.smallScale = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 606309899:
                        if (strLJJJJ.equals("entrance_scale_up_duration_ms")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchAICommentaryVoiceVisualisationConfig.entranceScaleUpDurationMs = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 936668470:
                        if (strLJJJJ.equals("entrance_hold_at_big_delay_ms")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchAICommentaryVoiceVisualisationConfig.entranceHoldAtBigDelayMs = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1322199371:
                        if (strLJJJJ.equals("big_scale")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchAICommentaryVoiceVisualisationConfig.bigScale = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1455468888:
                        if (strLJJJJ.equals("scale_anim_duration_ms")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchAICommentaryVoiceVisualisationConfig.scaleAnimDurationMs = c09cu.LJJIZ();
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
        return liveMatchAICommentaryVoiceVisualisationConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveMatchAICommentaryVoiceVisualisationConfig liveMatchAICommentaryVoiceVisualisationConfig) {
        LiveMatchAICommentaryVoiceVisualisationConfig liveMatchAICommentaryVoiceVisualisationConfig2 = liveMatchAICommentaryVoiceVisualisationConfig;
        if (liveMatchAICommentaryVoiceVisualisationConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("small_scale");
        c09dl.LJJJJ(Float.valueOf(liveMatchAICommentaryVoiceVisualisationConfig2.smallScale));
        c09dl.LJIILLIIL("big_scale");
        c09dl.LJJJJ(Float.valueOf(liveMatchAICommentaryVoiceVisualisationConfig2.bigScale));
        c09dl.LJIILLIIL("scale_anim_duration_ms");
        c09dl.LJJJJ(Integer.valueOf(liveMatchAICommentaryVoiceVisualisationConfig2.scaleAnimDurationMs));
        c09dl.LJIILLIIL("entrance_scale_up_duration_ms");
        c09dl.LJJJJ(Integer.valueOf(liveMatchAICommentaryVoiceVisualisationConfig2.entranceScaleUpDurationMs));
        c09dl.LJIILLIIL("entrance_hold_at_big_delay_ms");
        c09dl.LJJJJ(Integer.valueOf(liveMatchAICommentaryVoiceVisualisationConfig2.entranceHoldAtBigDelayMs));
        c09dl.LJIILLIIL("entrance_scale_down_duration_ms");
        c09dl.LJJJJ(Integer.valueOf(liveMatchAICommentaryVoiceVisualisationConfig2.entranceScaleDownDurationMs));
        c09dl.LJII();
    }
}
