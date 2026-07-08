package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public final class LetsDanceConfig_OptTypeAdapter extends TypeAdapter<LetsDanceConfig> {
    public final Gson LIZ;

    public LetsDanceConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LetsDanceConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LetsDanceConfig letsDanceConfig = new LetsDanceConfig("7599509308841136641", 2, 2, "https://p16-linkmic-img.tiktokcdn-us.com/tos-alisg-i-0gv1ynv35u-sg/just_dance_v1_x1.png~tplv-0gv1ynv35u-image.image", true, true, "7603370640413823489", false, true, true, true, true);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1933943437:
                        if (strLJJJJ.equals("particle_animation_tolerance_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                letsDanceConfig.particleAnimationToleranceTime = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1734401063:
                        if (strLJJJJ.equals("shared_bg_surface_view_enabled")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                letsDanceConfig.sharedBgSurfaceViewEnabled = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1594128117:
                        if (strLJJJJ.equals("show_preview_panel")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                letsDanceConfig.showPreviewPanel = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1077412677:
                        if (strLJJJJ.equals("effect_sdk_init_judge")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                letsDanceConfig.effectSdkInitJudge = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -552764166:
                        if (strLJJJJ.equals("participant_lets_dance_enabled")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                letsDanceConfig.participantLetsDanceEnabled = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 472709749:
                        if (strLJJJJ.equals("shared_background_resource_id")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                letsDanceConfig.sharedBackgroundResourceId = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 547380235:
                        if (strLJJJJ.equals("score_effect_resource_id")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                letsDanceConfig.scoreEffectResourceId = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1260653127:
                        if (strLJJJJ.equals("bubble_switch")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                letsDanceConfig.bubbleSwitch = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1333757761:
                        if (strLJJJJ.equals("replace_moderator_play_mutex_toast")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                letsDanceConfig.replaceModeratorPlayMutexToast = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1469802779:
                        if (strLJJJJ.equals("main_spot_water_mask_url")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                letsDanceConfig.mainSpotWaterMaskUrl = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1736385006:
                        if (strLJJJJ.equals("particle_animation_type")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                letsDanceConfig.particleAnimationType = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2134412169:
                        if (strLJJJJ.equals("mock_switch")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                letsDanceConfig.mockSwitch = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return letsDanceConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LetsDanceConfig letsDanceConfig) throws IOException {
        LetsDanceConfig letsDanceConfig2 = letsDanceConfig;
        if (letsDanceConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("shared_background_resource_id");
        c09dl.LJJJJJ(letsDanceConfig2.sharedBackgroundResourceId);
        c09dl.LJIILLIIL("particle_animation_type");
        c09dl.LJJJJ(Integer.valueOf(letsDanceConfig2.particleAnimationType));
        c09dl.LJIILLIIL("particle_animation_tolerance_time");
        c09dl.LJJJJ(Integer.valueOf(letsDanceConfig2.particleAnimationToleranceTime));
        c09dl.LJIILLIIL("main_spot_water_mask_url");
        c09dl.LJJJJJ(letsDanceConfig2.mainSpotWaterMaskUrl);
        c09dl.LJIILLIIL("replace_moderator_play_mutex_toast");
        c09dl.LJJJJJL(letsDanceConfig2.replaceModeratorPlayMutexToast);
        c09dl.LJIILLIIL("participant_lets_dance_enabled");
        c09dl.LJJJJJL(letsDanceConfig2.participantLetsDanceEnabled);
        c09dl.LJIILLIIL("score_effect_resource_id");
        c09dl.LJJJJJ(letsDanceConfig2.scoreEffectResourceId);
        c09dl.LJIILLIIL("bubble_switch");
        c09dl.LJJJJJL(letsDanceConfig2.bubbleSwitch);
        c09dl.LJIILLIIL("shared_bg_surface_view_enabled");
        c09dl.LJJJJJL(letsDanceConfig2.sharedBgSurfaceViewEnabled);
        c09dl.LJIILLIIL("mock_switch");
        c09dl.LJJJJJL(letsDanceConfig2.mockSwitch);
        c09dl.LJIILLIIL("show_preview_panel");
        c09dl.LJJJJJL(letsDanceConfig2.showPreviewPanel);
        c09dl.LJIILLIIL("effect_sdk_init_judge");
        c09dl.LJJJJJL(letsDanceConfig2.effectSdkInitJudge);
        c09dl.LJII();
    }
}
