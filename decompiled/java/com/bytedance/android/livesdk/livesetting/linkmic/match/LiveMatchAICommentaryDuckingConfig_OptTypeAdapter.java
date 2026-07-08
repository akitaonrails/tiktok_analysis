package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes36.dex */
public final class LiveMatchAICommentaryDuckingConfig_OptTypeAdapter extends TypeAdapter<LiveMatchAICommentaryDuckingConfig> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveMatchAICommentaryDuckingConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveMatchAICommentaryDuckingConfig liveMatchAICommentaryDuckingConfig = new LiveMatchAICommentaryDuckingConfig(-25.0f, -10.0f, 0.01f, 1.0f, 0.001f, 1.5f, 10000.0f, 0.2f, 200.0f);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1800560070:
                        if (strLJJJJ.equals("input_volume_scale")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchAICommentaryDuckingConfig.input_volume_scale = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -604428085:
                        if (strLJJJJ.equals("rms_smooth_time_s")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchAICommentaryDuckingConfig.rms_smooth_time_s = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -531722453:
                        if (strLJJJJ.equals("max_buffer_audio_time_ms")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchAICommentaryDuckingConfig.max_buffer_audio_time_ms = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -239272965:
                        if (strLJJJJ.equals("speech_thres_dbfs")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchAICommentaryDuckingConfig.speech_thres_dbfs = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -199032514:
                        if (strLJJJJ.equals("gain_db")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchAICommentaryDuckingConfig.gain_db = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -151919871:
                        if (strLJJJJ.equals("hold_time_s")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchAICommentaryDuckingConfig.hold_time_s = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 311086424:
                        if (strLJJJJ.equals("attack_time_s")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchAICommentaryDuckingConfig.attack_time_s = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 718329267:
                        if (strLJJJJ.equals("decode_output_audio_duration_ms_per_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchAICommentaryDuckingConfig.decode_output_audio_duration_ms_per_time = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1063710393:
                        if (strLJJJJ.equals("release_time_s")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchAICommentaryDuckingConfig.release_time_s = (float) c09cu.LJJIL();
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
        return liveMatchAICommentaryDuckingConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveMatchAICommentaryDuckingConfig liveMatchAICommentaryDuckingConfig) {
        LiveMatchAICommentaryDuckingConfig liveMatchAICommentaryDuckingConfig2 = liveMatchAICommentaryDuckingConfig;
        if (liveMatchAICommentaryDuckingConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("speech_thres_dbfs");
        c09dl.LJJJJ(Float.valueOf(liveMatchAICommentaryDuckingConfig2.speech_thres_dbfs));
        c09dl.LJIILLIIL("gain_db");
        c09dl.LJJJJ(Float.valueOf(liveMatchAICommentaryDuckingConfig2.gain_db));
        c09dl.LJIILLIIL("rms_smooth_time_s");
        c09dl.LJJJJ(Float.valueOf(liveMatchAICommentaryDuckingConfig2.rms_smooth_time_s));
        c09dl.LJIILLIIL("hold_time_s");
        c09dl.LJJJJ(Float.valueOf(liveMatchAICommentaryDuckingConfig2.hold_time_s));
        c09dl.LJIILLIIL("attack_time_s");
        c09dl.LJJJJ(Float.valueOf(liveMatchAICommentaryDuckingConfig2.attack_time_s));
        c09dl.LJIILLIIL("release_time_s");
        c09dl.LJJJJ(Float.valueOf(liveMatchAICommentaryDuckingConfig2.release_time_s));
        c09dl.LJIILLIIL("max_buffer_audio_time_ms");
        c09dl.LJJJJ(Float.valueOf(liveMatchAICommentaryDuckingConfig2.max_buffer_audio_time_ms));
        c09dl.LJIILLIIL("input_volume_scale");
        c09dl.LJJJJ(Float.valueOf(liveMatchAICommentaryDuckingConfig2.input_volume_scale));
        c09dl.LJIILLIIL("decode_output_audio_duration_ms_per_time");
        c09dl.LJJJJ(Float.valueOf(liveMatchAICommentaryDuckingConfig2.decode_output_audio_duration_ms_per_time));
        c09dl.LJII();
    }
}
