package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.bytedance.android.livesdk.livesetting.broadcast.TTLHVideoQualityStrategyManagerGameSettings;
import com.bytedance.android.livesdk.livesetting.broadcast.TTLHVideoQualityStrategyManagerSettings;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes36.dex */
public final class TTLHVideoQualityStrategyManagerGameSettings_TTLHVideoQualityGameSettings_OptTypeAdapter extends TypeAdapter<TTLHVideoQualityStrategyManagerGameSettings.TTLHVideoQualityGameSettings> {
    public final Gson LIZ;

    public TTLHVideoQualityStrategyManagerGameSettings_TTLHVideoQualityGameSettings_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final TTLHVideoQualityStrategyManagerGameSettings.TTLHVideoQualityGameSettings read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        TTLHVideoQualityStrategyManagerGameSettings.TTLHVideoQualityGameSettings tTLHVideoQualityGameSettings = new TTLHVideoQualityStrategyManagerGameSettings.TTLHVideoQualityGameSettings();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1743924131:
                        if (strLJJJJ.equals("enable_overwrite_gear_result")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tTLHVideoQualityGameSettings.setEnableOverwriteGearResult(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1136179666:
                        if (strLJJJJ.equals("gear_center_sync_timeout_ms")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tTLHVideoQualityGameSettings.setGearCenterSyncTimeoutMs(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -545020295:
                        if (strLJJJJ.equals("ttlh_video_quality_bitrate_settings_map")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tTLHVideoQualityGameSettings.setBitrateConfigs((Map) this.LIZ.LJIIIZ(new TypeToken<Map<String, ? extends Map<String, ? extends TTLHVideoQualityStrategyManagerSettings.SettingsBitrateConfig>>>() { // from class: X.1D2V
                                }).read(c09cu));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -543179480:
                        if (strLJJJJ.equals("ttlh_video_quality_strategy_settings")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tTLHVideoQualityGameSettings.setStrategyConfigs(C473040Igo.LIZIZ(this.LIZ, c09cu, TTLHVideoQualityStrategyManagerSettings.SettingsStrategyConfig.class));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -128589864:
                        if (strLJJJJ.equals("enable_new_structure")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tTLHVideoQualityGameSettings.setEnableNewStructure(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -9928360:
                        if (strLJJJJ.equals("ttlh_video_quality_probe_config")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tTLHVideoQualityGameSettings.setSettingsVideoQualityGameProbeConfig((TTLHVideoQualityStrategyManagerGameSettings.SettingsVideoQualityGameProbeConfig) this.LIZ.LJIIJ(TTLHVideoQualityStrategyManagerGameSettings.SettingsVideoQualityGameProbeConfig.class).read(c09cu));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 76967557:
                        if (strLJJJJ.equals("gear_center_mock_data")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tTLHVideoQualityGameSettings.setGearCenterMockData(C473040Igo.LIZIZ(this.LIZ, c09cu, Object.class));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 153359633:
                        if (strLJJJJ.equals("ttlh_enable_video_quality_downgrade_mock")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tTLHVideoQualityGameSettings.setMockSettings(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 154262064:
                        if (strLJJJJ.equals("ttlh_video_quality_enable_trace")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tTLHVideoQualityGameSettings.setEnableTraceReport(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 565148925:
                        if (strLJJJJ.equals("ttlh_video_quality_gear_select_settings")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tTLHVideoQualityGameSettings.setSettingsGearSelectGameConfigs(C473040Igo.LIZIZ(this.LIZ, c09cu, TTLHVideoQualityStrategyManagerGameSettings.SettingsGearSelectGameConfig.class));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 697141496:
                        if (strLJJJJ.equals("ttlh_video_quality_enable_alog")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tTLHVideoQualityGameSettings.setEnableALogReport(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1091230540:
                        if (strLJJJJ.equals("ttlh_video_quality_log_report_settings")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tTLHVideoQualityGameSettings.setLogReportSetting(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1130234337:
                        if (strLJJJJ.equals("ttlh_set_bitrate_params_type")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tTLHVideoQualityGameSettings.setSetBitrateParamsType(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1205776980:
                        if (strLJJJJ.equals("gear_center_strategy_config")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tTLHVideoQualityGameSettings.setGearCenterStrategyConfig(C473040Igo.LIZIZ(this.LIZ, c09cu, Object.class));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1414415062:
                        if (strLJJJJ.equals("ttlh_enable_vq_strategy_center")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tTLHVideoQualityGameSettings.setEnableStrategyCenter(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1520847787:
                        if (strLJJJJ.equals("gear_center_probe_config")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tTLHVideoQualityGameSettings.setGearCenterProbeConfig(C473040Igo.LIZIZ(this.LIZ, c09cu, Object.class));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1774725878:
                        if (strLJJJJ.equals("ttlh_video_quality_rtc_probe_config")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tTLHVideoQualityGameSettings.setRtcProbeConfig((TTLHVideoQualityStrategyManagerGameSettings.RtcProbeConfig) this.LIZ.LJIIJ(TTLHVideoQualityStrategyManagerGameSettings.RtcProbeConfig.class).read(c09cu));
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
        return tTLHVideoQualityGameSettings;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, TTLHVideoQualityStrategyManagerGameSettings.TTLHVideoQualityGameSettings tTLHVideoQualityGameSettings) throws IOException {
        TTLHVideoQualityStrategyManagerGameSettings.TTLHVideoQualityGameSettings tTLHVideoQualityGameSettings2 = tTLHVideoQualityGameSettings;
        if (tTLHVideoQualityGameSettings2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("ttlh_set_bitrate_params_type");
        c09dl.LJJJJ(Integer.valueOf(tTLHVideoQualityGameSettings2.getSetBitrateParamsType()));
        c09dl.LJIILLIIL("ttlh_video_quality_log_report_settings");
        c09dl.LJJJJ(Integer.valueOf(tTLHVideoQualityGameSettings2.getLogReportSetting()));
        c09dl.LJIILLIIL("ttlh_video_quality_enable_alog");
        c09dl.LJJJJ(Integer.valueOf(tTLHVideoQualityGameSettings2.getEnableALogReport()));
        c09dl.LJIILLIIL("ttlh_video_quality_enable_trace");
        c09dl.LJJJJ(Integer.valueOf(tTLHVideoQualityGameSettings2.getEnableTraceReport()));
        c09dl.LJIILLIIL("enable_overwrite_gear_result");
        c09dl.LJJJJ(Integer.valueOf(tTLHVideoQualityGameSettings2.getEnableOverwriteGearResult()));
        c09dl.LJIILLIIL("ttlh_enable_video_quality_downgrade_mock");
        c09dl.LJJJJ(Integer.valueOf(tTLHVideoQualityGameSettings2.getMockSettings()));
        c09dl.LJIILLIIL("ttlh_enable_vq_strategy_center");
        c09dl.LJJJJ(Integer.valueOf(tTLHVideoQualityGameSettings2.getEnableStrategyCenter()));
        c09dl.LJIILLIIL("ttlh_video_quality_strategy_settings");
        C473040Igo.LJ(this.LIZ, c09dl, tTLHVideoQualityGameSettings2.getStrategyConfigs(), TTLHVideoQualityStrategyManagerSettings.SettingsStrategyConfig.class);
        c09dl.LJIILLIIL("ttlh_video_quality_bitrate_settings_map");
        this.LIZ.LJIIIZ(new TypeToken<Map<String, ? extends Map<String, ? extends TTLHVideoQualityStrategyManagerSettings.SettingsBitrateConfig>>>() { // from class: X.1D2W
        }).write(c09dl, tTLHVideoQualityGameSettings2.getBitrateConfigs());
        c09dl.LJIILLIIL("ttlh_video_quality_gear_select_settings");
        C473040Igo.LJ(this.LIZ, c09dl, tTLHVideoQualityGameSettings2.getSettingsGearSelectGameConfigs(), TTLHVideoQualityStrategyManagerGameSettings.SettingsGearSelectGameConfig.class);
        c09dl.LJIILLIIL("ttlh_video_quality_probe_config");
        this.LIZ.LJIIJ(TTLHVideoQualityStrategyManagerGameSettings.SettingsVideoQualityGameProbeConfig.class).write(c09dl, tTLHVideoQualityGameSettings2.getSettingsVideoQualityGameProbeConfig());
        c09dl.LJIILLIIL("ttlh_video_quality_rtc_probe_config");
        this.LIZ.LJIIJ(TTLHVideoQualityStrategyManagerGameSettings.RtcProbeConfig.class).write(c09dl, tTLHVideoQualityGameSettings2.getRtcProbeConfig());
        c09dl.LJIILLIIL("enable_new_structure");
        c09dl.LJJJJ(Integer.valueOf(tTLHVideoQualityGameSettings2.getEnableNewStructure()));
        c09dl.LJIILLIIL("gear_center_mock_data");
        C473040Igo.LJ(this.LIZ, c09dl, tTLHVideoQualityGameSettings2.getGearCenterMockData(), Object.class);
        c09dl.LJIILLIIL("gear_center_strategy_config");
        C473040Igo.LJ(this.LIZ, c09dl, tTLHVideoQualityGameSettings2.getGearCenterStrategyConfig(), Object.class);
        c09dl.LJIILLIIL("gear_center_probe_config");
        C473040Igo.LJ(this.LIZ, c09dl, tTLHVideoQualityGameSettings2.getGearCenterProbeConfig(), Object.class);
        c09dl.LJIILLIIL("gear_center_sync_timeout_ms");
        c09dl.LJJIZ(tTLHVideoQualityGameSettings2.getGearCenterSyncTimeoutMs());
        c09dl.LJII();
    }
}
