package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.broadcast.TTLHVideoQualityStrategyManagerGameSettings;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes36.dex */
public final class TTLHVideoQualityStrategyManagerGameSettings_SettingsVideoQualityGameProbeConfig_OptTypeAdapter extends TypeAdapter<TTLHVideoQualityStrategyManagerGameSettings.SettingsVideoQualityGameProbeConfig> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final TTLHVideoQualityStrategyManagerGameSettings.SettingsVideoQualityGameProbeConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        TTLHVideoQualityStrategyManagerGameSettings.SettingsVideoQualityGameProbeConfig settingsVideoQualityGameProbeConfig = new TTLHVideoQualityStrategyManagerGameSettings.SettingsVideoQualityGameProbeConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1925844874:
                        if (strLJJJJ.equals("probe_finish_bad_bitrate")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsVideoQualityGameProbeConfig.setProbeFinishBadBitrate(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1725932836:
                        if (strLJJJJ.equals("probe_max_times")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsVideoQualityGameProbeConfig.setProbeMaxTimes(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1712521933:
                        if (strLJJJJ.equals("probe_timeout_ms")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsVideoQualityGameProbeConfig.setProbeTimeoutMs(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1611064963:
                        if (strLJJJJ.equals("enable_anchor_net_probe_confirm_release_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsVideoQualityGameProbeConfig.setEnableAnchorNetProbeConfirmReleaseOpt(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1347296780:
                        if (strLJJJJ.equals("enable_probe")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsVideoQualityGameProbeConfig.setEnableProbe(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1328184949:
                        if (strLJJJJ.equals("memory_cache_valid_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsVideoQualityGameProbeConfig.setMemoryCacheValidTime(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1087839111:
                        if (strLJJJJ.equals("cache_check_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsVideoQualityGameProbeConfig.setCacheCheckInterval(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -948427725:
                        if (strLJJJJ.equals("enable_probe_opt_v2")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsVideoQualityGameProbeConfig.setEnableProbeOptV2(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -859572329:
                        if (strLJJJJ.equals("cache_valid_days")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsVideoQualityGameProbeConfig.setCacheValidDays(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -61635354:
                        if (strLJJJJ.equals("enable_anchor_net_probe_get_thread_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsVideoQualityGameProbeConfig.setEnableAnchorNetProbeGetThreadOpt(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 70155285:
                        if (strLJJJJ.equals("enable_anchor_net_probe_release_thread_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsVideoQualityGameProbeConfig.setEnableAnchorNetProbeReleaseThreadOpt(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 116061358:
                        if (strLJJJJ.equals("probe_align_report_probe_result")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsVideoQualityGameProbeConfig.setProbeAlignReportProbeResult(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 197042805:
                        if (strLJJJJ.equals("good_network_bottom_line")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsVideoQualityGameProbeConfig.setGoodNetworkBottomLine(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 465334286:
                        if (strLJJJJ.equals("enable_anchor_net_probe_init_thread_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsVideoQualityGameProbeConfig.setEnableAnchorNetProbeInitThreadOpt(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 599368214:
                        if (strLJJJJ.equals("enable_probe_timeout")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsVideoQualityGameProbeConfig.setEnableProbeTimeout(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 658750201:
                        if (strLJJJJ.equals("enable_anchor_net_probe_release_wait_ms")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsVideoQualityGameProbeConfig.setEnableAnchorNetProbeReleaseWaitMs(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1011530341:
                        if (strLJJJJ.equals("enable_io_cache")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsVideoQualityGameProbeConfig.setEnableIOCache(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1072145870:
                        if (strLJJJJ.equals("enable_current_probe_result")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsVideoQualityGameProbeConfig.setEnableCurrentProbeResult(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1739242108:
                        if (strLJJJJ.equals("manual_probe_switch")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsVideoQualityGameProbeConfig.setManualProbeSwitch(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1899439519:
                        if (strLJJJJ.equals("normal_network_bottom_line")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsVideoQualityGameProbeConfig.setNormalNetworkBottomLine(c09cu.LJJIZ());
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
        return settingsVideoQualityGameProbeConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, TTLHVideoQualityStrategyManagerGameSettings.SettingsVideoQualityGameProbeConfig settingsVideoQualityGameProbeConfig) {
        TTLHVideoQualityStrategyManagerGameSettings.SettingsVideoQualityGameProbeConfig settingsVideoQualityGameProbeConfig2 = settingsVideoQualityGameProbeConfig;
        if (settingsVideoQualityGameProbeConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_probe");
        c09dl.LJJJJ(Integer.valueOf(settingsVideoQualityGameProbeConfig2.getEnableProbe()));
        c09dl.LJIILLIIL("enable_current_probe_result");
        c09dl.LJJJJ(Integer.valueOf(settingsVideoQualityGameProbeConfig2.getEnableCurrentProbeResult()));
        c09dl.LJIILLIIL("enable_io_cache");
        c09dl.LJJJJ(Integer.valueOf(settingsVideoQualityGameProbeConfig2.getEnableIOCache()));
        c09dl.LJIILLIIL("cache_check_interval");
        c09dl.LJJJJ(Integer.valueOf(settingsVideoQualityGameProbeConfig2.getCacheCheckInterval()));
        c09dl.LJIILLIIL("cache_valid_days");
        c09dl.LJJJJ(Integer.valueOf(settingsVideoQualityGameProbeConfig2.getCacheValidDays()));
        c09dl.LJIILLIIL("probe_max_times");
        c09dl.LJJJJ(Integer.valueOf(settingsVideoQualityGameProbeConfig2.getProbeMaxTimes()));
        c09dl.LJIILLIIL("enable_probe_timeout");
        c09dl.LJJJJ(Integer.valueOf(settingsVideoQualityGameProbeConfig2.getEnableProbeTimeout()));
        c09dl.LJIILLIIL("probe_timeout_ms");
        c09dl.LJJJJ(Integer.valueOf(settingsVideoQualityGameProbeConfig2.getProbeTimeoutMs()));
        c09dl.LJIILLIIL("probe_finish_bad_bitrate");
        c09dl.LJJJJ(Integer.valueOf(settingsVideoQualityGameProbeConfig2.getProbeFinishBadBitrate()));
        c09dl.LJIILLIIL("manual_probe_switch");
        c09dl.LJJJJ(Integer.valueOf(settingsVideoQualityGameProbeConfig2.getManualProbeSwitch()));
        c09dl.LJIILLIIL("enable_probe_opt_v2");
        c09dl.LJJJJ(Integer.valueOf(settingsVideoQualityGameProbeConfig2.getEnableProbeOptV2()));
        c09dl.LJIILLIIL("normal_network_bottom_line");
        c09dl.LJJJJ(Integer.valueOf(settingsVideoQualityGameProbeConfig2.getNormalNetworkBottomLine()));
        c09dl.LJIILLIIL("good_network_bottom_line");
        c09dl.LJJJJ(Integer.valueOf(settingsVideoQualityGameProbeConfig2.getGoodNetworkBottomLine()));
        c09dl.LJIILLIIL("memory_cache_valid_time");
        c09dl.LJJJJ(Integer.valueOf(settingsVideoQualityGameProbeConfig2.getMemoryCacheValidTime()));
        c09dl.LJIILLIIL("probe_align_report_probe_result");
        c09dl.LJJJJ(Integer.valueOf(settingsVideoQualityGameProbeConfig2.getProbeAlignReportProbeResult()));
        c09dl.LJIILLIIL("enable_anchor_net_probe_init_thread_opt");
        c09dl.LJJJJ(Integer.valueOf(settingsVideoQualityGameProbeConfig2.getEnableAnchorNetProbeInitThreadOpt()));
        c09dl.LJIILLIIL("enable_anchor_net_probe_release_thread_opt");
        c09dl.LJJJJ(Integer.valueOf(settingsVideoQualityGameProbeConfig2.getEnableAnchorNetProbeReleaseThreadOpt()));
        c09dl.LJIILLIIL("enable_anchor_net_probe_get_thread_opt");
        c09dl.LJJJJ(Integer.valueOf(settingsVideoQualityGameProbeConfig2.getEnableAnchorNetProbeGetThreadOpt()));
        c09dl.LJIILLIIL("enable_anchor_net_probe_confirm_release_opt");
        c09dl.LJJJJ(Integer.valueOf(settingsVideoQualityGameProbeConfig2.getEnableAnchorNetProbeConfirmReleaseOpt()));
        c09dl.LJIILLIIL("enable_anchor_net_probe_release_wait_ms");
        c09dl.LJJJJ(Integer.valueOf(settingsVideoQualityGameProbeConfig2.getEnableAnchorNetProbeReleaseWaitMs()));
        c09dl.LJII();
    }
}
