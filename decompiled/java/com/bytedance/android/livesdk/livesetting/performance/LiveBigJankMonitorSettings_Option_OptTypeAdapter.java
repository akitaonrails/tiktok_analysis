package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.performance.LiveBigJankMonitorSettings;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public final class LiveBigJankMonitorSettings_Option_OptTypeAdapter extends TypeAdapter<LiveBigJankMonitorSettings.Option> {
    public final Gson LIZ;

    public LiveBigJankMonitorSettings_Option_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveBigJankMonitorSettings.Option read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveBigJankMonitorSettings.Option option = new LiveBigJankMonitorSettings.Option(false, 300L, 30L, 30000L, 5);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -374730482:
                        if (strLJJJJ.equals("measure_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                option.measureTime = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 474336944:
                        if (strLJJJJ.equals("dump_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                option.dumpInterval = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 922116026:
                        if (strLJJJJ.equals("sample_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                option.sampleInterval = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1149112569:
                        if (strLJJJJ.equals("report_pool_size")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                option.reportPoolSize = c09cu.LJJIZ();
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
    public final void write(C09DL c09dl, LiveBigJankMonitorSettings.Option option) throws IOException {
        LiveBigJankMonitorSettings.Option option2 = option;
        if (option2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("feature_enable");
        c09dl.LJJJJJL(option2.enable);
        c09dl.LJIILLIIL("measure_time");
        c09dl.LJJIZ(option2.measureTime);
        c09dl.LJIILLIIL("dump_interval");
        c09dl.LJJIZ(option2.dumpInterval);
        c09dl.LJIILLIIL("sample_interval");
        c09dl.LJJIZ(option2.sampleInterval);
        c09dl.LJIILLIIL("report_pool_size");
        c09dl.LJJJJ(Integer.valueOf(option2.reportPoolSize));
        c09dl.LJII();
    }
}
