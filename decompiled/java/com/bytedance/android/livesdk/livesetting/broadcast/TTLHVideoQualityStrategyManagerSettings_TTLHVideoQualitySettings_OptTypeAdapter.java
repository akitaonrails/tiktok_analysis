package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.bytedance.android.livesdk.livesetting.broadcast.TTLHVideoQualityStrategyManagerSettings;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes36.dex */
public final class TTLHVideoQualityStrategyManagerSettings_TTLHVideoQualitySettings_OptTypeAdapter extends TypeAdapter<TTLHVideoQualityStrategyManagerSettings.TTLHVideoQualitySettings> {
    public final Gson LIZ;

    public TTLHVideoQualityStrategyManagerSettings_TTLHVideoQualitySettings_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final TTLHVideoQualityStrategyManagerSettings.TTLHVideoQualitySettings read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        TTLHVideoQualityStrategyManagerSettings.TTLHVideoQualitySettings tTLHVideoQualitySettings = new TTLHVideoQualityStrategyManagerSettings.TTLHVideoQualitySettings();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2087122594:
                        if (strLJJJJ.equals("ttlh_offline_540p")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tTLHVideoQualitySettings.setEnableTTLHOffline540p(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1568845671:
                        if (strLJJJJ.equals("ttlh_gear_select_enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tTLHVideoQualitySettings.setEnableGearSelect(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1160896893:
                        if (strLJJJJ.equals("enable_cache_read_write_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tTLHVideoQualitySettings.setEnableCacheReadWriteOpt(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1156614623:
                        if (strLJJJJ.equals("enable_lyrax_prober")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tTLHVideoQualitySettings.setEnableAnchorNetLyraxProbe(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1141066684:
                        if (strLJJJJ.equals("ttlh_support_resolution_list_enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tTLHVideoQualitySettings.setEnableSupportResolutionList(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1136179666:
                        if (strLJJJJ.equals("gear_center_sync_timeout_ms")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tTLHVideoQualitySettings.setGearCenterSyncTimeoutMs(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1107617459:
                        if (strLJJJJ.equals("ttlh_portraits_enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tTLHVideoQualitySettings.setEnablePortraits(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -553748371:
                        if (strLJJJJ.equals("enable_cache_ignore_recommend_level")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tTLHVideoQualitySettings.setEnableCacheIgnoreRecommendLevel(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -545020295:
                        if (strLJJJJ.equals("ttlh_video_quality_bitrate_settings_map")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tTLHVideoQualitySettings.setBitrateConfigs((Map) this.LIZ.LJIIIZ(new TypeToken<Map<String, ? extends Map<String, ? extends TTLHVideoQualityStrategyManagerSettings.SettingsBitrateConfig>>>() { // from class: X.1D2X
                                }).read(c09cu));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -543179480:
                        if (strLJJJJ.equals("ttlh_video_quality_strategy_settings")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tTLHVideoQualitySettings.setStrategyConfigs(C473040Igo.LIZIZ(this.LIZ, c09cu, TTLHVideoQualityStrategyManagerSettings.SettingsStrategyConfig.class));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -128589864:
                        if (strLJJJJ.equals("enable_new_structure")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tTLHVideoQualitySettings.setEnableNewStructure(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 4572054:
                        if (strLJJJJ.equals("ttlh_enable_cache_gear_select")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tTLHVideoQualitySettings.setEnableCacheGearSelect(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 76967557:
                        if (strLJJJJ.equals("gear_center_mock_data")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tTLHVideoQualitySettings.setGearCenterMockData(C473040Igo.LIZIZ(this.LIZ, c09cu, Object.class));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 153359633:
                        if (strLJJJJ.equals("ttlh_enable_video_quality_downgrade_mock")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tTLHVideoQualitySettings.setMockSettings(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 154262064:
                        if (strLJJJJ.equals("ttlh_video_quality_enable_trace")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tTLHVideoQualitySettings.setEnableTraceReport(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 431590967:
                        if (strLJJJJ.equals("ttlh_valid_resolution_list_enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tTLHVideoQualitySettings.setEnableTTLHValidResolutionList(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 565148925:
                        if (strLJJJJ.equals("ttlh_video_quality_gear_select_settings")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tTLHVideoQualitySettings.setSettingsGearSelectStageConfigs(C473040Igo.LIZIZ(this.LIZ, c09cu, TTLHVideoQualityStrategyManagerSettings.SettingsGearSelectStageConfig.class));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 627315771:
                        if (strLJJJJ.equals("enable_post_process_delegation")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tTLHVideoQualitySettings.setEnablePostProcessDelegation(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 697141496:
                        if (strLJJJJ.equals("ttlh_video_quality_enable_alog")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tTLHVideoQualitySettings.setEnableALogReport(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 765606384:
                        if (strLJJJJ.equals("ttlh_recommend_resolution_enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tTLHVideoQualitySettings.setEnableTTLHRecommendResolution(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1063554233:
                        if (strLJJJJ.equals("ttlh_video_quality_probe_settings")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tTLHVideoQualitySettings.setServerProbeSettings((TTLHVideoQualityStrategyManagerSettings.SettingsProbeSettings) this.LIZ.LJIIJ(TTLHVideoQualityStrategyManagerSettings.SettingsProbeSettings.class).read(c09cu));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1068809296:
                        if (strLJJJJ.equals("ttlh_video_quality_portraits_config")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tTLHVideoQualitySettings.setPortraitsConfigs(C473040Igo.LIZIZ(this.LIZ, c09cu, TTLHVideoQualityStrategyManagerSettings.SettingsPortraitsConfig.class));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1091230540:
                        if (strLJJJJ.equals("ttlh_video_quality_log_report_settings")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tTLHVideoQualitySettings.setLogReportSetting(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1130234337:
                        if (strLJJJJ.equals("ttlh_set_bitrate_params_type")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tTLHVideoQualitySettings.setSetBitrateParamsType(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1172556256:
                        if (strLJJJJ.equals("ttlh_stop_probe_after_golive")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tTLHVideoQualitySettings.setEnableGoLiveStopProbe(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1205776980:
                        if (strLJJJJ.equals("gear_center_strategy_config")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tTLHVideoQualitySettings.setGearCenterStrategyConfig(C473040Igo.LIZIZ(this.LIZ, c09cu, Object.class));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1414415062:
                        if (strLJJJJ.equals("ttlh_enable_vq_strategy_center")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tTLHVideoQualitySettings.setEnableStrategyCenter(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1520847787:
                        if (strLJJJJ.equals("gear_center_probe_config")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tTLHVideoQualitySettings.setGearCenterProbeConfig(C473040Igo.LIZIZ(this.LIZ, c09cu, Object.class));
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
        return tTLHVideoQualitySettings;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, TTLHVideoQualityStrategyManagerSettings.TTLHVideoQualitySettings tTLHVideoQualitySettings) throws IOException {
        TTLHVideoQualityStrategyManagerSettings.TTLHVideoQualitySettings tTLHVideoQualitySettings2 = tTLHVideoQualitySettings;
        if (tTLHVideoQualitySettings2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("ttlh_set_bitrate_params_type");
        c09dl.LJJJJ(Integer.valueOf(tTLHVideoQualitySettings2.getSetBitrateParamsType()));
        c09dl.LJIILLIIL("ttlh_video_quality_log_report_settings");
        c09dl.LJJJJ(Integer.valueOf(tTLHVideoQualitySettings2.getLogReportSetting()));
        c09dl.LJIILLIIL("ttlh_video_quality_enable_alog");
        c09dl.LJJJJ(Integer.valueOf(tTLHVideoQualitySettings2.getEnableALogReport()));
        c09dl.LJIILLIIL("ttlh_video_quality_enable_trace");
        c09dl.LJJJJ(Integer.valueOf(tTLHVideoQualitySettings2.getEnableTraceReport()));
        c09dl.LJIILLIIL("ttlh_support_resolution_list_enable");
        c09dl.LJJJJ(Integer.valueOf(tTLHVideoQualitySettings2.getEnableSupportResolutionList()));
        c09dl.LJIILLIIL("ttlh_gear_select_enable");
        c09dl.LJJJJ(Integer.valueOf(tTLHVideoQualitySettings2.getEnableGearSelect()));
        c09dl.LJIILLIIL("ttlh_portraits_enable");
        c09dl.LJJJJ(Integer.valueOf(tTLHVideoQualitySettings2.getEnablePortraits()));
        c09dl.LJIILLIIL("ttlh_valid_resolution_list_enable");
        c09dl.LJJJJ(Integer.valueOf(tTLHVideoQualitySettings2.getEnableTTLHValidResolutionList()));
        c09dl.LJIILLIIL("ttlh_recommend_resolution_enable");
        c09dl.LJJJJ(Integer.valueOf(tTLHVideoQualitySettings2.getEnableTTLHRecommendResolution()));
        c09dl.LJIILLIIL("ttlh_offline_540p");
        c09dl.LJJJJ(Integer.valueOf(tTLHVideoQualitySettings2.getEnableTTLHOffline540p()));
        c09dl.LJIILLIIL("ttlh_enable_cache_gear_select");
        c09dl.LJJJJ(Integer.valueOf(tTLHVideoQualitySettings2.getEnableCacheGearSelect()));
        c09dl.LJIILLIIL("ttlh_enable_video_quality_downgrade_mock");
        c09dl.LJJJJ(Integer.valueOf(tTLHVideoQualitySettings2.getMockSettings()));
        c09dl.LJIILLIIL("ttlh_enable_vq_strategy_center");
        c09dl.LJJJJ(Integer.valueOf(tTLHVideoQualitySettings2.getEnableStrategyCenter()));
        c09dl.LJIILLIIL("ttlh_video_quality_strategy_settings");
        C473040Igo.LJ(this.LIZ, c09dl, tTLHVideoQualitySettings2.getStrategyConfigs(), TTLHVideoQualityStrategyManagerSettings.SettingsStrategyConfig.class);
        c09dl.LJIILLIIL("ttlh_video_quality_bitrate_settings_map");
        this.LIZ.LJIIIZ(new TypeToken<Map<String, ? extends Map<String, ? extends TTLHVideoQualityStrategyManagerSettings.SettingsBitrateConfig>>>() { // from class: X.1D2Y
        }).write(c09dl, tTLHVideoQualitySettings2.getBitrateConfigs());
        c09dl.LJIILLIIL("ttlh_video_quality_gear_select_settings");
        C473040Igo.LJ(this.LIZ, c09dl, tTLHVideoQualitySettings2.getSettingsGearSelectStageConfigs(), TTLHVideoQualityStrategyManagerSettings.SettingsGearSelectStageConfig.class);
        c09dl.LJIILLIIL("ttlh_video_quality_portraits_config");
        C473040Igo.LJ(this.LIZ, c09dl, tTLHVideoQualitySettings2.getPortraitsConfigs(), TTLHVideoQualityStrategyManagerSettings.SettingsPortraitsConfig.class);
        c09dl.LJIILLIIL("ttlh_video_quality_probe_settings");
        this.LIZ.LJIIJ(TTLHVideoQualityStrategyManagerSettings.SettingsProbeSettings.class).write(c09dl, tTLHVideoQualitySettings2.getServerProbeSettings());
        c09dl.LJIILLIIL("ttlh_stop_probe_after_golive");
        c09dl.LJJJJ(Integer.valueOf(tTLHVideoQualitySettings2.getEnableGoLiveStopProbe()));
        c09dl.LJIILLIIL("enable_lyrax_prober");
        c09dl.LJJJJ(Integer.valueOf(tTLHVideoQualitySettings2.getEnableAnchorNetLyraxProbe()));
        c09dl.LJIILLIIL("enable_post_process_delegation");
        c09dl.LJJJJ(Integer.valueOf(tTLHVideoQualitySettings2.getEnablePostProcessDelegation()));
        c09dl.LJIILLIIL("enable_cache_ignore_recommend_level");
        c09dl.LJJJJ(Integer.valueOf(tTLHVideoQualitySettings2.getEnableCacheIgnoreRecommendLevel()));
        c09dl.LJIILLIIL("enable_cache_read_write_opt");
        c09dl.LJJJJ(Integer.valueOf(tTLHVideoQualitySettings2.getEnableCacheReadWriteOpt()));
        c09dl.LJIILLIIL("enable_new_structure");
        c09dl.LJJJJ(Integer.valueOf(tTLHVideoQualitySettings2.getEnableNewStructure()));
        c09dl.LJIILLIIL("gear_center_mock_data");
        C473040Igo.LJ(this.LIZ, c09dl, tTLHVideoQualitySettings2.getGearCenterMockData(), Object.class);
        c09dl.LJIILLIIL("gear_center_strategy_config");
        C473040Igo.LJ(this.LIZ, c09dl, tTLHVideoQualitySettings2.getGearCenterStrategyConfig(), Object.class);
        c09dl.LJIILLIIL("gear_center_probe_config");
        C473040Igo.LJ(this.LIZ, c09dl, tTLHVideoQualitySettings2.getGearCenterProbeConfig(), Object.class);
        c09dl.LJIILLIIL("gear_center_sync_timeout_ms");
        c09dl.LJJIZ(tTLHVideoQualitySettings2.getGearCenterSyncTimeoutMs());
        c09dl.LJII();
    }
}
