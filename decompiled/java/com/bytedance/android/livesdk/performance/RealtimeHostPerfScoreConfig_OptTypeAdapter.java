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
public final class RealtimeHostPerfScoreConfig_OptTypeAdapter extends TypeAdapter<RealtimeHostPerfScoreConfig> {
    public final Gson LIZ;

    public RealtimeHostPerfScoreConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final RealtimeHostPerfScoreConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        RealtimeHostPerfScoreConfig realtimeHostPerfScoreConfig = new RealtimeHostPerfScoreConfig(false, false, false, false, 1.0f, null, null, null, null, null, C1697810uHb.LJIILJJIL(Float.valueOf(0.3f), Float.valueOf(0.5f), Float.valueOf(0.8f), Float.valueOf(0.9f)));
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1690628410:
                        if (strLJJJJ.equals("battery_temp")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                realtimeHostPerfScoreConfig.setBatteryTemperature((PerfItemConfig) this.LIZ.LJIIJ(PerfItemConfig.class).read(c09cu));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1629944080:
                        if (strLJJJJ.equals("cpu_speed")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                realtimeHostPerfScoreConfig.setCpuSpeed((PerfItemConfig) this.LIZ.LJIIJ(PerfItemConfig.class).read(c09cu));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1120892360:
                        if (strLJJJJ.equals("use_otis_cpu_speed")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                realtimeHostPerfScoreConfig.setUseOtisCpuSpeed(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -352739800:
                        if (strLJJJJ.equals("effect_render_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                realtimeHostPerfScoreConfig.setEffectRenderTime((PerfItemConfig) this.LIZ.LJIIJ(PerfItemConfig.class).read(c09cu));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -234837001:
                        if (strLJJJJ.equals("max_score")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                realtimeHostPerfScoreConfig.setMaxScore((float) c09cu.LJJIL());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -109284052:
                        if (strLJJJJ.equals("is_enabled")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                realtimeHostPerfScoreConfig.setEnabled(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -50980628:
                        if (strLJJJJ.equals("is_upload_server")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                realtimeHostPerfScoreConfig.setUploadServer(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 95858468:
                        if (strLJJJJ.equals("drop3")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                realtimeHostPerfScoreConfig.setDrop3((PerfItemConfig) this.LIZ.LJIIJ(PerfItemConfig.class).read(c09cu));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 166281825:
                        if (strLJJJJ.equals("video_drop_frame")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                realtimeHostPerfScoreConfig.setVideoDropFrame((PerfItemConfig) this.LIZ.LJIIJ(PerfItemConfig.class).read(c09cu));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 968140893:
                        if (strLJJJJ.equals("level_config")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                realtimeHostPerfScoreConfig.setLevelConfig(C473040Igo.LIZ(this.LIZ, c09cu, Float.TYPE));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1349271759:
                        if (strLJJJJ.equals("use_otis_cpu_rate")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                realtimeHostPerfScoreConfig.setUseOtisCpuRate(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
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
        return realtimeHostPerfScoreConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, RealtimeHostPerfScoreConfig realtimeHostPerfScoreConfig) throws IOException {
        RealtimeHostPerfScoreConfig realtimeHostPerfScoreConfig2 = realtimeHostPerfScoreConfig;
        if (realtimeHostPerfScoreConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("is_enabled");
        c09dl.LJJJJJL(realtimeHostPerfScoreConfig2.isEnabled());
        c09dl.LJIILLIIL("is_upload_server");
        c09dl.LJJJJJL(realtimeHostPerfScoreConfig2.isUploadServer());
        c09dl.LJIILLIIL("use_otis_cpu_speed");
        c09dl.LJJJJJL(realtimeHostPerfScoreConfig2.getUseOtisCpuSpeed());
        c09dl.LJIILLIIL("use_otis_cpu_rate");
        c09dl.LJJJJJL(realtimeHostPerfScoreConfig2.getUseOtisCpuRate());
        c09dl.LJIILLIIL("max_score");
        c09dl.LJJJJ(Float.valueOf(realtimeHostPerfScoreConfig2.getMaxScore()));
        c09dl.LJIILLIIL("cpu_speed");
        TypeAdapter typeAdapterLJIIJ = this.LIZ.LJIIJ(PerfItemConfig.class);
        typeAdapterLJIIJ.write(c09dl, realtimeHostPerfScoreConfig2.getCpuSpeed());
        c09dl.LJIILLIIL("drop3");
        typeAdapterLJIIJ.write(c09dl, realtimeHostPerfScoreConfig2.getDrop3());
        c09dl.LJIILLIIL("video_drop_frame");
        typeAdapterLJIIJ.write(c09dl, realtimeHostPerfScoreConfig2.getVideoDropFrame());
        c09dl.LJIILLIIL("effect_render_time");
        typeAdapterLJIIJ.write(c09dl, realtimeHostPerfScoreConfig2.getEffectRenderTime());
        c09dl.LJIILLIIL("battery_temp");
        typeAdapterLJIIJ.write(c09dl, realtimeHostPerfScoreConfig2.getBatteryTemperature());
        c09dl.LJIILLIIL("level_config");
        C473040Igo.LIZLLL(this.LIZ, c09dl, realtimeHostPerfScoreConfig2.getLevelConfig(), Float.TYPE);
        c09dl.LJII();
    }
}
