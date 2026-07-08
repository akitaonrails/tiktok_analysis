package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.bytedance.android.livesdk.livesetting.broadcast.TTLHVideoQualityStrategyManagerTestSettings;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes36.dex */
public final class TTLHVideoQualityStrategyManagerTestSettings_TTLHVideoQualityTestSettings_OptTypeAdapter extends TypeAdapter<TTLHVideoQualityStrategyManagerTestSettings.TTLHVideoQualityTestSettings> {
    public final Gson LIZ;

    public TTLHVideoQualityStrategyManagerTestSettings_TTLHVideoQualityTestSettings_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final TTLHVideoQualityStrategyManagerTestSettings.TTLHVideoQualityTestSettings read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        TTLHVideoQualityStrategyManagerTestSettings.TTLHVideoQualityTestSettings tTLHVideoQualityTestSettings = new TTLHVideoQualityStrategyManagerTestSettings.TTLHVideoQualityTestSettings();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1835243720:
                        if (strLJJJJ.equals("mock_probe_switch")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tTLHVideoQualityTestSettings.setMockProbeSwitch(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1690966935:
                        if (strLJJJJ.equals("mock_gear_adaptive_encode_level")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tTLHVideoQualityTestSettings.setGearEncodeLevel(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1429424209:
                        if (strLJJJJ.equals("mock_probe_network_type")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tTLHVideoQualityTestSettings.setMockProbeNetworkType(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1210280028:
                        if (strLJJJJ.equals("mock_gear_adaptive_effect_level")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tTLHVideoQualityTestSettings.setGearEffectLevel(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1024825949:
                        if (strLJJJJ.equals("ignore_mobile_probe_cache")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tTLHVideoQualityTestSettings.setIgnoreMobileProbeCache(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -895610114:
                        if (strLJJJJ.equals("mock_async_release_sleep_ms")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tTLHVideoQualityTestSettings.setMockAsyncReleaseSleepMs(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -841649375:
                        if (strLJJJJ.equals("ttlh_video_quality_portraits_config_test")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tTLHVideoQualityTestSettings.setPortraitsConfigs(C473040Igo.LIZIZ(this.LIZ, c09cu, TTLHVideoQualityStrategyManagerTestSettings.SettingsPortraitsConfigTest.class));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -344388456:
                        if (strLJJJJ.equals("mock_probe_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tTLHVideoQualityTestSettings.setMockProbeDuration(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 586838166:
                        if (strLJJJJ.equals("mock_probe_status_code")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tTLHVideoQualityTestSettings.setMockProbeStatusCode(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 638825149:
                        if (strLJJJJ.equals("mock_gear_adaptive_capture_level")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tTLHVideoQualityTestSettings.setGearCaptureLevel(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 916047009:
                        if (strLJJJJ.equals("mock_probe_net_speed")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tTLHVideoQualityTestSettings.setMockProbeNetSpeed(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1569451734:
                        if (strLJJJJ.equals("ignore_wifi_probe_cache")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tTLHVideoQualityTestSettings.setIgnoreWifiProbeCache(c09cu.LJJIZ());
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
        return tTLHVideoQualityTestSettings;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, TTLHVideoQualityStrategyManagerTestSettings.TTLHVideoQualityTestSettings tTLHVideoQualityTestSettings) {
        TTLHVideoQualityStrategyManagerTestSettings.TTLHVideoQualityTestSettings tTLHVideoQualityTestSettings2 = tTLHVideoQualityTestSettings;
        if (tTLHVideoQualityTestSettings2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("mock_probe_switch");
        c09dl.LJJJJ(Integer.valueOf(tTLHVideoQualityTestSettings2.getMockProbeSwitch()));
        c09dl.LJIILLIIL("mock_probe_network_type");
        c09dl.LJJJJ(Integer.valueOf(tTLHVideoQualityTestSettings2.getMockProbeNetworkType()));
        c09dl.LJIILLIIL("mock_probe_status_code");
        c09dl.LJJJJ(Integer.valueOf(tTLHVideoQualityTestSettings2.getMockProbeStatusCode()));
        c09dl.LJIILLIIL("mock_probe_net_speed");
        c09dl.LJJJJ(Integer.valueOf(tTLHVideoQualityTestSettings2.getMockProbeNetSpeed()));
        c09dl.LJIILLIIL("mock_probe_duration");
        c09dl.LJJJJ(Integer.valueOf(tTLHVideoQualityTestSettings2.getMockProbeDuration()));
        c09dl.LJIILLIIL("mock_gear_adaptive_encode_level");
        c09dl.LJJJJ(Integer.valueOf(tTLHVideoQualityTestSettings2.getGearEncodeLevel()));
        c09dl.LJIILLIIL("mock_gear_adaptive_effect_level");
        c09dl.LJJJJ(Integer.valueOf(tTLHVideoQualityTestSettings2.getGearEffectLevel()));
        c09dl.LJIILLIIL("mock_gear_adaptive_capture_level");
        c09dl.LJJJJ(Integer.valueOf(tTLHVideoQualityTestSettings2.getGearCaptureLevel()));
        c09dl.LJIILLIIL("mock_async_release_sleep_ms");
        c09dl.LJJJJ(Integer.valueOf(tTLHVideoQualityTestSettings2.getMockAsyncReleaseSleepMs()));
        c09dl.LJIILLIIL("ignore_wifi_probe_cache");
        c09dl.LJJJJ(Integer.valueOf(tTLHVideoQualityTestSettings2.getIgnoreWifiProbeCache()));
        c09dl.LJIILLIIL("ignore_mobile_probe_cache");
        c09dl.LJJJJ(Integer.valueOf(tTLHVideoQualityTestSettings2.getIgnoreMobileProbeCache()));
        c09dl.LJIILLIIL("ttlh_video_quality_portraits_config_test");
        C473040Igo.LJ(this.LIZ, c09dl, tTLHVideoQualityTestSettings2.getPortraitsConfigs(), TTLHVideoQualityStrategyManagerTestSettings.SettingsPortraitsConfigTest.class);
        c09dl.LJII();
    }
}
