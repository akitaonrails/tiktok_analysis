package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes36.dex */
public final class RestartLiveConfig_OptTypeAdapter extends TypeAdapter<RestartLiveConfig> {
    public final Gson LIZ;

    public RestartLiveConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final RestartLiveConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        RestartLiveConfig restartLiveConfig = new RestartLiveConfig(false, false, 15000, 50, 8, "10,15", 300000, 4);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                restartLiveConfig.setEnable(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1104942223:
                        if (strLJJJJ.equals("enable_capsule")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                restartLiveConfig.setEnableCapsule(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -796504211:
                        if (strLJJJJ.equals("poor_push_fps_threshold")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                restartLiveConfig.setPoorPushFpsThreshold(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -578157103:
                        if (strLJJJJ.equals("low_memory_level")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                restartLiveConfig.setLowMemoryLevel(c09cu.LJJJZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -342055233:
                        if (strLJJJJ.equals("poor_performance_threshold")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                restartLiveConfig.setPoorPerformanceThreshold(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -147967348:
                        if (strLJJJJ.equals("start_detect_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                restartLiveConfig.setStartDetectTime(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 996596029:
                        if (strLJJJJ.equals("get_performance_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                restartLiveConfig.setGetPerformanceInterval(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1806098665:
                        if (strLJJJJ.equals("poor_times")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                restartLiveConfig.setPoorTimes(c09cu.LJJIZ());
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
        return restartLiveConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, RestartLiveConfig restartLiveConfig) throws IOException {
        RestartLiveConfig restartLiveConfig2 = restartLiveConfig;
        if (restartLiveConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(restartLiveConfig2.getEnable());
        c09dl.LJIILLIIL("enable_capsule");
        c09dl.LJJJJJL(restartLiveConfig2.getEnableCapsule());
        c09dl.LJIILLIIL("get_performance_interval");
        c09dl.LJJJJ(Integer.valueOf(restartLiveConfig2.getGetPerformanceInterval()));
        c09dl.LJIILLIIL("poor_performance_threshold");
        c09dl.LJJJJ(Integer.valueOf(restartLiveConfig2.getPoorPerformanceThreshold()));
        c09dl.LJIILLIIL("poor_push_fps_threshold");
        c09dl.LJJJJ(Integer.valueOf(restartLiveConfig2.getPoorPushFpsThreshold()));
        c09dl.LJIILLIIL("low_memory_level");
        c09dl.LJJJJJ(restartLiveConfig2.getLowMemoryLevel());
        c09dl.LJIILLIIL("start_detect_time");
        c09dl.LJJJJ(Integer.valueOf(restartLiveConfig2.getStartDetectTime()));
        c09dl.LJIILLIIL("poor_times");
        c09dl.LJJJJ(Integer.valueOf(restartLiveConfig2.getPoorTimes()));
        c09dl.LJII();
    }
}
