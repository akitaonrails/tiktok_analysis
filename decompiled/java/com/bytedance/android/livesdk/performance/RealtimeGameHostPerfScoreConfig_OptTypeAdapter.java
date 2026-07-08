package com.bytedance.android.livesdk.performance;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C1697810uHb;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class RealtimeGameHostPerfScoreConfig_OptTypeAdapter extends TypeAdapter<RealtimeGameHostPerfScoreConfig> {
    public final Gson LIZ;

    public RealtimeGameHostPerfScoreConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final RealtimeGameHostPerfScoreConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        RealtimeGameHostPerfScoreConfig realtimeGameHostPerfScoreConfig = new RealtimeGameHostPerfScoreConfig(false, 1.0f, null, null, null, null, null, C1697810uHb.LJIILJJIL(Float.valueOf(0.3f), Float.valueOf(0.5f), Float.valueOf(0.8f), Float.valueOf(0.9f)));
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1690628410:
                        if (strLJJJJ.equals("battery_temp")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                realtimeGameHostPerfScoreConfig.setBatteryTemperature((PerfItemConfig) this.LIZ.LJIIJ(PerfItemConfig.class).read(c09cu));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1629944080:
                        if (strLJJJJ.equals("cpu_speed")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                realtimeGameHostPerfScoreConfig.setCpuSpeed((PerfItemConfig) this.LIZ.LJIIJ(PerfItemConfig.class).read(c09cu));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -352739800:
                        if (strLJJJJ.equals("effect_render_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                realtimeGameHostPerfScoreConfig.setEffectRenderTime((PerfItemConfig) this.LIZ.LJIIJ(PerfItemConfig.class).read(c09cu));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -234837001:
                        if (strLJJJJ.equals("max_score")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                realtimeGameHostPerfScoreConfig.setMaxScore((float) c09cu.LJJIL());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -109284052:
                        if (strLJJJJ.equals("is_enabled")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                realtimeGameHostPerfScoreConfig.setEnabled(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 95858468:
                        if (strLJJJJ.equals("drop3")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                realtimeGameHostPerfScoreConfig.setDrop3((PerfItemConfig) this.LIZ.LJIIJ(PerfItemConfig.class).read(c09cu));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 166281825:
                        if (strLJJJJ.equals("video_drop_frame")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                realtimeGameHostPerfScoreConfig.setVideoDropFrame((PerfItemConfig) this.LIZ.LJIIJ(PerfItemConfig.class).read(c09cu));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 968140893:
                        if (strLJJJJ.equals("level_config")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                realtimeGameHostPerfScoreConfig.setLevelConfig(C473040Igo.LIZ(this.LIZ, c09cu, Float.TYPE));
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
        return realtimeGameHostPerfScoreConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, RealtimeGameHostPerfScoreConfig realtimeGameHostPerfScoreConfig) throws IOException {
        RealtimeGameHostPerfScoreConfig realtimeGameHostPerfScoreConfig2 = realtimeGameHostPerfScoreConfig;
        if (realtimeGameHostPerfScoreConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("is_enabled");
        c09dl.LJJJJJL(realtimeGameHostPerfScoreConfig2.isEnabled());
        c09dl.LJIILLIIL("max_score");
        c09dl.LJJJJ(Float.valueOf(realtimeGameHostPerfScoreConfig2.getMaxScore()));
        c09dl.LJIILLIIL("cpu_speed");
        TypeAdapter typeAdapterLJIIJ = this.LIZ.LJIIJ(PerfItemConfig.class);
        typeAdapterLJIIJ.write(c09dl, realtimeGameHostPerfScoreConfig2.getCpuSpeed());
        c09dl.LJIILLIIL("drop3");
        typeAdapterLJIIJ.write(c09dl, realtimeGameHostPerfScoreConfig2.getDrop3());
        c09dl.LJIILLIIL("video_drop_frame");
        typeAdapterLJIIJ.write(c09dl, realtimeGameHostPerfScoreConfig2.getVideoDropFrame());
        c09dl.LJIILLIIL("effect_render_time");
        typeAdapterLJIIJ.write(c09dl, realtimeGameHostPerfScoreConfig2.getEffectRenderTime());
        c09dl.LJIILLIIL("battery_temp");
        typeAdapterLJIIJ.write(c09dl, realtimeGameHostPerfScoreConfig2.getBatteryTemperature());
        c09dl.LJIILLIIL("level_config");
        C473040Igo.LIZLLL(this.LIZ, c09dl, realtimeGameHostPerfScoreConfig2.getLevelConfig(), Float.TYPE);
        c09dl.LJII();
    }
}
