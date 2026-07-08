package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.scene.Scene;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveHostPerfAutoAdaptiveConfig_OptTypeAdapter extends TypeAdapter<LiveHostPerfAutoAdaptiveConfig> {
    public final Gson LIZ;

    public LiveHostPerfAutoAdaptiveConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveHostPerfAutoAdaptiveConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveHostPerfAutoAdaptiveConfig liveHostPerfAutoAdaptiveConfig = new LiveHostPerfAutoAdaptiveConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2140119040:
                        if (strLJJJJ.equals("mid_device_score")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveHostPerfAutoAdaptiveConfig.midDeviceScore = c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1880930546:
                        if (strLJJJJ.equals("continuous_collect_metrics_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveHostPerfAutoAdaptiveConfig.continuousCollectMetricsCount = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1734022211:
                        if (strLJJJJ.equals("downgrade_interval_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveHostPerfAutoAdaptiveConfig.downgradeIntervalTime = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveHostPerfAutoAdaptiveConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1276738040:
                        if (strLJJJJ.equals("upgrade_threshold")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveHostPerfAutoAdaptiveConfig.upgradeThreshold = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 98629247:
                        if (strLJJJJ.equals("group")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveHostPerfAutoAdaptiveConfig.group = (StrategyGroup) this.LIZ.LJIIJ(StrategyGroup.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 109254796:
                        if (strLJJJJ.equals(Scene.SCENE_SERVICE)) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveHostPerfAutoAdaptiveConfig.scene = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 602259745:
                        if (strLJJJJ.equals("downgrade_threshold")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveHostPerfAutoAdaptiveConfig.downgradeThreshold = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2105079412:
                        if (strLJJJJ.equals("low_device_score")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveHostPerfAutoAdaptiveConfig.lowDeviceScore = c09cu.LJJIZ();
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
        return liveHostPerfAutoAdaptiveConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveHostPerfAutoAdaptiveConfig liveHostPerfAutoAdaptiveConfig) throws IOException {
        LiveHostPerfAutoAdaptiveConfig liveHostPerfAutoAdaptiveConfig2 = liveHostPerfAutoAdaptiveConfig;
        if (liveHostPerfAutoAdaptiveConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL(Scene.SCENE_SERVICE);
        c09dl.LJJJJJ(liveHostPerfAutoAdaptiveConfig2.scene);
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(liveHostPerfAutoAdaptiveConfig2.enable);
        c09dl.LJIILLIIL("continuous_collect_metrics_count");
        c09dl.LJJJJ(Integer.valueOf(liveHostPerfAutoAdaptiveConfig2.continuousCollectMetricsCount));
        c09dl.LJIILLIIL("downgrade_threshold");
        c09dl.LJJJJ(Integer.valueOf(liveHostPerfAutoAdaptiveConfig2.downgradeThreshold));
        c09dl.LJIILLIIL("upgrade_threshold");
        c09dl.LJJJJ(Integer.valueOf(liveHostPerfAutoAdaptiveConfig2.upgradeThreshold));
        c09dl.LJIILLIIL("downgrade_interval_time");
        c09dl.LJJJJ(Integer.valueOf(liveHostPerfAutoAdaptiveConfig2.downgradeIntervalTime));
        c09dl.LJIILLIIL("mid_device_score");
        c09dl.LJJIL(liveHostPerfAutoAdaptiveConfig2.midDeviceScore);
        c09dl.LJIILLIIL("low_device_score");
        c09dl.LJJJJ(Integer.valueOf(liveHostPerfAutoAdaptiveConfig2.lowDeviceScore));
        c09dl.LJIILLIIL("group");
        this.LIZ.LJIIJ(StrategyGroup.class).write(c09dl, liveHostPerfAutoAdaptiveConfig2.group);
        c09dl.LJII();
    }
}
