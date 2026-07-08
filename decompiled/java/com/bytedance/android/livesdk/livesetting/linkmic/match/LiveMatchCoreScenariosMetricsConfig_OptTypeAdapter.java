package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes36.dex */
public final class LiveMatchCoreScenariosMetricsConfig_OptTypeAdapter extends TypeAdapter<LiveMatchCoreScenariosMetricsConfig> {
    public final Gson LIZ;

    public LiveMatchCoreScenariosMetricsConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveMatchCoreScenariosMetricsConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveMatchCoreScenariosMetricsConfig liveMatchCoreScenariosMetricsConfig = new LiveMatchCoreScenariosMetricsConfig(true, true, true, true, true, true, true);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1343616113:
                        if (strLJJJJ.equals("enable_track")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchCoreScenariosMetricsConfig.enableTrack = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1046661982:
                        if (strLJJJJ.equals("enable_score_track")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchCoreScenariosMetricsConfig.enableScoreTrack = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -640354193:
                        if (strLJJJJ.equals("enable_bonus_track")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchCoreScenariosMetricsConfig.enableBonusTrack = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 557386992:
                        if (strLJJJJ.equals("enable_powerup_track")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchCoreScenariosMetricsConfig.enablePowerupTrack = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 745366501:
                        if (strLJJJJ.equals("enable_result_track")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchCoreScenariosMetricsConfig.enableResultTrack = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1358129941:
                        if (strLJJJJ.equals("enable_timer_track")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchCoreScenariosMetricsConfig.enableTimerTrack = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1438651597:
                        if (strLJJJJ.equals("enable_component_track")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchCoreScenariosMetricsConfig.enableComponentTrack = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return liveMatchCoreScenariosMetricsConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveMatchCoreScenariosMetricsConfig liveMatchCoreScenariosMetricsConfig) throws IOException {
        LiveMatchCoreScenariosMetricsConfig liveMatchCoreScenariosMetricsConfig2 = liveMatchCoreScenariosMetricsConfig;
        if (liveMatchCoreScenariosMetricsConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_track");
        c09dl.LJJJJJL(liveMatchCoreScenariosMetricsConfig2.enableTrack);
        c09dl.LJIILLIIL("enable_score_track");
        c09dl.LJJJJJL(liveMatchCoreScenariosMetricsConfig2.enableScoreTrack);
        c09dl.LJIILLIIL("enable_timer_track");
        c09dl.LJJJJJL(liveMatchCoreScenariosMetricsConfig2.enableTimerTrack);
        c09dl.LJIILLIIL("enable_result_track");
        c09dl.LJJJJJL(liveMatchCoreScenariosMetricsConfig2.enableResultTrack);
        c09dl.LJIILLIIL("enable_component_track");
        c09dl.LJJJJJL(liveMatchCoreScenariosMetricsConfig2.enableComponentTrack);
        c09dl.LJIILLIIL("enable_bonus_track");
        c09dl.LJJJJJL(liveMatchCoreScenariosMetricsConfig2.enableBonusTrack);
        c09dl.LJIILLIIL("enable_powerup_track");
        c09dl.LJJJJJL(liveMatchCoreScenariosMetricsConfig2.enablePowerupTrack);
        c09dl.LJII();
    }
}
