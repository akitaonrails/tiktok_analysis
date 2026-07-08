package com.bytedance.android.livesdk.livesetting.strategy;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.scene.Scene;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes35.dex */
public final class GiftGuideASRConfig_OptTypeAdapter extends TypeAdapter<GiftGuideASRConfig> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final GiftGuideASRConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        GiftGuideASRConfig giftGuideASRConfig = new GiftGuideASRConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1545477013:
                        if (strLJJJJ.equals("threshold")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                giftGuideASRConfig.threshold = Float.valueOf((float) c09cu.LJJIL());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1253295888:
                        if (strLJJJJ.equals("sei_version")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                giftGuideASRConfig.seiVersion = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -649855604:
                        if (strLJJJJ.equals("sei_min_interval_sec")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                giftGuideASRConfig.seiMinIntervalSec = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -548983294:
                        if (strLJJJJ.equals("sei_sending_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                giftGuideASRConfig.seiSendingCount = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -203889828:
                        if (strLJJJJ.equals("task_delay_min")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                giftGuideASRConfig.taskDelayMin = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 109254796:
                        if (strLJJJJ.equals(Scene.SCENE_SERVICE)) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                giftGuideASRConfig.scene = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1787425246:
                        if (strLJJJJ.equals("audio_process_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                giftGuideASRConfig.audioProcessInterval = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1790988705:
                        if (strLJJJJ.equals("duration_after_success_inference_sec")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                giftGuideASRConfig.durationAfterSuccessSec = c09cu.LJJIZ();
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
        return giftGuideASRConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, GiftGuideASRConfig giftGuideASRConfig) {
        GiftGuideASRConfig giftGuideASRConfig2 = giftGuideASRConfig;
        if (giftGuideASRConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL(Scene.SCENE_SERVICE);
        c09dl.LJJJJJ(giftGuideASRConfig2.scene);
        c09dl.LJIILLIIL("threshold");
        c09dl.LJJJJ(giftGuideASRConfig2.threshold);
        c09dl.LJIILLIIL("task_delay_min");
        c09dl.LJJJJ(Integer.valueOf(giftGuideASRConfig2.taskDelayMin));
        c09dl.LJIILLIIL("duration_after_success_inference_sec");
        c09dl.LJJJJ(Integer.valueOf(giftGuideASRConfig2.durationAfterSuccessSec));
        c09dl.LJIILLIIL("sei_sending_count");
        c09dl.LJJJJ(Integer.valueOf(giftGuideASRConfig2.seiSendingCount));
        c09dl.LJIILLIIL("audio_process_interval");
        c09dl.LJJJJ(Integer.valueOf(giftGuideASRConfig2.audioProcessInterval));
        c09dl.LJIILLIIL("sei_min_interval_sec");
        c09dl.LJJJJ(Integer.valueOf(giftGuideASRConfig2.seiMinIntervalSec));
        c09dl.LJIILLIIL("sei_version");
        c09dl.LJJJJ(Integer.valueOf(giftGuideASRConfig2.seiVersion));
        c09dl.LJII();
    }
}
