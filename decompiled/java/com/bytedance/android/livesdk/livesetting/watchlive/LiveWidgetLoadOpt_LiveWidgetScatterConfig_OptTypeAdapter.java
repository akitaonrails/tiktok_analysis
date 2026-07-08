package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveWidgetLoadOpt;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveWidgetLoadOpt_LiveWidgetScatterConfig_OptTypeAdapter extends TypeAdapter<LiveWidgetLoadOpt.LiveWidgetScatterConfig> {
    public final Gson LIZ;

    public LiveWidgetLoadOpt_LiveWidgetScatterConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveWidgetLoadOpt.LiveWidgetScatterConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveWidgetLoadOpt.LiveWidgetScatterConfig liveWidgetScatterConfig = new LiveWidgetLoadOpt.LiveWidgetScatterConfig(30L, 50L, Boolean.FALSE, Boolean.FALSE);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveWidgetScatterConfig.enable = (Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -61011734:
                        if (strLJJJJ.equals("always_split")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveWidgetScatterConfig.splitAll = (Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1485281416:
                        if (strLJJJJ.equals("low_dev_load_buffer_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveWidgetScatterConfig.lowLoadBufferTime = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2109282707:
                        if (strLJJJJ.equals("load_buffer_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveWidgetScatterConfig.loadBufferTime = c09cu.LJJJ();
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
        return liveWidgetScatterConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveWidgetLoadOpt.LiveWidgetScatterConfig liveWidgetScatterConfig) throws IOException {
        LiveWidgetLoadOpt.LiveWidgetScatterConfig liveWidgetScatterConfig2 = liveWidgetScatterConfig;
        if (liveWidgetScatterConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("load_buffer_time");
        c09dl.LJJIZ(liveWidgetScatterConfig2.loadBufferTime);
        c09dl.LJIILLIIL("low_dev_load_buffer_time");
        c09dl.LJJIZ(liveWidgetScatterConfig2.lowLoadBufferTime);
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJ(liveWidgetScatterConfig2.enable);
        c09dl.LJIILLIIL("always_split");
        c09dl.LJJJ(liveWidgetScatterConfig2.splitAll);
        c09dl.LJII();
    }
}
