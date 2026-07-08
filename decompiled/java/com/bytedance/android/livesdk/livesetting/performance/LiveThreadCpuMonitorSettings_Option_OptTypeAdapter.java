package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.performance.LiveThreadCpuMonitorSettings;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public final class LiveThreadCpuMonitorSettings_Option_OptTypeAdapter extends TypeAdapter<LiveThreadCpuMonitorSettings.Option> {
    public final Gson LIZ;

    public LiveThreadCpuMonitorSettings_Option_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveThreadCpuMonitorSettings.Option read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveThreadCpuMonitorSettings.Option option = new LiveThreadCpuMonitorSettings.Option(false, 2, 0.25d, 3000L, 0.8d, 20, 1000L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1395602405:
                        if (strLJJJJ.equals("exception_ratio")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                option.exceptionRatio = c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 67656438:
                        if (strLJJJJ.equals("dump_cpu_time_ms")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                option.dumpCpuTimeMs = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 348059488:
                        if (strLJJJJ.equals("measure_cpu_time_ms")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                option.measureCpuTimeMs = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 529589653:
                        if (strLJJJJ.equals("dump_interval_ms")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                option.dumpIntervalMs = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1288701522:
                        if (strLJJJJ.equals("pre_measure_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                option.preMeasureCount = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1336519290:
                        if (strLJJJJ.equals("diff_dump_ratio")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                option.diffDumpRatio = c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1978042092:
                        if (strLJJJJ.equals("feature_enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                option.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return option;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveThreadCpuMonitorSettings.Option option) throws IOException {
        LiveThreadCpuMonitorSettings.Option option2 = option;
        if (option2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("feature_enable");
        c09dl.LJJJJJL(option2.enable);
        c09dl.LJIILLIIL("pre_measure_count");
        c09dl.LJJJJ(Integer.valueOf(option2.preMeasureCount));
        c09dl.LJIILLIIL("exception_ratio");
        c09dl.LJJIL(option2.exceptionRatio);
        c09dl.LJIILLIIL("measure_cpu_time_ms");
        c09dl.LJJIZ(option2.measureCpuTimeMs);
        c09dl.LJIILLIIL("diff_dump_ratio");
        c09dl.LJJIL(option2.diffDumpRatio);
        c09dl.LJIILLIIL("dump_interval_ms");
        c09dl.LJJJJ(Integer.valueOf(option2.dumpIntervalMs));
        c09dl.LJIILLIIL("dump_cpu_time_ms");
        c09dl.LJJIZ(option2.dumpCpuTimeMs);
        c09dl.LJII();
    }
}
