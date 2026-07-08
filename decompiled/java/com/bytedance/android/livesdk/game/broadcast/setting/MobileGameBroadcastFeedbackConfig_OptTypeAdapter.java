package com.bytedance.android.livesdk.game.broadcast.setting;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes36.dex */
public final class MobileGameBroadcastFeedbackConfig_OptTypeAdapter extends TypeAdapter<MobileGameBroadcastFeedbackConfig> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final MobileGameBroadcastFeedbackConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        MobileGameBroadcastFeedbackConfig mobileGameBroadcastFeedbackConfig = new MobileGameBroadcastFeedbackConfig(45, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, 20, 0.7f, 0.9f, 60, 0.4f, 60, 0.4f, 20, 120, 100, 0.3f, 10, 100, 5);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1466780022:
                        if (strLJJJJ.equals("ping_high_proportion")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                mobileGameBroadcastFeedbackConfig.setPing_high_proportion((float) c09cu.LJJIL());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1209875265:
                        if (strLJJJJ.equals("rtt_lasting")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                mobileGameBroadcastFeedbackConfig.setRtt_lasting(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1109450514:
                        if (strLJJJJ.equals("power_save_mode_proportion")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                mobileGameBroadcastFeedbackConfig.setPower_save_mode_proportion((float) c09cu.LJJIL());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -917477108:
                        if (strLJJJJ.equals("real_bitrate_less_min_lasting")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                mobileGameBroadcastFeedbackConfig.setReal_bitrate_less_min_lasting(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -459983649:
                        if (strLJJJJ.equals("power_low_proportion")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                mobileGameBroadcastFeedbackConfig.setPower_low_proportion((float) c09cu.LJJIL());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -193804810:
                        if (strLJJJJ.equals("battery_temp_android")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                mobileGameBroadcastFeedbackConfig.setBattery_temp_android(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 100373934:
                        if (strLJJJJ.equals("rtt_size")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                mobileGameBroadcastFeedbackConfig.setRtt_size(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 278363928:
                        if (strLJJJJ.equals("real_fps_size")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                mobileGameBroadcastFeedbackConfig.setReal_fps_size(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 486258289:
                        if (strLJJJJ.equals("real_fps_proportion")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                mobileGameBroadcastFeedbackConfig.setReal_fps_proportion((float) c09cu.LJJIL());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 620528915:
                        if (strLJJJJ.equals("battery_temp_lasting")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                mobileGameBroadcastFeedbackConfig.setBattery_temp_lasting(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 845500698:
                        if (strLJJJJ.equals("power_low")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                mobileGameBroadcastFeedbackConfig.setPower_low(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 989278902:
                        if (strLJJJJ.equals("ping_number")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                mobileGameBroadcastFeedbackConfig.setPing_number(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1147082852:
                        if (strLJJJJ.equals("ping_value")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                mobileGameBroadcastFeedbackConfig.setPing_value(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1300392725:
                        if (strLJJJJ.equals("real_fps_lasting")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                mobileGameBroadcastFeedbackConfig.setReal_fps_lasting(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1702945050:
                        if (strLJJJJ.equals("real_bitrate_less_min_proportion")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                mobileGameBroadcastFeedbackConfig.setReal_bitrate_less_min_proportion((float) c09cu.LJJIL());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2111354457:
                        if (strLJJJJ.equals("livecore_data_sample_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                mobileGameBroadcastFeedbackConfig.setLivecore_data_sample_interval(c09cu.LJJIZ());
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
        return mobileGameBroadcastFeedbackConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, MobileGameBroadcastFeedbackConfig mobileGameBroadcastFeedbackConfig) {
        MobileGameBroadcastFeedbackConfig mobileGameBroadcastFeedbackConfig2 = mobileGameBroadcastFeedbackConfig;
        if (mobileGameBroadcastFeedbackConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("battery_temp_android");
        c09dl.LJJJJ(Integer.valueOf(mobileGameBroadcastFeedbackConfig2.getBattery_temp_android()));
        c09dl.LJIILLIIL("battery_temp_lasting");
        c09dl.LJJJJ(Integer.valueOf(mobileGameBroadcastFeedbackConfig2.getBattery_temp_lasting()));
        c09dl.LJIILLIIL("power_low");
        c09dl.LJJJJ(Integer.valueOf(mobileGameBroadcastFeedbackConfig2.getPower_low()));
        c09dl.LJIILLIIL("power_low_proportion");
        c09dl.LJJJJ(Float.valueOf(mobileGameBroadcastFeedbackConfig2.getPower_low_proportion()));
        c09dl.LJIILLIIL("power_save_mode_proportion");
        c09dl.LJJJJ(Float.valueOf(mobileGameBroadcastFeedbackConfig2.getPower_save_mode_proportion()));
        c09dl.LJIILLIIL("real_bitrate_less_min_lasting");
        c09dl.LJJJJ(Integer.valueOf(mobileGameBroadcastFeedbackConfig2.getReal_bitrate_less_min_lasting()));
        c09dl.LJIILLIIL("real_bitrate_less_min_proportion");
        c09dl.LJJJJ(Float.valueOf(mobileGameBroadcastFeedbackConfig2.getReal_bitrate_less_min_proportion()));
        c09dl.LJIILLIIL("real_fps_lasting");
        c09dl.LJJJJ(Integer.valueOf(mobileGameBroadcastFeedbackConfig2.getReal_fps_lasting()));
        c09dl.LJIILLIIL("real_fps_proportion");
        c09dl.LJJJJ(Float.valueOf(mobileGameBroadcastFeedbackConfig2.getReal_fps_proportion()));
        c09dl.LJIILLIIL("real_fps_size");
        c09dl.LJJJJ(Integer.valueOf(mobileGameBroadcastFeedbackConfig2.getReal_fps_size()));
        c09dl.LJIILLIIL("rtt_lasting");
        c09dl.LJJJJ(Integer.valueOf(mobileGameBroadcastFeedbackConfig2.getRtt_lasting()));
        c09dl.LJIILLIIL("rtt_size");
        c09dl.LJJJJ(Integer.valueOf(mobileGameBroadcastFeedbackConfig2.getRtt_size()));
        c09dl.LJIILLIIL("ping_high_proportion");
        c09dl.LJJJJ(Float.valueOf(mobileGameBroadcastFeedbackConfig2.getPing_high_proportion()));
        c09dl.LJIILLIIL("ping_number");
        c09dl.LJJJJ(Integer.valueOf(mobileGameBroadcastFeedbackConfig2.getPing_number()));
        c09dl.LJIILLIIL("ping_value");
        c09dl.LJJJJ(Integer.valueOf(mobileGameBroadcastFeedbackConfig2.getPing_value()));
        c09dl.LJIILLIIL("livecore_data_sample_interval");
        c09dl.LJJJJ(Integer.valueOf(mobileGameBroadcastFeedbackConfig2.getLivecore_data_sample_interval()));
        c09dl.LJII();
    }
}
