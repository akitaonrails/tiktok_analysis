package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftSelfDiagnosisSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveGiftSelfDiagnosisSetting_LiveGiftSelfDiagnosis_OptTypeAdapter extends TypeAdapter<LiveGiftSelfDiagnosisSetting.LiveGiftSelfDiagnosis> {
    public final Gson LIZ;

    public LiveGiftSelfDiagnosisSetting_LiveGiftSelfDiagnosis_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveGiftSelfDiagnosisSetting.LiveGiftSelfDiagnosis read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveGiftSelfDiagnosisSetting.LiveGiftSelfDiagnosis liveGiftSelfDiagnosis = new LiveGiftSelfDiagnosisSetting.LiveGiftSelfDiagnosis(false, -200.0f, 50, 0.9f, 0.9f, 3000L, 3000L, 20, 20, 0.9f, 0.9f, Mp4ScreenVideoLoadTimeout.CONTROL, Mp4ScreenVideoLoadTimeout.CONTROL, 0.9f, 1000L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1427179572:
                        if (strLJJJJ.equals("anchor_tray_msg_drop")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftSelfDiagnosis.anchorTrayMsgDrop = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftSelfDiagnosis.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -905609825:
                        if (strLJJJJ.equals("anchor_tray_show_success_rate")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftSelfDiagnosis.anchorTrayShowSuccessRate = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -783778522:
                        if (strLJJJJ.equals("self_effect_dur")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftSelfDiagnosis.selfEffectDur = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -607111384:
                        if (strLJJJJ.equals("self_tray_show_success_rate")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftSelfDiagnosis.selfTrayShowSuccessRate = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -481822562:
                        if (strLJJJJ.equals("anchor_tray_show_dur")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftSelfDiagnosis.anchorTrayShowDur = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 48949453:
                        if (strLJJJJ.equals("queue_retain_size")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftSelfDiagnosis.queueRetainSize = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 59289635:
                        if (strLJJJJ.equals("self_tray_msg_drop")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftSelfDiagnosis.selfTrayMsgDrop = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 179287808:
                        if (strLJJJJ.equals("anchor_effect_success_rate")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftSelfDiagnosis.anchorEffectSuccessRate = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 864997991:
                        if (strLJJJJ.equals("panel_open_dur")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftSelfDiagnosis.panelOpenDur = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1004646645:
                        if (strLJJJJ.equals("self_tray_show_dur")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftSelfDiagnosis.selfTrayShowDur = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1096651287:
                        if (strLJJJJ.equals("self_effect_success_rate")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftSelfDiagnosis.selfEffectSuccessRate = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1818325097:
                        if (strLJJJJ.equals("high_traffic_room_score_limit")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftSelfDiagnosis.highTrafficRoomScoreLimit = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1997313526:
                        if (strLJJJJ.equals("panel_open_success_rate")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftSelfDiagnosis.panelOpenSuccessRate = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2115141149:
                        if (strLJJJJ.equals("anchor_effect_dur")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftSelfDiagnosis.anchorEffectDur = c09cu.LJJJ();
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
        return liveGiftSelfDiagnosis;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveGiftSelfDiagnosisSetting.LiveGiftSelfDiagnosis liveGiftSelfDiagnosis) throws IOException {
        LiveGiftSelfDiagnosisSetting.LiveGiftSelfDiagnosis liveGiftSelfDiagnosis2 = liveGiftSelfDiagnosis;
        if (liveGiftSelfDiagnosis2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(liveGiftSelfDiagnosis2.enable);
        c09dl.LJIILLIIL("high_traffic_room_score_limit");
        c09dl.LJJJJ(Float.valueOf(liveGiftSelfDiagnosis2.highTrafficRoomScoreLimit));
        c09dl.LJIILLIIL("queue_retain_size");
        c09dl.LJJJJ(Integer.valueOf(liveGiftSelfDiagnosis2.queueRetainSize));
        c09dl.LJIILLIIL("self_tray_show_success_rate");
        c09dl.LJJJJ(Float.valueOf(liveGiftSelfDiagnosis2.selfTrayShowSuccessRate));
        c09dl.LJIILLIIL("anchor_tray_show_success_rate");
        c09dl.LJJJJ(Float.valueOf(liveGiftSelfDiagnosis2.anchorTrayShowSuccessRate));
        c09dl.LJIILLIIL("self_tray_show_dur");
        c09dl.LJJIZ(liveGiftSelfDiagnosis2.selfTrayShowDur);
        c09dl.LJIILLIIL("anchor_tray_show_dur");
        c09dl.LJJIZ(liveGiftSelfDiagnosis2.anchorTrayShowDur);
        c09dl.LJIILLIIL("self_tray_msg_drop");
        c09dl.LJJJJ(Integer.valueOf(liveGiftSelfDiagnosis2.selfTrayMsgDrop));
        c09dl.LJIILLIIL("anchor_tray_msg_drop");
        c09dl.LJJJJ(Integer.valueOf(liveGiftSelfDiagnosis2.anchorTrayMsgDrop));
        c09dl.LJIILLIIL("self_effect_success_rate");
        c09dl.LJJJJ(Float.valueOf(liveGiftSelfDiagnosis2.selfEffectSuccessRate));
        c09dl.LJIILLIIL("anchor_effect_success_rate");
        c09dl.LJJJJ(Float.valueOf(liveGiftSelfDiagnosis2.anchorEffectSuccessRate));
        c09dl.LJIILLIIL("self_effect_dur");
        c09dl.LJJIZ(liveGiftSelfDiagnosis2.selfEffectDur);
        c09dl.LJIILLIIL("anchor_effect_dur");
        c09dl.LJJIZ(liveGiftSelfDiagnosis2.anchorEffectDur);
        c09dl.LJIILLIIL("panel_open_success_rate");
        c09dl.LJJJJ(Float.valueOf(liveGiftSelfDiagnosis2.panelOpenSuccessRate));
        c09dl.LJIILLIIL("panel_open_dur");
        c09dl.LJJIZ(liveGiftSelfDiagnosis2.panelOpenDur);
        c09dl.LJII();
    }
}
