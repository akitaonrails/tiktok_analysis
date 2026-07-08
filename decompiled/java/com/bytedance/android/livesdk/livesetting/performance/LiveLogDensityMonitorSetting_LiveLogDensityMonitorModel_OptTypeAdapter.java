package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.performance.LiveLogDensityMonitorSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class LiveLogDensityMonitorSetting_LiveLogDensityMonitorModel_OptTypeAdapter extends TypeAdapter<LiveLogDensityMonitorSetting.LiveLogDensityMonitorModel> {
    public final Gson LIZ;

    public LiveLogDensityMonitorSetting_LiveLogDensityMonitorModel_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveLogDensityMonitorSetting.LiveLogDensityMonitorModel read(C09CU c09cu) {
        LiveLogDensityMonitorSetting.LiveLogDensityMonitorModel liveLogDensityMonitorModel = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            liveLogDensityMonitorModel = new LiveLogDensityMonitorSetting.LiveLogDensityMonitorModel(new LiveLogDensityMonitorSetting.LiveLogDensityMonitorModelItem(1000L, 100, 0.001d, 5), new LiveLogDensityMonitorSetting.LiveLogDensityMonitorModelItem(1000L, 100, 0.001d, 5));
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "app_log_monitor_config_item")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveLogDensityMonitorModel.setMonitorAppLogSampleRate((LiveLogDensityMonitorSetting.LiveLogDensityMonitorModelItem) this.LIZ.LJIIJ(LiveLogDensityMonitorSetting.LiveLogDensityMonitorModelItem.class).read(c09cu));
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "alog_monitor_config_item")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveLogDensityMonitorModel.setMonitorAlogSampleRate((LiveLogDensityMonitorSetting.LiveLogDensityMonitorModelItem) this.LIZ.LJIIJ(LiveLogDensityMonitorSetting.LiveLogDensityMonitorModelItem.class).read(c09cu));
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return liveLogDensityMonitorModel;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveLogDensityMonitorSetting.LiveLogDensityMonitorModel liveLogDensityMonitorModel) {
        LiveLogDensityMonitorSetting.LiveLogDensityMonitorModel liveLogDensityMonitorModel2 = liveLogDensityMonitorModel;
        if (liveLogDensityMonitorModel2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("app_log_monitor_config_item");
        TypeAdapter typeAdapterLJIIJ = this.LIZ.LJIIJ(LiveLogDensityMonitorSetting.LiveLogDensityMonitorModelItem.class);
        typeAdapterLJIIJ.write(c09dl, liveLogDensityMonitorModel2.getMonitorAppLogSampleRate());
        c09dl.LJIILLIIL("alog_monitor_config_item");
        typeAdapterLJIIJ.write(c09dl, liveLogDensityMonitorModel2.getMonitorAlogSampleRate());
        c09dl.LJII();
    }
}
