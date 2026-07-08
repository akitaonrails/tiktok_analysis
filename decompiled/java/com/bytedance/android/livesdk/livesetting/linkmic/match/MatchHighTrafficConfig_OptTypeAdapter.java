package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes32.dex */
public final class MatchHighTrafficConfig_OptTypeAdapter extends TypeAdapter<MatchHighTrafficConfig> {
    public final Gson LIZ;

    public MatchHighTrafficConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final MatchHighTrafficConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        MatchHighTrafficConfig matchHighTrafficConfig = new MatchHighTrafficConfig(false, true, 0, true, false, false, 300L, 500L, 450L, 1350L, 225L, 64.5f, 56.0f, 6.0f, 40.0f, 30.0f, 38.0f, 40.0f);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1612862726:
                        if (strLJJJJ.equals("enable_cpu_boost_in_match")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                matchHighTrafficConfig.cpu_boost = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1609594047:
                        if (strLJJJJ.equals("enabled")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                matchHighTrafficConfig.enabled = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1536100650:
                        if (strLJJJJ.equals("fps_level_serious_boundary")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                matchHighTrafficConfig.fps_level_serious_boundary = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1257820203:
                        if (strLJJJJ.equals("score_message_frequency_control")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                matchHighTrafficConfig.score_message_frequececy_control = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -763715836:
                        if (strLJJJJ.equals("temperature_level_critical_boundary")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                matchHighTrafficConfig.temperature_level_critical_boundary = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -706075165:
                        if (strLJJJJ.equals("score_system_level_serious_boundary")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                matchHighTrafficConfig.score_system_serious_boundary = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -414811200:
                        if (strLJJJJ.equals("score_message_critical_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                matchHighTrafficConfig.armies_message_critical_interval = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 121499553:
                        if (strLJJJJ.equals("battle_start_animation_device_score_boundary")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                matchHighTrafficConfig.battle_start_animation_device_score_boundary = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 180427080:
                        if (strLJJJJ.equals("trigger_method")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                matchHighTrafficConfig.trigger_method = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 568354373:
                        if (strLJJJJ.equals("score_message_serious_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                matchHighTrafficConfig.armies_message_serious_interval = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 765183065:
                        if (strLJJJJ.equals("hammer_serious_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                matchHighTrafficConfig.hammer_serious_interval = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1125866335:
                        if (strLJJJJ.equals("enable_extra_buffer_in_match")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                matchHighTrafficConfig.extraBuffer = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1391910956:
                        if (strLJJJJ.equals("hammer_critical_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                matchHighTrafficConfig.hammer_critical_interval = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1560236523:
                        if (strLJJJJ.equals("temperature_level_serious_boundary")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                matchHighTrafficConfig.temperature_level_serious_boundary = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1650038342:
                        if (strLJJJJ.equals("power_up_request_layout_enabled")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                matchHighTrafficConfig.is_power_up_request_layout_enabled = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1971851684:
                        if (strLJJJJ.equals("hammer_normal_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                matchHighTrafficConfig.hammer_normal_interval = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1995065868:
                        if (strLJJJJ.equals("score_system_level_critical_boundary")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                matchHighTrafficConfig.score_system_critical_boundary = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2034079609:
                        if (strLJJJJ.equals("fps_level_critical_boundary")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                matchHighTrafficConfig.fps_level_critical_boundary = (float) c09cu.LJJIL();
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
        return matchHighTrafficConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, MatchHighTrafficConfig matchHighTrafficConfig) throws IOException {
        MatchHighTrafficConfig matchHighTrafficConfig2 = matchHighTrafficConfig;
        if (matchHighTrafficConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enabled");
        c09dl.LJJJJJL(matchHighTrafficConfig2.enabled);
        c09dl.LJIILLIIL("power_up_request_layout_enabled");
        c09dl.LJJJJJL(matchHighTrafficConfig2.is_power_up_request_layout_enabled);
        c09dl.LJIILLIIL("trigger_method");
        c09dl.LJJJJ(Integer.valueOf(matchHighTrafficConfig2.trigger_method));
        c09dl.LJIILLIIL("score_message_frequency_control");
        c09dl.LJJJJJL(matchHighTrafficConfig2.score_message_frequececy_control);
        c09dl.LJIILLIIL("enable_extra_buffer_in_match");
        c09dl.LJJJJJL(matchHighTrafficConfig2.extraBuffer);
        c09dl.LJIILLIIL("enable_cpu_boost_in_match");
        c09dl.LJJJJJL(matchHighTrafficConfig2.cpu_boost);
        c09dl.LJIILLIIL("score_message_serious_interval");
        c09dl.LJJIZ(matchHighTrafficConfig2.armies_message_serious_interval);
        c09dl.LJIILLIIL("score_message_critical_interval");
        c09dl.LJJIZ(matchHighTrafficConfig2.armies_message_critical_interval);
        c09dl.LJIILLIIL("hammer_serious_interval");
        c09dl.LJJIZ(matchHighTrafficConfig2.hammer_serious_interval);
        c09dl.LJIILLIIL("hammer_critical_interval");
        c09dl.LJJIZ(matchHighTrafficConfig2.hammer_critical_interval);
        c09dl.LJIILLIIL("hammer_normal_interval");
        c09dl.LJJIZ(matchHighTrafficConfig2.hammer_normal_interval);
        c09dl.LJIILLIIL("score_system_level_serious_boundary");
        c09dl.LJJJJ(Float.valueOf(matchHighTrafficConfig2.score_system_serious_boundary));
        c09dl.LJIILLIIL("score_system_level_critical_boundary");
        c09dl.LJJJJ(Float.valueOf(matchHighTrafficConfig2.score_system_critical_boundary));
        c09dl.LJIILLIIL("battle_start_animation_device_score_boundary");
        c09dl.LJJJJ(Float.valueOf(matchHighTrafficConfig2.battle_start_animation_device_score_boundary));
        c09dl.LJIILLIIL("fps_level_serious_boundary");
        c09dl.LJJJJ(Float.valueOf(matchHighTrafficConfig2.fps_level_serious_boundary));
        c09dl.LJIILLIIL("fps_level_critical_boundary");
        c09dl.LJJJJ(Float.valueOf(matchHighTrafficConfig2.fps_level_critical_boundary));
        c09dl.LJIILLIIL("temperature_level_serious_boundary");
        c09dl.LJJJJ(Float.valueOf(matchHighTrafficConfig2.temperature_level_serious_boundary));
        c09dl.LJIILLIIL("temperature_level_critical_boundary");
        c09dl.LJJJJ(Float.valueOf(matchHighTrafficConfig2.temperature_level_critical_boundary));
        c09dl.LJII();
    }
}
