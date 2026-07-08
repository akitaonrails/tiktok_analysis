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
public final class RealtimePerfScoreConfig_OptTypeAdapter extends TypeAdapter<RealtimePerfScoreConfig> {
    public final Gson LIZ;

    public RealtimePerfScoreConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final RealtimePerfScoreConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        RealtimePerfScoreConfig realtimePerfScoreConfig = new RealtimePerfScoreConfig(false, false, false, false, 1.0f, null, null, null, null, null, C1697810uHb.LJIILJJIL(Float.valueOf(0.3f), Float.valueOf(0.5f), Float.valueOf(0.8f), Float.valueOf(0.9f)));
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1690628410:
                        if (strLJJJJ.equals("battery_temp")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                realtimePerfScoreConfig.setBatteryTemperature((PerfItemConfig) this.LIZ.LJIIJ(PerfItemConfig.class).read(c09cu));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1629944080:
                        if (strLJJJJ.equals("cpu_speed")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                realtimePerfScoreConfig.setCpuSpeed((PerfItemConfig) this.LIZ.LJIIJ(PerfItemConfig.class).read(c09cu));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1120892360:
                        if (strLJJJJ.equals("use_otis_cpu_speed")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                realtimePerfScoreConfig.setUseOtisCpuSpeed(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -234837001:
                        if (strLJJJJ.equals("max_score")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                realtimePerfScoreConfig.setMaxScore((float) c09cu.LJJIL());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -109284052:
                        if (strLJJJJ.equals("is_enabled")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                realtimePerfScoreConfig.setEnabled(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -50980628:
                        if (strLJJJJ.equals("is_upload_server")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                realtimePerfScoreConfig.setUploadServer(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 101609:
                        if (strLJJJJ.equals("fps")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                realtimePerfScoreConfig.setFps((PerfItemConfig) this.LIZ.LJIIJ(PerfItemConfig.class).read(c09cu));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 95858468:
                        if (strLJJJJ.equals("drop3")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                realtimePerfScoreConfig.setDrop3((PerfItemConfig) this.LIZ.LJIIJ(PerfItemConfig.class).read(c09cu));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 501566743:
                        if (strLJJJJ.equals("cpu_rate")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                realtimePerfScoreConfig.setCpuRate((PerfItemConfig) this.LIZ.LJIIJ(PerfItemConfig.class).read(c09cu));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 968140893:
                        if (strLJJJJ.equals("level_config")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                realtimePerfScoreConfig.setLevelConfig(C473040Igo.LIZ(this.LIZ, c09cu, Float.TYPE));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1349271759:
                        if (strLJJJJ.equals("use_otis_cpu_rate")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                realtimePerfScoreConfig.setUseOtisCpuRate(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
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
        return realtimePerfScoreConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, RealtimePerfScoreConfig realtimePerfScoreConfig) throws IOException {
        RealtimePerfScoreConfig realtimePerfScoreConfig2 = realtimePerfScoreConfig;
        if (realtimePerfScoreConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("is_enabled");
        c09dl.LJJJJJL(realtimePerfScoreConfig2.isEnabled());
        c09dl.LJIILLIIL("is_upload_server");
        c09dl.LJJJJJL(realtimePerfScoreConfig2.isUploadServer());
        c09dl.LJIILLIIL("use_otis_cpu_speed");
        c09dl.LJJJJJL(realtimePerfScoreConfig2.getUseOtisCpuSpeed());
        c09dl.LJIILLIIL("use_otis_cpu_rate");
        c09dl.LJJJJJL(realtimePerfScoreConfig2.getUseOtisCpuRate());
        c09dl.LJIILLIIL("max_score");
        c09dl.LJJJJ(Float.valueOf(realtimePerfScoreConfig2.getMaxScore()));
        c09dl.LJIILLIIL("cpu_speed");
        TypeAdapter typeAdapterLJIIJ = this.LIZ.LJIIJ(PerfItemConfig.class);
        typeAdapterLJIIJ.write(c09dl, realtimePerfScoreConfig2.getCpuSpeed());
        c09dl.LJIILLIIL("cpu_rate");
        typeAdapterLJIIJ.write(c09dl, realtimePerfScoreConfig2.getCpuRate());
        c09dl.LJIILLIIL("fps");
        typeAdapterLJIIJ.write(c09dl, realtimePerfScoreConfig2.getFps());
        c09dl.LJIILLIIL("drop3");
        typeAdapterLJIIJ.write(c09dl, realtimePerfScoreConfig2.getDrop3());
        c09dl.LJIILLIIL("battery_temp");
        typeAdapterLJIIJ.write(c09dl, realtimePerfScoreConfig2.getBatteryTemperature());
        c09dl.LJIILLIIL("level_config");
        C473040Igo.LIZLLL(this.LIZ, c09dl, realtimePerfScoreConfig2.getLevelConfig(), Float.TYPE);
        c09dl.LJII();
    }
}
