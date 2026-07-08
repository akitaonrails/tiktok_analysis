package com.bytedance.android.livesdk.broadcast.setting;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes36.dex */
public final class LiveAnchorStatusDiagnosticsPerfConfig_OptTypeAdapter extends TypeAdapter<LiveAnchorStatusDiagnosticsPerfConfig> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveAnchorStatusDiagnosticsPerfConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveAnchorStatusDiagnosticsPerfConfig liveAnchorStatusDiagnosticsPerfConfig = new LiveAnchorStatusDiagnosticsPerfConfig(0.4d, 0.7d, 0.5d, 0.8d, 2000, 500, 40.0d, 43.0d, 15);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1223534798:
                        if (strLJJJJ.equals("mem_warning")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveAnchorStatusDiagnosticsPerfConfig.setMemWarning(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -818976815:
                        if (strLJJJJ.equals("temperature_warning")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveAnchorStatusDiagnosticsPerfConfig.setTemperatureWarning(c09cu.LJJIL());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 124694533:
                        if (strLJJJJ.equals("cpu_warning")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveAnchorStatusDiagnosticsPerfConfig.setCpuWarning(c09cu.LJJIL());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 241042930:
                        if (strLJJJJ.equals("gpu_bad")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveAnchorStatusDiagnosticsPerfConfig.setGpuBad(c09cu.LJJIL());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 948788891:
                        if (strLJJJJ.equals("mem_bad")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveAnchorStatusDiagnosticsPerfConfig.setMemBad(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 985995502:
                        if (strLJJJJ.equals("cpu_bad")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveAnchorStatusDiagnosticsPerfConfig.setCpuBad(c09cu.LJJIL());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1526823689:
                        if (strLJJJJ.equals("gpu_warning")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveAnchorStatusDiagnosticsPerfConfig.setGpuWarning(c09cu.LJJIL());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2021626916:
                        if (strLJJJJ.equals("sustain_duration_s")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveAnchorStatusDiagnosticsPerfConfig.setSustainDurationS(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2077333178:
                        if (strLJJJJ.equals("temperature_bad")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveAnchorStatusDiagnosticsPerfConfig.setTemperatureBad(c09cu.LJJIL());
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
        return liveAnchorStatusDiagnosticsPerfConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveAnchorStatusDiagnosticsPerfConfig liveAnchorStatusDiagnosticsPerfConfig) throws IOException {
        LiveAnchorStatusDiagnosticsPerfConfig liveAnchorStatusDiagnosticsPerfConfig2 = liveAnchorStatusDiagnosticsPerfConfig;
        if (liveAnchorStatusDiagnosticsPerfConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("cpu_warning");
        c09dl.LJJIL(liveAnchorStatusDiagnosticsPerfConfig2.getCpuWarning());
        c09dl.LJIILLIIL("cpu_bad");
        c09dl.LJJIL(liveAnchorStatusDiagnosticsPerfConfig2.getCpuBad());
        c09dl.LJIILLIIL("gpu_warning");
        c09dl.LJJIL(liveAnchorStatusDiagnosticsPerfConfig2.getGpuWarning());
        c09dl.LJIILLIIL("gpu_bad");
        c09dl.LJJIL(liveAnchorStatusDiagnosticsPerfConfig2.getGpuBad());
        c09dl.LJIILLIIL("mem_warning");
        c09dl.LJJJJ(Integer.valueOf(liveAnchorStatusDiagnosticsPerfConfig2.getMemWarning()));
        c09dl.LJIILLIIL("mem_bad");
        c09dl.LJJJJ(Integer.valueOf(liveAnchorStatusDiagnosticsPerfConfig2.getMemBad()));
        c09dl.LJIILLIIL("temperature_warning");
        c09dl.LJJIL(liveAnchorStatusDiagnosticsPerfConfig2.getTemperatureWarning());
        c09dl.LJIILLIIL("temperature_bad");
        c09dl.LJJIL(liveAnchorStatusDiagnosticsPerfConfig2.getTemperatureBad());
        c09dl.LJIILLIIL("sustain_duration_s");
        c09dl.LJJJJ(Integer.valueOf(liveAnchorStatusDiagnosticsPerfConfig2.getSustainDurationS()));
        c09dl.LJII();
    }
}
