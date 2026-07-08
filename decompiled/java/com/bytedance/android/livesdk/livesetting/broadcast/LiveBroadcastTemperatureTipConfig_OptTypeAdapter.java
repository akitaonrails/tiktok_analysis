package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public final class LiveBroadcastTemperatureTipConfig_OptTypeAdapter extends TypeAdapter<LiveBroadcastTemperatureTipConfig> {
    public final Gson LIZ;

    public LiveBroadcastTemperatureTipConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveBroadcastTemperatureTipConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveBroadcastTemperatureTipConfig liveBroadcastTemperatureTipConfig = new LiveBroadcastTemperatureTipConfig(false, 0.5f, 42.0f, 1440, 60, "", false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2144539042:
                        if (strLJJJJ.equals("monitor_delay")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveBroadcastTemperatureTipConfig.setMonitorDelay(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1695810808:
                        if (strLJJJJ.equals("local_test_quick_show")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveBroadcastTemperatureTipConfig.setLocalTestQuickShow(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1690296135:
                        if (strLJJJJ.equals("battery_threshold")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveBroadcastTemperatureTipConfig.setBatteryThreshold((float) c09cu.LJJIL());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveBroadcastTemperatureTipConfig.setEnable(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1155803064:
                        if (strLJJJJ.equals("frequency_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveBroadcastTemperatureTipConfig.setFrequencyInterval(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -867752509:
                        if (strLJJJJ.equals("thermal_threshold")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveBroadcastTemperatureTipConfig.setThermalThreshold((float) c09cu.LJJIL());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 787734617:
                        if (strLJJJJ.equals("prefix_emoji")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveBroadcastTemperatureTipConfig.setPrefixEmoji(c09cu.LJJJZ());
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
        return liveBroadcastTemperatureTipConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveBroadcastTemperatureTipConfig liveBroadcastTemperatureTipConfig) throws IOException {
        LiveBroadcastTemperatureTipConfig liveBroadcastTemperatureTipConfig2 = liveBroadcastTemperatureTipConfig;
        if (liveBroadcastTemperatureTipConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(liveBroadcastTemperatureTipConfig2.getEnable());
        c09dl.LJIILLIIL("battery_threshold");
        c09dl.LJJJJ(Float.valueOf(liveBroadcastTemperatureTipConfig2.getBatteryThreshold()));
        c09dl.LJIILLIIL("thermal_threshold");
        c09dl.LJJJJ(Float.valueOf(liveBroadcastTemperatureTipConfig2.getThermalThreshold()));
        c09dl.LJIILLIIL("frequency_interval");
        c09dl.LJJJJ(Integer.valueOf(liveBroadcastTemperatureTipConfig2.getFrequencyInterval()));
        c09dl.LJIILLIIL("monitor_delay");
        c09dl.LJJJJ(Integer.valueOf(liveBroadcastTemperatureTipConfig2.getMonitorDelay()));
        c09dl.LJIILLIIL("prefix_emoji");
        c09dl.LJJJJJ(liveBroadcastTemperatureTipConfig2.getPrefixEmoji());
        c09dl.LJIILLIIL("local_test_quick_show");
        c09dl.LJJJJJL(liveBroadcastTemperatureTipConfig2.getLocalTestQuickShow());
        c09dl.LJII();
    }
}
