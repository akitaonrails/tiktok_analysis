package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes34.dex */
public final class MultiGuestLiveShowConfig_OptTypeAdapter extends TypeAdapter<MultiGuestLiveShowConfig> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final MultiGuestLiveShowConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        MultiGuestLiveShowConfig multiGuestLiveShowConfig = new MultiGuestLiveShowConfig(1, 0, 2870, 4, 5, 0, 4, 0, -1);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2135938324:
                        if (strLJJJJ.equals("start_animation_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestLiveShowConfig.startAnimationDuration = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -842868118:
                        if (strLJJJJ.equals("banner_refresh_shuffle_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestLiveShowConfig.bannerRefreshShuffleTime = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -506085817:
                        if (strLJJJJ.equals("mute_audio_im_back_up")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestLiveShowConfig.muteAudioImBackUp = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -393032391:
                        if (strLJJJJ.equals("new_version")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestLiveShowConfig.newVersion = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -214557341:
                        if (strLJJJJ.equals("initial_allow_open_mic")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestLiveShowConfig.initialAllowOpenMic = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 179834187:
                        if (strLJJJJ.equals("calibrate_content_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestLiveShowConfig.calibrateContentTime = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 233228668:
                        if (strLJJJJ.equals("animation_downgrade_enabled")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestLiveShowConfig.animationDowngradeEnabled = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 968952645:
                        if (strLJJJJ.equals("enable_calibrate_content")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestLiveShowConfig.enableCalibrateContent = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1585635007:
                        if (strLJJJJ.equals("audience_main_switch")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestLiveShowConfig.audienceMainSwitch = c09cu.LJJIZ();
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
        return multiGuestLiveShowConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, MultiGuestLiveShowConfig multiGuestLiveShowConfig) {
        MultiGuestLiveShowConfig multiGuestLiveShowConfig2 = multiGuestLiveShowConfig;
        if (multiGuestLiveShowConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("audience_main_switch");
        c09dl.LJJJJ(Integer.valueOf(multiGuestLiveShowConfig2.audienceMainSwitch));
        c09dl.LJIILLIIL("initial_allow_open_mic");
        c09dl.LJJJJ(Integer.valueOf(multiGuestLiveShowConfig2.initialAllowOpenMic));
        c09dl.LJIILLIIL("new_version");
        c09dl.LJJJJ(Integer.valueOf(multiGuestLiveShowConfig2.newVersion));
        c09dl.LJIILLIIL("banner_refresh_shuffle_time");
        c09dl.LJJJJ(Integer.valueOf(multiGuestLiveShowConfig2.bannerRefreshShuffleTime));
        c09dl.LJIILLIIL("calibrate_content_time");
        c09dl.LJJJJ(Integer.valueOf(multiGuestLiveShowConfig2.calibrateContentTime));
        c09dl.LJIILLIIL("animation_downgrade_enabled");
        c09dl.LJJJJ(Integer.valueOf(multiGuestLiveShowConfig2.animationDowngradeEnabled));
        c09dl.LJIILLIIL("start_animation_duration");
        c09dl.LJJJJ(Integer.valueOf(multiGuestLiveShowConfig2.startAnimationDuration));
        c09dl.LJIILLIIL("enable_calibrate_content");
        c09dl.LJJJJ(Integer.valueOf(multiGuestLiveShowConfig2.enableCalibrateContent));
        c09dl.LJIILLIIL("mute_audio_im_back_up");
        c09dl.LJJJJ(Integer.valueOf(multiGuestLiveShowConfig2.muteAudioImBackUp));
        c09dl.LJII();
    }
}
