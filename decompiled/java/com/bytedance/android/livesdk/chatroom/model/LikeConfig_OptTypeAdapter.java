package com.bytedance.android.livesdk.chatroom.model;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LikeConfig_OptTypeAdapter extends TypeAdapter<LikeConfig> {
    public final Gson LIZ;

    public LikeConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LikeConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LikeConfig likeConfig = new LikeConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1370468909:
                        if (strLJJJJ.equals("digg_send_likes_tap_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                likeConfig.sendLikesTapCount = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -777526519:
                        if (strLJJJJ.equals("like_style")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                likeConfig.likeStyle = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 157145888:
                        if (strLJJJJ.equals("digg_progress_max_tap_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                likeConfig.fullProgressTapCount = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 200905162:
                        if (strLJJJJ.equals("digg_others_flow_anim_repeat_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                likeConfig.othersFlowAnimRepeatCount = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 903541766:
                        if (strLJJJJ.equals("digg_icon_force_heart")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                likeConfig.iconForceHeart = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1161325893:
                        if (strLJJJJ.equals("digg_threshold_adjust_enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                likeConfig.diggThresholdAdjustEnable = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1540214857:
                        if (strLJJJJ.equals("digg_show_progress_tap_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                likeConfig.showProgressTapCount = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1754875396:
                        if (strLJJJJ.equals("digg_others_flow_anim_delay")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                likeConfig.othersFlowAnimDelay = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1793314485:
                        if (strLJJJJ.equals("digg_show_easteregg_direct")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                likeConfig.diggShowEastereggDirect = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2147434427:
                        if (strLJJJJ.equals("digg_tap_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                likeConfig.tapInterval = c09cu.LJJJ();
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
        return likeConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LikeConfig likeConfig) throws IOException {
        LikeConfig likeConfig2 = likeConfig;
        if (likeConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("like_style");
        c09dl.LJJJJ(Integer.valueOf(likeConfig2.likeStyle));
        c09dl.LJIILLIIL("digg_tap_interval");
        c09dl.LJJIZ(likeConfig2.tapInterval);
        c09dl.LJIILLIIL("digg_send_likes_tap_count");
        c09dl.LJJJJ(Integer.valueOf(likeConfig2.sendLikesTapCount));
        c09dl.LJIILLIIL("digg_show_progress_tap_count");
        c09dl.LJJJJ(Integer.valueOf(likeConfig2.showProgressTapCount));
        c09dl.LJIILLIIL("digg_progress_max_tap_count");
        c09dl.LJJJJ(Integer.valueOf(likeConfig2.fullProgressTapCount));
        c09dl.LJIILLIIL("digg_others_flow_anim_repeat_count");
        c09dl.LJJJJ(Integer.valueOf(likeConfig2.othersFlowAnimRepeatCount));
        c09dl.LJIILLIIL("digg_icon_force_heart");
        c09dl.LJJJJJL(likeConfig2.iconForceHeart);
        c09dl.LJIILLIIL("digg_others_flow_anim_delay");
        c09dl.LJJIZ(likeConfig2.othersFlowAnimDelay);
        c09dl.LJIILLIIL("digg_show_easteregg_direct");
        c09dl.LJJJJ(Integer.valueOf(likeConfig2.diggShowEastereggDirect));
        c09dl.LJIILLIIL("digg_threshold_adjust_enable");
        c09dl.LJJJJ(Integer.valueOf(likeConfig2.diggThresholdAdjustEnable));
        c09dl.LJII();
    }
}
