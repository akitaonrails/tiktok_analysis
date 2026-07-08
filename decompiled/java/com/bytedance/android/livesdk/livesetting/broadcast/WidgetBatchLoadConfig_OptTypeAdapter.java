package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes15.dex */
public final class WidgetBatchLoadConfig_OptTypeAdapter extends TypeAdapter<WidgetBatchLoadConfig> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final WidgetBatchLoadConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        WidgetBatchLoadConfig widgetBatchLoadConfig = new WidgetBatchLoadConfig(0, 500L, 1000L, 10);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1597102130:
                        if (strLJJJJ.equals("interval_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                widgetBatchLoadConfig.intervalDuration = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 55429328:
                        if (strLJJJJ.equals("delay_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                widgetBatchLoadConfig.delayDuration = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 94851343:
                        if (strLJJJJ.equals("count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                widgetBatchLoadConfig.count = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 469355271:
                        if (strLJJJJ.equals("enable_batch_load")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                widgetBatchLoadConfig.enableLiveEndOpt = c09cu.LJJIZ();
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
        return widgetBatchLoadConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, WidgetBatchLoadConfig widgetBatchLoadConfig) throws IOException {
        WidgetBatchLoadConfig widgetBatchLoadConfig2 = widgetBatchLoadConfig;
        if (widgetBatchLoadConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_batch_load");
        c09dl.LJJJJ(Integer.valueOf(widgetBatchLoadConfig2.enableLiveEndOpt));
        c09dl.LJIILLIIL("delay_duration");
        c09dl.LJJIZ(widgetBatchLoadConfig2.delayDuration);
        c09dl.LJIILLIIL("interval_duration");
        c09dl.LJJIZ(widgetBatchLoadConfig2.intervalDuration);
        c09dl.LJIILLIIL("count");
        c09dl.LJJJJ(Integer.valueOf(widgetBatchLoadConfig2.count));
        c09dl.LJII();
    }
}
