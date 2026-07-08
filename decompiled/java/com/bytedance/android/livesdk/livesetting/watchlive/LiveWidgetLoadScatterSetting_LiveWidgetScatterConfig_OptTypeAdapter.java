package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveWidgetLoadScatterSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveWidgetLoadScatterSetting_LiveWidgetScatterConfig_OptTypeAdapter extends TypeAdapter<LiveWidgetLoadScatterSetting.LiveWidgetScatterConfig> {
    public final Gson LIZ;

    public LiveWidgetLoadScatterSetting_LiveWidgetScatterConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveWidgetLoadScatterSetting.LiveWidgetScatterConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveWidgetLoadScatterSetting.LiveWidgetScatterConfig liveWidgetScatterConfig = new LiveWidgetLoadScatterSetting.LiveWidgetScatterConfig(Boolean.FALSE, 12L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "enable")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    liveWidgetScatterConfig.enable = (Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu);
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "load_buffer_time")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    liveWidgetScatterConfig.loadBufferTime = c09cu.LJJJ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return liveWidgetScatterConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveWidgetLoadScatterSetting.LiveWidgetScatterConfig liveWidgetScatterConfig) throws IOException {
        LiveWidgetLoadScatterSetting.LiveWidgetScatterConfig liveWidgetScatterConfig2 = liveWidgetScatterConfig;
        if (liveWidgetScatterConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJ(liveWidgetScatterConfig2.enable);
        c09dl.LJIILLIIL("load_buffer_time");
        c09dl.LJJIZ(liveWidgetScatterConfig2.loadBufferTime);
        c09dl.LJII();
    }
}
