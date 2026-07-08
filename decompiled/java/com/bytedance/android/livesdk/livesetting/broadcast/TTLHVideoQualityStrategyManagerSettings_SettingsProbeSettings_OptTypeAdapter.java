package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.broadcast.TTLHVideoQualityStrategyManagerSettings;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes36.dex */
public final class TTLHVideoQualityStrategyManagerSettings_SettingsProbeSettings_OptTypeAdapter extends TypeAdapter<TTLHVideoQualityStrategyManagerSettings.SettingsProbeSettings> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final TTLHVideoQualityStrategyManagerSettings.SettingsProbeSettings read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        TTLHVideoQualityStrategyManagerSettings.SettingsProbeSettings settingsProbeSettings = new TTLHVideoQualityStrategyManagerSettings.SettingsProbeSettings();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1652358633:
                        if (strLJJJJ.equals("running_probe_low_optimize")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsProbeSettings.setRunningProbeLowOptimize(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1611064963:
                        if (strLJJJJ.equals("enable_anchor_net_probe_confirm_release_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsProbeSettings.setEnableAnchorNetProbeConfirmReleaseOpt(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1427879995:
                        if (strLJJJJ.equals("high_probability_thres")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsProbeSettings.setHighProbeThreshold((float) c09cu.LJJIL());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -61635354:
                        if (strLJJJJ.equals("enable_anchor_net_probe_get_thread_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsProbeSettings.setEnableAnchorNetProbeGetThreadOpt(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 65066817:
                        if (strLJJJJ.equals("duration_thres")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsProbeSettings.setDurationThreshold(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 70155285:
                        if (strLJJJJ.equals("enable_anchor_net_probe_release_thread_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsProbeSettings.setEnableAnchorNetProbeReleaseThreadOpt(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 465334286:
                        if (strLJJJJ.equals("enable_anchor_net_probe_init_thread_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsProbeSettings.setEnableAnchorNetProbeInitThreadOpt(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 469458423:
                        if (strLJJJJ.equals("cmp_history_and_realtime")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsProbeSettings.setCmpHistoryAndRealtime(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 658750201:
                        if (strLJJJJ.equals("enable_anchor_net_probe_release_wait_ms")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsProbeSettings.setEnableAnchorNetProbeReleaseWaitMs(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 978864328:
                        if (strLJJJJ.equals("running_probe_always_use_portrait_result")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsProbeSettings.setRunningProbeAlwaysUsePortraitResult(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1801754317:
                        if (strLJJJJ.equals("enable_portrait_optimize_speed")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsProbeSettings.setEnablePortraitOptimizeSpeed(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1952826615:
                        if (strLJJJJ.equals("low_probability_thres")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsProbeSettings.setLowProbeThreshold((float) c09cu.LJJIL());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2087416269:
                        if (strLJJJJ.equals("fail_no_cache_use_portrait")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsProbeSettings.setFailNoCacheUsePortrait(c09cu.LJJIZ());
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
        return settingsProbeSettings;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, TTLHVideoQualityStrategyManagerSettings.SettingsProbeSettings settingsProbeSettings) throws IOException {
        TTLHVideoQualityStrategyManagerSettings.SettingsProbeSettings settingsProbeSettings2 = settingsProbeSettings;
        if (settingsProbeSettings2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_portrait_optimize_speed");
        c09dl.LJJJJ(Integer.valueOf(settingsProbeSettings2.getEnablePortraitOptimizeSpeed()));
        c09dl.LJIILLIIL("fail_no_cache_use_portrait");
        c09dl.LJJJJ(Integer.valueOf(settingsProbeSettings2.getFailNoCacheUsePortrait()));
        c09dl.LJIILLIIL("running_probe_low_optimize");
        c09dl.LJJJJ(Integer.valueOf(settingsProbeSettings2.getRunningProbeLowOptimize()));
        c09dl.LJIILLIIL("running_probe_always_use_portrait_result");
        c09dl.LJJJJ(Integer.valueOf(settingsProbeSettings2.getRunningProbeAlwaysUsePortraitResult()));
        c09dl.LJIILLIIL("high_probability_thres");
        c09dl.LJJJJ(Float.valueOf(settingsProbeSettings2.getHighProbeThreshold()));
        c09dl.LJIILLIIL("low_probability_thres");
        c09dl.LJJJJ(Float.valueOf(settingsProbeSettings2.getLowProbeThreshold()));
        c09dl.LJIILLIIL("duration_thres");
        c09dl.LJJIZ(settingsProbeSettings2.getDurationThreshold());
        c09dl.LJIILLIIL("cmp_history_and_realtime");
        c09dl.LJJJJ(Integer.valueOf(settingsProbeSettings2.getCmpHistoryAndRealtime()));
        c09dl.LJIILLIIL("enable_anchor_net_probe_init_thread_opt");
        c09dl.LJJJJ(Integer.valueOf(settingsProbeSettings2.getEnableAnchorNetProbeInitThreadOpt()));
        c09dl.LJIILLIIL("enable_anchor_net_probe_release_thread_opt");
        c09dl.LJJJJ(Integer.valueOf(settingsProbeSettings2.getEnableAnchorNetProbeReleaseThreadOpt()));
        c09dl.LJIILLIIL("enable_anchor_net_probe_get_thread_opt");
        c09dl.LJJJJ(Integer.valueOf(settingsProbeSettings2.getEnableAnchorNetProbeGetThreadOpt()));
        c09dl.LJIILLIIL("enable_anchor_net_probe_confirm_release_opt");
        c09dl.LJJJJ(Integer.valueOf(settingsProbeSettings2.getEnableAnchorNetProbeConfirmReleaseOpt()));
        c09dl.LJIILLIIL("enable_anchor_net_probe_release_wait_ms");
        c09dl.LJJJJ(Integer.valueOf(settingsProbeSettings2.getEnableAnchorNetProbeReleaseWaitMs()));
        c09dl.LJII();
    }
}
