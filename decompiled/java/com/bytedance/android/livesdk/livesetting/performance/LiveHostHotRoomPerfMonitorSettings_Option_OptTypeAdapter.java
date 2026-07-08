package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.performance.LiveHostHotRoomPerfMonitorSettings;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class LiveHostHotRoomPerfMonitorSettings_Option_OptTypeAdapter extends TypeAdapter<LiveHostHotRoomPerfMonitorSettings.Option> {
    public final Gson LIZ;

    public LiveHostHotRoomPerfMonitorSettings_Option_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveHostHotRoomPerfMonitorSettings.Option read(C09CU c09cu) {
        LiveHostHotRoomPerfMonitorSettings.Option option = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            option = new LiveHostHotRoomPerfMonitorSettings.Option(false, 500);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "feature_enable")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        option.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "fans_threshold")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        option.fansThreshold = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return option;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveHostHotRoomPerfMonitorSettings.Option option) throws IOException {
        LiveHostHotRoomPerfMonitorSettings.Option option2 = option;
        if (option2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("feature_enable");
        c09dl.LJJJJJL(option2.enable);
        c09dl.LJIILLIIL("fans_threshold");
        c09dl.LJJJJ(Integer.valueOf(option2.fansThreshold));
        c09dl.LJII();
    }
}
